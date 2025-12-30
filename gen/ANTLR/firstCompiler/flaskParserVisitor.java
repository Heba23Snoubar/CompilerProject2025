// Generated from C:/Users/Heba2005/OneDrive/سطح المكتب/flaskCompiler/src/ANTLR/firstCompiler/flaskParser.g4 by ANTLR 4.13.2
package ANTLR.firstCompiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link flaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface flaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link flaskParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(flaskParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(flaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(flaskParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(flaskParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(flaskParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(flaskParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(flaskParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(flaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(flaskParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(flaskParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(flaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(flaskParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(flaskParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(flaskParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(flaskParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(flaskParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(flaskParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(flaskParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#factor_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_arithmetic(flaskParser.Factor_arithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(flaskParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(flaskParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(flaskParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(flaskParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(flaskParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(flaskParser.DictEntryContext ctx);
}