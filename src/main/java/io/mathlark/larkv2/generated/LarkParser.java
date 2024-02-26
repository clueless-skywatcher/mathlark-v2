// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

import lombok.Getter;

import io.mathlark.larkv2.expressions.*;
import io.mathlark.larkv2.expressions.math.*;
import io.mathlark.larkv2.symbols.*;


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
		RULE_evaluator = 0, RULE_actualParams = 1, RULE_term = 2, RULE_mapEntries = 3, 
		RULE_mapExpr = 4, RULE_assign = 5, RULE_returnStmt = 6, RULE_functionAnonDef = 7, 
		RULE_unary = 8, RULE_exponent = 9, RULE_multiply = 10, RULE_expr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"evaluator", "actualParams", "term", "mapEntries", "mapExpr", "assign", 
			"returnStmt", "functionAnonDef", "unary", "exponent", "multiply", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "':='", 
			"'return'", "';'", "'<'", "'>'", "'+'", "'-'", "'^'", "'*'", "'/'", "'%'", 
			null, null, null, null, null, "'Undefined'"
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
		enterRule(_localctx, 0, RULE_evaluator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((EvaluatorContext)_localctx).expr = expr();
			setState(25);
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
		enterRule(_localctx, 2, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ActualParamsContext)_localctx).exprs =  new ArrayList<>(); 
			setState(29);
			((ActualParamsContext)_localctx).expr = expr();
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(31);
				match(T__0);
				setState(32);
				((ActualParamsContext)_localctx).expr = expr();
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
				}
				}
				setState(39);
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
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((TermContext)_localctx).exprObject =  SymbolTables.evaluate((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__1);
				setState(43);
				((TermContext)_localctx).expr = expr();
				setState(44);
				match(T__2);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Long.parseLong((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(58);
				match(T__1);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99663956L) != 0)) {
					{
					setState(59);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(62);
				match(T__2);
				 
				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), ((TermContext)_localctx).actualParams.exprs); 
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), List.of());
				        }
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				match(T__3);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99663956L) != 0)) {
					{
					setState(65);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(68);
				match(T__4);

				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new ListExpression(((TermContext)_localctx).actualParams.exprs);
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new ListExpression(List.of());
				        }
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				match(T__5);
				setState(71);
				((TermContext)_localctx).mapEntries = mapEntries();
				setState(72);
				match(T__6);

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
		enterRule(_localctx, 6, RULE_mapEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MapEntriesContext)_localctx).map =  new HashMap<>(); 
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99663956L) != 0)) {
				{
				setState(78);
				((MapEntriesContext)_localctx).mapExpr = mapExpr();
				}
			}

			 
			        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
			            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
			        }
			    
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(82);
				match(T__0);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99663956L) != 0)) {
					{
					setState(83);
					((MapEntriesContext)_localctx).mapExpr = mapExpr();
					}
				}


				        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
				            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
				        }
				    
				}
				}
				setState(91);
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
		enterRule(_localctx, 8, RULE_mapExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((MapExprContext)_localctx).key = expr();
			setState(93);
			match(T__7);
			setState(94);
			((MapExprContext)_localctx).value = expr();

			        ((MapExprContext)_localctx).entry =  new MapEntry(((MapExprContext)_localctx).key.exprObject, ((MapExprContext)_localctx).value.exprObject);
			    
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
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(98);
			match(T__8);
			setState(99);
			((AssignContext)_localctx).expr = expr();
			 
			        SymbolTables.addLocal((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null), ((AssignContext)_localctx).expr.exprObject);
			    
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
		enterRule(_localctx, 12, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			expr();
			setState(104);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__11);
			setState(107);
			match(IDENTIFIER);
			setState(108);
			match(T__12);
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
		enterRule(_localctx, 16, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean positive = true; 
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(111);
					match(T__13);
					}
					break;
				case T__14:
					{
					setState(112);
					match(T__14);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		enterRule(_localctx, 18, RULE_exponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(124);
				match(T__15);
				setState(125);
				((ExponentContext)_localctx).op2 = unary();
				 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
				}
				}
				setState(132);
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
		enterRule(_localctx, 20, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(135);
					match(T__16);
					setState(136);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				case T__17:
					{
					setState(139);
					match(T__17);
					setState(140);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				case T__18:
					{
					setState(143);
					match(T__18);
					setState(144);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(151);
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
	public static class ExprContext extends ParserRuleContext {
		public IExpression exprObject;
		public MultiplyContext op1;
		public MultiplyContext op2;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13 || _la==T__14) {
					{
					setState(162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__13:
						{
						setState(154);
						match(T__13);
						setState(155);
						((ExprContext)_localctx).op2 = multiply();
						 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
						}
						break;
					case T__14:
						{
						setState(158);
						match(T__14);
						setState(159);
						((ExprContext)_localctx).op2 = multiply();
						 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				assign();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"C\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003P\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"U\b\u0003\u0001\u0003\u0005\u0003X\b\u0003\n\u0003\f\u0003[\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\bs\b\b\n\b\f\bv\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0081\b\t\n"+
		"\t\f\t\u0084\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0094"+
		"\b\n\n\n\f\n\u0097\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a3\b\u000b\n\u000b\f\u000b\u00a6\t\u000b\u0001\u000b\u0003"+
		"\u000b\u00a9\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u00b6\u0000\u0018\u0001"+
		"\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004K\u0001\u0000"+
		"\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000"+
		"\na\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000ej\u0001\u0000"+
		"\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000"+
		"\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0003\u0016\u000b\u0000\u0019\u001a\u0005\u0000\u0000\u0001"+
		"\u001a\u001b\u0006\u0000\uffff\uffff\u0000\u001b\u0001\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0006\u0001\uffff\uffff\u0000\u001d\u001e\u0003\u0016"+
		"\u000b\u0000\u001e%\u0006\u0001\uffff\uffff\u0000\u001f \u0005\u0001\u0000"+
		"\u0000 !\u0003\u0016\u000b\u0000!\"\u0006\u0001\uffff\uffff\u0000\"$\u0001"+
		"\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0003\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u001a\u0000\u0000"+
		")L\u0006\u0002\uffff\uffff\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0016"+
		"\u000b\u0000,-\u0005\u0003\u0000\u0000-.\u0006\u0002\uffff\uffff\u0000"+
		".L\u0001\u0000\u0000\u0000/0\u0005\u0014\u0000\u00000L\u0006\u0002\uffff"+
		"\uffff\u000012\u0005\u0015\u0000\u00002L\u0006\u0002\uffff\uffff\u0000"+
		"34\u0005\u0016\u0000\u00004L\u0006\u0002\uffff\uffff\u000056\u0005\u0018"+
		"\u0000\u00006L\u0006\u0002\uffff\uffff\u000078\u0005\u0017\u0000\u0000"+
		"8L\u0006\u0002\uffff\uffff\u00009:\u0005\u001a\u0000\u0000:<\u0005\u0002"+
		"\u0000\u0000;=\u0003\u0002\u0001\u0000<;\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000"+
		"?L\u0006\u0002\uffff\uffff\u0000@B\u0005\u0004\u0000\u0000AC\u0003\u0002"+
		"\u0001\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0005\u0000\u0000EL\u0006\u0002\uffff\uffff"+
		"\u0000FG\u0005\u0006\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005\u0007"+
		"\u0000\u0000IJ\u0006\u0002\uffff\uffff\u0000JL\u0001\u0000\u0000\u0000"+
		"K(\u0001\u0000\u0000\u0000K*\u0001\u0000\u0000\u0000K/\u0001\u0000\u0000"+
		"\u0000K1\u0001\u0000\u0000\u0000K3\u0001\u0000\u0000\u0000K5\u0001\u0000"+
		"\u0000\u0000K7\u0001\u0000\u0000\u0000K9\u0001\u0000\u0000\u0000K@\u0001"+
		"\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000"+
		"\u0000MO\u0006\u0003\uffff\uffff\u0000NP\u0003\b\u0004\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QY\u0006"+
		"\u0003\uffff\uffff\u0000RT\u0005\u0001\u0000\u0000SU\u0003\b\u0004\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0006\u0003\uffff\uffff\u0000WR\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u0007\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003\u0016"+
		"\u000b\u0000]^\u0005\b\u0000\u0000^_\u0003\u0016\u000b\u0000_`\u0006\u0004"+
		"\uffff\uffff\u0000`\t\u0001\u0000\u0000\u0000ab\u0005\u001a\u0000\u0000"+
		"bc\u0005\t\u0000\u0000cd\u0003\u0016\u000b\u0000de\u0006\u0005\uffff\uffff"+
		"\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000gh\u0003\u0016"+
		"\u000b\u0000hi\u0005\u000b\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0005"+
		"\f\u0000\u0000kl\u0005\u001a\u0000\u0000lm\u0005\r\u0000\u0000m\u000f"+
		"\u0001\u0000\u0000\u0000nt\u0006\b\uffff\uffff\u0000os\u0005\u000e\u0000"+
		"\u0000pq\u0005\u000f\u0000\u0000qs\u0006\b\uffff\uffff\u0000ro\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0003\u0004\u0002\u0000xy\u0006\b\uffff\uffff"+
		"\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0003\u0010\b\u0000{\u0082\u0006"+
		"\t\uffff\uffff\u0000|}\u0005\u0010\u0000\u0000}~\u0003\u0010\b\u0000~"+
		"\u007f\u0006\t\uffff\uffff\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"|\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0013"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u0012\t\u0000\u0086\u0095\u0006\n\uffff\uffff\u0000\u0087\u0088"+
		"\u0005\u0011\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a\u0006"+
		"\n\uffff\uffff\u0000\u008a\u0094\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u0012\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e\u0006\n"+
		"\uffff\uffff\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u0013\u0000\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0006\n"+
		"\uffff\uffff\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0087\u0001"+
		"\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u008f\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0015\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0003"+
		"\u0014\n\u0000\u0099\u00a4\u0006\u000b\uffff\uffff\u0000\u009a\u009b\u0005"+
		"\u000e\u0000\u0000\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0006\u000b"+
		"\uffff\uffff\u0000\u009d\u00a3\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"\u000f\u0000\u0000\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0006\u000b"+
		"\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009a\u0001"+
		"\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0003\n\u0005\u0000\u00a8\u0098\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u0017\u0001\u0000"+
		"\u0000\u0000\u000f%<BKOTYrt\u0082\u0093\u0095\u00a2\u00a4\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}