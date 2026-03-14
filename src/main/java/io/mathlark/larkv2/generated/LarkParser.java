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
		STRING=25, CHARACTER=26, ARROW=27, BOOLEAN=28, UNDEFINED=29, IDENTIFIER=30, 
		WS=31;
	public static final int
		RULE_lkFile = 0, RULE_codeBlock = 1, RULE_typedParam = 2, RULE_functionDefs = 3, 
		RULE_functionDef = 4, RULE_evaluator = 5, RULE_actualParams = 6, RULE_lambdaParams = 7, 
		RULE_lambdaBody = 8, RULE_term = 9, RULE_mapEntries = 10, RULE_mapExpr = 11, 
		RULE_assign = 12, RULE_functionAnonDef = 13, RULE_postfix = 14, RULE_unary = 15, 
		RULE_exponent = 16, RULE_multiply = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"lkFile", "codeBlock", "typedParam", "functionDefs", "functionDef", "evaluator", 
			"actualParams", "lambdaParams", "lambdaBody", "term", "mapEntries", "mapExpr", 
			"assign", "functionAnonDef", "postfix", "unary", "exponent", "multiply", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "':'", "'('", "','", "')'", "':='", "'<'", 
			"'>'", "'['", "']'", "'+'", "'-'", "'^'", "'/'", "'*'", "'%'", "'>='", 
			"'<='", "'=='", "'!='", null, null, null, null, "'->'", null, "'Undefined'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"DECIMAL", "STRING", "CHARACTER", "ARROW", "BOOLEAN", "UNDEFINED", "IDENTIFIER", 
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
				{
				{
				setState(38);
				expr(0);
				setState(39);
				match(T__0);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(48);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(49);
					expr(0);
					setState(50);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(52);
					functionDef();
					}
					break;
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class TypedParamContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public List<TerminalNode> IDENTIFIER() { return getTokens(LarkParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LarkParser.IDENTIFIER, i);
		}
		public TypedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitTypedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitTypedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedParamContext typedParam() throws RecognitionException {
		TypedParamContext _localctx = new TypedParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((TypedParamContext)_localctx).name = match(IDENTIFIER);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(61);
				match(T__3);
				setState(62);
				((TypedParamContext)_localctx).type = match(IDENTIFIER);
				}
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
	public static class FunctionDefsContext extends ParserRuleContext {
		public String funcName;
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public List<TypedParamContext> typedParam() {
			return getRuleContexts(TypedParamContext.class);
		}
		public TypedParamContext typedParam(int i) {
			return getRuleContext(TypedParamContext.class,i);
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
		enterRule(_localctx, 6, RULE_functionDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(66);
				typedParam();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(67);
					match(T__5);
					setState(68);
					typedParam();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(T__6);
			setState(77);
			match(T__7);
			setState(78);
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
		enterRule(_localctx, 8, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__8);
			setState(81);
			((FunctionDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(82);
			match(T__9);
			setState(83);
			match(T__7);
			setState(84);
			match(T__1);
			setState(85);
			functionDefs((((FunctionDefContext)_localctx).IDENTIFIER!=null?((FunctionDefContext)_localctx).IDENTIFIER.getText():null));
			setState(86);
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
		enterRule(_localctx, 10, RULE_evaluator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((EvaluatorContext)_localctx).expr = expr(0);
			setState(89);
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
		enterRule(_localctx, 12, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ActualParamsContext)_localctx).exprs =  new ArrayList<>(); 
			setState(93);
			((ActualParamsContext)_localctx).expr = expr(0);
			 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(95);
				match(T__5);
				setState(96);
				((ActualParamsContext)_localctx).expr = expr(0);
				 _localctx.exprs.add(((ActualParamsContext)_localctx).expr.exprObject); 
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
	public static class LambdaParamsContext extends ParserRuleContext {
		public List<String> names;
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(LarkParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LarkParser.IDENTIFIER, i);
		}
		public LambdaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamsContext lambdaParams() throws RecognitionException {
		LambdaParamsContext _localctx = new LambdaParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((LambdaParamsContext)_localctx).names =  new ArrayList<>(); 
			setState(105);
			((LambdaParamsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 _localctx.names.add((((LambdaParamsContext)_localctx).IDENTIFIER!=null?((LambdaParamsContext)_localctx).IDENTIFIER.getText():null)); 
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(107);
				match(T__5);
				setState(108);
				((LambdaParamsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 _localctx.names.add((((LambdaParamsContext)_localctx).IDENTIFIER!=null?((LambdaParamsContext)_localctx).IDENTIFIER.getText():null)); 
				}
				}
				setState(114);
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
	public static class LambdaBodyContext extends ParserRuleContext {
		public String bodyText;
		public Token t;
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaBody);
		 StringBuilder sb = new StringBuilder(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967282L) != 0)) {
				{
				{
				setState(115);
				((LambdaBodyContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__1 || _la==T__2) ) {
					((LambdaBodyContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 sb.append((((LambdaBodyContext)_localctx).t!=null?((LambdaBodyContext)_localctx).t.getText():null)); 
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((LambdaBodyContext)_localctx).bodyText =  sb.toString().trim(); 
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
		public LambdaParamsContext lambdaParams;
		public LambdaBodyContext lambdaBody;
		public Token IDENTIFIER;
		public ExprContext expr;
		public Token INTEGER;
		public Token DECIMAL;
		public Token STRING;
		public Token BOOLEAN;
		public Token CHARACTER;
		public ActualParamsContext actualParams;
		public MapEntriesContext mapEntries;
		public LambdaParamsContext lambdaParams() {
			return getRuleContext(LambdaParamsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(LarkParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__4);
				setState(125);
				((TermContext)_localctx).lambdaParams = lambdaParams();
				setState(126);
				match(T__6);
				setState(127);
				match(ARROW);
				setState(128);
				match(T__1);
				setState(129);
				((TermContext)_localctx).lambdaBody = lambdaBody();
				setState(130);
				match(T__2);

				        ((TermContext)_localctx).exprObject =  new LambdaExpression(((TermContext)_localctx).lambdaParams.names, ((TermContext)_localctx).lambdaBody.bodyText);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        if (UniversalFunctionRegistry.isFunc((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null))
				            || FunctionTable.hasName((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null))) {
				            ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null));
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  SymbolTables.evaluate((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null));
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__4);
				setState(136);
				((TermContext)_localctx).expr = expr(0);
				setState(137);
				match(T__6);
				 ((TermContext)_localctx).exprObject =  ((TermContext)_localctx).expr.exprObject; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				((TermContext)_localctx).INTEGER = match(INTEGER);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Long.parseLong((((TermContext)_localctx).INTEGER!=null?((TermContext)_localctx).INTEGER.getText():null))); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				((TermContext)_localctx).DECIMAL = match(DECIMAL);
				 ((TermContext)_localctx).exprObject =  new NumericExpression(Double.parseDouble((((TermContext)_localctx).DECIMAL!=null?((TermContext)_localctx).DECIMAL.getText():null))); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				((TermContext)_localctx).STRING = match(STRING);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(UNDEFINED);
				 ((TermContext)_localctx).exprObject =  GlobalSymbols.UNDEFINED; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 
				        String b = (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				        ((TermContext)_localctx).exprObject =  b.equals("True") ? GlobalSymbols.TRUE : GlobalSymbols.FALSE;
				     
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				((TermContext)_localctx).CHARACTER = match(CHARACTER);
				 ((TermContext)_localctx).exprObject =  new StringExpression((((TermContext)_localctx).CHARACTER!=null?((TermContext)_localctx).CHARACTER.getText():null)); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				((TermContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(153);
				match(T__4);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
					{
					setState(154);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(157);
				match(T__6);
				 
				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), ((TermContext)_localctx).actualParams.exprs); 
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new FunctionCallExpression((((TermContext)_localctx).IDENTIFIER!=null?((TermContext)_localctx).IDENTIFIER.getText():null), List.of());
				        }
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(159);
				match(T__10);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
					{
					setState(160);
					((TermContext)_localctx).actualParams = actualParams();
					}
				}

				setState(163);
				match(T__11);

				        if ((((TermContext)_localctx).actualParams!=null?_input.getText(((TermContext)_localctx).actualParams.start,((TermContext)_localctx).actualParams.stop):null) != null) {
				            ((TermContext)_localctx).exprObject =  new ListExpression(((TermContext)_localctx).actualParams.exprs);
				        }
				        else {
				            ((TermContext)_localctx).exprObject =  new ListExpression(List.of());
				        }
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(165);
				match(T__1);
				setState(166);
				((TermContext)_localctx).mapEntries = mapEntries();
				setState(167);
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
		enterRule(_localctx, 20, RULE_mapEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MapEntriesContext)_localctx).map =  new HashMap<>(); 
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
				{
				setState(173);
				((MapEntriesContext)_localctx).mapExpr = mapExpr();
				}
			}

			 
			        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
			            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
			        }
			    
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(177);
				match(T__5);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2004904484L) != 0)) {
					{
					setState(178);
					((MapEntriesContext)_localctx).mapExpr = mapExpr();
					}
				}


				        if ((((MapEntriesContext)_localctx).mapExpr!=null?_input.getText(((MapEntriesContext)_localctx).mapExpr.start,((MapEntriesContext)_localctx).mapExpr.stop):null) != null) {
				            _localctx.map.put(((MapEntriesContext)_localctx).mapExpr.entry.getKey(), ((MapEntriesContext)_localctx).mapExpr.entry.getValue());
				        }
				    
				}
				}
				setState(186);
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
		enterRule(_localctx, 22, RULE_mapExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((MapExprContext)_localctx).key = expr(0);
			setState(188);
			match(T__3);
			setState(189);
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
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((AssignContext)_localctx).id = match(IDENTIFIER);
			setState(193);
			match(T__7);
			setState(194);
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
		enterRule(_localctx, 26, RULE_functionAnonDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__8);
			setState(198);
			((FunctionAnonDefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(199);
			match(T__9);
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
	public static class PostfixContext extends ParserRuleContext {
		public IExpression exprObject;
		public TermContext term;
		public ExprContext key;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LarkListener ) ((LarkListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LarkVisitor ) return ((LarkVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_postfix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((PostfixContext)_localctx).term = term();
			 ((PostfixContext)_localctx).exprObject =  ((PostfixContext)_localctx).term.exprObject; 
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(T__1);
					setState(205);
					((PostfixContext)_localctx).key = expr(0);
					setState(206);
					match(T__2);
					 ((PostfixContext)_localctx).exprObject =  new AccessExpression(_localctx.exprObject, ((PostfixContext)_localctx).key.exprObject); 
					}
					} 
				}
				setState(213);
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
	public static class UnaryContext extends ParserRuleContext {
		public IExpression exprObject;
		public PostfixContext postfix;
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
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
		enterRule(_localctx, 30, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean positive = true; 
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(215);
					match(T__12);
					}
					break;
				case T__13:
					{
					setState(216);
					match(T__13);
					 positive = !positive; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			((UnaryContext)_localctx).postfix = postfix();

			            ((UnaryContext)_localctx).exprObject =  ((UnaryContext)_localctx).postfix.exprObject;
			            if (!positive) {
			                ((UnaryContext)_localctx).exprObject =  ((UnaryContext)_localctx).postfix.exprObject.negate();
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
		enterRule(_localctx, 32, RULE_exponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ExponentContext)_localctx).op1 = unary();
			 ((ExponentContext)_localctx).exprObject =  ((ExponentContext)_localctx).op1.exprObject; 
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(T__14);
					setState(229);
					((ExponentContext)_localctx).op2 = unary();
					 ((ExponentContext)_localctx).exprObject =  _localctx.exprObject.pow(((ExponentContext)_localctx).op2.exprObject); 
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 34, RULE_multiply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((MultiplyContext)_localctx).op1 = exponent();
			 ((MultiplyContext)_localctx).exprObject =  ((MultiplyContext)_localctx).op1.exprObject; 
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(251);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__15:
						{
						setState(239);
						match(T__15);
						setState(240);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.div(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__16:
						{
						setState(243);
						match(T__16);
						setState(244);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mul(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					case T__17:
						{
						setState(247);
						match(T__17);
						setState(248);
						((MultiplyContext)_localctx).op2 = exponent();
						 ((MultiplyContext)_localctx).exprObject =  _localctx.exprObject.mod(((MultiplyContext)_localctx).op2.exprObject); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public ExprContext relop1;
		public MultiplyContext op1;
		public MultiplyContext op2;
		public AssignContext assign;
		public FunctionAnonDefContext functionAnonDef;
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(257);
				((ExprContext)_localctx).op1 = multiply();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).op1.exprObject; 
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(267);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
							{
							setState(259);
							match(T__12);
							setState(260);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.add(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						case T__13:
							{
							setState(263);
							match(T__13);
							setState(264);
							((ExprContext)_localctx).op2 = multiply();
							 ((ExprContext)_localctx).exprObject =  _localctx.exprObject.sub(((ExprContext)_localctx).op2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(272);
				((ExprContext)_localctx).assign = assign();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).assign.exprObject; 
				}
				break;
			case 3:
				{
				setState(275);
				((ExprContext)_localctx).functionAnonDef = functionAnonDef();
				 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).functionAnonDef.exprObject; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(298);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__9:
							{
							setState(282);
							match(T__9);
							setState(283);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gtExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__18:
							{
							setState(286);
							match(T__18);
							setState(287);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.gteExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__8:
							{
							setState(290);
							match(T__8);
							setState(291);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.ltExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__19:
							{
							setState(294);
							match(T__19);
							setState(295);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.lteExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.relop1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						 ((ExprContext)_localctx).exprObject =  ((ExprContext)_localctx).relop1.exprObject; 
						setState(310);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__20:
							{
							setState(302);
							match(T__20);
							setState(303);
							((ExprContext)_localctx).relop2 = expr(0);
							 ((ExprContext)_localctx).exprObject =  ExpressionComparison.equalsExp(((ExprContext)_localctx).relop1.exprObject, ((ExprContext)_localctx).relop2.exprObject); 
							}
							break;
						case T__21:
							{
							setState(306);
							match(T__21);
							setState(307);
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
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0003\u0003K\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006d\b\u0006"+
		"\n\u0006\f\u0006g\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t\u0007"+
		"\u0001\b\u0001\b\u0005\bv\b\b\n\b\f\by\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u009c\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00a2\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ab\b\t\u0001\n\u0001\n\u0003\n\u00af\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00b4\b\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00d2\b\u000e\n\u000e\f\u000e\u00d5\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00db\b\u000f\n\u000f\f\u000f"+
		"\u00de\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e9\b\u0010"+
		"\n\u0010\f\u0010\u00ec\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fc"+
		"\b\u0011\n\u0011\f\u0011\u00ff\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u010c\b\u0012\n\u0012\f\u0012\u010f"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0117\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u012b\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0137\b\u0012\u0005\u0012\u0139"+
		"\b\u0012\n\u0012\f\u0012\u013c\t\u0012\u0001\u0012\u0000\u0001$\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0001\u0001\u0000\u0002\u0003\u0154\u0000+\u0001"+
		"\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000"+
		"\u0000\u0006A\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nX\u0001"+
		"\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000"+
		"\u0000\u0010w\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000"+
		"\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00bb\u0001\u0000\u0000\u0000"+
		"\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000"+
		"\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00d6\u0001\u0000\u0000\u0000"+
		" \u00e2\u0001\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u0116"+
		"\u0001\u0000\u0000\u0000&\'\u0003$\u0012\u0000\'(\u0005\u0001\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001"+
		"\u0001\u0000\u0000\u000007\u0005\u0002\u0000\u000012\u0003$\u0012\u0000"+
		"23\u0005\u0001\u0000\u000036\u0001\u0000\u0000\u000046\u0003\b\u0004\u0000"+
		"51\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0003\u0000\u0000;\u0003"+
		"\u0001\u0000\u0000\u0000<?\u0005\u001e\u0000\u0000=>\u0005\u0004\u0000"+
		"\u0000>@\u0005\u001e\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AJ\u0005\u0005\u0000\u0000"+
		"BG\u0003\u0004\u0002\u0000CD\u0005\u0006\u0000\u0000DF\u0003\u0004\u0002"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0005\b\u0000\u0000"+
		"NO\u0003\u0002\u0001\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0005\t\u0000"+
		"\u0000QR\u0005\u001e\u0000\u0000RS\u0005\n\u0000\u0000ST\u0005\b\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0005\u0003"+
		"\u0000\u0000W\t\u0001\u0000\u0000\u0000XY\u0003$\u0012\u0000YZ\u0005\u0000"+
		"\u0000\u0001Z[\u0006\u0005\uffff\uffff\u0000[\u000b\u0001\u0000\u0000"+
		"\u0000\\]\u0006\u0006\uffff\uffff\u0000]^\u0003$\u0012\u0000^e\u0006\u0006"+
		"\uffff\uffff\u0000_`\u0005\u0006\u0000\u0000`a\u0003$\u0012\u0000ab\u0006"+
		"\u0006\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f\r\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0006"+
		"\u0007\uffff\uffff\u0000ij\u0005\u001e\u0000\u0000jp\u0006\u0007\uffff"+
		"\uffff\u0000kl\u0005\u0006\u0000\u0000lm\u0005\u001e\u0000\u0000mo\u0006"+
		"\u0007\uffff\uffff\u0000nk\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000f\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\b\u0000\u0000\u0000tv\u0006"+
		"\b\uffff\uffff\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0006\b\uffff\uffff\u0000{\u0011\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003\u000e\u0007\u0000"+
		"~\u007f\u0005\u0007\u0000\u0000\u007f\u0080\u0005\u001b\u0000\u0000\u0080"+
		"\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083"+
		"\u0005\u0003\u0000\u0000\u0083\u0084\u0006\t\uffff\uffff\u0000\u0084\u00ab"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001e\u0000\u0000\u0086\u00ab"+
		"\u0006\t\uffff\uffff\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089"+
		"\u0003$\u0012\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008b\u0006"+
		"\t\uffff\uffff\u0000\u008b\u00ab\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0017\u0000\u0000\u008d\u00ab\u0006\t\uffff\uffff\u0000\u008e\u008f\u0005"+
		"\u0018\u0000\u0000\u008f\u00ab\u0006\t\uffff\uffff\u0000\u0090\u0091\u0005"+
		"\u0019\u0000\u0000\u0091\u00ab\u0006\t\uffff\uffff\u0000\u0092\u0093\u0005"+
		"\u001d\u0000\u0000\u0093\u00ab\u0006\t\uffff\uffff\u0000\u0094\u0095\u0005"+
		"\u001c\u0000\u0000\u0095\u00ab\u0006\t\uffff\uffff\u0000\u0096\u0097\u0005"+
		"\u001a\u0000\u0000\u0097\u00ab\u0006\t\uffff\uffff\u0000\u0098\u0099\u0005"+
		"\u001e\u0000\u0000\u0099\u009b\u0005\u0005\u0000\u0000\u009a\u009c\u0003"+
		"\f\u0006\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0007"+
		"\u0000\u0000\u009e\u00ab\u0006\t\uffff\uffff\u0000\u009f\u00a1\u0005\u000b"+
		"\u0000\u0000\u00a0\u00a2\u0003\f\u0006\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00ab\u0006\t\uffff\uffff"+
		"\u0000\u00a5\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0003\u0014\n\u0000"+
		"\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0006\t\uffff\uffff\u0000"+
		"\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa|\u0001\u0000\u0000\u0000\u00aa"+
		"\u0085\u0001\u0000\u0000\u0000\u00aa\u0087\u0001\u0000\u0000\u0000\u00aa"+
		"\u008c\u0001\u0000\u0000\u0000\u00aa\u008e\u0001\u0000\u0000\u0000\u00aa"+
		"\u0090\u0001\u0000\u0000\u0000\u00aa\u0092\u0001\u0000\u0000\u0000\u00aa"+
		"\u0094\u0001\u0000\u0000\u0000\u00aa\u0096\u0001\u0000\u0000\u0000\u00aa"+
		"\u0098\u0001\u0000\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a5\u0001\u0000\u0000\u0000\u00ab\u0013\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0006\n\uffff\uffff\u0000\u00ad\u00af\u0003\u0016\u000b\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b8\u0006\n\uffff\uffff\u0000\u00b1"+
		"\u00b3\u0005\u0006\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0006\n\uffff\uffff\u0000\u00b6"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0003$\u0012\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be"+
		"\u0003$\u0012\u0000\u00be\u00bf\u0006\u000b\uffff\uffff\u0000\u00bf\u0017"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1\u00c2"+
		"\u0005\b\u0000\u0000\u00c2\u00c3\u0003$\u0012\u0000\u00c3\u00c4\u0006"+
		"\f\uffff\uffff\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\t\u0000\u0000\u00c6\u00c7\u0005\u001e\u0000\u0000\u00c7\u00c8\u0005\n"+
		"\u0000\u0000\u00c8\u00c9\u0006\r\uffff\uffff\u0000\u00c9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0003\u0012\t\u0000\u00cb\u00d3\u0006\u000e\uffff"+
		"\uffff\u0000\u00cc\u00cd\u0005\u0002\u0000\u0000\u00cd\u00ce\u0003$\u0012"+
		"\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d0\u0006\u000e\uffff"+
		"\uffff\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u001d\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00dc\u0006\u000f"+
		"\uffff\uffff\u0000\u00d7\u00db\u0005\r\u0000\u0000\u00d8\u00d9\u0005\u000e"+
		"\u0000\u0000\u00d9\u00db\u0006\u000f\uffff\uffff\u0000\u00da\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0003\u001c\u000e\u0000\u00e0\u00e1\u0006"+
		"\u000f\uffff\uffff\u0000\u00e1\u001f\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0003\u001e\u000f\u0000\u00e3\u00ea\u0006\u0010\uffff\uffff\u0000\u00e4"+
		"\u00e5\u0005\u000f\u0000\u0000\u00e5\u00e6\u0003\u001e\u000f\u0000\u00e6"+
		"\u00e7\u0006\u0010\uffff\uffff\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb!\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0003 \u0010\u0000\u00ee\u00fd\u0006\u0011\uffff\uffff\u0000\u00ef"+
		"\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f1\u0003 \u0010\u0000\u00f1\u00f2"+
		"\u0006\u0011\uffff\uffff\u0000\u00f2\u00fc\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0011\u0000\u0000\u00f4\u00f5\u0003 \u0010\u0000\u00f5\u00f6"+
		"\u0006\u0011\uffff\uffff\u0000\u00f6\u00fc\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0012\u0000\u0000\u00f8\u00f9\u0003 \u0010\u0000\u00f9\u00fa"+
		"\u0006\u0011\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"#\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0006\u0012\uffff\uffff\u0000\u0101\u0102\u0003\"\u0011\u0000\u0102\u010d"+
		"\u0006\u0012\uffff\uffff\u0000\u0103\u0104\u0005\r\u0000\u0000\u0104\u0105"+
		"\u0003\"\u0011\u0000\u0105\u0106\u0006\u0012\uffff\uffff\u0000\u0106\u010c"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108\u0109"+
		"\u0003\"\u0011\u0000\u0109\u010a\u0006\u0012\uffff\uffff\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u0107"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0117"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0003\u0018\f\u0000\u0111\u0112\u0006\u0012\uffff\uffff\u0000\u0112\u0117"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u001a\r\u0000\u0114\u0115\u0006"+
		"\u0012\uffff\uffff\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0100"+
		"\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0113"+
		"\u0001\u0000\u0000\u0000\u0117\u013a\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\n\u0004\u0000\u0000\u0119\u012a\u0006\u0012\uffff\uffff\u0000\u011a\u011b"+
		"\u0005\n\u0000\u0000\u011b\u011c\u0003$\u0012\u0000\u011c\u011d\u0006"+
		"\u0012\uffff\uffff\u0000\u011d\u012b\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005\u0013\u0000\u0000\u011f\u0120\u0003$\u0012\u0000\u0120\u0121\u0006"+
		"\u0012\uffff\uffff\u0000\u0121\u012b\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005\t\u0000\u0000\u0123\u0124\u0003$\u0012\u0000\u0124\u0125\u0006"+
		"\u0012\uffff\uffff\u0000\u0125\u012b\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005\u0014\u0000\u0000\u0127\u0128\u0003$\u0012\u0000\u0128\u0129\u0006"+
		"\u0012\uffff\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u011a"+
		"\u0001\u0000\u0000\u0000\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u0122"+
		"\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012b\u0139"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\n\u0002\u0000\u0000\u012d\u0136\u0006"+
		"\u0012\uffff\uffff\u0000\u012e\u012f\u0005\u0015\u0000\u0000\u012f\u0130"+
		"\u0003$\u0012\u0000\u0130\u0131\u0006\u0012\uffff\uffff\u0000\u0131\u0137"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0016\u0000\u0000\u0133\u0134"+
		"\u0003$\u0012\u0000\u0134\u0135\u0006\u0012\uffff\uffff\u0000\u0135\u0137"+
		"\u0001\u0000\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u0132"+
		"\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0118"+
		"\u0001\u0000\u0000\u0000\u0138\u012c\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b%\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u001c+57?GJepw\u009b\u00a1\u00aa\u00ae\u00b3\u00b8"+
		"\u00d3\u00da\u00dc\u00ea\u00fb\u00fd\u010b\u010d\u0116\u012a\u0136\u0138"+
		"\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}