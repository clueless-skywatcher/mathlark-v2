// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;


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
		T__17=18, T__18=19, INTEGER=20, DECIMAL=21, STRING=22, CHARACTER=23, BOOLEAN=24, 
		UNDEFINED=25, IDENTIFIER=26, WS=27;
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
			"T__17", "T__18", "INTEGER", "DECIMAL", "STRING", "CHARACTER", "BOOLEAN", 
			"UNDEFINED", "LETTER", "DIGIT", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", 
			"':='", "'return'", "'<'", "'>'", "'+'", "'-'", "'^'", "'*'", "'/'", 
			"'%'", null, null, null, null, null, "'Undefined'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INTEGER", "DECIMAL", 
			"STRING", "CHARACTER", "BOOLEAN", "UNDEFINED", "IDENTIFIER", "WS"
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
		case 21:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
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
		"\u0004\u0000\u001b\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0004\u0013i\b\u0013\u000b\u0013\f\u0013j\u0001\u0014"+
		"\u0004\u0014n\b\u0014\u000b\u0014\f\u0014o\u0001\u0014\u0001\u0014\u0004"+
		"\u0014t\b\u0014\u000b\u0014\f\u0014u\u0001\u0015\u0001\u0015\u0005\u0015"+
		"z\b\u0015\n\u0015\f\u0015}\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0090\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00a3\b\u001b\n\u001b"+
		"\f\u001b\u00a6\t\u001b\u0001\u001c\u0004\u001c\u00a9\b\u001c\u000b\u001c"+
		"\f\u001c\u00aa\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u0000"+
		"5\u00007\u001a9\u001b\u0001\u0000\u0004\u0003\u0000\n\n\r\r\"\"\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\f\r  \u00b3\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009"+
		"\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001\u0000"+
		"\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000"+
		"\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001\u0000"+
		"\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000"+
		"\u0013M\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017W"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000"+
		"!a\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000"+
		"\u0000\'h\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000\u0000+w\u0001\u0000"+
		"\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u008f\u0001\u0000\u0000\u0000"+
		"1\u0091\u0001\u0000\u0000\u00003\u009b\u0001\u0000\u0000\u00005\u009d"+
		"\u0001\u0000\u0000\u00007\u009f\u0001\u0000\u0000\u00009\u00a8\u0001\u0000"+
		"\u0000\u0000;<\u0005;\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005"+
		",\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005(\u0000\u0000@\u0006"+
		"\u0001\u0000\u0000\u0000AB\u0005)\u0000\u0000B\b\u0001\u0000\u0000\u0000"+
		"CD\u0005[\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005]\u0000\u0000"+
		"F\f\u0001\u0000\u0000\u0000GH\u0005{\u0000\u0000H\u000e\u0001\u0000\u0000"+
		"\u0000IJ\u0005}\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005:\u0000"+
		"\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005:\u0000\u0000NO\u0005=\u0000"+
		"\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005e\u0000"+
		"\u0000RS\u0005t\u0000\u0000ST\u0005u\u0000\u0000TU\u0005r\u0000\u0000"+
		"UV\u0005n\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005<\u0000\u0000"+
		"X\u0018\u0001\u0000\u0000\u0000YZ\u0005>\u0000\u0000Z\u001a\u0001\u0000"+
		"\u0000\u0000[\\\u0005+\u0000\u0000\\\u001c\u0001\u0000\u0000\u0000]^\u0005"+
		"-\u0000\u0000^\u001e\u0001\u0000\u0000\u0000_`\u0005^\u0000\u0000` \u0001"+
		"\u0000\u0000\u0000ab\u0005*\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005"+
		"/\u0000\u0000d$\u0001\u0000\u0000\u0000ef\u0005%\u0000\u0000f&\u0001\u0000"+
		"\u0000\u0000gi\u00035\u001a\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k(\u0001"+
		"\u0000\u0000\u0000ln\u00035\u001a\u0000ml\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000rt\u00035\u001a\u0000s"+
		"r\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v*\u0001\u0000\u0000\u0000w{\u0005\"\u0000"+
		"\u0000xz\b\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f"+
		"\u0080\u0006\u0015\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\'\u0000\u0000\u0082\u0083\t\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\'\u0000\u0000\u0084\u0085\u0006\u0016\u0001\u0000\u0085.\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005T\u0000\u0000\u0087\u0088\u0005r\u0000\u0000"+
		"\u0088\u0089\u0005u\u0000\u0000\u0089\u0090\u0005e\u0000\u0000\u008a\u008b"+
		"\u0005F\u0000\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005l"+
		"\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u0090\u0005e\u0000\u0000"+
		"\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000"+
		"\u00900\u0001\u0000\u0000\u0000\u0091\u0092\u0005U\u0000\u0000\u0092\u0093"+
		"\u0005n\u0000\u0000\u0093\u0094\u0005d\u0000\u0000\u0094\u0095\u0005e"+
		"\u0000\u0000\u0095\u0096\u0005f\u0000\u0000\u0096\u0097\u0005i\u0000\u0000"+
		"\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a"+
		"\u0005d\u0000\u0000\u009a2\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0001"+
		"\u0000\u0000\u009c4\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0002\u0000"+
		"\u0000\u009e6\u0001\u0000\u0000\u0000\u009f\u00a4\u00033\u0019\u0000\u00a0"+
		"\u00a3\u00033\u0019\u0000\u00a1\u00a3\u00035\u001a\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a58\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0007\u0003\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0006\u001c\u0002\u0000\u00ad:\u0001\u0000\u0000"+
		"\u0000\t\u0000jou{\u008f\u00a2\u00a4\u00aa\u0003\u0001\u0015\u0000\u0001"+
		"\u0016\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}