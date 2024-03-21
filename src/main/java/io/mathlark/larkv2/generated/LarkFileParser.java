// Generated from LarkFile.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LarkFileParser extends Parser {
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
	public static final int
		RULE_lkFile = 0, RULE_codeBlock = 1, RULE_functionDefs = 2, RULE_functionDef = 3, 
		RULE_actualParams = 4, RULE_term = 5, RULE_mapEntries = 6, RULE_mapExpr = 7, 
		RULE_assign = 8, RULE_returnStmt = 9, RULE_functionAnonDef = 10, RULE_unary = 11, 
		RULE_exponent = 12, RULE_multiply = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"lkFile", "codeBlock", "functionDefs", "functionDef", "actualParams", 
			"term", "mapEntries", "mapExpr", "assign", "returnStmt", "functionAnonDef", 
			"unary", "exponent", "multiply", "expr"
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

	@Override
	public String getGrammarFileName() { return "LarkFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LarkFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LkFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LarkFileParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public LkFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lkFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterLkFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitLkFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitLkFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LkFileContext lkFile() throws RecognitionException {
		LkFileContext _localctx = new LkFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lkFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					expr(0);
					setState(31);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(33);
					functionDef();
					}
					break;
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
					expr(0);
					setState(43);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(45);
					functionDef();
					}
					break;
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(51);
				returnStmt();
				}
			}

			setState(54);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefsContext extends ParserRuleContext {
		public String funcName;
		public Token IDENTIFIER;
		public List<Token> args = new ArrayList<Token>();
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LarkFileParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LarkFileParser.IDENTIFIER, i);
		}
		public FunctionDefsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunctionDefsContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
		}
		@Override public int getRuleIndex() { return RULE_functionDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterFunctionDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitFunctionDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitFunctionDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefsContext functionDefs(String funcName) throws RecognitionException {
		FunctionDefsContext _localctx = new FunctionDefsContext(_ctx, getState(), funcName);
		enterRule(_localctx, 4, RULE_functionDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(57);
				((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(58);
					match(T__4);
					setState(59);
					((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(67);
			match(T__5);
			setState(68);
			match(T__6);
			setState(69);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(LarkFileParser.IDENTIFIER, 0); }
		public List<FunctionDefsContext> functionDefs() {
			return getRuleContexts(FunctionDefsContext.class);
		}
		public FunctionDefsContext functionDefs(int i) {
			return getRuleContext(FunctionDefsContext.class,i);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			((FunctionDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(73);
			match(T__8);
			setState(74);
			match(T__6);
			setState(75);
			match(T__1);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				functionDefs((((FunctionDefContext)_localctx).IDENTIFIER!=null?((FunctionDefContext)_localctx).IDENTIFIER.getText():null));
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(81);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParamsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterActualParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitActualParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitActualParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			expr(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(84);
				match(T__4);
				setState(85);
				expr(0);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends TermContext {
		public TerminalNode INTEGER() { return getToken(LarkFileParser.INTEGER, 0); }
		public IntegerContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UndefinedContext extends TermContext {
		public TerminalNode UNDEFINED() { return getToken(LarkFileParser.UNDEFINED, 0); }
		public UndefinedContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterUndefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitUndefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitUndefined(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends TermContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends TermContext {
		public TerminalNode IDENTIFIER() { return getToken(LarkFileParser.IDENTIFIER, 0); }
		public VariableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends TermContext {
		public TerminalNode DECIMAL() { return getToken(LarkFileParser.DECIMAL, 0); }
		public DecimalContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharacterContext extends TermContext {
		public TerminalNode CHARACTER() { return getToken(LarkFileParser.CHARACTER, 0); }
		public CharacterContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends TermContext {
		public MapEntriesContext mapEntries() {
			return getRuleContext(MapEntriesContext.class,0);
		}
		public DictExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends TermContext {
		public TerminalNode STRING() { return getToken(LarkFileParser.STRING, 0); }
		public StringContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends TermContext {
		public TerminalNode IDENTIFIER() { return getToken(LarkFileParser.IDENTIFIER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCallContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends TermContext {
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public ListExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends TermContext {
		public TerminalNode BOOLEAN() { return getToken(LarkFileParser.BOOLEAN, 0); }
		public BooleanContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__3);
				setState(93);
				expr(0);
				setState(94);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(INTEGER);
				}
				break;
			case 4:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(DECIMAL);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new UndefinedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(UNDEFINED);
				}
				break;
			case 7:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(BOOLEAN);
				}
				break;
			case 8:
				_localctx = new CharacterContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				match(CHARACTER);
				}
				break;
			case 9:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(T__3);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(104);
					actualParams();
					}
				}

				setState(107);
				match(T__5);
				}
				break;
			case 10:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				match(T__9);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(109);
					actualParams();
					}
				}

				setState(112);
				match(T__10);
				}
				break;
			case 11:
				_localctx = new DictExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				match(T__1);
				setState(114);
				mapEntries();
				setState(115);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapEntriesContext extends ParserRuleContext {
		public List<MapExprContext> mapExpr() {
			return getRuleContexts(MapExprContext.class);
		}
		public MapExprContext mapExpr(int i) {
			return getRuleContext(MapExprContext.class,i);
		}
		public MapEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterMapEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitMapEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitMapEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntriesContext mapEntries() throws RecognitionException {
		MapEntriesContext _localctx = new MapEntriesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mapEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(119);
				mapExpr();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(122);
				match(T__4);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(123);
					mapExpr();
					}
				}

				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapExprContext extends ParserRuleContext {
		public ExprContext key;
		public ExprContext value;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MapExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterMapExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitMapExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitMapExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapExprContext mapExpr() throws RecognitionException {
		MapExprContext _localctx = new MapExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mapExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((MapExprContext)_localctx).key = expr(0);
			setState(132);
			match(T__11);
			setState(133);
			((MapExprContext)_localctx).value = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token id;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LarkFileParser.IDENTIFIER, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(136);
			match(T__6);
			setState(137);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LarkFileParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
			setState(140);
			expr(0);
			setState(141);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAnonDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LarkFileParser.IDENTIFIER, 0); }
		public FunctionAnonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterFunctionAnonDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitFunctionAnonDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitFunctionAnonDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAnonDefContext functionAnonDef() throws RecognitionException {
		FunctionAnonDefContext _localctx = new FunctionAnonDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__7);
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public boolean positive;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((UnaryContext)_localctx).positive =  true;
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(148);
					match(T__12);
					}
					break;
				case T__13:
					{
					setState(149);
					match(T__13);
					((UnaryContext)_localctx).positive =  !_localctx.positive;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExponentContext extends ParserRuleContext {
		public UnaryContext op1;
		public UnaryContext op2;
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((ExponentContext)_localctx).op1 = unary();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(T__14);
					setState(160);
					((ExponentContext)_localctx).op2 = unary();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyContext extends ParserRuleContext {
		public ExponentContext op1;
		public Token op;
		public ExponentContext op2;
		public List<ExponentContext> exponent() {
			return getRuleContexts(ExponentContext.class);
		}
		public ExponentContext exponent(int i) {
			return getRuleContext(ExponentContext.class,i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((MultiplyContext)_localctx).op1 = exponent();
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__15:
						{
						setState(167);
						((MultiplyContext)_localctx).op = match(T__15);
						setState(168);
						((MultiplyContext)_localctx).op2 = exponent();
						}
						break;
					case T__16:
						{
						setState(169);
						((MultiplyContext)_localctx).op = match(T__16);
						setState(170);
						((MultiplyContext)_localctx).op2 = exponent();
						}
						break;
					case T__17:
						{
						setState(171);
						((MultiplyContext)_localctx).op = match(T__17);
						setState(172);
						((MultiplyContext)_localctx).op2 = exponent();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpContext extends ExprContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddOrSubContext extends ExprContext {
		public MultiplyContext op1;
		public Token op;
		public MultiplyContext op2;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public AddOrSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterAddOrSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitAddOrSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitAddOrSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityCheckContext extends ExprContext {
		public ExprContext relop1;
		public Token relop;
		public ExprContext relop2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityCheckContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterEqualityCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitEqualityCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitEqualityCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public ExprContext relop1;
		public Token relop;
		public ExprContext relop2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAnonDefExpContext extends ExprContext {
		public FunctionAnonDefContext functionAnonDef() {
			return getRuleContext(FunctionAnonDefContext.class,0);
		}
		public FunctionAnonDefExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterFunctionAnonDefExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitFunctionAnonDefExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitFunctionAnonDefExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessContext extends ExprContext {
		public ExprContext iterable;
		public ExprContext key;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkFileListener ) ((LarkFileListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkFileVisitor ) return ((LarkFileVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new AddOrSubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				((AddOrSubContext)_localctx).op1 = multiply();
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(184);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
							{
							setState(180);
							((AddOrSubContext)_localctx).op = match(T__12);
							setState(181);
							((AddOrSubContext)_localctx).op2 = multiply();
							}
							break;
						case T__13:
							{
							setState(182);
							((AddOrSubContext)_localctx).op = match(T__13);
							setState(183);
							((AddOrSubContext)_localctx).op2 = multiply();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new AssignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				assign();
				}
				break;
			case 3:
				{
				_localctx = new FunctionAnonDefExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				functionAnonDef();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new AccessContext(new ExprContext(_parentctx, _parentState));
						((AccessContext)_localctx).iterable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						match(T__1);
						setState(195);
						((AccessContext)_localctx).key = expr(0);
						setState(196);
						match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__8:
							{
							setState(199);
							((ComparisonContext)_localctx).relop = match(T__8);
							setState(200);
							((ComparisonContext)_localctx).relop2 = expr(0);
							}
							break;
						case T__18:
							{
							setState(201);
							((ComparisonContext)_localctx).relop = match(T__18);
							setState(202);
							((ComparisonContext)_localctx).relop2 = expr(0);
							}
							break;
						case T__7:
							{
							setState(203);
							((ComparisonContext)_localctx).relop = match(T__7);
							setState(204);
							((ComparisonContext)_localctx).relop2 = expr(0);
							}
							break;
						case T__19:
							{
							setState(205);
							((ComparisonContext)_localctx).relop = match(T__19);
							setState(206);
							((ComparisonContext)_localctx).relop2 = expr(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 3:
						{
						_localctx = new EqualityCheckContext(new ExprContext(_parentctx, _parentState));
						((EqualityCheckContext)_localctx).relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__20:
							{
							setState(210);
							((EqualityCheckContext)_localctx).relop = match(T__20);
							setState(211);
							((EqualityCheckContext)_localctx).relop2 = expr(0);
							}
							break;
						case T__21:
							{
							setState(212);
							((EqualityCheckContext)_localctx).relop = match(T__21);
							setState(213);
							((EqualityCheckContext)_localctx).relop2 = expr(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001"+
		"\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002\f\u0002@\t"+
		"\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003N\b\u0003\u000b\u0003\f\u0003O\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004"+
		"Z\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005j\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006"+
		"\u0003\u0006y\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0005"+
		"\u0006\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0098\b\u000b\n\u000b\f\u000b\u009b"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a2"+
		"\b\f\n\f\f\f\u00a5\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u00ae\b\r\n\r\f\r\u00b1\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b9\b\u000e\n"+
		"\u000e\f\u000e\u00bc\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c0"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d0\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d7\b\u000e\u0005"+
		"\u000e\u00d9\b\u000e\n\u000e\f\u000e\u00dc\t\u000e\u0001\u000e\u0000\u0001"+
		"\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0000\u00f7\u0000$\u0001\u0000\u0000\u0000\u0002"+
		")\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006G\u0001"+
		"\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000"+
		"\fx\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u008f\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018"+
		"\u009e\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000\u0000\u0000\u001c"+
		"\u00bf\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u001c\u000e\u0000\u001f"+
		" \u0005\u0001\u0000\u0000 #\u0001\u0000\u0000\u0000!#\u0003\u0006\u0003"+
		"\u0000\"\u001e\u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000"+
		"\u0001(\u0001\u0001\u0000\u0000\u0000)0\u0005\u0002\u0000\u0000*+\u0003"+
		"\u001c\u000e\u0000+,\u0005\u0001\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-/\u0003\u0006\u0003\u0000.*\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0003"+
		"\u0012\t\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u0005\u0003\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u00008A\u0005\u0004\u0000\u00009>\u0005\u001e\u0000\u0000:;\u0005\u0005"+
		"\u0000\u0000;=\u0005\u001e\u0000\u0000<:\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0006"+
		"\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0002\u0001\u0000F\u0005"+
		"\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u001e\u0000\u0000"+
		"IJ\u0005\t\u0000\u0000JK\u0005\u0007\u0000\u0000KM\u0005\u0002\u0000\u0000"+
		"LN\u0003\u0004\u0002\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0005\u0003\u0000\u0000R\u0007\u0001\u0000\u0000\u0000"+
		"SX\u0003\u001c\u000e\u0000TU\u0005\u0005\u0000\u0000UW\u0003\u001c\u000e"+
		"\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[v\u0005\u001e\u0000\u0000\\]\u0005\u0004\u0000\u0000"+
		"]^\u0003\u001c\u000e\u0000^_\u0005\u0006\u0000\u0000_v\u0001\u0000\u0000"+
		"\u0000`v\u0005\u0017\u0000\u0000av\u0005\u0018\u0000\u0000bv\u0005\u0019"+
		"\u0000\u0000cv\u0005\u001c\u0000\u0000dv\u0005\u001b\u0000\u0000ev\u0005"+
		"\u001a\u0000\u0000fg\u0005\u001e\u0000\u0000gi\u0005\u0004\u0000\u0000"+
		"hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kv\u0005\u0006\u0000\u0000ln\u0005\n\u0000\u0000"+
		"mo\u0003\b\u0004\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pv\u0005\u000b\u0000\u0000qr\u0005\u0002\u0000"+
		"\u0000rs\u0003\f\u0006\u0000st\u0005\u0003\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000u[\u0001\u0000\u0000\u0000u\\\u0001\u0000\u0000\u0000u`\u0001\u0000"+
		"\u0000\u0000ua\u0001\u0000\u0000\u0000ub\u0001\u0000\u0000\u0000uc\u0001"+
		"\u0000\u0000\u0000ud\u0001\u0000\u0000\u0000ue\u0001\u0000\u0000\u0000"+
		"uf\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000"+
		"\u0000v\u000b\u0001\u0000\u0000\u0000wy\u0003\u000e\u0007\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0080\u0001\u0000\u0000"+
		"\u0000z|\u0005\u0005\u0000\u0000{}\u0003\u000e\u0007\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~z\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\r\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0003"+
		"\u001c\u000e\u0000\u0084\u0085\u0005\f\u0000\u0000\u0085\u0086\u0003\u001c"+
		"\u000e\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001e"+
		"\u0000\u0000\u0088\u0089\u0005\u0007\u0000\u0000\u0089\u008a\u0003\u001c"+
		"\u000e\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001d"+
		"\u0000\u0000\u008c\u008d\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u0001"+
		"\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005\b\u0000"+
		"\u0000\u0090\u0091\u0005\u001e\u0000\u0000\u0091\u0092\u0005\t\u0000\u0000"+
		"\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0099\u0006\u000b\uffff\uffff"+
		"\u0000\u0094\u0098\u0005\r\u0000\u0000\u0095\u0096\u0005\u000e\u0000\u0000"+
		"\u0096\u0098\u0006\u000b\uffff\uffff\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003\n\u0005\u0000\u009d\u0017\u0001\u0000\u0000\u0000"+
		"\u009e\u00a3\u0003\u0016\u000b\u0000\u009f\u00a0\u0005\u000f\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0016\u000b\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00af\u0003\u0018\f\u0000\u00a7"+
		"\u00a8\u0005\u0010\u0000\u0000\u00a8\u00ae\u0003\u0018\f\u0000\u00a9\u00aa"+
		"\u0005\u0011\u0000\u0000\u00aa\u00ae\u0003\u0018\f\u0000\u00ab\u00ac\u0005"+
		"\u0012\u0000\u0000\u00ac\u00ae\u0003\u0018\f\u0000\u00ad\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0006\u000e"+
		"\uffff\uffff\u0000\u00b3\u00ba\u0003\u001a\r\u0000\u00b4\u00b5\u0005\r"+
		"\u0000\u0000\u00b5\u00b9\u0003\u001a\r\u0000\u00b6\u00b7\u0005\u000e\u0000"+
		"\u0000\u00b7\u00b9\u0003\u001a\r\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00c0\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0003\u0010\b\u0000\u00be\u00c0\u0003\u0014\n\u0000\u00bf"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00da\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\n\u0006\u0000\u0000\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00c4"+
		"\u0003\u001c\u000e\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00d9"+
		"\u0001\u0000\u0000\u0000\u00c6\u00cf\n\u0004\u0000\u0000\u00c7\u00c8\u0005"+
		"\t\u0000\u0000\u00c8\u00d0\u0003\u001c\u000e\u0000\u00c9\u00ca\u0005\u0013"+
		"\u0000\u0000\u00ca\u00d0\u0003\u001c\u000e\u0000\u00cb\u00cc\u0005\b\u0000"+
		"\u0000\u00cc\u00d0\u0003\u001c\u000e\u0000\u00cd\u00ce\u0005\u0014\u0000"+
		"\u0000\u00ce\u00d0\u0003\u001c\u000e\u0000\u00cf\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d6\n\u0002\u0000\u0000\u00d2\u00d3\u0005\u0015\u0000\u0000"+
		"\u00d3\u00d7\u0003\u001c\u000e\u0000\u00d4\u00d5\u0005\u0016\u0000\u0000"+
		"\u00d5\u00d7\u0003\u001c\u000e\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00c1\u0001\u0000\u0000\u0000\u00d8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u001d\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u001b\"$.04>AOXinux|\u0080\u0097\u0099\u00a3\u00ad\u00af\u00b8\u00ba"+
		"\u00bf\u00cf\u00d6\u00d8\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}