// Generated from BigDataScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigDataScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, NULL_LITERAL=77, BOOL_LITERAL=78, INT_LITERAL=79, 
		REAL_LITERAL=80, STRING_LITERAL=81, STRING_LITERAL_SINGLE=82, HELP_LITERAL=83, 
		SYS_LITERAL=84, TASK_LITERAL=85, COMMENT=86, COMMENT_LINE=87, COMMENT_LINE_HASH=88, 
		ID=89, WS=90;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
		"T__73", "T__74", "T__75", "IntegerNumber", "EscapeSequence", "EscapedNewLine", 
		"Exponent", "HexPrefix", "HexDigit", "NonIntegerNumber", "SysMultiLine", 
		"NULL_LITERAL", "BOOL_LITERAL", "INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", 
		"STRING_LITERAL_SINGLE", "HELP_LITERAL", "SYS_LITERAL", "TASK_LITERAL", 
		"COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'\n'", "'include'", "','", "'bool'", "'int'", "'real'", 
		"'string'", "'void'", "'['", "']'", "'{'", "'}'", "'='", "':='", "'('", 
		"')'", "'class'", "'extends'", "'break'", "'breakpoint'", "'checkpoint'", 
		"'continue'", "'debug'", "'exit'", "'print'", "'println'", "'warning'", 
		"'error'", "'for'", "':'", "'if'", "'else'", "'kill'", "'return'", "'wait'", 
		"'switch'", "'case'", "'default'", "'while'", "'.'", "'new'", "'++'", 
		"'--'", "'~'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", 
		"'=='", "'!='", "'>='", "'>'", "'&'", "'|'", "'^'", "'&&'", "'||'", "'?'", 
		"'<-'", "'=>'", "'task'", "'dep'", "'goal'", "'par'", "'parallel'", "'|='", 
		"'&='", "'/='", "'*='", "'-='", "'+='", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NULL_LITERAL", "BOOL_LITERAL", "INT_LITERAL", 
		"REAL_LITERAL", "STRING_LITERAL", "STRING_LITERAL_SINGLE", "HELP_LITERAL", 
		"SYS_LITERAL", "TASK_LITERAL", "COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", 
		"ID", "WS"
	};
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


	public BigDataScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigDataScript.g4"; }

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
		case 93:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 94:
			COMMENT_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
			COMMENT_LINE_HASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void COMMENT_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}
	private void COMMENT_LINE_HASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 skip(); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\\\u02e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38"+
		"\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M"+
		"\3M\3M\3N\3N\3N\7N\u0202\nN\fN\16N\u0205\13N\3N\3N\6N\u0209\nN\rN\16N"+
		"\u020a\3N\3N\6N\u020f\nN\rN\16N\u0210\5N\u0213\nN\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\5O\u021d\nO\3P\3P\3P\3P\5P\u0223\nP\3Q\3Q\5Q\u0227\nQ\3Q\6Q\u022a"+
		"\nQ\rQ\16Q\u022b\3R\3R\3R\3R\5R\u0232\nR\3S\3S\3T\6T\u0237\nT\rT\16T\u0238"+
		"\3T\3T\7T\u023d\nT\fT\16T\u0240\13T\3T\5T\u0243\nT\3T\3T\6T\u0247\nT\r"+
		"T\16T\u0248\3T\5T\u024c\nT\3T\6T\u024f\nT\rT\16T\u0250\3T\3T\6T\u0255"+
		"\nT\rT\16T\u0256\5T\u0259\nT\3U\3U\7U\u025d\nU\fU\16U\u0260\13U\3V\3V"+
		"\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0270\nW\3X\3X\3Y\3Y\3Z\3Z\3Z"+
		"\3Z\7Z\u027a\nZ\fZ\16Z\u027d\13Z\3Z\3Z\3[\3[\7[\u0283\n[\f[\16[\u0286"+
		"\13[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\6\\\u0290\n\\\r\\\16\\\u0291\3\\\3"+
		"\\\3]\3]\3]\3]\3]\6]\u029b\n]\r]\16]\u029c\3]\3]\3^\3^\3^\3^\3^\3^\6^"+
		"\u02a7\n^\r^\16^\u02a8\3^\3^\3^\3_\3_\3_\3_\7_\u02b2\n_\f_\16_\u02b5\13"+
		"_\3_\3_\3_\3_\3_\3`\3`\3`\3`\7`\u02c0\n`\f`\16`\u02c3\13`\3`\3`\3a\3a"+
		"\7a\u02c9\na\fa\16a\u02cc\13a\3a\3a\3b\3b\7b\u02d2\nb\fb\16b\u02d5\13"+
		"b\3c\3c\3c\3c\3c\3c\3c\5c\u02de\nc\3c\3c\3\u02b3\2d\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2"+
		"\u00a7\2\u00a9\2\u00abO\u00adP\u00afQ\u00b1R\u00b3S\u00b5T\u00b7U\u00b9"+
		"V\u00bbW\u00bdX\u00bfY\u00c1Z\u00c3[\u00c5\\\3\2\16\n\2$$))^^ddhhpptt"+
		"vv\4\2\f\f\17\17\4\2GGgg\4\2--//\5\2\62;CHch\4\2$$^^\3\2))\4\2\13\13\""+
		"\"\6\2\f\f\17\17**}}\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\2\u02ff"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\3\u00c7\3\2\2\2\5\u00c9\3\2\2\2\7\u00cb"+
		"\3\2\2\2\t\u00d3\3\2\2\2\13\u00d5\3\2\2\2\r\u00da\3\2\2\2\17\u00de\3\2"+
		"\2\2\21\u00e3\3\2\2\2\23\u00ea\3\2\2\2\25\u00ef\3\2\2\2\27\u00f1\3\2\2"+
		"\2\31\u00f3\3\2\2\2\33\u00f5\3\2\2\2\35\u00f7\3\2\2\2\37\u00f9\3\2\2\2"+
		"!\u00fc\3\2\2\2#\u00fe\3\2\2\2%\u0100\3\2\2\2\'\u0106\3\2\2\2)\u010e\3"+
		"\2\2\2+\u0114\3\2\2\2-\u011f\3\2\2\2/\u012a\3\2\2\2\61\u0133\3\2\2\2\63"+
		"\u0139\3\2\2\2\65\u013e\3\2\2\2\67\u0144\3\2\2\29\u014c\3\2\2\2;\u0154"+
		"\3\2\2\2=\u015a\3\2\2\2?\u015e\3\2\2\2A\u0160\3\2\2\2C\u0163\3\2\2\2E"+
		"\u0168\3\2\2\2G\u016d\3\2\2\2I\u0174\3\2\2\2K\u0179\3\2\2\2M\u0180\3\2"+
		"\2\2O\u0185\3\2\2\2Q\u018d\3\2\2\2S\u0193\3\2\2\2U\u0195\3\2\2\2W\u0199"+
		"\3\2\2\2Y\u019c\3\2\2\2[\u019f\3\2\2\2]\u01a1\3\2\2\2_\u01a3\3\2\2\2a"+
		"\u01a5\3\2\2\2c\u01a7\3\2\2\2e\u01a9\3\2\2\2g\u01ab\3\2\2\2i\u01ad\3\2"+
		"\2\2k\u01af\3\2\2\2m\u01b2\3\2\2\2o\u01b5\3\2\2\2q\u01b8\3\2\2\2s\u01bb"+
		"\3\2\2\2u\u01bd\3\2\2\2w\u01bf\3\2\2\2y\u01c1\3\2\2\2{\u01c3\3\2\2\2}"+
		"\u01c6\3\2\2\2\177\u01c9\3\2\2\2\u0081\u01cb\3\2\2\2\u0083\u01ce\3\2\2"+
		"\2\u0085\u01d1\3\2\2\2\u0087\u01d6\3\2\2\2\u0089\u01da\3\2\2\2\u008b\u01df"+
		"\3\2\2\2\u008d\u01e3\3\2\2\2\u008f\u01ec\3\2\2\2\u0091\u01ef\3\2\2\2\u0093"+
		"\u01f2\3\2\2\2\u0095\u01f5\3\2\2\2\u0097\u01f8\3\2\2\2\u0099\u01fb\3\2"+
		"\2\2\u009b\u0212\3\2\2\2\u009d\u0214\3\2\2\2\u009f\u021e\3\2\2\2\u00a1"+
		"\u0224\3\2\2\2\u00a3\u0231\3\2\2\2\u00a5\u0233\3\2\2\2\u00a7\u0258\3\2"+
		"\2\2\u00a9\u025e\3\2\2\2\u00ab\u0261\3\2\2\2\u00ad\u026f\3\2\2\2\u00af"+
		"\u0271\3\2\2\2\u00b1\u0273\3\2\2\2\u00b3\u0275\3\2\2\2\u00b5\u0280\3\2"+
		"\2\2\u00b7\u0289\3\2\2\2\u00b9\u0295\3\2\2\2\u00bb\u02a0\3\2\2\2\u00bd"+
		"\u02ad\3\2\2\2\u00bf\u02bb\3\2\2\2\u00c1\u02c6\3\2\2\2\u00c3\u02cf\3\2"+
		"\2\2\u00c5\u02dd\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8\4\3\2\2\2\u00c9\u00ca"+
		"\7\f\2\2\u00ca\6\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7e\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7f\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\b\3\2\2\2\u00d3\u00d4\7.\2\2\u00d4\n\3\2\2\2\u00d5"+
		"\u00d6\7d\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7n\2\2"+
		"\u00d9\f\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v"+
		"\2\2\u00dd\16\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\20\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7i\2\2\u00e9\22\3\2\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7f\2\2\u00ee\24\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0"+
		"\26\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2\30\3\2\2\2\u00f3\u00f4\7}\2\2\u00f4"+
		"\32\3\2\2\2\u00f5\u00f6\7\177\2\2\u00f6\34\3\2\2\2\u00f7\u00f8\7?\2\2"+
		"\u00f8\36\3\2\2\2\u00f9\u00fa\7<\2\2\u00fa\u00fb\7?\2\2\u00fb \3\2\2\2"+
		"\u00fc\u00fd\7*\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff$\3\2\2\2"+
		"\u0100\u0101\7e\2\2\u0101\u0102\7n\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7u\2\2\u0105&\3\2\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7z\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b\7p\2\2\u010b"+
		"\u010c\7f\2\2\u010c\u010d\7u\2\2\u010d(\3\2\2\2\u010e\u010f\7d\2\2\u010f"+
		"\u0110\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7c\2\2\u0112\u0113\7m\2\2"+
		"\u0113*\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7t\2\2\u0116\u0117\7g\2"+
		"\2\u0117\u0118\7c\2\2\u0118\u0119\7m\2\2\u0119\u011a\7r\2\2\u011a\u011b"+
		"\7q\2\2\u011b\u011c\7k\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e"+
		",\3\2\2\2\u011f\u0120\7e\2\2\u0120\u0121\7j\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7m\2\2\u0124\u0125\7r\2\2\u0125\u0126\7q\2\2"+
		"\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128\u0129\7v\2\2\u0129.\3\2\2"+
		"\2\u012a\u012b\7e\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e"+
		"\7v\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7w\2\2\u0131"+
		"\u0132\7g\2\2\u0132\60\3\2\2\2\u0133\u0134\7f\2\2\u0134\u0135\7g\2\2\u0135"+
		"\u0136\7d\2\2\u0136\u0137\7w\2\2\u0137\u0138\7i\2\2\u0138\62\3\2\2\2\u0139"+
		"\u013a\7g\2\2\u013a\u013b\7z\2\2\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2"+
		"\u013d\64\3\2\2\2\u013e\u013f\7r\2\2\u013f\u0140\7t\2\2\u0140\u0141\7"+
		"k\2\2\u0141\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143\66\3\2\2\2\u0144\u0145"+
		"\7r\2\2\u0145\u0146\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7n\2\2\u014a\u014b\7p\2\2\u014b8\3\2\2\2\u014c"+
		"\u014d\7y\2\2\u014d\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f\u0150\7p\2\2"+
		"\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152\u0153\7i\2\2\u0153:\3\2\2"+
		"\2\u0154\u0155\7g\2\2\u0155\u0156\7t\2\2\u0156\u0157\7t\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7t\2\2\u0159<\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c"+
		"\7q\2\2\u015c\u015d\7t\2\2\u015d>\3\2\2\2\u015e\u015f\7<\2\2\u015f@\3"+
		"\2\2\2\u0160\u0161\7k\2\2\u0161\u0162\7h\2\2\u0162B\3\2\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7n\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167"+
		"D\3\2\2\2\u0168\u0169\7m\2\2\u0169\u016a\7k\2\2\u016a\u016b\7n\2\2\u016b"+
		"\u016c\7n\2\2\u016cF\3\2\2\2\u016d\u016e\7t\2\2\u016e\u016f\7g\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7w\2\2\u0171\u0172\7t\2\2\u0172\u0173\7p\2\2"+
		"\u0173H\3\2\2\2\u0174\u0175\7y\2\2\u0175\u0176\7c\2\2\u0176\u0177\7k\2"+
		"\2\u0177\u0178\7v\2\2\u0178J\3\2\2\2\u0179\u017a\7u\2\2\u017a\u017b\7"+
		"y\2\2\u017b\u017c\7k\2\2\u017c\u017d\7v\2\2\u017d\u017e\7e\2\2\u017e\u017f"+
		"\7j\2\2\u017fL\3\2\2\2\u0180\u0181\7e\2\2\u0181\u0182\7c\2\2\u0182\u0183"+
		"\7u\2\2\u0183\u0184\7g\2\2\u0184N\3\2\2\2\u0185\u0186\7f\2\2\u0186\u0187"+
		"\7g\2\2\u0187\u0188\7h\2\2\u0188\u0189\7c\2\2\u0189\u018a\7w\2\2\u018a"+
		"\u018b\7n\2\2\u018b\u018c\7v\2\2\u018cP\3\2\2\2\u018d\u018e\7y\2\2\u018e"+
		"\u018f\7j\2\2\u018f\u0190\7k\2\2\u0190\u0191\7n\2\2\u0191\u0192\7g\2\2"+
		"\u0192R\3\2\2\2\u0193\u0194\7\60\2\2\u0194T\3\2\2\2\u0195\u0196\7p\2\2"+
		"\u0196\u0197\7g\2\2\u0197\u0198\7y\2\2\u0198V\3\2\2\2\u0199\u019a\7-\2"+
		"\2\u019a\u019b\7-\2\2\u019bX\3\2\2\2\u019c\u019d\7/\2\2\u019d\u019e\7"+
		"/\2\2\u019eZ\3\2\2\2\u019f\u01a0\7\u0080\2\2\u01a0\\\3\2\2\2\u01a1\u01a2"+
		"\7#\2\2\u01a2^\3\2\2\2\u01a3\u01a4\7,\2\2\u01a4`\3\2\2\2\u01a5\u01a6\7"+
		"\61\2\2\u01a6b\3\2\2\2\u01a7\u01a8\7\'\2\2\u01a8d\3\2\2\2\u01a9\u01aa"+
		"\7-\2\2\u01aaf\3\2\2\2\u01ab\u01ac\7/\2\2\u01ach\3\2\2\2\u01ad\u01ae\7"+
		">\2\2\u01aej\3\2\2\2\u01af\u01b0\7>\2\2\u01b0\u01b1\7?\2\2\u01b1l\3\2"+
		"\2\2\u01b2\u01b3\7?\2\2\u01b3\u01b4\7?\2\2\u01b4n\3\2\2\2\u01b5\u01b6"+
		"\7#\2\2\u01b6\u01b7\7?\2\2\u01b7p\3\2\2\2\u01b8\u01b9\7@\2\2\u01b9\u01ba"+
		"\7?\2\2\u01bar\3\2\2\2\u01bb\u01bc\7@\2\2\u01bct\3\2\2\2\u01bd\u01be\7"+
		"(\2\2\u01bev\3\2\2\2\u01bf\u01c0\7~\2\2\u01c0x\3\2\2\2\u01c1\u01c2\7`"+
		"\2\2\u01c2z\3\2\2\2\u01c3\u01c4\7(\2\2\u01c4\u01c5\7(\2\2\u01c5|\3\2\2"+
		"\2\u01c6\u01c7\7~\2\2\u01c7\u01c8\7~\2\2\u01c8~\3\2\2\2\u01c9\u01ca\7"+
		"A\2\2\u01ca\u0080\3\2\2\2\u01cb\u01cc\7>\2\2\u01cc\u01cd\7/\2\2\u01cd"+
		"\u0082\3\2\2\2\u01ce\u01cf\7?\2\2\u01cf\u01d0\7@\2\2\u01d0\u0084\3\2\2"+
		"\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5"+
		"\7m\2\2\u01d5\u0086\3\2\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d8\7g\2\2\u01d8"+
		"\u01d9\7r\2\2\u01d9\u0088\3\2\2\2\u01da\u01db\7i\2\2\u01db\u01dc\7q\2"+
		"\2\u01dc\u01dd\7c\2\2\u01dd\u01de\7n\2\2\u01de\u008a\3\2\2\2\u01df\u01e0"+
		"\7r\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7t\2\2\u01e2\u008c\3\2\2\2\u01e3"+
		"\u01e4\7r\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7c\2\2"+
		"\u01e7\u01e8\7n\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb"+
		"\7n\2\2\u01eb\u008e\3\2\2\2\u01ec\u01ed\7~\2\2\u01ed\u01ee\7?\2\2\u01ee"+
		"\u0090\3\2\2\2\u01ef\u01f0\7(\2\2\u01f0\u01f1\7?\2\2\u01f1\u0092\3\2\2"+
		"\2\u01f2\u01f3\7\61\2\2\u01f3\u01f4\7?\2\2\u01f4\u0094\3\2\2\2\u01f5\u01f6"+
		"\7,\2\2\u01f6\u01f7\7?\2\2\u01f7\u0096\3\2\2\2\u01f8\u01f9\7/\2\2\u01f9"+
		"\u01fa\7?\2\2\u01fa\u0098\3\2\2\2\u01fb\u01fc\7-\2\2\u01fc\u01fd\7?\2"+
		"\2\u01fd\u009a\3\2\2\2\u01fe\u0213\7\62\2\2\u01ff\u0203\4\63;\2\u0200"+
		"\u0202\4\62;\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0213\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\u0208\7\62\2\2\u0207\u0209\4\629\2\u0208\u0207\3\2\2\2\u0209\u020a\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0213\3\2\2\2\u020c"+
		"\u020e\5\u00a3R\2\u020d\u020f\5\u00a5S\2\u020e\u020d\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u01fe\3\2\2\2\u0212\u01ff\3\2\2\2\u0212\u0206\3\2\2\2\u0212\u020c\3\2"+
		"\2\2\u0213\u009c\3\2\2\2\u0214\u021c\7^\2\2\u0215\u021d\t\2\2\2\u0216"+
		"\u0217\4\62\65\2\u0217\u0218\4\629\2\u0218\u021d\4\629\2\u0219\u021a\4"+
		"\629\2\u021a\u021d\4\629\2\u021b\u021d\4\629\2\u021c\u0215\3\2\2\2\u021c"+
		"\u0216\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u009e\3\2"+
		"\2\2\u021e\u0222\7^\2\2\u021f\u0223\t\3\2\2\u0220\u0221\7\17\2\2\u0221"+
		"\u0223\7\f\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u00a0\3\2"+
		"\2\2\u0224\u0226\t\4\2\2\u0225\u0227\t\5\2\2\u0226\u0225\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u022a\4\62;\2\u0229\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u00a2\3\2\2\2\u022d\u022e\7\62\2\2\u022e\u0232\7z\2\2\u022f\u0230\7\62"+
		"\2\2\u0230\u0232\7Z\2\2\u0231\u022d\3\2\2\2\u0231\u022f\3\2\2\2\u0232"+
		"\u00a4\3\2\2\2\u0233\u0234\t\6\2\2\u0234\u00a6\3\2\2\2\u0235\u0237\4\62"+
		";\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\7\60\2\2\u023b\u023d\4"+
		"\62;\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\5\u00a1"+
		"Q\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0259\3\2\2\2\u0244"+
		"\u0246\7\60\2\2\u0245\u0247\4\62;\2\u0246\u0245\3\2\2\2\u0247\u0248\3"+
		"\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u024c\5\u00a1Q\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0259"+
		"\3\2\2\2\u024d\u024f\4\62;\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0259\5\u00a1"+
		"Q\2\u0253\u0255\4\62;\2\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0236\3\2"+
		"\2\2\u0258\u0244\3\2\2\2\u0258\u024e\3\2\2\2\u0258\u0254\3\2\2\2\u0259"+
		"\u00a8\3\2\2\2\u025a\u025d\5\u009fP\2\u025b\u025d\n\3\2\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u00aa\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7p"+
		"\2\2\u0262\u0263\7w\2\2\u0263\u0264\7n\2\2\u0264\u0265\7n\2\2\u0265\u00ac"+
		"\3\2\2\2\u0266\u0267\7v\2\2\u0267\u0268\7t\2\2\u0268\u0269\7w\2\2\u0269"+
		"\u0270\7g\2\2\u026a\u026b\7h\2\2\u026b\u026c\7c\2\2\u026c\u026d\7n\2\2"+
		"\u026d\u026e\7u\2\2\u026e\u0270\7g\2\2\u026f\u0266\3\2\2\2\u026f\u026a"+
		"\3\2\2\2\u0270\u00ae\3\2\2\2\u0271\u0272\5\u009bN\2\u0272\u00b0\3\2\2"+
		"\2\u0273\u0274\5\u00a7T\2\u0274\u00b2\3\2\2\2\u0275\u027b\7$\2\2\u0276"+
		"\u027a\n\7\2\2\u0277\u0278\7^\2\2\u0278\u027a\13\2\2\2\u0279\u0276\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7$"+
		"\2\2\u027f\u00b4\3\2\2\2\u0280\u0284\7)\2\2\u0281\u0283\n\b\2\2\u0282"+
		"\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2"+
		"\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7)\2\2\u0288"+
		"\u00b6\3\2\2\2\u0289\u028a\7j\2\2\u028a\u028b\7g\2\2\u028b\u028c\7n\2"+
		"\2\u028c\u028d\7r\2\2\u028d\u028f\3\2\2\2\u028e\u0290\t\t\2\2\u028f\u028e"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\5\u00a9U\2\u0294\u00b8\3\2\2\2\u0295\u0296"+
		"\7u\2\2\u0296\u0297\7{\2\2\u0297\u0298\7u\2\2\u0298\u029a\3\2\2\2\u0299"+
		"\u029b\t\t\2\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\5\u00a9U\2\u029f"+
		"\u00ba\3\2\2\2\u02a0\u02a1\7v\2\2\u02a1\u02a2\7c\2\2\u02a2\u02a3\7u\2"+
		"\2\u02a3\u02a4\7m\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\t\t\2\2\u02a6\u02a5"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ab\n\n\2\2\u02ab\u02ac\5\u00a9U\2\u02ac\u00bc"+
		"\3\2\2\2\u02ad\u02ae\7\61\2\2\u02ae\u02af\7,\2\2\u02af\u02b3\3\2\2\2\u02b0"+
		"\u02b2\13\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b4\3"+
		"\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02b7\7,\2\2\u02b7\u02b8\7\61\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\b_"+
		"\2\2\u02ba\u00be\3\2\2\2\u02bb\u02bc\7\61\2\2\u02bc\u02bd\7\61\2\2\u02bd"+
		"\u02c1\3\2\2\2\u02be\u02c0\n\3\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2"+
		"\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c4\u02c5\b`\3\2\u02c5\u00c0\3\2\2\2\u02c6\u02ca\7%\2"+
		"\2\u02c7\u02c9\n\3\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd"+
		"\u02ce\ba\4\2\u02ce\u00c2\3\2\2\2\u02cf\u02d3\t\13\2\2\u02d0\u02d2\t\f"+
		"\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u00c4\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02de\t\r"+
		"\2\2\u02d7\u02d8\7^\2\2\u02d8\u02de\7\f\2\2\u02d9\u02da\7^\2\2\u02da\u02db"+
		"\7\17\2\2\u02db\u02de\7\f\2\2\u02dc\u02de\7\16\2\2\u02dd\u02d6\3\2\2\2"+
		"\u02dd\u02d7\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e0\bc\5\2\u02e0\u00c6\3\2\2\2\"\2\u0203\u020a\u0210"+
		"\u0212\u021c\u0222\u0226\u022b\u0231\u0238\u023e\u0242\u0248\u024b\u0250"+
		"\u0256\u0258\u025c\u025e\u026f\u0279\u027b\u0284\u0291\u029c\u02a8\u02b3"+
		"\u02c1\u02ca\u02d3\u02dd\6\3_\2\3`\3\3a\4\3c\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}