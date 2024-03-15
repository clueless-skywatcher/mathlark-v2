// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;
import io.mathlark.larkv2.UniversalFunctionRegistry;


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
		T__17=18, T__18=19, INTEGER=20, DECIMAL=21, STRING=22, CHARACTER=23, BOOLEAN=24, 
		UNDEFINED=25, IDENTIFIER=26, WS=27;
	public static final int
		RULE_lkFile = 0, RULE_evaluator = 1, RULE_actualParams = 2, RULE_term = 3, 
		RULE_mapEntries = 4, RULE_mapExpr = 5, RULE_assign = 6, RULE_returnStmt = 7, 
		RULE_functionAnonDef = 8, RULE_unary = 9, RULE_exponent = 10, RULE_multiply = 11, 
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"lkFile", "evaluator", "actualParams", "term", "mapEntries", "mapExpr", 
			"assign", "returnStmt", "functionAnonDef", "unary", "exponent", "multiply", 
			"expr"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133222568L) != 0)) {
				{
				{
				setState(26);
				expr(0);
				setState(27);
				match(T__0);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		enterRule(_localctx, 2, RULE_evaluator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((EvaluatorContext)_localctx).expr = expr(0);
			setState(37);
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
		enterRule(_localctx, 4, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ActualParamsContext)_localctx).exprs =  new ArrayList<>(); 
			setState(41);
			((ActualParamsContext)_localctx).expr = expr(0);
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(43);
				match(T__1);
				setState(44);
				((ActualParamsContext)_localctx).expr = expr(0);
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
				}
				}
				setState(51);
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
		enterRule(_localctx, 6, RULE_term);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
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
				setState(54);
				match(T__2);
				setState(55);
				((TermContext)_localctx).expr = expr(0);
				setState(56);
				match(T__3);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Long.parseLong((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(UNDEFINED);
				 ((TermContext)_localctx).exprObject =  GlobalSymbols.UNDEFINED; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(72);
				match(T__2);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133222568L) != 0)) {
					{
					setState(73);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(76);
				match(T__3);
				 
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
				setState(78);
				match(T__4);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133222568L) != 0)) {
					{
					setState(79);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(82);
				match(T__5);

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
				setState(84);
				match(T__6);
				setState(85);
				((TermContext)_localctx).mapEntries = mapEntries();
				setState(86);
				match(T__7);

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
		enterRule(_localctx, 8, RULE_mapEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MapEntriesContext)_localctx).map =  new HashMap<>(); 
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133222568L) != 0)) {
				{
				setState(92);
				((MapEntriesContext)_localctx).mapExpr = mapExpr();
				}
			}

			 
			        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
			            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
			        }
			    
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(96);
				match(T__1);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133222568L) != 0)) {
					{
					setState(97);
					((MapEntriesContext)_localctx).mapExpr = mapExpr();
					}
				}


				        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
				            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
				        }
				    
				}
				}
				setState(105);
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
		enterRule(_localctx, 10, RULE_mapExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((MapExprContext)_localctx).key = expr(0);
			setState(107);
			match(T__8);
			setState(108);
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
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(112);
			match(T__9);
			setState(113);
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
		enterRule(_localctx, 14, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__10);
			setState(117);
			expr(0);
			setState(118);
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
		enterRule(_localctx, 16, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			((FunctionAnonDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(122);
			match(T__12);
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
		enterRule(_localctx, 18, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean positive = true; 
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(126);
					match(T__13);
					}
					break;
				case T__14:
					{
					setState(127);
					match(T__14);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		enterRule(_localctx, 20, RULE_exponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(T__15);
					setState(140);
					((ExponentContext)_localctx).op2 = unary();
					 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 22, RULE_multiply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(150);
						match(T__16);
						setState(151);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__17:
						{
						setState(154);
						match(T__17);
						setState(155);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__18:
						{
						setState(158);
						match(T__18);
						setState(159);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public MultiplyContext op1;
		public MultiplyContext op2;
		public AssignContext assign;
		public FunctionAnonDefContext functionAnonDef;
		public ExprContext key;
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(168);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(178);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__13:
							{
							setState(170);
							match(T__13);
							setState(171);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						case T__14:
							{
							setState(174);
							match(T__14);
							setState(175);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(183);
				((ExprContext)_localctx).assign = assign();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).assign.exprObject; 
				}
				break;
			case 3:
				{
				setState(186);
				((ExprContext)_localctx).functionAnonDef = functionAnonDef();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).functionAnonDef.exprObject; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.iterable = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					match(T__6);
					setState(193);
					((ExprContext)_localctx).key = expr(0);
					setState(194);
					match(T__7);

					                      ((ExprContext)_localctx).exprObject =  new AccessExpression(((ExprContext)_localctx).iterable.exprObject, ((ExprContext)_localctx).key.exprObject);
					                  
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e"+
		"\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00020\b\u0002"+
		"\n\u0002\f\u00023\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003K\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003Q\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004c\b\u0004\u0001\u0004\u0005\u0004f\b\u0004\n\u0004\f\u0004"+
		"i\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0082\b\t\n\t\f\t\u0085\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00a3\b\u000b\n\u000b\f\u000b\u00a6\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b3"+
		"\b\f\n\f\f\f\u00b6\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00be\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00c6\b\f\n\f\f\f\u00c9\t\f\u0001\f\u0000\u0001\u0018\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u00d9"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"(\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b[\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000e"+
		"t\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012}\u0001"+
		"\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0094\u0001"+
		"\u0000\u0000\u0000\u0018\u00bd\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0018\f\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001e\u0001\u0000"+
		"\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000"+
		"\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0003\u0018\f\u0000%&\u0005"+
		"\u0000\u0000\u0001&\'\u0006\u0001\uffff\uffff\u0000\'\u0003\u0001\u0000"+
		"\u0000\u0000()\u0006\u0002\uffff\uffff\u0000)*\u0003\u0018\f\u0000*1\u0006"+
		"\u0002\uffff\uffff\u0000+,\u0005\u0002\u0000\u0000,-\u0003\u0018\f\u0000"+
		"-.\u0006\u0002\uffff\uffff\u0000.0\u0001\u0000\u0000\u0000/+\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000045\u0005\u001a\u0000\u00005Z\u0006\u0003\uffff\uffff\u000067\u0005"+
		"\u0003\u0000\u000078\u0003\u0018\f\u000089\u0005\u0004\u0000\u00009:\u0006"+
		"\u0003\uffff\uffff\u0000:Z\u0001\u0000\u0000\u0000;<\u0005\u0014\u0000"+
		"\u0000<Z\u0006\u0003\uffff\uffff\u0000=>\u0005\u0015\u0000\u0000>Z\u0006"+
		"\u0003\uffff\uffff\u0000?@\u0005\u0016\u0000\u0000@Z\u0006\u0003\uffff"+
		"\uffff\u0000AB\u0005\u0019\u0000\u0000BZ\u0006\u0003\uffff\uffff\u0000"+
		"CD\u0005\u0018\u0000\u0000DZ\u0006\u0003\uffff\uffff\u0000EF\u0005\u0017"+
		"\u0000\u0000FZ\u0006\u0003\uffff\uffff\u0000GH\u0005\u001a\u0000\u0000"+
		"HJ\u0005\u0003\u0000\u0000IK\u0003\u0004\u0002\u0000JI\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0004"+
		"\u0000\u0000MZ\u0006\u0003\uffff\uffff\u0000NP\u0005\u0005\u0000\u0000"+
		"OQ\u0003\u0004\u0002\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000SZ\u0006\u0003"+
		"\uffff\uffff\u0000TU\u0005\u0007\u0000\u0000UV\u0003\b\u0004\u0000VW\u0005"+
		"\b\u0000\u0000WX\u0006\u0003\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000"+
		"Y4\u0001\u0000\u0000\u0000Y6\u0001\u0000\u0000\u0000Y;\u0001\u0000\u0000"+
		"\u0000Y=\u0001\u0000\u0000\u0000Y?\u0001\u0000\u0000\u0000YA\u0001\u0000"+
		"\u0000\u0000YC\u0001\u0000\u0000\u0000YE\u0001\u0000\u0000\u0000YG\u0001"+
		"\u0000\u0000\u0000YN\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000"+
		"Z\u0007\u0001\u0000\u0000\u0000[]\u0006\u0004\uffff\uffff\u0000\\^\u0003"+
		"\n\u0005\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_"+
		"\u0001\u0000\u0000\u0000_g\u0006\u0004\uffff\uffff\u0000`b\u0005\u0002"+
		"\u0000\u0000ac\u0003\n\u0005\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0006\u0004\uffff\uffff\u0000"+
		"e`\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0003\u0018\f\u0000kl\u0005\t\u0000\u0000lm\u0003\u0018"+
		"\f\u0000mn\u0006\u0005\uffff\uffff\u0000n\u000b\u0001\u0000\u0000\u0000"+
		"op\u0005\u001a\u0000\u0000pq\u0005\n\u0000\u0000qr\u0003\u0018\f\u0000"+
		"rs\u0006\u0006\uffff\uffff\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\u000b"+
		"\u0000\u0000uv\u0003\u0018\f\u0000vw\u0005\u0001\u0000\u0000w\u000f\u0001"+
		"\u0000\u0000\u0000xy\u0005\f\u0000\u0000yz\u0005\u001a\u0000\u0000z{\u0005"+
		"\r\u0000\u0000{|\u0006\b\uffff\uffff\u0000|\u0011\u0001\u0000\u0000\u0000"+
		"}\u0083\u0006\t\uffff\uffff\u0000~\u0082\u0005\u000e\u0000\u0000\u007f"+
		"\u0080\u0005\u000f\u0000\u0000\u0080\u0082\u0006\t\uffff\uffff\u0000\u0081"+
		"~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u0088"+
		"\u0006\t\uffff\uffff\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u0012\t\u0000\u008a\u0091\u0006\n\uffff\uffff\u0000\u008b\u008c"+
		"\u0005\u0010\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e\u0006"+
		"\n\uffff\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008b\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0015\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0003"+
		"\u0014\n\u0000\u0095\u00a4\u0006\u000b\uffff\uffff\u0000\u0096\u0097\u0005"+
		"\u0011\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099\u0006\u000b"+
		"\uffff\uffff\u0000\u0099\u00a3\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0012\u0000\u0000\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0006\u000b"+
		"\uffff\uffff\u0000\u009d\u00a3\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"\u0013\u0000\u0000\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0006\u000b"+
		"\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0096\u0001"+
		"\u0000\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0017\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006"+
		"\f\uffff\uffff\u0000\u00a8\u00a9\u0003\u0016\u000b\u0000\u00a9\u00b4\u0006"+
		"\f\uffff\uffff\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00ac\u0003"+
		"\u0016\u000b\u0000\u00ac\u00ad\u0006\f\uffff\uffff\u0000\u00ad\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\u000f\u0000\u0000\u00af\u00b0\u0003"+
		"\u0016\u000b\u0000\u00b0\u00b1\u0006\f\uffff\uffff\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00be\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003"+
		"\f\u0006\u0000\u00b8\u00b9\u0006\f\uffff\uffff\u0000\u00b9\u00be\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00bc\u0006\f"+
		"\uffff\uffff\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00a7\u0001"+
		"\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001"+
		"\u0000\u0000\u0000\u00be\u00c7\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0001"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00c2\u0003\u0018"+
		"\f\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u0006\f\uffff\uffff"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u0019\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u0011\u001f1JPY]bg\u0081\u0083"+
		"\u0091\u00a2\u00a4\u00b2\u00b4\u00bd\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}