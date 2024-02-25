// Generated from Lark.g4 by ANTLR 4.13.1
package io.mathlark.larkv2.generated;

import java.util.*;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INTEGER=17, 
		DECIMAL=18, STRING=19, CHARACTER=20, BOOLEAN=21, IDENTIFIER=22, WS=23;
	public static final int
		RULE_evaluator = 0, RULE_actualParams = 1, RULE_term = 2, RULE_assign = 3, 
		RULE_returnStmt = 4, RULE_functionAnonDef = 5, RULE_unary = 6, RULE_exponent = 7, 
		RULE_multiply = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"evaluator", "actualParams", "term", "assign", "returnStmt", "functionAnonDef", 
			"unary", "exponent", "multiply", "expr"
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

	@Override
	public String getGrammarFileName() { return "Lark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

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
			setState(20);
			((EvaluatorContext)_localctx).expr = expr();
			setState(21);
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
			setState(25);
			((ActualParamsContext)_localctx).expr = expr();
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(27);
				match(T__0);
				setState(28);
				((ActualParamsContext)_localctx).expr = expr();
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
				}
				}
				setState(35);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((TermContext)_localctx).exprObject =  SymbolTables.evaluate((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__1);
				setState(39);
				((TermContext)_localctx).expr = expr();
				setState(40);
				match(T__2);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Integer.parseInt((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(54);
				match(T__1);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8263700L) != 0)) {
					{
					setState(55);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(58);
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
				setState(60);
				match(T__3);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8263700L) != 0)) {
					{
					setState(61);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(64);
				match(T__4);

				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new ListExpression(((TermContext)_localctx).actualParams.exprs);
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new ListExpression(List.of());
				        }
				    
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
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(69);
			match(T__5);
			setState(70);
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
		enterRule(_localctx, 8, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(74);
			expr();
			setState(75);
			match(T__7);
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
		enterRule(_localctx, 10, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__8);
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(T__9);
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
		enterRule(_localctx, 12, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean positive = true; 
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(82);
					match(T__10);
					}
					break;
				case T__11:
					{
					setState(83);
					match(T__11);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		enterRule(_localctx, 14, RULE_exponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(95);
				match(T__12);
				setState(96);
				((ExponentContext)_localctx).op2 = unary();
				 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
				}
				}
				setState(103);
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
		enterRule(_localctx, 16, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(106);
					match(T__13);
					setState(107);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				case T__14:
					{
					setState(110);
					match(T__14);
					setState(111);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				case T__15:
					{
					setState(114);
					match(T__15);
					setState(115);
					((MultiplyContext)_localctx).op2 = exponent();
					 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
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
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10 || _la==T__11) {
					{
					setState(133);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(125);
						match(T__10);
						setState(126);
						((ExprContext)_localctx).op2 = multiply();
						 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
						}
						break;
					case T__11:
						{
						setState(129);
						match(T__11);
						setState(130);
						((ExprContext)_localctx).op2 = multiply();
						 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
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
		"\u0004\u0001\u0017\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006V\b\u0006\n\u0006\f\u0006Y\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bw\b\b\n\b\f\bz\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0086\b\t\n\t\f\t\u0089\t\t\u0001\t\u0003\t\u008c\b\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u0097"+
		"\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000"+
		"\u0004B\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bI\u0001"+
		"\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000"+
		"\u000e]\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012\u008b"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0012\t\u0000\u0015\u0016\u0005"+
		"\u0000\u0000\u0001\u0016\u0017\u0006\u0000\uffff\uffff\u0000\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019"+
		"\u001a\u0003\u0012\t\u0000\u001a!\u0006\u0001\uffff\uffff\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0012\t\u0000\u001d\u001e"+
		"\u0006\u0001\uffff\uffff\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001b"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005\u0016\u0000\u0000%C\u0006\u0002\uffff"+
		"\uffff\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\u0012\t\u0000()\u0005"+
		"\u0003\u0000\u0000)*\u0006\u0002\uffff\uffff\u0000*C\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0011\u0000\u0000,C\u0006\u0002\uffff\uffff\u0000-.\u0005"+
		"\u0012\u0000\u0000.C\u0006\u0002\uffff\uffff\u0000/0\u0005\u0013\u0000"+
		"\u00000C\u0006\u0002\uffff\uffff\u000012\u0005\u0015\u0000\u00002C\u0006"+
		"\u0002\uffff\uffff\u000034\u0005\u0014\u0000\u00004C\u0006\u0002\uffff"+
		"\uffff\u000056\u0005\u0016\u0000\u000068\u0005\u0002\u0000\u000079\u0003"+
		"\u0002\u0001\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0005\u0003\u0000\u0000;C\u0006\u0002\uffff"+
		"\uffff\u0000<>\u0005\u0004\u0000\u0000=?\u0003\u0002\u0001\u0000>=\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0005\u0000\u0000AC\u0006\u0002\uffff\uffff\u0000B$\u0001\u0000"+
		"\u0000\u0000B&\u0001\u0000\u0000\u0000B+\u0001\u0000\u0000\u0000B-\u0001"+
		"\u0000\u0000\u0000B/\u0001\u0000\u0000\u0000B1\u0001\u0000\u0000\u0000"+
		"B3\u0001\u0000\u0000\u0000B5\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0016\u0000\u0000EF\u0005"+
		"\u0006\u0000\u0000FG\u0003\u0012\t\u0000GH\u0006\u0003\uffff\uffff\u0000"+
		"H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0003\u0012"+
		"\t\u0000KL\u0005\b\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\t\u0000"+
		"\u0000NO\u0005\u0016\u0000\u0000OP\u0005\n\u0000\u0000P\u000b\u0001\u0000"+
		"\u0000\u0000QW\u0006\u0006\uffff\uffff\u0000RV\u0005\u000b\u0000\u0000"+
		"ST\u0005\f\u0000\u0000TV\u0006\u0006\uffff\uffff\u0000UR\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000[\\\u0006\u0006\uffff\uffff"+
		"\u0000\\\r\u0001\u0000\u0000\u0000]^\u0003\f\u0006\u0000^e\u0006\u0007"+
		"\uffff\uffff\u0000_`\u0005\r\u0000\u0000`a\u0003\f\u0006\u0000ab\u0006"+
		"\u0007\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f\u000f\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0003\u000e\u0007\u0000ix\u0006\b\uffff\uffff\u0000jk\u0005\u000e\u0000"+
		"\u0000kl\u0003\u000e\u0007\u0000lm\u0006\b\uffff\uffff\u0000mw\u0001\u0000"+
		"\u0000\u0000no\u0005\u000f\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0006"+
		"\b\uffff\uffff\u0000qw\u0001\u0000\u0000\u0000rs\u0005\u0010\u0000\u0000"+
		"st\u0003\u000e\u0007\u0000tu\u0006\b\uffff\uffff\u0000uw\u0001\u0000\u0000"+
		"\u0000vj\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vr\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y\u0011\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0003\u0010\b\u0000|\u0087\u0006\t\uffff\uffff\u0000}~\u0005"+
		"\u000b\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080\u0006\t\uffff"+
		"\uffff\u0000\u0080\u0086\u0001\u0000\u0000\u0000\u0081\u0082\u0005\f\u0000"+
		"\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0006\t\uffff\uffff"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000"+
		"\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008c\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0003\u0006\u0003\u0000\u008b{\u0001\u0000\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\f!"+
		"8>BUWevx\u0085\u0087\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}