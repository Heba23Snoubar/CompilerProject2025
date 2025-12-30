parser grammar flaskParser ;
options {
    tokenVocab=flaskLexer;
}

program
    : statement* EOF                               #programLable
    ;

statement
    : importStmt                                  #importStmtLable
    | assignStmt                                  #assignStmtLable
    | functionDef                                 #functionDefLable
    | decorator                                   #decoratorLable
    | ifStmt                                      #ifStmtLable
    | forStmt                                     #forStmtLable
    | returnStmt                                  #returnStmtLable
    | expression                                  #expressionLable
    ;


importStmt
    : FROM dotted_name IMPORT importList                #fromImportLable
    | IMPORT importList                           #normalImportLable
    ;


dotted_name
    : ID (DOT ID)*
    ;

importList
    : importItem (COMMA importItem)*
    ;

importItem
    : ID (AS ID)?
    ;



assignStmt
    : factor ASSIGN expression                    #assignLable
    ;



decorator
    : AT dotted_name (LPAREN argumentList? RPAREN)?   #decoratorExprLable
    ;



functionDef
    : DEF ID LPAREN paramList? RPAREN COLON block           #functionDefExprLable
    ;

paramList
    : ID (COMMA ID)*
    ;

block
    : statement+                                     #blockLable
    ;



ifStmt
    : IF expression COLON block
      (ELIF expression COLON block)*
      (ELSE COLON block)?                           #ifExprLable
    ;

forStmt
    : FOR ID IN expression COLON block             #forExprLable
    ;

returnStmt
    : RETURN (expression (COMMA expression)*)?                 #returnExprLable
    ;



expression
    : arithmetic ( (EQ | NEQ | LT | GT | LE | GE) arithmetic )*      #compareExprLable
    ;

arithmetic
    : term ( (PLUS | MINUS) term )*                #addSubExprLable
    ;

term
    : factor_arithmetic ( (MULT | DIV) factor_arithmetic )*        #mulDivExprLable
    ;



factor
    : primary (
        LPAREN argumentList? RPAREN
      | LBRACK expression RBRACK
      | DOT ID
    )*                                            #factorLable
    ;

factor_arithmetic
    : factor
    | NUMBER
    | STRING
    | LPAREN expression RPAREN
    ;

primary
    : ID                                          #variableLable
    | listLiteral                                 #listLiteralExprLable
    | dictLiteral                                 #dictLiteralExprLable
    ;



argumentList
    : argument (COMMA argument)*
    ;

argument
    : (ID ASSIGN)? expression
    ;



listLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK              //[]
                                                  #listLiteralLable
    ;

dictLiteral
    : LBRACE (dictEntry (COMMA dictEntry)*)? RBRACE                 //{}
                                                  #dictLiteralLable
    ;

dictEntry
    : expression COLON expression
    ;