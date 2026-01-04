// Generated from C:/Users/Heba2005/OneDrive/سطح المكتب/compiler2/grammers/flaskParser.g4 by ANTLR 4.13.2
package grammers;
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
	 * Visit a parse tree produced by the {@code programLabel}
	 * labeled alternative in {@link flaskParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLabel(flaskParser.ProgramLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSimpleLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSimpleLabel(flaskParser.StatementSimpleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementCompoundLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCompoundLabel(flaskParser.StatementCompoundLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleImportLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleImportLabel(flaskParser.SimpleImportLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignLabel(flaskParser.SimpleAssignLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleReturnLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleReturnLabel(flaskParser.SimpleReturnLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExprLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExprLabel(flaskParser.SimpleExprLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#stmt_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_end(flaskParser.Stmt_endContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundFunctionLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundFunctionLabel(flaskParser.CompoundFunctionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundIfLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundIfLabel(flaskParser.CompoundIfLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundForLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundForLabel(flaskParser.CompoundForLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importFromLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromLabel(flaskParser.ImportFromLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importSimpleLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSimpleLabel(flaskParser.ImportSimpleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importListLabel}
	 * labeled alternative in {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportListLabel(flaskParser.ImportListLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importItemLabel}
	 * labeled alternative in {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItemLabel(flaskParser.ImportItemLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefLabel}
	 * labeled alternative in {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefLabel(flaskParser.FunctionDefLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decoratorLabel}
	 * labeled alternative in {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorLabel(flaskParser.DecoratorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramListLabel}
	 * labeled alternative in {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamListLabel(flaskParser.ParamListLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockLabel}
	 * labeled alternative in {@link flaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLabel(flaskParser.BlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtLabel}
	 * labeled alternative in {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtLabel(flaskParser.IfStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmtLabel}
	 * labeled alternative in {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtLabel(flaskParser.ForStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmtLabel}
	 * labeled alternative in {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmtLabel(flaskParser.AssignStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmtLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtLabel(flaskParser.ReturnStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmtEmptyLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtEmptyLabel(flaskParser.ReturnStmtEmptyLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmtLabel}
	 * labeled alternative in {@link flaskParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmtLabel(flaskParser.ExprStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLabel(flaskParser.ExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonLabel}
	 * labeled alternative in {@link flaskParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonLabel(flaskParser.ComparisonLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithExprLabel}
	 * labeled alternative in {@link flaskParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExprLabel(flaskParser.ArithExprLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termLabel}
	 * labeled alternative in {@link flaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermLabel(flaskParser.TermLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorLabel}
	 * labeled alternative in {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorLabel(flaskParser.FactorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryIdLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryIdLabel(flaskParser.PrimaryIdLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNumberLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumberLabel(flaskParser.PrimaryNumberLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryStringLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStringLabel(flaskParser.PrimaryStringLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryTrueLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryTrueLabel(flaskParser.PrimaryTrueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryFalseLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryFalseLabel(flaskParser.PrimaryFalseLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoneLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoneLabel(flaskParser.PrimaryNoneLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryParenLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryParenLabel(flaskParser.PrimaryParenLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryListLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryListLabel(flaskParser.PrimaryListLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryDictLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryDictLabel(flaskParser.PrimaryDictLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trailerCallLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerCallLabel(flaskParser.TrailerCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trailerSubscriptLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerSubscriptLabel(flaskParser.TrailerSubscriptLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trailerAttrLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerAttrLabel(flaskParser.TrailerAttrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentListLabel}
	 * labeled alternative in {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListLabel(flaskParser.ArgumentListLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentKeywordLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentKeywordLabel(flaskParser.ArgumentKeywordLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentPositionalLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentPositionalLabel(flaskParser.ArgumentPositionalLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignLabel}
	 * labeled alternative in {@link flaskParser#ign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnLabel(flaskParser.IgnLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listLiteralLabel}
	 * labeled alternative in {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteralLabel(flaskParser.ListLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictLiteralLabel}
	 * labeled alternative in {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteralLabel(flaskParser.DictLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictEntryLabel}
	 * labeled alternative in {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntryLabel(flaskParser.DictEntryLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dottedNameLabel}
	 * labeled alternative in {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedNameLabel(flaskParser.DottedNameLabelContext ctx);
}