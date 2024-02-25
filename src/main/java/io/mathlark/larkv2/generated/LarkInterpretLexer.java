// Generated from LarkInterpret.g4 by ANTLR 4.13.1
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
public class LarkInterpretLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INTEGER=15, DECIMAL=16, 
		STRING=17, CHARACTER=18, BOOLEAN=19, IDENTIFIER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "INTEGER", "DECIMAL", "STRING", 
			"CHARACTER", "BOOLEAN", "LETTER", "DIGIT", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "':='", "'return'", "';'", "'<'", "'>'", "'+'", 
			"'-'", "'^'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INTEGER", "DECIMAL", "STRING", "CHARACTER", "BOOLEAN", 
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


	public LarkInterpretLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LarkInterpret.g4"; }

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
		case 16:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
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
		"\u0004\u0000\u0015\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0004\u000eS\b\u000e\u000b\u000e\f\u000eT\u0001\u000f\u0004\u000fX\b"+
		"\u000f\u000b\u000f\f\u000fY\u0001\u000f\u0001\u000f\u0004\u000f^\b\u000f"+
		"\u000b\u000f\f\u000f_\u0001\u0010\u0001\u0010\u0005\u0010d\b\u0010\n\u0010"+
		"\f\u0010g\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012z\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0083\b\u0015\n"+
		"\u0015\f\u0015\u0086\t\u0015\u0001\u0016\u0004\u0016\u0089\b\u0016\u000b"+
		"\u0016\f\u0016\u008a\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0000+\u0014-\u0015\u0001\u0000"+
		"\u0004\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t"+
		"\n\f\r  \u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000"+
		"\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000"+
		"\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t8\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000"+
		"\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001"+
		"\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bO\u0001\u0000\u0000"+
		"\u0000\u001dR\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!"+
		"a\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000"+
		"\u0000\'{\u0001\u0000\u0000\u0000)}\u0001\u0000\u0000\u0000+\u007f\u0001"+
		"\u0000\u0000\u0000-\u0088\u0001\u0000\u0000\u0000/0\u0005,\u0000\u0000"+
		"0\u0002\u0001\u0000\u0000\u000012\u0005(\u0000\u00002\u0004\u0001\u0000"+
		"\u0000\u000034\u0005)\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005"+
		":\u0000\u000067\u0005=\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005e\u0000\u0000:;\u0005t\u0000\u0000;<\u0005u\u0000"+
		"\u0000<=\u0005r\u0000\u0000=>\u0005n\u0000\u0000>\n\u0001\u0000\u0000"+
		"\u0000?@\u0005;\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005<\u0000"+
		"\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005>\u0000\u0000D\u0010\u0001"+
		"\u0000\u0000\u0000EF\u0005+\u0000\u0000F\u0012\u0001\u0000\u0000\u0000"+
		"GH\u0005-\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005^\u0000\u0000"+
		"J\u0016\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000L\u0018\u0001\u0000"+
		"\u0000\u0000MN\u0005/\u0000\u0000N\u001a\u0001\u0000\u0000\u0000OP\u0005"+
		"%\u0000\u0000P\u001c\u0001\u0000\u0000\u0000QS\u0003)\u0014\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u001e\u0001\u0000\u0000\u0000VX\u0003)\u0014"+
		"\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0005"+
		".\u0000\u0000\\^\u0003)\u0014\u0000]\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"` \u0001\u0000\u0000\u0000ae\u0005\"\u0000\u0000bd\b\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u0005\"\u0000\u0000ij\u0006\u0010\u0000\u0000j\"\u0001"+
		"\u0000\u0000\u0000kl\u0005\'\u0000\u0000lm\t\u0000\u0000\u0000mn\u0005"+
		"\'\u0000\u0000no\u0006\u0011\u0001\u0000o$\u0001\u0000\u0000\u0000pq\u0005"+
		"T\u0000\u0000qr\u0005r\u0000\u0000rs\u0005u\u0000\u0000sz\u0005e\u0000"+
		"\u0000tu\u0005F\u0000\u0000uv\u0005a\u0000\u0000vw\u0005l\u0000\u0000"+
		"wx\u0005s\u0000\u0000xz\u0005e\u0000\u0000yp\u0001\u0000\u0000\u0000y"+
		"t\u0001\u0000\u0000\u0000z&\u0001\u0000\u0000\u0000{|\u0007\u0001\u0000"+
		"\u0000|(\u0001\u0000\u0000\u0000}~\u0007\u0002\u0000\u0000~*\u0001\u0000"+
		"\u0000\u0000\u007f\u0084\u0003\'\u0013\u0000\u0080\u0083\u0003\'\u0013"+
		"\u0000\u0081\u0083\u0003)\u0014\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085,\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0007\u0003\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0006\u0016\u0002\u0000\u008d.\u0001\u0000\u0000\u0000\t\u0000"+
		"TY_ey\u0082\u0084\u008a\u0003\u0001\u0010\u0000\u0001\u0011\u0001\u0000"+
		"\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}