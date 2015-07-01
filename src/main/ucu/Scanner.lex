/* JFlex example: partial Java language lexer specification */
package ucu;
import ucu.SFXFactory;
import ucu.sym;
import java_cup.runtime.*;


/**
 * This class is a simple example lexer.
 */
%%

%cup
%public
%unicode
%class Scanner
%implements sym
%line
%column


%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

%%
"true" 							{ return symbol(TRUE, true); }
"false" 						{ return symbol (FALSE, false); }
"null" 							{ return new Symbol(NULL); }

\[                              { return symbol(LBRACKET); }
\]                              { return symbol(RBRACKET); }
\{                              { return symbol(LCLASP); }
\}                              { return symbol(RCLASP); }
\(								{ return symbol(LPARENTHESIS); }
\)								{ return symbol(RPARENTHESIS); }
\:								{ return symbol(COLON); }
\|                              { return symbol(PIPE); }
[ \r\n\t\f]		                { /* ignorar */ }

(-|\+)?([0-9]+)											{return symbol (INTEGER, Integer.parseInt(yytext())); }
(-|\+)?([0-9]+)(L|l)									{return symbol (LONG, Long.parseLong(yytext().substring(0,yylength()-1))); }
(-|\+)?([0-9]+)((\.[0-9]+)?|([eE][-+]?[0-9]+)?) 	    {return symbol (DOUBLE, Double.parseDouble(yytext())); }
(-|\+)?([0-9]+)((\.[0-9]+)?|([eE][-+]?[0-9]+)?)(D|d) 	{return symbol (DOUBLE, Double.parseDouble(yytext().substring(0,yylength()-1))); }
(-|\+)?([0-9]+)((\.[0-9]+)?|([eE][-+]?[0-9]+)?)(F|f)	{return symbol (FLOAT, Float.parseFloat(yytext())); }
(0x)([0-9A-Fa-f]){4}									{return symbol (HEXINTEGER, Integer.parseInt(yytext().substring(2,yylength()),16)); }
(0x)([0-9A-Fa-f]){4}(L|l)								{return symbol (HEXLONG, Long.parseLong(yytext().substring(2,yylength()-1),16)); }
\"([^\\\"]|\\.)*\"										{return symbol (STRING, yytext());}
[a-zA-Z]*												{return symbol(ID, yytext());}
.                              							{throw new Error("Illegal character <"+yytext()+">"); }
