parser grammar htmlParser;

options {
    tokenVocab = htmlLexer;
}

//>>>>>>>>>>>>>>>>>>>>>>>>> HTML <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



htmlDocument
    : HTML_DOCUMENT? htmlElement* EOF
    ;

htmlElement
    : htmlTag   #tag_html
    | cssStyle   #cssSty
    | jinjaExpression  #jinjaExpr
    |jinjaTag   #jinja_Tag
    | jinjaComment  #jinjaComm
    | HTML_TEXT      #text
    ;

htmlTag
    : OPEN_TAG TAG_NAME htmlAttribute* CLOSE_TAG htmlElement*
      (OPEN_TAG TAG_SLASH TAG_NAME CLOSE_TAG)?
    | OPEN_TAG TAG_NAME htmlAttribute* CLOSE_SLASH_TAG
    ;

htmlAttribute
    : ATTR_NAME (TAG_EQUALS ATTRIBUTE_VALUE)?
    ;


//htmlDocument: HTML_DOCUMENT htmlElement* EOF ;
//htmlElement : OPEN_TAG TAG_NAME htmlAttribute*  CLOSE_TAG htmlContent? (OPEN_TAG TAG_SLASH TAG_NAME  CLOSE_TAG)?
//                |cssStyle
//                |jinjaExpression
//                |jinjaTag
//                |jinjaComment;
//htmlContent : (HTML_TEXT | htmlElement|jinjaExpression | jinjaTag | jinjaComment)* ;
//htmlAttribute: ATTR_NAME (TAG_EQUALS ATTRIBUTE_VALUE)? ;

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CSS <<<<<<<<<<<<<<<<<<<<<<<<<<<<
cssStyle :STYLE_OPEN stylesheet STYLE_CLOSE;

stylesheet: ruleset* ;

ruleset : CSS_SELECTOR OPENBRACE properties* CLOSEBRACE;

//selector : (ID_SELECTOR|CLASS_SELECTOR|TAG_SELECTOR);

properties : PROPERTY COLON_CSS value SEMICOLON_CSS;

value :VALUE (COMMA_CSS VALUE)*;




//========================> JINJA2 <========================






jinjaExpression: EXPR_START expr EXPR_END;


jinjaTag
    : jinjaSingleTag
    | jinjaBlock
    ;

jinjaComment: COMMENT_START COMMENT_TEXT? COMMENT_END;

// ============ التعبيرات (EXPRESSIONS) ============

expr:
    literal                                                             # literalExpr
    | ID                                                                 # identifierExpr
    | expr DOT ID                                                        # attributeExpr
    | expr LBRACK expr RBRACK                                           # subscriptionExpr
    | expr LPAREN (expr (COMMA expr)*)? RPAREN                          # callExpr
    | expr PIPE ID (LPAREN (expr (COMMA expr)*)? RPAREN)?               # filterExpr
    | MINUS expr                                                        # unaryMinusExpr
    | NOT expr                                                          # notExpr
    | expr POW expr                                                     # powerExpr
    | expr (MULT | DIV | MOD) expr                                      # mulDivModExpr
    | expr (PLUS | MINUS) expr                                          # addSubExpr
    | expr (LT | GT | LE | GE) expr                                     # comparisonExpr
    | expr (EQ | NE) expr                                               # equalityExpr
    | expr AND expr                                                     # andExpr
    | expr OR expr                                                      # orExpr
    | expr IN expr                                                      # inExpr
    | expr IS ID (LPAREN expr? RPAREN)?                                 # isExpr
    | LPAREN expr RPAREN                                                # parenExpr
    ;

literal:
    INT                                 # intLiteral
    | FLOAT                             # floatLiteral
    | STRING                            # stringLiteral
    | TRUE                              # trueLiteral
    | FALSE                             # falseLiteral
    | NONE                              # noneLiteral
    | LBRACE (expr COLON expr (COMMA expr COLON expr)*)? RBRACE  # dictLiteral
    | LBRACK (expr (COMMA expr)*)? RBRACK                       # listLiteral
    ;

// ============ العلامات (TAGS) ============


//tagContent:
//    ifTag
//    | forTag;
//
//ifTag: IF expr (tagBody)? (ELIF expr (tagBody)?)* (ELSE (tagBody)?)? ENDIF;
//forTag: FOR ID IN expr (tagBody)? ENDFOR;
//
//
//tagBody: (HTML_TEXT | jinjaExpression | jinjaTag)*;



jinjaSingleTag
    : TAG_START singleJinjaTagContent TAG_END
    ;

singleJinjaTagContent
    : SET ID EQ expr
    | INCLUDE STRING
    | EXTENDS STRING

    ;

// العلامات المركبة (التي تحتاج body)
firstBlockJinjaTagContent
    : IF expr
    | ELIF expr
    | ELSE
    | FOR ID IN expr
    ;


endBlockJinjaTagContent
    : ENDIF
    | ENDFOR
    ;

    jinjaBlock
        : jinjaForBlock
        | jinjaIfBlock
        ;

    jinjaForBlock
        : TAG_START FOR ID IN expr TAG_END
          htmlElement*
          TAG_START ENDFOR TAG_END
        ;

    jinjaIfBlock
        : TAG_START IF expr TAG_END
          htmlElement*
          (TAG_START ELIF expr TAG_END htmlElement*)*
          (TAG_START ELSE TAG_END htmlElement*)?
          TAG_START ENDIF TAG_END
        ;









