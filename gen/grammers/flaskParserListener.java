// Generated from C:/Users/Heba2005/OneDrive/سطح المكتب/compiler2/grammers/flaskParser.g4 by ANTLR 4.13.2
package grammers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link flaskParser}.
 */
public interface flaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programLabel}
	 * labeled alternative in {@link flaskParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramLabel(flaskParser.ProgramLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programLabel}
	 * labeled alternative in {@link flaskParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramLabel(flaskParser.ProgramLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSimpleLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSimpleLabel(flaskParser.StatementSimpleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSimpleLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSimpleLabel(flaskParser.StatementSimpleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementCompoundLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementCompoundLabel(flaskParser.StatementCompoundLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementCompoundLabel}
	 * labeled alternative in {@link flaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementCompoundLabel(flaskParser.StatementCompoundLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleImportLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleImportLabel(flaskParser.SimpleImportLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleImportLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleImportLabel(flaskParser.SimpleImportLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAssignLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignLabel(flaskParser.SimpleAssignLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAssignLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignLabel(flaskParser.SimpleAssignLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleReturnLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleReturnLabel(flaskParser.SimpleReturnLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleReturnLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleReturnLabel(flaskParser.SimpleReturnLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprLabel(flaskParser.SimpleExprLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprLabel}
	 * labeled alternative in {@link flaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprLabel(flaskParser.SimpleExprLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#stmt_end}.
	 * @param ctx the parse tree
	 */
	void enterStmt_end(flaskParser.Stmt_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#stmt_end}.
	 * @param ctx the parse tree
	 */
	void exitStmt_end(flaskParser.Stmt_endContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundFunctionLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundFunctionLabel(flaskParser.CompoundFunctionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundFunctionLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundFunctionLabel(flaskParser.CompoundFunctionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundIfLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundIfLabel(flaskParser.CompoundIfLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundIfLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundIfLabel(flaskParser.CompoundIfLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundForLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundForLabel(flaskParser.CompoundForLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundForLabel}
	 * labeled alternative in {@link flaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundForLabel(flaskParser.CompoundForLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importFromLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportFromLabel(flaskParser.ImportFromLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importFromLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportFromLabel(flaskParser.ImportFromLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importSimpleLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportSimpleLabel(flaskParser.ImportSimpleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importSimpleLabel}
	 * labeled alternative in {@link flaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportSimpleLabel(flaskParser.ImportSimpleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importListLabel}
	 * labeled alternative in {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportListLabel(flaskParser.ImportListLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importListLabel}
	 * labeled alternative in {@link flaskParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportListLabel(flaskParser.ImportListLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importItemLabel}
	 * labeled alternative in {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItemLabel(flaskParser.ImportItemLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importItemLabel}
	 * labeled alternative in {@link flaskParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItemLabel(flaskParser.ImportItemLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefLabel}
	 * labeled alternative in {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefLabel(flaskParser.FunctionDefLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefLabel}
	 * labeled alternative in {@link flaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefLabel(flaskParser.FunctionDefLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decoratorLabel}
	 * labeled alternative in {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorLabel(flaskParser.DecoratorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decoratorLabel}
	 * labeled alternative in {@link flaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorLabel(flaskParser.DecoratorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramListLabel}
	 * labeled alternative in {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamListLabel(flaskParser.ParamListLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramListLabel}
	 * labeled alternative in {@link flaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamListLabel(flaskParser.ParamListLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockLabel}
	 * labeled alternative in {@link flaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockLabel(flaskParser.BlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockLabel}
	 * labeled alternative in {@link flaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockLabel(flaskParser.BlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtLabel}
	 * labeled alternative in {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtLabel(flaskParser.IfStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtLabel}
	 * labeled alternative in {@link flaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtLabel(flaskParser.IfStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmtLabel}
	 * labeled alternative in {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmtLabel(flaskParser.ForStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmtLabel}
	 * labeled alternative in {@link flaskParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmtLabel(flaskParser.ForStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmtLabel}
	 * labeled alternative in {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmtLabel(flaskParser.AssignStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmtLabel}
	 * labeled alternative in {@link flaskParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmtLabel(flaskParser.AssignStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtLabel(flaskParser.ReturnStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtLabel(flaskParser.ReturnStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtEmptyLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtEmptyLabel(flaskParser.ReturnStmtEmptyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtEmptyLabel}
	 * labeled alternative in {@link flaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtEmptyLabel(flaskParser.ReturnStmtEmptyLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmtLabel}
	 * labeled alternative in {@link flaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmtLabel(flaskParser.ExprStmtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmtLabel}
	 * labeled alternative in {@link flaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmtLabel(flaskParser.ExprStmtLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLabel(flaskParser.ExpressionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLabel}
	 * labeled alternative in {@link flaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLabel(flaskParser.ExpressionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonLabel}
	 * labeled alternative in {@link flaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonLabel(flaskParser.ComparisonLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonLabel}
	 * labeled alternative in {@link flaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonLabel(flaskParser.ComparisonLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithExprLabel}
	 * labeled alternative in {@link flaskParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithExprLabel(flaskParser.ArithExprLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithExprLabel}
	 * labeled alternative in {@link flaskParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithExprLabel(flaskParser.ArithExprLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termLabel}
	 * labeled alternative in {@link flaskParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermLabel(flaskParser.TermLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termLabel}
	 * labeled alternative in {@link flaskParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermLabel(flaskParser.TermLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorLabel}
	 * labeled alternative in {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorLabel(flaskParser.FactorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorLabel}
	 * labeled alternative in {@link flaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorLabel(flaskParser.FactorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryIdLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryIdLabel(flaskParser.PrimaryIdLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryIdLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryIdLabel(flaskParser.PrimaryIdLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNumberLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumberLabel(flaskParser.PrimaryNumberLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNumberLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumberLabel(flaskParser.PrimaryNumberLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryStringLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryStringLabel(flaskParser.PrimaryStringLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryStringLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryStringLabel(flaskParser.PrimaryStringLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryTrueLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryTrueLabel(flaskParser.PrimaryTrueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryTrueLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryTrueLabel(flaskParser.PrimaryTrueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryFalseLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryFalseLabel(flaskParser.PrimaryFalseLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryFalseLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryFalseLabel(flaskParser.PrimaryFalseLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNoneLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoneLabel(flaskParser.PrimaryNoneLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNoneLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoneLabel(flaskParser.PrimaryNoneLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryParenLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryParenLabel(flaskParser.PrimaryParenLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryParenLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryParenLabel(flaskParser.PrimaryParenLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryListLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryListLabel(flaskParser.PrimaryListLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryListLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryListLabel(flaskParser.PrimaryListLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryDictLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryDictLabel(flaskParser.PrimaryDictLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryDictLabel}
	 * labeled alternative in {@link flaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryDictLabel(flaskParser.PrimaryDictLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trailerCallLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerCallLabel(flaskParser.TrailerCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trailerCallLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerCallLabel(flaskParser.TrailerCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trailerSubscriptLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerSubscriptLabel(flaskParser.TrailerSubscriptLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trailerSubscriptLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerSubscriptLabel(flaskParser.TrailerSubscriptLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trailerAttrLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerAttrLabel(flaskParser.TrailerAttrLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trailerAttrLabel}
	 * labeled alternative in {@link flaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerAttrLabel(flaskParser.TrailerAttrLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentListLabel}
	 * labeled alternative in {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListLabel(flaskParser.ArgumentListLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentListLabel}
	 * labeled alternative in {@link flaskParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListLabel(flaskParser.ArgumentListLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentKeywordLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentKeywordLabel(flaskParser.ArgumentKeywordLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentKeywordLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentKeywordLabel(flaskParser.ArgumentKeywordLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentPositionalLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentPositionalLabel(flaskParser.ArgumentPositionalLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentPositionalLabel}
	 * labeled alternative in {@link flaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentPositionalLabel(flaskParser.ArgumentPositionalLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignLabel}
	 * labeled alternative in {@link flaskParser#ign}.
	 * @param ctx the parse tree
	 */
	void enterIgnLabel(flaskParser.IgnLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignLabel}
	 * labeled alternative in {@link flaskParser#ign}.
	 * @param ctx the parse tree
	 */
	void exitIgnLabel(flaskParser.IgnLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listLiteralLabel}
	 * labeled alternative in {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteralLabel(flaskParser.ListLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listLiteralLabel}
	 * labeled alternative in {@link flaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteralLabel(flaskParser.ListLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictLiteralLabel}
	 * labeled alternative in {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteralLabel(flaskParser.DictLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictLiteralLabel}
	 * labeled alternative in {@link flaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteralLabel(flaskParser.DictLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictEntryLabel}
	 * labeled alternative in {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntryLabel(flaskParser.DictEntryLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictEntryLabel}
	 * labeled alternative in {@link flaskParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntryLabel(flaskParser.DictEntryLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dottedNameLabel}
	 * labeled alternative in {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDottedNameLabel(flaskParser.DottedNameLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dottedNameLabel}
	 * labeled alternative in {@link flaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDottedNameLabel(flaskParser.DottedNameLabelContext ctx);
}