/* You do not need to change anything up here. */
package lexer;

import frontend.Token;
import static frontend.Token.Type.*;

%%

%public
%final
%class Lexer
%function nextToken
%type Token
%unicode
%line
%column

%{
	/* These two methods are for the convenience of rules to create token objects.
	* If you do not want to use them, delete them
	* otherwise add the code in 
	*/
	
	private Token token(Token.Type type) {
		return new Token(type,yyline,yycolumn,yytext());
	}
	
	/* Use this method for rules where you need to process yytext() to get the lexeme of the token.
	 *
	 * Useful for string literals; e.g., the quotes around the literal are part of yytext(),
	 *       but they should not be part of the lexeme. 
	*/
	private Token token(Token.Type type, String text) {
		
	}
%}

/* This definition may come in handy. If you wish, you can add more definitions here. */
WhiteSpace = [ ] | \t | \f | \n | \r

ID = [a-zA-Z][\w\d]*
Int_literal = \d+\.?\d*
//String_literal = \"[^'"]*\"

%%
/* put in your rules here.    */
{WhiteSpace} 		{/*Do nothing*/}
{Int_literal}		{return token(INT_LITERAL);}

boolean				{return token(BOOLEAN);}
module				{return token(MODULE);}
false				{return token(FALSE);}
return 				{return token(RETURN);}
while				{return token(WHILE);}

/* You don't need to change anything below this line. */
.							{ throw new Error("unexpected character '" + yytext() + "'"); }
<<EOF>>						{ return token(EOF); }
