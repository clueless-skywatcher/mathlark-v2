// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INTEGER=17, 
		DECIMAL=18, STRING=19, CHARACTER=20, BOOLEAN=21, IDENTIFIER=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "INTEGER", 
			"DECIMAL", "STRING", "CHARACTER", "BOOLEAN", "LETTER", "DIGIT", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'['", "']'", "':='", "'return'", "';'", "'<'", 
			"'>'", "'+'", "'-'", "'^'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INTEGER", "DECIMAL", "STRING", "CHARACTER", 
			"BOOLEAN", "IDENTIFIER", "WS"
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
		case 18:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
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
		"\u0004\u0000\u0017\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010[\b\u0010\u000b\u0010\f\u0010\\\u0001\u0011"+
		"\u0004\u0011`\b\u0011\u000b\u0011\f\u0011a\u0001\u0011\u0001\u0011\u0004"+
		"\u0011f\b\u0011\u000b\u0011\f\u0011g\u0001\u0012\u0001\u0012\u0005\u0012"+
		"l\b\u0012\n\u0012\f\u0012o\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0082\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u008b\b\u0017\n\u0017\f\u0017\u008e\t\u0017\u0001\u0018\u0004\u0018\u0091"+
		"\b\u0018\u000b\u0018\f\u0018\u0092\u0001\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0000"+
		"/\u00161\u0017\u0001\u0000\u0004\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\f\r  \u009b\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001"+
		"\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000"+
		"\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r@\u0001"+
		"\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000"+
		"\u0000\u0013K\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017"+
		"O\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001"+
		"\u0000\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000"+
		"\u0000!Z\u0001\u0000\u0000\u0000#_\u0001\u0000\u0000\u0000%i\u0001\u0000"+
		"\u0000\u0000\'s\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000\u0000"+
		"+\u0083\u0001\u0000\u0000\u0000-\u0085\u0001\u0000\u0000\u0000/\u0087"+
		"\u0001\u0000\u0000\u00001\u0090\u0001\u0000\u0000\u000034\u0005,\u0000"+
		"\u00004\u0002\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\u0004\u0001"+
		"\u0000\u0000\u000078\u0005)\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9:\u0005[\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005]\u0000\u0000"+
		"<\n\u0001\u0000\u0000\u0000=>\u0005:\u0000\u0000>?\u0005=\u0000\u0000"+
		"?\f\u0001\u0000\u0000\u0000@A\u0005r\u0000\u0000AB\u0005e\u0000\u0000"+
		"BC\u0005t\u0000\u0000CD\u0005u\u0000\u0000DE\u0005r\u0000\u0000EF\u0005"+
		"n\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005;\u0000\u0000H\u0010"+
		"\u0001\u0000\u0000\u0000IJ\u0005<\u0000\u0000J\u0012\u0001\u0000\u0000"+
		"\u0000KL\u0005>\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005+\u0000"+
		"\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000P\u0018\u0001"+
		"\u0000\u0000\u0000QR\u0005^\u0000\u0000R\u001a\u0001\u0000\u0000\u0000"+
		"ST\u0005*\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005/\u0000\u0000"+
		"V\u001e\u0001\u0000\u0000\u0000WX\u0005%\u0000\u0000X \u0001\u0000\u0000"+
		"\u0000Y[\u0003-\u0016\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\"\u0001"+
		"\u0000\u0000\u0000^`\u0003-\u0016\u0000_^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ce\u0005.\u0000\u0000df\u0003-\u0016\u0000e"+
		"d\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h$\u0001\u0000\u0000\u0000im\u0005\"\u0000"+
		"\u0000jl\b\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\"\u0000\u0000qr\u0006\u0012"+
		"\u0000\u0000r&\u0001\u0000\u0000\u0000st\u0005\'\u0000\u0000tu\t\u0000"+
		"\u0000\u0000uv\u0005\'\u0000\u0000vw\u0006\u0013\u0001\u0000w(\u0001\u0000"+
		"\u0000\u0000xy\u0005T\u0000\u0000yz\u0005r\u0000\u0000z{\u0005u\u0000"+
		"\u0000{\u0082\u0005e\u0000\u0000|}\u0005F\u0000\u0000}~\u0005a\u0000\u0000"+
		"~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0082"+
		"\u0005e\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0081|\u0001\u0000"+
		"\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0001\u0000"+
		"\u0000\u0084,\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0002\u0000\u0000"+
		"\u0086.\u0001\u0000\u0000\u0000\u0087\u008c\u0003+\u0015\u0000\u0088\u008b"+
		"\u0003+\u0015\u0000\u0089\u008b\u0003-\u0016\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d0\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0007\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0006\u0018\u0002\u0000\u00952\u0001\u0000\u0000\u0000"+
		"\t\u0000\\agm\u0081\u008a\u008c\u0092\u0003\u0001\u0012\u0000\u0001\u0013"+
		"\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}