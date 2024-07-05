// Generated from C:/Users/Filippo/Downloads/IntExp/src/IntExp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IntExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LPAR=4, RPAR=5, ADD=6, SUB=7, MUL=8, DIV=9, MOD=10, 
		ID=11, NUM=12, INT=13, FLOAT=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LPAR", "RPAR", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"ID", "NUM", "INT", "NAT", "POS", "FLOAT", "DIGIT", "POSDIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'^'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LPAR", "RPAR", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"ID", "NUM", "INT", "FLOAT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public IntExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IntExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n?\b\n\u000b"+
		"\n\f\n@\u0001\u000b\u0001\u000b\u0003\u000bE\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\fJ\b\f\u0001\r\u0001\r\u0003\rN\b\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000eR\b\u000e\n\u000e\f\u000eU\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f[\b\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f_\b\u000f\u000b\u000f\f\u000f`\u0003\u000fc\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010g\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0004\u0012l\b\u0012\u000b\u0012\f\u0012m\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u0000\u001d\u0000\u001f\u000e!\u0000#\u0000%\u000f\u0001\u0000\u0004"+
		"\u0001\u0000az\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r\r  v\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000"+
		"\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000"+
		"\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000"+
		"\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000"+
		"\u00139\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000\u0000\u0017D"+
		"\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bM\u0001\u0000"+
		"\u0000\u0000\u001dO\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000"+
		"!f\u0001\u0000\u0000\u0000#h\u0001\u0000\u0000\u0000%k\u0001\u0000\u0000"+
		"\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005;\u0000"+
		"\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005^\u0000\u0000,\u0006\u0001"+
		"\u0000\u0000\u0000-.\u0005(\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005"+
		")\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005+\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000034\u0005-\u0000\u00004\u000e\u0001\u0000\u0000\u0000"+
		"56\u0005*\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005/\u0000\u0000"+
		"8\u0012\u0001\u0000\u0000\u00009:\u0005m\u0000\u0000:;\u0005o\u0000\u0000"+
		";<\u0005d\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0016\u0001\u0000\u0000\u0000"+
		"BE\u0003\u0019\f\u0000CE\u0003\u001f\u000f\u0000DB\u0001\u0000\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000E\u0018\u0001\u0000\u0000\u0000FJ\u0003\u001b"+
		"\r\u0000GH\u0005-\u0000\u0000HJ\u0003\u001d\u000e\u0000IF\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000J\u001a\u0001\u0000\u0000\u0000"+
		"KN\u00050\u0000\u0000LN\u0003\u001d\u000e\u0000MK\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000N\u001c\u0001\u0000\u0000\u0000OS\u0007\u0001"+
		"\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u001e\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000Vc\u0003\u0019"+
		"\f\u0000W[\u0003\u0019\f\u0000XY\u0005-\u0000\u0000Y[\u00050\u0000\u0000"+
		"ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\^\u0005.\u0000\u0000]_\u0003!\u0010\u0000^]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ac\u0001\u0000\u0000\u0000bV\u0001\u0000\u0000\u0000bZ\u0001"+
		"\u0000\u0000\u0000c \u0001\u0000\u0000\u0000dg\u00050\u0000\u0000eg\u0003"+
		"#\u0011\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\"\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0001\u0000\u0000i$\u0001\u0000\u0000\u0000"+
		"jl\u0007\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0006\u0012\u0000\u0000p&\u0001\u0000\u0000\u0000\u000b"+
		"\u0000@DIMSZ`bfm\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}