parser grammar flaskParser;

options { tokenVocab = flaskLexer; }

/* =========================
   ENTRY
   ========================= */

program
    : (NEWLINE | statement)* EOF                        #programLabel
    ;

/* =========================
   STATEMENTS
   ========================= */

statement
    : simple_stmt                                       #statementSimpleLabel
    | compound_stmt                                     #statementCompoundLabel
    ;

simple_stmt
    : importStmt stmt_end                               #simpleImportLabel
    | assignStmt stmt_end                               #simpleAssignLabel
    | returnStmt stmt_end                               #simpleReturnLabel
    | exprStmt stmt_end                                 #simpleExprLabel
    ;

stmt_end : NEWLINE+ | EOF
;
//statement
  //    : simple_stmt #statementSimpleLabel
  //    | compound_stmt #statementCompoundLabel
  //;

compound_stmt
    : functionDef                                       #compoundFunctionLabel
    | ifStmt                                            #compoundIfLabel
    | forStmt                                           #compoundForLabel
    ;

/* =========================
   IMPORTS
   ========================= */

importStmt
    : FROM dotted_name IMPORT importList                #importFromLabel
    | IMPORT dotted_name                                #importSimpleLabel
    ;

importList
    : importItem (COMMA importItem)*                   #importListLabel
    ;

importItem
    : ID (AS ID)?                                       #importItemLabel
    ;

/* =========================
   DECORATORS + FUNCTION DEF
   ========================= */

functionDef
    : decorator* DEF ID LPAREN paramList? RPAREN COLON block #functionDefLabel
    ;

decorator
    : AT dotted_name (LPAREN argumentList? RPAREN)? NEWLINE  #decoratorLabel
    ;

paramList
    : ID (COMMA ID)*                                    #paramListLabel
    ;

/* =========================
   BLOCK
   ========================= */

block
    : NEWLINE
      (
        INDENT (NEWLINE* statement)+ DEDENT
        | (NEWLINE* statement)+
      )
      #blockLabel
    ;

/* =========================
   IF / FOR
   ========================= */

ifStmt
    : IF expression COLON block
      (ELIF expression COLON block)*
      (ELSE COLON block)?
      #ifStmtLabel
    ;

forStmt
    : FOR ID IN expression COLON block                 #forStmtLabel
    ;

/* ========================
   ASSIGN / RETURN / EXPR
   ========================= */

assignStmt
    : expression ASSIGN expression                     #assignStmtLabel
    ;

/* return "Not Found", 404  */
returnStmt
    : RETURN expression (COMMA expression)* (COMMA)?   #returnStmtLabel
    | RETURN                                           #returnStmtEmptyLabel
    ;

exprStmt
    : expression                                       #exprStmtLabel
    ;

/* =========================
   EXPRESSIONS
   ========================= */

expression
    : comparison (COMMA comparison)* (COMMA)?         #expressionLabel
    ;

comparison
    : arith_expr ((EQ | NEQ | LT | GT | LE | GE | (ASSIGN ASSIGN)) arith_expr)* #comparisonLabel
    ;

arith_expr
    : term ((PLUS | MINUS) term)*                      #arithExprLabel
    ;

term
    : factor ((MULT | DIV) factor)*                    #termLabel
    ;

factor
    : primary trailer*                                 #factorLabel
    ;

primary
    : ID                                               #primaryIdLabel
    | NUMBER                                           #primaryNumberLabel
    | STRING                                           #primaryStringLabel
    | TRUE                                             #primaryTrueLabel
    | FALSE                                            #primaryFalseLabel
    | NONE                                             #primaryNoneLabel
    | LPAREN expression? RPAREN                        #primaryParenLabel
    | listLiteral                                      #primaryListLabel
    | dictLiteral                                      #primaryDictLabel
    ;

/* =========================
   CALL / INDEX / ATTRIBUTE
   ========================= */

trailer
    : LPAREN ign argumentList? ign RPAREN             #trailerCallLabel
    | LBRACK ign expression ign RBRACK               #trailerSubscriptLabel
    | DOT ID                                         #trailerAttrLabel
    ;

/* =========================
   ARGUMENTS
   ========================= */

argumentList
    : argument (ign COMMA ign argument)* (ign COMMA)? #argumentListLabel
    ;

argument
    : ID ASSIGN expression                             #argumentKeywordLabel
    | expression                                       #argumentPositionalLabel
    ;

ign
    : (NEWLINE | INDENT | DEDENT)*                     #ignLabel
    ;

/* =========================
   LIST / DICT
   ========================= */

listLiteral
    : LBRACK ign
      (expression ign (COMMA ign expression ign)*)?
      (COMMA ign)?
      RBRACK                                         #listLiteralLabel
    ;

dictLiteral
    : LBRACE ign
      (dictEntry ign (COMMA ign dictEntry ign)*)?
      (COMMA ign)?
      RBRACE                                         #dictLiteralLabel
    ;

dictEntry
    : expression ign COLON ign expression             #dictEntryLabel
    ;

/* =========================
   dotted name
   ========================= */

dotted_name
    : ID (DOT ID)*                                    #dottedNameLabel
    ;
