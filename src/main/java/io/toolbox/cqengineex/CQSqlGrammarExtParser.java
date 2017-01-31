// Generated from /Users/dmitry/workspace/cq-engine-ext/src/main/antlr4/cqengineext/grammar/CQSqlGrammarExt.g4 by ANTLR 4.5.3
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
		F_HLL=6, SCOL=7, DOT=8, OPEN_PAR=9, CLOSE_PAR=10, COMMA=11, ASSIGN=12, 
		STAR=13, PLUS=14, MINUS=15, TILDE=16, PIPE2=17, DIV=18, MOD=19, LT2=20, 
		GT2=21, AMP=22, PIPE=23, LT=24, LT_EQ=25, GT=26, GT_EQ=27, EQ=28, NOT_EQ1=29, 
		NOT_EQ2=30, K_ABORT=31, K_ACTION=32, K_ADD=33, K_AFTER=34, K_ALL=35, K_ALTER=36, 
		K_ANALYZE=37, K_AND=38, K_AS=39, K_ASC=40, K_ATTACH=41, K_AUTOINCREMENT=42, 
		K_BEFORE=43, K_BEGIN=44, K_BETWEEN=45, K_BY=46, K_CASCADE=47, K_CASE=48, 
		K_CAST=49, K_CHECK=50, K_COLLATE=51, K_COLUMN=52, K_COMMIT=53, K_CONFLICT=54, 
		K_CONSTRAINT=55, K_CREATE=56, K_CROSS=57, K_CURRENT_DATE=58, K_CURRENT_TIME=59, 
		K_CURRENT_TIMESTAMP=60, K_DATABASE=61, K_DEFAULT=62, K_DEFERRABLE=63, 
		K_DEFERRED=64, K_DELETE=65, K_DESC=66, K_DETACH=67, K_DISTINCT=68, K_DROP=69, 
		K_EACH=70, K_ELSE=71, K_END=72, K_ESCAPE=73, K_EXCEPT=74, K_EXCLUSIVE=75, 
		K_EXISTS=76, K_EXPLAIN=77, K_FAIL=78, K_FOR=79, K_FOREIGN=80, K_FROM=81, 
		K_FULL=82, K_GLOB=83, K_GROUP=84, K_HAVING=85, K_IF=86, K_IGNORE=87, K_IMMEDIATE=88, 
		K_IN=89, K_INDEX=90, K_INDEXED=91, K_INITIALLY=92, K_INNER=93, K_INSERT=94, 
		K_INSTEAD=95, K_INTERSECT=96, K_INTO=97, K_IS=98, K_ISNULL=99, K_JOIN=100, 
		K_KEY=101, K_LEFT=102, K_LIKE=103, K_LIMIT=104, K_MATCH=105, K_NATURAL=106, 
		K_NO=107, K_NOT=108, K_NOTNULL=109, K_NULL=110, K_OF=111, K_OFFSET=112, 
		K_ON=113, K_OR=114, K_ORDER=115, K_OUTER=116, K_PLAN=117, K_PRAGMA=118, 
		K_PRIMARY=119, K_QUERY=120, K_RAISE=121, K_RECURSIVE=122, K_REFERENCES=123, 
		K_REGEXP=124, K_REINDEX=125, K_RELEASE=126, K_RENAME=127, K_REPLACE=128, 
		K_RESTRICT=129, K_RIGHT=130, K_ROLLBACK=131, K_ROW=132, K_SAVEPOINT=133, 
		K_SELECT=134, K_SET=135, K_TABLE=136, K_TEMP=137, K_TEMPORARY=138, K_THEN=139, 
		K_TO=140, K_TRANSACTION=141, K_TRIGGER=142, K_UNION=143, K_UNIQUE=144, 
		K_UPDATE=145, K_USING=146, K_VACUUM=147, K_VALUES=148, K_VIEW=149, K_VIRTUAL=150, 
		K_WHEN=151, K_WHERE=152, K_WITH=153, K_WITHOUT=154, IDENTIFIER=155, NUMERIC_LITERAL=156, 
		BIND_PARAMETER=157, STRING_LITERAL=158, BLOB_LITERAL=159, SINGLE_LINE_COMMENT=160, 
		MULTILINE_COMMENT=161, SPACES=162, UNEXPECTED_CHAR=163;
	public static final int
		RULE_start = 0, RULE_indexedCollection = 1, RULE_whereClause = 2, RULE_orderByClause = 3, 
		RULE_groupByClause = 4, RULE_limitClause = 5, RULE_result_column_simple = 6, 
		RULE_expr = 7, RULE_column_name = 8, RULE_any_name = 9, RULE_literal_value = 10, 
		RULE_column_alias = 11, RULE_histogramClause = 12, RULE_countClause = 13, 
		RULE_query = 14, RULE_logicalQuery = 15, RULE_andQuery = 16, RULE_orQuery = 17, 
		RULE_notQuery = 18, RULE_simpleQuery = 19, RULE_equalQuery = 20, RULE_notEqualQuery = 21, 
		RULE_lessThanOrEqualToQuery = 22, RULE_lessThanQuery = 23, RULE_greaterThanOrEqualToQuery = 24, 
		RULE_greaterThanQuery = 25, RULE_betweenQuery = 26, RULE_notBetweenQuery = 27, 
		RULE_inQuery = 28, RULE_notInQuery = 29, RULE_startsWithQuery = 30, RULE_endsWithQuery = 31, 
		RULE_containsQuery = 32, RULE_hasQuery = 33, RULE_notHasQuery = 34, RULE_attributeName = 35, 
		RULE_queryParameterTrailingPercent = 36, RULE_queryParameterLeadingPercent = 37, 
		RULE_queryParameterLeadingAndTrailingPercent = 38, RULE_queryParameter = 39, 
		RULE_attributeOrder = 40, RULE_direction = 41, RULE_parse = 42, RULE_error = 43, 
		RULE_sql_stmt_list = 44, RULE_sql_stmt = 45, RULE_alter_table_stmt = 46, 
		RULE_analyze_stmt = 47, RULE_attach_stmt = 48, RULE_begin_stmt = 49, RULE_commit_stmt = 50, 
		RULE_compound_select_stmt = 51, RULE_create_index_stmt = 52, RULE_create_table_stmt = 53, 
		RULE_create_trigger_stmt = 54, RULE_create_view_stmt = 55, RULE_create_virtual_table_stmt = 56, 
		RULE_delete_stmt = 57, RULE_delete_stmt_limited = 58, RULE_detach_stmt = 59, 
		RULE_drop_index_stmt = 60, RULE_drop_table_stmt = 61, RULE_drop_trigger_stmt = 62, 
		RULE_drop_view_stmt = 63, RULE_factored_select_stmt = 64, RULE_insert_stmt = 65, 
		RULE_pragma_stmt = 66, RULE_reindex_stmt = 67, RULE_release_stmt = 68, 
		RULE_rollback_stmt = 69, RULE_savepoint_stmt = 70, RULE_simple_select_stmt = 71, 
		RULE_select_stmt = 72, RULE_select_or_values = 73, RULE_update_stmt = 74, 
		RULE_update_stmt_limited = 75, RULE_vacuum_stmt = 76, RULE_column_def = 77, 
		RULE_type_name = 78, RULE_column_constraint = 79, RULE_conflict_clause = 80, 
		RULE_foreign_key_clause = 81, RULE_raise_function = 82, RULE_indexed_column = 83, 
		RULE_table_constraint = 84, RULE_with_clause = 85, RULE_qualified_table_name = 86, 
		RULE_ordering_term = 87, RULE_pragma_value = 88, RULE_common_table_expression = 89, 
		RULE_result_column = 90, RULE_table_or_subquery = 91, RULE_join_clause = 92, 
		RULE_join_operator = 93, RULE_join_constraint = 94, RULE_select_core = 95, 
		RULE_compound_operator = 96, RULE_cte_table_name = 97, RULE_signed_number = 98, 
		RULE_unary_operator = 99, RULE_error_message = 100, RULE_module_argument = 101, 
		RULE_keyword = 102, RULE_name = 103, RULE_function_name = 104, RULE_database_name = 105, 
		RULE_table_name = 106, RULE_table_or_index_name = 107, RULE_new_table_name = 108, 
		RULE_collation_name = 109, RULE_foreign_table = 110, RULE_index_name = 111, 
		RULE_trigger_name = 112, RULE_view_name = 113, RULE_module_name = 114, 
		RULE_pragma_name = 115, RULE_savepoint_name = 116, RULE_table_alias = 117, 
		RULE_transaction_name = 118;
	public static final String[] ruleNames = {
		"start", "indexedCollection", "whereClause", "orderByClause", "groupByClause", 
		"limitClause", "result_column_simple", "expr", "column_name", "any_name", 
		"literal_value", "column_alias", "histogramClause", "countClause", "query", 
		"logicalQuery", "andQuery", "orQuery", "notQuery", "simpleQuery", "equalQuery", 
		"notEqualQuery", "lessThanOrEqualToQuery", "lessThanQuery", "greaterThanOrEqualToQuery", 
		"greaterThanQuery", "betweenQuery", "notBetweenQuery", "inQuery", "notInQuery", 
		"startsWithQuery", "endsWithQuery", "containsQuery", "hasQuery", "notHasQuery", 
		"attributeName", "queryParameterTrailingPercent", "queryParameterLeadingPercent", 
		"queryParameterLeadingAndTrailingPercent", "queryParameter", "attributeOrder", 
		"direction", "parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", 
		"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
		"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
		"drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", 
		"factored_select_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", 
		"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
		"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
		"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
		"foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "compound_operator", 
		"cte_table_name", "signed_number", "unary_operator", "error_message", 
		"module_argument", "keyword", "name", "function_name", "database_name", 
		"table_name", "table_or_index_name", "new_table_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "';'", "'.'", "'('", "')'", 
		"','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", 
		"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING_LITERAL_WITH_TRAILING_PERCENT", "STRING_LITERAL_WITH_LEADING_PERCENT", 
		"STRING_LITERAL_WITH_LEADING_AND_TRAILING_PERCENT", "F_HISTOGRAM", "F_COUNT", 
		"F_HLL", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CQSqlGrammarExtParser.K_AS, 0); }
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
		int _la;
		try {
			setState(294);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case STAR:
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
			case STRING_LITERAL:
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expr(0);
				setState(290);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(287);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(286);
						match(K_AS);
						}
					}

					setState(289);
					column_alias();
					}
				}

				}
				break;
			case F_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				countClause();
				}
				break;
			case F_HISTOGRAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CQSqlGrammarExtParser.STAR, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
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
		public TerminalNode K_IS() { return getToken(CQSqlGrammarExtParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(CQSqlGrammarExtParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(CQSqlGrammarExtParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(CQSqlGrammarExtParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(CQSqlGrammarExtParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(CQSqlGrammarExtParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(CQSqlGrammarExtParser.K_REGEXP, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(297);
				match(STAR);
				}
				break;
			case 2:
				{
				setState(298);
				literal_value();
				}
				break;
			case 3:
				{
				setState(299);
				column_name();
				}
				break;
			case 4:
				{
				setState(300);
				function_name();
				setState(301);
				match(OPEN_PAR);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(302);
						match(K_DISTINCT);
						}
						break;
					}
					setState(305);
					expr(0);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(306);
						match(COMMA);
						setState(307);
						expr(0);
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(313);
					match(STAR);
					}
					break;
				}
				setState(316);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(318);
				match(OPEN_PAR);
				setState(319);
				expr(0);
				setState(320);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(322);
				match(K_CASE);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(323);
					expr(0);
					}
					break;
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(326);
					match(K_WHEN);
					setState(327);
					expr(0);
					setState(328);
					match(K_THEN);
					setState(329);
					expr(0);
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(337);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(335);
					match(K_ELSE);
					setState(336);
					expr(0);
					}
				}

				setState(339);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(344);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(345);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(347);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(348);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(350);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(351);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(353);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(354);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(355);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(368);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(356);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(357);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(358);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(359);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(360);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(361);
							match(K_IS);
							setState(362);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(363);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(364);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(365);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(366);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(367);
							match(K_REGEXP);
							}
							break;
						}
						setState(370);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(375);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 16, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 18, RULE_any_name);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
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
				setState(379);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(OPEN_PAR);
				setState(382);
				any_name();
				setState(383);
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
		enterRule(_localctx, 20, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NULL - 110)) | (1L << (NUMERIC_LITERAL - 110)) | (1L << (STRING_LITERAL - 110)) | (1L << (BLOB_LITERAL - 110)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 24, RULE_histogramClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(F_HISTOGRAM);
			setState(392);
			match(OPEN_PAR);
			setState(393);
			match(NUMERIC_LITERAL);
			setState(394);
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
		public TerminalNode K_DISTINCT() { return getToken(CQSqlGrammarExtParser.K_DISTINCT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode F_HLL() { return getToken(CQSqlGrammarExtParser.F_HLL, 0); }
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
		enterRule(_localctx, 26, RULE_countClause);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(F_COUNT);
				setState(397);
				match(OPEN_PAR);
				setState(399);
				_la = _input.LA(1);
				if (_la==F_HLL) {
					{
					setState(398);
					match(F_HLL);
					}
				}

				setState(401);
				match(K_DISTINCT);
				setState(402);
				column_name();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(403);
					match(COMMA);
					setState(404);
					column_name();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(F_COUNT);
				setState(413);
				match(OPEN_PAR);
				setState(414);
				match(STAR);
				setState(415);
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
		enterRule(_localctx, 28, RULE_query);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				logicalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
		enterRule(_localctx, 30, RULE_logicalQuery);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				andQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				orQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
		enterRule(_localctx, 32, RULE_andQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(OPEN_PAR);
			setState(428);
			query();
			setState(429);
			match(K_AND);
			setState(430);
			query();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(431);
				match(K_AND);
				setState(432);
				query();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
		enterRule(_localctx, 34, RULE_orQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(OPEN_PAR);
			setState(441);
			query();
			setState(442);
			match(K_OR);
			setState(443);
			query();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_OR) {
				{
				{
				setState(444);
				match(K_OR);
				setState(445);
				query();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		enterRule(_localctx, 36, RULE_notQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(K_NOT);
			setState(454);
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
		enterRule(_localctx, 38, RULE_simpleQuery);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				equalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				notEqualQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				lessThanOrEqualToQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				lessThanQuery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				greaterThanOrEqualToQuery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(461);
				greaterThanQuery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(462);
				betweenQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				notBetweenQuery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(464);
				inQuery();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(465);
				notInQuery();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(466);
				startsWithQuery();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(467);
				endsWithQuery();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(468);
				containsQuery();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(469);
				hasQuery();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(470);
				notHasQuery();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(471);
				match(OPEN_PAR);
				setState(472);
				simpleQuery();
				setState(473);
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
		enterRule(_localctx, 40, RULE_equalQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			attributeName();
			setState(478);
			match(ASSIGN);
			setState(479);
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
		enterRule(_localctx, 42, RULE_notEqualQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			attributeName();
			setState(482);
			match(NOT_EQ2);
			setState(483);
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
		enterRule(_localctx, 44, RULE_lessThanOrEqualToQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			attributeName();
			setState(486);
			match(LT_EQ);
			setState(487);
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
		enterRule(_localctx, 46, RULE_lessThanQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			attributeName();
			setState(490);
			match(LT);
			setState(491);
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
		enterRule(_localctx, 48, RULE_greaterThanOrEqualToQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			attributeName();
			setState(494);
			match(GT_EQ);
			setState(495);
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
		enterRule(_localctx, 50, RULE_greaterThanQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			attributeName();
			setState(498);
			match(GT);
			setState(499);
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
		enterRule(_localctx, 52, RULE_betweenQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			attributeName();
			setState(502);
			match(K_BETWEEN);
			setState(503);
			queryParameter();
			setState(504);
			match(K_AND);
			setState(505);
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
		enterRule(_localctx, 54, RULE_notBetweenQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			attributeName();
			setState(508);
			match(K_NOT);
			setState(509);
			match(K_BETWEEN);
			setState(510);
			queryParameter();
			setState(511);
			match(K_AND);
			setState(512);
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
		enterRule(_localctx, 56, RULE_inQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			attributeName();
			setState(515);
			match(K_IN);
			setState(516);
			match(OPEN_PAR);
			setState(517);
			queryParameter();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
				queryParameter();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
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
		enterRule(_localctx, 58, RULE_notInQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			attributeName();
			setState(528);
			match(K_NOT);
			setState(529);
			match(K_IN);
			setState(530);
			match(OPEN_PAR);
			setState(531);
			queryParameter();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(532);
				match(COMMA);
				setState(533);
				queryParameter();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
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
		enterRule(_localctx, 60, RULE_startsWithQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			attributeName();
			setState(542);
			match(K_LIKE);
			setState(543);
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
		enterRule(_localctx, 62, RULE_endsWithQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			attributeName();
			setState(546);
			match(K_LIKE);
			setState(547);
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
		enterRule(_localctx, 64, RULE_containsQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			attributeName();
			setState(550);
			match(K_LIKE);
			setState(551);
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
		enterRule(_localctx, 66, RULE_hasQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			attributeName();
			setState(554);
			match(K_IS);
			setState(555);
			match(K_NOT);
			setState(556);
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
		enterRule(_localctx, 68, RULE_notHasQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			attributeName();
			setState(559);
			match(K_IS);
			setState(560);
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
		enterRule(_localctx, 70, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 72, RULE_queryParameterTrailingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 74, RULE_queryParameterLeadingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 76, RULE_queryParameterLeadingAndTrailingPercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 78, RULE_queryParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		enterRule(_localctx, 80, RULE_attributeOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			attributeName();
			setState(574);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(573);
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
		enterRule(_localctx, 82, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 84, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DELETE - 65)) | (1L << (K_DETACH - 65)) | (1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_PRAGMA - 65)) | (1L << (K_REINDEX - 65)) | (1L << (K_RELEASE - 65)) | (1L << (K_REPLACE - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_ROLLBACK - 131)) | (1L << (K_SAVEPOINT - 131)) | (1L << (K_SELECT - 131)) | (1L << (K_UPDATE - 131)) | (1L << (K_VACUUM - 131)) | (1L << (K_VALUES - 131)) | (1L << (K_WITH - 131)) | (1L << (UNEXPECTED_CHAR - 131)))) != 0)) {
				{
				setState(580);
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
					setState(578);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(579);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
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
		enterRule(_localctx, 86, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		enterRule(_localctx, 88, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(590);
				match(SCOL);
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			sql_stmt();
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(597);
						match(SCOL);
						}
						}
						setState(600); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(602);
					sql_stmt();
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(SCOL);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 90, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(614);
				match(K_EXPLAIN);
				setState(617);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(615);
					match(K_QUERY);
					setState(616);
					match(K_PLAN);
					}
				}

				}
			}

			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(621);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(622);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(623);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(624);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(625);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(626);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(627);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(628);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(629);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(630);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(631);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(632);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(633);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(634);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(635);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(636);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(637);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(638);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(639);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(640);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(641);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(642);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(643);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(644);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(645);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(646);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(647);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(648);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(649);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(650);
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
		enterRule(_localctx, 92, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(K_ALTER);
			setState(654);
			match(K_TABLE);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(655);
				database_name();
				setState(656);
				match(DOT);
				}
				break;
			}
			setState(660);
			table_name();
			setState(669);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(661);
				match(K_RENAME);
				setState(662);
				match(K_TO);
				setState(663);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(664);
				match(K_ADD);
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(665);
					match(K_COLUMN);
					}
					break;
				}
				setState(668);
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
		enterRule(_localctx, 94, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(K_ANALYZE);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(672);
				database_name();
				}
				break;
			case 2:
				{
				setState(673);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(674);
				database_name();
				setState(675);
				match(DOT);
				setState(676);
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
		enterRule(_localctx, 96, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(K_ATTACH);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(681);
				match(K_DATABASE);
				}
				break;
			}
			setState(684);
			expr(0);
			setState(685);
			match(K_AS);
			setState(686);
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
		enterRule(_localctx, 98, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(K_BEGIN);
			setState(690);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DEFERRED - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_IMMEDIATE - 64)))) != 0)) {
				{
				setState(689);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DEFERRED - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_IMMEDIATE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(696);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(692);
				match(K_TRANSACTION);
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(693);
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
		enterRule(_localctx, 100, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(703);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(699);
				match(K_TRANSACTION);
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(700);
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
		enterRule(_localctx, 102, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(705);
				match(K_WITH);
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(706);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(709);
				common_table_expression();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					common_table_expression();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(719);
			select_core();
			setState(729); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(726);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(720);
					match(K_UNION);
					setState(722);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(721);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(724);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(725);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(728);
				select_core();
				}
				}
				setState(731); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(743);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(733);
				match(K_ORDER);
				setState(734);
				match(K_BY);
				setState(735);
				ordering_term();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(736);
					match(COMMA);
					setState(737);
					ordering_term();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(751);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(745);
				match(K_LIMIT);
				setState(746);
				expr(0);
				setState(749);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(747);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(748);
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
		enterRule(_localctx, 104, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(K_CREATE);
			setState(755);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(754);
				match(K_UNIQUE);
				}
			}

			setState(757);
			match(K_INDEX);
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(758);
				match(K_IF);
				setState(759);
				match(K_NOT);
				setState(760);
				match(K_EXISTS);
				}
				break;
			}
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(763);
				database_name();
				setState(764);
				match(DOT);
				}
				break;
			}
			setState(768);
			index_name();
			setState(769);
			match(K_ON);
			setState(770);
			table_name();
			setState(771);
			match(OPEN_PAR);
			setState(772);
			indexed_column();
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(773);
				match(COMMA);
				setState(774);
				indexed_column();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(CLOSE_PAR);
			setState(783);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(781);
				match(K_WHERE);
				setState(782);
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
		enterRule(_localctx, 106, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(K_CREATE);
			setState(787);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(786);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(789);
			match(K_TABLE);
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(790);
				match(K_IF);
				setState(791);
				match(K_NOT);
				setState(792);
				match(K_EXISTS);
				}
				break;
			}
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(795);
				database_name();
				setState(796);
				match(DOT);
				}
				break;
			}
			setState(800);
			table_name();
			setState(824);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(801);
				match(OPEN_PAR);
				setState(802);
				column_def();
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(803);
						match(COMMA);
						setState(804);
						column_def();
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(810);
					match(COMMA);
					setState(811);
					table_constraint();
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817);
				match(CLOSE_PAR);
				setState(820);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(818);
					match(K_WITHOUT);
					setState(819);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(822);
				match(K_AS);
				setState(823);
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
		enterRule(_localctx, 108, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(K_CREATE);
			setState(828);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(827);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(830);
			match(K_TRIGGER);
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(831);
				match(K_IF);
				setState(832);
				match(K_NOT);
				setState(833);
				match(K_EXISTS);
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(836);
				database_name();
				setState(837);
				match(DOT);
				}
				break;
			}
			setState(841);
			trigger_name();
			setState(846);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(842);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(843);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(844);
				match(K_INSTEAD);
				setState(845);
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
			setState(862);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(848);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(849);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(850);
				match(K_UPDATE);
				setState(860);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(851);
					match(K_OF);
					setState(852);
					column_name();
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(853);
						match(COMMA);
						setState(854);
						column_name();
						}
						}
						setState(859);
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
			setState(864);
			match(K_ON);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(865);
				database_name();
				setState(866);
				match(DOT);
				}
				break;
			}
			setState(870);
			table_name();
			setState(874);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(871);
				match(K_FOR);
				setState(872);
				match(K_EACH);
				setState(873);
				match(K_ROW);
				}
			}

			setState(878);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(876);
				match(K_WHEN);
				setState(877);
				expr(0);
				}
			}

			setState(880);
			match(K_BEGIN);
			setState(889); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(881);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(882);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(883);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(884);
					select_stmt();
					}
					break;
				}
				setState(887);
				match(SCOL);
				}
				}
				setState(891); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DELETE - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_REPLACE - 65)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)))) != 0) );
			setState(893);
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
		enterRule(_localctx, 110, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(K_CREATE);
			setState(897);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(896);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(899);
			match(K_VIEW);
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(900);
				match(K_IF);
				setState(901);
				match(K_NOT);
				setState(902);
				match(K_EXISTS);
				}
				break;
			}
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(905);
				database_name();
				setState(906);
				match(DOT);
				}
				break;
			}
			setState(910);
			view_name();
			setState(911);
			match(K_AS);
			setState(912);
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
		enterRule(_localctx, 112, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(K_CREATE);
			setState(915);
			match(K_VIRTUAL);
			setState(916);
			match(K_TABLE);
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(917);
				match(K_IF);
				setState(918);
				match(K_NOT);
				setState(919);
				match(K_EXISTS);
				}
				break;
			}
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(922);
				database_name();
				setState(923);
				match(DOT);
				}
				break;
			}
			setState(927);
			table_name();
			setState(928);
			match(K_USING);
			setState(929);
			module_name();
			setState(941);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(930);
				match(OPEN_PAR);
				setState(931);
				module_argument();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					module_argument();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(939);
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
		enterRule(_localctx, 114, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(943);
				with_clause();
				}
			}

			setState(946);
			match(K_DELETE);
			setState(947);
			match(K_FROM);
			setState(948);
			qualified_table_name();
			setState(951);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(949);
				match(K_WHERE);
				setState(950);
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
		enterRule(_localctx, 116, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(953);
				with_clause();
				}
			}

			setState(956);
			match(K_DELETE);
			setState(957);
			match(K_FROM);
			setState(958);
			qualified_table_name();
			setState(961);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(959);
				match(K_WHERE);
				setState(960);
				expr(0);
				}
			}

			setState(981);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(973);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(963);
					match(K_ORDER);
					setState(964);
					match(K_BY);
					setState(965);
					ordering_term();
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(966);
						match(COMMA);
						setState(967);
						ordering_term();
						}
						}
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(975);
				match(K_LIMIT);
				setState(976);
				expr(0);
				setState(979);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(977);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(978);
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
		enterRule(_localctx, 118, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(K_DETACH);
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(984);
				match(K_DATABASE);
				}
				break;
			}
			setState(987);
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
		enterRule(_localctx, 120, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(K_DROP);
			setState(990);
			match(K_INDEX);
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(991);
				match(K_IF);
				setState(992);
				match(K_EXISTS);
				}
				break;
			}
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(995);
				database_name();
				setState(996);
				match(DOT);
				}
				break;
			}
			setState(1000);
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
		enterRule(_localctx, 122, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(K_DROP);
			setState(1003);
			match(K_TABLE);
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1004);
				match(K_IF);
				setState(1005);
				match(K_EXISTS);
				}
				break;
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1008);
				database_name();
				setState(1009);
				match(DOT);
				}
				break;
			}
			setState(1013);
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
		enterRule(_localctx, 124, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(K_DROP);
			setState(1016);
			match(K_TRIGGER);
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1017);
				match(K_IF);
				setState(1018);
				match(K_EXISTS);
				}
				break;
			}
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1021);
				database_name();
				setState(1022);
				match(DOT);
				}
				break;
			}
			setState(1026);
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
		enterRule(_localctx, 126, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(K_DROP);
			setState(1029);
			match(K_VIEW);
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1030);
				match(K_IF);
				setState(1031);
				match(K_EXISTS);
				}
				break;
			}
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1034);
				database_name();
				setState(1035);
				match(DOT);
				}
				break;
			}
			setState(1039);
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
		enterRule(_localctx, 128, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1041);
				match(K_WITH);
				setState(1043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1042);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1045);
				common_table_expression();
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1046);
					match(COMMA);
					setState(1047);
					common_table_expression();
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1055);
			select_core();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1056);
				compound_operator();
				setState(1057);
				select_core();
				}
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1064);
				match(K_ORDER);
				setState(1065);
				match(K_BY);
				setState(1066);
				ordering_term();
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1067);
					match(COMMA);
					setState(1068);
					ordering_term();
					}
					}
					setState(1073);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1082);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1076);
				match(K_LIMIT);
				setState(1077);
				expr(0);
				setState(1080);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1078);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1079);
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
		enterRule(_localctx, 130, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1084);
				with_clause();
				}
			}

			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1087);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(1088);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(1089);
				match(K_INSERT);
				setState(1090);
				match(K_OR);
				setState(1091);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1092);
				match(K_INSERT);
				setState(1093);
				match(K_OR);
				setState(1094);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(1095);
				match(K_INSERT);
				setState(1096);
				match(K_OR);
				setState(1097);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(1098);
				match(K_INSERT);
				setState(1099);
				match(K_OR);
				setState(1100);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(1101);
				match(K_INSERT);
				setState(1102);
				match(K_OR);
				setState(1103);
				match(K_IGNORE);
				}
				break;
			}
			setState(1106);
			match(K_INTO);
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1107);
				database_name();
				setState(1108);
				match(DOT);
				}
				break;
			}
			setState(1112);
			table_name();
			setState(1124);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1113);
				match(OPEN_PAR);
				setState(1114);
				column_name();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1115);
					match(COMMA);
					setState(1116);
					column_name();
					}
					}
					setState(1121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1122);
				match(CLOSE_PAR);
				}
			}

			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1126);
				match(K_VALUES);
				setState(1127);
				match(OPEN_PAR);
				setState(1128);
				expr(0);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1129);
					match(COMMA);
					setState(1130);
					expr(0);
					}
					}
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1136);
				match(CLOSE_PAR);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1137);
					match(COMMA);
					setState(1138);
					match(OPEN_PAR);
					setState(1139);
					expr(0);
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1140);
						match(COMMA);
						setState(1141);
						expr(0);
						}
						}
						setState(1146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1147);
					match(CLOSE_PAR);
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1154);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1155);
				match(K_DEFAULT);
				setState(1156);
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
		enterRule(_localctx, 132, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(K_PRAGMA);
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1160);
				database_name();
				setState(1161);
				match(DOT);
				}
				break;
			}
			setState(1165);
			pragma_name();
			setState(1172);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1166);
				match(ASSIGN);
				setState(1167);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1168);
				match(OPEN_PAR);
				setState(1169);
				pragma_value();
				setState(1170);
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
		enterRule(_localctx, 134, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(K_REINDEX);
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1175);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1176);
					database_name();
					setState(1177);
					match(DOT);
					}
					break;
				}
				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1181);
					table_name();
					}
					break;
				case 2:
					{
					setState(1182);
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
		enterRule(_localctx, 136, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(K_RELEASE);
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1188);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(1191);
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
		enterRule(_localctx, 138, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(K_ROLLBACK);
			setState(1198);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(1194);
				match(K_TRANSACTION);
				setState(1196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1195);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(1205);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(1200);
				match(K_TO);
				setState(1202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1201);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(1204);
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
		enterRule(_localctx, 140, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(K_SAVEPOINT);
			setState(1208);
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
		enterRule(_localctx, 142, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1210);
				match(K_WITH);
				setState(1212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1211);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1214);
				common_table_expression();
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1215);
					match(COMMA);
					setState(1216);
					common_table_expression();
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1224);
			select_core();
			setState(1235);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1225);
				match(K_ORDER);
				setState(1226);
				match(K_BY);
				setState(1227);
				ordering_term();
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1228);
					match(COMMA);
					setState(1229);
					ordering_term();
					}
					}
					setState(1234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1243);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1237);
				match(K_LIMIT);
				setState(1238);
				expr(0);
				setState(1241);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1239);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1240);
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
		enterRule(_localctx, 144, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1245);
				match(K_WITH);
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1246);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1249);
				common_table_expression();
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1250);
					match(COMMA);
					setState(1251);
					common_table_expression();
					}
					}
					setState(1256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1259);
			select_or_values();
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1260);
				compound_operator();
				setState(1261);
				select_or_values();
				}
				}
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1278);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1268);
				match(K_ORDER);
				setState(1269);
				match(K_BY);
				setState(1270);
				ordering_term();
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1271);
					match(COMMA);
					setState(1272);
					ordering_term();
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1286);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1280);
				match(K_LIMIT);
				setState(1281);
				expr(0);
				setState(1284);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1282);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1283);
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
		enterRule(_localctx, 146, RULE_select_or_values);
		int _la;
		try {
			setState(1362);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(K_SELECT);
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1289);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1292);
				result_column();
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1293);
					match(COMMA);
					setState(1294);
					result_column();
					}
					}
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1312);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1300);
					match(K_FROM);
					setState(1310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1301);
						table_or_subquery();
						setState(1306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1302);
							match(COMMA);
							setState(1303);
							table_or_subquery();
							}
							}
							setState(1308);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1309);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1316);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1314);
					match(K_WHERE);
					setState(1315);
					expr(0);
					}
				}

				setState(1332);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1318);
					match(K_GROUP);
					setState(1319);
					match(K_BY);
					setState(1320);
					expr(0);
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1321);
						match(COMMA);
						setState(1322);
						expr(0);
						}
						}
						setState(1327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1330);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1328);
						match(K_HAVING);
						setState(1329);
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
				setState(1334);
				match(K_VALUES);
				setState(1335);
				match(OPEN_PAR);
				setState(1336);
				expr(0);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1337);
					match(COMMA);
					setState(1338);
					expr(0);
					}
					}
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1344);
				match(CLOSE_PAR);
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1345);
					match(COMMA);
					setState(1346);
					match(OPEN_PAR);
					setState(1347);
					expr(0);
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1348);
						match(COMMA);
						setState(1349);
						expr(0);
						}
						}
						setState(1354);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1355);
					match(CLOSE_PAR);
					}
					}
					setState(1361);
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
		enterRule(_localctx, 148, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1364);
				with_clause();
				}
			}

			setState(1367);
			match(K_UPDATE);
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1368);
				match(K_OR);
				setState(1369);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1370);
				match(K_OR);
				setState(1371);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1372);
				match(K_OR);
				setState(1373);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1374);
				match(K_OR);
				setState(1375);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1376);
				match(K_OR);
				setState(1377);
				match(K_IGNORE);
				}
				break;
			}
			setState(1380);
			qualified_table_name();
			setState(1381);
			match(K_SET);
			setState(1382);
			column_name();
			setState(1383);
			match(ASSIGN);
			setState(1384);
			expr(0);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1385);
				match(COMMA);
				setState(1386);
				column_name();
				setState(1387);
				match(ASSIGN);
				setState(1388);
				expr(0);
				}
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1397);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1395);
				match(K_WHERE);
				setState(1396);
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
		enterRule(_localctx, 150, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1399);
				with_clause();
				}
			}

			setState(1402);
			match(K_UPDATE);
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1403);
				match(K_OR);
				setState(1404);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1405);
				match(K_OR);
				setState(1406);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1407);
				match(K_OR);
				setState(1408);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1409);
				match(K_OR);
				setState(1410);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1411);
				match(K_OR);
				setState(1412);
				match(K_IGNORE);
				}
				break;
			}
			setState(1415);
			qualified_table_name();
			setState(1416);
			match(K_SET);
			setState(1417);
			column_name();
			setState(1418);
			match(ASSIGN);
			setState(1419);
			expr(0);
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1420);
				match(COMMA);
				setState(1421);
				column_name();
				setState(1422);
				match(ASSIGN);
				setState(1423);
				expr(0);
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1432);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1430);
				match(K_WHERE);
				setState(1431);
				expr(0);
				}
			}

			setState(1452);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1444);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1434);
					match(K_ORDER);
					setState(1435);
					match(K_BY);
					setState(1436);
					ordering_term();
					setState(1441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1437);
						match(COMMA);
						setState(1438);
						ordering_term();
						}
						}
						setState(1443);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1446);
				match(K_LIMIT);
				setState(1447);
				expr(0);
				setState(1450);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1448);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1449);
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
		enterRule(_localctx, 152, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
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
		enterRule(_localctx, 154, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			column_name();
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1457);
				type_name();
				}
				break;
			}
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_NOT - 108)) | (1L << (K_NULL - 108)) | (1L << (K_PRIMARY - 108)) | (1L << (K_REFERENCES - 108)) | (1L << (K_UNIQUE - 108)))) != 0)) {
				{
				{
				setState(1460);
				column_constraint();
				}
				}
				setState(1465);
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
		enterRule(_localctx, 156, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1466);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1471);
				match(OPEN_PAR);
				setState(1472);
				signed_number();
				setState(1473);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1475);
				match(OPEN_PAR);
				setState(1476);
				signed_number();
				setState(1477);
				match(COMMA);
				setState(1478);
				signed_number();
				setState(1479);
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
		enterRule(_localctx, 158, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1483);
				match(K_CONSTRAINT);
				setState(1484);
				name();
				}
			}

			setState(1520);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1487);
				match(K_PRIMARY);
				setState(1488);
				match(K_KEY);
				setState(1490);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1489);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1492);
				conflict_clause();
				setState(1494);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1493);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1497);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1496);
					match(K_NOT);
					}
				}

				setState(1499);
				match(K_NULL);
				setState(1500);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1501);
				match(K_UNIQUE);
				setState(1502);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1503);
				match(K_CHECK);
				setState(1504);
				match(OPEN_PAR);
				setState(1505);
				expr(0);
				setState(1506);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1508);
				match(K_DEFAULT);
				setState(1515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1509);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1510);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1511);
					match(OPEN_PAR);
					setState(1512);
					expr(0);
					setState(1513);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1517);
				match(K_COLLATE);
				setState(1518);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1519);
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
		enterRule(_localctx, 160, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1522);
				match(K_ON);
				setState(1523);
				match(K_CONFLICT);
				setState(1524);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_FAIL - 78)) | (1L << (K_IGNORE - 78)) | (1L << (K_REPLACE - 78)) | (1L << (K_ROLLBACK - 78)))) != 0)) ) {
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
		enterRule(_localctx, 162, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(K_REFERENCES);
			setState(1528);
			foreign_table();
			setState(1540);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1529);
				match(OPEN_PAR);
				setState(1530);
				column_name();
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1531);
					match(COMMA);
					setState(1532);
					column_name();
					}
					}
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1538);
				match(CLOSE_PAR);
				}
			}

			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1556);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1542);
					match(K_ON);
					setState(1543);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1552);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1544);
						match(K_SET);
						setState(1545);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1546);
						match(K_SET);
						setState(1547);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1548);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1549);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1550);
						match(K_NO);
						setState(1551);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1554);
					match(K_MATCH);
					setState(1555);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1564);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1563);
					match(K_NOT);
					}
				}

				setState(1566);
				match(K_DEFERRABLE);
				setState(1571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1567);
					match(K_INITIALLY);
					setState(1568);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1569);
					match(K_INITIALLY);
					setState(1570);
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
		enterRule(_localctx, 164, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(K_RAISE);
			setState(1576);
			match(OPEN_PAR);
			setState(1581);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1577);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1578);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1579);
				match(COMMA);
				setState(1580);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1583);
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
		enterRule(_localctx, 166, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			column_name();
			setState(1588);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1586);
				match(K_COLLATE);
				setState(1587);
				collation_name();
				}
			}

			setState(1591);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1590);
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
		enterRule(_localctx, 168, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1593);
				match(K_CONSTRAINT);
				setState(1594);
				name();
				}
			}

			setState(1633);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1600);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1597);
					match(K_PRIMARY);
					setState(1598);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1599);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1602);
				match(OPEN_PAR);
				setState(1603);
				indexed_column();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1604);
					match(COMMA);
					setState(1605);
					indexed_column();
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1611);
				match(CLOSE_PAR);
				setState(1612);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1614);
				match(K_CHECK);
				setState(1615);
				match(OPEN_PAR);
				setState(1616);
				expr(0);
				setState(1617);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1619);
				match(K_FOREIGN);
				setState(1620);
				match(K_KEY);
				setState(1621);
				match(OPEN_PAR);
				setState(1622);
				column_name();
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1623);
					match(COMMA);
					setState(1624);
					column_name();
					}
					}
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630);
				match(CLOSE_PAR);
				setState(1631);
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
		enterRule(_localctx, 170, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(K_WITH);
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1636);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1639);
			cte_table_name();
			setState(1640);
			match(K_AS);
			setState(1641);
			match(OPEN_PAR);
			setState(1642);
			select_stmt();
			setState(1643);
			match(CLOSE_PAR);
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1644);
				match(COMMA);
				setState(1645);
				cte_table_name();
				setState(1646);
				match(K_AS);
				setState(1647);
				match(OPEN_PAR);
				setState(1648);
				select_stmt();
				setState(1649);
				match(CLOSE_PAR);
				}
				}
				setState(1655);
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
		enterRule(_localctx, 172, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1656);
				database_name();
				setState(1657);
				match(DOT);
				}
				break;
			}
			setState(1661);
			table_name();
			setState(1667);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1662);
				match(K_INDEXED);
				setState(1663);
				match(K_BY);
				setState(1664);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1665);
				match(K_NOT);
				setState(1666);
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
		enterRule(_localctx, 174, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			expr(0);
			setState(1672);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1670);
				match(K_COLLATE);
				setState(1671);
				collation_name();
				}
			}

			setState(1675);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1674);
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
		enterRule(_localctx, 176, RULE_pragma_value);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
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
		enterRule(_localctx, 178, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			table_name();
			setState(1694);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1683);
				match(OPEN_PAR);
				setState(1684);
				column_name();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1685);
					match(COMMA);
					setState(1686);
					column_name();
					}
					}
					setState(1691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1692);
				match(CLOSE_PAR);
				}
			}

			setState(1696);
			match(K_AS);
			setState(1697);
			match(OPEN_PAR);
			setState(1698);
			select_stmt();
			setState(1699);
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
		enterRule(_localctx, 180, RULE_result_column);
		int _la;
		try {
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				table_name();
				setState(1703);
				match(DOT);
				setState(1704);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1706);
				expr(0);
				setState(1711);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1708);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1707);
						match(K_AS);
						}
					}

					setState(1710);
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
		enterRule(_localctx, 182, RULE_table_or_subquery);
		int _la;
		try {
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1715);
					database_name();
					setState(1716);
					match(DOT);
					}
					break;
				}
				setState(1720);
				table_name();
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1721);
						match(K_AS);
						}
						break;
					}
					setState(1724);
					table_alias();
					}
					break;
				}
				setState(1732);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1727);
					match(K_INDEXED);
					setState(1728);
					match(K_BY);
					setState(1729);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1730);
					match(K_NOT);
					setState(1731);
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
				setState(1734);
				match(OPEN_PAR);
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1735);
					table_or_subquery();
					setState(1740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1736);
						match(COMMA);
						setState(1737);
						table_or_subquery();
						}
						}
						setState(1742);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1743);
					join_clause();
					}
					break;
				}
				setState(1746);
				match(CLOSE_PAR);
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1748);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1747);
						match(K_AS);
						}
						break;
					}
					setState(1750);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1753);
				match(OPEN_PAR);
				setState(1754);
				select_stmt();
				setState(1755);
				match(CLOSE_PAR);
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1757);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1756);
						match(K_AS);
						}
						break;
					}
					setState(1759);
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
		enterRule(_localctx, 184, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			table_or_subquery();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (K_INNER - 93)) | (1L << (K_JOIN - 93)) | (1L << (K_LEFT - 93)) | (1L << (K_NATURAL - 93)))) != 0)) {
				{
				{
				setState(1765);
				join_operator();
				setState(1766);
				table_or_subquery();
				setState(1767);
				join_constraint();
				}
				}
				setState(1773);
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
		enterRule(_localctx, 186, RULE_join_operator);
		int _la;
		try {
			setState(1787);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
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
				setState(1776);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1775);
					match(K_NATURAL);
					}
				}

				setState(1784);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1778);
					match(K_LEFT);
					setState(1780);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1779);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1782);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1783);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1786);
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
		enterRule(_localctx, 188, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1789);
				match(K_ON);
				setState(1790);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1791);
				match(K_USING);
				setState(1792);
				match(OPEN_PAR);
				setState(1793);
				column_name();
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1794);
					match(COMMA);
					setState(1795);
					column_name();
					}
					}
					setState(1800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1801);
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
		enterRule(_localctx, 190, RULE_select_core);
		int _la;
		try {
			setState(1879);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				match(K_SELECT);
				setState(1807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1806);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1809);
				result_column();
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1810);
					match(COMMA);
					setState(1811);
					result_column();
					}
					}
					setState(1816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1829);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1817);
					match(K_FROM);
					setState(1827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(1818);
						table_or_subquery();
						setState(1823);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1819);
							match(COMMA);
							setState(1820);
							table_or_subquery();
							}
							}
							setState(1825);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1826);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1833);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1831);
					match(K_WHERE);
					setState(1832);
					expr(0);
					}
				}

				setState(1849);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1835);
					match(K_GROUP);
					setState(1836);
					match(K_BY);
					setState(1837);
					expr(0);
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1838);
						match(COMMA);
						setState(1839);
						expr(0);
						}
						}
						setState(1844);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1847);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1845);
						match(K_HAVING);
						setState(1846);
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
				setState(1851);
				match(K_VALUES);
				setState(1852);
				match(OPEN_PAR);
				setState(1853);
				expr(0);
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1854);
					match(COMMA);
					setState(1855);
					expr(0);
					}
					}
					setState(1860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1861);
				match(CLOSE_PAR);
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1862);
					match(COMMA);
					setState(1863);
					match(OPEN_PAR);
					setState(1864);
					expr(0);
					setState(1869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1865);
						match(COMMA);
						setState(1866);
						expr(0);
						}
						}
						setState(1871);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1872);
					match(CLOSE_PAR);
					}
					}
					setState(1878);
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
		enterRule(_localctx, 192, RULE_compound_operator);
		try {
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				match(K_UNION);
				setState(1883);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1884);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1885);
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
		enterRule(_localctx, 194, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			table_name();
			setState(1900);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1889);
				match(OPEN_PAR);
				setState(1890);
				column_name();
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1891);
					match(COMMA);
					setState(1892);
					column_name();
					}
					}
					setState(1897);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1898);
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
		enterRule(_localctx, 196, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1902);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1905);
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
		enterRule(_localctx, 198, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
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
		enterRule(_localctx, 200, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
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
		enterRule(_localctx, 202, RULE_module_argument);
		try {
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
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
		enterRule(_localctx, 204, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (K_ABORT - 31)) | (1L << (K_ACTION - 31)) | (1L << (K_ADD - 31)) | (1L << (K_AFTER - 31)) | (1L << (K_ALL - 31)) | (1L << (K_ALTER - 31)) | (1L << (K_ANALYZE - 31)) | (1L << (K_AND - 31)) | (1L << (K_AS - 31)) | (1L << (K_ASC - 31)) | (1L << (K_ATTACH - 31)) | (1L << (K_AUTOINCREMENT - 31)) | (1L << (K_BEFORE - 31)) | (1L << (K_BEGIN - 31)) | (1L << (K_BETWEEN - 31)) | (1L << (K_BY - 31)) | (1L << (K_CASCADE - 31)) | (1L << (K_CASE - 31)) | (1L << (K_CAST - 31)) | (1L << (K_CHECK - 31)) | (1L << (K_COLLATE - 31)) | (1L << (K_COLUMN - 31)) | (1L << (K_COMMIT - 31)) | (1L << (K_CONFLICT - 31)) | (1L << (K_CONSTRAINT - 31)) | (1L << (K_CREATE - 31)) | (1L << (K_CROSS - 31)) | (1L << (K_CURRENT_DATE - 31)) | (1L << (K_CURRENT_TIME - 31)) | (1L << (K_CURRENT_TIMESTAMP - 31)) | (1L << (K_DATABASE - 31)) | (1L << (K_DEFAULT - 31)) | (1L << (K_DEFERRABLE - 31)) | (1L << (K_DEFERRED - 31)) | (1L << (K_DELETE - 31)) | (1L << (K_DESC - 31)) | (1L << (K_DETACH - 31)) | (1L << (K_DISTINCT - 31)) | (1L << (K_DROP - 31)) | (1L << (K_EACH - 31)) | (1L << (K_ELSE - 31)) | (1L << (K_END - 31)) | (1L << (K_ESCAPE - 31)) | (1L << (K_EXCEPT - 31)) | (1L << (K_EXCLUSIVE - 31)) | (1L << (K_EXISTS - 31)) | (1L << (K_EXPLAIN - 31)) | (1L << (K_FAIL - 31)) | (1L << (K_FOR - 31)) | (1L << (K_FOREIGN - 31)) | (1L << (K_FROM - 31)) | (1L << (K_FULL - 31)) | (1L << (K_GLOB - 31)) | (1L << (K_GROUP - 31)) | (1L << (K_HAVING - 31)) | (1L << (K_IF - 31)) | (1L << (K_IGNORE - 31)) | (1L << (K_IMMEDIATE - 31)) | (1L << (K_IN - 31)) | (1L << (K_INDEX - 31)) | (1L << (K_INDEXED - 31)) | (1L << (K_INITIALLY - 31)) | (1L << (K_INNER - 31)) | (1L << (K_INSERT - 31)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (K_INSTEAD - 95)) | (1L << (K_INTERSECT - 95)) | (1L << (K_INTO - 95)) | (1L << (K_IS - 95)) | (1L << (K_ISNULL - 95)) | (1L << (K_JOIN - 95)) | (1L << (K_KEY - 95)) | (1L << (K_LEFT - 95)) | (1L << (K_LIKE - 95)) | (1L << (K_LIMIT - 95)) | (1L << (K_MATCH - 95)) | (1L << (K_NATURAL - 95)) | (1L << (K_NO - 95)) | (1L << (K_NOT - 95)) | (1L << (K_NOTNULL - 95)) | (1L << (K_NULL - 95)) | (1L << (K_OF - 95)) | (1L << (K_OFFSET - 95)) | (1L << (K_ON - 95)) | (1L << (K_OR - 95)) | (1L << (K_ORDER - 95)) | (1L << (K_OUTER - 95)) | (1L << (K_PLAN - 95)) | (1L << (K_PRAGMA - 95)) | (1L << (K_PRIMARY - 95)) | (1L << (K_QUERY - 95)) | (1L << (K_RAISE - 95)) | (1L << (K_RECURSIVE - 95)) | (1L << (K_REFERENCES - 95)) | (1L << (K_REGEXP - 95)) | (1L << (K_REINDEX - 95)) | (1L << (K_RELEASE - 95)) | (1L << (K_RENAME - 95)) | (1L << (K_REPLACE - 95)) | (1L << (K_RESTRICT - 95)) | (1L << (K_RIGHT - 95)) | (1L << (K_ROLLBACK - 95)) | (1L << (K_ROW - 95)) | (1L << (K_SAVEPOINT - 95)) | (1L << (K_SELECT - 95)) | (1L << (K_SET - 95)) | (1L << (K_TABLE - 95)) | (1L << (K_TEMP - 95)) | (1L << (K_TEMPORARY - 95)) | (1L << (K_THEN - 95)) | (1L << (K_TO - 95)) | (1L << (K_TRANSACTION - 95)) | (1L << (K_TRIGGER - 95)) | (1L << (K_UNION - 95)) | (1L << (K_UNIQUE - 95)) | (1L << (K_UPDATE - 95)) | (1L << (K_USING - 95)) | (1L << (K_VACUUM - 95)) | (1L << (K_VALUES - 95)) | (1L << (K_VIEW - 95)) | (1L << (K_VIRTUAL - 95)) | (1L << (K_WHEN - 95)) | (1L << (K_WHERE - 95)) | (1L << (K_WITH - 95)) | (1L << (K_WITHOUT - 95)))) != 0)) ) {
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
		enterRule(_localctx, 206, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
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
		enterRule(_localctx, 208, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
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
		enterRule(_localctx, 210, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
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
		enterRule(_localctx, 212, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
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
		enterRule(_localctx, 214, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
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
		enterRule(_localctx, 216, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
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
		enterRule(_localctx, 218, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
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
		enterRule(_localctx, 220, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
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
		enterRule(_localctx, 222, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
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
		enterRule(_localctx, 224, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
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
		enterRule(_localctx, 226, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
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
		enterRule(_localctx, 228, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
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
		enterRule(_localctx, 230, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
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
		enterRule(_localctx, 232, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
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
		enterRule(_localctx, 234, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
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
		enterRule(_localctx, 236, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a5\u07a0\4\2\t"+
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
		"\5\u0117\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u0122\n\b\3\b\5"+
		"\b\u0125\n\b\3\b\3\b\5\b\u0129\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0132"+
		"\n\t\3\t\3\t\3\t\7\t\u0137\n\t\f\t\16\t\u013a\13\t\3\t\5\t\u013d\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0147\n\t\3\t\3\t\3\t\3\t\3\t\6\t\u014e"+
		"\n\t\r\t\16\t\u014f\3\t\3\t\5\t\u0154\n\t\3\t\3\t\5\t\u0158\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0173\n\t\3\t\7\t\u0176\n\t\f\t\16\t\u0179"+
		"\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0184\n\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0192\n\17\3\17"+
		"\3\17\3\17\3\17\7\17\u0198\n\17\f\17\16\17\u019b\13\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u01a3\n\17\3\20\3\20\5\20\u01a7\n\20\3\21\3\21\3"+
		"\21\5\21\u01ac\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01b4\n\22\f\22"+
		"\16\22\u01b7\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01c1"+
		"\n\23\f\23\16\23\u01c4\13\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u01de\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u020b\n\36\f\36\16\36\u020e\13\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0219\n\37\f\37\16"+
		"\37\u021c\13\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u0241"+
		"\n*\3+\3+\3,\3,\7,\u0247\n,\f,\16,\u024a\13,\3,\3,\3-\3-\3-\3.\7.\u0252"+
		"\n.\f.\16.\u0255\13.\3.\3.\6.\u0259\n.\r.\16.\u025a\3.\7.\u025e\n.\f."+
		"\16.\u0261\13.\3.\7.\u0264\n.\f.\16.\u0267\13.\3/\3/\3/\5/\u026c\n/\5"+
		"/\u026e\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u028e\n/\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0295\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u029d\n\60\3\60\5\60"+
		"\u02a0\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02a9\n\61\3\62\3"+
		"\62\5\62\u02ad\n\62\3\62\3\62\3\62\3\62\3\63\3\63\5\63\u02b5\n\63\3\63"+
		"\3\63\5\63\u02b9\n\63\5\63\u02bb\n\63\3\64\3\64\3\64\5\64\u02c0\n\64\5"+
		"\64\u02c2\n\64\3\65\3\65\5\65\u02c6\n\65\3\65\3\65\3\65\7\65\u02cb\n\65"+
		"\f\65\16\65\u02ce\13\65\5\65\u02d0\n\65\3\65\3\65\3\65\5\65\u02d5\n\65"+
		"\3\65\3\65\5\65\u02d9\n\65\3\65\6\65\u02dc\n\65\r\65\16\65\u02dd\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u02e5\n\65\f\65\16\65\u02e8\13\65\5\65\u02ea"+
		"\n\65\3\65\3\65\3\65\3\65\5\65\u02f0\n\65\5\65\u02f2\n\65\3\66\3\66\5"+
		"\66\u02f6\n\66\3\66\3\66\3\66\3\66\5\66\u02fc\n\66\3\66\3\66\3\66\5\66"+
		"\u0301\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u030a\n\66\f\66\16"+
		"\66\u030d\13\66\3\66\3\66\3\66\5\66\u0312\n\66\3\67\3\67\5\67\u0316\n"+
		"\67\3\67\3\67\3\67\3\67\5\67\u031c\n\67\3\67\3\67\3\67\5\67\u0321\n\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u0328\n\67\f\67\16\67\u032b\13\67\3\67"+
		"\3\67\7\67\u032f\n\67\f\67\16\67\u0332\13\67\3\67\3\67\3\67\5\67\u0337"+
		"\n\67\3\67\3\67\5\67\u033b\n\67\38\38\58\u033f\n8\38\38\38\38\58\u0345"+
		"\n8\38\38\38\58\u034a\n8\38\38\38\38\38\58\u0351\n8\38\38\38\38\38\38"+
		"\38\78\u035a\n8\f8\168\u035d\138\58\u035f\n8\58\u0361\n8\38\38\38\38\5"+
		"8\u0367\n8\38\38\38\38\58\u036d\n8\38\38\58\u0371\n8\38\38\38\38\38\5"+
		"8\u0378\n8\38\38\68\u037c\n8\r8\168\u037d\38\38\39\39\59\u0384\n9\39\3"+
		"9\39\39\59\u038a\n9\39\39\39\59\u038f\n9\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\5:\u039b\n:\3:\3:\3:\5:\u03a0\n:\3:\3:\3:\3:\3:\3:\3:\7:\u03a9\n:\f"+
		":\16:\u03ac\13:\3:\3:\5:\u03b0\n:\3;\5;\u03b3\n;\3;\3;\3;\3;\3;\5;\u03ba"+
		"\n;\3<\5<\u03bd\n<\3<\3<\3<\3<\3<\5<\u03c4\n<\3<\3<\3<\3<\3<\7<\u03cb"+
		"\n<\f<\16<\u03ce\13<\5<\u03d0\n<\3<\3<\3<\3<\5<\u03d6\n<\5<\u03d8\n<\3"+
		"=\3=\5=\u03dc\n=\3=\3=\3>\3>\3>\3>\5>\u03e4\n>\3>\3>\3>\5>\u03e9\n>\3"+
		">\3>\3?\3?\3?\3?\5?\u03f1\n?\3?\3?\3?\5?\u03f6\n?\3?\3?\3@\3@\3@\3@\5"+
		"@\u03fe\n@\3@\3@\3@\5@\u0403\n@\3@\3@\3A\3A\3A\3A\5A\u040b\nA\3A\3A\3"+
		"A\5A\u0410\nA\3A\3A\3B\3B\5B\u0416\nB\3B\3B\3B\7B\u041b\nB\fB\16B\u041e"+
		"\13B\5B\u0420\nB\3B\3B\3B\3B\7B\u0426\nB\fB\16B\u0429\13B\3B\3B\3B\3B"+
		"\3B\7B\u0430\nB\fB\16B\u0433\13B\5B\u0435\nB\3B\3B\3B\3B\5B\u043b\nB\5"+
		"B\u043d\nB\3C\5C\u0440\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u0453\nC\3C\3C\3C\3C\5C\u0459\nC\3C\3C\3C\3C\3C\7C\u0460\n"+
		"C\fC\16C\u0463\13C\3C\3C\5C\u0467\nC\3C\3C\3C\3C\3C\7C\u046e\nC\fC\16"+
		"C\u0471\13C\3C\3C\3C\3C\3C\3C\7C\u0479\nC\fC\16C\u047c\13C\3C\3C\7C\u0480"+
		"\nC\fC\16C\u0483\13C\3C\3C\3C\5C\u0488\nC\3D\3D\3D\3D\5D\u048e\nD\3D\3"+
		"D\3D\3D\3D\3D\3D\5D\u0497\nD\3E\3E\3E\3E\3E\5E\u049e\nE\3E\3E\5E\u04a2"+
		"\nE\5E\u04a4\nE\3F\3F\5F\u04a8\nF\3F\3F\3G\3G\3G\5G\u04af\nG\5G\u04b1"+
		"\nG\3G\3G\5G\u04b5\nG\3G\5G\u04b8\nG\3H\3H\3H\3I\3I\5I\u04bf\nI\3I\3I"+
		"\3I\7I\u04c4\nI\fI\16I\u04c7\13I\5I\u04c9\nI\3I\3I\3I\3I\3I\3I\7I\u04d1"+
		"\nI\fI\16I\u04d4\13I\5I\u04d6\nI\3I\3I\3I\3I\5I\u04dc\nI\5I\u04de\nI\3"+
		"J\3J\5J\u04e2\nJ\3J\3J\3J\7J\u04e7\nJ\fJ\16J\u04ea\13J\5J\u04ec\nJ\3J"+
		"\3J\3J\3J\7J\u04f2\nJ\fJ\16J\u04f5\13J\3J\3J\3J\3J\3J\7J\u04fc\nJ\fJ\16"+
		"J\u04ff\13J\5J\u0501\nJ\3J\3J\3J\3J\5J\u0507\nJ\5J\u0509\nJ\3K\3K\5K\u050d"+
		"\nK\3K\3K\3K\7K\u0512\nK\fK\16K\u0515\13K\3K\3K\3K\3K\7K\u051b\nK\fK\16"+
		"K\u051e\13K\3K\5K\u0521\nK\5K\u0523\nK\3K\3K\5K\u0527\nK\3K\3K\3K\3K\3"+
		"K\7K\u052e\nK\fK\16K\u0531\13K\3K\3K\5K\u0535\nK\5K\u0537\nK\3K\3K\3K"+
		"\3K\3K\7K\u053e\nK\fK\16K\u0541\13K\3K\3K\3K\3K\3K\3K\7K\u0549\nK\fK\16"+
		"K\u054c\13K\3K\3K\7K\u0550\nK\fK\16K\u0553\13K\5K\u0555\nK\3L\5L\u0558"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0565\nL\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\7L\u0571\nL\fL\16L\u0574\13L\3L\3L\5L\u0578\nL\3M\5M\u057b\n"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0588\nM\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\7M\u0594\nM\fM\16M\u0597\13M\3M\3M\5M\u059b\nM\3M\3M\3M\3M\3M"+
		"\7M\u05a2\nM\fM\16M\u05a5\13M\5M\u05a7\nM\3M\3M\3M\3M\5M\u05ad\nM\5M\u05af"+
		"\nM\3N\3N\3O\3O\5O\u05b5\nO\3O\7O\u05b8\nO\fO\16O\u05bb\13O\3P\6P\u05be"+
		"\nP\rP\16P\u05bf\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u05cc\nP\3Q\3Q\5Q\u05d0"+
		"\nQ\3Q\3Q\3Q\5Q\u05d5\nQ\3Q\3Q\5Q\u05d9\nQ\3Q\5Q\u05dc\nQ\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05ee\nQ\3Q\3Q\3Q\5Q\u05f3\nQ"+
		"\3R\3R\3R\5R\u05f8\nR\3S\3S\3S\3S\3S\3S\7S\u0600\nS\fS\16S\u0603\13S\3"+
		"S\3S\5S\u0607\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0613\nS\3S\3S\5S\u0617"+
		"\nS\7S\u0619\nS\fS\16S\u061c\13S\3S\5S\u061f\nS\3S\3S\3S\3S\3S\5S\u0626"+
		"\nS\5S\u0628\nS\3T\3T\3T\3T\3T\3T\5T\u0630\nT\3T\3T\3U\3U\3U\5U\u0637"+
		"\nU\3U\5U\u063a\nU\3V\3V\5V\u063e\nV\3V\3V\3V\5V\u0643\nV\3V\3V\3V\3V"+
		"\7V\u0649\nV\fV\16V\u064c\13V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\7V\u065c\nV\fV\16V\u065f\13V\3V\3V\3V\5V\u0664\nV\3W\3W\5W\u0668\nW"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u0676\nW\fW\16W\u0679\13W\3X\3"+
		"X\3X\5X\u067e\nX\3X\3X\3X\3X\3X\3X\5X\u0686\nX\3Y\3Y\3Y\5Y\u068b\nY\3"+
		"Y\5Y\u068e\nY\3Z\3Z\3Z\5Z\u0693\nZ\3[\3[\3[\3[\3[\7[\u069a\n[\f[\16[\u069d"+
		"\13[\3[\3[\5[\u06a1\n[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u06af\n\\\3\\\5\\\u06b2\n\\\5\\\u06b4\n\\\3]\3]\3]\5]\u06b9\n]\3]\3]"+
		"\5]\u06bd\n]\3]\5]\u06c0\n]\3]\3]\3]\3]\3]\5]\u06c7\n]\3]\3]\3]\3]\7]"+
		"\u06cd\n]\f]\16]\u06d0\13]\3]\5]\u06d3\n]\3]\3]\5]\u06d7\n]\3]\5]\u06da"+
		"\n]\3]\3]\3]\3]\5]\u06e0\n]\3]\5]\u06e3\n]\5]\u06e5\n]\3^\3^\3^\3^\3^"+
		"\7^\u06ec\n^\f^\16^\u06ef\13^\3_\3_\5_\u06f3\n_\3_\3_\5_\u06f7\n_\3_\3"+
		"_\5_\u06fb\n_\3_\5_\u06fe\n_\3`\3`\3`\3`\3`\3`\3`\7`\u0707\n`\f`\16`\u070a"+
		"\13`\3`\3`\5`\u070e\n`\3a\3a\5a\u0712\na\3a\3a\3a\7a\u0717\na\fa\16a\u071a"+
		"\13a\3a\3a\3a\3a\7a\u0720\na\fa\16a\u0723\13a\3a\5a\u0726\na\5a\u0728"+
		"\na\3a\3a\5a\u072c\na\3a\3a\3a\3a\3a\7a\u0733\na\fa\16a\u0736\13a\3a\3"+
		"a\5a\u073a\na\5a\u073c\na\3a\3a\3a\3a\3a\7a\u0743\na\fa\16a\u0746\13a"+
		"\3a\3a\3a\3a\3a\3a\7a\u074e\na\fa\16a\u0751\13a\3a\3a\7a\u0755\na\fa\16"+
		"a\u0758\13a\5a\u075a\na\3b\3b\3b\3b\3b\5b\u0761\nb\3c\3c\3c\3c\3c\7c\u0768"+
		"\nc\fc\16c\u076b\13c\3c\3c\5c\u076f\nc\3d\5d\u0772\nd\3d\3d\3e\3e\3f\3"+
		"f\3g\3g\5g\u077c\ng\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3"+
		"p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3x\2\3\20y\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\2\24\4\2\u009d\u009d\u00a0\u00a0\4\2\17\17\24\25\3\2\20\21\3\2\26\31"+
		"\3\2\32\35\6\2<>pp\u009e\u009e\u00a0\u00a1\4\2\u009e\u009e\u00a0\u00a0"+
		"\4\2**DD\5\2BBMMZZ\4\2\67\67JJ\4\2\r\rrr\3\2\u008b\u008c\4\2%%FF\7\2!"+
		"!PPYY\u0082\u0082\u0085\u0085\4\2CC\u0093\u0093\5\2!!PP\u0085\u0085\4"+
		"\2\20\22nn\3\2!\u009c\u088f\2\u00f0\3\2\2\2\4\u0109\3\2\2\2\6\u010b\3"+
		"\2\2\2\b\u010e\3\2\2\2\n\u0118\3\2\2\2\f\u011c\3\2\2\2\16\u0128\3\2\2"+
		"\2\20\u0157\3\2\2\2\22\u017a\3\2\2\2\24\u0183\3\2\2\2\26\u0185\3\2\2\2"+
		"\30\u0187\3\2\2\2\32\u0189\3\2\2\2\34\u01a2\3\2\2\2\36\u01a6\3\2\2\2 "+
		"\u01ab\3\2\2\2\"\u01ad\3\2\2\2$\u01ba\3\2\2\2&\u01c7\3\2\2\2(\u01dd\3"+
		"\2\2\2*\u01df\3\2\2\2,\u01e3\3\2\2\2.\u01e7\3\2\2\2\60\u01eb\3\2\2\2\62"+
		"\u01ef\3\2\2\2\64\u01f3\3\2\2\2\66\u01f7\3\2\2\28\u01fd\3\2\2\2:\u0204"+
		"\3\2\2\2<\u0211\3\2\2\2>\u021f\3\2\2\2@\u0223\3\2\2\2B\u0227\3\2\2\2D"+
		"\u022b\3\2\2\2F\u0230\3\2\2\2H\u0234\3\2\2\2J\u0236\3\2\2\2L\u0238\3\2"+
		"\2\2N\u023a\3\2\2\2P\u023c\3\2\2\2R\u023e\3\2\2\2T\u0242\3\2\2\2V\u0248"+
		"\3\2\2\2X\u024d\3\2\2\2Z\u0253\3\2\2\2\\\u026d\3\2\2\2^\u028f\3\2\2\2"+
		"`\u02a1\3\2\2\2b\u02aa\3\2\2\2d\u02b2\3\2\2\2f\u02bc\3\2\2\2h\u02cf\3"+
		"\2\2\2j\u02f3\3\2\2\2l\u0313\3\2\2\2n\u033c\3\2\2\2p\u0381\3\2\2\2r\u0394"+
		"\3\2\2\2t\u03b2\3\2\2\2v\u03bc\3\2\2\2x\u03d9\3\2\2\2z\u03df\3\2\2\2|"+
		"\u03ec\3\2\2\2~\u03f9\3\2\2\2\u0080\u0406\3\2\2\2\u0082\u041f\3\2\2\2"+
		"\u0084\u043f\3\2\2\2\u0086\u0489\3\2\2\2\u0088\u0498\3\2\2\2\u008a\u04a5"+
		"\3\2\2\2\u008c\u04ab\3\2\2\2\u008e\u04b9\3\2\2\2\u0090\u04c8\3\2\2\2\u0092"+
		"\u04eb\3\2\2\2\u0094\u0554\3\2\2\2\u0096\u0557\3\2\2\2\u0098\u057a\3\2"+
		"\2\2\u009a\u05b0\3\2\2\2\u009c\u05b2\3\2\2\2\u009e\u05bd\3\2\2\2\u00a0"+
		"\u05cf\3\2\2\2\u00a2\u05f7\3\2\2\2\u00a4\u05f9\3\2\2\2\u00a6\u0629\3\2"+
		"\2\2\u00a8\u0633\3\2\2\2\u00aa\u063d\3\2\2\2\u00ac\u0665\3\2\2\2\u00ae"+
		"\u067d\3\2\2\2\u00b0\u0687\3\2\2\2\u00b2\u0692\3\2\2\2\u00b4\u0694\3\2"+
		"\2\2\u00b6\u06b3\3\2\2\2\u00b8\u06e4\3\2\2\2\u00ba\u06e6\3\2\2\2\u00bc"+
		"\u06fd\3\2\2\2\u00be\u070d\3\2\2\2\u00c0\u0759\3\2\2\2\u00c2\u0760\3\2"+
		"\2\2\u00c4\u0762\3\2\2\2\u00c6\u0771\3\2\2\2\u00c8\u0775\3\2\2\2\u00ca"+
		"\u0777\3\2\2\2\u00cc\u077b\3\2\2\2\u00ce\u077d\3\2\2\2\u00d0\u077f\3\2"+
		"\2\2\u00d2\u0781\3\2\2\2\u00d4\u0783\3\2\2\2\u00d6\u0785\3\2\2\2\u00d8"+
		"\u0787\3\2\2\2\u00da\u0789\3\2\2\2\u00dc\u078b\3\2\2\2\u00de\u078d\3\2"+
		"\2\2\u00e0\u078f\3\2\2\2\u00e2\u0791\3\2\2\2\u00e4\u0793\3\2\2\2\u00e6"+
		"\u0795\3\2\2\2\u00e8\u0797\3\2\2\2\u00ea\u0799\3\2\2\2\u00ec\u079b\3\2"+
		"\2\2\u00ee\u079d\3\2\2\2\u00f0\u00f1\7\u0088\2\2\u00f1\u00f6\5\16\b\2"+
		"\u00f2\u00f3\7\r\2\2\u00f3\u00f5\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7S\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fd\5\6"+
		"\4\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u0100\5\n\6\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u0103\5\b\5\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0106\5\f\7\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\2\2\3\u0108\3\3\2\2\2\u0109\u010a"+
		"\t\2\2\2\u010a\5\3\2\2\2\u010b\u010c\7\u009a\2\2\u010c\u010d\5\36\20\2"+
		"\u010d\7\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7\60\2\2\u0110\u0115\5"+
		"R*\2\u0111\u0112\7\r\2\2\u0112\u0114\5R*\2\u0113\u0111\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\t\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\7V\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7\u009d"+
		"\2\2\u011b\13\3\2\2\2\u011c\u011d\7j\2\2\u011d\u011e\7\u009e\2\2\u011e"+
		"\r\3\2\2\2\u011f\u0124\5\20\t\2\u0120\u0122\7)\2\2\u0121\u0120\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\5\30\r\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126\u0129\5\34\17\2"+
		"\u0127\u0129\5\32\16\2\u0128\u011f\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\17\3\2\2\2\u012a\u012b\b\t\1\2\u012b\u0158\7\17\2\2\u012c"+
		"\u0158\5\26\f\2\u012d\u0158\5\22\n\2\u012e\u012f\5\u00d2j\2\u012f\u013c"+
		"\7\13\2\2\u0130\u0132\7F\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0138\5\20\t\2\u0134\u0135\7\r\2\2\u0135\u0137\5"+
		"\20\t\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\17"+
		"\2\2\u013c\u0131\3\2\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\7\f\2\2\u013f\u0158\3\2\2\2\u0140\u0141\7\13"+
		"\2\2\u0141\u0142\5\20\t\2\u0142\u0143\7\f\2\2\u0143\u0158\3\2\2\2\u0144"+
		"\u0146\7\62\2\2\u0145\u0147\5\20\t\2\u0146\u0145\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u014d\3\2\2\2\u0148\u0149\7\u0099\2\2\u0149\u014a\5\20\t"+
		"\2\u014a\u014b\7\u008d\2\2\u014b\u014c\5\20\t\2\u014c\u014e\3\2\2\2\u014d"+
		"\u0148\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u0152\7I\2\2\u0152\u0154\5\20\t\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7J"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u012a\3\2\2\2\u0157\u012c\3\2\2\2\u0157"+
		"\u012d\3\2\2\2\u0157\u012e\3\2\2\2\u0157\u0140\3\2\2\2\u0157\u0144\3\2"+
		"\2\2\u0158\u0177\3\2\2\2\u0159\u015a\f\n\2\2\u015a\u015b\t\3\2\2\u015b"+
		"\u0176\5\20\t\13\u015c\u015d\f\t\2\2\u015d\u015e\t\4\2\2\u015e\u0176\5"+
		"\20\t\n\u015f\u0160\f\b\2\2\u0160\u0161\t\5\2\2\u0161\u0176\5\20\t\t\u0162"+
		"\u0163\f\7\2\2\u0163\u0164\t\6\2\2\u0164\u0176\5\20\t\b\u0165\u0172\f"+
		"\6\2\2\u0166\u0173\7\16\2\2\u0167\u0173\7\36\2\2\u0168\u0173\7\37\2\2"+
		"\u0169\u0173\7 \2\2\u016a\u0173\7d\2\2\u016b\u016c\7d\2\2\u016c\u0173"+
		"\7n\2\2\u016d\u0173\7[\2\2\u016e\u0173\7i\2\2\u016f\u0173\7U\2\2\u0170"+
		"\u0173\7k\2\2\u0171\u0173\7~\2\2\u0172\u0166\3\2\2\2\u0172\u0167\3\2\2"+
		"\2\u0172\u0168\3\2\2\2\u0172\u0169\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016b"+
		"\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\5\20"+
		"\t\7\u0175\u0159\3\2\2\2\u0175\u015c\3\2\2\2\u0175\u015f\3\2\2\2\u0175"+
		"\u0162\3\2\2\2\u0175\u0165\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\21\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b"+
		"\5\24\13\2\u017b\23\3\2\2\2\u017c\u0184\7\u009d\2\2\u017d\u0184\5\u00ce"+
		"h\2\u017e\u0184\7\u00a0\2\2\u017f\u0180\7\13\2\2\u0180\u0181\5\24\13\2"+
		"\u0181\u0182\7\f\2\2\u0182\u0184\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017d"+
		"\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u017f\3\2\2\2\u0184\25\3\2\2\2\u0185"+
		"\u0186\t\7\2\2\u0186\27\3\2\2\2\u0187\u0188\t\2\2\2\u0188\31\3\2\2\2\u0189"+
		"\u018a\7\6\2\2\u018a\u018b\7\13\2\2\u018b\u018c\7\u009e\2\2\u018c\u018d"+
		"\7\f\2\2\u018d\33\3\2\2\2\u018e\u018f\7\7\2\2\u018f\u0191\7\13\2\2\u0190"+
		"\u0192\7\b\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\7F\2\2\u0194\u0199\5\22\n\2\u0195\u0196\7\r\2\2\u0196"+
		"\u0198\5\22\n\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\7\f\2\2\u019d\u01a3\3\2\2\2\u019e\u019f\7\7\2\2\u019f\u01a0\7\13"+
		"\2\2\u01a0\u01a1\7\17\2\2\u01a1\u01a3\7\f\2\2\u01a2\u018e\3\2\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a3\35\3\2\2\2\u01a4\u01a7\5 \21\2\u01a5\u01a7\5(\25"+
		"\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\37\3\2\2\2\u01a8\u01ac"+
		"\5\"\22\2\u01a9\u01ac\5$\23\2\u01aa\u01ac\5&\24\2\u01ab\u01a8\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac!\3\2\2\2\u01ad\u01ae\7"+
		"\13\2\2\u01ae\u01af\5\36\20\2\u01af\u01b0\7(\2\2\u01b0\u01b5\5\36\20\2"+
		"\u01b1\u01b2\7(\2\2\u01b2\u01b4\5\36\20\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\7\f\2\2\u01b9#\3\2\2\2\u01ba\u01bb\7\13\2\2"+
		"\u01bb\u01bc\5\36\20\2\u01bc\u01bd\7t\2\2\u01bd\u01c2\5\36\20\2\u01be"+
		"\u01bf\7t\2\2\u01bf\u01c1\5\36\20\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3"+
		"\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c6\7\f\2\2\u01c6%\3\2\2\2\u01c7\u01c8\7n\2\2\u01c8"+
		"\u01c9\5\36\20\2\u01c9\'\3\2\2\2\u01ca\u01de\5*\26\2\u01cb\u01de\5,\27"+
		"\2\u01cc\u01de\5.\30\2\u01cd\u01de\5\60\31\2\u01ce\u01de\5\62\32\2\u01cf"+
		"\u01de\5\64\33\2\u01d0\u01de\5\66\34\2\u01d1\u01de\58\35\2\u01d2\u01de"+
		"\5:\36\2\u01d3\u01de\5<\37\2\u01d4\u01de\5> \2\u01d5\u01de\5@!\2\u01d6"+
		"\u01de\5B\"\2\u01d7\u01de\5D#\2\u01d8\u01de\5F$\2\u01d9\u01da\7\13\2\2"+
		"\u01da\u01db\5(\25\2\u01db\u01dc\7\f\2\2\u01dc\u01de\3\2\2\2\u01dd\u01ca"+
		"\3\2\2\2\u01dd\u01cb\3\2\2\2\u01dd\u01cc\3\2\2\2\u01dd\u01cd\3\2\2\2\u01dd"+
		"\u01ce\3\2\2\2\u01dd\u01cf\3\2\2\2\u01dd\u01d0\3\2\2\2\u01dd\u01d1\3\2"+
		"\2\2\u01dd\u01d2\3\2\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd"+
		"\u01d5\3\2\2\2\u01dd\u01d6\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2"+
		"\2\2\u01dd\u01d9\3\2\2\2\u01de)\3\2\2\2\u01df\u01e0\5H%\2\u01e0\u01e1"+
		"\7\16\2\2\u01e1\u01e2\5P)\2\u01e2+\3\2\2\2\u01e3\u01e4\5H%\2\u01e4\u01e5"+
		"\7 \2\2\u01e5\u01e6\5P)\2\u01e6-\3\2\2\2\u01e7\u01e8\5H%\2\u01e8\u01e9"+
		"\7\33\2\2\u01e9\u01ea\5P)\2\u01ea/\3\2\2\2\u01eb\u01ec\5H%\2\u01ec\u01ed"+
		"\7\32\2\2\u01ed\u01ee\5P)\2\u01ee\61\3\2\2\2\u01ef\u01f0\5H%\2\u01f0\u01f1"+
		"\7\35\2\2\u01f1\u01f2\5P)\2\u01f2\63\3\2\2\2\u01f3\u01f4\5H%\2\u01f4\u01f5"+
		"\7\34\2\2\u01f5\u01f6\5P)\2\u01f6\65\3\2\2\2\u01f7\u01f8\5H%\2\u01f8\u01f9"+
		"\7/\2\2\u01f9\u01fa\5P)\2\u01fa\u01fb\7(\2\2\u01fb\u01fc\5P)\2\u01fc\67"+
		"\3\2\2\2\u01fd\u01fe\5H%\2\u01fe\u01ff\7n\2\2\u01ff\u0200\7/\2\2\u0200"+
		"\u0201\5P)\2\u0201\u0202\7(\2\2\u0202\u0203\5P)\2\u02039\3\2\2\2\u0204"+
		"\u0205\5H%\2\u0205\u0206\7[\2\2\u0206\u0207\7\13\2\2\u0207\u020c\5P)\2"+
		"\u0208\u0209\7\r\2\2\u0209\u020b\5P)\2\u020a\u0208\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0210\7\f\2\2\u0210;\3\2\2\2\u0211\u0212\5H%\2\u0212"+
		"\u0213\7n\2\2\u0213\u0214\7[\2\2\u0214\u0215\7\13\2\2\u0215\u021a\5P)"+
		"\2\u0216\u0217\7\r\2\2\u0217\u0219\5P)\2\u0218\u0216\3\2\2\2\u0219\u021c"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021e\7\f\2\2\u021e=\3\2\2\2\u021f\u0220\5H%\2\u0220"+
		"\u0221\7i\2\2\u0221\u0222\5J&\2\u0222?\3\2\2\2\u0223\u0224\5H%\2\u0224"+
		"\u0225\7i\2\2\u0225\u0226\5L\'\2\u0226A\3\2\2\2\u0227\u0228\5H%\2\u0228"+
		"\u0229\7i\2\2\u0229\u022a\5N(\2\u022aC\3\2\2\2\u022b\u022c\5H%\2\u022c"+
		"\u022d\7d\2\2\u022d\u022e\7n\2\2\u022e\u022f\7p\2\2\u022fE\3\2\2\2\u0230"+
		"\u0231\5H%\2\u0231\u0232\7d\2\2\u0232\u0233\7p\2\2\u0233G\3\2\2\2\u0234"+
		"\u0235\t\2\2\2\u0235I\3\2\2\2\u0236\u0237\7\3\2\2\u0237K\3\2\2\2\u0238"+
		"\u0239\7\4\2\2\u0239M\3\2\2\2\u023a\u023b\7\5\2\2\u023bO\3\2\2\2\u023c"+
		"\u023d\t\b\2\2\u023dQ\3\2\2\2\u023e\u0240\5H%\2\u023f\u0241\5T+\2\u0240"+
		"\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241S\3\2\2\2\u0242\u0243\t\t\2\2"+
		"\u0243U\3\2\2\2\u0244\u0247\5Z.\2\u0245\u0247\5X-\2\u0246\u0244\3\2\2"+
		"\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7\2\2\3\u024c"+
		"W\3\2\2\2\u024d\u024e\7\u00a5\2\2\u024e\u024f\b-\1\2\u024fY\3\2\2\2\u0250"+
		"\u0252\7\t\2\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256"+
		"\u025f\5\\/\2\u0257\u0259\7\t\2\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025e\5\\/\2\u025d\u0258\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0265\3\2\2\2\u0261\u025f\3\2\2\2\u0262"+
		"\u0264\7\t\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266[\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026b"+
		"\7O\2\2\u0269\u026a\7z\2\2\u026a\u026c\7w\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u0268\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u028d\3\2\2\2\u026f\u028e\5^\60\2\u0270\u028e\5`\61\2\u0271"+
		"\u028e\5b\62\2\u0272\u028e\5d\63\2\u0273\u028e\5f\64\2\u0274\u028e\5h"+
		"\65\2\u0275\u028e\5j\66\2\u0276\u028e\5l\67\2\u0277\u028e\5n8\2\u0278"+
		"\u028e\5p9\2\u0279\u028e\5r:\2\u027a\u028e\5t;\2\u027b\u028e\5v<\2\u027c"+
		"\u028e\5x=\2\u027d\u028e\5z>\2\u027e\u028e\5|?\2\u027f\u028e\5~@\2\u0280"+
		"\u028e\5\u0080A\2\u0281\u028e\5\u0082B\2\u0282\u028e\5\u0084C\2\u0283"+
		"\u028e\5\u0086D\2\u0284\u028e\5\u0088E\2\u0285\u028e\5\u008aF\2\u0286"+
		"\u028e\5\u008cG\2\u0287\u028e\5\u008eH\2\u0288\u028e\5\u0090I\2\u0289"+
		"\u028e\5\u0092J\2\u028a\u028e\5\u0096L\2\u028b\u028e\5\u0098M\2\u028c"+
		"\u028e\5\u009aN\2\u028d\u026f\3\2\2\2\u028d\u0270\3\2\2\2\u028d\u0271"+
		"\3\2\2\2\u028d\u0272\3\2\2\2\u028d\u0273\3\2\2\2\u028d\u0274\3\2\2\2\u028d"+
		"\u0275\3\2\2\2\u028d\u0276\3\2\2\2\u028d\u0277\3\2\2\2\u028d\u0278\3\2"+
		"\2\2\u028d\u0279\3\2\2\2\u028d\u027a\3\2\2\2\u028d\u027b\3\2\2\2\u028d"+
		"\u027c\3\2\2\2\u028d\u027d\3\2\2\2\u028d\u027e\3\2\2\2\u028d\u027f\3\2"+
		"\2\2\u028d\u0280\3\2\2\2\u028d\u0281\3\2\2\2\u028d\u0282\3\2\2\2\u028d"+
		"\u0283\3\2\2\2\u028d\u0284\3\2\2\2\u028d\u0285\3\2\2\2\u028d\u0286\3\2"+
		"\2\2\u028d\u0287\3\2\2\2\u028d\u0288\3\2\2\2\u028d\u0289\3\2\2\2\u028d"+
		"\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e]\3\2\2\2"+
		"\u028f\u0290\7&\2\2\u0290\u0294\7\u008a\2\2\u0291\u0292\5\u00d4k\2\u0292"+
		"\u0293\7\n\2\2\u0293\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u029f\5\u00d6l\2\u0297\u0298\7\u0081\2"+
		"\2\u0298\u0299\7\u008e\2\2\u0299\u02a0\5\u00dan\2\u029a\u029c\7#\2\2\u029b"+
		"\u029d\7\66\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3"+
		"\2\2\2\u029e\u02a0\5\u009cO\2\u029f\u0297\3\2\2\2\u029f\u029a\3\2\2\2"+
		"\u02a0_\3\2\2\2\u02a1\u02a8\7\'\2\2\u02a2\u02a9\5\u00d4k\2\u02a3\u02a9"+
		"\5\u00d8m\2\u02a4\u02a5\5\u00d4k\2\u02a5\u02a6\7\n\2\2\u02a6\u02a7\5\u00d8"+
		"m\2\u02a7\u02a9\3\2\2\2\u02a8\u02a2\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a8"+
		"\u02a4\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9a\3\2\2\2\u02aa\u02ac\7+\2\2\u02ab"+
		"\u02ad\7?\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u02af\5\20\t\2\u02af\u02b0\7)\2\2\u02b0\u02b1\5\u00d4k\2\u02b1"+
		"c\3\2\2\2\u02b2\u02b4\7.\2\2\u02b3\u02b5\t\n\2\2\u02b4\u02b3\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02ba\3\2\2\2\u02b6\u02b8\7\u008f\2\2\u02b7\u02b9"+
		"\5\u00eex\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2"+
		"\2\u02ba\u02b6\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbe\3\2\2\2\u02bc\u02c1"+
		"\t\13\2\2\u02bd\u02bf\7\u008f\2\2\u02be\u02c0\5\u00eex\2\u02bf\u02be\3"+
		"\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2g\3\2\2\2\u02c3\u02c5\7\u009b\2\2\u02c4\u02c6\7|\2"+
		"\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cc"+
		"\5\u00b4[\2\u02c8\u02c9\7\r\2\2\u02c9\u02cb\5\u00b4[\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02c3\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02db\5\u00c0a\2\u02d2\u02d4\7\u0091\2"+
		"\2\u02d3\u02d5\7%\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d9"+
		"\3\2\2\2\u02d6\u02d9\7b\2\2\u02d7\u02d9\7L\2\2\u02d8\u02d2\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\5\u00c0"+
		"a\2\u02db\u02d8\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e9\3\2\2\2\u02df\u02e0\7u\2\2\u02e0\u02e1\7\60"+
		"\2\2\u02e1\u02e6\5\u00b0Y\2\u02e2\u02e3\7\r\2\2\u02e3\u02e5\5\u00b0Y\2"+
		"\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02df\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02f1\3\2\2\2\u02eb\u02ec\7j\2\2\u02ec\u02ef\5\20"+
		"\t\2\u02ed\u02ee\t\f\2\2\u02ee\u02f0\5\20\t\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2i\3\2\2\2\u02f3\u02f5\7:\2\2\u02f4\u02f6\7\u0092\2\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\7\\\2\2\u02f8"+
		"\u02f9\7X\2\2\u02f9\u02fa\7n\2\2\u02fa\u02fc\7N\2\2\u02fb\u02f8\3\2\2"+
		"\2\u02fb\u02fc\3\2\2\2\u02fc\u0300\3\2\2\2\u02fd\u02fe\5\u00d4k\2\u02fe"+
		"\u02ff\7\n\2\2\u02ff\u0301\3\2\2\2\u0300\u02fd\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0302\3\2\2\2\u0302\u0303\5\u00e0q\2\u0303\u0304\7s\2\2\u0304"+
		"\u0305\5\u00d6l\2\u0305\u0306\7\13\2\2\u0306\u030b\5\u00a8U\2\u0307\u0308"+
		"\7\r\2\2\u0308\u030a\5\u00a8U\2\u0309\u0307\3\2\2\2\u030a\u030d\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030e\u0311\7\f\2\2\u030f\u0310\7\u009a\2\2\u0310\u0312\5\20"+
		"\t\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312k\3\2\2\2\u0313\u0315"+
		"\7:\2\2\u0314\u0316\t\r\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u031b\7\u008a\2\2\u0318\u0319\7X\2\2\u0319\u031a"+
		"\7n\2\2\u031a\u031c\7N\2\2\u031b\u0318\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u0320\3\2\2\2\u031d\u031e\5\u00d4k\2\u031e\u031f\7\n\2\2\u031f\u0321"+
		"\3\2\2\2\u0320\u031d\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u033a\5\u00d6l\2\u0323\u0324\7\13\2\2\u0324\u0329\5\u009cO\2\u0325\u0326"+
		"\7\r\2\2\u0326\u0328\5\u009cO\2\u0327\u0325\3\2\2\2\u0328\u032b\3\2\2"+
		"\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0330\3\2\2\2\u032b\u0329"+
		"\3\2\2\2\u032c\u032d\7\r\2\2\u032d\u032f\5\u00aaV\2\u032e\u032c\3\2\2"+
		"\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0336\7\f\2\2\u0334\u0335\7\u009c\2"+
		"\2\u0335\u0337\7\u009d\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u033b\3\2\2\2\u0338\u0339\7)\2\2\u0339\u033b\5\u0092J\2\u033a\u0323\3"+
		"\2\2\2\u033a\u0338\3\2\2\2\u033bm\3\2\2\2\u033c\u033e\7:\2\2\u033d\u033f"+
		"\t\r\2\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0344\7\u0090\2\2\u0341\u0342\7X\2\2\u0342\u0343\7n\2\2\u0343\u0345\7"+
		"N\2\2\u0344\u0341\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0349\3\2\2\2\u0346"+
		"\u0347\5\u00d4k\2\u0347\u0348\7\n\2\2\u0348\u034a\3\2\2\2\u0349\u0346"+
		"\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0350\5\u00e2r"+
		"\2\u034c\u0351\7-\2\2\u034d\u0351\7$\2\2\u034e\u034f\7a\2\2\u034f\u0351"+
		"\7q\2\2\u0350\u034c\3\2\2\2\u0350\u034d\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0360\3\2\2\2\u0352\u0361\7C\2\2\u0353\u0361\7`\2"+
		"\2\u0354\u035e\7\u0093\2\2\u0355\u0356\7q\2\2\u0356\u035b\5\22\n\2\u0357"+
		"\u0358\7\r\2\2\u0358\u035a\5\22\n\2\u0359\u0357\3\2\2\2\u035a\u035d\3"+
		"\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035e\u0355\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2"+
		"\2\2\u0360\u0352\3\2\2\2\u0360\u0353\3\2\2\2\u0360\u0354\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0366\7s\2\2\u0363\u0364\5\u00d4k\2\u0364\u0365\7"+
		"\n\2\2\u0365\u0367\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036c\5\u00d6l\2\u0369\u036a\7Q\2\2\u036a\u036b\7"+
		"H\2\2\u036b\u036d\7\u0086\2\2\u036c\u0369\3\2\2\2\u036c\u036d\3\2\2\2"+
		"\u036d\u0370\3\2\2\2\u036e\u036f\7\u0099\2\2\u036f\u0371\5\20\t\2\u0370"+
		"\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037b\7."+
		"\2\2\u0373\u0378\5\u0096L\2\u0374\u0378\5\u0084C\2\u0375\u0378\5t;\2\u0376"+
		"\u0378\5\u0092J\2\u0377\u0373\3\2\2\2\u0377\u0374\3\2\2\2\u0377\u0375"+
		"\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7\t\2\2\u037a"+
		"\u037c\3\2\2\2\u037b\u0377\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\7J\2\2\u0380"+
		"o\3\2\2\2\u0381\u0383\7:\2\2\u0382\u0384\t\r\2\2\u0383\u0382\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0389\7\u0097\2\2\u0386\u0387"+
		"\7X\2\2\u0387\u0388\7n\2\2\u0388\u038a\7N\2\2\u0389\u0386\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038e\3\2\2\2\u038b\u038c\5\u00d4k\2\u038c\u038d"+
		"\7\n\2\2\u038d\u038f\3\2\2\2\u038e\u038b\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\5\u00e4s\2\u0391\u0392\7)\2\2\u0392\u0393\5"+
		"\u0092J\2\u0393q\3\2\2\2\u0394\u0395\7:\2\2\u0395\u0396\7\u0098\2\2\u0396"+
		"\u039a\7\u008a\2\2\u0397\u0398\7X\2\2\u0398\u0399\7n\2\2\u0399\u039b\7"+
		"N\2\2\u039a\u0397\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039f\3\2\2\2\u039c"+
		"\u039d\5\u00d4k\2\u039d\u039e\7\n\2\2\u039e\u03a0\3\2\2\2\u039f\u039c"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\5\u00d6l"+
		"\2\u03a2\u03a3\7\u0094\2\2\u03a3\u03af\5\u00e6t\2\u03a4\u03a5\7\13\2\2"+
		"\u03a5\u03aa\5\u00ccg\2\u03a6\u03a7\7\r\2\2\u03a7\u03a9\5\u00ccg\2\u03a8"+
		"\u03a6\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae\7\f\2\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u03a4\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0s\3\2\2\2"+
		"\u03b1\u03b3\5\u00acW\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\7C\2\2\u03b5\u03b6\7S\2\2\u03b6\u03b9\5\u00ae"+
		"X\2\u03b7\u03b8\7\u009a\2\2\u03b8\u03ba\5\20\t\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03bau\3\2\2\2\u03bb\u03bd\5\u00acW\2\u03bc\u03bb\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\7C\2\2\u03bf\u03c0"+
		"\7S\2\2\u03c0\u03c3\5\u00aeX\2\u03c1\u03c2\7\u009a\2\2\u03c2\u03c4\5\20"+
		"\t\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03d7\3\2\2\2\u03c5"+
		"\u03c6\7u\2\2\u03c6\u03c7\7\60\2\2\u03c7\u03cc\5\u00b0Y\2\u03c8\u03c9"+
		"\7\r\2\2\u03c9\u03cb\5\u00b0Y\2\u03ca\u03c8\3\2\2\2\u03cb\u03ce\3\2\2"+
		"\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc"+
		"\3\2\2\2\u03cf\u03c5\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\7j\2\2\u03d2\u03d5\5\20\t\2\u03d3\u03d4\t\f\2\2\u03d4\u03d6\5\20"+
		"\t\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7"+
		"\u03cf\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8w\3\2\2\2\u03d9\u03db\7E\2\2\u03da"+
		"\u03dc\7?\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2"+
		"\2\2\u03dd\u03de\5\u00d4k\2\u03dey\3\2\2\2\u03df\u03e0\7G\2\2\u03e0\u03e3"+
		"\7\\\2\2\u03e1\u03e2\7X\2\2\u03e2\u03e4\7N\2\2\u03e3\u03e1\3\2\2\2\u03e3"+
		"\u03e4\3\2\2\2\u03e4\u03e8\3\2\2\2\u03e5\u03e6\5\u00d4k\2\u03e6\u03e7"+
		"\7\n\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03eb\5\u00e0q\2\u03eb{\3\2\2\2\u03ec\u03ed\7G\2"+
		"\2\u03ed\u03f0\7\u008a\2\2\u03ee\u03ef\7X\2\2\u03ef\u03f1\7N\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f5\3\2\2\2\u03f2\u03f3\5\u00d4"+
		"k\2\u03f3\u03f4\7\n\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f2\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\5\u00d6l\2\u03f8}\3\2\2"+
		"\2\u03f9\u03fa\7G\2\2\u03fa\u03fd\7\u0090\2\2\u03fb\u03fc\7X\2\2\u03fc"+
		"\u03fe\7N\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0402\3\2"+
		"\2\2\u03ff\u0400\5\u00d4k\2\u0400\u0401\7\n\2\2\u0401\u0403\3\2\2\2\u0402"+
		"\u03ff\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\5\u00e2"+
		"r\2\u0405\177\3\2\2\2\u0406\u0407\7G\2\2\u0407\u040a\7\u0097\2\2\u0408"+
		"\u0409\7X\2\2\u0409\u040b\7N\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2"+
		"\2\u040b\u040f\3\2\2\2\u040c\u040d\5\u00d4k\2\u040d\u040e\7\n\2\2\u040e"+
		"\u0410\3\2\2\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2"+
		"\2\2\u0411\u0412\5\u00e4s\2\u0412\u0081\3\2\2\2\u0413\u0415\7\u009b\2"+
		"\2\u0414\u0416\7|\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u041c\5\u00b4[\2\u0418\u0419\7\r\2\2\u0419\u041b\5\u00b4"+
		"[\2\u041a\u0418\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0413\3\2"+
		"\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0427\5\u00c0a\2\u0422"+
		"\u0423\5\u00c2b\2\u0423\u0424\5\u00c0a\2\u0424\u0426\3\2\2\2\u0425\u0422"+
		"\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u0434\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042b\7u\2\2\u042b\u042c\7\60"+
		"\2\2\u042c\u0431\5\u00b0Y\2\u042d\u042e\7\r\2\2\u042e\u0430\5\u00b0Y\2"+
		"\u042f\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432"+
		"\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u042a\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u043c\3\2\2\2\u0436\u0437\7j\2\2\u0437\u043a\5\20"+
		"\t\2\u0438\u0439\t\f\2\2\u0439\u043b\5\20\t\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u0436\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u0083\3\2\2\2\u043e\u0440\5\u00acW\2\u043f\u043e\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u0452\3\2\2\2\u0441\u0453\7`\2\2\u0442\u0453\7\u0082"+
		"\2\2\u0443\u0444\7`\2\2\u0444\u0445\7t\2\2\u0445\u0453\7\u0082\2\2\u0446"+
		"\u0447\7`\2\2\u0447\u0448\7t\2\2\u0448\u0453\7\u0085\2\2\u0449\u044a\7"+
		"`\2\2\u044a\u044b\7t\2\2\u044b\u0453\7!\2\2\u044c\u044d\7`\2\2\u044d\u044e"+
		"\7t\2\2\u044e\u0453\7P\2\2\u044f\u0450\7`\2\2\u0450\u0451\7t\2\2\u0451"+
		"\u0453\7Y\2\2\u0452\u0441\3\2\2\2\u0452\u0442\3\2\2\2\u0452\u0443\3\2"+
		"\2\2\u0452\u0446\3\2\2\2\u0452\u0449\3\2\2\2\u0452\u044c\3\2\2\2\u0452"+
		"\u044f\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0458\7c\2\2\u0455\u0456\5\u00d4"+
		"k\2\u0456\u0457\7\n\2\2\u0457\u0459\3\2\2\2\u0458\u0455\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u0466\5\u00d6l\2\u045b\u045c"+
		"\7\13\2\2\u045c\u0461\5\22\n\2\u045d\u045e\7\r\2\2\u045e\u0460\5\22\n"+
		"\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465\7\f\2\2\u0465"+
		"\u0467\3\2\2\2\u0466\u045b\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0487\3\2"+
		"\2\2\u0468\u0469\7\u0096\2\2\u0469\u046a\7\13\2\2\u046a\u046f\5\20\t\2"+
		"\u046b\u046c\7\r\2\2\u046c\u046e\5\20\t\2\u046d\u046b\3\2\2\2\u046e\u0471"+
		"\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0481\7\f\2\2\u0473\u0474\7\r\2\2\u0474\u0475\7\13"+
		"\2\2\u0475\u047a\5\20\t\2\u0476\u0477\7\r\2\2\u0477\u0479\5\20\t\2\u0478"+
		"\u0476\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2"+
		"\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\7\f\2\2\u047e"+
		"\u0480\3\2\2\2\u047f\u0473\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2"+
		"\2\2\u0481\u0482\3\2\2\2\u0482\u0488\3\2\2\2\u0483\u0481\3\2\2\2\u0484"+
		"\u0488\5\u0092J\2\u0485\u0486\7@\2\2\u0486\u0488\7\u0096\2\2\u0487\u0468"+
		"\3\2\2\2\u0487\u0484\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u0085\3\2\2\2\u0489"+
		"\u048d\7x\2\2\u048a\u048b\5\u00d4k\2\u048b\u048c\7\n\2\2\u048c\u048e\3"+
		"\2\2\2\u048d\u048a\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u0496\5\u00e8u\2\u0490\u0491\7\16\2\2\u0491\u0497\5\u00b2Z\2\u0492\u0493"+
		"\7\13\2\2\u0493\u0494\5\u00b2Z\2\u0494\u0495\7\f\2\2\u0495\u0497\3\2\2"+
		"\2\u0496\u0490\3\2\2\2\u0496\u0492\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0087"+
		"\3\2\2\2\u0498\u04a3\7\177\2\2\u0499\u04a4\5\u00dco\2\u049a\u049b\5\u00d4"+
		"k\2\u049b\u049c\7\n\2\2\u049c\u049e\3\2\2\2\u049d\u049a\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u04a2\5\u00d6l\2\u04a0\u04a2"+
		"\5\u00e0q\2\u04a1\u049f\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04a4\3\2\2"+
		"\2\u04a3\u0499\3\2\2\2\u04a3\u049d\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u0089"+
		"\3\2\2\2\u04a5\u04a7\7\u0080\2\2\u04a6\u04a8\7\u0087\2\2\u04a7\u04a6\3"+
		"\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\5\u00eav\2"+
		"\u04aa\u008b\3\2\2\2\u04ab\u04b0\7\u0085\2\2\u04ac\u04ae\7\u008f\2\2\u04ad"+
		"\u04af\5\u00eex\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1"+
		"\3\2\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b7\3\2\2\2\u04b2"+
		"\u04b4\7\u008e\2\2\u04b3\u04b5\7\u0087\2\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\5\u00eav\2\u04b7\u04b2\3\2\2"+
		"\2\u04b7\u04b8\3\2\2\2\u04b8\u008d\3\2\2\2\u04b9\u04ba\7\u0087\2\2\u04ba"+
		"\u04bb\5\u00eav\2\u04bb\u008f\3\2\2\2\u04bc\u04be\7\u009b\2\2\u04bd\u04bf"+
		"\7|\2\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c5\5\u00b4[\2\u04c1\u04c2\7\r\2\2\u04c2\u04c4\5\u00b4[\2\u04c3\u04c1"+
		"\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04bc\3\2\2\2\u04c8\u04c9\3\2"+
		"\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04d5\5\u00c0a\2\u04cb\u04cc\7u\2\2\u04cc"+
		"\u04cd\7\60\2\2\u04cd\u04d2\5\u00b0Y\2\u04ce\u04cf\7\r\2\2\u04cf\u04d1"+
		"\5\u00b0Y\2\u04d0\u04ce\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2"+
		"\2\u04d2\u04d3\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04cb"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04dd\3\2\2\2\u04d7\u04d8\7j\2\2\u04d8"+
		"\u04db\5\20\t\2\u04d9\u04da\t\f\2\2\u04da\u04dc\5\20\t\2\u04db\u04d9\3"+
		"\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d7\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u0091\3\2\2\2\u04df\u04e1\7\u009b\2\2\u04e0\u04e2"+
		"\7|\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e8\5\u00b4[\2\u04e4\u04e5\7\r\2\2\u04e5\u04e7\5\u00b4[\2\u04e6\u04e4"+
		"\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04df\3\2\2\2\u04eb\u04ec\3\2"+
		"\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04f3\5\u0094K\2\u04ee\u04ef\5\u00c2b\2"+
		"\u04ef\u04f0\5\u0094K\2\u04f0\u04f2\3\2\2\2\u04f1\u04ee\3\2\2\2\u04f2"+
		"\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u0500\3\2"+
		"\2\2\u04f5\u04f3\3\2\2\2\u04f6\u04f7\7u\2\2\u04f7\u04f8\7\60\2\2\u04f8"+
		"\u04fd\5\u00b0Y\2\u04f9\u04fa\7\r\2\2\u04fa\u04fc\5\u00b0Y\2\u04fb\u04f9"+
		"\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u04f6\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u0508\3\2\2\2\u0502\u0503\7j\2\2\u0503\u0506\5\20\t\2\u0504"+
		"\u0505\t\f\2\2\u0505\u0507\5\20\t\2\u0506\u0504\3\2\2\2\u0506\u0507\3"+
		"\2\2\2\u0507\u0509\3\2\2\2\u0508\u0502\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u0093\3\2\2\2\u050a\u050c\7\u0088\2\2\u050b\u050d\t\16\2\2\u050c\u050b"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0513\5\u00b6\\"+
		"\2\u050f\u0510\7\r\2\2\u0510\u0512\5\u00b6\\\2\u0511\u050f\3\2\2\2\u0512"+
		"\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0522\3\2"+
		"\2\2\u0515\u0513\3\2\2\2\u0516\u0520\7S\2\2\u0517\u051c\5\u00b8]\2\u0518"+
		"\u0519\7\r\2\2\u0519\u051b\5\u00b8]\2\u051a\u0518\3\2\2\2\u051b\u051e"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0521\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051f\u0521\5\u00ba^\2\u0520\u0517\3\2\2\2\u0520\u051f"+
		"\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u0516\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0526\3\2\2\2\u0524\u0525\7\u009a\2\2\u0525\u0527\5\20\t\2\u0526\u0524"+
		"\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0536\3\2\2\2\u0528\u0529\7V\2\2\u0529"+
		"\u052a\7\60\2\2\u052a\u052f\5\20\t\2\u052b\u052c\7\r\2\2\u052c\u052e\5"+
		"\20\t\2\u052d\u052b\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u052f"+
		"\u0530\3\2\2\2\u0530\u0534\3\2\2\2\u0531\u052f\3\2\2\2\u0532\u0533\7W"+
		"\2\2\u0533\u0535\5\20\t\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0528\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0555\3\2"+
		"\2\2\u0538\u0539\7\u0096\2\2\u0539\u053a\7\13\2\2\u053a\u053f\5\20\t\2"+
		"\u053b\u053c\7\r\2\2\u053c\u053e\5\20\t\2\u053d\u053b\3\2\2\2\u053e\u0541"+
		"\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0542\u0551\7\f\2\2\u0543\u0544\7\r\2\2\u0544\u0545\7\13"+
		"\2\2\u0545\u054a\5\20\t\2\u0546\u0547\7\r\2\2\u0547\u0549\5\20\t\2\u0548"+
		"\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2"+
		"\2\2\u054b\u054d\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u054e\7\f\2\2\u054e"+
		"\u0550\3\2\2\2\u054f\u0543\3\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2"+
		"\2\2\u0551\u0552\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0554"+
		"\u050a\3\2\2\2\u0554\u0538\3\2\2\2\u0555\u0095\3\2\2\2\u0556\u0558\5\u00ac"+
		"W\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u0564\7\u0093\2\2\u055a\u055b\7t\2\2\u055b\u0565\7\u0085\2\2\u055c\u055d"+
		"\7t\2\2\u055d\u0565\7!\2\2\u055e\u055f\7t\2\2\u055f\u0565\7\u0082\2\2"+
		"\u0560\u0561\7t\2\2\u0561\u0565\7P\2\2\u0562\u0563\7t\2\2\u0563\u0565"+
		"\7Y\2\2\u0564\u055a\3\2\2\2\u0564\u055c\3\2\2\2\u0564\u055e\3\2\2\2\u0564"+
		"\u0560\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2"+
		"\2\2\u0566\u0567\5\u00aeX\2\u0567\u0568\7\u0089\2\2\u0568\u0569\5\22\n"+
		"\2\u0569\u056a\7\16\2\2\u056a\u0572\5\20\t\2\u056b\u056c\7\r\2\2\u056c"+
		"\u056d\5\22\n\2\u056d\u056e\7\16\2\2\u056e\u056f\5\20\t\2\u056f\u0571"+
		"\3\2\2\2\u0570\u056b\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u0577\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0576\7\u009a"+
		"\2\2\u0576\u0578\5\20\t\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u0097\3\2\2\2\u0579\u057b\5\u00acW\2\u057a\u0579\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u0587\7\u0093\2\2\u057d\u057e\7t\2"+
		"\2\u057e\u0588\7\u0085\2\2\u057f\u0580\7t\2\2\u0580\u0588\7!\2\2\u0581"+
		"\u0582\7t\2\2\u0582\u0588\7\u0082\2\2\u0583\u0584\7t\2\2\u0584\u0588\7"+
		"P\2\2\u0585\u0586\7t\2\2\u0586\u0588\7Y\2\2\u0587\u057d\3\2\2\2\u0587"+
		"\u057f\3\2\2\2\u0587\u0581\3\2\2\2\u0587\u0583\3\2\2\2\u0587\u0585\3\2"+
		"\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\5\u00aeX\2\u058a"+
		"\u058b\7\u0089\2\2\u058b\u058c\5\22\n\2\u058c\u058d\7\16\2\2\u058d\u0595"+
		"\5\20\t\2\u058e\u058f\7\r\2\2\u058f\u0590\5\22\n\2\u0590\u0591\7\16\2"+
		"\2\u0591\u0592\5\20\t\2\u0592\u0594\3\2\2\2\u0593\u058e\3\2\2\2\u0594"+
		"\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u059a\3\2"+
		"\2\2\u0597\u0595\3\2\2\2\u0598\u0599\7\u009a\2\2\u0599\u059b\5\20\t\2"+
		"\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u05ae\3\2\2\2\u059c\u059d"+
		"\7u\2\2\u059d\u059e\7\60\2\2\u059e\u05a3\5\u00b0Y\2\u059f\u05a0\7\r\2"+
		"\2\u05a0\u05a2\5\u00b0Y\2\u05a1\u059f\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3"+
		"\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2"+
		"\2\2\u05a6\u059c\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u05a9\7j\2\2\u05a9\u05ac\5\20\t\2\u05aa\u05ab\t\f\2\2\u05ab\u05ad\5\20"+
		"\t\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae"+
		"\u05a6\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u0099\3\2\2\2\u05b0\u05b1\7\u0095"+
		"\2\2\u05b1\u009b\3\2\2\2\u05b2\u05b4\5\22\n\2\u05b3\u05b5\5\u009eP\2\u05b4"+
		"\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b9\3\2\2\2\u05b6\u05b8\5\u00a0"+
		"Q\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u009d\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05be\5\u00d0"+
		"i\2\u05bd\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05cb\3\2\2\2\u05c1\u05c2\7\13\2\2\u05c2\u05c3\5"+
		"\u00c6d\2\u05c3\u05c4\7\f\2\2\u05c4\u05cc\3\2\2\2\u05c5\u05c6\7\13\2\2"+
		"\u05c6\u05c7\5\u00c6d\2\u05c7\u05c8\7\r\2\2\u05c8\u05c9\5\u00c6d\2\u05c9"+
		"\u05ca\7\f\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c1\3\2\2\2\u05cb\u05c5\3\2"+
		"\2\2\u05cb\u05cc\3\2\2\2\u05cc\u009f\3\2\2\2\u05cd\u05ce\79\2\2\u05ce"+
		"\u05d0\5\u00d0i\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05f2"+
		"\3\2\2\2\u05d1\u05d2\7y\2\2\u05d2\u05d4\7g\2\2\u05d3\u05d5\t\t\2\2\u05d4"+
		"\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\5\u00a2"+
		"R\2\u05d7\u05d9\7,\2\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05f3"+
		"\3\2\2\2\u05da\u05dc\7n\2\2\u05db\u05da\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05de\7p\2\2\u05de\u05f3\5\u00a2R\2\u05df\u05e0\7"+
		"\u0092\2\2\u05e0\u05f3\5\u00a2R\2\u05e1\u05e2\7\64\2\2\u05e2\u05e3\7\13"+
		"\2\2\u05e3\u05e4\5\20\t\2\u05e4\u05e5\7\f\2\2\u05e5\u05f3\3\2\2\2\u05e6"+
		"\u05ed\7@\2\2\u05e7\u05ee\5\u00c6d\2\u05e8\u05ee\5\26\f\2\u05e9\u05ea"+
		"\7\13\2\2\u05ea\u05eb\5\20\t\2\u05eb\u05ec\7\f\2\2\u05ec\u05ee\3\2\2\2"+
		"\u05ed\u05e7\3\2\2\2\u05ed\u05e8\3\2\2\2\u05ed\u05e9\3\2\2\2\u05ee\u05f3"+
		"\3\2\2\2\u05ef\u05f0\7\65\2\2\u05f0\u05f3\5\u00dco\2\u05f1\u05f3\5\u00a4"+
		"S\2\u05f2\u05d1\3\2\2\2\u05f2\u05db\3\2\2\2\u05f2\u05df\3\2\2\2\u05f2"+
		"\u05e1\3\2\2\2\u05f2\u05e6\3\2\2\2\u05f2\u05ef\3\2\2\2\u05f2\u05f1\3\2"+
		"\2\2\u05f3\u00a1\3\2\2\2\u05f4\u05f5\7s\2\2\u05f5\u05f6\78\2\2\u05f6\u05f8"+
		"\t\17\2\2\u05f7\u05f4\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u00a3\3\2\2\2"+
		"\u05f9\u05fa\7}\2\2\u05fa\u0606\5\u00dep\2\u05fb\u05fc\7\13\2\2\u05fc"+
		"\u0601\5\22\n\2\u05fd\u05fe\7\r\2\2\u05fe\u0600\5\22\n\2\u05ff\u05fd\3"+
		"\2\2\2\u0600\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602"+
		"\u0604\3\2\2\2\u0603\u0601\3\2\2\2\u0604\u0605\7\f\2\2\u0605\u0607\3\2"+
		"\2\2\u0606\u05fb\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u061a\3\2\2\2\u0608"+
		"\u0609\7s\2\2\u0609\u0612\t\20\2\2\u060a\u060b\7\u0089\2\2\u060b\u0613"+
		"\7p\2\2\u060c\u060d\7\u0089\2\2\u060d\u0613\7@\2\2\u060e\u0613\7\61\2"+
		"\2\u060f\u0613\7\u0083\2\2\u0610\u0611\7m\2\2\u0611\u0613\7\"\2\2\u0612"+
		"\u060a\3\2\2\2\u0612\u060c\3\2\2\2\u0612\u060e\3\2\2\2\u0612\u060f\3\2"+
		"\2\2\u0612\u0610\3\2\2\2\u0613\u0617\3\2\2\2\u0614\u0615\7k\2\2\u0615"+
		"\u0617\5\u00d0i\2\u0616\u0608\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u0619"+
		"\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a"+
		"\u061b\3\2\2\2\u061b\u0627\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u061f\7n"+
		"\2\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0625\7A\2\2\u0621\u0622\7^\2\2\u0622\u0626\7B\2\2\u0623\u0624\7^\2\2"+
		"\u0624\u0626\7Z\2\2\u0625\u0621\3\2\2\2\u0625\u0623\3\2\2\2\u0625\u0626"+
		"\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u061e\3\2\2\2\u0627\u0628\3\2\2\2\u0628"+
		"\u00a5\3\2\2\2\u0629\u062a\7{\2\2\u062a\u062f\7\13\2\2\u062b\u0630\7Y"+
		"\2\2\u062c\u062d\t\21\2\2\u062d\u062e\7\r\2\2\u062e\u0630\5\u00caf\2\u062f"+
		"\u062b\3\2\2\2\u062f\u062c\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\7\f"+
		"\2\2\u0632\u00a7\3\2\2\2\u0633\u0636\5\22\n\2\u0634\u0635\7\65\2\2\u0635"+
		"\u0637\5\u00dco\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639"+
		"\3\2\2\2\u0638\u063a\t\t\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"\u00a9\3\2\2\2\u063b\u063c\79\2\2\u063c\u063e\5\u00d0i\2\u063d\u063b\3"+
		"\2\2\2\u063d\u063e\3\2\2\2\u063e\u0663\3\2\2\2\u063f\u0640\7y\2\2\u0640"+
		"\u0643\7g\2\2\u0641\u0643\7\u0092\2\2\u0642\u063f\3\2\2\2\u0642\u0641"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\7\13\2\2\u0645\u064a\5\u00a8"+
		"U\2\u0646\u0647\7\r\2\2\u0647\u0649\5\u00a8U\2\u0648\u0646\3\2\2\2\u0649"+
		"\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2"+
		"\2\2\u064c\u064a\3\2\2\2\u064d\u064e\7\f\2\2\u064e\u064f\5\u00a2R\2\u064f"+
		"\u0664\3\2\2\2\u0650\u0651\7\64\2\2\u0651\u0652\7\13\2\2\u0652\u0653\5"+
		"\20\t\2\u0653\u0654\7\f\2\2\u0654\u0664\3\2\2\2\u0655\u0656\7R\2\2\u0656"+
		"\u0657\7g\2\2\u0657\u0658\7\13\2\2\u0658\u065d\5\22\n\2\u0659\u065a\7"+
		"\r\2\2\u065a\u065c\5\22\n\2\u065b\u0659\3\2\2\2\u065c\u065f\3\2\2\2\u065d"+
		"\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u065d\3\2"+
		"\2\2\u0660\u0661\7\f\2\2\u0661\u0662\5\u00a4S\2\u0662\u0664\3\2\2\2\u0663"+
		"\u0642\3\2\2\2\u0663\u0650\3\2\2\2\u0663\u0655\3\2\2\2\u0664\u00ab\3\2"+
		"\2\2\u0665\u0667\7\u009b\2\2\u0666\u0668\7|\2\2\u0667\u0666\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\5\u00c4c\2\u066a\u066b"+
		"\7)\2\2\u066b\u066c\7\13\2\2\u066c\u066d\5\u0092J\2\u066d\u0677\7\f\2"+
		"\2\u066e\u066f\7\r\2\2\u066f\u0670\5\u00c4c\2\u0670\u0671\7)\2\2\u0671"+
		"\u0672\7\13\2\2\u0672\u0673\5\u0092J\2\u0673\u0674\7\f\2\2\u0674\u0676"+
		"\3\2\2\2\u0675\u066e\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u00ad\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u067b\5\u00d4"+
		"k\2\u067b\u067c\7\n\2\2\u067c\u067e\3\2\2\2\u067d\u067a\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0685\5\u00d6l\2\u0680\u0681"+
		"\7]\2\2\u0681\u0682\7\60\2\2\u0682\u0686\5\u00e0q\2\u0683\u0684\7n\2\2"+
		"\u0684\u0686\7]\2\2\u0685\u0680\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686"+
		"\3\2\2\2\u0686\u00af\3\2\2\2\u0687\u068a\5\20\t\2\u0688\u0689\7\65\2\2"+
		"\u0689\u068b\5\u00dco\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068d\3\2\2\2\u068c\u068e\t\t\2\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u00b1\3\2\2\2\u068f\u0693\5\u00c6d\2\u0690\u0693\5\u00d0i\2"+
		"\u0691\u0693\7\u00a0\2\2\u0692\u068f\3\2\2\2\u0692\u0690\3\2\2\2\u0692"+
		"\u0691\3\2\2\2\u0693\u00b3\3\2\2\2\u0694\u06a0\5\u00d6l\2\u0695\u0696"+
		"\7\13\2\2\u0696\u069b\5\22\n\2\u0697\u0698\7\r\2\2\u0698\u069a\5\22\n"+
		"\2\u0699\u0697\3\2\2\2\u069a\u069d\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c"+
		"\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u069b\3\2\2\2\u069e\u069f\7\f\2\2\u069f"+
		"\u06a1\3\2\2\2\u06a0\u0695\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\3\2"+
		"\2\2\u06a2\u06a3\7)\2\2\u06a3\u06a4\7\13\2\2\u06a4\u06a5\5\u0092J\2\u06a5"+
		"\u06a6\7\f\2\2\u06a6\u00b5\3\2\2\2\u06a7\u06b4\7\17\2\2\u06a8\u06a9\5"+
		"\u00d6l\2\u06a9\u06aa\7\n\2\2\u06aa\u06ab\7\17\2\2\u06ab\u06b4\3\2\2\2"+
		"\u06ac\u06b1\5\20\t\2\u06ad\u06af\7)\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af"+
		"\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\5\30\r\2\u06b1\u06ae\3\2\2\2"+
		"\u06b1\u06b2\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3\u06a7\3\2\2\2\u06b3\u06a8"+
		"\3\2\2\2\u06b3\u06ac\3\2\2\2\u06b4\u00b7\3\2\2\2\u06b5\u06b6\5\u00d4k"+
		"\2\u06b6\u06b7\7\n\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b5\3\2\2\2\u06b8\u06b9"+
		"\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bf\5\u00d6l\2\u06bb\u06bd\7)\2\2"+
		"\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0"+
		"\5\u00ecw\2\u06bf\u06bc\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c6\3\2\2"+
		"\2\u06c1\u06c2\7]\2\2\u06c2\u06c3\7\60\2\2\u06c3\u06c7\5\u00e0q\2\u06c4"+
		"\u06c5\7n\2\2\u06c5\u06c7\7]\2\2\u06c6\u06c1\3\2\2\2\u06c6\u06c4\3\2\2"+
		"\2\u06c6\u06c7\3\2\2\2\u06c7\u06e5\3\2\2\2\u06c8\u06d2\7\13\2\2\u06c9"+
		"\u06ce\5\u00b8]\2\u06ca\u06cb\7\r\2\2\u06cb\u06cd\5\u00b8]\2\u06cc\u06ca"+
		"\3\2\2\2\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u06d3\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d3\5\u00ba^\2\u06d2\u06c9"+
		"\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d9\7\f\2\2\u06d5"+
		"\u06d7\7)\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\3\2"+
		"\2\2\u06d8\u06da\5\u00ecw\2\u06d9\u06d6\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06e5\3\2\2\2\u06db\u06dc\7\13\2\2\u06dc\u06dd\5\u0092J\2\u06dd\u06e2"+
		"\7\f\2\2\u06de\u06e0\7)\2\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0"+
		"\u06e1\3\2\2\2\u06e1\u06e3\5\u00ecw\2\u06e2\u06df\3\2\2\2\u06e2\u06e3"+
		"\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06b8\3\2\2\2\u06e4\u06c8\3\2\2\2\u06e4"+
		"\u06db\3\2\2\2\u06e5\u00b9\3\2\2\2\u06e6\u06ed\5\u00b8]\2\u06e7\u06e8"+
		"\5\u00bc_\2\u06e8\u06e9\5\u00b8]\2\u06e9\u06ea\5\u00be`\2\u06ea\u06ec"+
		"\3\2\2\2\u06eb\u06e7\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u00bb\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06fe\7\r"+
		"\2\2\u06f1\u06f3\7l\2\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3"+
		"\u06fa\3\2\2\2\u06f4\u06f6\7h\2\2\u06f5\u06f7\7v\2\2\u06f6\u06f5\3\2\2"+
		"\2\u06f6\u06f7\3\2\2\2\u06f7\u06fb\3\2\2\2\u06f8\u06fb\7_\2\2\u06f9\u06fb"+
		"\7;\2\2\u06fa\u06f4\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06f9\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\7f\2\2\u06fd\u06f0\3\2"+
		"\2\2\u06fd\u06f2\3\2\2\2\u06fe\u00bd\3\2\2\2\u06ff\u0700\7s\2\2\u0700"+
		"\u070e\5\20\t\2\u0701\u0702\7\u0094\2\2\u0702\u0703\7\13\2\2\u0703\u0708"+
		"\5\22\n\2\u0704\u0705\7\r\2\2\u0705\u0707\5\22\n\2\u0706\u0704\3\2\2\2"+
		"\u0707\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b"+
		"\3\2\2\2\u070a\u0708\3\2\2\2\u070b\u070c\7\f\2\2\u070c\u070e\3\2\2\2\u070d"+
		"\u06ff\3\2\2\2\u070d\u0701\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u00bf\3\2"+
		"\2\2\u070f\u0711\7\u0088\2\2\u0710\u0712\t\16\2\2\u0711\u0710\3\2\2\2"+
		"\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0718\5\u00b6\\\2\u0714"+
		"\u0715\7\r\2\2\u0715\u0717\5\u00b6\\\2\u0716\u0714\3\2\2\2\u0717\u071a"+
		"\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u0727\3\2\2\2\u071a"+
		"\u0718\3\2\2\2\u071b\u0725\7S\2\2\u071c\u0721\5\u00b8]\2\u071d\u071e\7"+
		"\r\2\2\u071e\u0720\5\u00b8]\2\u071f\u071d\3\2\2\2\u0720\u0723\3\2\2\2"+
		"\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0726\3\2\2\2\u0723\u0721"+
		"\3\2\2\2\u0724\u0726\5\u00ba^\2\u0725\u071c\3\2\2\2\u0725\u0724\3\2\2"+
		"\2\u0726\u0728\3\2\2\2\u0727\u071b\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072b"+
		"\3\2\2\2\u0729\u072a\7\u009a\2\2\u072a\u072c\5\20\t\2\u072b\u0729\3\2"+
		"\2\2\u072b\u072c\3\2\2\2\u072c\u073b\3\2\2\2\u072d\u072e\7V\2\2\u072e"+
		"\u072f\7\60\2\2\u072f\u0734\5\20\t\2\u0730\u0731\7\r\2\2\u0731\u0733\5"+
		"\20\t\2\u0732\u0730\3\2\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734"+
		"\u0735\3\2\2\2\u0735\u0739\3\2\2\2\u0736\u0734\3\2\2\2\u0737\u0738\7W"+
		"\2\2\u0738\u073a\5\20\t\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a"+
		"\u073c\3\2\2\2\u073b\u072d\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u075a\3\2"+
		"\2\2\u073d\u073e\7\u0096\2\2\u073e\u073f\7\13\2\2\u073f\u0744\5\20\t\2"+
		"\u0740\u0741\7\r\2\2\u0741\u0743\5\20\t\2\u0742\u0740\3\2\2\2\u0743\u0746"+
		"\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2\2\2\u0746"+
		"\u0744\3\2\2\2\u0747\u0756\7\f\2\2\u0748\u0749\7\r\2\2\u0749\u074a\7\13"+
		"\2\2\u074a\u074f\5\20\t\2\u074b\u074c\7\r\2\2\u074c\u074e\5\20\t\2\u074d"+
		"\u074b\3\2\2\2\u074e\u0751\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2"+
		"\2\2\u0750\u0752\3\2\2\2\u0751\u074f\3\2\2\2\u0752\u0753\7\f\2\2\u0753"+
		"\u0755\3\2\2\2\u0754\u0748\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2"+
		"\2\2\u0756\u0757\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0759"+
		"\u070f\3\2\2\2\u0759\u073d\3\2\2\2\u075a\u00c1\3\2\2\2\u075b\u0761\7\u0091"+
		"\2\2\u075c\u075d\7\u0091\2\2\u075d\u0761\7%\2\2\u075e\u0761\7b\2\2\u075f"+
		"\u0761\7L\2\2\u0760\u075b\3\2\2\2\u0760\u075c\3\2\2\2\u0760\u075e\3\2"+
		"\2\2\u0760\u075f\3\2\2\2\u0761\u00c3\3\2\2\2\u0762\u076e\5\u00d6l\2\u0763"+
		"\u0764\7\13\2\2\u0764\u0769\5\22\n\2\u0765\u0766\7\r\2\2\u0766\u0768\5"+
		"\22\n\2\u0767\u0765\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769"+
		"\u076a\3\2\2\2\u076a\u076c\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076d\7\f"+
		"\2\2\u076d\u076f\3\2\2\2\u076e\u0763\3\2\2\2\u076e\u076f\3\2\2\2\u076f"+
		"\u00c5\3\2\2\2\u0770\u0772\t\4\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2"+
		"\2\2\u0772\u0773\3\2\2\2\u0773\u0774\7\u009e\2\2\u0774\u00c7\3\2\2\2\u0775"+
		"\u0776\t\22\2\2\u0776\u00c9\3\2\2\2\u0777\u0778\7\u00a0\2\2\u0778\u00cb"+
		"\3\2\2\2\u0779\u077c\5\20\t\2\u077a\u077c\5\u009cO\2\u077b\u0779\3\2\2"+
		"\2\u077b\u077a\3\2\2\2\u077c\u00cd\3\2\2\2\u077d\u077e\t\23\2\2\u077e"+
		"\u00cf\3\2\2\2\u077f\u0780\5\24\13\2\u0780\u00d1\3\2\2\2\u0781\u0782\5"+
		"\24\13\2\u0782\u00d3\3\2\2\2\u0783\u0784\5\24\13\2\u0784\u00d5\3\2\2\2"+
		"\u0785\u0786\5\24\13\2\u0786\u00d7\3\2\2\2\u0787\u0788\5\24\13\2\u0788"+
		"\u00d9\3\2\2\2\u0789\u078a\5\24\13\2\u078a\u00db\3\2\2\2\u078b\u078c\5"+
		"\24\13\2\u078c\u00dd\3\2\2\2\u078d\u078e\5\24\13\2\u078e\u00df\3\2\2\2"+
		"\u078f\u0790\5\24\13\2\u0790\u00e1\3\2\2\2\u0791\u0792\5\24\13\2\u0792"+
		"\u00e3\3\2\2\2\u0793\u0794\5\24\13\2\u0794\u00e5\3\2\2\2\u0795\u0796\5"+
		"\24\13\2\u0796\u00e7\3\2\2\2\u0797\u0798\5\24\13\2\u0798\u00e9\3\2\2\2"+
		"\u0799\u079a\5\24\13\2\u079a\u00eb\3\2\2\2\u079b\u079c\5\24\13\2\u079c"+
		"\u00ed\3\2\2\2\u079d\u079e\5\24\13\2\u079e\u00ef\3\2\2\2\u00fc\u00f6\u00fc"+
		"\u00ff\u0102\u0105\u0115\u0121\u0124\u0128\u0131\u0138\u013c\u0146\u014f"+
		"\u0153\u0157\u0172\u0175\u0177\u0183\u0191\u0199\u01a2\u01a6\u01ab\u01b5"+
		"\u01c2\u01dd\u020c\u021a\u0240\u0246\u0248\u0253\u025a\u025f\u0265\u026b"+
		"\u026d\u028d\u0294\u029c\u029f\u02a8\u02ac\u02b4\u02b8\u02ba\u02bf\u02c1"+
		"\u02c5\u02cc\u02cf\u02d4\u02d8\u02dd\u02e6\u02e9\u02ef\u02f1\u02f5\u02fb"+
		"\u0300\u030b\u0311\u0315\u031b\u0320\u0329\u0330\u0336\u033a\u033e\u0344"+
		"\u0349\u0350\u035b\u035e\u0360\u0366\u036c\u0370\u0377\u037d\u0383\u0389"+
		"\u038e\u039a\u039f\u03aa\u03af\u03b2\u03b9\u03bc\u03c3\u03cc\u03cf\u03d5"+
		"\u03d7\u03db\u03e3\u03e8\u03f0\u03f5\u03fd\u0402\u040a\u040f\u0415\u041c"+
		"\u041f\u0427\u0431\u0434\u043a\u043c\u043f\u0452\u0458\u0461\u0466\u046f"+
		"\u047a\u0481\u0487\u048d\u0496\u049d\u04a1\u04a3\u04a7\u04ae\u04b0\u04b4"+
		"\u04b7\u04be\u04c5\u04c8\u04d2\u04d5\u04db\u04dd\u04e1\u04e8\u04eb\u04f3"+
		"\u04fd\u0500\u0506\u0508\u050c\u0513\u051c\u0520\u0522\u0526\u052f\u0534"+
		"\u0536\u053f\u054a\u0551\u0554\u0557\u0564\u0572\u0577\u057a\u0587\u0595"+
		"\u059a\u05a3\u05a6\u05ac\u05ae\u05b4\u05b9\u05bf\u05cb\u05cf\u05d4\u05d8"+
		"\u05db\u05ed\u05f2\u05f7\u0601\u0606\u0612\u0616\u061a\u061e\u0625\u0627"+
		"\u062f\u0636\u0639\u063d\u0642\u064a\u065d\u0663\u0667\u0677\u067d\u0685"+
		"\u068a\u068d\u0692\u069b\u06a0\u06ae\u06b1\u06b3\u06b8\u06bc\u06bf\u06c6"+
		"\u06ce\u06d2\u06d6\u06d9\u06df\u06e2\u06e4\u06ed\u06f2\u06f6\u06fa\u06fd"+
		"\u0708\u070d\u0711\u0718\u0721\u0725\u0727\u072b\u0734\u0739\u073b\u0744"+
		"\u074f\u0756\u0759\u0760\u0769\u076e\u0771\u077b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}