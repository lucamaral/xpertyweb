package grammar;
// Generated from Xperty.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpertyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, FI=3, STRING=4, INT=5, BOOLEAN=6, MINUS=7, COMMA=8, DOT=9, 
		AND=10, OR=11, NOT_EQUAL=12, GREATER=13, GREATER_OR_EQUAL=14, LOWER=15, 
		LOWER_OR_EQUAL=16, EQUALS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IF", "THEN", "FI", "STRING", "INT", "BOOLEAN", "'-'", "','", "'.'", "AND", 
		"OR", "'<>'", "'>'", "'>='", "'<'", "'<='", "'='"
	};
	public static final String[] ruleNames = {
		"IF", "THEN", "FI", "STRING", "INT", "BOOLEAN", "MINUS", "COMMA", "DOT", 
		"AND", "OR", "NOT_EQUAL", "GREATER", "GREATER_OR_EQUAL", "LOWER", "LOWER_OR_EQUAL", 
		"EQUALS"
	};


	public XpertyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xperty.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3"+
		"\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\5\3"+
		"\5\3\6\6\6H\n\6\r\6\16\6I\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13c\n\13\3\f"+
		"\3\f\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\2\23\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1\3\2\4\3\2))\3\2\62;\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3)\3\2\2\2\5\63\3\2\2\2\79\3\2\2\2"+
		"\t;\3\2\2\2\13G\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2"+
		"\25b\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37r\3\2\2"+
		"\2!t\3\2\2\2#w\3\2\2\2%&\7K\2\2&*\7H\2\2\'(\7k\2\2(*\7h\2\2)%\3\2\2\2"+
		")\'\3\2\2\2*\4\3\2\2\2+,\7V\2\2,-\7J\2\2-.\7G\2\2.\64\7P\2\2/\60\7v\2"+
		"\2\60\61\7j\2\2\61\62\7g\2\2\62\64\7p\2\2\63+\3\2\2\2\63/\3\2\2\2\64\6"+
		"\3\2\2\2\65\66\7H\2\2\66:\7K\2\2\678\7h\2\28:\7k\2\29\65\3\2\2\29\67\3"+
		"\2\2\2:\b\3\2\2\2;A\7)\2\2<=\7)\2\2=@\7)\2\2>@\n\2\2\2?<\3\2\2\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7)\2\2E\n\3\2"+
		"\2\2FH\t\3\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\f\3\2\2\2KL\7"+
		"v\2\2LM\7t\2\2MN\7w\2\2NU\7g\2\2OP\7h\2\2PQ\7c\2\2QR\7n\2\2RS\7u\2\2S"+
		"U\7g\2\2TK\3\2\2\2TO\3\2\2\2U\16\3\2\2\2VW\7/\2\2W\20\3\2\2\2XY\7.\2\2"+
		"Y\22\3\2\2\2Z[\7\60\2\2[\24\3\2\2\2\\]\7C\2\2]^\7P\2\2^c\7F\2\2_`\7c\2"+
		"\2`a\7p\2\2ac\7f\2\2b\\\3\2\2\2b_\3\2\2\2c\26\3\2\2\2de\7Q\2\2ei\7T\2"+
		"\2fg\7q\2\2gi\7t\2\2hd\3\2\2\2hf\3\2\2\2i\30\3\2\2\2jk\7>\2\2kl\7@\2\2"+
		"l\32\3\2\2\2mn\7@\2\2n\34\3\2\2\2op\7@\2\2pq\7?\2\2q\36\3\2\2\2rs\7>\2"+
		"\2s \3\2\2\2tu\7>\2\2uv\7?\2\2v\"\3\2\2\2wx\7?\2\2x$\3\2\2\2\f\2)\639"+
		"?AITbh";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}