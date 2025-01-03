// Generated from D:/University Things/Semester 7/Compiler design/final-project/compiler/src/main/java/com/example/compiler/MiniJavaGrammar.g4 by ANTLR 4.13.2
package gen.com.example.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniJavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENTIFIER=42, INTEGER_LITERAL=43, STRING_LITERAL=44, 
		WHITESPACE=45, LINE_COMMENT=46, BLOCK_COMMENT=47;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_constructorDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_parameter = 6, 
		RULE_type = 7, RULE_statement = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "constructorDeclaration", 
			"varDeclaration", "methodDeclaration", "parameter", "type", "statement", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "','", "';'", "'return'", 
			"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'*'", "'/'", "'+'", "'-'", "'&&'", "'||'", "'=='", "'>'", "'=<'", 
			"'>='", "'<'", "'.'", "'length'", "'true'", "'false'", "'this'", "'new'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "INTEGER_LITERAL", 
			"STRING_LITERAL", "WHITESPACE", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaGrammarParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				classDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniJavaGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniJavaGrammarParser.IDENTIFIER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(IDENTIFIER);
			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
			match(T__3);
			setState(34);
			match(T__4);
			setState(35);
			match(T__5);
			setState(36);
			match(T__6);
			setState(37);
			match(T__7);
			setState(38);
			match(T__8);
			setState(39);
			match(T__9);
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(T__10);
			setState(42);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398053326852L) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__11);
			setState(50);
			match(T__11);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniJavaGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniJavaGrammarParser.IDENTIFIER, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(IDENTIFIER);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(54);
				match(T__12);
				setState(55);
				match(IDENTIFIER);
				}
			}

			setState(58);
			match(T__1);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046904576L) != 0)) {
				{
				{
				setState(59);
				varDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					constructorDeclaration();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(71);
				methodDeclaration();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__11);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constructorDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(T__6);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046904576L) != 0)) {
				{
				setState(82);
				parameter();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(83);
					match(T__13);
					setState(84);
					parameter();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(T__10);
			setState(93);
			match(T__1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					varDeclaration();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398053326852L) != 0)) {
				{
				{
				setState(100);
				statement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__11);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
			match(IDENTIFIER);
			setState(110);
			match(T__14);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__2);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__16:
			case T__17:
			case IDENTIFIER:
				{
				setState(113);
				type();
				}
				break;
			case T__4:
				{
				setState(114);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(T__6);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046904576L) != 0)) {
				{
				setState(119);
				parameter();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(120);
					match(T__13);
					setState(121);
					parameter();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			match(T__10);
			setState(130);
			match(T__1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					varDeclaration();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398053326852L) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(143);
				match(T__15);
				setState(144);
				expression(0);
				setState(145);
				match(T__14);
				}
				break;
			case 2:
				{
				setState(147);
				match(T__15);
				setState(148);
				match(T__14);
				}
				break;
			}
			setState(151);
			match(T__11);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			type();
			setState(154);
			match(IDENTIFIER);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__16);
				setState(157);
				match(T__8);
				setState(158);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(IDENTIFIER);
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
	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__1);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398053326852L) != 0)) {
					{
					{
					setState(166);
					statement();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__18);
				setState(174);
				match(T__6);
				setState(175);
				expression(0);
				setState(176);
				match(T__10);
				setState(177);
				statement();
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(178);
					match(T__19);
					setState(179);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__20);
				setState(183);
				match(T__6);
				setState(184);
				expression(0);
				setState(185);
				match(T__10);
				setState(186);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(T__21);
				setState(189);
				match(T__6);
				setState(190);
				expression(0);
				setState(191);
				match(T__10);
				setState(192);
				match(T__14);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(IDENTIFIER);
				setState(195);
				match(T__22);
				setState(196);
				expression(0);
				setState(197);
				match(T__14);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(IDENTIFIER);
				setState(200);
				match(T__8);
				setState(201);
				expression(0);
				setState(202);
				match(T__9);
				setState(203);
				match(T__22);
				setState(204);
				expression(0);
				setState(205);
				match(T__14);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MiniJavaGrammarParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MiniJavaGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(210);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				{
				setState(211);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(212);
				match(T__36);
				}
				break;
			case 4:
				{
				setState(213);
				match(T__37);
				}
				break;
			case 5:
				{
				setState(214);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(215);
				match(T__38);
				}
				break;
			case 7:
				{
				setState(216);
				match(T__39);
				setState(217);
				match(T__16);
				setState(218);
				match(T__8);
				setState(219);
				expression(0);
				setState(220);
				match(T__9);
				}
				break;
			case 8:
				{
				setState(222);
				match(T__39);
				setState(223);
				match(IDENTIFIER);
				setState(224);
				match(T__6);
				setState(225);
				match(T__10);
				}
				break;
			case 9:
				{
				setState(226);
				match(T__40);
				setState(227);
				expression(2);
				}
				break;
			case 10:
				{
				setState(228);
				match(T__6);
				setState(229);
				expression(0);
				setState(230);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(235);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(238);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(241);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302912L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(244);
						match(T__8);
						setState(245);
						expression(0);
						setState(246);
						match(T__9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(249);
						match(T__34);
						setState(250);
						match(T__35);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(252);
						match(T__34);
						setState(253);
						match(IDENTIFIER);
						setState(254);
						match(T__6);
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35046933135488L) != 0)) {
							{
							setState(255);
							expression(0);
							setState(260);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__13) {
								{
								{
								setState(256);
								match(T__13);
								setState(257);
								expression(0);
								}
								}
								setState(262);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(265);
						match(T__10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(267);
						match(T__34);
						setState(268);
						match(IDENTIFIER);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(270);
						match(T__22);
						setState(271);
						expression(0);
						setState(272);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(278);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b"+
		"\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"=\b\u0002\n\u0002\f\u0002@\t\u0002\u0001\u0002\u0005\u0002C\b\u0002\n"+
		"\u0002\f\u0002F\t\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003"+
		"Y\t\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003`\b\u0003\n\u0003\f\u0003c\t\u0003\u0001\u0003\u0005\u0003f\b\u0003"+
		"\n\u0003\f\u0003i\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"t\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t\u0005\u0003\u0005\u0080\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0085\b\u0005\n\u0005"+
		"\f\u0005\u0088\t\u0005\u0001\u0005\u0005\u0005\u008b\b\u0005\n\u0005\f"+
		"\u0005\u008e\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0096\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a4\b\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b5\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e9\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0103\b\t\n\t\f\t\u0106\t\t\u0003\t\u0108\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0113\b\t\n\t\f\t\u0116\t\t\u0001\t\u0000\u0001\u0012\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u0018"+
		"\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001c\"\u013b\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u00044\u0001\u0000"+
		"\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000"+
		"\np\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000\u0000\u000e\u00a3"+
		"\u0001\u0000\u0000\u0000\u0010\u00cf\u0001\u0000\u0000\u0000\u0012\u00e8"+
		"\u0001\u0000\u0000\u0000\u0014\u0018\u0003\u0002\u0001\u0000\u0015\u0017"+
		"\u0003\u0004\u0002\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0005*\u0000\u0000\u001f \u0005\u0002\u0000\u0000 !\u0005\u0003\u0000"+
		"\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u0006"+
		"\u0000\u0000$%\u0005\u0007\u0000\u0000%&\u0005\b\u0000\u0000&\'\u0005"+
		"\t\u0000\u0000\'(\u0005\n\u0000\u0000()\u0005*\u0000\u0000)*\u0005\u000b"+
		"\u0000\u0000*.\u0005\u0002\u0000\u0000+-\u0003\u0010\b\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"12\u0005\f\u0000\u000023\u0005\f\u0000\u00003\u0003\u0001\u0000\u0000"+
		"\u000045\u0005\u0001\u0000\u000058\u0005*\u0000\u000067\u0005\r\u0000"+
		"\u000079\u0005*\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:>\u0005\u0002\u0000\u0000;=\u0003\b\u0004"+
		"\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?D\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EJ\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0003\n\u0005"+
		"\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MN\u0005\f\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0003\u0000\u0000PQ\u0005*\u0000\u0000QZ\u0005\u0007\u0000\u0000"+
		"RW\u0003\f\u0006\u0000ST\u0005\u000e\u0000\u0000TV\u0003\f\u0006\u0000"+
		"US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000ZR\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u000b\u0000\u0000]a\u0005\u0002\u0000\u0000"+
		"^`\u0003\b\u0004\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bg\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000df\u0003\u0010\b\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005"+
		"\f\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0003\u000e\u0007\u0000"+
		"mn\u0005*\u0000\u0000no\u0005\u000f\u0000\u0000o\t\u0001\u0000\u0000\u0000"+
		"ps\u0005\u0003\u0000\u0000qt\u0003\u000e\u0007\u0000rt\u0005\u0005\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0005*\u0000\u0000v\u007f\u0005\u0007\u0000\u0000w|\u0003"+
		"\f\u0006\u0000xy\u0005\u000e\u0000\u0000y{\u0003\f\u0006\u0000zx\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007fw\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000b\u0000"+
		"\u0000\u0082\u0086\u0005\u0002\u0000\u0000\u0083\u0085\u0003\b\u0004\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u008c\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0003\u0010\b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0095\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090"+
		"\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0096"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094\u0096"+
		"\u0005\u000f\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\f\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u009a\u0003"+
		"\u000e\u0007\u0000\u009a\u009b\u0005*\u0000\u0000\u009b\r\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0011\u0000\u0000\u009d\u009e\u0005\t\u0000"+
		"\u0000\u009e\u00a4\u0005\n\u0000\u0000\u009f\u00a4\u0005\u0012\u0000\u0000"+
		"\u00a0\u00a4\u0005\u0011\u0000\u0000\u00a1\u00a4\u0005\b\u0000\u0000\u00a2"+
		"\u00a4\u0005*\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a3\u009f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u000f"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a9\u0005\u0002\u0000\u0000\u00a6\u00a8"+
		"\u0003\u0010\b\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00d0\u0005\f\u0000\u0000\u00ad\u00ae\u0005\u0013"+
		"\u0000\u0000\u00ae\u00af\u0005\u0007\u0000\u0000\u00af\u00b0\u0003\u0012"+
		"\t\u0000\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1\u00b4\u0003\u0010\b"+
		"\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b5\u0003\u0010\b\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00d0\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0015\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9"+
		"\u00ba\u0005\u000b\u0000\u0000\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00d0"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0016\u0000\u0000\u00bd\u00be"+
		"\u0005\u0007\u0000\u0000\u00be\u00bf\u0003\u0012\t\u0000\u00bf\u00c0\u0005"+
		"\u000b\u0000\u0000\u00c0\u00c1\u0005\u000f\u0000\u0000\u00c1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005*\u0000\u0000\u00c3\u00c4\u0005\u0017"+
		"\u0000\u0000\u00c4\u00c5\u0003\u0012\t\u0000\u00c5\u00c6\u0005\u000f\u0000"+
		"\u0000\u00c6\u00d0\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005*\u0000\u0000"+
		"\u00c8\u00c9\u0005\t\u0000\u0000\u00c9\u00ca\u0003\u0012\t\u0000\u00ca"+
		"\u00cb\u0005\n\u0000\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00cd"+
		"\u0003\u0012\t\u0000\u00cd\u00ce\u0005\u000f\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00a5\u0001\u0000\u0000\u0000\u00cf\u00ad\u0001"+
		"\u0000\u0000\u0000\u00cf\u00b6\u0001\u0000\u0000\u0000\u00cf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00c2\u0001\u0000\u0000\u0000\u00cf\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006"+
		"\t\uffff\uffff\u0000\u00d2\u00e9\u0005+\u0000\u0000\u00d3\u00e9\u0005"+
		",\u0000\u0000\u00d4\u00e9\u0005%\u0000\u0000\u00d5\u00e9\u0005&\u0000"+
		"\u0000\u00d6\u00e9\u0005*\u0000\u0000\u00d7\u00e9\u0005\'\u0000\u0000"+
		"\u00d8\u00d9\u0005(\u0000\u0000\u00d9\u00da\u0005\u0011\u0000\u0000\u00da"+
		"\u00db\u0005\t\u0000\u0000\u00db\u00dc\u0003\u0012\t\u0000\u00dc\u00dd"+
		"\u0005\n\u0000\u0000\u00dd\u00e9\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"(\u0000\u0000\u00df\u00e0\u0005*\u0000\u0000\u00e0\u00e1\u0005\u0007\u0000"+
		"\u0000\u00e1\u00e9\u0005\u000b\u0000\u0000\u00e2\u00e3\u0005)\u0000\u0000"+
		"\u00e3\u00e9\u0003\u0012\t\u0002\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0012\t\u0000\u00e6\u00e7\u0005\u000b\u0000\u0000\u00e7\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e8\u00d1\u0001\u0000\u0000\u0000\u00e8\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e8\u00d4\u0001\u0000\u0000\u0000\u00e8\u00d5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00d6\u0001\u0000\u0000\u0000\u00e8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00d8\u0001\u0000\u0000\u0000\u00e8\u00de"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001\u0000\u0000\u0000\u00e8\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e9\u0114\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\n\u0012\u0000\u0000\u00eb\u00ec\u0007\u0000\u0000\u0000\u00ec\u0113\u0003"+
		"\u0012\t\u0013\u00ed\u00ee\n\u0011\u0000\u0000\u00ee\u00ef\u0007\u0001"+
		"\u0000\u0000\u00ef\u0113\u0003\u0012\t\u0012\u00f0\u00f1\n\u0010\u0000"+
		"\u0000\u00f1\u00f2\u0007\u0002\u0000\u0000\u00f2\u0113\u0003\u0012\t\u0011"+
		"\u00f3\u00f4\n\u000f\u0000\u0000\u00f4\u00f5\u0005\t\u0000\u0000\u00f5"+
		"\u00f6\u0003\u0012\t\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u0113"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u000e\u0000\u0000\u00f9\u00fa\u0005"+
		"#\u0000\u0000\u00fa\u0113\u0005$\u0000\u0000\u00fb\u00fc\n\r\u0000\u0000"+
		"\u00fc\u00fd\u0005#\u0000\u0000\u00fd\u00fe\u0005*\u0000\u0000\u00fe\u0107"+
		"\u0005\u0007\u0000\u0000\u00ff\u0104\u0003\u0012\t\u0000\u0100\u0101\u0005"+
		"\u000e\u0000\u0000\u0101\u0103\u0003\u0012\t\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u0113\u0005\u000b\u0000\u0000\u010a\u010b\n\f\u0000"+
		"\u0000\u010b\u010c\u0005#\u0000\u0000\u010c\u0113\u0005*\u0000\u0000\u010d"+
		"\u010e\n\u000b\u0000\u0000\u010e\u010f\u0005\u0017\u0000\u0000\u010f\u0110"+
		"\u0003\u0012\t\u0000\u0110\u0111\u0005\u000f\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u00ea\u0001\u0000\u0000\u0000\u0112\u00ed\u0001"+
		"\u0000\u0000\u0000\u0112\u00f0\u0001\u0000\u0000\u0000\u0112\u00f3\u0001"+
		"\u0000\u0000\u0000\u0112\u00f8\u0001\u0000\u0000\u0000\u0112\u00fb\u0001"+
		"\u0000\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0112\u010d\u0001"+
		"\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0013\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0019\u0018.8>"+
		"DJWZags|\u007f\u0086\u008c\u0095\u00a3\u00a9\u00b4\u00cf\u00e8\u0104\u0107"+
		"\u0112\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}