// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.general.ExpressionComparison;



import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LarkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, INTEGER=24, 
		DECIMAL=25, STRING=26, CHARACTER=27, BOOLEAN=28, UNDEFINED=29, IDENTIFIER=30, 
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "INTEGER", "DECIMAL", 
			"STRING", "CHARACTER", "BOOLEAN", "UNDEFINED", "LETTER", "DIGIT", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", 
			"':='", "'return'", "'<'", "'>'", "'+'", "'-'", "'^'", "'*'", "'/'", 
			"'%'", "'>='", "'<='", "'=='", "'!='", null, null, null, null, null, 
			"'Undefined'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INTEGER", "DECIMAL", "STRING", "CHARACTER", "BOOLEAN", "UNDEFINED", 
			"IDENTIFIER", "WS"
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



	class MapEntry {
	    private @Getter IExpression key;
	    private @Getter IExpression value;

	    public MapEntry(IExpression key, IExpression value) {
	        this.key = key;
	        this.value = value;
	    }
	}



	public LarkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lark.g4"; }

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
		case 25:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
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
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0004\u0017}\b\u0017\u000b\u0017\f\u0017"+
		"~\u0001\u0018\u0004\u0018\u0082\b\u0018\u000b\u0018\f\u0018\u0083\u0001"+
		"\u0018\u0001\u0018\u0004\u0018\u0088\b\u0018\u000b\u0018\f\u0018\u0089"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u008e\b\u0019\n\u0019\f\u0019\u0091"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00a4\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u00b7\b\u001f\n\u001f\f\u001f\u00ba\t\u001f\u0001 "+
		"\u0004 \u00bd\b \u000b \f \u00be\u0001 \u0001 \u0000\u0000!\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u0000=\u0000?\u001eA\u001f\u0001"+
		"\u0000\u0004\u0003\u0000\n\n\r\r\"\"\u0002\u0000AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\f\r  \u00c7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000"+
		"\u0000\u0003E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007"+
		"I\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bM\u0001\u0000"+
		"\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019a\u0001\u0000"+
		"\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001de\u0001\u0000\u0000\u0000"+
		"\u001fg\u0001\u0000\u0000\u0000!i\u0001\u0000\u0000\u0000#k\u0001\u0000"+
		"\u0000\u0000%m\u0001\u0000\u0000\u0000\'o\u0001\u0000\u0000\u0000)r\u0001"+
		"\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-x\u0001\u0000\u0000\u0000"+
		"/|\u0001\u0000\u0000\u00001\u0081\u0001\u0000\u0000\u00003\u008b\u0001"+
		"\u0000\u0000\u00005\u0095\u0001\u0000\u0000\u00007\u00a3\u0001\u0000\u0000"+
		"\u00009\u00a5\u0001\u0000\u0000\u0000;\u00af\u0001\u0000\u0000\u0000="+
		"\u00b1\u0001\u0000\u0000\u0000?\u00b3\u0001\u0000\u0000\u0000A\u00bc\u0001"+
		"\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0002\u0001\u0000\u0000\u0000"+
		"EF\u0005,\u0000\u0000F\u0004\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000"+
		"H\u0006\u0001\u0000\u0000\u0000IJ\u0005)\u0000\u0000J\b\u0001\u0000\u0000"+
		"\u0000KL\u0005[\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005]\u0000"+
		"\u0000N\f\u0001\u0000\u0000\u0000OP\u0005{\u0000\u0000P\u000e\u0001\u0000"+
		"\u0000\u0000QR\u0005}\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005"+
		":\u0000\u0000T\u0012\u0001\u0000\u0000\u0000UV\u0005:\u0000\u0000VW\u0005"+
		"=\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005"+
		"e\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005u\u0000\u0000\\]\u0005r\u0000"+
		"\u0000]^\u0005n\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005<\u0000"+
		"\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0005>\u0000\u0000b\u001a\u0001"+
		"\u0000\u0000\u0000cd\u0005+\u0000\u0000d\u001c\u0001\u0000\u0000\u0000"+
		"ef\u0005-\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005^\u0000\u0000"+
		"h \u0001\u0000\u0000\u0000ij\u0005*\u0000\u0000j\"\u0001\u0000\u0000\u0000"+
		"kl\u0005/\u0000\u0000l$\u0001\u0000\u0000\u0000mn\u0005%\u0000\u0000n"+
		"&\u0001\u0000\u0000\u0000op\u0005>\u0000\u0000pq\u0005=\u0000\u0000q("+
		"\u0001\u0000\u0000\u0000rs\u0005<\u0000\u0000st\u0005=\u0000\u0000t*\u0001"+
		"\u0000\u0000\u0000uv\u0005=\u0000\u0000vw\u0005=\u0000\u0000w,\u0001\u0000"+
		"\u0000\u0000xy\u0005!\u0000\u0000yz\u0005=\u0000\u0000z.\u0001\u0000\u0000"+
		"\u0000{}\u0003=\u001e\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"0\u0001\u0000\u0000\u0000\u0080\u0082\u0003=\u001e\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0005.\u0000\u0000\u0086\u0088\u0003=\u001e"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a2\u0001\u0000\u0000\u0000\u008b\u008f\u0005\"\u0000\u0000"+
		"\u008c\u008e\b\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093\u0094"+
		"\u0006\u0019\u0000\u0000\u00944\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\'\u0000\u0000\u0096\u0097\t\u0000\u0000\u0000\u0097\u0098\u0005\'\u0000"+
		"\u0000\u0098\u0099\u0006\u001a\u0001\u0000\u00996\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005T\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u009d"+
		"\u0005u\u0000\u0000\u009d\u00a4\u0005e\u0000\u0000\u009e\u009f\u0005F"+
		"\u0000\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000"+
		"\u00a1\u00a2\u0005s\u0000\u0000\u00a2\u00a4\u0005e\u0000\u0000\u00a3\u009a"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a48\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005U\u0000\u0000\u00a6\u00a7\u0005n\u0000"+
		"\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9"+
		"\u00aa\u0005f\u0000\u0000\u00aa\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005"+
		"n\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005d\u0000"+
		"\u0000\u00ae:\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0001\u0000\u0000"+
		"\u00b0<\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0002\u0000\u0000\u00b2"+
		">\u0001\u0000\u0000\u0000\u00b3\u00b8\u0003;\u001d\u0000\u00b4\u00b7\u0003"+
		";\u001d\u0000\u00b5\u00b7\u0003=\u001e\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9@\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0007\u0003\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0006 \u0002\u0000\u00c1B\u0001\u0000\u0000\u0000\t\u0000"+
		"~\u0083\u0089\u008f\u00a3\u00b6\u00b8\u00be\u0003\u0001\u0019\u0000\u0001"+
		"\u001a\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}