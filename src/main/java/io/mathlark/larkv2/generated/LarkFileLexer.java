// Generated from LarkFile.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LarkFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, INTEGER=23, DECIMAL=24, 
		STRING=25, CHARACTER=26, BOOLEAN=27, UNDEFINED=28, RETURN=29, IDENTIFIER=30, 
		WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "INTEGER", "DECIMAL", "STRING", 
			"CHARACTER", "BOOLEAN", "UNDEFINED", "RETURN", "LETTER", "DIGIT", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':='", "'<'", "'>'", 
			"'['", "']'", "':'", "'+'", "'-'", "'^'", "'*'", "'/'", "'%'", "'>='", 
			"'<='", "'=='", "'!='", null, null, null, null, null, "'Undefined'", 
			"'Return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"DECIMAL", "STRING", "CHARACTER", "BOOLEAN", "UNDEFINED", "RETURN", "IDENTIFIER", 
			"WS"
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


	public LarkFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LarkFile.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().substring(1, getText().length() - 1)); 
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 setText(getText().substring(1, 2));  
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00c2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016v\b\u0016"+
		"\u000b\u0016\f\u0016w\u0001\u0017\u0004\u0017{\b\u0017\u000b\u0017\f\u0017"+
		"|\u0001\u0017\u0001\u0017\u0004\u0017\u0081\b\u0017\u000b\u0017\f\u0017"+
		"\u0082\u0001\u0018\u0001\u0018\u0005\u0018\u0087\b\u0018\n\u0018\f\u0018"+
		"\u008a\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u009d\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u00b7\b\u001f\n\u001f\f\u001f\u00ba"+
		"\t\u001f\u0001 \u0004 \u00bd\b \u000b \f \u00be\u0001 \u0001 \u0000\u0000"+
		"!\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u0000=\u0000?\u001eA\u001f"+
		"\u0001\u0000\u0004\u0003\u0000\n\n\r\r\"\"\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\f\r  \u00c7\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000"+
		"\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000"+
		"\u0007I\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bM\u0001"+
		"\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000"+
		"\u0000\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015"+
		"X\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000"+
		"\u0000\u001fb\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#f\u0001"+
		"\u0000\u0000\u0000%h\u0001\u0000\u0000\u0000\'k\u0001\u0000\u0000\u0000"+
		")n\u0001\u0000\u0000\u0000+q\u0001\u0000\u0000\u0000-u\u0001\u0000\u0000"+
		"\u0000/z\u0001\u0000\u0000\u00001\u0084\u0001\u0000\u0000\u00003\u008e"+
		"\u0001\u0000\u0000\u00005\u009c\u0001\u0000\u0000\u00007\u009e\u0001\u0000"+
		"\u0000\u00009\u00a8\u0001\u0000\u0000\u0000;\u00af\u0001\u0000\u0000\u0000"+
		"=\u00b1\u0001\u0000\u0000\u0000?\u00b3\u0001\u0000\u0000\u0000A\u00bc"+
		"\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0002\u0001\u0000\u0000"+
		"\u0000EF\u0005{\u0000\u0000F\u0004\u0001\u0000\u0000\u0000GH\u0005}\u0000"+
		"\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005(\u0000\u0000J\b\u0001\u0000"+
		"\u0000\u0000KL\u0005,\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005)"+
		"\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0005:\u0000\u0000PQ\u0005="+
		"\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005<\u0000\u0000S\u0010"+
		"\u0001\u0000\u0000\u0000TU\u0005>\u0000\u0000U\u0012\u0001\u0000\u0000"+
		"\u0000VW\u0005[\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005]\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005:\u0000\u0000[\u0018\u0001"+
		"\u0000\u0000\u0000\\]\u0005+\u0000\u0000]\u001a\u0001\u0000\u0000\u0000"+
		"^_\u0005-\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005^\u0000\u0000"+
		"a\u001e\u0001\u0000\u0000\u0000bc\u0005*\u0000\u0000c \u0001\u0000\u0000"+
		"\u0000de\u0005/\u0000\u0000e\"\u0001\u0000\u0000\u0000fg\u0005%\u0000"+
		"\u0000g$\u0001\u0000\u0000\u0000hi\u0005>\u0000\u0000ij\u0005=\u0000\u0000"+
		"j&\u0001\u0000\u0000\u0000kl\u0005<\u0000\u0000lm\u0005=\u0000\u0000m"+
		"(\u0001\u0000\u0000\u0000no\u0005=\u0000\u0000op\u0005=\u0000\u0000p*"+
		"\u0001\u0000\u0000\u0000qr\u0005!\u0000\u0000rs\u0005=\u0000\u0000s,\u0001"+
		"\u0000\u0000\u0000tv\u0003=\u001e\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x.\u0001\u0000\u0000\u0000y{\u0003=\u001e\u0000zy\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0005.\u0000\u0000\u007f\u0081"+
		"\u0003=\u001e\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u00830\u0001\u0000\u0000\u0000\u0084\u0088\u0005\""+
		"\u0000\u0000\u0085\u0087\b\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\"\u0000\u0000"+
		"\u008c\u008d\u0006\u0018\u0000\u0000\u008d2\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\'\u0000\u0000\u008f\u0090\t\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\'\u0000\u0000\u0091\u0092\u0006\u0019\u0001\u0000\u00924\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005T\u0000\u0000\u0094\u0095\u0005r\u0000"+
		"\u0000\u0095\u0096\u0005u\u0000\u0000\u0096\u009d\u0005e\u0000\u0000\u0097"+
		"\u0098\u0005F\u0000\u0000\u0098\u0099\u0005a\u0000\u0000\u0099\u009a\u0005"+
		"l\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b\u009d\u0005e\u0000"+
		"\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0097\u0001\u0000\u0000"+
		"\u0000\u009d6\u0001\u0000\u0000\u0000\u009e\u009f\u0005U\u0000\u0000\u009f"+
		"\u00a0\u0005n\u0000\u0000\u00a0\u00a1\u0005d\u0000\u0000\u00a1\u00a2\u0005"+
		"e\u0000\u0000\u00a2\u00a3\u0005f\u0000\u0000\u00a3\u00a4\u0005i\u0000"+
		"\u0000\u00a4\u00a5\u0005n\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6"+
		"\u00a7\u0005d\u0000\u0000\u00a78\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"R\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005t\u0000"+
		"\u0000\u00ab\u00ac\u0005u\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad"+
		"\u00ae\u0005n\u0000\u0000\u00ae:\u0001\u0000\u0000\u0000\u00af\u00b0\u0007"+
		"\u0001\u0000\u0000\u00b0<\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0002"+
		"\u0000\u0000\u00b2>\u0001\u0000\u0000\u0000\u00b3\u00b8\u0003;\u001d\u0000"+
		"\u00b4\u00b7\u0003;\u001d\u0000\u00b5\u00b7\u0003=\u001e\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9@\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0007\u0003\u0000\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0006 \u0002\u0000\u00c1B\u0001\u0000\u0000"+
		"\u0000\t\u0000w|\u0082\u0088\u009c\u00b6\u00b8\u00be\u0003\u0001\u0018"+
		"\u0000\u0001\u0019\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}