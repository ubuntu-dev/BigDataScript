// Generated from BigDataScript.g4 by ANTLR 4.2.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__64=1, T__63=2, T__62=3, T__61=4, T__60=5, T__59=6, T__58=7, T__57=8, 
		T__56=9, T__55=10, T__54=11, T__53=12, T__52=13, T__51=14, T__50=15, T__49=16, 
		T__48=17, T__47=18, T__46=19, T__45=20, T__44=21, T__43=22, T__42=23, 
		T__41=24, T__40=25, T__39=26, T__38=27, T__37=28, T__36=29, T__35=30, 
		T__34=31, T__33=32, T__32=33, T__31=34, T__30=35, T__29=36, T__28=37, 
		T__27=38, T__26=39, T__25=40, T__24=41, T__23=42, T__22=43, T__21=44, 
		T__20=45, T__19=46, T__18=47, T__17=48, T__16=49, T__15=50, T__14=51, 
		T__13=52, T__12=53, T__11=54, T__10=55, T__9=56, T__8=57, T__7=58, T__6=59, 
		T__5=60, T__4=61, T__3=62, T__2=63, T__1=64, T__0=65, BOOL_LITERAL=66, 
		INT_LITERAL=67, REAL_LITERAL=68, STRING_LITERAL=69, STRING_LITERAL_SINGLE=70, 
		SYS_LITERAL=71, TASK_LITERAL=72, COMMENT=73, COMMENT_LINE=74, COMMENT_LINE_HASH=75, 
		ID=76, WS=77;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+='", "'!='", "'while'", "'{'", "'void'", "'&&'", "'='", "'^'", "'for'", 
		"'error'", "'|='", "'int'", "'include'", "'task'", "'('", "'-='", "','", 
		"'/='", "'kill'", "'<-'", "'\n'", "'exit'", "'>='", "'<'", "'++'", "']'", 
		"'~'", "'wait'", "'dep'", "'+'", "'*='", "'/'", "'continue'", "'&='", 
		"'return'", "'||'", "';'", "'}'", "'if'", "'?'", "'warning'", "':='", 
		"'<='", "'break'", "'&'", "'*'", "'.'", "'parallel'", "'par'", "':'", 
		"'['", "'=='", "'--'", "'|'", "'>'", "'bool'", "'=>'", "'!'", "'string'", 
		"'checkpoint'", "'%'", "'else'", "')'", "'-'", "'real'", "BOOL_LITERAL", 
		"INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", "STRING_LITERAL_SINGLE", 
		"SYS_LITERAL", "TASK_LITERAL", "COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", 
		"ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__64", "T__63", "T__62", "T__61", "T__60", "T__59", "T__58", "T__57", 
		"T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", "T__49", 
		"T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", 
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"IntegerNumber", "EscapeSequence", "EscapedNewLine", "Exponent", "HexPrefix", 
		"HexDigit", "NonIntegerNumber", "SysMultiLine", "BOOL_LITERAL", "INT_LITERAL", 
		"REAL_LITERAL", "STRING_LITERAL", "STRING_LITERAL_SINGLE", "SYS_LITERAL", 
		"TASK_LITERAL", "COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", "ID", 
		"WS"
	};


	public BigDataScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigDataScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 80: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 81: COMMENT_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 82: COMMENT_LINE_HASH_action((RuleContext)_localctx, actionIndex); break;

		case 84: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_LINE_HASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void COMMENT_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2O\u0264\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\39\3"+
		"9\39\3:\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3?\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\7C\u019e"+
		"\nC\fC\16C\u01a1\13C\3C\3C\6C\u01a5\nC\rC\16C\u01a6\3C\3C\6C\u01ab\nC"+
		"\rC\16C\u01ac\5C\u01af\nC\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01b9\nD\3E\3E\3"+
		"E\3E\5E\u01bf\nE\3F\3F\5F\u01c3\nF\3F\6F\u01c6\nF\rF\16F\u01c7\3G\3G\3"+
		"G\3G\5G\u01ce\nG\3H\3H\3I\6I\u01d3\nI\rI\16I\u01d4\3I\3I\7I\u01d9\nI\f"+
		"I\16I\u01dc\13I\3I\5I\u01df\nI\3I\3I\6I\u01e3\nI\rI\16I\u01e4\3I\5I\u01e8"+
		"\nI\3I\6I\u01eb\nI\rI\16I\u01ec\3I\3I\6I\u01f1\nI\rI\16I\u01f2\5I\u01f5"+
		"\nI\3J\3J\7J\u01f9\nJ\fJ\16J\u01fc\13J\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0207"+
		"\nK\3L\3L\3M\3M\3N\3N\3N\3N\7N\u0211\nN\fN\16N\u0214\13N\3N\3N\3O\3O\7"+
		"O\u021a\nO\fO\16O\u021d\13O\3O\3O\3P\3P\3P\3P\3P\6P\u0226\nP\rP\16P\u0227"+
		"\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u0232\nQ\rQ\16Q\u0233\3Q\3Q\3Q\3R\3R\3R\3"+
		"R\7R\u023d\nR\fR\16R\u0240\13R\3R\3R\3R\3R\3R\3S\3S\3S\3S\7S\u024b\nS"+
		"\fS\16S\u024e\13S\3S\3S\3T\3T\7T\u0254\nT\fT\16T\u0257\13T\3T\3T\3U\3"+
		"U\7U\u025d\nU\fU\16U\u0260\13U\3V\3V\3V\3\u023e\2W\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095D\u0097E\u0099F\u009bG\u009dH\u009fI\u00a1J\u00a3K\u00a5"+
		"L\u00a7M\u00a9N\u00abO\3\2\16\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\4\2GG"+
		"gg\4\2--//\5\2\62;CHch\4\2$$^^\3\2))\4\2\13\13\"\"\6\2\f\f\17\17**}}\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\17\"\"\u027e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3"+
		"\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2"+
		"\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2\2\5\u00b0\3\2\2\2\7\u00b3\3\2\2"+
		"\2\t\u00b9\3\2\2\2\13\u00bb\3\2\2\2\r\u00c0\3\2\2\2\17\u00c3\3\2\2\2\21"+
		"\u00c5\3\2\2\2\23\u00c7\3\2\2\2\25\u00cb\3\2\2\2\27\u00d1\3\2\2\2\31\u00d4"+
		"\3\2\2\2\33\u00d8\3\2\2\2\35\u00e0\3\2\2\2\37\u00e5\3\2\2\2!\u00e7\3\2"+
		"\2\2#\u00ea\3\2\2\2%\u00ec\3\2\2\2\'\u00ef\3\2\2\2)\u00f4\3\2\2\2+\u00f7"+
		"\3\2\2\2-\u00f9\3\2\2\2/\u00fe\3\2\2\2\61\u0101\3\2\2\2\63\u0103\3\2\2"+
		"\2\65\u0106\3\2\2\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010f\3\2\2\2=\u0113"+
		"\3\2\2\2?\u0115\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u0123\3\2\2\2G"+
		"\u0126\3\2\2\2I\u012d\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2"+
		"\2\2Q\u0137\3\2\2\2S\u0139\3\2\2\2U\u0141\3\2\2\2W\u0144\3\2\2\2Y\u0147"+
		"\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_\u0151\3\2\2\2a\u0153\3\2\2\2c"+
		"\u015c\3\2\2\2e\u0160\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2\2\2k\u0167\3\2"+
		"\2\2m\u016a\3\2\2\2o\u016c\3\2\2\2q\u016e\3\2\2\2s\u0173\3\2\2\2u\u0176"+
		"\3\2\2\2w\u0178\3\2\2\2y\u017f\3\2\2\2{\u018a\3\2\2\2}\u018c\3\2\2\2\177"+
		"\u0191\3\2\2\2\u0081\u0193\3\2\2\2\u0083\u0195\3\2\2\2\u0085\u01ae\3\2"+
		"\2\2\u0087\u01b0\3\2\2\2\u0089\u01ba\3\2\2\2\u008b\u01c0\3\2\2\2\u008d"+
		"\u01cd\3\2\2\2\u008f\u01cf\3\2\2\2\u0091\u01f4\3\2\2\2\u0093\u01fa\3\2"+
		"\2\2\u0095\u0206\3\2\2\2\u0097\u0208\3\2\2\2\u0099\u020a\3\2\2\2\u009b"+
		"\u020c\3\2\2\2\u009d\u0217\3\2\2\2\u009f\u0220\3\2\2\2\u00a1\u022b\3\2"+
		"\2\2\u00a3\u0238\3\2\2\2\u00a5\u0246\3\2\2\2\u00a7\u0251\3\2\2\2\u00a9"+
		"\u025a\3\2\2\2\u00ab\u0261\3\2\2\2\u00ad\u00ae\7-\2\2\u00ae\u00af\7?\2"+
		"\2\u00af\4\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7?\2\2\u00b2\6\3\2\2"+
		"\2\u00b3\u00b4\7y\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\n"+
		"\3\2\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\f\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\7(\2\2\u00c2"+
		"\16\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\20\3\2\2\2\u00c5\u00c6\7`\2\2\u00c6"+
		"\22\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\24\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7t\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\26\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2"+
		"\u00d3\7?\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\32\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7e\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7f\2\2"+
		"\u00de\u00df\7g\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7"+
		"c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7m\2\2\u00e4\36\3\2\2\2\u00e5\u00e6"+
		"\7*\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\7?\2\2\u00e9\"\3"+
		"\2\2\2\u00ea\u00eb\7.\2\2\u00eb$\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee&\3\2\2\2\u00ef\u00f0\7m\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2"+
		"\7n\2\2\u00f2\u00f3\7n\2\2\u00f3(\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6"+
		"\7/\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7\f\2\2\u00f8,\3\2\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		".\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100\60\3\2\2\2\u0101"+
		"\u0102\7>\2\2\u0102\62\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105\7-\2\2\u0105"+
		"\64\3\2\2\2\u0106\u0107\7_\2\2\u0107\66\3\2\2\2\u0108\u0109\7\u0080\2"+
		"\2\u01098\3\2\2\2\u010a\u010b\7y\2\2\u010b\u010c\7c\2\2\u010c\u010d\7"+
		"k\2\2\u010d\u010e\7v\2\2\u010e:\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0112\7r\2\2\u0112<\3\2\2\2\u0113\u0114\7-\2\2\u0114>\3"+
		"\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7?\2\2\u0117@\3\2\2\2\u0118\u0119"+
		"\7\61\2\2\u0119B\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c\7q\2\2\u011c\u011d"+
		"\7p\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7w\2\2\u0121\u0122\7g\2\2\u0122D\3\2\2\2\u0123\u0124\7(\2\2\u0124"+
		"\u0125\7?\2\2\u0125F\3\2\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7w\2\2\u012a\u012b\7t\2\2\u012b\u012c\7p\2\2"+
		"\u012cH\3\2\2\2\u012d\u012e\7~\2\2\u012e\u012f\7~\2\2\u012fJ\3\2\2\2\u0130"+
		"\u0131\7=\2\2\u0131L\3\2\2\2\u0132\u0133\7\177\2\2\u0133N\3\2\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7h\2\2\u0136P\3\2\2\2\u0137\u0138\7A\2\2\u0138"+
		"R\3\2\2\2\u0139\u013a\7y\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f\u0140\7i\2\2"+
		"\u0140T\3\2\2\2\u0141\u0142\7<\2\2\u0142\u0143\7?\2\2\u0143V\3\2\2\2\u0144"+
		"\u0145\7>\2\2\u0145\u0146\7?\2\2\u0146X\3\2\2\2\u0147\u0148\7d\2\2\u0148"+
		"\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a\u014b\7c\2\2\u014b\u014c\7m\2\2"+
		"\u014cZ\3\2\2\2\u014d\u014e\7(\2\2\u014e\\\3\2\2\2\u014f\u0150\7,\2\2"+
		"\u0150^\3\2\2\2\u0151\u0152\7\60\2\2\u0152`\3\2\2\2\u0153\u0154\7r\2\2"+
		"\u0154\u0155\7c\2\2\u0155\u0156\7t\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7n\2\2\u0158\u0159\7n\2\2\u0159\u015a\7g\2\2\u015a\u015b\7n\2\2\u015b"+
		"b\3\2\2\2\u015c\u015d\7r\2\2\u015d\u015e\7c\2\2\u015e\u015f\7t\2\2\u015f"+
		"d\3\2\2\2\u0160\u0161\7<\2\2\u0161f\3\2\2\2\u0162\u0163\7]\2\2\u0163h"+
		"\3\2\2\2\u0164\u0165\7?\2\2\u0165\u0166\7?\2\2\u0166j\3\2\2\2\u0167\u0168"+
		"\7/\2\2\u0168\u0169\7/\2\2\u0169l\3\2\2\2\u016a\u016b\7~\2\2\u016bn\3"+
		"\2\2\2\u016c\u016d\7@\2\2\u016dp\3\2\2\2\u016e\u016f\7d\2\2\u016f\u0170"+
		"\7q\2\2\u0170\u0171\7q\2\2\u0171\u0172\7n\2\2\u0172r\3\2\2\2\u0173\u0174"+
		"\7?\2\2\u0174\u0175\7@\2\2\u0175t\3\2\2\2\u0176\u0177\7#\2\2\u0177v\3"+
		"\2\2\2\u0178\u0179\7u\2\2\u0179\u017a\7v\2\2\u017a\u017b\7t\2\2\u017b"+
		"\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d\u017e\7i\2\2\u017ex\3\2\2\2\u017f"+
		"\u0180\7e\2\2\u0180\u0181\7j\2\2\u0181\u0182\7g\2\2\u0182\u0183\7e\2\2"+
		"\u0183\u0184\7m\2\2\u0184\u0185\7r\2\2\u0185\u0186\7q\2\2\u0186\u0187"+
		"\7k\2\2\u0187\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189z\3\2\2\2\u018a\u018b"+
		"\7\'\2\2\u018b|\3\2\2\2\u018c\u018d\7g\2\2\u018d\u018e\7n\2\2\u018e\u018f"+
		"\7u\2\2\u018f\u0190\7g\2\2\u0190~\3\2\2\2\u0191\u0192\7+\2\2\u0192\u0080"+
		"\3\2\2\2\u0193\u0194\7/\2\2\u0194\u0082\3\2\2\2\u0195\u0196\7t\2\2\u0196"+
		"\u0197\7g\2\2\u0197\u0198\7c\2\2\u0198\u0199\7n\2\2\u0199\u0084\3\2\2"+
		"\2\u019a\u01af\7\62\2\2\u019b\u019f\4\63;\2\u019c\u019e\4\62;\2\u019d"+
		"\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01af\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\7\62\2\2\u01a3"+
		"\u01a5\4\629\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01af\3\2\2\2\u01a8\u01aa\5\u008dG\2\u01a9"+
		"\u01ab\5\u008fH\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u019a\3\2\2\2\u01ae"+
		"\u019b\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a8\3\2\2\2\u01af\u0086\3\2"+
		"\2\2\u01b0\u01b8\7^\2\2\u01b1\u01b9\t\2\2\2\u01b2\u01b3\4\62\65\2\u01b3"+
		"\u01b4\4\629\2\u01b4\u01b9\4\629\2\u01b5\u01b6\4\629\2\u01b6\u01b9\4\62"+
		"9\2\u01b7\u01b9\4\629\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8"+
		"\u01b5\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u0088\3\2\2\2\u01ba\u01be\7^"+
		"\2\2\u01bb\u01bf\t\3\2\2\u01bc\u01bd\7\17\2\2\u01bd\u01bf\7\f\2\2\u01be"+
		"\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u008a\3\2\2\2\u01c0\u01c2\t\4"+
		"\2\2\u01c1\u01c3\t\5\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c6\4\62;\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u008c\3\2\2\2\u01c9"+
		"\u01ca\7\62\2\2\u01ca\u01ce\7z\2\2\u01cb\u01cc\7\62\2\2\u01cc\u01ce\7"+
		"Z\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u008e\3\2\2\2\u01cf"+
		"\u01d0\t\6\2\2\u01d0\u0090\3\2\2\2\u01d1\u01d3\4\62;\2\u01d2\u01d1\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01da\7\60\2\2\u01d7\u01d9\4\62;\2\u01d8\u01d7\3"+
		"\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df\5\u008bF\2\u01de\u01dd"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01f5\3\2\2\2\u01e0\u01e2\7\60\2\2"+
		"\u01e1\u01e3\4\62;\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8\5\u008bF"+
		"\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01f5\3\2\2\2\u01e9\u01eb"+
		"\4\62;\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f5\5\u008bF\2\u01ef\u01f1"+
		"\4\62;\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01d2\3\2\2\2\u01f4\u01e0\3\2"+
		"\2\2\u01f4\u01ea\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5\u0092\3\2\2\2\u01f6"+
		"\u01f9\5\u0089E\2\u01f7\u01f9\n\3\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u0094\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7t\2"+
		"\2\u01ff\u0200\7w\2\2\u0200\u0207\7g\2\2\u0201\u0202\7h\2\2\u0202\u0203"+
		"\7c\2\2\u0203\u0204\7n\2\2\u0204\u0205\7u\2\2\u0205\u0207\7g\2\2\u0206"+
		"\u01fd\3\2\2\2\u0206\u0201\3\2\2\2\u0207\u0096\3\2\2\2\u0208\u0209\5\u0085"+
		"C\2\u0209\u0098\3\2\2\2\u020a\u020b\5\u0091I\2\u020b\u009a\3\2\2\2\u020c"+
		"\u0212\7$\2\2\u020d\u0211\n\7\2\2\u020e\u020f\7^\2\2\u020f\u0211\13\2"+
		"\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0216\7$\2\2\u0216\u009c\3\2\2\2\u0217\u021b\7)\2\2\u0218\u021a"+
		"\n\b\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7)"+
		"\2\2\u021f\u009e\3\2\2\2\u0220\u0221\7u\2\2\u0221\u0222\7{\2\2\u0222\u0223"+
		"\7u\2\2\u0223\u0225\3\2\2\2\u0224\u0226\t\t\2\2\u0225\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022a\5\u0093J\2\u022a\u00a0\3\2\2\2\u022b\u022c\7v\2\2\u022c"+
		"\u022d\7c\2\2\u022d\u022e\7u\2\2\u022e\u022f\7m\2\2\u022f\u0231\3\2\2"+
		"\2\u0230\u0232\t\t\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\n\n\2\2\u0236"+
		"\u0237\5\u0093J\2\u0237\u00a2\3\2\2\2\u0238\u0239\7\61\2\2\u0239\u023a"+
		"\7,\2\2\u023a\u023e\3\2\2\2\u023b\u023d\13\2\2\2\u023c\u023b\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0241\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0241\u0242\7,\2\2\u0242\u0243\7\61\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\bR\2\2\u0245\u00a4\3\2\2\2\u0246\u0247\7\61"+
		"\2\2\u0247\u0248\7\61\2\2\u0248\u024c\3\2\2\2\u0249\u024b\n\3\2\2\u024a"+
		"\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\bS\3\2\u0250"+
		"\u00a6\3\2\2\2\u0251\u0255\7%\2\2\u0252\u0254\n\3\2\2\u0253\u0252\3\2"+
		"\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\bT\4\2\u0259\u00a8\3\2"+
		"\2\2\u025a\u025e\t\13\2\2\u025b\u025d\t\f\2\2\u025c\u025b\3\2\2\2\u025d"+
		"\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u00aa\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0261\u0262\t\r\2\2\u0262\u0263\bV\5\2\u0263"+
		"\u00ac\3\2\2\2 \2\u019f\u01a6\u01ac\u01ae\u01b8\u01be\u01c2\u01c7\u01cd"+
		"\u01d4\u01da\u01de\u01e4\u01e7\u01ec\u01f2\u01f4\u01f8\u01fa\u0206\u0210"+
		"\u0212\u021b\u0227\u0233\u023e\u024c\u0255\u025e\6\3R\2\3S\3\3T\4\3V\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}