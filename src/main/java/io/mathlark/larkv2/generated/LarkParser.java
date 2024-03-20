// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;
import io.mathlark.larkv2.general.ExpressionComparison;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LarkParser extends Parser {
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
		RULE_evaluator = 4, RULE_actualParams = 5, RULE_term = 6, RULE_mapEntries = 7, 
		RULE_mapExpr = 8, RULE_assign = 9, RULE_returnStmt = 10, RULE_functionAnonDef = 11, 
		RULE_unary = 12, RULE_exponent = 13, RULE_multiply = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"lkFile", "codeBlock", "functionDefs", "functionDef", "evaluator", "actualParams", 
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
	public String getGrammarFileName() { return "Lark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private SymbolScope scope;
	private Map<String, DefinedFunction> definedFunctions;

	public LarkParser(TokenStream input, SymbolScope scope, Map<String, DefinedFunction> definedFunctions) {
	    this(input);
	    this.scope = scope;
	    this.definedFunctions = definedFunctions;
	}

	class MapEntry {
	    private @Getter IExpression key;
	    private @Getter IExpression value;

	    public MapEntry(IExpression key, IExpression value) {
	        this.key = key;
	        this.value = value;
	    }
	}


	public LarkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LkFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LarkParser.EOF, 0); }
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterLkFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitLkFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitLkFile(this);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					expr(0);
					setState(33);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(35);
					functionDef();
					}
					break;
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitCodeBlock(this);
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
			setState(43);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(44);
					expr(0);
					setState(45);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(47);
					functionDef();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(53);
				returnStmt();
				}
			}

			setState(56);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(LarkParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LarkParser.IDENTIFIER, i);
		}
		public FunctionDefsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunctionDefsContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
		}
		@Override public int getRuleIndex() { return RULE_functionDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterFunctionDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitFunctionDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitFunctionDefs(this);
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
			setState(58);
			match(T__3);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(59);
				((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(60);
					match(T__4);
					setState(61);
					((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(69);
			match(T__5);
			setState(70);
			match(T__6);
			setState(71);
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
		public TerminalNode IDENTIFIER() { return getToken(LarkParser.IDENTIFIER, 0); }
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitFunctionDef(this);
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
			setState(73);
			match(T__7);
			setState(74);
			((FunctionDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(75);
			match(T__8);
			setState(76);
			match(T__6);
			setState(77);
			match(T__1);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				functionDefs((((FunctionDefContext)_localctx).IDENTIFIER!=null?((FunctionDefContext)_localctx).IDENTIFIER.getText():null));
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(83);
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
	public static class EvaluatorContext extends ParserRuleContext {
		public IExpression exprObject;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LarkParser.EOF, 0); }
		public EvaluatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterEvaluator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitEvaluator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitEvaluator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluatorContext evaluator() throws RecognitionException {
		EvaluatorContext _localctx = new EvaluatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evaluator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((EvaluatorContext)_localctx).expr = expr(0);
			setState(86);
			match(EOF);
			 ((EvaluatorContext)_localctx).exprObject =  ((EvaluatorContext)_localctx).expr.exprObject; 
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
		public List<IExpression> exprs;
		public ExprContext expr;
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterActualParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitActualParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitActualParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ActualParamsContext)_localctx).exprs =  new ArrayList<>(); 
			setState(90);
			((ActualParamsContext)_localctx).expr = expr(0);
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(92);
				match(T__4);
				setState(93);
				((ActualParamsContext)_localctx).expr = expr(0);
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
				}
				}
				setState(100);
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
		public IExpression exprObject;
		public Token IDENTIFIER;
		public ExprContext expr;
		public Token INTEGER;
		public Token DECIMAL;
		public Token STRING;
		public Token BOOLEAN;
		public Token CHARACTER;
		public ActualParamsContext actualParams;
		public MapEntriesContext mapEntries;
		public TerminalNode IDENTIFIER() { return getToken(LarkParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(LarkParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(LarkParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(LarkParser.STRING, 0); }
		public TerminalNode UNDEFINED() { return getToken(LarkParser.UNDEFINED, 0); }
		public TerminalNode BOOLEAN() { return getToken(LarkParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(LarkParser.CHARACTER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public MapEntriesContext mapEntries() {
			return getRuleContext(MapEntriesContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 
				        if (UniversalFunctionRegistry.isFunc((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null))) {
				            ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null)); 
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  SymbolTables.evaluate((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null)); 
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__3);
				setState(104);
				((TermContext)_localctx).expr = expr(0);
				setState(105);
				match(T__5);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Long.parseLong((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(UNDEFINED);
				 ((TermContext)_localctx).exprObject =  GlobalSymbols.UNDEFINED; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(121);
				match(T__3);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(122);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(125);
				match(T__5);
				 
				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), ((TermContext)_localctx).actualParams.exprs); 
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), List.of());
				        }
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
				match(T__9);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(128);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(131);
				match(T__10);

				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new ListExpression(((TermContext)_localctx).actualParams.exprs);
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new ListExpression(List.of());
				        }
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				match(T__1);
				setState(134);
				((TermContext)_localctx).mapEntries = mapEntries();
				setState(135);
				match(T__2);

				        ((TermContext)_localctx).exprObject =  new DictExpression(((TermContext)_localctx).mapEntries.map);
				    
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
		public Map<IExpression, IExpression> map;
		public MapExprContext mapExpr;
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterMapEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitMapEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitMapEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntriesContext mapEntries() throws RecognitionException {
		MapEntriesContext _localctx = new MapEntriesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mapEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MapEntriesContext)_localctx).map =  new HashMap<>(); 
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(141);
				((MapEntriesContext)_localctx).mapExpr = mapExpr();
				}
			}

			 
			        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
			            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
			        }
			    
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(145);
				match(T__4);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(146);
					((MapEntriesContext)_localctx).mapExpr = mapExpr();
					}
				}


				        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
				            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
				        }
				    
				}
				}
				setState(154);
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
		public MapEntry entry;
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterMapExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitMapExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitMapExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapExprContext mapExpr() throws RecognitionException {
		MapExprContext _localctx = new MapExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mapExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((MapExprContext)_localctx).key = expr(0);
			setState(156);
			match(T__11);
			setState(157);
			((MapExprContext)_localctx).value = expr(0);

			        ((MapExprContext)_localctx).entry =  new MapEntry(((MapExprContext)_localctx).key.exprObject.evaluate(), ((MapExprContext)_localctx).value.exprObject);
			    
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
		public IExpression exprObject;
		public Token id;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LarkParser.IDENTIFIER, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(161);
			match(T__6);
			setState(162);
			((AssignContext)_localctx).expr = expr(0);
			 
			        SymbolTables.addLocal((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null), ((AssignContext)_localctx).expr.exprObject);
			        ((AssignContext)_localctx).exprObject =  ((AssignContext)_localctx).expr.exprObject;
			    
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
		public TerminalNode RETURN() { return getToken(LarkParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(RETURN);
			setState(166);
			expr(0);
			setState(167);
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
		public IExpression exprObject;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(LarkParser.IDENTIFIER, 0); }
		public FunctionAnonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterFunctionAnonDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitFunctionAnonDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitFunctionAnonDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAnonDefContext functionAnonDef() throws RecognitionException {
		FunctionAnonDefContext _localctx = new FunctionAnonDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__7);
			setState(170);
			((FunctionAnonDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(171);
			match(T__8);
			 ((FunctionAnonDefContext)_localctx).exprObject =  SymbolTables.registerAnonFunc((((FunctionAnonDefContext)_localctx).IDENTIFIER!=null?((FunctionAnonDefContext)_localctx).IDENTIFIER.getText():null)); 
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
		public IExpression exprObject;
		public TermContext term;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean positive = true; 
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(175);
					match(T__12);
					}
					break;
				case T__13:
					{
					setState(176);
					match(T__13);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			((UnaryContext)_localctx).term = term();
			 
			            ((UnaryContext)_localctx).exprObject =  ((UnaryContext)_localctx).term.exprObject; 
			            if (!positive) {
			                ((UnaryContext)_localctx).exprObject =  ((UnaryContext)_localctx).term.exprObject.negate();
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
	public static class ExponentContext extends ParserRuleContext {
		public IExpression exprObject;
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(T__14);
					setState(189);
					((ExponentContext)_localctx).op2 = unary();
					 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
					}
					} 
				}
				setState(196);
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
		public IExpression exprObject;
		public ExponentContext op1;
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
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(211);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__15:
						{
						setState(199);
						match(T__15);
						setState(200);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__16:
						{
						setState(203);
						match(T__16);
						setState(204);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__17:
						{
						setState(207);
						match(T__17);
						setState(208);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(215);
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
		public IExpression exprObject;
		public ExprContext iterable;
		public ExprContext relop1;
		public MultiplyContext op1;
		public MultiplyContext op2;
		public AssignContext assign;
		public FunctionAnonDefContext functionAnonDef;
		public ExprContext key;
		public ExprContext relop2;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public FunctionAnonDefContext functionAnonDef() {
			return getRuleContext(FunctionAnonDefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(217);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(227);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
							{
							setState(219);
							match(T__12);
							setState(220);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						case T__13:
							{
							setState(223);
							match(T__13);
							setState(224);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(232);
				((ExprContext)_localctx).assign = assign();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).assign.exprObject; 
				}
				break;
			case 3:
				{
				setState(235);
				((ExprContext)_localctx).functionAnonDef = functionAnonDef();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).functionAnonDef.exprObject; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.iterable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(241);
						match(T__1);
						setState(242);
						((ExprContext)_localctx).key = expr(0);
						setState(243);
						match(T__2);

						                      ((ExprContext)_localctx).exprObject =  new AccessExpression(((ExprContext)_localctx).iterable.exprObject, ((ExprContext)_localctx).key.exprObject);
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(264);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__8:
							{
							setState(248);
							match(T__8);
							setState(249);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gtExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__18:
							{
							setState(252);
							match(T__18);
							setState(253);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gteExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__7:
							{
							setState(256);
							match(T__7);
							setState(257);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.ltExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__19:
							{
							setState(260);
							match(T__19);
							setState(261);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.lteExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(276);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__20:
							{
							setState(268);
							match(T__20);
							setState(269);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.equalsExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__21:
							{
							setState(272);
							match(T__21);
							setState(273);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.notEqualsExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
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
				setState(282);
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
		case 15:
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
		"\u0004\u0001\u001f\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001"+
		"\f\u00014\t\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002"+
		"\n\u0002\f\u0002B\t\u0002\u0003\u0002D\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003P\b\u0003\u000b\u0003\f\u0003Q\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\u0007"+
		"\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007\u009a\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b3\b\f\n\f\f\f"+
		"\u00b6\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00c1\b\r\n\r\f\r\u00c4\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00d4\b\u000e\n\u000e\f\u000e\u00d7\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e4\b\u000f\n"+
		"\u000f\f\u000f\u00e7\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ef\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0109"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0115"+
		"\b\u000f\u0005\u000f\u0117\b\u000f\n\u000f\f\u000f\u011a\t\u000f\u0001"+
		"\u000f\u0000\u0001\u001e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u0134\u0000&\u0001"+
		"\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000"+
		"\u0000\u0006I\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nY\u0001"+
		"\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000"+
		"\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000"+
		"\u0000\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000"+
		"\u0000\u0000\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000"+
		"\u0000\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00ee\u0001\u0000"+
		"\u0000\u0000 !\u0003\u001e\u000f\u0000!\"\u0005\u0001\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#%\u0003\u0006\u0003\u0000$ \u0001\u0000\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000"+
		"+2\u0005\u0002\u0000\u0000,-\u0003\u001e\u000f\u0000-.\u0005\u0001\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/1\u0003\u0006\u0003\u00000,\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000057\u0003\u0014\n\u000065\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u0003\u0000"+
		"\u00009\u0003\u0001\u0000\u0000\u0000:C\u0005\u0004\u0000\u0000;@\u0005"+
		"\u001e\u0000\u0000<=\u0005\u0005\u0000\u0000=?\u0005\u001e\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000C;\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0005\u0007\u0000\u0000"+
		"GH\u0003\u0002\u0001\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\b\u0000"+
		"\u0000JK\u0005\u001e\u0000\u0000KL\u0005\t\u0000\u0000LM\u0005\u0007\u0000"+
		"\u0000MO\u0005\u0002\u0000\u0000NP\u0003\u0004\u0002\u0000ON\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UV\u0003\u001e\u000f\u0000VW\u0005\u0000"+
		"\u0000\u0001WX\u0006\u0004\uffff\uffff\u0000X\t\u0001\u0000\u0000\u0000"+
		"YZ\u0006\u0005\uffff\uffff\u0000Z[\u0003\u001e\u000f\u0000[b\u0006\u0005"+
		"\uffff\uffff\u0000\\]\u0005\u0005\u0000\u0000]^\u0003\u001e\u000f\u0000"+
		"^_\u0006\u0005\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`\\\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000ef\u0005\u001e\u0000\u0000f\u008b\u0006\u0006\uffff\uffff\u0000"+
		"gh\u0005\u0004\u0000\u0000hi\u0003\u001e\u000f\u0000ij\u0005\u0006\u0000"+
		"\u0000jk\u0006\u0006\uffff\uffff\u0000k\u008b\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0017\u0000\u0000m\u008b\u0006\u0006\uffff\uffff\u0000no\u0005"+
		"\u0018\u0000\u0000o\u008b\u0006\u0006\uffff\uffff\u0000pq\u0005\u0019"+
		"\u0000\u0000q\u008b\u0006\u0006\uffff\uffff\u0000rs\u0005\u001c\u0000"+
		"\u0000s\u008b\u0006\u0006\uffff\uffff\u0000tu\u0005\u001b\u0000\u0000"+
		"u\u008b\u0006\u0006\uffff\uffff\u0000vw\u0005\u001a\u0000\u0000w\u008b"+
		"\u0006\u0006\uffff\uffff\u0000xy\u0005\u001e\u0000\u0000y{\u0005\u0004"+
		"\u0000\u0000z|\u0003\n\u0005\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0006\u0000\u0000~\u008b"+
		"\u0006\u0006\uffff\uffff\u0000\u007f\u0081\u0005\n\u0000\u0000\u0080\u0082"+
		"\u0003\n\u0005\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\u000b\u0000\u0000\u0084\u008b\u0006\u0006\uffff\uffff\u0000\u0085\u0086"+
		"\u0005\u0002\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0088"+
		"\u0005\u0003\u0000\u0000\u0088\u0089\u0006\u0006\uffff\uffff\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008ae\u0001\u0000\u0000\u0000\u008ag\u0001"+
		"\u0000\u0000\u0000\u008al\u0001\u0000\u0000\u0000\u008an\u0001\u0000\u0000"+
		"\u0000\u008ap\u0001\u0000\u0000\u0000\u008ar\u0001\u0000\u0000\u0000\u008a"+
		"t\u0001\u0000\u0000\u0000\u008av\u0001\u0000\u0000\u0000\u008ax\u0001"+
		"\u0000\u0000\u0000\u008a\u007f\u0001\u0000\u0000\u0000\u008a\u0085\u0001"+
		"\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008e\u0006\u0007"+
		"\uffff\uffff\u0000\u008d\u008f\u0003\u0010\b\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0098\u0006\u0007\uffff\uffff\u0000\u0091\u0093\u0005"+
		"\u0005\u0000\u0000\u0092\u0094\u0003\u0010\b\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0006\u0007\uffff\uffff\u0000\u0096\u0091\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u000f\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0003"+
		"\u001e\u000f\u0000\u009c\u009d\u0005\f\u0000\u0000\u009d\u009e\u0003\u001e"+
		"\u000f\u0000\u009e\u009f\u0006\b\uffff\uffff\u0000\u009f\u0011\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a2\u0005\u0007"+
		"\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a4\u0006\t\uffff"+
		"\uffff\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001d"+
		"\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005\u0001"+
		"\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\b\u0000"+
		"\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000"+
		"\u00ac\u00ad\u0006\u000b\uffff\uffff\u0000\u00ad\u0017\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b4\u0006\f\uffff\uffff\u0000\u00af\u00b3\u0005\r\u0000"+
		"\u0000\u00b0\u00b1\u0005\u000e\u0000\u0000\u00b1\u00b3\u0006\f\uffff\uffff"+
		"\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0000"+
		"\u00b8\u00b9\u0006\f\uffff\uffff\u0000\u00b9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0018\f\u0000\u00bb\u00c2\u0006\r\uffff\uffff\u0000"+
		"\u00bc\u00bd\u0005\u000f\u0000\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be"+
		"\u00bf\u0006\r\uffff\uffff\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u001b\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0003\u001a\r\u0000\u00c6\u00d5\u0006\u000e\uffff\uffff\u0000\u00c7"+
		"\u00c8\u0005\u0010\u0000\u0000\u00c8\u00c9\u0003\u001a\r\u0000\u00c9\u00ca"+
		"\u0006\u000e\uffff\uffff\u0000\u00ca\u00d4\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0011\u0000\u0000\u00cc\u00cd\u0003\u001a\r\u0000\u00cd\u00ce"+
		"\u0006\u000e\uffff\uffff\u0000\u00ce\u00d4\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0012\u0000\u0000\u00d0\u00d1\u0003\u001a\r\u0000\u00d1\u00d2"+
		"\u0006\u000e\uffff\uffff\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u001d\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0006\u000f\uffff\uffff\u0000\u00d9\u00da\u0003\u001c\u000e\u0000"+
		"\u00da\u00e5\u0006\u000f\uffff\uffff\u0000\u00db\u00dc\u0005\r\u0000\u0000"+
		"\u00dc\u00dd\u0003\u001c\u000e\u0000\u00dd\u00de\u0006\u000f\uffff\uffff"+
		"\u0000\u00de\u00e4\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u000e\u0000"+
		"\u0000\u00e0\u00e1\u0003\u001c\u000e\u0000\u00e1\u00e2\u0006\u000f\uffff"+
		"\uffff\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00db\u0001\u0000"+
		"\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ef\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0003\u0012\t\u0000\u00e9\u00ea\u0006\u000f\uffff"+
		"\uffff\u0000\u00ea\u00ef\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003\u0016"+
		"\u000b\u0000\u00ec\u00ed\u0006\u000f\uffff\uffff\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00d8\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef\u0118\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\n\u0006\u0000\u0000\u00f1\u00f2\u0005\u0002"+
		"\u0000\u0000\u00f2\u00f3\u0003\u001e\u000f\u0000\u00f3\u00f4\u0005\u0003"+
		"\u0000\u0000\u00f4\u00f5\u0006\u000f\uffff\uffff\u0000\u00f5\u0117\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\n\u0004\u0000\u0000\u00f7\u0108\u0006\u000f"+
		"\uffff\uffff\u0000\u00f8\u00f9\u0005\t\u0000\u0000\u00f9\u00fa\u0003\u001e"+
		"\u000f\u0000\u00fa\u00fb\u0006\u000f\uffff\uffff\u0000\u00fb\u0109\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u0013\u0000\u0000\u00fd\u00fe\u0003"+
		"\u001e\u000f\u0000\u00fe\u00ff\u0006\u000f\uffff\uffff\u0000\u00ff\u0109"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0102\u0003"+
		"\u001e\u000f\u0000\u0102\u0103\u0006\u000f\uffff\uffff\u0000\u0103\u0109"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0014\u0000\u0000\u0105\u0106"+
		"\u0003\u001e\u000f\u0000\u0106\u0107\u0006\u000f\uffff\uffff\u0000\u0107"+
		"\u0109\u0001\u0000\u0000\u0000\u0108\u00f8\u0001\u0000\u0000\u0000\u0108"+
		"\u00fc\u0001\u0000\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108"+
		"\u0104\u0001\u0000\u0000\u0000\u0109\u0117\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\n\u0002\u0000\u0000\u010b\u0114\u0006\u000f\uffff\uffff\u0000\u010c"+
		"\u010d\u0005\u0015\u0000\u0000\u010d\u010e\u0003\u001e\u000f\u0000\u010e"+
		"\u010f\u0006\u000f\uffff\uffff\u0000\u010f\u0115\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005\u0016\u0000\u0000\u0111\u0112\u0003\u001e\u000f\u0000"+
		"\u0112\u0113\u0006\u000f\uffff\uffff\u0000\u0113\u0115\u0001\u0000\u0000"+
		"\u0000\u0114\u010c\u0001\u0000\u0000\u0000\u0114\u0110\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u00f0\u0001\u0000\u0000"+
		"\u0000\u0116\u00f6\u0001\u0000\u0000\u0000\u0116\u010a\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001f\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u001b$&026@CQb{\u0081\u008a"+
		"\u008e\u0093\u0098\u00b2\u00b4\u00c2\u00d3\u00d5\u00e3\u00e5\u00ee\u0108"+
		"\u0114\u0116\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}