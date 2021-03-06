package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short VOID = 4;
		static public final short BOOLEAN = 5;
		static public final short INT = 6;
		static public final short MINUS = 7;
		static public final short STRING_LITERAL = 8;
		static public final short INT_LITERAL = 9;
		static public final short TRUE = 10;
		static public final short FALSE = 11;
		static public final short RPAREN = 12;
		static public final short RCURLY = 13;
		static public final short LCURLY = 14;
		static public final short SEMICOLON = 15;
		static public final short IF = 16;
		static public final short WHILE = 17;
		static public final short BREAK = 18;
		static public final short RETURN = 19;
		static public final short RBRACKET = 20;
		static public final short COMMA = 21;
		static public final short EQL = 22;
		static public final short IMPORT = 23;
		static public final short PUBLIC = 24;
		static public final short PLUS = 25;
		static public final short TIMES = 26;
		static public final short DIV = 27;
		static public final short MOD = 28;
		static public final short TYPE = 29;
		static public final short MODULE = 30;
		static public final short ELSE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LT = 34;
		static public final short LEQ = 35;
		static public final short GT = 36;
		static public final short GEQ = 37;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pLLcbKLLKK$kvzAcOFC0EKIZAY11b5G41HY1YK8IgRQB0YAxAqqaRD34tJI7zNgtBf3rU" +
		"baOgpcCrfPfcLPRFQO6aMJPJLxhld7bwNrtltmJ9QzTxwpjvdpsUuvnp0t8cJKO5AL24HMS" +
		"Z1SEHZ1CgGZDjnEWOZ1WCGYnDm8ax2GCGXgels$RjeVrK8##lyxDsjh##IzKr#rgDmDiv7D" +
		"Sv23JAHYpoCmtamvKFKoPEu6ZVWPamDOkMnhD0ZX5MZiWhpMOqCKjyPgZvtRGCYCLDdk0A3" +
		"K1Wuf$oEMkOy9qHb5w4dhUQ7iBg76Ulabv3rnxlMxwuTugejSTLUuAgzrbKxsLLxgz86dfM" +
		"xbK#4QllXU9pYYvBT8Kfg4F#xK81et194U$JIGDMaTrksxXt5q0wZi6N3EiXg4IuVuLI4en" +
		"TEGsySWpIsVN0ilBfju6vFqF5Jv0jSZ4jmAIx3U5oE1cd3TAsprpL9skG0vg4lPgCSOp1Mj" +
		"$DmFttdOnRZP$3xAy1e5D7tJ1GJfPJTYIjnBYx4DPY0UXo7YPY46p45js4Qxf2lC4E#nBsO" +
		"o$to0Ex30io1zMjKEoqHIVmIaf72NPF6rShWo3CvqYoErHgfDIls31Jyn#oxqzg02GzFsPv" +
		"Ssp2rjjQAnd6j8xXYVJd7rlSNsCfGLX4XhFehgt2VbNjzxbf3vR0pM5nba9mW7q6jUsMnFF" +
		"SZkBD2ZTByn#h$Fse3puhjOxTUpazKq2Y1$Kjv9eNplWq#vqSd3LnDTsNxDqSHI1R6apASQ" +
		"p2Q9wN96xsORvSITQPMwDRWRX#burTpnGRnZ8pdcPx04ztwZgErpeuUGucNRpaFNt7sQyvk" +
		"1$2ByVABYMJy8cOQHGilVQDvWbieuhf6iWulvLQ4AhuNBOj8$ii8Brily$McZQ6aCS8VpmX" +
		"WuKnrMFEC1vuW5X5B0NCMQJFHHhuHCA8iktPGPf7zf0yI2wXVGYnMfpwCpJhcOzHDSFhvWx" +
		"y3j7z4nnnFJBLvOxiZLmFxkpLVJtulcLRIG#pF9ZnQ5#6Mon7lSKqvNZEMMApx3skQGBJND" +
		"BUJCTE99NwoV69P9$sNwlbOINwvbgqXIeWcTWwIFaegMhUHg25MSHxwQTaAFNSjkhzIqsPD" +
		"fnFhoEmZVOZOGDk1fAlzQdc9M4ji8JOvvEirtKgq$2L7fOFVHbscmoVxxsCrvZZqazjvRiW" +
		"z3hurz9mPrbvprbsYvP5#Td5QdsVxg3sqowPcZjOLXigdxIOvnhh88Q$NkLB9JzIoAPsBYQ" +
		"O0OnlP6L#$E7tyObHeURocUGvThPRL#FdK1ndtDAtdkM3Ew7fjPbs0UXT2$#I8$A4eM$bPV" +
		"f8VuVUJ7rJxcUoNVR9NFfLFv6FPGSdNn0vvdUqkULEuesMdlCPsE$4YyIonIJRA1balwsIj" +
		"h97LqaoFD#ImYhXAdXP#SsnNo0loZ6oM5lbElfKjyeqSaeFAfacUakMAMoRFotFogcoJhVA" +
		"Al2pyKkG3fNdVL#bxn1vVxrrYD$4EyJRnbj#uFfV3yhslrygTVqH#K$olRCRnRZ48y5NOYx" +
		"U0IO0tWKVTECNaIwXlnnZUNsDverIe6yNmOR03YVIjecyLVSl8bv6MifzDNJ0KK5z0knpQ3" +
		"oToUVFbyjxA8$Af6w7WuRlMvEl5K1Z6$X1rL$KWe5uqMPHLamR2KEgiLqkXHWRxrikXo84a" +
		"naiYJNP12lDLqgwS$kNCcqgQHhc5TF8rVm8vK6qM");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN7 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 7];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] Accessibility = PUBLIC
			Action.NONE,  	// [1] Accessibility = 
			RETURN6,	// [2] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [3] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [4] Imports = 
			RETURN3,	// [5] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [6] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [7] Declarations = 
			Action.RETURN,	// [8] Declaration = Function
			Action.RETURN,	// [9] Declaration = Field
			Action.RETURN,	// [10] Declaration = Type_D
			RETURN9,	// [11] Function = Accessibility Type_Name ID LPAREN ParamList RPAREN LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [12] Field = Accessibility Type_Name ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [13] Type_D = Accessibility TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [14] Type_Name = Primitive
			Action.RETURN,	// [15] Type_Name = Array
			Action.RETURN,	// [16] Type_Name = ID
			Action.RETURN,	// [17] Primitive = VOID
			Action.RETURN,	// [18] Primitive = BOOLEAN
			Action.RETURN,	// [19] Primitive = INT
			RETURN3,	// [20] Array = Type_Name LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [21] ParamList = Parameter ParamListTail; returns 'ParamListTail' although none is marked
			Action.NONE,  	// [22] ParamList = 
			RETURN3,	// [23] ParamListTail = COMMA Parameter ParamListTail; returns 'ParamListTail' although none is marked
			Action.NONE,  	// [24] ParamListTail = 
			RETURN2,	// [25] Parameter = Type_Name ID; returns 'ID' although none is marked
			Action.RETURN,	// [26] Statement = Local_Variable
			Action.RETURN,	// [27] Statement = Block_Statements
			Action.RETURN,	// [28] Statement = If_Statement
			Action.RETURN,	// [29] Statement = While_Statement
			Action.RETURN,	// [30] Statement = Break_Statement
			Action.RETURN,	// [31] Statement = Return_Statement
			Action.RETURN,	// [32] Statement = Expression_Statement
			RETURN2,	// [33] StatementList = Statement StatementList; returns 'StatementList' although none is marked
			Action.NONE,  	// [34] StatementList = 
			RETURN3,	// [35] Local_Variable = Type_Name ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [36] Block_Statements = LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN7,	// [37] If_Statement = IF LPAREN Expression RPAREN Statement ELSE Statement; returns 'Statement' although none is marked
			RETURN5,	// [38] If_Statement = IF LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN5,	// [39] While_Statement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [40] Break_Statement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [41] Return_Statement = RETURN SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [42] Return_Statement = RETURN Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [43] Expression_Statement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [44] Expression = Assignment
			Action.RETURN,	// [45] Expression = RHS_Expression
			RETURN3,	// [46] Assignment = LHS_Expression EQL Expression; returns 'Expression' although none is marked
			RETURN2,	// [47] LHS_Expression = Type_Name LHS_ExpressionTail; returns 'LHS_ExpressionTail' although none is marked
			RETURN4,	// [48] LHS_ExpressionTail = LBRACKET Expression RBRACKET LHS_ExpressionTail; returns 'LHS_ExpressionTail' although none is marked
			Action.NONE,  	// [49] LHS_ExpressionTail = 
			Action.RETURN,	// [50] RHS_Expression = Arithmetic_Expression
			RETURN3,	// [51] RHS_Expression = Arithmetic_Expression Compare Arithmetic_Expression; returns 'Arithmetic_Expression' although none is marked
			Action.RETURN,	// [52] Compare = EQEQ
			Action.RETURN,	// [53] Compare = NEQ
			Action.RETURN,	// [54] Compare = LT
			Action.RETURN,	// [55] Compare = LEQ
			Action.RETURN,	// [56] Compare = GT
			Action.RETURN,	// [57] Compare = GEQ
			new Action() {	// [58] Arithmetic_Expression = Arithmetic_Expression Add Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [59] Arithmetic_Expression = Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [60] Add = PLUS
			Action.RETURN,	// [61] Add = MINUS
			new Action() {	// [62] Term = Term Mul Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [63] Term = Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [64] Mul = TIMES
			Action.RETURN,	// [65] Mul = DIV
			Action.RETURN,	// [66] Mul = MOD
			RETURN2,	// [67] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [68] Factor = Primary_Expression
			Action.RETURN,	// [69] Primary_Expression = LHS_Expression
			Action.RETURN,	// [70] Primary_Expression = Function_Call
			Action.RETURN,	// [71] Primary_Expression = Array_Expression
			Action.RETURN,	// [72] Primary_Expression = STRING_LITERAL
			Action.RETURN,	// [73] Primary_Expression = INT_LITERAL
			Action.RETURN,	// [74] Primary_Expression = Boolean_Literal
			Action.RETURN,	// [75] Primary_Expression = Paren_Expression
			RETURN4,	// [76] Function_Call = ID LPAREN ExpressionList RPAREN; returns 'RPAREN' although none is marked
			RETURN2,	// [77] ExpressionList = Expression ExpressionListTail; returns 'ExpressionListTail' although none is marked
			RETURN3,	// [78] ExpressionListTail = COMMA Expression ExpressionListTail; returns 'ExpressionListTail' although none is marked
			Action.NONE,  	// [79] ExpressionListTail = 
			RETURN3,	// [80] Array_Expression = LBRACKET ExpressionList RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [81] Boolean_Literal = TRUE
			Action.RETURN,	// [82] Boolean_Literal = FALSE
			RETURN3	// [83] Paren_Expression = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
