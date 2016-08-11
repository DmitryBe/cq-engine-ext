// Generated from /Users/dmitry/github/scala-toolbox/src/main/antlr4/cqengineext/grammar/CQSqlGrammarExt.g4 by ANTLR 4.5.3
package io.toolbox.cqengineex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CQSqlGrammarExtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_LITERAL_WITH_TRAILING_PERCENT=1, STRING_LITERAL_WITH_LEADING_PERCENT=2, 
		STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT=3, F_HISTOGRAM=4, F_COUNT=5, 
		SCOL=6, DOT=7, OPEN_PAR=8, CLOSE_PAR=9, COMMA=10, ASSIGN=11, STAR=12, 
		PLUS=13, MINUS=14, TILDE=15, PIPE2=16, DIV=17, MOD=18, LT2=19, GT2=20, 
		AMP=21, PIPE=22, LT=23, LT_EQ=24, GT=25, GT_EQ=26, EQ=27, NOT_EQ1=28, 
		NOT_EQ2=29, K_ABORT=30, K_ACTION=31, K_ADD=32, K_AFTER=33, K_ALL=34, K_ALTER=35, 
		K_ANALYZE=36, K_AND=37, K_AS=38, K_ASC=39, K_ATTACH=40, K_AUTOINCREMENT=41, 
		K_BEFORE=42, K_BEGIN=43, K_BETWEEN=44, K_BY=45, K_CASCADE=46, K_CASE=47, 
		K_CAST=48, K_CHECK=49, K_COLLATE=50, K_COLUMN=51, K_COMMIT=52, K_CONFLICT=53, 
		K_CONSTRAINT=54, K_CREATE=55, K_CROSS=56, K_CURRENT_DATE=57, K_CURRENT_TIME=58, 
		K_CURRENT_TIMESTAMP=59, K_DATABASE=60, K_DEFAULT=61, K_DEFERRABLE=62, 
		K_DEFERRED=63, K_DELETE=64, K_DESC=65, K_DETACH=66, K_DISTINCT=67, K_DROP=68, 
		K_EACH=69, K_ELSE=70, K_END=71, K_ESCAPE=72, K_EXCEPT=73, K_EXCLUSIVE=74, 
		K_EXISTS=75, K_EXPLAIN=76, K_FAIL=77, K_FOR=78, K_FOREIGN=79, K_FROM=80, 
		K_FULL=81, K_GLOB=82, K_GROUP=83, K_HAVING=84, K_IF=85, K_IGNORE=86, K_IMMEDIATE=87, 
		K_IN=88, K_INDEX=89, K_INDEXED=90, K_INITIALLY=91, K_INNER=92, K_INSERT=93, 
		K_INSTEAD=94, K_INTERSECT=95, K_INTO=96, K_IS=97, K_ISNULL=98, K_JOIN=99, 
		K_KEY=100, K_LEFT=101, K_LIKE=102, K_LIMIT=103, K_MATCH=104, K_NATURAL=105, 
		K_NO=106, K_NOT=107, K_NOTNULL=108, K_NULL=109, K_OF=110, K_OFFSET=111, 
		K_ON=112, K_OR=113, K_ORDER=114, K_OUTER=115, K_PLAN=116, K_PRAGMA=117, 
		K_PRIMARY=118, K_QUERY=119, K_RAISE=120, K_RECURSIVE=121, K_REFERENCES=122, 
		K_REGEXP=123, K_REINDEX=124, K_RELEASE=125, K_RENAME=126, K_REPLACE=127, 
		K_RESTRICT=128, K_RIGHT=129, K_ROLLBACK=130, K_ROW=131, K_SAVEPOINT=132, 
		K_SELECT=133, K_SET=134, K_TABLE=135, K_TEMP=136, K_TEMPORARY=137, K_THEN=138, 
		K_TO=139, K_TRANSACTION=140, K_TRIGGER=141, K_UNION=142, K_UNIQUE=143, 
		K_UPDATE=144, K_USING=145, K_VACUUM=146, K_VALUES=147, K_VIEW=148, K_VIRTUAL=149, 
		K_WHEN=150, K_WHERE=151, K_WITH=152, K_WITHOUT=153, IDENTIFIER=154, NUMERIC_LITERAL=155, 
		BIND_PARAMETER=156, STRING_LITERAL=157, BLOB_LITERAL=158, SINGLE_LINE_COMMENT=159, 
		MULTILINE_COMMENT=160, SPACES=161, UNEXPECTED_CHAR=162;
	public static final int
		RULE_start = 0, RULE_indexedCollection = 1, RULE_whereClause = 2, RULE_orderByClause = 3, 
		RULE_groupByClause = 4, RULE_limitClause = 5, RULE_result_column_simple = 6, 
		RULE_histogramClause = 7, RULE_countClause = 8, RULE_query = 9, RULE_logicalQuery = 10, 
		RULE_andQuery = 11, RULE_orQuery = 12, RULE_notQuery = 13, RULE_simpleQuery = 14, 
		RULE_equalQuery = 15, RULE_notEqualQuery = 16, RULE_lessThanOrEqualToQuery = 17, 
		RULE_lessThanQuery = 18, RULE_greaterThanOrEqualToQuery = 19, RULE_greaterThanQuery = 20, 
		RULE_betweenQuery = 21, RULE_notBetweenQuery = 22, RULE_inQuery = 23, 
		RULE_notInQuery = 24, RULE_startsWithQuery = 25, RULE_endsWithQuery = 26, 
		RULE_containsQuery = 27, RULE_hasQuery = 28, RULE_notHasQuery = 29, RULE_attributeName = 30, 
		RULE_queryParameterTrailingPercent = 31, RULE_queryParameterLeadingPercent = 32, 
		RULE_queryParameterLeadingAndTrailingPercent = 33, RULE_queryParameter = 34, 
		RULE_attributeOrder = 35, RULE_direction = 36, RULE_parse = 37, RULE_error = 38, 
		RULE_sql_stmt_list = 39, RULE_sql_stmt = 40, RULE_alter_table_stmt = 41, 
		RULE_analyze_stmt = 42, RULE_attach_stmt = 43, RULE_begin_stmt = 44, RULE_commit_stmt = 45, 
		RULE_compound_select_stmt = 46, RULE_create_index_stmt = 47, RULE_create_table_stmt = 48, 
		RULE_create_trigger_stmt = 49, RULE_create_view_stmt = 50, RULE_create_virtual_table_stmt = 51, 
		RULE_delete_stmt = 52, RULE_delete_stmt_limited = 53, RULE_detach_stmt = 54, 
		RULE_drop_index_stmt = 55, RULE_drop_table_stmt = 56, RULE_drop_trigger_stmt = 57, 
		RULE_drop_view_stmt = 58, RULE_factored_select_stmt = 59, RULE_insert_stmt = 60, 
		RULE_pragma_stmt = 61, RULE_reindex_stmt = 62, RULE_release_stmt = 63, 
		RULE_rollback_stmt = 64, RULE_savepoint_stmt = 65, RULE_simple_select_stmt = 66, 
		RULE_select_stmt = 67, RULE_select_or_values = 68, RULE_update_stmt = 69, 
		RULE_update_stmt_limited = 70, RULE_vacuum_stmt = 71, RULE_column_def = 72, 
		RULE_type_name = 73, RULE_column_constraint = 74, RULE_conflict_clause = 75, 
		RULE_expr = 76, RULE_foreign_key_clause = 77, RULE_raise_function = 78, 
		RULE_indexed_column = 79, RULE_table_constraint = 80, RULE_with_clause = 81, 
		RULE_qualified_table_name = 82, RULE_ordering_term = 83, RULE_pragma_value = 84, 
		RULE_common_table_expression = 85, RULE_result_column = 86, RULE_table_or_subquery = 87, 
		RULE_join_clause = 88, RULE_join_operator = 89, RULE_join_constraint = 90, 
		RULE_select_core = 91, RULE_compound_operator = 92, RULE_cte_table_name = 93, 
		RULE_signed_number = 94, RULE_literal_value = 95, RULE_unary_operator = 96, 
		RULE_error_message = 97, RULE_module_argument = 98, RULE_column_alias = 99, 
		RULE_keyword = 100, RULE_name = 101, RULE_function_name = 102, RULE_database_name = 103, 
		RULE_table_name = 104, RULE_table_or_index_name = 105, RULE_new_table_name = 106, 
		RULE_column_name = 107, RULE_collation_name = 108, RULE_foreign_table = 109, 
		RULE_index_name = 110, RULE_trigger_name = 111, RULE_view_name = 112, 
		RULE_module_name = 113, RULE_pragma_name = 114, RULE_savepoint_name = 115, 
		RULE_table_alias = 116, RULE_transaction_name = 117, RULE_any_name = 118;
	public static final String[] ruleNames = {
		"start", "indexedCollection", "whereClause", "orderByClause", "groupByClause", 
		"limitClause", "result_column_simple", "histogramClause", "countClause", 
		"query", "logicalQuery", "andQuery", "orQuery", "notQuery", "simpleQuery", 
		"equalQuery", "notEqualQuery", "lessThanOrEqualToQuery", "lessThanQuery", 
		"greaterThanOrEqualToQuery", "greaterThanQuery", "betweenQuery", "notBetweenQuery", 
		"inQuery", "notInQuery", "startsWithQuery", "endsWithQuery", "containsQuery", 
		"hasQuery", "notHasQuery", "attributeName", "queryParameterTrailingPercent", 
		"queryParameterLeadingPercent", "queryParameterLeadingAndTrailingPercent", 
		"queryParameter", "attributeOrder", "direction", "parse", "error", "sql_stmt_list", 
		"sql_stmt", "alter_table_stmt", "analyze_stmt", "attach_stmt", "begin_stmt", 
		"commit_stmt", "compound_select_stmt", "create_index_stmt", "create_table_stmt", 
		"create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "compound_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "';'", "'.'", "'('", "')'", "','", 
		"'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", 
		"'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING_LITERAL_WITH_TRAILING_PERCENT", "STRING_LITERAL_WITH_LEADING_PERCENT", 
		"STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT", "F_HISTOGRAM", "F_COUNT", 
		"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
		"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
		"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", 
		"K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", 
		"K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", 
		"K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
		"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
		"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
		"K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
		"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", 
		"K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", 
		"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
		"K_OFFSET", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", 
		"K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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

	@Override
	public String getGrammarFileName() { return "CQSqlGrammarExt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CQSqlGrammarExtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(CQSqlGrammarExtParser.K_SELECT, 0); }
		public List<Result_column_simpleContext> result_column_simple() {
			return getRuleContexts(Result_column_simpleContext.class);
		}
		public Result_column_simpleContext result_column_simple(int i) {
			return getRuleContext(Result_column_simpleContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public IndexedCollectionContext indexedCollection() {
			return getRuleContext(IndexedCollectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CQSqlGrammarExtParser.EOF, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(K_SELECT);
			setState(239);
			result_column_simple();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				result_column_simple();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(K_FROM);
			setState(248);
			indexedCollection();
			setState(250);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(249);
				whereClause();
				}
			}

			setState(253);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(252);
				groupByClause();
				}
			}

			setState(256);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(255);
				orderByClause();
				}
			}

			setState(259);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(258);
				limitClause();
				}
			}

			setState(261);
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

	public static class IndexedCollectionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public IndexedCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterIndexedCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitIndexedCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitIndexedCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedCollectionContext indexedCollection() throws RecognitionException {
		IndexedCollectionContext _localctx = new IndexedCollectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_indexedCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(K_WHERE);
			setState(266);
			query();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<AttributeOrderContext> attributeOrder() {
			return getRuleContexts(AttributeOrderContext.class);
		}
		public AttributeOrderContext attributeOrder(int i) {
			return getRuleContext(AttributeOrderContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(K_ORDER);
			setState(269);
			match(K_BY);
			setState(270);
			attributeOrder();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				setState(272);
				attributeOrder();
				}
				}
				setState(277);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(CQSqlGrammarExtParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(K_GROUP);
			setState(279);
			match(K_BY);
			setState(280);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(CQSqlGrammarExtParser.NUMERIC_LITERAL, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(K_LIMIT);
			setState(283);
			match(NUMERIC_LITERAL);
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

	public static class Result_column_simpleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public CountClauseContext countClause() {
			return getRuleContext(CountClauseContext.class,0);
		}
		public HistogramClauseContext histogramClause() {
			return getRuleContext(HistogramClauseContext.class,0);
		}
		public Result_column_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterResult_column_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitResult_column_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitResult_column_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_column_simpleContext result_column_simple() throws RecognitionException {
		Result_column_simpleContext _localctx = new Result_column_simpleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_result_column_simple);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(STAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(IDENTIFIER);
				}
				break;
			case F_COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				countClause();
				}
				break;
			case F_HISTOGRAM:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				histogramClause();
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

	public static class HistogramClauseContext extends ParserRuleContext {
		public TerminalNode F_HISTOGRAM() { return getToken(CQSqlGrammarExtParser.F_HISTOGRAM, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(CQSqlGrammarExtParser.NUMERIC_LITERAL, 0); }
		public HistogramClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_histogramClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterHistogramClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitHistogramClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitHistogramClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistogramClauseContext histogramClause() throws RecognitionException {
		HistogramClauseContext _localctx = new HistogramClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_histogramClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(F_HISTOGRAM);
			setState(292);
			match(OPEN_PAR);
			setState(293);
			match(NUMERIC_LITERAL);
			setState(294);
			match(CLOSE_PAR);
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

	public static class CountClauseContext extends ParserRuleContext {
		public TerminalNode F_COUNT() { return getToken(CQSqlGrammarExtParser.F_COUNT, 0); }
		public TerminalNode STAR() { return getToken(CQSqlGrammarExtParser.STAR, 0); }
		public CountClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCountClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCountClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCountClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountClauseContext countClause() throws RecognitionException {
		CountClauseContext _localctx = new CountClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_countClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(F_COUNT);
			setState(297);
			match(OPEN_PAR);
			setState(298);
			match(STAR);
			setState(299);
			match(CLOSE_PAR);
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

	public static class QueryContext extends ParserRuleContext {
		public LogicalQueryContext logicalQuery() {
			return getRuleContext(LogicalQueryContext.class,0);
		}
		public SimpleQueryContext simpleQuery() {
			return getRuleContext(SimpleQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_query);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				logicalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				simpleQuery();
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

	public static class LogicalQueryContext extends ParserRuleContext {
		public AndQueryContext andQuery() {
			return getRuleContext(AndQueryContext.class,0);
		}
		public OrQueryContext orQuery() {
			return getRuleContext(OrQueryContext.class,0);
		}
		public NotQueryContext notQuery() {
			return getRuleContext(NotQueryContext.class,0);
		}
		public LogicalQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterLogicalQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitLogicalQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitLogicalQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalQueryContext logicalQuery() throws RecognitionException {
		LogicalQueryContext _localctx = new LogicalQueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalQuery);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				andQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				orQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				notQuery();
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

	public static class AndQueryContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(CQSqlGrammarExtParser.OPEN_PAR, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> K_AND() { return getTokens(CQSqlGrammarExtParser.K_AND); }
		public TerminalNode K_AND(int i) {
			return getToken(CQSqlGrammarExtParser.K_AND, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CQSqlGrammarExtParser.CLOSE_PAR, 0); }
		public AndQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAndQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAndQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAndQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndQueryContext andQuery() throws RecognitionException {
		AndQueryContext _localctx = new AndQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_andQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPEN_PAR);
			setState(311);
			query();
			setState(312);
			match(K_AND);
			setState(313);
			query();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(314);
				match(K_AND);
				setState(315);
				query();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(CLOSE_PAR);
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

	public static class OrQueryContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(CQSqlGrammarExtParser.OPEN_PAR, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> K_OR() { return getTokens(CQSqlGrammarExtParser.K_OR); }
		public TerminalNode K_OR(int i) {
			return getToken(CQSqlGrammarExtParser.K_OR, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CQSqlGrammarExtParser.CLOSE_PAR, 0); }
		public OrQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterOrQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitOrQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitOrQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrQueryContext orQuery() throws RecognitionException {
		OrQueryContext _localctx = new OrQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(OPEN_PAR);
			setState(324);
			query();
			setState(325);
			match(K_OR);
			setState(326);
			query();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_OR) {
				{
				{
				setState(327);
				match(K_OR);
				setState(328);
				query();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(CLOSE_PAR);
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

	public static class NotQueryContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public NotQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNotQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNotQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNotQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotQueryContext notQuery() throws RecognitionException {
		NotQueryContext _localctx = new NotQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_notQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(K_NOT);
			setState(337);
			query();
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

	public static class SimpleQueryContext extends ParserRuleContext {
		public EqualQueryContext equalQuery() {
			return getRuleContext(EqualQueryContext.class,0);
		}
		public NotEqualQueryContext notEqualQuery() {
			return getRuleContext(NotEqualQueryContext.class,0);
		}
		public LessThanOrEqualToQueryContext lessThanOrEqualToQuery() {
			return getRuleContext(LessThanOrEqualToQueryContext.class,0);
		}
		public LessThanQueryContext lessThanQuery() {
			return getRuleContext(LessThanQueryContext.class,0);
		}
		public GreaterThanOrEqualToQueryContext greaterThanOrEqualToQuery() {
			return getRuleContext(GreaterThanOrEqualToQueryContext.class,0);
		}
		public GreaterThanQueryContext greaterThanQuery() {
			return getRuleContext(GreaterThanQueryContext.class,0);
		}
		public BetweenQueryContext betweenQuery() {
			return getRuleContext(BetweenQueryContext.class,0);
		}
		public NotBetweenQueryContext notBetweenQuery() {
			return getRuleContext(NotBetweenQueryContext.class,0);
		}
		public InQueryContext inQuery() {
			return getRuleContext(InQueryContext.class,0);
		}
		public NotInQueryContext notInQuery() {
			return getRuleContext(NotInQueryContext.class,0);
		}
		public StartsWithQueryContext startsWithQuery() {
			return getRuleContext(StartsWithQueryContext.class,0);
		}
		public EndsWithQueryContext endsWithQuery() {
			return getRuleContext(EndsWithQueryContext.class,0);
		}
		public ContainsQueryContext containsQuery() {
			return getRuleContext(ContainsQueryContext.class,0);
		}
		public HasQueryContext hasQuery() {
			return getRuleContext(HasQueryContext.class,0);
		}
		public NotHasQueryContext notHasQuery() {
			return getRuleContext(NotHasQueryContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(CQSqlGrammarExtParser.OPEN_PAR, 0); }
		public SimpleQueryContext simpleQuery() {
			return getRuleContext(SimpleQueryContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CQSqlGrammarExtParser.CLOSE_PAR, 0); }
		public SimpleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSimpleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSimpleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSimpleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleQueryContext simpleQuery() throws RecognitionException {
		SimpleQueryContext _localctx = new SimpleQueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleQuery);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				equalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				notEqualQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				lessThanOrEqualToQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				lessThanQuery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				greaterThanOrEqualToQuery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				greaterThanQuery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				betweenQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				notBetweenQuery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				inQuery();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				notInQuery();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(349);
				startsWithQuery();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(350);
				endsWithQuery();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(351);
				containsQuery();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(352);
				hasQuery();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(353);
				notHasQuery();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(354);
				match(OPEN_PAR);
				setState(355);
				simpleQuery();
				setState(356);
				match(CLOSE_PAR);
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

	public static class EqualQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CQSqlGrammarExtParser.ASSIGN, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public EqualQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterEqualQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitEqualQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitEqualQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualQueryContext equalQuery() throws RecognitionException {
		EqualQueryContext _localctx = new EqualQueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			attributeName();
			setState(361);
			match(ASSIGN);
			setState(362);
			queryParameter();
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

	public static class NotEqualQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode NOT_EQ2() { return getToken(CQSqlGrammarExtParser.NOT_EQ2, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public NotEqualQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNotEqualQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNotEqualQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNotEqualQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualQueryContext notEqualQuery() throws RecognitionException {
		NotEqualQueryContext _localctx = new NotEqualQueryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notEqualQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			attributeName();
			setState(365);
			match(NOT_EQ2);
			setState(366);
			queryParameter();
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

	public static class LessThanOrEqualToQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode LT_EQ() { return getToken(CQSqlGrammarExtParser.LT_EQ, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public LessThanOrEqualToQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEqualToQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterLessThanOrEqualToQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitLessThanOrEqualToQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitLessThanOrEqualToQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanOrEqualToQueryContext lessThanOrEqualToQuery() throws RecognitionException {
		LessThanOrEqualToQueryContext _localctx = new LessThanOrEqualToQueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lessThanOrEqualToQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			attributeName();
			setState(369);
			match(LT_EQ);
			setState(370);
			queryParameter();
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

	public static class LessThanQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode LT() { return getToken(CQSqlGrammarExtParser.LT, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public LessThanQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterLessThanQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitLessThanQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitLessThanQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanQueryContext lessThanQuery() throws RecognitionException {
		LessThanQueryContext _localctx = new LessThanQueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lessThanQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			attributeName();
			setState(373);
			match(LT);
			setState(374);
			queryParameter();
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

	public static class GreaterThanOrEqualToQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode GT_EQ() { return getToken(CQSqlGrammarExtParser.GT_EQ, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public GreaterThanOrEqualToQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEqualToQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterGreaterThanOrEqualToQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitGreaterThanOrEqualToQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitGreaterThanOrEqualToQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanOrEqualToQueryContext greaterThanOrEqualToQuery() throws RecognitionException {
		GreaterThanOrEqualToQueryContext _localctx = new GreaterThanOrEqualToQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_greaterThanOrEqualToQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			attributeName();
			setState(377);
			match(GT_EQ);
			setState(378);
			queryParameter();
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

	public static class GreaterThanQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode GT() { return getToken(CQSqlGrammarExtParser.GT, 0); }
		public QueryParameterContext queryParameter() {
			return getRuleContext(QueryParameterContext.class,0);
		}
		public GreaterThanQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterGreaterThanQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitGreaterThanQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitGreaterThanQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanQueryContext greaterThanQuery() throws RecognitionException {
		GreaterThanQueryContext _localctx = new GreaterThanQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_greaterThanQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			attributeName();
			setState(381);
			match(GT);
			setState(382);
			queryParameter();
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

	public static class BetweenQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_BETWEEN() { return getToken(CQSqlGrammarExtParser.K_BETWEEN, 0); }
		public List<QueryParameterContext> queryParameter() {
			return getRuleContexts(QueryParameterContext.class);
		}
		public QueryParameterContext queryParameter(int i) {
			return getRuleContext(QueryParameterContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(CQSqlGrammarExtParser.K_AND, 0); }
		public BetweenQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterBetweenQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitBetweenQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitBetweenQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenQueryContext betweenQuery() throws RecognitionException {
		BetweenQueryContext _localctx = new BetweenQueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_betweenQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			attributeName();
			setState(385);
			match(K_BETWEEN);
			setState(386);
			queryParameter();
			setState(387);
			match(K_AND);
			setState(388);
			queryParameter();
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

	public static class NotBetweenQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_BETWEEN() { return getToken(CQSqlGrammarExtParser.K_BETWEEN, 0); }
		public List<QueryParameterContext> queryParameter() {
			return getRuleContexts(QueryParameterContext.class);
		}
		public QueryParameterContext queryParameter(int i) {
			return getRuleContext(QueryParameterContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(CQSqlGrammarExtParser.K_AND, 0); }
		public NotBetweenQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notBetweenQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNotBetweenQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNotBetweenQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNotBetweenQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotBetweenQueryContext notBetweenQuery() throws RecognitionException {
		NotBetweenQueryContext _localctx = new NotBetweenQueryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_notBetweenQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			attributeName();
			setState(391);
			match(K_NOT);
			setState(392);
			match(K_BETWEEN);
			setState(393);
			queryParameter();
			setState(394);
			match(K_AND);
			setState(395);
			queryParameter();
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

	public static class InQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(CQSqlGrammarExtParser.K_IN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CQSqlGrammarExtParser.OPEN_PAR, 0); }
		public List<QueryParameterContext> queryParameter() {
			return getRuleContexts(QueryParameterContext.class);
		}
		public QueryParameterContext queryParameter(int i) {
			return getRuleContext(QueryParameterContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CQSqlGrammarExtParser.CLOSE_PAR, 0); }
		public InQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterInQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitInQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitInQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InQueryContext inQuery() throws RecognitionException {
		InQueryContext _localctx = new InQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			attributeName();
			setState(398);
			match(K_IN);
			setState(399);
			match(OPEN_PAR);
			setState(400);
			queryParameter();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				queryParameter();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(CLOSE_PAR);
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

	public static class NotInQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(CQSqlGrammarExtParser.K_IN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CQSqlGrammarExtParser.OPEN_PAR, 0); }
		public List<QueryParameterContext> queryParameter() {
			return getRuleContexts(QueryParameterContext.class);
		}
		public QueryParameterContext queryParameter(int i) {
			return getRuleContext(QueryParameterContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CQSqlGrammarExtParser.CLOSE_PAR, 0); }
		public NotInQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNotInQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNotInQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNotInQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotInQueryContext notInQuery() throws RecognitionException {
		NotInQueryContext _localctx = new NotInQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_notInQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			attributeName();
			setState(411);
			match(K_NOT);
			setState(412);
			match(K_IN);
			setState(413);
			match(OPEN_PAR);
			setState(414);
			queryParameter();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(415);
				match(COMMA);
				setState(416);
				queryParameter();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(CLOSE_PAR);
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

	public static class StartsWithQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public QueryParameterTrailingPercentContext queryParameterTrailingPercent() {
			return getRuleContext(QueryParameterTrailingPercentContext.class,0);
		}
		public StartsWithQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startsWithQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterStartsWithQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitStartsWithQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitStartsWithQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartsWithQueryContext startsWithQuery() throws RecognitionException {
		StartsWithQueryContext _localctx = new StartsWithQueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_startsWithQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			attributeName();
			setState(425);
			match(K_LIKE);
			setState(426);
			queryParameterTrailingPercent();
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

	public static class EndsWithQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public QueryParameterLeadingPercentContext queryParameterLeadingPercent() {
			return getRuleContext(QueryParameterLeadingPercentContext.class,0);
		}
		public EndsWithQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endsWithQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterEndsWithQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitEndsWithQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitEndsWithQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndsWithQueryContext endsWithQuery() throws RecognitionException {
		EndsWithQueryContext _localctx = new EndsWithQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_endsWithQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			attributeName();
			setState(429);
			match(K_LIKE);
			setState(430);
			queryParameterLeadingPercent();
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

	public static class ContainsQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public QueryParameterLeadingAndTrailingPercentContext queryParameterLeadingAndTrailingPercent() {
			return getRuleContext(QueryParameterLeadingAndTrailingPercentContext.class,0);
		}
		public ContainsQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterContainsQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitContainsQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitContainsQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsQueryContext containsQuery() throws RecognitionException {
		ContainsQueryContext _localctx = new ContainsQueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_containsQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			attributeName();
			setState(433);
			match(K_LIKE);
			setState(434);
			queryParameterLeadingAndTrailingPercent();
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

	public static class HasQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(CQSqlGrammarExtParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public HasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterHasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitHasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitHasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasQueryContext hasQuery() throws RecognitionException {
		HasQueryContext _localctx = new HasQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hasQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			attributeName();
			setState(437);
			match(K_IS);
			setState(438);
			match(K_NOT);
			setState(439);
			match(K_NULL);
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

	public static class NotHasQueryContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(CQSqlGrammarExtParser.K_IS, 0); }
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public NotHasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notHasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNotHasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNotHasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNotHasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotHasQueryContext notHasQuery() throws RecognitionException {
		NotHasQueryContext _localctx = new NotHasQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_notHasQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			attributeName();
			setState(442);
			match(K_IS);
			setState(443);
			match(K_NULL);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class QueryParameterTrailingPercentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_WITH_TRAILING_PERCENT() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL_WITH_TRAILING_PERCENT, 0); }
		public QueryParameterTrailingPercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParameterTrailingPercent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQueryParameterTrailingPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQueryParameterTrailingPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQueryParameterTrailingPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryParameterTrailingPercentContext queryParameterTrailingPercent() throws RecognitionException {
		QueryParameterTrailingPercentContext _localctx = new QueryParameterTrailingPercentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_queryParameterTrailingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(STRING_LITERAL_WITH_TRAILING_PERCENT);
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

	public static class QueryParameterLeadingPercentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_WITH_LEADING_PERCENT() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL_WITH_LEADING_PERCENT, 0); }
		public QueryParameterLeadingPercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParameterLeadingPercent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQueryParameterLeadingPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQueryParameterLeadingPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQueryParameterLeadingPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryParameterLeadingPercentContext queryParameterLeadingPercent() throws RecognitionException {
		QueryParameterLeadingPercentContext _localctx = new QueryParameterLeadingPercentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryParameterLeadingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(STRING_LITERAL_WITH_LEADING_PERCENT);
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

	public static class QueryParameterLeadingAndTrailingPercentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT, 0); }
		public QueryParameterLeadingAndTrailingPercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParameterLeadingAndTrailingPercent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQueryParameterLeadingAndTrailingPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQueryParameterLeadingAndTrailingPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQueryParameterLeadingAndTrailingPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryParameterLeadingAndTrailingPercentContext queryParameterLeadingAndTrailingPercent() throws RecognitionException {
		QueryParameterLeadingAndTrailingPercentContext _localctx = new QueryParameterLeadingAndTrailingPercentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryParameterLeadingAndTrailingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT);
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

	public static class QueryParameterContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CQSqlGrammarExtParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public QueryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQueryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQueryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQueryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryParameterContext queryParameter() throws RecognitionException {
		QueryParameterContext _localctx = new QueryParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_queryParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AttributeOrderContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public AttributeOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAttributeOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAttributeOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAttributeOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOrderContext attributeOrder() throws RecognitionException {
		AttributeOrderContext _localctx = new AttributeOrderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_attributeOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			attributeName();
			setState(457);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(456);
				direction();
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(CQSqlGrammarExtParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(CQSqlGrammarExtParser.K_DESC, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==K_ASC || _la==K_DESC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CQSqlGrammarExtParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DELETE - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (K_ROLLBACK - 130)) | (1L << (K_SAVEPOINT - 130)) | (1L << (K_SELECT - 130)) | (1L << (K_UPDATE - 130)) | (1L << (K_VACUUM - 130)) | (1L << (K_VALUES - 130)) | (1L << (K_WITH - 130)) | (1L << (UNEXPECTED_CHAR - 130)))) != 0)) {
				{
				setState(463);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(461);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(462);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(CQSqlGrammarExtParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(473);
				match(SCOL);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			sql_stmt();
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(480);
						match(SCOL);
						}
						}
						setState(483); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(485);
					sql_stmt();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					match(SCOL);
					}
					} 
				}
				setState(496);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(CQSqlGrammarExtParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(CQSqlGrammarExtParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(CQSqlGrammarExtParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(497);
				match(K_EXPLAIN);
				setState(500);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(498);
					match(K_QUERY);
					setState(499);
					match(K_PLAN);
					}
				}

				}
			}

			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(504);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(505);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(506);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(507);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(508);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(509);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(510);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(511);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(512);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(513);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(514);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(515);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(516);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(517);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(518);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(519);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(520);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(521);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(522);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(523);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(524);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(525);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(526);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(527);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(528);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(529);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(530);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(531);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(532);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(533);
				vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(CQSqlGrammarExtParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(CQSqlGrammarExtParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(CQSqlGrammarExtParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(CQSqlGrammarExtParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(CQSqlGrammarExtParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(CQSqlGrammarExtParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(K_ALTER);
			setState(537);
			match(K_TABLE);
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(538);
				database_name();
				setState(539);
				match(DOT);
				}
				break;
			}
			setState(543);
			table_name();
			setState(552);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(544);
				match(K_RENAME);
				setState(545);
				match(K_TO);
				setState(546);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(547);
				match(K_ADD);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(548);
					match(K_COLUMN);
					}
					break;
				}
				setState(551);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(CQSqlGrammarExtParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(K_ANALYZE);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(555);
				database_name();
				}
				break;
			case 2:
				{
				setState(556);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(557);
				database_name();
				setState(558);
				match(DOT);
				setState(559);
				table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(CQSqlGrammarExtParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(CQSqlGrammarExtParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(K_ATTACH);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(564);
				match(K_DATABASE);
				}
				break;
			}
			setState(567);
			expr(0);
			setState(568);
			match(K_AS);
			setState(569);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(CQSqlGrammarExtParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(CQSqlGrammarExtParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(CQSqlGrammarExtParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(CQSqlGrammarExtParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(CQSqlGrammarExtParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(K_BEGIN);
			setState(573);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_DEFERRED - 63)) | (1L << (K_EXCLUSIVE - 63)) | (1L << (K_IMMEDIATE - 63)))) != 0)) {
				{
				setState(572);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_DEFERRED - 63)) | (1L << (K_EXCLUSIVE - 63)) | (1L << (K_IMMEDIATE - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(579);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(575);
				match(K_TRANSACTION);
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(576);
					transaction_name();
					}
					break;
				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(CQSqlGrammarExtParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(CQSqlGrammarExtParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(CQSqlGrammarExtParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(586);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(582);
				match(K_TRANSACTION);
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(583);
					transaction_name();
					}
					break;
				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(CQSqlGrammarExtParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(CQSqlGrammarExtParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(CQSqlGrammarExtParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(CQSqlGrammarExtParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(CQSqlGrammarExtParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(CQSqlGrammarExtParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(CQSqlGrammarExtParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(CQSqlGrammarExtParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(588);
				match(K_WITH);
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(589);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(592);
				common_table_expression();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(593);
					match(COMMA);
					setState(594);
					common_table_expression();
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(602);
			select_core();
			setState(612); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(609);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(603);
					match(K_UNION);
					setState(605);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(604);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(607);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(608);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(611);
				select_core();
				}
				}
				setState(614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(626);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(616);
				match(K_ORDER);
				setState(617);
				match(K_BY);
				setState(618);
				ordering_term();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(619);
					match(COMMA);
					setState(620);
					ordering_term();
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(634);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(628);
				match(K_LIMIT);
				setState(629);
				expr(0);
				setState(632);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(630);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(631);
					expr(0);
					}
				}

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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(CQSqlGrammarExtParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(CQSqlGrammarExtParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(CQSqlGrammarExtParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(K_CREATE);
			setState(638);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(637);
				match(K_UNIQUE);
				}
			}

			setState(640);
			match(K_INDEX);
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(641);
				match(K_IF);
				setState(642);
				match(K_NOT);
				setState(643);
				match(K_EXISTS);
				}
				break;
			}
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(646);
				database_name();
				setState(647);
				match(DOT);
				}
				break;
			}
			setState(651);
			index_name();
			setState(652);
			match(K_ON);
			setState(653);
			table_name();
			setState(654);
			match(OPEN_PAR);
			setState(655);
			indexed_column();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(656);
				match(COMMA);
				setState(657);
				indexed_column();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			match(CLOSE_PAR);
			setState(666);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(664);
				match(K_WHERE);
				setState(665);
				expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(CQSqlGrammarExtParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(CQSqlGrammarExtParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(CQSqlGrammarExtParser.K_TEMPORARY, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(CQSqlGrammarExtParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(K_CREATE);
			setState(670);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(669);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(672);
			match(K_TABLE);
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(673);
				match(K_IF);
				setState(674);
				match(K_NOT);
				setState(675);
				match(K_EXISTS);
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(678);
				database_name();
				setState(679);
				match(DOT);
				}
				break;
			}
			setState(683);
			table_name();
			setState(707);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(684);
				match(OPEN_PAR);
				setState(685);
				column_def();
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(686);
						match(COMMA);
						setState(687);
						column_def();
						}
						} 
					}
					setState(692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(693);
					match(COMMA);
					setState(694);
					table_constraint();
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				match(CLOSE_PAR);
				setState(703);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(701);
					match(K_WITHOUT);
					setState(702);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(705);
				match(K_AS);
				setState(706);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(CQSqlGrammarExtParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(CQSqlGrammarExtParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(CQSqlGrammarExtParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(CQSqlGrammarExtParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(CQSqlGrammarExtParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(CQSqlGrammarExtParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(CQSqlGrammarExtParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_BEFORE() { return getToken(CQSqlGrammarExtParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(CQSqlGrammarExtParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(CQSqlGrammarExtParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(CQSqlGrammarExtParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(CQSqlGrammarExtParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(CQSqlGrammarExtParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(CQSqlGrammarExtParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(CQSqlGrammarExtParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(CQSqlGrammarExtParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(CQSqlGrammarExtParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(CQSqlGrammarExtParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(K_CREATE);
			setState(711);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(713);
			match(K_TRIGGER);
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(714);
				match(K_IF);
				setState(715);
				match(K_NOT);
				setState(716);
				match(K_EXISTS);
				}
				break;
			}
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(719);
				database_name();
				setState(720);
				match(DOT);
				}
				break;
			}
			setState(724);
			trigger_name();
			setState(729);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(725);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(726);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(727);
				match(K_INSTEAD);
				setState(728);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(745);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(731);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(732);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(733);
				match(K_UPDATE);
				setState(743);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(734);
					match(K_OF);
					setState(735);
					column_name();
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(736);
						match(COMMA);
						setState(737);
						column_name();
						}
						}
						setState(742);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(747);
			match(K_ON);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(748);
				database_name();
				setState(749);
				match(DOT);
				}
				break;
			}
			setState(753);
			table_name();
			setState(757);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(754);
				match(K_FOR);
				setState(755);
				match(K_EACH);
				setState(756);
				match(K_ROW);
				}
			}

			setState(761);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(759);
				match(K_WHEN);
				setState(760);
				expr(0);
				}
			}

			setState(763);
			match(K_BEGIN);
			setState(772); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(764);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(765);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(766);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(767);
					select_stmt();
					}
					break;
				}
				setState(770);
				match(SCOL);
				}
				}
				setState(774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DELETE - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (K_SELECT - 133)) | (1L << (K_UPDATE - 133)) | (1L << (K_VALUES - 133)) | (1L << (K_WITH - 133)))) != 0) );
			setState(776);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(CQSqlGrammarExtParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(CQSqlGrammarExtParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(CQSqlGrammarExtParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(K_CREATE);
			setState(780);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(779);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(782);
			match(K_VIEW);
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(783);
				match(K_IF);
				setState(784);
				match(K_NOT);
				setState(785);
				match(K_EXISTS);
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(788);
				database_name();
				setState(789);
				match(DOT);
				}
				break;
			}
			setState(793);
			view_name();
			setState(794);
			match(K_AS);
			setState(795);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(CQSqlGrammarExtParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(CQSqlGrammarExtParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(CQSqlGrammarExtParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(K_CREATE);
			setState(798);
			match(K_VIRTUAL);
			setState(799);
			match(K_TABLE);
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(800);
				match(K_IF);
				setState(801);
				match(K_NOT);
				setState(802);
				match(K_EXISTS);
				}
				break;
			}
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(805);
				database_name();
				setState(806);
				match(DOT);
				}
				break;
			}
			setState(810);
			table_name();
			setState(811);
			match(K_USING);
			setState(812);
			module_name();
			setState(824);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(813);
				match(OPEN_PAR);
				setState(814);
				module_argument();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(815);
					match(COMMA);
					setState(816);
					module_argument();
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(822);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(CQSqlGrammarExtParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(826);
				with_clause();
				}
			}

			setState(829);
			match(K_DELETE);
			setState(830);
			match(K_FROM);
			setState(831);
			qualified_table_name();
			setState(834);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(832);
				match(K_WHERE);
				setState(833);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(CQSqlGrammarExtParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(836);
				with_clause();
				}
			}

			setState(839);
			match(K_DELETE);
			setState(840);
			match(K_FROM);
			setState(841);
			qualified_table_name();
			setState(844);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(842);
				match(K_WHERE);
				setState(843);
				expr(0);
				}
			}

			setState(864);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(856);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(846);
					match(K_ORDER);
					setState(847);
					match(K_BY);
					setState(848);
					ordering_term();
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(849);
						match(COMMA);
						setState(850);
						ordering_term();
						}
						}
						setState(855);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(858);
				match(K_LIMIT);
				setState(859);
				expr(0);
				setState(862);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(860);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(861);
					expr(0);
					}
				}

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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(CQSqlGrammarExtParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(CQSqlGrammarExtParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(K_DETACH);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(867);
				match(K_DATABASE);
				}
				break;
			}
			setState(870);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(CQSqlGrammarExtParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(CQSqlGrammarExtParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(K_DROP);
			setState(873);
			match(K_INDEX);
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(874);
				match(K_IF);
				setState(875);
				match(K_EXISTS);
				}
				break;
			}
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(878);
				database_name();
				setState(879);
				match(DOT);
				}
				break;
			}
			setState(883);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(CQSqlGrammarExtParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(CQSqlGrammarExtParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(K_DROP);
			setState(886);
			match(K_TABLE);
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(887);
				match(K_IF);
				setState(888);
				match(K_EXISTS);
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(891);
				database_name();
				setState(892);
				match(DOT);
				}
				break;
			}
			setState(896);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(CQSqlGrammarExtParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(CQSqlGrammarExtParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(K_DROP);
			setState(899);
			match(K_TRIGGER);
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(900);
				match(K_IF);
				setState(901);
				match(K_EXISTS);
				}
				break;
			}
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(904);
				database_name();
				setState(905);
				match(DOT);
				}
				break;
			}
			setState(909);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(CQSqlGrammarExtParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(CQSqlGrammarExtParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(K_DROP);
			setState(912);
			match(K_VIEW);
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(913);
				match(K_IF);
				setState(914);
				match(K_EXISTS);
				}
				break;
			}
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(917);
				database_name();
				setState(918);
				match(DOT);
				}
				break;
			}
			setState(922);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(924);
				match(K_WITH);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(925);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(928);
				common_table_expression();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(929);
					match(COMMA);
					setState(930);
					common_table_expression();
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(938);
			select_core();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(939);
				compound_operator();
				setState(940);
				select_core();
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(947);
				match(K_ORDER);
				setState(948);
				match(K_BY);
				setState(949);
				ordering_term();
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(950);
					match(COMMA);
					setState(951);
					ordering_term();
					}
					}
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(965);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(959);
				match(K_LIMIT);
				setState(960);
				expr(0);
				setState(963);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(961);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(962);
					expr(0);
					}
				}

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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(CQSqlGrammarExtParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(CQSqlGrammarExtParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(CQSqlGrammarExtParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(CQSqlGrammarExtParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(CQSqlGrammarExtParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(CQSqlGrammarExtParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(967);
				with_clause();
				}
			}

			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(970);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(971);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(972);
				match(K_INSERT);
				setState(973);
				match(K_OR);
				setState(974);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(975);
				match(K_INSERT);
				setState(976);
				match(K_OR);
				setState(977);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(978);
				match(K_INSERT);
				setState(979);
				match(K_OR);
				setState(980);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(981);
				match(K_INSERT);
				setState(982);
				match(K_OR);
				setState(983);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(984);
				match(K_INSERT);
				setState(985);
				match(K_OR);
				setState(986);
				match(K_IGNORE);
				}
				break;
			}
			setState(989);
			match(K_INTO);
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(990);
				database_name();
				setState(991);
				match(DOT);
				}
				break;
			}
			setState(995);
			table_name();
			setState(1007);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(996);
				match(OPEN_PAR);
				setState(997);
				column_name();
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(998);
					match(COMMA);
					setState(999);
					column_name();
					}
					}
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1005);
				match(CLOSE_PAR);
				}
			}

			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1009);
				match(K_VALUES);
				setState(1010);
				match(OPEN_PAR);
				setState(1011);
				expr(0);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1012);
					match(COMMA);
					setState(1013);
					expr(0);
					}
					}
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1019);
				match(CLOSE_PAR);
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1020);
					match(COMMA);
					setState(1021);
					match(OPEN_PAR);
					setState(1022);
					expr(0);
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1023);
						match(COMMA);
						setState(1024);
						expr(0);
						}
						}
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1030);
					match(CLOSE_PAR);
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1037);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1038);
				match(K_DEFAULT);
				setState(1039);
				match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(CQSqlGrammarExtParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(K_PRAGMA);
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1043);
				database_name();
				setState(1044);
				match(DOT);
				}
				break;
			}
			setState(1048);
			pragma_name();
			setState(1055);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1049);
				match(ASSIGN);
				setState(1050);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1051);
				match(OPEN_PAR);
				setState(1052);
				pragma_value();
				setState(1053);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(CQSqlGrammarExtParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(K_REINDEX);
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1058);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1059);
					database_name();
					setState(1060);
					match(DOT);
					}
					break;
				}
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1064);
					table_name();
					}
					break;
				case 2:
					{
					setState(1065);
					index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(CQSqlGrammarExtParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(CQSqlGrammarExtParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(K_RELEASE);
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1071);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(1074);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(CQSqlGrammarExtParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(CQSqlGrammarExtParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(CQSqlGrammarExtParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(K_ROLLBACK);
			setState(1081);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(1077);
				match(K_TRANSACTION);
				setState(1079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1078);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(1088);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(1083);
				match(K_TO);
				setState(1085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1084);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(1087);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(CQSqlGrammarExtParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(K_SAVEPOINT);
			setState(1091);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1093);
				match(K_WITH);
				setState(1095);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1094);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1097);
				common_table_expression();
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1098);
					match(COMMA);
					setState(1099);
					common_table_expression();
					}
					}
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1107);
			select_core();
			setState(1118);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1108);
				match(K_ORDER);
				setState(1109);
				match(K_BY);
				setState(1110);
				ordering_term();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1111);
					match(COMMA);
					setState(1112);
					ordering_term();
					}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1126);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1120);
				match(K_LIMIT);
				setState(1121);
				expr(0);
				setState(1124);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1122);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1123);
					expr(0);
					}
				}

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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1128);
				match(K_WITH);
				setState(1130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1129);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1132);
				common_table_expression();
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1133);
					match(COMMA);
					setState(1134);
					common_table_expression();
					}
					}
					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1142);
			select_or_values();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1143);
				compound_operator();
				setState(1144);
				select_or_values();
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1161);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1151);
				match(K_ORDER);
				setState(1152);
				match(K_BY);
				setState(1153);
				ordering_term();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1154);
					match(COMMA);
					setState(1155);
					ordering_term();
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1169);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1163);
				match(K_LIMIT);
				setState(1164);
				expr(0);
				setState(1167);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1165);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1166);
					expr(0);
					}
				}

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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(CQSqlGrammarExtParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(CQSqlGrammarExtParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(CQSqlGrammarExtParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(CQSqlGrammarExtParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(CQSqlGrammarExtParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_select_or_values);
		int _la;
		try {
			setState(1245);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(K_SELECT);
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1172);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1175);
				result_column();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1176);
					match(COMMA);
					setState(1177);
					result_column();
					}
					}
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1195);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1183);
					match(K_FROM);
					setState(1193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						setState(1184);
						table_or_subquery();
						setState(1189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1185);
							match(COMMA);
							setState(1186);
							table_or_subquery();
							}
							}
							setState(1191);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1192);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1199);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1197);
					match(K_WHERE);
					setState(1198);
					expr(0);
					}
				}

				setState(1215);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1201);
					match(K_GROUP);
					setState(1202);
					match(K_BY);
					setState(1203);
					expr(0);
					setState(1208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1204);
						match(COMMA);
						setState(1205);
						expr(0);
						}
						}
						setState(1210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1213);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1211);
						match(K_HAVING);
						setState(1212);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				match(K_VALUES);
				setState(1218);
				match(OPEN_PAR);
				setState(1219);
				expr(0);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1220);
					match(COMMA);
					setState(1221);
					expr(0);
					}
					}
					setState(1226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1227);
				match(CLOSE_PAR);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1228);
					match(COMMA);
					setState(1229);
					match(OPEN_PAR);
					setState(1230);
					expr(0);
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1231);
						match(COMMA);
						setState(1232);
						expr(0);
						}
						}
						setState(1237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1238);
					match(CLOSE_PAR);
					}
					}
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(CQSqlGrammarExtParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(CQSqlGrammarExtParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(CQSqlGrammarExtParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(CQSqlGrammarExtParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1247);
				with_clause();
				}
			}

			setState(1250);
			match(K_UPDATE);
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1251);
				match(K_OR);
				setState(1252);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1253);
				match(K_OR);
				setState(1254);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1255);
				match(K_OR);
				setState(1256);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1257);
				match(K_OR);
				setState(1258);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1259);
				match(K_OR);
				setState(1260);
				match(K_IGNORE);
				}
				break;
			}
			setState(1263);
			qualified_table_name();
			setState(1264);
			match(K_SET);
			setState(1265);
			column_name();
			setState(1266);
			match(ASSIGN);
			setState(1267);
			expr(0);
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1268);
				match(COMMA);
				setState(1269);
				column_name();
				setState(1270);
				match(ASSIGN);
				setState(1271);
				expr(0);
				}
				}
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1278);
				match(K_WHERE);
				setState(1279);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(CQSqlGrammarExtParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(CQSqlGrammarExtParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(CQSqlGrammarExtParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(CQSqlGrammarExtParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1282);
				with_clause();
				}
			}

			setState(1285);
			match(K_UPDATE);
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1286);
				match(K_OR);
				setState(1287);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1288);
				match(K_OR);
				setState(1289);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1290);
				match(K_OR);
				setState(1291);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1292);
				match(K_OR);
				setState(1293);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1294);
				match(K_OR);
				setState(1295);
				match(K_IGNORE);
				}
				break;
			}
			setState(1298);
			qualified_table_name();
			setState(1299);
			match(K_SET);
			setState(1300);
			column_name();
			setState(1301);
			match(ASSIGN);
			setState(1302);
			expr(0);
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1303);
				match(COMMA);
				setState(1304);
				column_name();
				setState(1305);
				match(ASSIGN);
				setState(1306);
				expr(0);
				}
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1315);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1313);
				match(K_WHERE);
				setState(1314);
				expr(0);
				}
			}

			setState(1335);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1327);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1317);
					match(K_ORDER);
					setState(1318);
					match(K_BY);
					setState(1319);
					ordering_term();
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1320);
						match(COMMA);
						setState(1321);
						ordering_term();
						}
						}
						setState(1326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1329);
				match(K_LIMIT);
				setState(1330);
				expr(0);
				setState(1333);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1331);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1332);
					expr(0);
					}
				}

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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(CQSqlGrammarExtParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			column_name();
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1340);
				type_name();
				}
				break;
			}
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (K_NOT - 107)) | (1L << (K_NULL - 107)) | (1L << (K_PRIMARY - 107)) | (1L << (K_REFERENCES - 107)) | (1L << (K_UNIQUE - 107)))) != 0)) {
				{
				{
				setState(1343);
				column_constraint();
				}
				}
				setState(1348);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1349);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1354);
				match(OPEN_PAR);
				setState(1355);
				signed_number();
				setState(1356);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1358);
				match(OPEN_PAR);
				setState(1359);
				signed_number();
				setState(1360);
				match(COMMA);
				setState(1361);
				signed_number();
				setState(1362);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(CQSqlGrammarExtParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(CQSqlGrammarExtParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CQSqlGrammarExtParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(CQSqlGrammarExtParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(CQSqlGrammarExtParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(CQSqlGrammarExtParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(CQSqlGrammarExtParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(CQSqlGrammarExtParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(CQSqlGrammarExtParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(CQSqlGrammarExtParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1366);
				match(K_CONSTRAINT);
				setState(1367);
				name();
				}
			}

			setState(1403);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1370);
				match(K_PRIMARY);
				setState(1371);
				match(K_KEY);
				setState(1373);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1372);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1375);
				conflict_clause();
				setState(1377);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1376);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1380);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1379);
					match(K_NOT);
					}
				}

				setState(1382);
				match(K_NULL);
				setState(1383);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1384);
				match(K_UNIQUE);
				setState(1385);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1386);
				match(K_CHECK);
				setState(1387);
				match(OPEN_PAR);
				setState(1388);
				expr(0);
				setState(1389);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1391);
				match(K_DEFAULT);
				setState(1398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1392);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1393);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1394);
					match(OPEN_PAR);
					setState(1395);
					expr(0);
					setState(1396);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1400);
				match(K_COLLATE);
				setState(1401);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1402);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(CQSqlGrammarExtParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(CQSqlGrammarExtParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(CQSqlGrammarExtParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1405);
				match(K_ON);
				setState(1406);
				match(K_CONFLICT);
				setState(1407);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_FAIL - 77)) | (1L << (K_IGNORE - 77)) | (1L << (K_REPLACE - 77)) | (1L << (K_ROLLBACK - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(CQSqlGrammarExtParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(CQSqlGrammarExtParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(CQSqlGrammarExtParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(CQSqlGrammarExtParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(CQSqlGrammarExtParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(CQSqlGrammarExtParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(CQSqlGrammarExtParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(CQSqlGrammarExtParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(CQSqlGrammarExtParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(CQSqlGrammarExtParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(CQSqlGrammarExtParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(CQSqlGrammarExtParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(CQSqlGrammarExtParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(CQSqlGrammarExtParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(CQSqlGrammarExtParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(CQSqlGrammarExtParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(CQSqlGrammarExtParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(CQSqlGrammarExtParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(CQSqlGrammarExtParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(CQSqlGrammarExtParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(CQSqlGrammarExtParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1411);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1412);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1413);
						database_name();
						setState(1414);
						match(DOT);
						}
						break;
					}
					setState(1418);
					table_name();
					setState(1419);
					match(DOT);
					}
					break;
				}
				setState(1423);
				column_name();
				}
				break;
			case 4:
				{
				setState(1424);
				unary_operator();
				setState(1425);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1427);
				function_name();
				setState(1428);
				match(OPEN_PAR);
				setState(1441);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1430);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1429);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1432);
					expr(0);
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1433);
						match(COMMA);
						setState(1434);
						expr(0);
						}
						}
						setState(1439);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1440);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1443);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1445);
				match(OPEN_PAR);
				setState(1446);
				expr(0);
				setState(1447);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1449);
				match(K_CAST);
				setState(1450);
				match(OPEN_PAR);
				setState(1451);
				expr(0);
				setState(1452);
				match(K_AS);
				setState(1453);
				type_name();
				setState(1454);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1460);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1457);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1456);
						match(K_NOT);
						}
					}

					setState(1459);
					match(K_EXISTS);
					}
				}

				setState(1462);
				match(OPEN_PAR);
				setState(1463);
				select_stmt();
				setState(1464);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1466);
				match(K_CASE);
				setState(1468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1467);
					expr(0);
					}
					break;
				}
				setState(1475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1470);
					match(K_WHEN);
					setState(1471);
					expr(0);
					setState(1472);
					match(K_THEN);
					setState(1473);
					expr(0);
					}
					}
					setState(1477); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1481);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1479);
					match(K_ELSE);
					setState(1480);
					expr(0);
					}
				}

				setState(1483);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1485);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1488);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1489);
						match(PIPE2);
						setState(1490);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1491);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1492);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1493);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1494);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1495);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1496);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1497);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1498);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1499);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1500);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1501);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1502);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1503);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1516);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
							{
							setState(1504);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1505);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1506);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1507);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1508);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1509);
							match(K_IS);
							setState(1510);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1511);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1512);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1513);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1514);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1515);
							match(K_REGEXP);
							}
							break;
						}
						setState(1518);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1519);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1520);
						match(K_AND);
						setState(1521);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1522);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1523);
						match(K_OR);
						setState(1524);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1525);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1526);
						match(K_IS);
						setState(1528);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1527);
							match(K_NOT);
							}
							break;
						}
						setState(1530);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1531);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1533);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1532);
							match(K_NOT);
							}
						}

						setState(1535);
						match(K_BETWEEN);
						setState(1536);
						expr(0);
						setState(1537);
						match(K_AND);
						setState(1538);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1540);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1541);
						match(K_COLLATE);
						setState(1542);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1543);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1545);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1544);
							match(K_NOT);
							}
						}

						setState(1547);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1548);
						expr(0);
						setState(1551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1549);
							match(K_ESCAPE);
							setState(1550);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1553);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1558);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1554);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1555);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1556);
							match(K_NOT);
							setState(1557);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1560);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1562);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1561);
							match(K_NOT);
							}
						}

						setState(1564);
						match(K_IN);
						setState(1584);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
						case 1:
							{
							setState(1565);
							match(OPEN_PAR);
							setState(1575);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
							case 1:
								{
								setState(1566);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1567);
								expr(0);
								setState(1572);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1568);
									match(COMMA);
									setState(1569);
									expr(0);
									}
									}
									setState(1574);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1577);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1581);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
							case 1:
								{
								setState(1578);
								database_name();
								setState(1579);
								match(DOT);
								}
								break;
							}
							setState(1583);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(CQSqlGrammarExtParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(CQSqlGrammarExtParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(CQSqlGrammarExtParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(CQSqlGrammarExtParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(CQSqlGrammarExtParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(CQSqlGrammarExtParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(CQSqlGrammarExtParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(CQSqlGrammarExtParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(CQSqlGrammarExtParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(CQSqlGrammarExtParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(CQSqlGrammarExtParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(CQSqlGrammarExtParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(CQSqlGrammarExtParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(CQSqlGrammarExtParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(CQSqlGrammarExtParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(CQSqlGrammarExtParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(CQSqlGrammarExtParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(CQSqlGrammarExtParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(CQSqlGrammarExtParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(CQSqlGrammarExtParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(CQSqlGrammarExtParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(CQSqlGrammarExtParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(CQSqlGrammarExtParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(CQSqlGrammarExtParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(CQSqlGrammarExtParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(CQSqlGrammarExtParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(CQSqlGrammarExtParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(K_REFERENCES);
			setState(1592);
			foreign_table();
			setState(1604);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1593);
				match(OPEN_PAR);
				setState(1594);
				column_name();
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1595);
					match(COMMA);
					setState(1596);
					column_name();
					}
					}
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1602);
				match(CLOSE_PAR);
				}
			}

			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1620);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1606);
					match(K_ON);
					setState(1607);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1608);
						match(K_SET);
						setState(1609);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1610);
						match(K_SET);
						setState(1611);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1612);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1613);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1614);
						match(K_NO);
						setState(1615);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1618);
					match(K_MATCH);
					setState(1619);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1628);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1627);
					match(K_NOT);
					}
				}

				setState(1630);
				match(K_DEFERRABLE);
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1631);
					match(K_INITIALLY);
					setState(1632);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1633);
					match(K_INITIALLY);
					setState(1634);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(CQSqlGrammarExtParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(K_RAISE);
			setState(1640);
			match(OPEN_PAR);
			setState(1645);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1641);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1642);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1643);
				match(COMMA);
				setState(1644);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1647);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(CQSqlGrammarExtParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(CQSqlGrammarExtParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(CQSqlGrammarExtParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			column_name();
			setState(1652);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1650);
				match(K_COLLATE);
				setState(1651);
				collation_name();
				}
			}

			setState(1655);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1654);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(CQSqlGrammarExtParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(CQSqlGrammarExtParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(CQSqlGrammarExtParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(CQSqlGrammarExtParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(CQSqlGrammarExtParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CQSqlGrammarExtParser.K_UNIQUE, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1657);
				match(K_CONSTRAINT);
				setState(1658);
				name();
				}
			}

			setState(1697);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1664);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1661);
					match(K_PRIMARY);
					setState(1662);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1663);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1666);
				match(OPEN_PAR);
				setState(1667);
				indexed_column();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1668);
					match(COMMA);
					setState(1669);
					indexed_column();
					}
					}
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1675);
				match(CLOSE_PAR);
				setState(1676);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1678);
				match(K_CHECK);
				setState(1679);
				match(OPEN_PAR);
				setState(1680);
				expr(0);
				setState(1681);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1683);
				match(K_FOREIGN);
				setState(1684);
				match(K_KEY);
				setState(1685);
				match(OPEN_PAR);
				setState(1686);
				column_name();
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1687);
					match(COMMA);
					setState(1688);
					column_name();
					}
					}
					setState(1693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1694);
				match(CLOSE_PAR);
				setState(1695);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(CQSqlGrammarExtParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(CQSqlGrammarExtParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			match(K_WITH);
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1700);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1703);
			cte_table_name();
			setState(1704);
			match(K_AS);
			setState(1705);
			match(OPEN_PAR);
			setState(1706);
			select_stmt();
			setState(1707);
			match(CLOSE_PAR);
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1708);
				match(COMMA);
				setState(1709);
				cte_table_name();
				setState(1710);
				match(K_AS);
				setState(1711);
				match(OPEN_PAR);
				setState(1712);
				select_stmt();
				setState(1713);
				match(CLOSE_PAR);
				}
				}
				setState(1719);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(CQSqlGrammarExtParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1720);
				database_name();
				setState(1721);
				match(DOT);
				}
				break;
			}
			setState(1725);
			table_name();
			setState(1731);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1726);
				match(K_INDEXED);
				setState(1727);
				match(K_BY);
				setState(1728);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1729);
				match(K_NOT);
				setState(1730);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(CQSqlGrammarExtParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(CQSqlGrammarExtParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(CQSqlGrammarExtParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			expr(0);
			setState(1736);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1734);
				match(K_COLLATE);
				setState(1735);
				collation_name();
				}
			}

			setState(1739);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1738);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_pragma_value);
		try {
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			table_name();
			setState(1758);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1747);
				match(OPEN_PAR);
				setState(1748);
				column_name();
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1749);
					match(COMMA);
					setState(1750);
					column_name();
					}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1756);
				match(CLOSE_PAR);
				}
			}

			setState(1760);
			match(K_AS);
			setState(1761);
			match(OPEN_PAR);
			setState(1762);
			select_stmt();
			setState(1763);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_result_column);
		int _la;
		try {
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				table_name();
				setState(1767);
				match(DOT);
				setState(1768);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1770);
				expr(0);
				setState(1775);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1772);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1771);
						match(K_AS);
						}
					}

					setState(1774);
					column_alias();
					}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(CQSqlGrammarExtParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_table_or_subquery);
		int _la;
		try {
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1779);
					database_name();
					setState(1780);
					match(DOT);
					}
					break;
				}
				setState(1784);
				table_name();
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1785);
						match(K_AS);
						}
						break;
					}
					setState(1788);
					table_alias();
					}
					break;
				}
				setState(1796);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1791);
					match(K_INDEXED);
					setState(1792);
					match(K_BY);
					setState(1793);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1794);
					match(K_NOT);
					setState(1795);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(OPEN_PAR);
				setState(1808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1799);
					table_or_subquery();
					setState(1804);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1800);
						match(COMMA);
						setState(1801);
						table_or_subquery();
						}
						}
						setState(1806);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1807);
					join_clause();
					}
					break;
				}
				setState(1810);
				match(CLOSE_PAR);
				setState(1815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1812);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1811);
						match(K_AS);
						}
						break;
					}
					setState(1814);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1817);
				match(OPEN_PAR);
				setState(1818);
				select_stmt();
				setState(1819);
				match(CLOSE_PAR);
				setState(1824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						setState(1820);
						match(K_AS);
						}
						break;
					}
					setState(1823);
					table_alias();
					}
					break;
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			table_or_subquery();
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_INNER - 92)) | (1L << (K_JOIN - 92)) | (1L << (K_LEFT - 92)) | (1L << (K_NATURAL - 92)))) != 0)) {
				{
				{
				setState(1829);
				join_operator();
				setState(1830);
				table_or_subquery();
				setState(1831);
				join_constraint();
				}
				}
				setState(1837);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(CQSqlGrammarExtParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(CQSqlGrammarExtParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(CQSqlGrammarExtParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(CQSqlGrammarExtParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(CQSqlGrammarExtParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(CQSqlGrammarExtParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_join_operator);
		int _la;
		try {
			setState(1851);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1839);
					match(K_NATURAL);
					}
				}

				setState(1848);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1842);
					match(K_LEFT);
					setState(1844);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1843);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1846);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1847);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1850);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(CQSqlGrammarExtParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(CQSqlGrammarExtParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1853);
				match(K_ON);
				setState(1854);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1855);
				match(K_USING);
				setState(1856);
				match(OPEN_PAR);
				setState(1857);
				column_name();
				setState(1862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1858);
					match(COMMA);
					setState(1859);
					column_name();
					}
					}
					setState(1864);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1865);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(CQSqlGrammarExtParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(CQSqlGrammarExtParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(CQSqlGrammarExtParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(CQSqlGrammarExtParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(CQSqlGrammarExtParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_select_core);
		int _la;
		try {
			setState(1943);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1869);
				match(K_SELECT);
				setState(1871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1870);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1873);
				result_column();
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1874);
					match(COMMA);
					setState(1875);
					result_column();
					}
					}
					setState(1880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1893);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1881);
					match(K_FROM);
					setState(1891);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(1882);
						table_or_subquery();
						setState(1887);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1883);
							match(COMMA);
							setState(1884);
							table_or_subquery();
							}
							}
							setState(1889);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1890);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1897);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1895);
					match(K_WHERE);
					setState(1896);
					expr(0);
					}
				}

				setState(1913);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1899);
					match(K_GROUP);
					setState(1900);
					match(K_BY);
					setState(1901);
					expr(0);
					setState(1906);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1902);
						match(COMMA);
						setState(1903);
						expr(0);
						}
						}
						setState(1908);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1911);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1909);
						match(K_HAVING);
						setState(1910);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				match(K_VALUES);
				setState(1916);
				match(OPEN_PAR);
				setState(1917);
				expr(0);
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1918);
					match(COMMA);
					setState(1919);
					expr(0);
					}
					}
					setState(1924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1925);
				match(CLOSE_PAR);
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1926);
					match(COMMA);
					setState(1927);
					match(OPEN_PAR);
					setState(1928);
					expr(0);
					setState(1933);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1929);
						match(COMMA);
						setState(1930);
						expr(0);
						}
						}
						setState(1935);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1936);
					match(CLOSE_PAR);
					}
					}
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(CQSqlGrammarExtParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(CQSqlGrammarExtParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(CQSqlGrammarExtParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(CQSqlGrammarExtParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_compound_operator);
		try {
			setState(1950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1945);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1946);
				match(K_UNION);
				setState(1947);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1948);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1949);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			table_name();
			setState(1964);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1953);
				match(OPEN_PAR);
				setState(1954);
				column_name();
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1955);
					match(COMMA);
					setState(1956);
					column_name();
					}
					}
					setState(1961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1962);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CQSqlGrammarExtParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1966);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1969);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CQSqlGrammarExtParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(CQSqlGrammarExtParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(CQSqlGrammarExtParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(CQSqlGrammarExtParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CQSqlGrammarExtParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (K_NULL - 109)) | (1L << (NUMERIC_LITERAL - 109)) | (1L << (STRING_LITERAL - 109)) | (1L << (BLOB_LITERAL - 109)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_module_argument);
		try {
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1978);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(CQSqlGrammarExtParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(CQSqlGrammarExtParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(CQSqlGrammarExtParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(CQSqlGrammarExtParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(CQSqlGrammarExtParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(CQSqlGrammarExtParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(CQSqlGrammarExtParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(CQSqlGrammarExtParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(CQSqlGrammarExtParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(CQSqlGrammarExtParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(CQSqlGrammarExtParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(CQSqlGrammarExtParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(CQSqlGrammarExtParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(CQSqlGrammarExtParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(CQSqlGrammarExtParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(CQSqlGrammarExtParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(CQSqlGrammarExtParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(CQSqlGrammarExtParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(CQSqlGrammarExtParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(CQSqlGrammarExtParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(CQSqlGrammarExtParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(CQSqlGrammarExtParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(CQSqlGrammarExtParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CQSqlGrammarExtParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(CQSqlGrammarExtParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(CQSqlGrammarExtParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(CQSqlGrammarExtParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(CQSqlGrammarExtParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CQSqlGrammarExtParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(CQSqlGrammarExtParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(CQSqlGrammarExtParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(CQSqlGrammarExtParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(CQSqlGrammarExtParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(CQSqlGrammarExtParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(CQSqlGrammarExtParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(CQSqlGrammarExtParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(CQSqlGrammarExtParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(CQSqlGrammarExtParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(CQSqlGrammarExtParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(CQSqlGrammarExtParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(CQSqlGrammarExtParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(CQSqlGrammarExtParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(CQSqlGrammarExtParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(CQSqlGrammarExtParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(CQSqlGrammarExtParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(CQSqlGrammarExtParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(CQSqlGrammarExtParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(CQSqlGrammarExtParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(CQSqlGrammarExtParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(CQSqlGrammarExtParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(CQSqlGrammarExtParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(CQSqlGrammarExtParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(CQSqlGrammarExtParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(CQSqlGrammarExtParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(CQSqlGrammarExtParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(CQSqlGrammarExtParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(CQSqlGrammarExtParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(CQSqlGrammarExtParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(CQSqlGrammarExtParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(CQSqlGrammarExtParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(CQSqlGrammarExtParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(CQSqlGrammarExtParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(CQSqlGrammarExtParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(CQSqlGrammarExtParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(CQSqlGrammarExtParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(CQSqlGrammarExtParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(CQSqlGrammarExtParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(CQSqlGrammarExtParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(CQSqlGrammarExtParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(CQSqlGrammarExtParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(CQSqlGrammarExtParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(CQSqlGrammarExtParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(CQSqlGrammarExtParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(CQSqlGrammarExtParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(CQSqlGrammarExtParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(CQSqlGrammarExtParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(CQSqlGrammarExtParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(CQSqlGrammarExtParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(CQSqlGrammarExtParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(CQSqlGrammarExtParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(CQSqlGrammarExtParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(CQSqlGrammarExtParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(CQSqlGrammarExtParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(CQSqlGrammarExtParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CQSqlGrammarExtParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(CQSqlGrammarExtParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(CQSqlGrammarExtParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(CQSqlGrammarExtParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(CQSqlGrammarExtParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(CQSqlGrammarExtParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(CQSqlGrammarExtParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(CQSqlGrammarExtParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(CQSqlGrammarExtParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(CQSqlGrammarExtParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(CQSqlGrammarExtParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(CQSqlGrammarExtParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(CQSqlGrammarExtParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(CQSqlGrammarExtParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(CQSqlGrammarExtParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(CQSqlGrammarExtParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(CQSqlGrammarExtParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(CQSqlGrammarExtParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(CQSqlGrammarExtParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(CQSqlGrammarExtParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(CQSqlGrammarExtParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(CQSqlGrammarExtParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(CQSqlGrammarExtParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(CQSqlGrammarExtParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(CQSqlGrammarExtParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CQSqlGrammarExtParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(CQSqlGrammarExtParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(CQSqlGrammarExtParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(CQSqlGrammarExtParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(CQSqlGrammarExtParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(CQSqlGrammarExtParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(CQSqlGrammarExtParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(CQSqlGrammarExtParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(CQSqlGrammarExtParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(CQSqlGrammarExtParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(CQSqlGrammarExtParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ABORT - 30)) | (1L << (K_ACTION - 30)) | (1L << (K_ADD - 30)) | (1L << (K_AFTER - 30)) | (1L << (K_ALL - 30)) | (1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_AND - 30)) | (1L << (K_AS - 30)) | (1L << (K_ASC - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_AUTOINCREMENT - 30)) | (1L << (K_BEFORE - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_BETWEEN - 30)) | (1L << (K_BY - 30)) | (1L << (K_CASCADE - 30)) | (1L << (K_CASE - 30)) | (1L << (K_CAST - 30)) | (1L << (K_CHECK - 30)) | (1L << (K_COLLATE - 30)) | (1L << (K_COLUMN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CONFLICT - 30)) | (1L << (K_CONSTRAINT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_CROSS - 30)) | (1L << (K_CURRENT_DATE - 30)) | (1L << (K_CURRENT_TIME - 30)) | (1L << (K_CURRENT_TIMESTAMP - 30)) | (1L << (K_DATABASE - 30)) | (1L << (K_DEFAULT - 30)) | (1L << (K_DEFERRABLE - 30)) | (1L << (K_DEFERRED - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DESC - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DISTINCT - 30)) | (1L << (K_DROP - 30)) | (1L << (K_EACH - 30)) | (1L << (K_ELSE - 30)) | (1L << (K_END - 30)) | (1L << (K_ESCAPE - 30)) | (1L << (K_EXCEPT - 30)) | (1L << (K_EXCLUSIVE - 30)) | (1L << (K_EXISTS - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_FAIL - 30)) | (1L << (K_FOR - 30)) | (1L << (K_FOREIGN - 30)) | (1L << (K_FROM - 30)) | (1L << (K_FULL - 30)) | (1L << (K_GLOB - 30)) | (1L << (K_GROUP - 30)) | (1L << (K_HAVING - 30)) | (1L << (K_IF - 30)) | (1L << (K_IGNORE - 30)) | (1L << (K_IMMEDIATE - 30)) | (1L << (K_IN - 30)) | (1L << (K_INDEX - 30)) | (1L << (K_INDEXED - 30)) | (1L << (K_INITIALLY - 30)) | (1L << (K_INNER - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INSTEAD - 94)) | (1L << (K_INTERSECT - 94)) | (1L << (K_INTO - 94)) | (1L << (K_IS - 94)) | (1L << (K_ISNULL - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_KEY - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_LIKE - 94)) | (1L << (K_LIMIT - 94)) | (1L << (K_MATCH - 94)) | (1L << (K_NATURAL - 94)) | (1L << (K_NO - 94)) | (1L << (K_NOT - 94)) | (1L << (K_NOTNULL - 94)) | (1L << (K_NULL - 94)) | (1L << (K_OF - 94)) | (1L << (K_OFFSET - 94)) | (1L << (K_ON - 94)) | (1L << (K_OR - 94)) | (1L << (K_ORDER - 94)) | (1L << (K_OUTER - 94)) | (1L << (K_PLAN - 94)) | (1L << (K_PRAGMA - 94)) | (1L << (K_PRIMARY - 94)) | (1L << (K_QUERY - 94)) | (1L << (K_RAISE - 94)) | (1L << (K_RECURSIVE - 94)) | (1L << (K_REFERENCES - 94)) | (1L << (K_REGEXP - 94)) | (1L << (K_REINDEX - 94)) | (1L << (K_RELEASE - 94)) | (1L << (K_RENAME - 94)) | (1L << (K_REPLACE - 94)) | (1L << (K_RESTRICT - 94)) | (1L << (K_RIGHT - 94)) | (1L << (K_ROLLBACK - 94)) | (1L << (K_ROW - 94)) | (1L << (K_SAVEPOINT - 94)) | (1L << (K_SELECT - 94)) | (1L << (K_SET - 94)) | (1L << (K_TABLE - 94)) | (1L << (K_TEMP - 94)) | (1L << (K_TEMPORARY - 94)) | (1L << (K_THEN - 94)) | (1L << (K_TO - 94)) | (1L << (K_TRANSACTION - 94)) | (1L << (K_TRIGGER - 94)) | (1L << (K_UNION - 94)) | (1L << (K_UNIQUE - 94)) | (1L << (K_UPDATE - 94)) | (1L << (K_USING - 94)) | (1L << (K_VACUUM - 94)) | (1L << (K_VALUES - 94)) | (1L << (K_VIEW - 94)) | (1L << (K_VIRTUAL - 94)) | (1L << (K_WHEN - 94)) | (1L << (K_WHERE - 94)) | (1L << (K_WITH - 94)) | (1L << (K_WITHOUT - 94)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQSqlGrammarExtParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CQSqlGrammarExtParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQSqlGrammarExtListener ) ((CQSqlGrammarExtListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQSqlGrammarExtVisitor ) return ((CQSqlGrammarExtVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_any_name);
		try {
			setState(2026);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2021);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2022);
				match(OPEN_PAR);
				setState(2023);
				any_name();
				setState(2024);
				match(CLOSE_PAR);
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
		case 76:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a4\u07ef\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\3\2\3\2\3\2\3\2\7\2\u00f5\n\2\f\2\16\2\u00f8\13\2\3\2\3\2\3"+
		"\2\5\2\u00fd\n\2\3\2\5\2\u0100\n\2\3\2\5\2\u0103\n\2\3\2\5\2\u0106\n\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u0114\n\5\f\5\16"+
		"\5\u0117\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0124\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0132\n\13\3"+
		"\f\3\f\3\f\5\f\u0137\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013f\n\r\f\r\16"+
		"\r\u0142\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u014c\n\16\f"+
		"\16\16\16\u014f\13\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0169\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0196\n\31\f\31\16\31\u0199\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01a4\n\32\f\32\16\32\u01a7\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\5%\u01cc\n%\3&\3&\3\'\3\'\7\'\u01d2\n\'\f\'\16\'\u01d5"+
		"\13\'\3\'\3\'\3(\3(\3(\3)\7)\u01dd\n)\f)\16)\u01e0\13)\3)\3)\6)\u01e4"+
		"\n)\r)\16)\u01e5\3)\7)\u01e9\n)\f)\16)\u01ec\13)\3)\7)\u01ef\n)\f)\16"+
		")\u01f2\13)\3*\3*\3*\5*\u01f7\n*\5*\u01f9\n*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0219"+
		"\n*\3+\3+\3+\3+\3+\5+\u0220\n+\3+\3+\3+\3+\3+\3+\5+\u0228\n+\3+\5+\u022b"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\5,\u0234\n,\3-\3-\5-\u0238\n-\3-\3-\3-\3-\3."+
		"\3.\5.\u0240\n.\3.\3.\5.\u0244\n.\5.\u0246\n.\3/\3/\3/\5/\u024b\n/\5/"+
		"\u024d\n/\3\60\3\60\5\60\u0251\n\60\3\60\3\60\3\60\7\60\u0256\n\60\f\60"+
		"\16\60\u0259\13\60\5\60\u025b\n\60\3\60\3\60\3\60\5\60\u0260\n\60\3\60"+
		"\3\60\5\60\u0264\n\60\3\60\6\60\u0267\n\60\r\60\16\60\u0268\3\60\3\60"+
		"\3\60\3\60\3\60\7\60\u0270\n\60\f\60\16\60\u0273\13\60\5\60\u0275\n\60"+
		"\3\60\3\60\3\60\3\60\5\60\u027b\n\60\5\60\u027d\n\60\3\61\3\61\5\61\u0281"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u0287\n\61\3\61\3\61\3\61\5\61\u028c\n"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0295\n\61\f\61\16\61\u0298"+
		"\13\61\3\61\3\61\3\61\5\61\u029d\n\61\3\62\3\62\5\62\u02a1\n\62\3\62\3"+
		"\62\3\62\3\62\5\62\u02a7\n\62\3\62\3\62\3\62\5\62\u02ac\n\62\3\62\3\62"+
		"\3\62\3\62\3\62\7\62\u02b3\n\62\f\62\16\62\u02b6\13\62\3\62\3\62\7\62"+
		"\u02ba\n\62\f\62\16\62\u02bd\13\62\3\62\3\62\3\62\5\62\u02c2\n\62\3\62"+
		"\3\62\5\62\u02c6\n\62\3\63\3\63\5\63\u02ca\n\63\3\63\3\63\3\63\3\63\5"+
		"\63\u02d0\n\63\3\63\3\63\3\63\5\63\u02d5\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u02dc\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u02e5\n\63\f"+
		"\63\16\63\u02e8\13\63\5\63\u02ea\n\63\5\63\u02ec\n\63\3\63\3\63\3\63\3"+
		"\63\5\63\u02f2\n\63\3\63\3\63\3\63\3\63\5\63\u02f8\n\63\3\63\3\63\5\63"+
		"\u02fc\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0303\n\63\3\63\3\63\6\63\u0307"+
		"\n\63\r\63\16\63\u0308\3\63\3\63\3\64\3\64\5\64\u030f\n\64\3\64\3\64\3"+
		"\64\3\64\5\64\u0315\n\64\3\64\3\64\3\64\5\64\u031a\n\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0326\n\65\3\65\3\65\3\65\5\65"+
		"\u032b\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0334\n\65\f\65\16"+
		"\65\u0337\13\65\3\65\3\65\5\65\u033b\n\65\3\66\5\66\u033e\n\66\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0345\n\66\3\67\5\67\u0348\n\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u034f\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u0356\n\67\f"+
		"\67\16\67\u0359\13\67\5\67\u035b\n\67\3\67\3\67\3\67\3\67\5\67\u0361\n"+
		"\67\5\67\u0363\n\67\38\38\58\u0367\n8\38\38\39\39\39\39\59\u036f\n9\3"+
		"9\39\39\59\u0374\n9\39\39\3:\3:\3:\3:\5:\u037c\n:\3:\3:\3:\5:\u0381\n"+
		":\3:\3:\3;\3;\3;\3;\5;\u0389\n;\3;\3;\3;\5;\u038e\n;\3;\3;\3<\3<\3<\3"+
		"<\5<\u0396\n<\3<\3<\3<\5<\u039b\n<\3<\3<\3=\3=\5=\u03a1\n=\3=\3=\3=\7"+
		"=\u03a6\n=\f=\16=\u03a9\13=\5=\u03ab\n=\3=\3=\3=\3=\7=\u03b1\n=\f=\16"+
		"=\u03b4\13=\3=\3=\3=\3=\3=\7=\u03bb\n=\f=\16=\u03be\13=\5=\u03c0\n=\3"+
		"=\3=\3=\3=\5=\u03c6\n=\5=\u03c8\n=\3>\5>\u03cb\n>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u03de\n>\3>\3>\3>\3>\5>\u03e4\n>\3"+
		">\3>\3>\3>\3>\7>\u03eb\n>\f>\16>\u03ee\13>\3>\3>\5>\u03f2\n>\3>\3>\3>"+
		"\3>\3>\7>\u03f9\n>\f>\16>\u03fc\13>\3>\3>\3>\3>\3>\3>\7>\u0404\n>\f>\16"+
		">\u0407\13>\3>\3>\7>\u040b\n>\f>\16>\u040e\13>\3>\3>\3>\5>\u0413\n>\3"+
		"?\3?\3?\3?\5?\u0419\n?\3?\3?\3?\3?\3?\3?\3?\5?\u0422\n?\3@\3@\3@\3@\3"+
		"@\5@\u0429\n@\3@\3@\5@\u042d\n@\5@\u042f\n@\3A\3A\5A\u0433\nA\3A\3A\3"+
		"B\3B\3B\5B\u043a\nB\5B\u043c\nB\3B\3B\5B\u0440\nB\3B\5B\u0443\nB\3C\3"+
		"C\3C\3D\3D\5D\u044a\nD\3D\3D\3D\7D\u044f\nD\fD\16D\u0452\13D\5D\u0454"+
		"\nD\3D\3D\3D\3D\3D\3D\7D\u045c\nD\fD\16D\u045f\13D\5D\u0461\nD\3D\3D\3"+
		"D\3D\5D\u0467\nD\5D\u0469\nD\3E\3E\5E\u046d\nE\3E\3E\3E\7E\u0472\nE\f"+
		"E\16E\u0475\13E\5E\u0477\nE\3E\3E\3E\3E\7E\u047d\nE\fE\16E\u0480\13E\3"+
		"E\3E\3E\3E\3E\7E\u0487\nE\fE\16E\u048a\13E\5E\u048c\nE\3E\3E\3E\3E\5E"+
		"\u0492\nE\5E\u0494\nE\3F\3F\5F\u0498\nF\3F\3F\3F\7F\u049d\nF\fF\16F\u04a0"+
		"\13F\3F\3F\3F\3F\7F\u04a6\nF\fF\16F\u04a9\13F\3F\5F\u04ac\nF\5F\u04ae"+
		"\nF\3F\3F\5F\u04b2\nF\3F\3F\3F\3F\3F\7F\u04b9\nF\fF\16F\u04bc\13F\3F\3"+
		"F\5F\u04c0\nF\5F\u04c2\nF\3F\3F\3F\3F\3F\7F\u04c9\nF\fF\16F\u04cc\13F"+
		"\3F\3F\3F\3F\3F\3F\7F\u04d4\nF\fF\16F\u04d7\13F\3F\3F\7F\u04db\nF\fF\16"+
		"F\u04de\13F\5F\u04e0\nF\3G\5G\u04e3\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\5G\u04f0\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u04fc\nG\fG\16G\u04ff\13"+
		"G\3G\3G\5G\u0503\nG\3H\5H\u0506\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5"+
		"H\u0513\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u051f\nH\fH\16H\u0522\13H"+
		"\3H\3H\5H\u0526\nH\3H\3H\3H\3H\3H\7H\u052d\nH\fH\16H\u0530\13H\5H\u0532"+
		"\nH\3H\3H\3H\3H\5H\u0538\nH\5H\u053a\nH\3I\3I\3J\3J\5J\u0540\nJ\3J\7J"+
		"\u0543\nJ\fJ\16J\u0546\13J\3K\6K\u0549\nK\rK\16K\u054a\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\5K\u0557\nK\3L\3L\5L\u055b\nL\3L\3L\3L\5L\u0560\nL\3L"+
		"\3L\5L\u0564\nL\3L\5L\u0567\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u0579\nL\3L\3L\3L\5L\u057e\nL\3M\3M\3M\5M\u0583\nM\3N\3N"+
		"\3N\3N\3N\3N\5N\u058b\nN\3N\3N\3N\5N\u0590\nN\3N\3N\3N\3N\3N\3N\3N\5N"+
		"\u0599\nN\3N\3N\3N\7N\u059e\nN\fN\16N\u05a1\13N\3N\5N\u05a4\nN\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u05b4\nN\3N\5N\u05b7\nN\3N\3N\3"+
		"N\3N\3N\3N\5N\u05bf\nN\3N\3N\3N\3N\3N\6N\u05c6\nN\rN\16N\u05c7\3N\3N\5"+
		"N\u05cc\nN\3N\3N\3N\5N\u05d1\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u05ef\nN\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\5N\u05fb\nN\3N\3N\3N\5N\u0600\nN\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\5N\u060c\nN\3N\3N\3N\3N\5N\u0612\nN\3N\3N\3N\3N\3N\5N\u0619"+
		"\nN\3N\3N\5N\u061d\nN\3N\3N\3N\3N\3N\3N\7N\u0625\nN\fN\16N\u0628\13N\5"+
		"N\u062a\nN\3N\3N\3N\3N\5N\u0630\nN\3N\5N\u0633\nN\7N\u0635\nN\fN\16N\u0638"+
		"\13N\3O\3O\3O\3O\3O\3O\7O\u0640\nO\fO\16O\u0643\13O\3O\3O\5O\u0647\nO"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0653\nO\3O\3O\5O\u0657\nO\7O\u0659"+
		"\nO\fO\16O\u065c\13O\3O\5O\u065f\nO\3O\3O\3O\3O\3O\5O\u0666\nO\5O\u0668"+
		"\nO\3P\3P\3P\3P\3P\3P\5P\u0670\nP\3P\3P\3Q\3Q\3Q\5Q\u0677\nQ\3Q\5Q\u067a"+
		"\nQ\3R\3R\5R\u067e\nR\3R\3R\3R\5R\u0683\nR\3R\3R\3R\3R\7R\u0689\nR\fR"+
		"\16R\u068c\13R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u069c\nR\f"+
		"R\16R\u069f\13R\3R\3R\3R\5R\u06a4\nR\3S\3S\5S\u06a8\nS\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\7S\u06b6\nS\fS\16S\u06b9\13S\3T\3T\3T\5T\u06be\n"+
		"T\3T\3T\3T\3T\3T\3T\5T\u06c6\nT\3U\3U\3U\5U\u06cb\nU\3U\5U\u06ce\nU\3"+
		"V\3V\3V\5V\u06d3\nV\3W\3W\3W\3W\3W\7W\u06da\nW\fW\16W\u06dd\13W\3W\3W"+
		"\5W\u06e1\nW\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\5X\u06ef\nX\3X\5X\u06f2"+
		"\nX\5X\u06f4\nX\3Y\3Y\3Y\5Y\u06f9\nY\3Y\3Y\5Y\u06fd\nY\3Y\5Y\u0700\nY"+
		"\3Y\3Y\3Y\3Y\3Y\5Y\u0707\nY\3Y\3Y\3Y\3Y\7Y\u070d\nY\fY\16Y\u0710\13Y\3"+
		"Y\5Y\u0713\nY\3Y\3Y\5Y\u0717\nY\3Y\5Y\u071a\nY\3Y\3Y\3Y\3Y\5Y\u0720\n"+
		"Y\3Y\5Y\u0723\nY\5Y\u0725\nY\3Z\3Z\3Z\3Z\3Z\7Z\u072c\nZ\fZ\16Z\u072f\13"+
		"Z\3[\3[\5[\u0733\n[\3[\3[\5[\u0737\n[\3[\3[\5[\u073b\n[\3[\5[\u073e\n"+
		"[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0747\n\\\f\\\16\\\u074a\13\\\3\\\3"+
		"\\\5\\\u074e\n\\\3]\3]\5]\u0752\n]\3]\3]\3]\7]\u0757\n]\f]\16]\u075a\13"+
		"]\3]\3]\3]\3]\7]\u0760\n]\f]\16]\u0763\13]\3]\5]\u0766\n]\5]\u0768\n]"+
		"\3]\3]\5]\u076c\n]\3]\3]\3]\3]\3]\7]\u0773\n]\f]\16]\u0776\13]\3]\3]\5"+
		"]\u077a\n]\5]\u077c\n]\3]\3]\3]\3]\3]\7]\u0783\n]\f]\16]\u0786\13]\3]"+
		"\3]\3]\3]\3]\3]\7]\u078e\n]\f]\16]\u0791\13]\3]\3]\7]\u0795\n]\f]\16]"+
		"\u0798\13]\5]\u079a\n]\3^\3^\3^\3^\3^\5^\u07a1\n^\3_\3_\3_\3_\3_\7_\u07a8"+
		"\n_\f_\16_\u07ab\13_\3_\3_\5_\u07af\n_\3`\5`\u07b2\n`\3`\3`\3a\3a\3b\3"+
		"b\3c\3c\3d\3d\5d\u07be\nd\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3"+
		"l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3"+
		"w\3x\3x\3x\3x\3x\3x\3x\5x\u07ed\nx\3x\2\3\u009ay\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\2\25\4\2\u009c"+
		"\u009c\u009f\u009f\4\2\u009d\u009d\u009f\u009f\4\2))CC\5\2AALLYY\4\2\66"+
		"\66II\4\2\f\fqq\3\2\u008a\u008b\4\2$$EE\7\2  OOXX\u0081\u0081\u0084\u0084"+
		"\4\2\16\16\23\24\3\2\17\20\3\2\25\30\3\2\31\34\6\2TThhjj}}\4\2BB\u0092"+
		"\u0092\5\2  OO\u0084\u0084\6\2;=oo\u009d\u009d\u009f\u00a0\4\2\17\21m"+
		"m\3\2 \u009b\u08f7\2\u00f0\3\2\2\2\4\u0109\3\2\2\2\6\u010b\3\2\2\2\b\u010e"+
		"\3\2\2\2\n\u0118\3\2\2\2\f\u011c\3\2\2\2\16\u0123\3\2\2\2\20\u0125\3\2"+
		"\2\2\22\u012a\3\2\2\2\24\u0131\3\2\2\2\26\u0136\3\2\2\2\30\u0138\3\2\2"+
		"\2\32\u0145\3\2\2\2\34\u0152\3\2\2\2\36\u0168\3\2\2\2 \u016a\3\2\2\2\""+
		"\u016e\3\2\2\2$\u0172\3\2\2\2&\u0176\3\2\2\2(\u017a\3\2\2\2*\u017e\3\2"+
		"\2\2,\u0182\3\2\2\2.\u0188\3\2\2\2\60\u018f\3\2\2\2\62\u019c\3\2\2\2\64"+
		"\u01aa\3\2\2\2\66\u01ae\3\2\2\28\u01b2\3\2\2\2:\u01b6\3\2\2\2<\u01bb\3"+
		"\2\2\2>\u01bf\3\2\2\2@\u01c1\3\2\2\2B\u01c3\3\2\2\2D\u01c5\3\2\2\2F\u01c7"+
		"\3\2\2\2H\u01c9\3\2\2\2J\u01cd\3\2\2\2L\u01d3\3\2\2\2N\u01d8\3\2\2\2P"+
		"\u01de\3\2\2\2R\u01f8\3\2\2\2T\u021a\3\2\2\2V\u022c\3\2\2\2X\u0235\3\2"+
		"\2\2Z\u023d\3\2\2\2\\\u0247\3\2\2\2^\u025a\3\2\2\2`\u027e\3\2\2\2b\u029e"+
		"\3\2\2\2d\u02c7\3\2\2\2f\u030c\3\2\2\2h\u031f\3\2\2\2j\u033d\3\2\2\2l"+
		"\u0347\3\2\2\2n\u0364\3\2\2\2p\u036a\3\2\2\2r\u0377\3\2\2\2t\u0384\3\2"+
		"\2\2v\u0391\3\2\2\2x\u03aa\3\2\2\2z\u03ca\3\2\2\2|\u0414\3\2\2\2~\u0423"+
		"\3\2\2\2\u0080\u0430\3\2\2\2\u0082\u0436\3\2\2\2\u0084\u0444\3\2\2\2\u0086"+
		"\u0453\3\2\2\2\u0088\u0476\3\2\2\2\u008a\u04df\3\2\2\2\u008c\u04e2\3\2"+
		"\2\2\u008e\u0505\3\2\2\2\u0090\u053b\3\2\2\2\u0092\u053d\3\2\2\2\u0094"+
		"\u0548\3\2\2\2\u0096\u055a\3\2\2\2\u0098\u0582\3\2\2\2\u009a\u05d0\3\2"+
		"\2\2\u009c\u0639\3\2\2\2\u009e\u0669\3\2\2\2\u00a0\u0673\3\2\2\2\u00a2"+
		"\u067d\3\2\2\2\u00a4\u06a5\3\2\2\2\u00a6\u06bd\3\2\2\2\u00a8\u06c7\3\2"+
		"\2\2\u00aa\u06d2\3\2\2\2\u00ac\u06d4\3\2\2\2\u00ae\u06f3\3\2\2\2\u00b0"+
		"\u0724\3\2\2\2\u00b2\u0726\3\2\2\2\u00b4\u073d\3\2\2\2\u00b6\u074d\3\2"+
		"\2\2\u00b8\u0799\3\2\2\2\u00ba\u07a0\3\2\2\2\u00bc\u07a2\3\2\2\2\u00be"+
		"\u07b1\3\2\2\2\u00c0\u07b5\3\2\2\2\u00c2\u07b7\3\2\2\2\u00c4\u07b9\3\2"+
		"\2\2\u00c6\u07bd\3\2\2\2\u00c8\u07bf\3\2\2\2\u00ca\u07c1\3\2\2\2\u00cc"+
		"\u07c3\3\2\2\2\u00ce\u07c5\3\2\2\2\u00d0\u07c7\3\2\2\2\u00d2\u07c9\3\2"+
		"\2\2\u00d4\u07cb\3\2\2\2\u00d6\u07cd\3\2\2\2\u00d8\u07cf\3\2\2\2\u00da"+
		"\u07d1\3\2\2\2\u00dc\u07d3\3\2\2\2\u00de\u07d5\3\2\2\2\u00e0\u07d7\3\2"+
		"\2\2\u00e2\u07d9\3\2\2\2\u00e4\u07db\3\2\2\2\u00e6\u07dd\3\2\2\2\u00e8"+
		"\u07df\3\2\2\2\u00ea\u07e1\3\2\2\2\u00ec\u07e3\3\2\2\2\u00ee\u07ec\3\2"+
		"\2\2\u00f0\u00f1\7\u0087\2\2\u00f1\u00f6\5\16\b\2\u00f2\u00f3\7\f\2\2"+
		"\u00f3\u00f5\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7R\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fd\5\6\4\2\u00fc\u00fb\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\5\n\6\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5\b"+
		"\5\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0106\5\f\7\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\7\2\2\3\u0108\3\3\2\2\2\u0109\u010a\t\2\2\2\u010a\5\3"+
		"\2\2\2\u010b\u010c\7\u0099\2\2\u010c\u010d\5\24\13\2\u010d\7\3\2\2\2\u010e"+
		"\u010f\7t\2\2\u010f\u0110\7/\2\2\u0110\u0115\5H%\2\u0111\u0112\7\f\2\2"+
		"\u0112\u0114\5H%\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\t\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\7U\2\2\u0119\u011a\7/\2\2\u011a\u011b\7\u009c\2\2\u011b\13\3\2"+
		"\2\2\u011c\u011d\7i\2\2\u011d\u011e\7\u009d\2\2\u011e\r\3\2\2\2\u011f"+
		"\u0124\7\16\2\2\u0120\u0124\7\u009c\2\2\u0121\u0124\5\22\n\2\u0122\u0124"+
		"\5\20\t\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0122\3\2\2\2\u0124\17\3\2\2\2\u0125\u0126\7\6\2\2\u0126\u0127"+
		"\7\n\2\2\u0127\u0128\7\u009d\2\2\u0128\u0129\7\13\2\2\u0129\21\3\2\2\2"+
		"\u012a\u012b\7\7\2\2\u012b\u012c\7\n\2\2\u012c\u012d\7\16\2\2\u012d\u012e"+
		"\7\13\2\2\u012e\23\3\2\2\2\u012f\u0132\5\26\f\2\u0130\u0132\5\36\20\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\25\3\2\2\2\u0133\u0137"+
		"\5\30\r\2\u0134\u0137\5\32\16\2\u0135\u0137\5\34\17\2\u0136\u0133\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\27\3\2\2\2\u0138\u0139"+
		"\7\n\2\2\u0139\u013a\5\24\13\2\u013a\u013b\7\'\2\2\u013b\u0140\5\24\13"+
		"\2\u013c\u013d\7\'\2\2\u013d\u013f\5\24\13\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\13\2\2\u0144\31\3\2\2\2\u0145\u0146"+
		"\7\n\2\2\u0146\u0147\5\24\13\2\u0147\u0148\7s\2\2\u0148\u014d\5\24\13"+
		"\2\u0149\u014a\7s\2\2\u014a\u014c\5\24\13\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\13\2\2\u0151\33\3\2\2\2\u0152\u0153"+
		"\7m\2\2\u0153\u0154\5\24\13\2\u0154\35\3\2\2\2\u0155\u0169\5 \21\2\u0156"+
		"\u0169\5\"\22\2\u0157\u0169\5$\23\2\u0158\u0169\5&\24\2\u0159\u0169\5"+
		"(\25\2\u015a\u0169\5*\26\2\u015b\u0169\5,\27\2\u015c\u0169\5.\30\2\u015d"+
		"\u0169\5\60\31\2\u015e\u0169\5\62\32\2\u015f\u0169\5\64\33\2\u0160\u0169"+
		"\5\66\34\2\u0161\u0169\58\35\2\u0162\u0169\5:\36\2\u0163\u0169\5<\37\2"+
		"\u0164\u0165\7\n\2\2\u0165\u0166\5\36\20\2\u0166\u0167\7\13\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0155\3\2\2\2\u0168\u0156\3\2\2\2\u0168\u0157\3\2"+
		"\2\2\u0168\u0158\3\2\2\2\u0168\u0159\3\2\2\2\u0168\u015a\3\2\2\2\u0168"+
		"\u015b\3\2\2\2\u0168\u015c\3\2\2\2\u0168\u015d\3\2\2\2\u0168\u015e\3\2"+
		"\2\2\u0168\u015f\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0161\3\2\2\2\u0168"+
		"\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0169\37\3\2\2"+
		"\2\u016a\u016b\5> \2\u016b\u016c\7\r\2\2\u016c\u016d\5F$\2\u016d!\3\2"+
		"\2\2\u016e\u016f\5> \2\u016f\u0170\7\37\2\2\u0170\u0171\5F$\2\u0171#\3"+
		"\2\2\2\u0172\u0173\5> \2\u0173\u0174\7\32\2\2\u0174\u0175\5F$\2\u0175"+
		"%\3\2\2\2\u0176\u0177\5> \2\u0177\u0178\7\31\2\2\u0178\u0179\5F$\2\u0179"+
		"\'\3\2\2\2\u017a\u017b\5> \2\u017b\u017c\7\34\2\2\u017c\u017d\5F$\2\u017d"+
		")\3\2\2\2\u017e\u017f\5> \2\u017f\u0180\7\33\2\2\u0180\u0181\5F$\2\u0181"+
		"+\3\2\2\2\u0182\u0183\5> \2\u0183\u0184\7.\2\2\u0184\u0185\5F$\2\u0185"+
		"\u0186\7\'\2\2\u0186\u0187\5F$\2\u0187-\3\2\2\2\u0188\u0189\5> \2\u0189"+
		"\u018a\7m\2\2\u018a\u018b\7.\2\2\u018b\u018c\5F$\2\u018c\u018d\7\'\2\2"+
		"\u018d\u018e\5F$\2\u018e/\3\2\2\2\u018f\u0190\5> \2\u0190\u0191\7Z\2\2"+
		"\u0191\u0192\7\n\2\2\u0192\u0197\5F$\2\u0193\u0194\7\f\2\2\u0194\u0196"+
		"\5F$\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\13"+
		"\2\2\u019b\61\3\2\2\2\u019c\u019d\5> \2\u019d\u019e\7m\2\2\u019e\u019f"+
		"\7Z\2\2\u019f\u01a0\7\n\2\2\u01a0\u01a5\5F$\2\u01a1\u01a2\7\f\2\2\u01a2"+
		"\u01a4\5F$\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9"+
		"\7\13\2\2\u01a9\63\3\2\2\2\u01aa\u01ab\5> \2\u01ab\u01ac\7h\2\2\u01ac"+
		"\u01ad\5@!\2\u01ad\65\3\2\2\2\u01ae\u01af\5> \2\u01af\u01b0\7h\2\2\u01b0"+
		"\u01b1\5B\"\2\u01b1\67\3\2\2\2\u01b2\u01b3\5> \2\u01b3\u01b4\7h\2\2\u01b4"+
		"\u01b5\5D#\2\u01b59\3\2\2\2\u01b6\u01b7\5> \2\u01b7\u01b8\7c\2\2\u01b8"+
		"\u01b9\7m\2\2\u01b9\u01ba\7o\2\2\u01ba;\3\2\2\2\u01bb\u01bc\5> \2\u01bc"+
		"\u01bd\7c\2\2\u01bd\u01be\7o\2\2\u01be=\3\2\2\2\u01bf\u01c0\t\2\2\2\u01c0"+
		"?\3\2\2\2\u01c1\u01c2\7\3\2\2\u01c2A\3\2\2\2\u01c3\u01c4\7\4\2\2\u01c4"+
		"C\3\2\2\2\u01c5\u01c6\7\5\2\2\u01c6E\3\2\2\2\u01c7\u01c8\t\3\2\2\u01c8"+
		"G\3\2\2\2\u01c9\u01cb\5> \2\u01ca\u01cc\5J&\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01ccI\3\2\2\2\u01cd\u01ce\t\4\2\2\u01ceK\3\2\2\2\u01cf"+
		"\u01d2\5P)\2\u01d0\u01d2\5N(\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2"+
		"\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7\2\2\3\u01d7M\3\2\2\2\u01d8"+
		"\u01d9\7\u00a4\2\2\u01d9\u01da\b(\1\2\u01daO\3\2\2\2\u01db\u01dd\7\b\2"+
		"\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01ea\5R*\2\u01e2"+
		"\u01e4\7\b\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5R*\2\u01e8\u01e3"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01f0\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\b\2\2\u01ee\u01ed\3\2"+
		"\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"Q\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\7N\2\2\u01f4\u01f5\7y\2\2\u01f5"+
		"\u01f7\7v\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0218\3\2\2\2\u01fa"+
		"\u0219\5T+\2\u01fb\u0219\5V,\2\u01fc\u0219\5X-\2\u01fd\u0219\5Z.\2\u01fe"+
		"\u0219\5\\/\2\u01ff\u0219\5^\60\2\u0200\u0219\5`\61\2\u0201\u0219\5b\62"+
		"\2\u0202\u0219\5d\63\2\u0203\u0219\5f\64\2\u0204\u0219\5h\65\2\u0205\u0219"+
		"\5j\66\2\u0206\u0219\5l\67\2\u0207\u0219\5n8\2\u0208\u0219\5p9\2\u0209"+
		"\u0219\5r:\2\u020a\u0219\5t;\2\u020b\u0219\5v<\2\u020c\u0219\5x=\2\u020d"+
		"\u0219\5z>\2\u020e\u0219\5|?\2\u020f\u0219\5~@\2\u0210\u0219\5\u0080A"+
		"\2\u0211\u0219\5\u0082B\2\u0212\u0219\5\u0084C\2\u0213\u0219\5\u0086D"+
		"\2\u0214\u0219\5\u0088E\2\u0215\u0219\5\u008cG\2\u0216\u0219\5\u008eH"+
		"\2\u0217\u0219\5\u0090I\2\u0218\u01fa\3\2\2\2\u0218\u01fb\3\2\2\2\u0218"+
		"\u01fc\3\2\2\2\u0218\u01fd\3\2\2\2\u0218\u01fe\3\2\2\2\u0218\u01ff\3\2"+
		"\2\2\u0218\u0200\3\2\2\2\u0218\u0201\3\2\2\2\u0218\u0202\3\2\2\2\u0218"+
		"\u0203\3\2\2\2\u0218\u0204\3\2\2\2\u0218\u0205\3\2\2\2\u0218\u0206\3\2"+
		"\2\2\u0218\u0207\3\2\2\2\u0218\u0208\3\2\2\2\u0218\u0209\3\2\2\2\u0218"+
		"\u020a\3\2\2\2\u0218\u020b\3\2\2\2\u0218\u020c\3\2\2\2\u0218\u020d\3\2"+
		"\2\2\u0218\u020e\3\2\2\2\u0218\u020f\3\2\2\2\u0218\u0210\3\2\2\2\u0218"+
		"\u0211\3\2\2\2\u0218\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0218\u0215\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219"+
		"S\3\2\2\2\u021a\u021b\7%\2\2\u021b\u021f\7\u0089\2\2\u021c\u021d\5\u00d0"+
		"i\2\u021d\u021e\7\t\2\2\u021e\u0220\3\2\2\2\u021f\u021c\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022a\5\u00d2j\2\u0222\u0223"+
		"\7\u0080\2\2\u0223\u0224\7\u008d\2\2\u0224\u022b\5\u00d6l\2\u0225\u0227"+
		"\7\"\2\2\u0226\u0228\7\65\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022b\5\u0092J\2\u022a\u0222\3\2\2\2\u022a"+
		"\u0225\3\2\2\2\u022bU\3\2\2\2\u022c\u0233\7&\2\2\u022d\u0234\5\u00d0i"+
		"\2\u022e\u0234\5\u00d4k\2\u022f\u0230\5\u00d0i\2\u0230\u0231\7\t\2\2\u0231"+
		"\u0232\5\u00d4k\2\u0232\u0234\3\2\2\2\u0233\u022d\3\2\2\2\u0233\u022e"+
		"\3\2\2\2\u0233\u022f\3\2\2\2\u0233\u0234\3\2\2\2\u0234W\3\2\2\2\u0235"+
		"\u0237\7*\2\2\u0236\u0238\7>\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238\u0239\3\2\2\2\u0239\u023a\5\u009aN\2\u023a\u023b\7(\2\2\u023b"+
		"\u023c\5\u00d0i\2\u023cY\3\2\2\2\u023d\u023f\7-\2\2\u023e\u0240\t\5\2"+
		"\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0245\3\2\2\2\u0241\u0243"+
		"\7\u008e\2\2\u0242\u0244\5\u00ecw\2\u0243\u0242\3\2\2\2\u0243\u0244\3"+
		"\2\2\2\u0244\u0246\3\2\2\2\u0245\u0241\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"[\3\2\2\2\u0247\u024c\t\6\2\2\u0248\u024a\7\u008e\2\2\u0249\u024b\5\u00ec"+
		"w\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u0248\3\2\2\2\u024c\u024d\3\2\2\2\u024d]\3\2\2\2\u024e\u0250\7\u009a"+
		"\2\2\u024f\u0251\7{\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0257\5\u00acW\2\u0253\u0254\7\f\2\2\u0254\u0256"+
		"\5\u00acW\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2"+
		"\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u024e"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0266\5\u00b8]"+
		"\2\u025d\u025f\7\u0090\2\2\u025e\u0260\7$\2\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0264\3\2\2\2\u0261\u0264\7a\2\2\u0262\u0264\7K\2"+
		"\2\u0263\u025d\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0267\5\u00b8]\2\u0266\u0263\3\2\2\2\u0267\u0268\3\2\2"+
		"\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0274\3\2\2\2\u026a\u026b"+
		"\7t\2\2\u026b\u026c\7/\2\2\u026c\u0271\5\u00a8U\2\u026d\u026e\7\f\2\2"+
		"\u026e\u0270\5\u00a8U\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2"+
		"\2\2\u0274\u026a\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027c\3\2\2\2\u0276"+
		"\u0277\7i\2\2\u0277\u027a\5\u009aN\2\u0278\u0279\t\7\2\2\u0279\u027b\5"+
		"\u009aN\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2"+
		"\u027c\u0276\3\2\2\2\u027c\u027d\3\2\2\2\u027d_\3\2\2\2\u027e\u0280\7"+
		"9\2\2\u027f\u0281\7\u0091\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0286\7[\2\2\u0283\u0284\7W\2\2\u0284\u0285"+
		"\7m\2\2\u0285\u0287\7M\2\2\u0286\u0283\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u028b\3\2\2\2\u0288\u0289\5\u00d0i\2\u0289\u028a\7\t\2\2\u028a\u028c"+
		"\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028e\5\u00dep\2\u028e\u028f\7r\2\2\u028f\u0290\5\u00d2j\2\u0290\u0291"+
		"\7\n\2\2\u0291\u0296\5\u00a0Q\2\u0292\u0293\7\f\2\2\u0293\u0295\5\u00a0"+
		"Q\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029c\7\13"+
		"\2\2\u029a\u029b\7\u0099\2\2\u029b\u029d\5\u009aN\2\u029c\u029a\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029da\3\2\2\2\u029e\u02a0\79\2\2\u029f\u02a1\t"+
		"\b\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a6\7\u0089\2\2\u02a3\u02a4\7W\2\2\u02a4\u02a5\7m\2\2\u02a5\u02a7\7"+
		"M\2\2\u02a6\u02a3\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ab\3\2\2\2\u02a8"+
		"\u02a9\5\u00d0i\2\u02a9\u02aa\7\t\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a8"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02c5\5\u00d2j"+
		"\2\u02ae\u02af\7\n\2\2\u02af\u02b4\5\u0092J\2\u02b0\u02b1\7\f\2\2\u02b1"+
		"\u02b3\5\u0092J\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bb\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\7\f\2\2\u02b8\u02ba\5\u00a2R\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd"+
		"\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02be\u02c1\7\13\2\2\u02bf\u02c0\7\u009b\2\2\u02c0\u02c2"+
		"\7\u009c\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c6\3\2\2"+
		"\2\u02c3\u02c4\7(\2\2\u02c4\u02c6\5\u0088E\2\u02c5\u02ae\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6c\3\2\2\2\u02c7\u02c9\79\2\2\u02c8\u02ca\t\b\2\2\u02c9"+
		"\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cf\7\u008f"+
		"\2\2\u02cc\u02cd\7W\2\2\u02cd\u02ce\7m\2\2\u02ce\u02d0\7M\2\2\u02cf\u02cc"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d4\3\2\2\2\u02d1\u02d2\5\u00d0i"+
		"\2\u02d2\u02d3\7\t\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d1\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db\5\u00e0q\2\u02d7\u02dc\7,\2\2"+
		"\u02d8\u02dc\7#\2\2\u02d9\u02da\7`\2\2\u02da\u02dc\7p\2\2\u02db\u02d7"+
		"\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02eb\3\2\2\2\u02dd\u02ec\7B\2\2\u02de\u02ec\7_\2\2\u02df\u02e9\7\u0092"+
		"\2\2\u02e0\u02e1\7p\2\2\u02e1\u02e6\5\u00d8m\2\u02e2\u02e3\7\f\2\2\u02e3"+
		"\u02e5\5\u00d8m\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02e0\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02dd\3\2"+
		"\2\2\u02eb\u02de\3\2\2\2\u02eb\u02df\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02f1\7r\2\2\u02ee\u02ef\5\u00d0i\2\u02ef\u02f0\7\t\2\2\u02f0\u02f2\3"+
		"\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f7\5\u00d2j\2\u02f4\u02f5\7P\2\2\u02f5\u02f6\7G\2\2\u02f6\u02f8\7"+
		"\u0085\2\2\u02f7\u02f4\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2"+
		"\u02f9\u02fa\7\u0098\2\2\u02fa\u02fc\5\u009aN\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0306\7-\2\2\u02fe\u0303\5\u008c"+
		"G\2\u02ff\u0303\5z>\2\u0300\u0303\5j\66\2\u0301\u0303\5\u0088E\2\u0302"+
		"\u02fe\3\2\2\2\u0302\u02ff\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u0305\7\b\2\2\u0305\u0307\3\2\2\2\u0306"+
		"\u0302\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\u030a\3\2\2\2\u030a\u030b\7I\2\2\u030be\3\2\2\2\u030c\u030e"+
		"\79\2\2\u030d\u030f\t\b\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0314\7\u0096\2\2\u0311\u0312\7W\2\2\u0312\u0313"+
		"\7m\2\2\u0313\u0315\7M\2\2\u0314\u0311\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0319\3\2\2\2\u0316\u0317\5\u00d0i\2\u0317\u0318\7\t\2\2\u0318\u031a"+
		"\3\2\2\2\u0319\u0316\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\5\u00e2r\2\u031c\u031d\7(\2\2\u031d\u031e\5\u0088E\2\u031eg\3\2"+
		"\2\2\u031f\u0320\79\2\2\u0320\u0321\7\u0097\2\2\u0321\u0325\7\u0089\2"+
		"\2\u0322\u0323\7W\2\2\u0323\u0324\7m\2\2\u0324\u0326\7M\2\2\u0325\u0322"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u032a\3\2\2\2\u0327\u0328\5\u00d0i"+
		"\2\u0328\u0329\7\t\2\2\u0329\u032b\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\5\u00d2j\2\u032d\u032e\7\u0093"+
		"\2\2\u032e\u033a\5\u00e4s\2\u032f\u0330\7\n\2\2\u0330\u0335\5\u00c6d\2"+
		"\u0331\u0332\7\f\2\2\u0332\u0334\5\u00c6d\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2"+
		"\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7\13\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u032f\3\2\2\2\u033a\u033b\3\2\2\2\u033bi\3\2\2\2\u033c\u033e\5\u00a4"+
		"S\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0340\7B\2\2\u0340\u0341\7R\2\2\u0341\u0344\5\u00a6T\2\u0342\u0343\7"+
		"\u0099\2\2\u0343\u0345\5\u009aN\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345k\3\2\2\2\u0346\u0348\5\u00a4S\2\u0347\u0346\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7B\2\2\u034a\u034b\7R\2\2\u034b"+
		"\u034e\5\u00a6T\2\u034c\u034d\7\u0099\2\2\u034d\u034f\5\u009aN\2\u034e"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0362\3\2\2\2\u0350\u0351\7t"+
		"\2\2\u0351\u0352\7/\2\2\u0352\u0357\5\u00a8U\2\u0353\u0354\7\f\2\2\u0354"+
		"\u0356\5\u00a8U\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355"+
		"\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u0350\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7i"+
		"\2\2\u035d\u0360\5\u009aN\2\u035e\u035f\t\7\2\2\u035f\u0361\5\u009aN\2"+
		"\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u035a"+
		"\3\2\2\2\u0362\u0363\3\2\2\2\u0363m\3\2\2\2\u0364\u0366\7D\2\2\u0365\u0367"+
		"\7>\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\5\u00d0i\2\u0369o\3\2\2\2\u036a\u036b\7F\2\2\u036b\u036e\7[\2\2"+
		"\u036c\u036d\7W\2\2\u036d\u036f\7M\2\2\u036e\u036c\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u0373\3\2\2\2\u0370\u0371\5\u00d0i\2\u0371\u0372\7\t\2"+
		"\2\u0372\u0374\3\2\2\2\u0373\u0370\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\5\u00dep\2\u0376q\3\2\2\2\u0377\u0378\7F\2\2\u0378"+
		"\u037b\7\u0089\2\2\u0379\u037a\7W\2\2\u037a\u037c\7M\2\2\u037b\u0379\3"+
		"\2\2\2\u037b\u037c\3\2\2\2\u037c\u0380\3\2\2\2\u037d\u037e\5\u00d0i\2"+
		"\u037e\u037f\7\t\2\2\u037f\u0381\3\2\2\2\u0380\u037d\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\5\u00d2j\2\u0383s\3\2\2\2\u0384"+
		"\u0385\7F\2\2\u0385\u0388\7\u008f\2\2\u0386\u0387\7W\2\2\u0387\u0389\7"+
		"M\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038d\3\2\2\2\u038a"+
		"\u038b\5\u00d0i\2\u038b\u038c\7\t\2\2\u038c\u038e\3\2\2\2\u038d\u038a"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\5\u00e0q"+
		"\2\u0390u\3\2\2\2\u0391\u0392\7F\2\2\u0392\u0395\7\u0096\2\2\u0393\u0394"+
		"\7W\2\2\u0394\u0396\7M\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u039a\3\2\2\2\u0397\u0398\5\u00d0i\2\u0398\u0399\7\t\2\2\u0399\u039b"+
		"\3\2\2\2\u039a\u0397\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\5\u00e2r\2\u039dw\3\2\2\2\u039e\u03a0\7\u009a\2\2\u039f\u03a1\7"+
		"{\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a7\5\u00acW\2\u03a3\u03a4\7\f\2\2\u03a4\u03a6\5\u00acW\2\u03a5\u03a3"+
		"\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u039e\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b2\5\u00b8]\2\u03ad\u03ae\5\u00ba^\2"+
		"\u03ae\u03af\5\u00b8]\2\u03af\u03b1\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b1"+
		"\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03bf\3\2"+
		"\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\7t\2\2\u03b6\u03b7\7/\2\2\u03b7\u03bc"+
		"\5\u00a8U\2\u03b8\u03b9\7\f\2\2\u03b9\u03bb\5\u00a8U\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03b5\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c7\3\2\2\2\u03c1\u03c2\7i\2\2\u03c2\u03c5\5\u009aN\2\u03c3"+
		"\u03c4\t\7\2\2\u03c4\u03c6\5\u009aN\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"y\3\2\2\2\u03c9\u03cb\5\u00a4S\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2"+
		"\2\u03cb\u03dd\3\2\2\2\u03cc\u03de\7_\2\2\u03cd\u03de\7\u0081\2\2\u03ce"+
		"\u03cf\7_\2\2\u03cf\u03d0\7s\2\2\u03d0\u03de\7\u0081\2\2\u03d1\u03d2\7"+
		"_\2\2\u03d2\u03d3\7s\2\2\u03d3\u03de\7\u0084\2\2\u03d4\u03d5\7_\2\2\u03d5"+
		"\u03d6\7s\2\2\u03d6\u03de\7 \2\2\u03d7\u03d8\7_\2\2\u03d8\u03d9\7s\2\2"+
		"\u03d9\u03de\7O\2\2\u03da\u03db\7_\2\2\u03db\u03dc\7s\2\2\u03dc\u03de"+
		"\7X\2\2\u03dd\u03cc\3\2\2\2\u03dd\u03cd\3\2\2\2\u03dd\u03ce\3\2\2\2\u03dd"+
		"\u03d1\3\2\2\2\u03dd\u03d4\3\2\2\2\u03dd\u03d7\3\2\2\2\u03dd\u03da\3\2"+
		"\2\2\u03de\u03df\3\2\2\2\u03df\u03e3\7b\2\2\u03e0\u03e1\5\u00d0i\2\u03e1"+
		"\u03e2\7\t\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e0\3\2\2\2\u03e3\u03e4\3\2"+
		"\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03f1\5\u00d2j\2\u03e6\u03e7\7\n\2\2\u03e7"+
		"\u03ec\5\u00d8m\2\u03e8\u03e9\7\f\2\2\u03e9\u03eb\5\u00d8m\2\u03ea\u03e8"+
		"\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7\13\2\2\u03f0\u03f2\3"+
		"\2\2\2\u03f1\u03e6\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0412\3\2\2\2\u03f3"+
		"\u03f4\7\u0095\2\2\u03f4\u03f5\7\n\2\2\u03f5\u03fa\5\u009aN\2\u03f6\u03f7"+
		"\7\f\2\2\u03f7\u03f9\5\u009aN\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2"+
		"\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fa"+
		"\3\2\2\2\u03fd\u040c\7\13\2\2\u03fe\u03ff\7\f\2\2\u03ff\u0400\7\n\2\2"+
		"\u0400\u0405\5\u009aN\2\u0401\u0402\7\f\2\2\u0402\u0404\5\u009aN\2\u0403"+
		"\u0401\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7\13\2\2\u0409"+
		"\u040b\3\2\2\2\u040a\u03fe\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040c\u040d\3\2\2\2\u040d\u0413\3\2\2\2\u040e\u040c\3\2\2\2\u040f"+
		"\u0413\5\u0088E\2\u0410\u0411\7?\2\2\u0411\u0413\7\u0095\2\2\u0412\u03f3"+
		"\3\2\2\2\u0412\u040f\3\2\2\2\u0412\u0410\3\2\2\2\u0413{\3\2\2\2\u0414"+
		"\u0418\7w\2\2\u0415\u0416\5\u00d0i\2\u0416\u0417\7\t\2\2\u0417\u0419\3"+
		"\2\2\2\u0418\u0415\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u0421\5\u00e6t\2\u041b\u041c\7\r\2\2\u041c\u0422\5\u00aaV\2\u041d\u041e"+
		"\7\n\2\2\u041e\u041f\5\u00aaV\2\u041f\u0420\7\13\2\2\u0420\u0422\3\2\2"+
		"\2\u0421\u041b\3\2\2\2\u0421\u041d\3\2\2\2\u0421\u0422\3\2\2\2\u0422}"+
		"\3\2\2\2\u0423\u042e\7~\2\2\u0424\u042f\5\u00dan\2\u0425\u0426\5\u00d0"+
		"i\2\u0426\u0427\7\t\2\2\u0427\u0429\3\2\2\2\u0428\u0425\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u042d\5\u00d2j\2\u042b\u042d"+
		"\5\u00dep\2\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2\2\u042d\u042f\3\2\2"+
		"\2\u042e\u0424\3\2\2\2\u042e\u0428\3\2\2\2\u042e\u042f\3\2\2\2\u042f\177"+
		"\3\2\2\2\u0430\u0432\7\177\2\2\u0431\u0433\7\u0086\2\2\u0432\u0431\3\2"+
		"\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\5\u00e8u\2\u0435"+
		"\u0081\3\2\2\2\u0436\u043b\7\u0084\2\2\u0437\u0439\7\u008e\2\2\u0438\u043a"+
		"\5\u00ecw\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2"+
		"\2\u043b\u0437\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0442\3\2\2\2\u043d\u043f"+
		"\7\u008d\2\2\u043e\u0440\7\u0086\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3"+
		"\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\5\u00e8u\2\u0442\u043d\3\2\2\2"+
		"\u0442\u0443\3\2\2\2\u0443\u0083\3\2\2\2\u0444\u0445\7\u0086\2\2\u0445"+
		"\u0446\5\u00e8u\2\u0446\u0085\3\2\2\2\u0447\u0449\7\u009a\2\2\u0448\u044a"+
		"\7{\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u0450\5\u00acW\2\u044c\u044d\7\f\2\2\u044d\u044f\5\u00acW\2\u044e\u044c"+
		"\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0447\3\2\2\2\u0453\u0454\3\2"+
		"\2\2\u0454\u0455\3\2\2\2\u0455\u0460\5\u00b8]\2\u0456\u0457\7t\2\2\u0457"+
		"\u0458\7/\2\2\u0458\u045d\5\u00a8U\2\u0459\u045a\7\f\2\2\u045a\u045c\5"+
		"\u00a8U\2\u045b\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2"+
		"\u045d\u045e\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0456"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0468\3\2\2\2\u0462\u0463\7i\2\2\u0463"+
		"\u0466\5\u009aN\2\u0464\u0465\t\7\2\2\u0465\u0467\5\u009aN\2\u0466\u0464"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0462\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u0087\3\2\2\2\u046a\u046c\7\u009a\2\2\u046b\u046d"+
		"\7{\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0473\5\u00acW\2\u046f\u0470\7\f\2\2\u0470\u0472\5\u00acW\2\u0471\u046f"+
		"\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u046a\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0478\3\2\2\2\u0478\u047e\5\u008aF\2\u0479\u047a\5\u00ba^\2"+
		"\u047a\u047b\5\u008aF\2\u047b\u047d\3\2\2\2\u047c\u0479\3\2\2\2\u047d"+
		"\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u048b\3\2"+
		"\2\2\u0480\u047e\3\2\2\2\u0481\u0482\7t\2\2\u0482\u0483\7/\2\2\u0483\u0488"+
		"\5\u00a8U\2\u0484\u0485\7\f\2\2\u0485\u0487\5\u00a8U\2\u0486\u0484\3\2"+
		"\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u0481\3\2\2\2\u048b\u048c\3\2"+
		"\2\2\u048c\u0493\3\2\2\2\u048d\u048e\7i\2\2\u048e\u0491\5\u009aN\2\u048f"+
		"\u0490\t\7\2\2\u0490\u0492\5\u009aN\2\u0491\u048f\3\2\2\2\u0491\u0492"+
		"\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u048d\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0089\3\2\2\2\u0495\u0497\7\u0087\2\2\u0496\u0498\t\t\2\2\u0497\u0496"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049e\5\u00aeX"+
		"\2\u049a\u049b\7\f\2\2\u049b\u049d\5\u00aeX\2\u049c\u049a\3\2\2\2\u049d"+
		"\u04a0\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04ad\3\2"+
		"\2\2\u04a0\u049e\3\2\2\2\u04a1\u04ab\7R\2\2\u04a2\u04a7\5\u00b0Y\2\u04a3"+
		"\u04a4\7\f\2\2\u04a4\u04a6\5\u00b0Y\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9"+
		"\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04ac\3\2\2\2\u04a9"+
		"\u04a7\3\2\2\2\u04aa\u04ac\5\u00b2Z\2\u04ab\u04a2\3\2\2\2\u04ab\u04aa"+
		"\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04a1\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04b1\3\2\2\2\u04af\u04b0\7\u0099\2\2\u04b0\u04b2\5\u009aN\2\u04b1\u04af"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04c1\3\2\2\2\u04b3\u04b4\7U\2\2\u04b4"+
		"\u04b5\7/\2\2\u04b5\u04ba\5\u009aN\2\u04b6\u04b7\7\f\2\2\u04b7\u04b9\5"+
		"\u009aN\2\u04b8\u04b6\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2"+
		"\u04ba\u04bb\3\2\2\2\u04bb\u04bf\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04be"+
		"\7V\2\2\u04be\u04c0\5\u009aN\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2"+
		"\u04c0\u04c2\3\2\2\2\u04c1\u04b3\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04e0"+
		"\3\2\2\2\u04c3\u04c4\7\u0095\2\2\u04c4\u04c5\7\n\2\2\u04c5\u04ca\5\u009a"+
		"N\2\u04c6\u04c7\7\f\2\2\u04c7\u04c9\5\u009aN\2\u04c8\u04c6\3\2\2\2\u04c9"+
		"\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2"+
		"\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04dc\7\13\2\2\u04ce\u04cf\7\f\2\2\u04cf"+
		"\u04d0\7\n\2\2\u04d0\u04d5\5\u009aN\2\u04d1\u04d2\7\f\2\2\u04d2\u04d4"+
		"\5\u009aN\2\u04d3\u04d1\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04d9"+
		"\7\13\2\2\u04d9\u04db\3\2\2\2\u04da\u04ce\3\2\2\2\u04db\u04de\3\2\2\2"+
		"\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc"+
		"\3\2\2\2\u04df\u0495\3\2\2\2\u04df\u04c3\3\2\2\2\u04e0\u008b\3\2\2\2\u04e1"+
		"\u04e3\5\u00a4S\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4"+
		"\3\2\2\2\u04e4\u04ef\7\u0092\2\2\u04e5\u04e6\7s\2\2\u04e6\u04f0\7\u0084"+
		"\2\2\u04e7\u04e8\7s\2\2\u04e8\u04f0\7 \2\2\u04e9\u04ea\7s\2\2\u04ea\u04f0"+
		"\7\u0081\2\2\u04eb\u04ec\7s\2\2\u04ec\u04f0\7O\2\2\u04ed\u04ee\7s\2\2"+
		"\u04ee\u04f0\7X\2\2\u04ef\u04e5\3\2\2\2\u04ef\u04e7\3\2\2\2\u04ef\u04e9"+
		"\3\2\2\2\u04ef\u04eb\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\5\u00a6T\2\u04f2\u04f3\7\u0088\2\2\u04f3\u04f4"+
		"\5\u00d8m\2\u04f4\u04f5\7\r\2\2\u04f5\u04fd\5\u009aN\2\u04f6\u04f7\7\f"+
		"\2\2\u04f7\u04f8\5\u00d8m\2\u04f8\u04f9\7\r\2\2\u04f9\u04fa\5\u009aN\2"+
		"\u04fa\u04fc\3\2\2\2\u04fb\u04f6\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb"+
		"\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0502\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500"+
		"\u0501\7\u0099\2\2\u0501\u0503\5\u009aN\2\u0502\u0500\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u008d\3\2\2\2\u0504\u0506\5\u00a4S\2\u0505\u0504\3\2\2"+
		"\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0512\7\u0092\2\2\u0508"+
		"\u0509\7s\2\2\u0509\u0513\7\u0084\2\2\u050a\u050b\7s\2\2\u050b\u0513\7"+
		" \2\2\u050c\u050d\7s\2\2\u050d\u0513\7\u0081\2\2\u050e\u050f\7s\2\2\u050f"+
		"\u0513\7O\2\2\u0510\u0511\7s\2\2\u0511\u0513\7X\2\2\u0512\u0508\3\2\2"+
		"\2\u0512\u050a\3\2\2\2\u0512\u050c\3\2\2\2\u0512\u050e\3\2\2\2\u0512\u0510"+
		"\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\5\u00a6T"+
		"\2\u0515\u0516\7\u0088\2\2\u0516\u0517\5\u00d8m\2\u0517\u0518\7\r\2\2"+
		"\u0518\u0520\5\u009aN\2\u0519\u051a\7\f\2\2\u051a\u051b\5\u00d8m\2\u051b"+
		"\u051c\7\r\2\2\u051c\u051d\5\u009aN\2\u051d\u051f\3\2\2\2\u051e\u0519"+
		"\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0525\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0524\7\u0099\2\2\u0524\u0526"+
		"\5\u009aN\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0539\3\2\2"+
		"\2\u0527\u0528\7t\2\2\u0528\u0529\7/\2\2\u0529\u052e\5\u00a8U\2\u052a"+
		"\u052b\7\f\2\2\u052b\u052d\5\u00a8U\2\u052c\u052a\3\2\2\2\u052d\u0530"+
		"\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0532\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0531\u0527\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2"+
		"\2\2\u0533\u0534\7i\2\2\u0534\u0537\5\u009aN\2\u0535\u0536\t\7\2\2\u0536"+
		"\u0538\5\u009aN\2\u0537\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a"+
		"\3\2\2\2\u0539\u0531\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u008f\3\2\2\2\u053b"+
		"\u053c\7\u0094\2\2\u053c\u0091\3\2\2\2\u053d\u053f\5\u00d8m\2\u053e\u0540"+
		"\5\u0094K\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0544\3\2\2"+
		"\2\u0541\u0543\5\u0096L\2\u0542\u0541\3\2\2\2\u0543\u0546\3\2\2\2\u0544"+
		"\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0093\3\2\2\2\u0546\u0544\3\2"+
		"\2\2\u0547\u0549\5\u00ccg\2\u0548\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0556\3\2\2\2\u054c\u054d\7\n"+
		"\2\2\u054d\u054e\5\u00be`\2\u054e\u054f\7\13\2\2\u054f\u0557\3\2\2\2\u0550"+
		"\u0551\7\n\2\2\u0551\u0552\5\u00be`\2\u0552\u0553\7\f\2\2\u0553\u0554"+
		"\5\u00be`\2\u0554\u0555\7\13\2\2\u0555\u0557\3\2\2\2\u0556\u054c\3\2\2"+
		"\2\u0556\u0550\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0095\3\2\2\2\u0558\u0559"+
		"\78\2\2\u0559\u055b\5\u00ccg\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2"+
		"\u055b\u057d\3\2\2\2\u055c\u055d\7x\2\2\u055d\u055f\7f\2\2\u055e\u0560"+
		"\t\4\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u0563\5\u0098M\2\u0562\u0564\7+\2\2\u0563\u0562\3\2\2\2\u0563\u0564\3"+
		"\2\2\2\u0564\u057e\3\2\2\2\u0565\u0567\7m\2\2\u0566\u0565\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\7o\2\2\u0569\u057e\5\u0098"+
		"M\2\u056a\u056b\7\u0091\2\2\u056b\u057e\5\u0098M\2\u056c\u056d\7\63\2"+
		"\2\u056d\u056e\7\n\2\2\u056e\u056f\5\u009aN\2\u056f\u0570\7\13\2\2\u0570"+
		"\u057e\3\2\2\2\u0571\u0578\7?\2\2\u0572\u0579\5\u00be`\2\u0573\u0579\5"+
		"\u00c0a\2\u0574\u0575\7\n\2\2\u0575\u0576\5\u009aN\2\u0576\u0577\7\13"+
		"\2\2\u0577\u0579\3\2\2\2\u0578\u0572\3\2\2\2\u0578\u0573\3\2\2\2\u0578"+
		"\u0574\3\2\2\2\u0579\u057e\3\2\2\2\u057a\u057b\7\64\2\2\u057b\u057e\5"+
		"\u00dan\2\u057c\u057e\5\u009cO\2\u057d\u055c\3\2\2\2\u057d\u0566\3\2\2"+
		"\2\u057d\u056a\3\2\2\2\u057d\u056c\3\2\2\2\u057d\u0571\3\2\2\2\u057d\u057a"+
		"\3\2\2\2\u057d\u057c\3\2\2\2\u057e\u0097\3\2\2\2\u057f\u0580\7r\2\2\u0580"+
		"\u0581\7\67\2\2\u0581\u0583\t\n\2\2\u0582\u057f\3\2\2\2\u0582\u0583\3"+
		"\2\2\2\u0583\u0099\3\2\2\2\u0584\u0585\bN\1\2\u0585\u05d1\5\u00c0a\2\u0586"+
		"\u05d1\7\u009e\2\2\u0587\u0588\5\u00d0i\2\u0588\u0589\7\t\2\2\u0589\u058b"+
		"\3\2\2\2\u058a\u0587\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058d\5\u00d2j\2\u058d\u058e\7\t\2\2\u058e\u0590\3\2\2\2\u058f\u058a"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u05d1\5\u00d8m"+
		"\2\u0592\u0593\5\u00c2b\2\u0593\u0594\5\u009aN\27\u0594\u05d1\3\2\2\2"+
		"\u0595\u0596\5\u00ceh\2\u0596\u05a3\7\n\2\2\u0597\u0599\7E\2\2\u0598\u0597"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059f\5\u009aN"+
		"\2\u059b\u059c\7\f\2\2\u059c\u059e\5\u009aN\2\u059d\u059b\3\2\2\2\u059e"+
		"\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a4\3\2"+
		"\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a4\7\16\2\2\u05a3\u0598\3\2\2\2\u05a3"+
		"\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\7\13"+
		"\2\2\u05a6\u05d1\3\2\2\2\u05a7\u05a8\7\n\2\2\u05a8\u05a9\5\u009aN\2\u05a9"+
		"\u05aa\7\13\2\2\u05aa\u05d1\3\2\2\2\u05ab\u05ac\7\62\2\2\u05ac\u05ad\7"+
		"\n\2\2\u05ad\u05ae\5\u009aN\2\u05ae\u05af\7(\2\2\u05af\u05b0\5\u0094K"+
		"\2\u05b0\u05b1\7\13\2\2\u05b1\u05d1\3\2\2\2\u05b2\u05b4\7m\2\2\u05b3\u05b2"+
		"\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\7M\2\2\u05b6"+
		"\u05b3\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\7\n"+
		"\2\2\u05b9\u05ba\5\u0088E\2\u05ba\u05bb\7\13\2\2\u05bb\u05d1\3\2\2\2\u05bc"+
		"\u05be\7\61\2\2\u05bd\u05bf\5\u009aN\2\u05be\u05bd\3\2\2\2\u05be\u05bf"+
		"\3\2\2\2\u05bf\u05c5\3\2\2\2\u05c0\u05c1\7\u0098\2\2\u05c1\u05c2\5\u009a"+
		"N\2\u05c2\u05c3\7\u008c\2\2\u05c3\u05c4\5\u009aN\2\u05c4\u05c6\3\2\2\2"+
		"\u05c5\u05c0\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05ca\7H\2\2\u05ca\u05cc\5\u009aN\2"+
		"\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce"+
		"\7I\2\2\u05ce\u05d1\3\2\2\2\u05cf\u05d1\5\u009eP\2\u05d0\u0584\3\2\2\2"+
		"\u05d0\u0586\3\2\2\2\u05d0\u058f\3\2\2\2\u05d0\u0592\3\2\2\2\u05d0\u0595"+
		"\3\2\2\2\u05d0\u05a7\3\2\2\2\u05d0\u05ab\3\2\2\2\u05d0\u05b6\3\2\2\2\u05d0"+
		"\u05bc\3\2\2\2\u05d0\u05cf\3\2\2\2\u05d1\u0636\3\2\2\2\u05d2\u05d3\f\26"+
		"\2\2\u05d3\u05d4\7\22\2\2\u05d4\u0635\5\u009aN\27\u05d5\u05d6\f\25\2\2"+
		"\u05d6\u05d7\t\13\2\2\u05d7\u0635\5\u009aN\26\u05d8\u05d9\f\24\2\2\u05d9"+
		"\u05da\t\f\2\2\u05da\u0635\5\u009aN\25\u05db\u05dc\f\23\2\2\u05dc\u05dd"+
		"\t\r\2\2\u05dd\u0635\5\u009aN\24\u05de\u05df\f\22\2\2\u05df\u05e0\t\16"+
		"\2\2\u05e0\u0635\5\u009aN\23\u05e1\u05ee\f\21\2\2\u05e2\u05ef\7\r\2\2"+
		"\u05e3\u05ef\7\35\2\2\u05e4\u05ef\7\36\2\2\u05e5\u05ef\7\37\2\2\u05e6"+
		"\u05ef\7c\2\2\u05e7\u05e8\7c\2\2\u05e8\u05ef\7m\2\2\u05e9\u05ef\7Z\2\2"+
		"\u05ea\u05ef\7h\2\2\u05eb\u05ef\7T\2\2\u05ec\u05ef\7j\2\2\u05ed\u05ef"+
		"\7}\2\2\u05ee\u05e2\3\2\2\2\u05ee\u05e3\3\2\2\2\u05ee\u05e4\3\2\2\2\u05ee"+
		"\u05e5\3\2\2\2\u05ee\u05e6\3\2\2\2\u05ee\u05e7\3\2\2\2\u05ee\u05e9\3\2"+
		"\2\2\u05ee\u05ea\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u0635\5\u009aN\22\u05f1\u05f2"+
		"\f\20\2\2\u05f2\u05f3\7\'\2\2\u05f3\u0635\5\u009aN\21\u05f4\u05f5\f\17"+
		"\2\2\u05f5\u05f6\7s\2\2\u05f6\u0635\5\u009aN\20\u05f7\u05f8\f\b\2\2\u05f8"+
		"\u05fa\7c\2\2\u05f9\u05fb\7m\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2"+
		"\2\u05fb\u05fc\3\2\2\2\u05fc\u0635\5\u009aN\t\u05fd\u05ff\f\7\2\2\u05fe"+
		"\u0600\7m\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u0602\7.\2\2\u0602\u0603\5\u009aN\2\u0603\u0604\7\'\2\2\u0604"+
		"\u0605\5\u009aN\b\u0605\u0635\3\2\2\2\u0606\u0607\f\13\2\2\u0607\u0608"+
		"\7\64\2\2\u0608\u0635\5\u00dan\2\u0609\u060b\f\n\2\2\u060a\u060c\7m\2"+
		"\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e"+
		"\t\17\2\2\u060e\u0611\5\u009aN\2\u060f\u0610\7J\2\2\u0610\u0612\5\u009a"+
		"N\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0635\3\2\2\2\u0613"+
		"\u0618\f\t\2\2\u0614\u0619\7d\2\2\u0615\u0619\7n\2\2\u0616\u0617\7m\2"+
		"\2\u0617\u0619\7o\2\2\u0618\u0614\3\2\2\2\u0618\u0615\3\2\2\2\u0618\u0616"+
		"\3\2\2\2\u0619\u0635\3\2\2\2\u061a\u061c\f\6\2\2\u061b\u061d\7m\2\2\u061c"+
		"\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0632\7Z"+
		"\2\2\u061f\u0629\7\n\2\2\u0620\u062a\5\u0088E\2\u0621\u0626\5\u009aN\2"+
		"\u0622\u0623\7\f\2\2\u0623\u0625\5\u009aN\2\u0624\u0622\3\2\2\2\u0625"+
		"\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u062a\3\2"+
		"\2\2\u0628\u0626\3\2\2\2\u0629\u0620\3\2\2\2\u0629\u0621\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u0633\7\13\2\2\u062c\u062d\5"+
		"\u00d0i\2\u062d\u062e\7\t\2\2\u062e\u0630\3\2\2\2\u062f\u062c\3\2\2\2"+
		"\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\5\u00d2j\2\u0632"+
		"\u061f\3\2\2\2\u0632\u062f\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u05d2\3\2"+
		"\2\2\u0634\u05d5\3\2\2\2\u0634\u05d8\3\2\2\2\u0634\u05db\3\2\2\2\u0634"+
		"\u05de\3\2\2\2\u0634\u05e1\3\2\2\2\u0634\u05f1\3\2\2\2\u0634\u05f4\3\2"+
		"\2\2\u0634\u05f7\3\2\2\2\u0634\u05fd\3\2\2\2\u0634\u0606\3\2\2\2\u0634"+
		"\u0609\3\2\2\2\u0634\u0613\3\2\2\2\u0634\u061a\3\2\2\2\u0635\u0638\3\2"+
		"\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u009b\3\2\2\2\u0638"+
		"\u0636\3\2\2\2\u0639\u063a\7|\2\2\u063a\u0646\5\u00dco\2\u063b\u063c\7"+
		"\n\2\2\u063c\u0641\5\u00d8m\2\u063d\u063e\7\f\2\2\u063e\u0640\5\u00d8"+
		"m\2\u063f\u063d\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641"+
		"\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7\13"+
		"\2\2\u0645\u0647\3\2\2\2\u0646\u063b\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u065a\3\2\2\2\u0648\u0649\7r\2\2\u0649\u0652\t\20\2\2\u064a\u064b\7\u0088"+
		"\2\2\u064b\u0653\7o\2\2\u064c\u064d\7\u0088\2\2\u064d\u0653\7?\2\2\u064e"+
		"\u0653\7\60\2\2\u064f\u0653\7\u0082\2\2\u0650\u0651\7l\2\2\u0651\u0653"+
		"\7!\2\2\u0652\u064a\3\2\2\2\u0652\u064c\3\2\2\2\u0652\u064e\3\2\2\2\u0652"+
		"\u064f\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0657\3\2\2\2\u0654\u0655\7j"+
		"\2\2\u0655\u0657\5\u00ccg\2\u0656\u0648\3\2\2\2\u0656\u0654\3\2\2\2\u0657"+
		"\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2"+
		"\2\2\u065a\u065b\3\2\2\2\u065b\u0667\3\2\2\2\u065c\u065a\3\2\2\2\u065d"+
		"\u065f\7m\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2"+
		"\2\2\u0660\u0665\7@\2\2\u0661\u0662\7]\2\2\u0662\u0666\7A\2\2\u0663\u0664"+
		"\7]\2\2\u0664\u0666\7Y\2\2\u0665\u0661\3\2\2\2\u0665\u0663\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u065e\3\2\2\2\u0667\u0668\3\2"+
		"\2\2\u0668\u009d\3\2\2\2\u0669\u066a\7z\2\2\u066a\u066f\7\n\2\2\u066b"+
		"\u0670\7X\2\2\u066c\u066d\t\21\2\2\u066d\u066e\7\f\2\2\u066e\u0670\5\u00c4"+
		"c\2\u066f\u066b\3\2\2\2\u066f\u066c\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0672\7\13\2\2\u0672\u009f\3\2\2\2\u0673\u0676\5\u00d8m\2\u0674\u0675"+
		"\7\64\2\2\u0675\u0677\5\u00dan\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2"+
		"\2\u0677\u0679\3\2\2\2\u0678\u067a\t\4\2\2\u0679\u0678\3\2\2\2\u0679\u067a"+
		"\3\2\2\2\u067a\u00a1\3\2\2\2\u067b\u067c\78\2\2\u067c\u067e\5\u00ccg\2"+
		"\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u06a3\3\2\2\2\u067f\u0680"+
		"\7x\2\2\u0680\u0683\7f\2\2\u0681\u0683\7\u0091\2\2\u0682\u067f\3\2\2\2"+
		"\u0682\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\7\n\2\2\u0685\u068a"+
		"\5\u00a0Q\2\u0686\u0687\7\f\2\2\u0687\u0689\5\u00a0Q\2\u0688\u0686\3\2"+
		"\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068d\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u068e\7\13\2\2\u068e\u068f\5"+
		"\u0098M\2\u068f\u06a4\3\2\2\2\u0690\u0691\7\63\2\2\u0691\u0692\7\n\2\2"+
		"\u0692\u0693\5\u009aN\2\u0693\u0694\7\13\2\2\u0694\u06a4\3\2\2\2\u0695"+
		"\u0696\7Q\2\2\u0696\u0697\7f\2\2\u0697\u0698\7\n\2\2\u0698\u069d\5\u00d8"+
		"m\2\u0699\u069a\7\f\2\2\u069a\u069c\5\u00d8m\2\u069b\u0699\3\2\2\2\u069c"+
		"\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\3\2"+
		"\2\2\u069f\u069d\3\2\2\2\u06a0\u06a1\7\13\2\2\u06a1\u06a2\5\u009cO\2\u06a2"+
		"\u06a4\3\2\2\2\u06a3\u0682\3\2\2\2\u06a3\u0690\3\2\2\2\u06a3\u0695\3\2"+
		"\2\2\u06a4\u00a3\3\2\2\2\u06a5\u06a7\7\u009a\2\2\u06a6\u06a8\7{\2\2\u06a7"+
		"\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\5\u00bc"+
		"_\2\u06aa\u06ab\7(\2\2\u06ab\u06ac\7\n\2\2\u06ac\u06ad\5\u0088E\2\u06ad"+
		"\u06b7\7\13\2\2\u06ae\u06af\7\f\2\2\u06af\u06b0\5\u00bc_\2\u06b0\u06b1"+
		"\7(\2\2\u06b1\u06b2\7\n\2\2\u06b2\u06b3\5\u0088E\2\u06b3\u06b4\7\13\2"+
		"\2\u06b4\u06b6\3\2\2\2\u06b5\u06ae\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5"+
		"\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u00a5\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba"+
		"\u06bb\5\u00d0i\2\u06bb\u06bc\7\t\2\2\u06bc\u06be\3\2\2\2\u06bd\u06ba"+
		"\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c5\5\u00d2j"+
		"\2\u06c0\u06c1\7\\\2\2\u06c1\u06c2\7/\2\2\u06c2\u06c6\5\u00dep\2\u06c3"+
		"\u06c4\7m\2\2\u06c4\u06c6\7\\\2\2\u06c5\u06c0\3\2\2\2\u06c5\u06c3\3\2"+
		"\2\2\u06c5\u06c6\3\2\2\2\u06c6\u00a7\3\2\2\2\u06c7\u06ca\5\u009aN\2\u06c8"+
		"\u06c9\7\64\2\2\u06c9\u06cb\5\u00dan\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb"+
		"\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ce\t\4\2\2\u06cd\u06cc\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u00a9\3\2\2\2\u06cf\u06d3\5\u00be`\2\u06d0\u06d3"+
		"\5\u00ccg\2\u06d1\u06d3\7\u009f\2\2\u06d2\u06cf\3\2\2\2\u06d2\u06d0\3"+
		"\2\2\2\u06d2\u06d1\3\2\2\2\u06d3\u00ab\3\2\2\2\u06d4\u06e0\5\u00d2j\2"+
		"\u06d5\u06d6\7\n\2\2\u06d6\u06db\5\u00d8m\2\u06d7\u06d8\7\f\2\2\u06d8"+
		"\u06da\5\u00d8m\2\u06d9\u06d7\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9"+
		"\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\3\2\2\2\u06dd\u06db\3\2\2\2\u06de"+
		"\u06df\7\13\2\2\u06df\u06e1\3\2\2\2\u06e0\u06d5\3\2\2\2\u06e0\u06e1\3"+
		"\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\7(\2\2\u06e3\u06e4\7\n\2\2\u06e4"+
		"\u06e5\5\u0088E\2\u06e5\u06e6\7\13\2\2\u06e6\u00ad\3\2\2\2\u06e7\u06f4"+
		"\7\16\2\2\u06e8\u06e9\5\u00d2j\2\u06e9\u06ea\7\t\2\2\u06ea\u06eb\7\16"+
		"\2\2\u06eb\u06f4\3\2\2\2\u06ec\u06f1\5\u009aN\2\u06ed\u06ef\7(\2\2\u06ee"+
		"\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\5\u00c8"+
		"e\2\u06f1\u06ee\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3"+
		"\u06e7\3\2\2\2\u06f3\u06e8\3\2\2\2\u06f3\u06ec\3\2\2\2\u06f4\u00af\3\2"+
		"\2\2\u06f5\u06f6\5\u00d0i\2\u06f6\u06f7\7\t\2\2\u06f7\u06f9\3\2\2\2\u06f8"+
		"\u06f5\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06ff\5\u00d2"+
		"j\2\u06fb\u06fd\7(\2\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe"+
		"\3\2\2\2\u06fe\u0700\5\u00eav\2\u06ff\u06fc\3\2\2\2\u06ff\u0700\3\2\2"+
		"\2\u0700\u0706\3\2\2\2\u0701\u0702\7\\\2\2\u0702\u0703\7/\2\2\u0703\u0707"+
		"\5\u00dep\2\u0704\u0705\7m\2\2\u0705\u0707\7\\\2\2\u0706\u0701\3\2\2\2"+
		"\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0725\3\2\2\2\u0708\u0712"+
		"\7\n\2\2\u0709\u070e\5\u00b0Y\2\u070a\u070b\7\f\2\2\u070b\u070d\5\u00b0"+
		"Y\2\u070c\u070a\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2\2\2\u070e"+
		"\u070f\3\2\2\2\u070f\u0713\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0713\5\u00b2"+
		"Z\2\u0712\u0709\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714"+
		"\u0719\7\13\2\2\u0715\u0717\7(\2\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2"+
		"\2\2\u0717\u0718\3\2\2\2\u0718\u071a\5\u00eav\2\u0719\u0716\3\2\2\2\u0719"+
		"\u071a\3\2\2\2\u071a\u0725\3\2\2\2\u071b\u071c\7\n\2\2\u071c\u071d\5\u0088"+
		"E\2\u071d\u0722\7\13\2\2\u071e\u0720\7(\2\2\u071f\u071e\3\2\2\2\u071f"+
		"\u0720\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0723\5\u00eav\2\u0722\u071f"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u06f8\3\2\2\2\u0724"+
		"\u0708\3\2\2\2\u0724\u071b\3\2\2\2\u0725\u00b1\3\2\2\2\u0726\u072d\5\u00b0"+
		"Y\2\u0727\u0728\5\u00b4[\2\u0728\u0729\5\u00b0Y\2\u0729\u072a\5\u00b6"+
		"\\\2\u072a\u072c\3\2\2\2\u072b\u0727\3\2\2\2\u072c\u072f\3\2\2\2\u072d"+
		"\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u00b3\3\2\2\2\u072f\u072d\3\2"+
		"\2\2\u0730\u073e\7\f\2\2\u0731\u0733\7k\2\2\u0732\u0731\3\2\2\2\u0732"+
		"\u0733\3\2\2\2\u0733\u073a\3\2\2\2\u0734\u0736\7g\2\2\u0735\u0737\7u\2"+
		"\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u073b\3\2\2\2\u0738\u073b"+
		"\7^\2\2\u0739\u073b\7:\2\2\u073a\u0734\3\2\2\2\u073a\u0738\3\2\2\2\u073a"+
		"\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073e\7e"+
		"\2\2\u073d\u0730\3\2\2\2\u073d\u0732\3\2\2\2\u073e\u00b5\3\2\2\2\u073f"+
		"\u0740\7r\2\2\u0740\u074e\5\u009aN\2\u0741\u0742\7\u0093\2\2\u0742\u0743"+
		"\7\n\2\2\u0743\u0748\5\u00d8m\2\u0744\u0745\7\f\2\2\u0745\u0747\5\u00d8"+
		"m\2\u0746\u0744\3\2\2\2\u0747\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748"+
		"\u0749\3\2\2\2\u0749\u074b\3\2\2\2\u074a\u0748\3\2\2\2\u074b\u074c\7\13"+
		"\2\2\u074c\u074e\3\2\2\2\u074d\u073f\3\2\2\2\u074d\u0741\3\2\2\2\u074d"+
		"\u074e\3\2\2\2\u074e\u00b7\3\2\2\2\u074f\u0751\7\u0087\2\2\u0750\u0752"+
		"\t\t\2\2\u0751\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0758\5\u00aeX\2\u0754\u0755\7\f\2\2\u0755\u0757\5\u00aeX\2\u0756\u0754"+
		"\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u0767\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u0765\7R\2\2\u075c\u0761\5\u00b0"+
		"Y\2\u075d\u075e\7\f\2\2\u075e\u0760\5\u00b0Y\2\u075f\u075d\3\2\2\2\u0760"+
		"\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0766\3\2"+
		"\2\2\u0763\u0761\3\2\2\2\u0764\u0766\5\u00b2Z\2\u0765\u075c\3\2\2\2\u0765"+
		"\u0764\3\2\2\2\u0766\u0768\3\2\2\2\u0767\u075b\3\2\2\2\u0767\u0768\3\2"+
		"\2\2\u0768\u076b\3\2\2\2\u0769\u076a\7\u0099\2\2\u076a\u076c\5\u009aN"+
		"\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u077b\3\2\2\2\u076d\u076e"+
		"\7U\2\2\u076e\u076f\7/\2\2\u076f\u0774\5\u009aN\2\u0770\u0771\7\f\2\2"+
		"\u0771\u0773\5\u009aN\2\u0772\u0770\3\2\2\2\u0773\u0776\3\2\2\2\u0774"+
		"\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0779\3\2\2\2\u0776\u0774\3\2"+
		"\2\2\u0777\u0778\7V\2\2\u0778\u077a\5\u009aN\2\u0779\u0777\3\2\2\2\u0779"+
		"\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u076d\3\2\2\2\u077b\u077c\3\2"+
		"\2\2\u077c\u079a\3\2\2\2\u077d\u077e\7\u0095\2\2\u077e\u077f\7\n\2\2\u077f"+
		"\u0784\5\u009aN\2\u0780\u0781\7\f\2\2\u0781\u0783\5\u009aN\2\u0782\u0780"+
		"\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0787\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u0796\7\13\2\2\u0788\u0789\7"+
		"\f\2\2\u0789\u078a\7\n\2\2\u078a\u078f\5\u009aN\2\u078b\u078c\7\f\2\2"+
		"\u078c\u078e\5\u009aN\2\u078d\u078b\3\2\2\2\u078e\u0791\3\2\2\2\u078f"+
		"\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2\2\2\u0791\u078f\3\2"+
		"\2\2\u0792\u0793\7\13\2\2\u0793\u0795\3\2\2\2\u0794\u0788\3\2\2\2\u0795"+
		"\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u079a\3\2"+
		"\2\2\u0798\u0796\3\2\2\2\u0799\u074f\3\2\2\2\u0799\u077d\3\2\2\2\u079a"+
		"\u00b9\3\2\2\2\u079b\u07a1\7\u0090\2\2\u079c\u079d\7\u0090\2\2\u079d\u07a1"+
		"\7$\2\2\u079e\u07a1\7a\2\2\u079f\u07a1\7K\2\2\u07a0\u079b\3\2\2\2\u07a0"+
		"\u079c\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u079f\3\2\2\2\u07a1\u00bb\3\2"+
		"\2\2\u07a2\u07ae\5\u00d2j\2\u07a3\u07a4\7\n\2\2\u07a4\u07a9\5\u00d8m\2"+
		"\u07a5\u07a6\7\f\2\2\u07a6\u07a8\5\u00d8m\2\u07a7\u07a5\3\2\2\2\u07a8"+
		"\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2"+
		"\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07ad\7\13\2\2\u07ad\u07af\3\2\2\2\u07ae"+
		"\u07a3\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u00bd\3\2\2\2\u07b0\u07b2\t\f"+
		"\2\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3"+
		"\u07b4\7\u009d\2\2\u07b4\u00bf\3\2\2\2\u07b5\u07b6\t\22\2\2\u07b6\u00c1"+
		"\3\2\2\2\u07b7\u07b8\t\23\2\2\u07b8\u00c3\3\2\2\2\u07b9\u07ba\7\u009f"+
		"\2\2\u07ba\u00c5\3\2\2\2\u07bb\u07be\5\u009aN\2\u07bc\u07be\5\u0092J\2"+
		"\u07bd\u07bb\3\2\2\2\u07bd\u07bc\3\2\2\2\u07be\u00c7\3\2\2\2\u07bf\u07c0"+
		"\t\2\2\2\u07c0\u00c9\3\2\2\2\u07c1\u07c2\t\24\2\2\u07c2\u00cb\3\2\2\2"+
		"\u07c3\u07c4\5\u00eex\2\u07c4\u00cd\3\2\2\2\u07c5\u07c6\5\u00eex\2\u07c6"+
		"\u00cf\3\2\2\2\u07c7\u07c8\5\u00eex\2\u07c8\u00d1\3\2\2\2\u07c9\u07ca"+
		"\5\u00eex\2\u07ca\u00d3\3\2\2\2\u07cb\u07cc\5\u00eex\2\u07cc\u00d5\3\2"+
		"\2\2\u07cd\u07ce\5\u00eex\2\u07ce\u00d7\3\2\2\2\u07cf\u07d0\5\u00eex\2"+
		"\u07d0\u00d9\3\2\2\2\u07d1\u07d2\5\u00eex\2\u07d2\u00db\3\2\2\2\u07d3"+
		"\u07d4\5\u00eex\2\u07d4\u00dd\3\2\2\2\u07d5\u07d6\5\u00eex\2\u07d6\u00df"+
		"\3\2\2\2\u07d7\u07d8\5\u00eex\2\u07d8\u00e1\3\2\2\2\u07d9\u07da\5\u00ee"+
		"x\2\u07da\u00e3\3\2\2\2\u07db\u07dc\5\u00eex\2\u07dc\u00e5\3\2\2\2\u07dd"+
		"\u07de\5\u00eex\2\u07de\u00e7\3\2\2\2\u07df\u07e0\5\u00eex\2\u07e0\u00e9"+
		"\3\2\2\2\u07e1\u07e2\5\u00eex\2\u07e2\u00eb\3\2\2\2\u07e3\u07e4\5\u00ee"+
		"x\2\u07e4\u00ed\3\2\2\2\u07e5\u07ed\7\u009c\2\2\u07e6\u07ed\5\u00caf\2"+
		"\u07e7\u07ed\7\u009f\2\2\u07e8\u07e9\7\n\2\2\u07e9\u07ea\5\u00eex\2\u07ea"+
		"\u07eb\7\13\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07e5\3\2\2\2\u07ec\u07e6\3"+
		"\2\2\2\u07ec\u07e7\3\2\2\2\u07ec\u07e8\3\2\2\2\u07ed\u00ef\3\2\2\2\u0105"+
		"\u00f6\u00fc\u00ff\u0102\u0105\u0115\u0123\u0131\u0136\u0140\u014d\u0168"+
		"\u0197\u01a5\u01cb\u01d1\u01d3\u01de\u01e5\u01ea\u01f0\u01f6\u01f8\u0218"+
		"\u021f\u0227\u022a\u0233\u0237\u023f\u0243\u0245\u024a\u024c\u0250\u0257"+
		"\u025a\u025f\u0263\u0268\u0271\u0274\u027a\u027c\u0280\u0286\u028b\u0296"+
		"\u029c\u02a0\u02a6\u02ab\u02b4\u02bb\u02c1\u02c5\u02c9\u02cf\u02d4\u02db"+
		"\u02e6\u02e9\u02eb\u02f1\u02f7\u02fb\u0302\u0308\u030e\u0314\u0319\u0325"+
		"\u032a\u0335\u033a\u033d\u0344\u0347\u034e\u0357\u035a\u0360\u0362\u0366"+
		"\u036e\u0373\u037b\u0380\u0388\u038d\u0395\u039a\u03a0\u03a7\u03aa\u03b2"+
		"\u03bc\u03bf\u03c5\u03c7\u03ca\u03dd\u03e3\u03ec\u03f1\u03fa\u0405\u040c"+
		"\u0412\u0418\u0421\u0428\u042c\u042e\u0432\u0439\u043b\u043f\u0442\u0449"+
		"\u0450\u0453\u045d\u0460\u0466\u0468\u046c\u0473\u0476\u047e\u0488\u048b"+
		"\u0491\u0493\u0497\u049e\u04a7\u04ab\u04ad\u04b1\u04ba\u04bf\u04c1\u04ca"+
		"\u04d5\u04dc\u04df\u04e2\u04ef\u04fd\u0502\u0505\u0512\u0520\u0525\u052e"+
		"\u0531\u0537\u0539\u053f\u0544\u054a\u0556\u055a\u055f\u0563\u0566\u0578"+
		"\u057d\u0582\u058a\u058f\u0598\u059f\u05a3\u05b3\u05b6\u05be\u05c7\u05cb"+
		"\u05d0\u05ee\u05fa\u05ff\u060b\u0611\u0618\u061c\u0626\u0629\u062f\u0632"+
		"\u0634\u0636\u0641\u0646\u0652\u0656\u065a\u065e\u0665\u0667\u066f\u0676"+
		"\u0679\u067d\u0682\u068a\u069d\u06a3\u06a7\u06b7\u06bd\u06c5\u06ca\u06cd"+
		"\u06d2\u06db\u06e0\u06ee\u06f1\u06f3\u06f8\u06fc\u06ff\u0706\u070e\u0712"+
		"\u0716\u0719\u071f\u0722\u0724\u072d\u0732\u0736\u073a\u073d\u0748\u074d"+
		"\u0751\u0758\u0761\u0765\u0767\u076b\u0774\u0779\u077b\u0784\u078f\u0796"+
		"\u0799\u07a0\u07a9\u07ae\u07b1\u07bd\u07ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}