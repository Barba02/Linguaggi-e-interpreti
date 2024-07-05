// Generated from E:/Downloads/ArnoldC/src/ArnoldC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, TRUE=2, FALSE=3, STRING=4, IF=5, ELSE=6, ENDIF=7, WHILE=8, ENDWHILE=9, 
		ADD=10, SUB=11, MUL=12, DIV=13, MOD=14, EQ=15, GT=16, OR=17, AND=18, DECLARE_FUN=19, 
		NONVOID=20, FUN_ARGS=21, RETURN=22, END_FUN=23, CALL=24, ASS_CALL=25, 
		BEGIN=26, END=27, PRINT=28, DECLARE=29, INIT=30, USING_VAR=31, ASSIGN=32, 
		END_USING_VAR=33, TERMINATOR=34, WS=35, ID=36;
	public static final int
		RULE_main = 0, RULE_funCall = 1, RULE_funDeclare = 2, RULE_com = 3, RULE_ops = 4, 
		RULE_exp = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "funCall", "funDeclare", "com", "ops", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@NO PROBLEMO'", "'@I LIED'", null, "'BECAUSE I'M GOING TO SAY PLEASE'", 
			"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'", 
			"'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", "'I LET HIM GO'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'LISTEN TO ME VERY CAREFULLY'", "'GIVE THESE PEOPLE AIR'", 
			"'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", "'I'LL BE BACK'", 
			"'HASTA LA VISTA, BABY'", "'DO IT NOW'", "'GET YOUR ASS TO MARS'", null, 
			null, "'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
			"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'ENOUGH TALK'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "TRUE", "FALSE", "STRING", "IF", "ELSE", "ENDIF", "WHILE", 
			"ENDWHILE", "ADD", "SUB", "MUL", "DIV", "MOD", "EQ", "GT", "OR", "AND", 
			"DECLARE_FUN", "NONVOID", "FUN_ARGS", "RETURN", "END_FUN", "CALL", "ASS_CALL", 
			"BEGIN", "END", "PRINT", "DECLARE", "INIT", "USING_VAR", "ASSIGN", "END_USING_VAR", 
			"TERMINATOR", "WS", "ID"
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
	public String getGrammarFileName() { return "ArnoldC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ArnoldCParser.BEGIN, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode END() { return getToken(ArnoldCParser.END, 0); }
		public TerminalNode EOF() { return getToken(ArnoldCParser.EOF, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(ArnoldCParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(ArnoldCParser.TERMINATOR, i);
		}
		public List<FunDeclareContext> funDeclare() {
			return getRuleContexts(FunDeclareContext.class);
		}
		public FunDeclareContext funDeclare(int i) {
			return getRuleContext(FunDeclareContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINATOR) {
				{
				setState(12);
				match(TERMINATOR);
				}
			}

			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE_FUN) {
				{
				{
				setState(15);
				funDeclare();
				setState(16);
				match(TERMINATOR);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(BEGIN);
			setState(24);
			com(0);
			setState(25);
			match(END);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					match(TERMINATOR);
					setState(27);
					funDeclare();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINATOR) {
				{
				setState(33);
				match(TERMINATOR);
				}
			}

			setState(36);
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
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ArnoldCParser.CALL, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(CALL);
			setState(39);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					exp();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class FunDeclareContext extends ParserRuleContext {
		public TerminalNode DECLARE_FUN() { return getToken(ArnoldCParser.DECLARE_FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(ArnoldCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArnoldCParser.ID, i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(ArnoldCParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(ArnoldCParser.TERMINATOR, i);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode END_FUN() { return getToken(ArnoldCParser.END_FUN, 0); }
		public List<TerminalNode> FUN_ARGS() { return getTokens(ArnoldCParser.FUN_ARGS); }
		public TerminalNode FUN_ARGS(int i) {
			return getToken(ArnoldCParser.FUN_ARGS, i);
		}
		public TerminalNode NONVOID() { return getToken(ArnoldCParser.NONVOID, 0); }
		public FunDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFunDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclareContext funDeclare() throws RecognitionException {
		FunDeclareContext _localctx = new FunDeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DECLARE_FUN);
			setState(47);
			match(ID);
			setState(48);
			match(TERMINATOR);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN_ARGS) {
				{
				{
				setState(49);
				match(FUN_ARGS);
				setState(50);
				match(ID);
				setState(51);
				match(TERMINATOR);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONVOID) {
				{
				setState(57);
				match(NONVOID);
				setState(58);
				match(TERMINATOR);
				}
			}

			setState(61);
			com(0);
			setState(62);
			match(TERMINATOR);
			setState(63);
			match(END_FUN);
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
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModifyContext extends ComContext {
		public TerminalNode USING_VAR() { return getToken(ArnoldCParser.USING_VAR, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(ArnoldCParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(ArnoldCParser.TERMINATOR, i);
		}
		public TerminalNode END_USING_VAR() { return getToken(ArnoldCParser.END_USING_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(ArnoldCParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<OpsContext> ops() {
			return getRuleContexts(OpsContext.class);
		}
		public OpsContext ops(int i) {
			return getRuleContext(OpsContext.class,i);
		}
		public ModifyContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitModify(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends ComContext {
		public TerminalNode DECLARE() { return getToken(ArnoldCParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(ArnoldCParser.TERMINATOR, 0); }
		public TerminalNode INIT() { return getToken(ArnoldCParser.INIT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclareContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ComContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public CallFunctionContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(ArnoldCParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(ArnoldCParser.TERMINATOR, i);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCParser.ENDWHILE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStringContext extends ComContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(ArnoldCParser.STRING, 0); }
		public PrintStringContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(ArnoldCParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(ArnoldCParser.TERMINATOR, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ComContext {
		public TerminalNode RETURN() { return getToken(ArnoldCParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignByCallContext extends ComContext {
		public TerminalNode ASS_CALL() { return getToken(ArnoldCParser.ASS_CALL, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode TERMINATOR() { return getToken(ArnoldCParser.TERMINATOR, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public AssignByCallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitAssignByCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatComContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode TERMINATOR() { return getToken(ArnoldCParser.TERMINATOR, 0); }
		public ConcatComContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitConcatCom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintValContext extends ComContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintValContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_com, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(IF);
				setState(67);
				exp();
				setState(68);
				match(TERMINATOR);
				setState(69);
				com(0);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(70);
					match(TERMINATOR);
					setState(71);
					match(ELSE);
					setState(72);
					match(TERMINATOR);
					setState(73);
					com(0);
					}
					break;
				}
				setState(76);
				match(TERMINATOR);
				setState(77);
				match(ENDIF);
				}
				break;
			case 2:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(WHILE);
				setState(80);
				exp();
				setState(81);
				match(TERMINATOR);
				setState(82);
				com(0);
				setState(83);
				match(TERMINATOR);
				setState(84);
				match(ENDWHILE);
				}
				break;
			case 3:
				{
				_localctx = new DeclareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(DECLARE);
				setState(87);
				match(ID);
				setState(88);
				match(TERMINATOR);
				setState(89);
				match(INIT);
				setState(90);
				exp();
				}
				break;
			case 4:
				{
				_localctx = new ModifyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(USING_VAR);
				setState(92);
				match(ID);
				setState(93);
				match(TERMINATOR);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(94);
					match(ASSIGN);
					setState(95);
					exp();
					setState(96);
					match(TERMINATOR);
					}
				}

				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 523264L) != 0)) {
					{
					{
					setState(100);
					ops();
					setState(101);
					match(TERMINATOR);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(END_USING_VAR);
				}
				break;
			case 5:
				{
				_localctx = new PrintValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(PRINT);
				setState(110);
				exp();
				}
				break;
			case 6:
				{
				_localctx = new PrintStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(PRINT);
				setState(112);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(RETURN);
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(114);
					exp();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new AssignByCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ASS_CALL);
				setState(118);
				match(ID);
				setState(119);
				match(TERMINATOR);
				setState(120);
				funCall();
				}
				break;
			case 9:
				{
				_localctx = new CallFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				funCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatComContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(124);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(125);
					match(TERMINATOR);
					setState(126);
					com(2);
					}
					} 
				}
				setState(131);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpsContext extends ParserRuleContext {
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
	 
		public OpsContext() { }
		public void copyFrom(OpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends OpsContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ArnoldCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArnoldCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ArnoldCParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(ArnoldCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ArnoldCParser.SUB, 0); }
		public ArithmeticContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends OpsContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ArnoldCParser.EQ, 0); }
		public TerminalNode GT() { return getToken(ArnoldCParser.GT, 0); }
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public LogicalContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ops);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
				_localctx = new ArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((ArithmeticContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
					((ArithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				exp();
				}
				break;
			case EQ:
			case GT:
			case OR:
			case AND:
				_localctx = new LogicalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((LogicalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
					((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				exp();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExpContext {
		public Token val;
		public TerminalNode TRUE() { return getToken(ArnoldCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCParser.FALSE, 0); }
		public BooleanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ExpContext {
		public TerminalNode INT() { return getToken(ArnoldCParser.INT, 0); }
		public IntegerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((BooleanContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return com_sempred((ComContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001d\b\u0000\n\u0000\f\u0000 \t\u0000\u0001\u0000\u0003\u0000#\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u0002"+
		"8\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003K\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003h\b\u0003"+
		"\n\u0003\f\u0003k\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003{\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0080\b\u0003\n\u0003"+
		"\f\u0003\u0083\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0089\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u008e\b\u0005\u0001\u0005\u0000\u0001\u0006\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0003\u0001\u0000\n\u000e\u0001\u0000\u000f\u0012\u0001\u0000"+
		"\u0002\u0003\u00a0\u0000\r\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000"+
		"\b\u0088\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u000e"+
		"\u0005\"\u0000\u0000\r\f\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000"+
		"\u0000\u000e\u0014\u0001\u0000\u0000\u0000\u000f\u0010\u0003\u0004\u0002"+
		"\u0000\u0010\u0011\u0005\"\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000"+
		"\u0012\u000f\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000"+
		"\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005\u001a\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000"+
		"\u0019\u001e\u0005\u001b\u0000\u0000\u001a\u001b\u0005\"\u0000\u0000\u001b"+
		"\u001d\u0003\u0004\u0002\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d"+
		" \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!#\u0005\"\u0000\u0000\"!\u0001\u0000\u0000\u0000\""+
		"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000"+
		"\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u0018\u0000\u0000\'+\u0005"+
		"$\u0000\u0000(*\u0003\n\u0005\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u0003\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0013"+
		"\u0000\u0000/0\u0005$\u0000\u000006\u0005\"\u0000\u000012\u0005\u0015"+
		"\u0000\u000023\u0005$\u0000\u000035\u0005\"\u0000\u000041\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007;\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0014\u0000\u0000:<\u0005\"\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0003\u0006\u0003"+
		"\u0000>?\u0005\"\u0000\u0000?@\u0005\u0017\u0000\u0000@\u0005\u0001\u0000"+
		"\u0000\u0000AB\u0006\u0003\uffff\uffff\u0000BC\u0005\u0005\u0000\u0000"+
		"CD\u0003\n\u0005\u0000DE\u0005\"\u0000\u0000EJ\u0003\u0006\u0003\u0000"+
		"FG\u0005\"\u0000\u0000GH\u0005\u0006\u0000\u0000HI\u0005\"\u0000\u0000"+
		"IK\u0003\u0006\u0003\u0000JF\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0005\"\u0000\u0000MN\u0005\u0007\u0000"+
		"\u0000N{\u0001\u0000\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0003\n\u0005"+
		"\u0000QR\u0005\"\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005\"\u0000"+
		"\u0000TU\u0005\t\u0000\u0000U{\u0001\u0000\u0000\u0000VW\u0005\u001d\u0000"+
		"\u0000WX\u0005$\u0000\u0000XY\u0005\"\u0000\u0000YZ\u0005\u001e\u0000"+
		"\u0000Z{\u0003\n\u0005\u0000[\\\u0005\u001f\u0000\u0000\\]\u0005$\u0000"+
		"\u0000]b\u0005\"\u0000\u0000^_\u0005 \u0000\u0000_`\u0003\n\u0005\u0000"+
		"`a\u0005\"\u0000\u0000ac\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ci\u0001\u0000\u0000\u0000de\u0003\b\u0004\u0000"+
		"ef\u0005\"\u0000\u0000fh\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000l{\u0005!\u0000"+
		"\u0000mn\u0005\u001c\u0000\u0000n{\u0003\n\u0005\u0000op\u0005\u001c\u0000"+
		"\u0000p{\u0005\u0004\u0000\u0000qs\u0005\u0016\u0000\u0000rt\u0003\n\u0005"+
		"\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t{\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0019\u0000\u0000vw\u0005$\u0000\u0000wx\u0005\""+
		"\u0000\u0000x{\u0003\u0002\u0001\u0000y{\u0003\u0002\u0001\u0000zA\u0001"+
		"\u0000\u0000\u0000zO\u0001\u0000\u0000\u0000zV\u0001\u0000\u0000\u0000"+
		"z[\u0001\u0000\u0000\u0000zm\u0001\u0000\u0000\u0000zo\u0001\u0000\u0000"+
		"\u0000zq\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\u0081\u0001\u0000\u0000\u0000|}\n\u0001\u0000\u0000}~\u0005"+
		"\"\u0000\u0000~\u0080\u0003\u0006\u0003\u0002\u007f|\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0007\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0000\u0000"+
		"\u0000\u0085\u0089\u0003\n\u0005\u0000\u0086\u0087\u0007\u0001\u0000\u0000"+
		"\u0087\u0089\u0003\n\u0005\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u008e"+
		"\u0005\u0001\u0000\u0000\u008b\u008e\u0007\u0002\u0000\u0000\u008c\u008e"+
		"\u0005$\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u000b\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0014\u001e\"+6;Jbisz\u0081\u0088\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}