// Generated from C:/Users/Heba2005/OneDrive/سطح المكتب/flaskCompiler/src/ANTLR/firstCompiler/flaskParser.g4 by ANTLR 4.13.2
package ANTLR.firstCompiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link flaskParser}.
 */
public interface flaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link flaskParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(flaskParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(flaskParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(flaskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(flaskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(flaskParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(flaskParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(flaskParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(flaskParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(flaskParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(flaskParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(flaskParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(flaskParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(flaskParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(flaskParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(flaskParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(flaskParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(flaskParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(flaskParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(flaskParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(flaskParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(flaskParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(flaskParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(flaskParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(flaskParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(flaskParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(flaskParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(flaskParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(flaskParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(flaskParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(flaskParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(flaskParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(flaskParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(flaskParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(flaskParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(flaskParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(flaskParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#factor_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFactor_arithmetic(flaskParser.Factor_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#factor_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFactor_arithmetic(flaskParser.Factor_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(flaskParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(flaskParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(flaskParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(flaskParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(flaskParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(flaskParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(flaskParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(flaskParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(flaskParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(flaskParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(flaskParser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(flaskParser.DictEntryContext ctx);
}