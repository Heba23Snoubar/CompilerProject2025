package visitor;

import AST.*;
import grammers.flaskParser;
import grammers.flaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class PythonVisitor extends flaskParserBaseVisitor<AstNode> {

    // -----------------------------
    // PROGRAM
    // -----------------------------
    @Override
    public AstNode visitProgram(flaskParser.ProgramContext ctx) {
        List<AstNode> statements = new ArrayList<>();
        for (var stmt : ctx.statement()) {
            AstNode node = visit(stmt);
            if (node != null) statements.add(node);
        }
        return new Program(ctx.start.getLine(), statements);
    }

    // -----------------------------
    // IMPORT
    // -----------------------------
    @Override
    public AstNode visitImportStmt(flaskParser.ImportStmtContext ctx) {
        // شكلين:
        // 1) from flask import Flask, render_template, ...
        // 2) import flask
        if (ctx.FROM() != null) {
            String module = ctx.dotted_name().getText();
            List<String> names = new ArrayList<>();

            for (var item : ctx.importList().importItem()) {
                // importItem : ID (AS ID)?
                String name = item.ID(0).getText();
                // لو بدك تدعم alias لاحقاً: item.AS()!=null ? ...
                names.add(name);
            }

            return new ImportStatement(module, names, ctx.start.getLine());
        }

        // import dotted_name
        if (ctx.IMPORT() != null) {
            String module = ctx.dotted_name().getText();
            return new ImportStatement(module, Collections.emptyList(), ctx.start.getLine());
        }

        return null;
    }

    // -----------------------------
    // ASSIGNMENT
    // -----------------------------
    @Override
    public AstNode visitAssignStmt(flaskParser.AssignStmtContext ctx) {
        AstNode left = visit(ctx.expression(0));
        AstNode right = visit(ctx.expression(1));
        return new Assign(left, right, ctx.start.getLine());
    }

    // -----------------------------
    // FUNCTION DEF
    // -----------------------------
    @Override
    public AstNode visitFunctionDef(flaskParser.FunctionDefContext ctx) {
        String name = ctx.ID().getText();

        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (TerminalNode id : ctx.paramList().ID()) {
                params.add(id.getText());
            }
        }

        List<AstNode> body = extractBlock(ctx.block());
        FunctionDef func = new FunctionDef(name, params, body, ctx.start.getLine());

        // ✅ في الـ AST الجديد: الديكورات لازم تنضاف كـ children
        if (ctx.decorator() != null && !ctx.decorator().isEmpty()) {
            List<Decorator> decorators = new ArrayList<>();
            for (var dec : ctx.decorator()) {
                decorators.add((Decorator) visit(dec));
            }
            // بما أننا أزلنا setDecorators من AST: نضيفهم كـ children بشكل مباشر
            // (AstNode.addChild protected، لذلك نعمل Wrapper node صغير)
            AstNode decoNode = new AstNode("Decorators", ctx.start.getLine()) {};
            for (Decorator d : decorators) {
                decoNode.addChild(d);
            }
            func.addChild(decoNode);
        }

        return func;
    }

    // -----------------------------
    // DECORATOR
    // -----------------------------
    @Override
    public AstNode visitDecorator(flaskParser.DecoratorContext ctx) {
        String name = ctx.dotted_name().getText();
        List<AstNode> args = new ArrayList<>();

        if (ctx.argumentList() != null) {
            for (var arg : ctx.argumentList().argument()) {
                args.add(visit(arg));
            }
        }

        return new Decorator(name, args, ctx.start.getLine());
    }

    // -----------------------------
    // IF STATEMENT
    // -----------------------------
    @Override
    public AstNode visitIfStmt(flaskParser.IfStmtContext ctx) {
        AstNode cond = visit(ctx.expression(0));
        List<AstNode> ifBlock = extractBlock(ctx.block(0));

        // في AST الجديد: IfStatement ما عاد فيه addElseIf/setElseBlock
        // لذلك سنبني عقدة If كبيرة بأول شرط + البلوك،
        // ثم نضيف Elif/Else كـ children nodes داخلها.
        IfStatement ifStmt = new IfStatement(cond, ifBlock, ctx.start.getLine());

        int exprCount = ctx.expression().size();
        // blocks: block(0) للـ if، ثم block(1..k) للـ elif، وإذا في else يكون آخر block
        for (int i = 1; i < exprCount; i++) {
            AstNode elifCond = visit(ctx.expression(i));
            List<AstNode> elifBlock = extractBlock(ctx.block(i));

            AstNode elifNode = new AstNode("Elif", ctx.start.getLine()) {};
            elifNode.addChild(elifCond);

            AstNode elifBody = new AstNode("Body", ctx.start.getLine()) {};
            for (AstNode s : elifBlock) elifBody.addChild(s);

            elifNode.addChild(elifBody);
            ifStmt.addChild(elifNode);
        }

        if (ctx.ELSE() != null) {
            List<AstNode> elseBlock = extractBlock(ctx.block(ctx.block().size() - 1));

            AstNode elseNode = new AstNode("Else", ctx.start.getLine()) {};
            AstNode elseBody = new AstNode("Body", ctx.start.getLine()) {};
            for (AstNode s : elseBlock) elseBody.addChild(s);

            elseNode.addChild(elseBody);
            ifStmt.addChild(elseNode);
        }

        return ifStmt;
    }

    // -----------------------------
    // FOR LOOP
    // -----------------------------
    @Override
    public AstNode visitForStmt(flaskParser.ForStmtContext ctx) {
        String var = ctx.ID().getText();
        AstNode iterable = visit(ctx.expression());
        List<AstNode> body = extractBlock(ctx.block());
        return new ForStatement(var, iterable, body, ctx.start.getLine());
    }

    // -----------------------------
    // RETURN
    // -----------------------------
    @Override
    public AstNode visitReturnStmt(flaskParser.ReturnStmtContext ctx) {
        if (ctx.expression().isEmpty()) {
            return new ReturnStatement(null, ctx.start.getLine());
        }

        // return "Not Found", 404  -> اعتبره ListLiteral (بدل Tuple)
        if (ctx.expression().size() > 1) {
            List<AstNode> items = new ArrayList<>();
            for (var e : ctx.expression()) items.add(visit(e));
            AstNode tupleLike = new ListLiteral(items, ctx.start.getLine());
            return new ReturnStatement(tupleLike, ctx.start.getLine());
        }

        return new ReturnStatement(visit(ctx.expression(0)), ctx.start.getLine());
    }

    // -----------------------------
    // EXPRESSIONS (BinaryExpression)
    // -----------------------------
    @Override
    public AstNode visitExpression(flaskParser.ExpressionContext ctx) {
        // expression : comparison (COMMA comparison)* (COMMA)?;
        // إذا أكثر من عنصر مفصول بفواصل -> ListLiteral
        if (ctx.comparison().size() > 1) {
            List<AstNode> items = new ArrayList<>();
            for (var c : ctx.comparison()) items.add(visit(c));
            return new ListLiteral(items, ctx.start.getLine());
        }
        return visit(ctx.comparison(0));
    }

    @Override
    public AstNode visitComparison(flaskParser.ComparisonContext ctx) {
        // comparison : arith_expr ((EQ|NEQ|LT|GT|LE|GE) arith_expr)*
        AstNode left = visit(ctx.arith_expr(0));

        // إذا ما في عمليات مقارنة
        if (ctx.arith_expr().size() == 1) return left;

        // نبنيها بشكل متسلسل (يسار-إلى-يمين)
        int opsCount = ctx.getChildCount();
        // أسهل: نمشي على الأزواج عبر tokens بين arith_expr
        // عندك arith_expr:0 ثم (op arith_expr:1) ثم ...
        for (int i = 1; i < ctx.arith_expr().size(); i++) {
            // operator هو child بين التعبيرين: arith_expr(i-1) [op] arith_expr(i)
            // موقعه: 2*i - 1 (لأن: expr op expr op expr ...)
            String op = ctx.getChild(2 * i - 1).getText();
            AstNode right = visit(ctx.arith_expr(i));
            left = new BinaryExpression(left, op, right, ctx.start.getLine());
        }
        return left;
    }

    @Override
    public AstNode visitArith_expr(flaskParser.Arith_exprContext ctx) {
        AstNode left = visit(ctx.term(0));
        if (ctx.term().size() == 1) return left;

        for (int i = 1; i < ctx.term().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // + أو -
            AstNode right = visit(ctx.term(i));
            left = new BinaryExpression(left, op, right, ctx.start.getLine());
        }
        return left;
    }

    @Override
    public AstNode visitTerm(flaskParser.TermContext ctx) {
        AstNode left = visit(ctx.factor(0));
        if (ctx.factor().size() == 1) return left;

        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // * أو /
            AstNode right = visit(ctx.factor(i));
            left = new BinaryExpression(left, op, right, ctx.start.getLine());
        }
        return left;
    }

    // -----------------------------
    // factor: primary trailer*
    // -----------------------------
    @Override
    public AstNode visitFactor(flaskParser.FactorContext ctx) {
        AstNode current = visit(ctx.primary());

        for (var tr : ctx.trailer()) {
            if (tr.LPAREN() != null) {
                List<AstNode> args = new ArrayList<>();
                if (tr.argumentList() != null) {
                    for (var arg : tr.argumentList().argument()) {
                        args.add(visit(arg));
                    }
                }
                current = new FunctionCall(current, args, tr.start.getLine());
            } else if (tr.LBRACK() != null) {
                AstNode index = visit(tr.expression());
                current = new Subscript(current, index, tr.start.getLine());
            } else if (tr.DOT() != null) {
                current = new AttributeAccess(current, tr.ID().getText(), tr.start.getLine());
            }
        }

        return current;
    }

    // -----------------------------
    // PRIMARY
    // -----------------------------
    @Override
    public AstNode visitPrimary(flaskParser.PrimaryContext ctx) {
        if (ctx.NUMBER() != null)
            return new NumberLiteral(ctx.NUMBER().getText(), ctx.start.getLine());

        if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();
            return new StringLiteral(raw.substring(1, raw.length() - 1), ctx.start.getLine());
        }

        if (ctx.TRUE() != null)
            return new BooleanLiteral(true, ctx.start.getLine());

        if (ctx.FALSE() != null)
            return new BooleanLiteral(false, ctx.start.getLine());

        if (ctx.NONE() != null)
            return new NoneLiteral(ctx.start.getLine());

        if (ctx.ID() != null)
            return new Identifier(ctx.ID().getText(), ctx.start.getLine());

        if (ctx.expression() != null)
            return visit(ctx.expression());

        if (ctx.listLiteral() != null)
            return visit(ctx.listLiteral());

        if (ctx.dictLiteral() != null)
            return visit(ctx.dictLiteral());

        return null;
    }

    // -----------------------------
    // LIST
    // -----------------------------
    @Override
    public AstNode visitListLiteral(flaskParser.ListLiteralContext ctx) {
        List<AstNode> elements = new ArrayList<>();
        for (var expr : ctx.expression()) {
            elements.add(visit(expr));
        }
        return new ListLiteral(elements, ctx.start.getLine());
    }

    // -----------------------------
    // DICT
    // -----------------------------
    @Override
    public AstNode visitDictLiteral(flaskParser.DictLiteralContext ctx) {
        Map<AstNode, AstNode> map = new LinkedHashMap<>();

        for (var entry : ctx.dictEntry()) {
            // dictEntry : expression COLON expression
            // إذا generated parser لا يدعم expression(i), استخدم getChild أو عدل rule dictEntry لتسمية الحقول.
            AstNode key = visit(entry.expression(0));
            AstNode value = visit(entry.expression(1));
            map.put(key, value);
        }

        return new DictLiteral(map, ctx.start.getLine());
    }

    // -----------------------------
    // ARGUMENT (positional / keyword)
    // -----------------------------
    @Override
    public AstNode visitArgument(flaskParser.ArgumentContext ctx) {
        // argument : ID ASSIGN expression | expression
        if (ctx.ID() != null && ctx.ASSIGN() != null) {
            return new KeywordArgument(ctx.ID().getText(), visit(ctx.expression()), ctx.start.getLine());
        }
        return visit(ctx.expression());
    }

    // -----------------------------
    // HELPERS
    // -----------------------------
    private List<AstNode> extractBlock(flaskParser.BlockContext ctx) {
        List<AstNode> list = new ArrayList<>();
        for (var stmt : ctx.statement()) {
            AstNode node = visit(stmt);
            if (node != null) list.add(node);
        }
        return list;
    }
}