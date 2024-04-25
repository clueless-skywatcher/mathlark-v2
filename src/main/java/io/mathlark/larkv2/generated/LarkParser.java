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
			"'['", "']'", "':'", "'+'", "'-'", "'^'", "'/'", "'*'", "'%'", "'>='", 
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				{
				setState(32);
				expr(0);
				setState(33);
				match(T__0);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(42);
			match(T__1);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(43);
					expr(0);
					setState(44);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(46);
					functionDef();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(52);
				returnStmt();
				}
			}

			setState(55);
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
			setState(57);
			match(T__3);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(58);
				((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(59);
					match(T__4);
					setState(60);
					((FunctionDefsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((FunctionDefsContext)_localctx).args.add(((FunctionDefsContext)_localctx).IDENTIFIER);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(68);
			match(T__5);
			setState(69);
			match(T__6);
			setState(70);
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
		public FunctionDefsContext functionDefs() {
			return getRuleContext(FunctionDefsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			setState(73);
			((FunctionDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(74);
			match(T__8);
			setState(75);
			match(T__6);
			setState(76);
			match(T__1);
			setState(77);
			functionDefs((((FunctionDefContext)_localctx).IDENTIFIER!=null?((FunctionDefContext)_localctx).IDENTIFIER.getText():null));
			setState(78);
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
			setState(80);
			((EvaluatorContext)_localctx).expr = expr(0);
			setState(81);
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
			setState(85);
			((ActualParamsContext)_localctx).expr = expr(0);
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(87);
				match(T__4);
				setState(88);
				((ActualParamsContext)_localctx).expr = expr(0);
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
				}
				}
				setState(95);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
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
				setState(98);
				match(T__3);
				setState(99);
				((TermContext)_localctx).expr = expr(0);
				setState(100);
				match(T__5);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Long.parseLong((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(UNDEFINED);
				 ((TermContext)_localctx).exprObject =  GlobalSymbols.UNDEFINED; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(116);
				match(T__3);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(117);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(120);
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
				setState(122);
				match(T__9);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
					{
					setState(123);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(126);
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
				setState(128);
				match(T__1);
				setState(129);
				((TermContext)_localctx).mapEntries = mapEntries();
				setState(130);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1602250004L) != 0)) {
				{
				setState(136);
				((MapEntriesContext)_localctx).mapExpr = mapExpr();
				}
			}

			 
			        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
			            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
			        }
			    
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(140);
				match(T__4);
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
				    
				}
				}
				setState(149);
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
			setState(150);
			((MapExprContext)_localctx).key = expr(0);
			setState(151);
			match(T__11);
			setState(152);
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
			setState(155);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(156);
			match(T__6);
			setState(157);
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
			setState(160);
			match(RETURN);
			setState(161);
			expr(0);
			setState(162);
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
			setState(164);
			match(T__7);
			setState(165);
			((FunctionAnonDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(166);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(170);
					match(T__12);
					}
					break;
				case T__13:
					{
					setState(171);
					match(T__13);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
			setState(181);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(T__14);
					setState(184);
					((ExponentContext)_localctx).op2 = unary();
					 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(192);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(206);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__15:
						{
						setState(194);
						match(T__15);
						setState(195);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__16:
						{
						setState(198);
						match(T__16);
						setState(199);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__17:
						{
						setState(202);
						match(T__17);
						setState(203);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(210);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(212);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(222);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
							{
							setState(214);
							match(T__12);
							setState(215);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						case T__13:
							{
							setState(218);
							match(T__13);
							setState(219);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(227);
				((ExprContext)_localctx).assign = assign();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).assign.exprObject; 
				}
				break;
			case 3:
				{
				setState(230);
				((ExprContext)_localctx).functionAnonDef = functionAnonDef();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).functionAnonDef.exprObject; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.iterable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(236);
						match(T__1);
						setState(237);
						((ExprContext)_localctx).key = expr(0);
						setState(238);
						match(T__2);

						                      ((ExprContext)_localctx).exprObject =  new AccessExpression(((ExprContext)_localctx).iterable.exprObject, ((ExprContext)_localctx).key.exprObject);
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(259);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__8:
							{
							setState(243);
							match(T__8);
							setState(244);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gtExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__18:
							{
							setState(247);
							match(T__18);
							setState(248);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gteExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__7:
							{
							setState(251);
							match(T__7);
							setState(252);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.ltExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__19:
							{
							setState(255);
							match(T__19);
							setState(256);
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
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(271);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__20:
							{
							setState(263);
							match(T__20);
							setState(264);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.equalsExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__21:
							{
							setState(267);
							match(T__21);
							setState(268);
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
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		"\u0004\u0001\u001f\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t"+
		"\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002"+
		"\f\u0002A\t\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005_\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006w\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008f\b"+
		"\u0007\u0001\u0007\u0005\u0007\u0092\b\u0007\n\u0007\f\u0007\u0095\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u00ae\b\f\n\f\f\f\u00b1\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bc\b\r\n\r\f\r\u00bf\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00cf\b\u000e\n\u000e\f\u000e\u00d2\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00df"+
		"\b\u000f\n\u000f\f\u000f\u00e2\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ea\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0104\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0110\b\u000f\u0005\u000f\u0112\b\u000f\n\u000f\f\u000f\u0115\t\u000f"+
		"\u0001\u000f\u0000\u0001\u001e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u012d\u0000"+
		"%\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00049\u0001"+
		"\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e"+
		"\u0087\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000\u0000\u0000\u0012"+
		"\u009b\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016"+
		"\u00a4\u0001\u0000\u0000\u0000\u0018\u00a9\u0001\u0000\u0000\u0000\u001a"+
		"\u00b5\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e"+
		"\u00e9\u0001\u0000\u0000\u0000 !\u0003\u001e\u000f\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000"+
		"\u0001)\u0001\u0001\u0000\u0000\u0000*1\u0005\u0002\u0000\u0000+,\u0003"+
		"\u001e\u000f\u0000,-\u0005\u0001\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".0\u0003\u0006\u0003\u0000/+\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0003"+
		"\u0014\n\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0005\u0003\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009B\u0005\u0004\u0000\u0000:?\u0005\u001e\u0000\u0000;<\u0005\u0005"+
		"\u0000\u0000<>\u0005\u001e\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u0006"+
		"\u0000\u0000EF\u0005\u0007\u0000\u0000FG\u0003\u0002\u0001\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HI\u0005\b\u0000\u0000IJ\u0005\u001e\u0000\u0000"+
		"JK\u0005\t\u0000\u0000KL\u0005\u0007\u0000\u0000LM\u0005\u0002\u0000\u0000"+
		"MN\u0003\u0004\u0002\u0000NO\u0005\u0003\u0000\u0000O\u0007\u0001\u0000"+
		"\u0000\u0000PQ\u0003\u001e\u000f\u0000QR\u0005\u0000\u0000\u0001RS\u0006"+
		"\u0004\uffff\uffff\u0000S\t\u0001\u0000\u0000\u0000TU\u0006\u0005\uffff"+
		"\uffff\u0000UV\u0003\u001e\u000f\u0000V]\u0006\u0005\uffff\uffff\u0000"+
		"WX\u0005\u0005\u0000\u0000XY\u0003\u001e\u000f\u0000YZ\u0006\u0005\uffff"+
		"\uffff\u0000Z\\\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u000b\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u001e"+
		"\u0000\u0000a\u0086\u0006\u0006\uffff\uffff\u0000bc\u0005\u0004\u0000"+
		"\u0000cd\u0003\u001e\u000f\u0000de\u0005\u0006\u0000\u0000ef\u0006\u0006"+
		"\uffff\uffff\u0000f\u0086\u0001\u0000\u0000\u0000gh\u0005\u0017\u0000"+
		"\u0000h\u0086\u0006\u0006\uffff\uffff\u0000ij\u0005\u0018\u0000\u0000"+
		"j\u0086\u0006\u0006\uffff\uffff\u0000kl\u0005\u0019\u0000\u0000l\u0086"+
		"\u0006\u0006\uffff\uffff\u0000mn\u0005\u001c\u0000\u0000n\u0086\u0006"+
		"\u0006\uffff\uffff\u0000op\u0005\u001b\u0000\u0000p\u0086\u0006\u0006"+
		"\uffff\uffff\u0000qr\u0005\u001a\u0000\u0000r\u0086\u0006\u0006\uffff"+
		"\uffff\u0000st\u0005\u001e\u0000\u0000tv\u0005\u0004\u0000\u0000uw\u0003"+
		"\n\u0005\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0006\u0000\u0000y\u0086\u0006\u0006\uffff"+
		"\uffff\u0000z|\u0005\n\u0000\u0000{}\u0003\n\u0005\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u000b\u0000\u0000\u007f\u0086\u0006\u0006\uffff\uffff\u0000\u0080"+
		"\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0003\u000e\u0007\u0000\u0082"+
		"\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0006\u0006\uffff\uffff\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085`\u0001\u0000\u0000\u0000\u0085"+
		"b\u0001\u0000\u0000\u0000\u0085g\u0001\u0000\u0000\u0000\u0085i\u0001"+
		"\u0000\u0000\u0000\u0085k\u0001\u0000\u0000\u0000\u0085m\u0001\u0000\u0000"+
		"\u0000\u0085o\u0001\u0000\u0000\u0000\u0085q\u0001\u0000\u0000\u0000\u0085"+
		"s\u0001\u0000\u0000\u0000\u0085z\u0001\u0000\u0000\u0000\u0085\u0080\u0001"+
		"\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087\u0089\u0006\u0007"+
		"\uffff\uffff\u0000\u0088\u008a\u0003\u0010\b\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0093\u0006\u0007\uffff\uffff\u0000\u008c\u008e\u0005"+
		"\u0005\u0000\u0000\u008d\u008f\u0003\u0010\b\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0006\u0007\uffff\uffff\u0000\u0091\u008c\u0001"+
		"\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u000f\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0003"+
		"\u001e\u000f\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0003\u001e"+
		"\u000f\u0000\u0099\u009a\u0006\b\uffff\uffff\u0000\u009a\u0011\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\u001e\u0000\u0000\u009c\u009d\u0005\u0007"+
		"\u0000\u0000\u009d\u009e\u0003\u001e\u000f\u0000\u009e\u009f\u0006\t\uffff"+
		"\uffff\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u001d"+
		"\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005\u0001"+
		"\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\b\u0000"+
		"\u0000\u00a5\u00a6\u0005\u001e\u0000\u0000\u00a6\u00a7\u0005\t\u0000\u0000"+
		"\u00a7\u00a8\u0006\u000b\uffff\uffff\u0000\u00a8\u0017\u0001\u0000\u0000"+
		"\u0000\u00a9\u00af\u0006\f\uffff\uffff\u0000\u00aa\u00ae\u0005\r\u0000"+
		"\u0000\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac\u00ae\u0006\f\uffff\uffff"+
		"\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\f\u0006\u0000"+
		"\u00b3\u00b4\u0006\f\uffff\uffff\u0000\u00b4\u0019\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0003\u0018\f\u0000\u00b6\u00bd\u0006\r\uffff\uffff\u0000"+
		"\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0003\u0018\f\u0000\u00b9"+
		"\u00ba\u0006\r\uffff\uffff\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u001b\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003\u001a\r\u0000\u00c1\u00d0\u0006\u000e\uffff\uffff\u0000\u00c2"+
		"\u00c3\u0005\u0010\u0000\u0000\u00c3\u00c4\u0003\u001a\r\u0000\u00c4\u00c5"+
		"\u0006\u000e\uffff\uffff\u0000\u00c5\u00cf\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0011\u0000\u0000\u00c7\u00c8\u0003\u001a\r\u0000\u00c8\u00c9"+
		"\u0006\u000e\uffff\uffff\u0000\u00c9\u00cf\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0012\u0000\u0000\u00cb\u00cc\u0003\u001a\r\u0000\u00cc\u00cd"+
		"\u0006\u000e\uffff\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c2\u0001\u0000\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u001d\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0006\u000f\uffff\uffff\u0000\u00d4\u00d5\u0003\u001c\u000e\u0000"+
		"\u00d5\u00e0\u0006\u000f\uffff\uffff\u0000\u00d6\u00d7\u0005\r\u0000\u0000"+
		"\u00d7\u00d8\u0003\u001c\u000e\u0000\u00d8\u00d9\u0006\u000f\uffff\uffff"+
		"\u0000\u00d9\u00df\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u000e\u0000"+
		"\u0000\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd\u0006\u000f\uffff"+
		"\uffff\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000"+
		"\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00ea\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00e5\u0006\u000f\uffff"+
		"\uffff\u0000\u00e5\u00ea\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0016"+
		"\u000b\u0000\u00e7\u00e8\u0006\u000f\uffff\uffff\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00d3\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea\u0113\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\n\u0006\u0000\u0000\u00ec\u00ed\u0005\u0002"+
		"\u0000\u0000\u00ed\u00ee\u0003\u001e\u000f\u0000\u00ee\u00ef\u0005\u0003"+
		"\u0000\u0000\u00ef\u00f0\u0006\u000f\uffff\uffff\u0000\u00f0\u0112\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\n\u0004\u0000\u0000\u00f2\u0103\u0006\u000f"+
		"\uffff\uffff\u0000\u00f3\u00f4\u0005\t\u0000\u0000\u00f4\u00f5\u0003\u001e"+
		"\u000f\u0000\u00f5\u00f6\u0006\u000f\uffff\uffff\u0000\u00f6\u0104\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0013\u0000\u0000\u00f8\u00f9\u0003"+
		"\u001e\u000f\u0000\u00f9\u00fa\u0006\u000f\uffff\uffff\u0000\u00fa\u0104"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\b\u0000\u0000\u00fc\u00fd\u0003"+
		"\u001e\u000f\u0000\u00fd\u00fe\u0006\u000f\uffff\uffff\u0000\u00fe\u0104"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0014\u0000\u0000\u0100\u0101"+
		"\u0003\u001e\u000f\u0000\u0101\u0102\u0006\u000f\uffff\uffff\u0000\u0102"+
		"\u0104\u0001\u0000\u0000\u0000\u0103\u00f3\u0001\u0000\u0000\u0000\u0103"+
		"\u00f7\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103"+
		"\u00ff\u0001\u0000\u0000\u0000\u0104\u0112\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\n\u0002\u0000\u0000\u0106\u010f\u0006\u000f\uffff\uffff\u0000\u0107"+
		"\u0108\u0005\u0015\u0000\u0000\u0108\u0109\u0003\u001e\u000f\u0000\u0109"+
		"\u010a\u0006\u000f\uffff\uffff\u0000\u010a\u0110\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0016\u0000\u0000\u010c\u010d\u0003\u001e\u000f\u0000"+
		"\u010d\u010e\u0006\u000f\uffff\uffff\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u00eb\u0001\u0000\u0000"+
		"\u0000\u0111\u00f1\u0001\u0000\u0000\u0000\u0111\u0105\u0001\u0000\u0000"+
		"\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u001f\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0019%/15?B]v|\u0085\u0089"+
		"\u008e\u0093\u00ad\u00af\u00bd\u00ce\u00d0\u00de\u00e0\u00e9\u0103\u010f"+
		"\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}