package visitor;

import AST_H_C.*;
import grammers.htmlParser;
import grammers.htmlParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class HtmlVisitor extends htmlParserBaseVisitor<Node> {

    // ============ 1. دوال المساعدة ============

    private int getLineNumber(ParseTree ctx) {
        if (ctx instanceof org.antlr.v4.runtime.ParserRuleContext) {
            Token start = ((org.antlr.v4.runtime.ParserRuleContext) ctx).getStart();
            if (start != null) {
                return start.getLine();
            }
        }
        return -1;
    }

    private String unquote(String value) {
        if (value != null && value.length() >= 2) {
            char first = value.charAt(0);
            char last = value.charAt(value.length() - 1);
            if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
                return value.substring(1, value.length() - 1);
            }
        }
        return value;
    }

    // ============ 2. جذر المستند (Document Root) ============

    @Override
    public Node visitHtmlDocument(htmlParser.HtmlDocumentContext ctx) {
        int line = getLineNumber(ctx);
        List<HtmlElement> children = new ArrayList<>();

        for (htmlParser.HtmlElementContext elemCtx : ctx.htmlElement()) {
            Node node = visit(elemCtx);
            if (node instanceof HtmlElement) {
                children.add((HtmlElement) node);
            }
        }

        // إنشاء HtmlTag مع List<HtmlAttribute> بدلاً من Map
        return new HtmlTag("HTML_DOCUMENT", line, "html", new ArrayList<>(), children);
    }

    // ============ 3. العناصر الرئيسية ============

    @Override
    public Node visitTag_html(htmlParser.Tag_htmlContext ctx) {
        return visitHtmlTag(ctx.htmlTag());
    }

    @Override
    public Node visitCssSty(htmlParser.CssStyContext ctx) {
        return visitCssStyle(ctx.cssStyle());
    }

    @Override
    public Node visitJinjaExpr(htmlParser.JinjaExprContext ctx) {
        return visitJinjaExpression(ctx.jinjaExpression());
    }

    @Override
    public Node visitJinja_Tag(htmlParser.Jinja_TagContext ctx) {
        return visitJinjaTag(ctx.jinjaTag());
    }

    @Override
    public Node visitJinjaComm(htmlParser.JinjaCommContext ctx) {
        return visitJinjaComment(ctx.jinjaComment());
    }

    @Override
    public Node visitText(htmlParser.TextContext ctx) {
        int line = getLineNumber(ctx);
        String text = ctx.HTML_TEXT().getText();
        return new HtmlText("HTML_TEXT", line, text);
    }

    // ============ 4. معالجة HTML Tags ============

    public Node visitHtmlTag(htmlParser.HtmlTagContext ctx) {
        int line = getLineNumber(ctx);

        // 1. الحصول على اسم الوسم
        String tagName = "";
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().size() > 0) {
            tagName = ctx.TAG_NAME(0).getText();
        }

        // 2. جمع السمات كـ List<HtmlAttribute> (مهم!)
        List<HtmlAttribute> attributes = new ArrayList<>();
        if (ctx.htmlAttribute() != null) {
            for (htmlParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                String attrName = attrCtx.ATTR_NAME().getText();
                String attrValue = "";
                if (attrCtx.ATTRIBUTE_VALUE() != null) {
                    attrValue = unquote(attrCtx.ATTRIBUTE_VALUE().getText());
                }
                attributes.add(new HtmlAttribute("HTML_ATTRIBUTE", line, attrName, attrValue));
            }
        }

        // 3. جمع العناصر الفرعية
        List<HtmlElement> children = new ArrayList<>();
        if (ctx.htmlElement() != null) {
            for (htmlParser.HtmlElementContext childCtx : ctx.htmlElement()) {
                Node childNode = visit(childCtx);
                if (childNode instanceof HtmlElement) {
                    children.add((HtmlElement) childNode);
                }
            }
        }

        return new HtmlTag("HTML_TAG", line, tagName, attributes, children);
    }

    // ============ 5. معالجة CSS Styles ============

    public Node visitCssStyle(htmlParser.CssStyleContext ctx) {
        int line = getLineNumber(ctx);
        List<CSSRuleSet> ruleSets = new ArrayList<>();

        if (ctx.stylesheet() != null && ctx.stylesheet().ruleset() != null) {
            for (htmlParser.RulesetContext ruleCtx : ctx.stylesheet().ruleset()) {
                CSSRuleSet ruleSet = (CSSRuleSet) visitRuleset(ruleCtx);
                if (ruleSet != null) {
                    ruleSets.add(ruleSet);
                }
            }
        }

        return new CSS_Style("CSS_STYLE", line, ruleSets);
    }

    @Override
    public Node visitRuleset(htmlParser.RulesetContext ctx) {
        int line = getLineNumber(ctx);
        String selector = ctx.CSS_SELECTOR().getText();

        List<CssProperty> properties = new ArrayList<>();
        if (ctx.properties() != null) {
            for (htmlParser.PropertiesContext propCtx : ctx.properties()) {
                CssProperty property = (CssProperty) visitProperties(propCtx);
                if (property != null) {
                    properties.add(property);
                }
            }
        }

        return new CSSRuleSet("CSS_RULESET", line, selector, properties);
    }

    @Override
    public Node visitProperties(htmlParser.PropertiesContext ctx) {
        int line = getLineNumber(ctx);
        String propertyName = ctx.PROPERTY().getText();

        StringBuilder valueBuilder = new StringBuilder();
        if (ctx.value() != null && ctx.value().VALUE() != null) {
            List<org.antlr.v4.runtime.tree.TerminalNode> values = ctx.value().VALUE();
            for (int i = 0; i < values.size(); i++) {
                if (i > 0) {
                    valueBuilder.append(", ");
                }
                valueBuilder.append(values.get(i).getText());
            }
        }

        return new CssProperty("CSS_PROPERTY", line, propertyName, valueBuilder.toString());
    }

    // ============ 6. معالجة Jinja2 Expressions ============

    public Node visitJinjaExpression(htmlParser.JinjaExpressionContext ctx) {
        int line = getLineNumber(ctx);
        String expression = ctx.expr().getText();
        return new JinjaExpression("JINJA_EXPRESSION", line, expression);
    }

    // ============ 7. معالجة Jinja2 Tags ============

    public Node visitJinjaTag(htmlParser.JinjaTagContext ctx) {
        if (ctx.jinjaSingleTag() != null) {
            return visitJinjaSingleTag(ctx.jinjaSingleTag());
        } else if (ctx.jinjaBlock() != null) {
            return visitJinjaBlock(ctx.jinjaBlock());
        }
        return null;
    }

    @Override
    public Node visitJinjaSingleTag(htmlParser.JinjaSingleTagContext ctx) {
        int line = getLineNumber(ctx);
        String tagContent = ctx.singleJinjaTagContent().getText();
        return new JinjaSingleTag("JINJA_SINGLE_TAG", line);
        // أو إذا أردت استخدام JinjaTag:
        // return new JinjaTag("JINJA_SINGLE_TAG", line, tagContent, new ArrayList<>());
    }

    @Override
    public Node visitJinjaBlock(htmlParser.JinjaBlockContext ctx) {
        if (ctx.jinjaForBlock() != null) {
            return visitJinjaForBlock(ctx.jinjaForBlock());
        } else if (ctx.jinjaIfBlock() != null) {
            return visitJinjaIfBlock(ctx.jinjaIfBlock());
        }
        return null;
    }

    @Override
    public Node visitJinjaForBlock(htmlParser.JinjaForBlockContext ctx) {
        int line = getLineNumber(ctx);

        // الحصول على المتغير والمجموعة
        String variable = ctx.ID().getText();
        String collection = ctx.expr().getText();

        // جمع body
        List<HtmlElement> body = new ArrayList<>();
        for (htmlParser.HtmlElementContext elemCtx : ctx.htmlElement()) {
            Node node = visit(elemCtx);
            if (node instanceof HtmlElement) {
                body.add((HtmlElement) node);
            }
        }

        // استخدام JinjaForBlock الجديد
        return new JinjaForBlock("JINJA_FOR_BLOCK", line, body);
    }

    @Override
    public Node visitJinjaIfBlock(htmlParser.JinjaIfBlockContext ctx) {
        int line = getLineNumber(ctx);

        // الشرط الرئيسي
        String condition = ctx.expr(0).getText();

        // جمع body
        List<HtmlElement> body = new ArrayList<>();
        for (htmlParser.HtmlElementContext elemCtx : ctx.htmlElement()) {
            Node node = visit(elemCtx);
            if (node instanceof HtmlElement) {
                body.add((HtmlElement) node);
            }
        }

        // استخدام JinjaIfBlock الجديد
        return new JinjaIfBlock("JINJA_IF_BLOCK", line, body);
    }

    // ============ 8. معالجة Jinja2 Comments ============

    public Node visitJinjaComment(htmlParser.JinjaCommentContext ctx) {
        int line = getLineNumber(ctx);
        String commentText = ctx.COMMENT_TEXT() != null ? ctx.COMMENT_TEXT().getText() : "";
        return new HtmlText("JINJA_COMMENT", line, "{{# " + commentText + " #}}");
    }
}