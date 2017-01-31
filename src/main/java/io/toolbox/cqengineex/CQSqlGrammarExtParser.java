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
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(F_COUNT);
				setState(397);
				match(OPEN_PAR);
				setState(398);
				match(K_DISTINCT);
				setState(399);
				column_name();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(400);
					match(COMMA);
					setState(401);
					column_name();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(F_COUNT);
				setState(410);
				match(OPEN_PAR);
				setState(411);
				match(STAR);
				setState(412);
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
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				logicalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				andQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				orQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
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
			setState(424);
			match(OPEN_PAR);
			setState(425);
			query();
			setState(426);
			match(K_AND);
			setState(427);
			query();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(428);
				match(K_AND);
				setState(429);
				query();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
			setState(437);
			match(OPEN_PAR);
			setState(438);
			query();
			setState(439);
			match(K_OR);
			setState(440);
			query();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_OR) {
				{
				{
				setState(441);
				match(K_OR);
				setState(442);
				query();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
			setState(450);
			match(K_NOT);
			setState(451);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				equalQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				notEqualQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				lessThanOrEqualToQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				lessThanQuery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				greaterThanOrEqualToQuery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				greaterThanQuery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
				betweenQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(460);
				notBetweenQuery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(461);
				inQuery();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(462);
				notInQuery();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(463);
				startsWithQuery();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(464);
				endsWithQuery();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(465);
				containsQuery();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(466);
				hasQuery();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(467);
				notHasQuery();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(468);
				match(OPEN_PAR);
				setState(469);
				simpleQuery();
				setState(470);
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
			setState(474);
			attributeName();
			setState(475);
			match(ASSIGN);
			setState(476);
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
			setState(478);
			attributeName();
			setState(479);
			match(NOT_EQ2);
			setState(480);
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
			setState(482);
			attributeName();
			setState(483);
			match(LT_EQ);
			setState(484);
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
			setState(486);
			attributeName();
			setState(487);
			match(LT);
			setState(488);
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
			setState(490);
			attributeName();
			setState(491);
			match(GT_EQ);
			setState(492);
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
			setState(494);
			attributeName();
			setState(495);
			match(GT);
			setState(496);
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
			setState(498);
			attributeName();
			setState(499);
			match(K_BETWEEN);
			setState(500);
			queryParameter();
			setState(501);
			match(K_AND);
			setState(502);
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
			setState(504);
			attributeName();
			setState(505);
			match(K_NOT);
			setState(506);
			match(K_BETWEEN);
			setState(507);
			queryParameter();
			setState(508);
			match(K_AND);
			setState(509);
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
			setState(511);
			attributeName();
			setState(512);
			match(K_IN);
			setState(513);
			match(OPEN_PAR);
			setState(514);
			queryParameter();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(515);
				match(COMMA);
				setState(516);
				queryParameter();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
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
			setState(524);
			attributeName();
			setState(525);
			match(K_NOT);
			setState(526);
			match(K_IN);
			setState(527);
			match(OPEN_PAR);
			setState(528);
			queryParameter();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				queryParameter();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
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
			setState(538);
			attributeName();
			setState(539);
			match(K_LIKE);
			setState(540);
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
			setState(542);
			attributeName();
			setState(543);
			match(K_LIKE);
			setState(544);
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
			setState(546);
			attributeName();
			setState(547);
			match(K_LIKE);
			setState(548);
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
			setState(550);
			attributeName();
			setState(551);
			match(K_IS);
			setState(552);
			match(K_NOT);
			setState(553);
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
			setState(555);
			attributeName();
			setState(556);
			match(K_IS);
			setState(557);
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
			setState(559);
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
			setState(561);
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
			setState(563);
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
			setState(565);
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
			setState(567);
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
			setState(569);
			attributeName();
			setState(571);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(570);
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
			setState(573);
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
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DELETE - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (K_ROLLBACK - 130)) | (1L << (K_SAVEPOINT - 130)) | (1L << (K_SELECT - 130)) | (1L << (K_UPDATE - 130)) | (1L << (K_VACUUM - 130)) | (1L << (K_VALUES - 130)) | (1L << (K_WITH - 130)) | (1L << (UNEXPECTED_CHAR - 130)))) != 0)) {
				{
				setState(577);
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
					setState(575);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(576);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
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
			setState(584);
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
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(587);
				match(SCOL);
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			sql_stmt();
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(594);
						match(SCOL);
						}
						}
						setState(597); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(599);
					sql_stmt();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(SCOL);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(616);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(611);
				match(K_EXPLAIN);
				setState(614);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(612);
					match(K_QUERY);
					setState(613);
					match(K_PLAN);
					}
				}

				}
			}

			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(618);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(619);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(620);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(621);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(622);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(623);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(624);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(625);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(626);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(627);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(628);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(629);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(630);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(631);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(632);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(633);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(634);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(635);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(636);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(637);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(638);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(639);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(640);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(641);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(642);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(643);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(644);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(645);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(646);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(647);
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
			setState(650);
			match(K_ALTER);
			setState(651);
			match(K_TABLE);
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(652);
				database_name();
				setState(653);
				match(DOT);
				}
				break;
			}
			setState(657);
			table_name();
			setState(666);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(658);
				match(K_RENAME);
				setState(659);
				match(K_TO);
				setState(660);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(661);
				match(K_ADD);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(662);
					match(K_COLUMN);
					}
					break;
				}
				setState(665);
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
			setState(668);
			match(K_ANALYZE);
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(669);
				database_name();
				}
				break;
			case 2:
				{
				setState(670);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(671);
				database_name();
				setState(672);
				match(DOT);
				setState(673);
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
			setState(677);
			match(K_ATTACH);
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(678);
				match(K_DATABASE);
				}
				break;
			}
			setState(681);
			expr(0);
			setState(682);
			match(K_AS);
			setState(683);
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
			setState(685);
			match(K_BEGIN);
			setState(687);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_DEFERRED - 63)) | (1L << (K_EXCLUSIVE - 63)) | (1L << (K_IMMEDIATE - 63)))) != 0)) {
				{
				setState(686);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (K_DEFERRED - 63)) | (1L << (K_EXCLUSIVE - 63)) | (1L << (K_IMMEDIATE - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(693);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(689);
				match(K_TRANSACTION);
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(690);
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
			setState(695);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(700);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(696);
				match(K_TRANSACTION);
				setState(698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(697);
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
			setState(714);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(702);
				match(K_WITH);
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(703);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(706);
				common_table_expression();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					common_table_expression();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(716);
			select_core();
			setState(726); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(723);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(717);
					match(K_UNION);
					setState(719);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(718);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(721);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(722);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(725);
				select_core();
				}
				}
				setState(728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(740);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(730);
				match(K_ORDER);
				setState(731);
				match(K_BY);
				setState(732);
				ordering_term();
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(733);
					match(COMMA);
					setState(734);
					ordering_term();
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(748);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(742);
				match(K_LIMIT);
				setState(743);
				expr(0);
				setState(746);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(744);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(745);
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
			setState(750);
			match(K_CREATE);
			setState(752);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(751);
				match(K_UNIQUE);
				}
			}

			setState(754);
			match(K_INDEX);
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(755);
				match(K_IF);
				setState(756);
				match(K_NOT);
				setState(757);
				match(K_EXISTS);
				}
				break;
			}
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(760);
				database_name();
				setState(761);
				match(DOT);
				}
				break;
			}
			setState(765);
			index_name();
			setState(766);
			match(K_ON);
			setState(767);
			table_name();
			setState(768);
			match(OPEN_PAR);
			setState(769);
			indexed_column();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(770);
				match(COMMA);
				setState(771);
				indexed_column();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(CLOSE_PAR);
			setState(780);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(778);
				match(K_WHERE);
				setState(779);
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
			setState(782);
			match(K_CREATE);
			setState(784);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(783);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(786);
			match(K_TABLE);
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(787);
				match(K_IF);
				setState(788);
				match(K_NOT);
				setState(789);
				match(K_EXISTS);
				}
				break;
			}
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(792);
				database_name();
				setState(793);
				match(DOT);
				}
				break;
			}
			setState(797);
			table_name();
			setState(821);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(798);
				match(OPEN_PAR);
				setState(799);
				column_def();
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(800);
						match(COMMA);
						setState(801);
						column_def();
						}
						} 
					}
					setState(806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(807);
					match(COMMA);
					setState(808);
					table_constraint();
					}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(814);
				match(CLOSE_PAR);
				setState(817);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(815);
					match(K_WITHOUT);
					setState(816);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(819);
				match(K_AS);
				setState(820);
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
			setState(823);
			match(K_CREATE);
			setState(825);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(827);
			match(K_TRIGGER);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(828);
				match(K_IF);
				setState(829);
				match(K_NOT);
				setState(830);
				match(K_EXISTS);
				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(833);
				database_name();
				setState(834);
				match(DOT);
				}
				break;
			}
			setState(838);
			trigger_name();
			setState(843);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(839);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(840);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(841);
				match(K_INSTEAD);
				setState(842);
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
			setState(859);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(845);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(846);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(847);
				match(K_UPDATE);
				setState(857);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(848);
					match(K_OF);
					setState(849);
					column_name();
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(850);
						match(COMMA);
						setState(851);
						column_name();
						}
						}
						setState(856);
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
			setState(861);
			match(K_ON);
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(862);
				database_name();
				setState(863);
				match(DOT);
				}
				break;
			}
			setState(867);
			table_name();
			setState(871);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(868);
				match(K_FOR);
				setState(869);
				match(K_EACH);
				setState(870);
				match(K_ROW);
				}
			}

			setState(875);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(873);
				match(K_WHEN);
				setState(874);
				expr(0);
				}
			}

			setState(877);
			match(K_BEGIN);
			setState(886); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(878);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(879);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(880);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(881);
					select_stmt();
					}
					break;
				}
				setState(884);
				match(SCOL);
				}
				}
				setState(888); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DELETE - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_REPLACE - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (K_SELECT - 133)) | (1L << (K_UPDATE - 133)) | (1L << (K_VALUES - 133)) | (1L << (K_WITH - 133)))) != 0) );
			setState(890);
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
			setState(892);
			match(K_CREATE);
			setState(894);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(896);
			match(K_VIEW);
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(897);
				match(K_IF);
				setState(898);
				match(K_NOT);
				setState(899);
				match(K_EXISTS);
				}
				break;
			}
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(902);
				database_name();
				setState(903);
				match(DOT);
				}
				break;
			}
			setState(907);
			view_name();
			setState(908);
			match(K_AS);
			setState(909);
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
			setState(911);
			match(K_CREATE);
			setState(912);
			match(K_VIRTUAL);
			setState(913);
			match(K_TABLE);
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(914);
				match(K_IF);
				setState(915);
				match(K_NOT);
				setState(916);
				match(K_EXISTS);
				}
				break;
			}
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(919);
				database_name();
				setState(920);
				match(DOT);
				}
				break;
			}
			setState(924);
			table_name();
			setState(925);
			match(K_USING);
			setState(926);
			module_name();
			setState(938);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(927);
				match(OPEN_PAR);
				setState(928);
				module_argument();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(929);
					match(COMMA);
					setState(930);
					module_argument();
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
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
			setState(941);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(940);
				with_clause();
				}
			}

			setState(943);
			match(K_DELETE);
			setState(944);
			match(K_FROM);
			setState(945);
			qualified_table_name();
			setState(948);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(946);
				match(K_WHERE);
				setState(947);
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
			setState(951);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(950);
				with_clause();
				}
			}

			setState(953);
			match(K_DELETE);
			setState(954);
			match(K_FROM);
			setState(955);
			qualified_table_name();
			setState(958);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(956);
				match(K_WHERE);
				setState(957);
				expr(0);
				}
			}

			setState(978);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(970);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(960);
					match(K_ORDER);
					setState(961);
					match(K_BY);
					setState(962);
					ordering_term();
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(963);
						match(COMMA);
						setState(964);
						ordering_term();
						}
						}
						setState(969);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(972);
				match(K_LIMIT);
				setState(973);
				expr(0);
				setState(976);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(974);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(975);
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
			setState(980);
			match(K_DETACH);
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(981);
				match(K_DATABASE);
				}
				break;
			}
			setState(984);
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
			setState(986);
			match(K_DROP);
			setState(987);
			match(K_INDEX);
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(988);
				match(K_IF);
				setState(989);
				match(K_EXISTS);
				}
				break;
			}
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(992);
				database_name();
				setState(993);
				match(DOT);
				}
				break;
			}
			setState(997);
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
			setState(999);
			match(K_DROP);
			setState(1000);
			match(K_TABLE);
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1001);
				match(K_IF);
				setState(1002);
				match(K_EXISTS);
				}
				break;
			}
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1005);
				database_name();
				setState(1006);
				match(DOT);
				}
				break;
			}
			setState(1010);
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
			setState(1012);
			match(K_DROP);
			setState(1013);
			match(K_TRIGGER);
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1014);
				match(K_IF);
				setState(1015);
				match(K_EXISTS);
				}
				break;
			}
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1018);
				database_name();
				setState(1019);
				match(DOT);
				}
				break;
			}
			setState(1023);
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
			setState(1025);
			match(K_DROP);
			setState(1026);
			match(K_VIEW);
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1027);
				match(K_IF);
				setState(1028);
				match(K_EXISTS);
				}
				break;
			}
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1031);
				database_name();
				setState(1032);
				match(DOT);
				}
				break;
			}
			setState(1036);
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
			setState(1050);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1038);
				match(K_WITH);
				setState(1040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1039);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1042);
				common_table_expression();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1043);
					match(COMMA);
					setState(1044);
					common_table_expression();
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1052);
			select_core();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1053);
				compound_operator();
				setState(1054);
				select_core();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1061);
				match(K_ORDER);
				setState(1062);
				match(K_BY);
				setState(1063);
				ordering_term();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1064);
					match(COMMA);
					setState(1065);
					ordering_term();
					}
					}
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1079);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1073);
				match(K_LIMIT);
				setState(1074);
				expr(0);
				setState(1077);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1075);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1076);
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
			setState(1082);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1081);
				with_clause();
				}
			}

			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1084);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(1085);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(1086);
				match(K_INSERT);
				setState(1087);
				match(K_OR);
				setState(1088);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1089);
				match(K_INSERT);
				setState(1090);
				match(K_OR);
				setState(1091);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(1092);
				match(K_INSERT);
				setState(1093);
				match(K_OR);
				setState(1094);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(1095);
				match(K_INSERT);
				setState(1096);
				match(K_OR);
				setState(1097);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(1098);
				match(K_INSERT);
				setState(1099);
				match(K_OR);
				setState(1100);
				match(K_IGNORE);
				}
				break;
			}
			setState(1103);
			match(K_INTO);
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1104);
				database_name();
				setState(1105);
				match(DOT);
				}
				break;
			}
			setState(1109);
			table_name();
			setState(1121);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1110);
				match(OPEN_PAR);
				setState(1111);
				column_name();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1112);
					match(COMMA);
					setState(1113);
					column_name();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
				match(CLOSE_PAR);
				}
			}

			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1123);
				match(K_VALUES);
				setState(1124);
				match(OPEN_PAR);
				setState(1125);
				expr(0);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1126);
					match(COMMA);
					setState(1127);
					expr(0);
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133);
				match(CLOSE_PAR);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1134);
					match(COMMA);
					setState(1135);
					match(OPEN_PAR);
					setState(1136);
					expr(0);
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1137);
						match(COMMA);
						setState(1138);
						expr(0);
						}
						}
						setState(1143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1144);
					match(CLOSE_PAR);
					}
					}
					setState(1150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1151);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1152);
				match(K_DEFAULT);
				setState(1153);
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
			setState(1156);
			match(K_PRAGMA);
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1157);
				database_name();
				setState(1158);
				match(DOT);
				}
				break;
			}
			setState(1162);
			pragma_name();
			setState(1169);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1163);
				match(ASSIGN);
				setState(1164);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1165);
				match(OPEN_PAR);
				setState(1166);
				pragma_value();
				setState(1167);
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
			setState(1171);
			match(K_REINDEX);
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1172);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1173);
					database_name();
					setState(1174);
					match(DOT);
					}
					break;
				}
				setState(1180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1178);
					table_name();
					}
					break;
				case 2:
					{
					setState(1179);
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
			setState(1184);
			match(K_RELEASE);
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1185);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(1188);
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
			setState(1190);
			match(K_ROLLBACK);
			setState(1195);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(1191);
				match(K_TRANSACTION);
				setState(1193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1192);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(1202);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(1197);
				match(K_TO);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1198);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(1201);
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
			setState(1204);
			match(K_SAVEPOINT);
			setState(1205);
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
			setState(1219);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1207);
				match(K_WITH);
				setState(1209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1208);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1211);
				common_table_expression();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1212);
					match(COMMA);
					setState(1213);
					common_table_expression();
					}
					}
					setState(1218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1221);
			select_core();
			setState(1232);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1222);
				match(K_ORDER);
				setState(1223);
				match(K_BY);
				setState(1224);
				ordering_term();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1225);
					match(COMMA);
					setState(1226);
					ordering_term();
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1240);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1234);
				match(K_LIMIT);
				setState(1235);
				expr(0);
				setState(1238);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1236);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1237);
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
			setState(1254);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1242);
				match(K_WITH);
				setState(1244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1243);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1246);
				common_table_expression();
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1247);
					match(COMMA);
					setState(1248);
					common_table_expression();
					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1256);
			select_or_values();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1257);
				compound_operator();
				setState(1258);
				select_or_values();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1275);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1265);
				match(K_ORDER);
				setState(1266);
				match(K_BY);
				setState(1267);
				ordering_term();
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1268);
					match(COMMA);
					setState(1269);
					ordering_term();
					}
					}
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1283);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1277);
				match(K_LIMIT);
				setState(1278);
				expr(0);
				setState(1281);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1279);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1280);
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
			setState(1359);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				match(K_SELECT);
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1286);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1289);
				result_column();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1290);
					match(COMMA);
					setState(1291);
					result_column();
					}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1309);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1297);
					match(K_FROM);
					setState(1307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1298);
						table_or_subquery();
						setState(1303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1299);
							match(COMMA);
							setState(1300);
							table_or_subquery();
							}
							}
							setState(1305);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1306);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1313);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1311);
					match(K_WHERE);
					setState(1312);
					expr(0);
					}
				}

				setState(1329);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1315);
					match(K_GROUP);
					setState(1316);
					match(K_BY);
					setState(1317);
					expr(0);
					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1318);
						match(COMMA);
						setState(1319);
						expr(0);
						}
						}
						setState(1324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1327);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1325);
						match(K_HAVING);
						setState(1326);
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
				setState(1331);
				match(K_VALUES);
				setState(1332);
				match(OPEN_PAR);
				setState(1333);
				expr(0);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1334);
					match(COMMA);
					setState(1335);
					expr(0);
					}
					}
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1341);
				match(CLOSE_PAR);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1342);
					match(COMMA);
					setState(1343);
					match(OPEN_PAR);
					setState(1344);
					expr(0);
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1345);
						match(COMMA);
						setState(1346);
						expr(0);
						}
						}
						setState(1351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1352);
					match(CLOSE_PAR);
					}
					}
					setState(1358);
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
			setState(1362);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1361);
				with_clause();
				}
			}

			setState(1364);
			match(K_UPDATE);
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1365);
				match(K_OR);
				setState(1366);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1367);
				match(K_OR);
				setState(1368);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1369);
				match(K_OR);
				setState(1370);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1371);
				match(K_OR);
				setState(1372);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1373);
				match(K_OR);
				setState(1374);
				match(K_IGNORE);
				}
				break;
			}
			setState(1377);
			qualified_table_name();
			setState(1378);
			match(K_SET);
			setState(1379);
			column_name();
			setState(1380);
			match(ASSIGN);
			setState(1381);
			expr(0);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1382);
				match(COMMA);
				setState(1383);
				column_name();
				setState(1384);
				match(ASSIGN);
				setState(1385);
				expr(0);
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1394);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1392);
				match(K_WHERE);
				setState(1393);
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
			setState(1397);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1396);
				with_clause();
				}
			}

			setState(1399);
			match(K_UPDATE);
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1400);
				match(K_OR);
				setState(1401);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1402);
				match(K_OR);
				setState(1403);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1404);
				match(K_OR);
				setState(1405);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1406);
				match(K_OR);
				setState(1407);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1408);
				match(K_OR);
				setState(1409);
				match(K_IGNORE);
				}
				break;
			}
			setState(1412);
			qualified_table_name();
			setState(1413);
			match(K_SET);
			setState(1414);
			column_name();
			setState(1415);
			match(ASSIGN);
			setState(1416);
			expr(0);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1417);
				match(COMMA);
				setState(1418);
				column_name();
				setState(1419);
				match(ASSIGN);
				setState(1420);
				expr(0);
				}
				}
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1427);
				match(K_WHERE);
				setState(1428);
				expr(0);
				}
			}

			setState(1449);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1441);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1431);
					match(K_ORDER);
					setState(1432);
					match(K_BY);
					setState(1433);
					ordering_term();
					setState(1438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1434);
						match(COMMA);
						setState(1435);
						ordering_term();
						}
						}
						setState(1440);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1443);
				match(K_LIMIT);
				setState(1444);
				expr(0);
				setState(1447);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1445);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1446);
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
			setState(1451);
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
			setState(1453);
			column_name();
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1454);
				type_name();
				}
				break;
			}
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (K_NOT - 107)) | (1L << (K_NULL - 107)) | (1L << (K_PRIMARY - 107)) | (1L << (K_REFERENCES - 107)) | (1L << (K_UNIQUE - 107)))) != 0)) {
				{
				{
				setState(1457);
				column_constraint();
				}
				}
				setState(1462);
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
			setState(1464); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1463);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1466); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1468);
				match(OPEN_PAR);
				setState(1469);
				signed_number();
				setState(1470);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1472);
				match(OPEN_PAR);
				setState(1473);
				signed_number();
				setState(1474);
				match(COMMA);
				setState(1475);
				signed_number();
				setState(1476);
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
			setState(1482);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1480);
				match(K_CONSTRAINT);
				setState(1481);
				name();
				}
			}

			setState(1517);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1484);
				match(K_PRIMARY);
				setState(1485);
				match(K_KEY);
				setState(1487);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1486);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1489);
				conflict_clause();
				setState(1491);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1490);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1494);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1493);
					match(K_NOT);
					}
				}

				setState(1496);
				match(K_NULL);
				setState(1497);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1498);
				match(K_UNIQUE);
				setState(1499);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1500);
				match(K_CHECK);
				setState(1501);
				match(OPEN_PAR);
				setState(1502);
				expr(0);
				setState(1503);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1505);
				match(K_DEFAULT);
				setState(1512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1506);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1507);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1508);
					match(OPEN_PAR);
					setState(1509);
					expr(0);
					setState(1510);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1514);
				match(K_COLLATE);
				setState(1515);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1516);
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
			setState(1522);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1519);
				match(K_ON);
				setState(1520);
				match(K_CONFLICT);
				setState(1521);
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
			setState(1524);
			match(K_REFERENCES);
			setState(1525);
			foreign_table();
			setState(1537);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1526);
				match(OPEN_PAR);
				setState(1527);
				column_name();
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1528);
					match(COMMA);
					setState(1529);
					column_name();
					}
					}
					setState(1534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1535);
				match(CLOSE_PAR);
				}
			}

			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1553);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1539);
					match(K_ON);
					setState(1540);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1541);
						match(K_SET);
						setState(1542);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1543);
						match(K_SET);
						setState(1544);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1545);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1546);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1547);
						match(K_NO);
						setState(1548);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1551);
					match(K_MATCH);
					setState(1552);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1561);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1560);
					match(K_NOT);
					}
				}

				setState(1563);
				match(K_DEFERRABLE);
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1564);
					match(K_INITIALLY);
					setState(1565);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1566);
					match(K_INITIALLY);
					setState(1567);
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
			setState(1572);
			match(K_RAISE);
			setState(1573);
			match(OPEN_PAR);
			setState(1578);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1574);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1575);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1576);
				match(COMMA);
				setState(1577);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1580);
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
			setState(1582);
			column_name();
			setState(1585);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1583);
				match(K_COLLATE);
				setState(1584);
				collation_name();
				}
			}

			setState(1588);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1587);
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
			setState(1592);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1590);
				match(K_CONSTRAINT);
				setState(1591);
				name();
				}
			}

			setState(1630);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1597);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1594);
					match(K_PRIMARY);
					setState(1595);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1596);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1599);
				match(OPEN_PAR);
				setState(1600);
				indexed_column();
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1601);
					match(COMMA);
					setState(1602);
					indexed_column();
					}
					}
					setState(1607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1608);
				match(CLOSE_PAR);
				setState(1609);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1611);
				match(K_CHECK);
				setState(1612);
				match(OPEN_PAR);
				setState(1613);
				expr(0);
				setState(1614);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1616);
				match(K_FOREIGN);
				setState(1617);
				match(K_KEY);
				setState(1618);
				match(OPEN_PAR);
				setState(1619);
				column_name();
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1620);
					match(COMMA);
					setState(1621);
					column_name();
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1627);
				match(CLOSE_PAR);
				setState(1628);
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
			setState(1632);
			match(K_WITH);
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1633);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1636);
			cte_table_name();
			setState(1637);
			match(K_AS);
			setState(1638);
			match(OPEN_PAR);
			setState(1639);
			select_stmt();
			setState(1640);
			match(CLOSE_PAR);
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1641);
				match(COMMA);
				setState(1642);
				cte_table_name();
				setState(1643);
				match(K_AS);
				setState(1644);
				match(OPEN_PAR);
				setState(1645);
				select_stmt();
				setState(1646);
				match(CLOSE_PAR);
				}
				}
				setState(1652);
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
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1653);
				database_name();
				setState(1654);
				match(DOT);
				}
				break;
			}
			setState(1658);
			table_name();
			setState(1664);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1659);
				match(K_INDEXED);
				setState(1660);
				match(K_BY);
				setState(1661);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1662);
				match(K_NOT);
				setState(1663);
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
			setState(1666);
			expr(0);
			setState(1669);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1667);
				match(K_COLLATE);
				setState(1668);
				collation_name();
				}
			}

			setState(1672);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1671);
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
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
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
			setState(1679);
			table_name();
			setState(1691);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1680);
				match(OPEN_PAR);
				setState(1681);
				column_name();
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1682);
					match(COMMA);
					setState(1683);
					column_name();
					}
					}
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1689);
				match(CLOSE_PAR);
				}
			}

			setState(1693);
			match(K_AS);
			setState(1694);
			match(OPEN_PAR);
			setState(1695);
			select_stmt();
			setState(1696);
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
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				table_name();
				setState(1700);
				match(DOT);
				setState(1701);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1703);
				expr(0);
				setState(1708);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1705);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1704);
						match(K_AS);
						}
					}

					setState(1707);
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
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1712);
					database_name();
					setState(1713);
					match(DOT);
					}
					break;
				}
				setState(1717);
				table_name();
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1718);
						match(K_AS);
						}
						break;
					}
					setState(1721);
					table_alias();
					}
					break;
				}
				setState(1729);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1724);
					match(K_INDEXED);
					setState(1725);
					match(K_BY);
					setState(1726);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1727);
					match(K_NOT);
					setState(1728);
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
				setState(1731);
				match(OPEN_PAR);
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1732);
					table_or_subquery();
					setState(1737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1733);
						match(COMMA);
						setState(1734);
						table_or_subquery();
						}
						}
						setState(1739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1740);
					join_clause();
					}
					break;
				}
				setState(1743);
				match(CLOSE_PAR);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1744);
						match(K_AS);
						}
						break;
					}
					setState(1747);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1750);
				match(OPEN_PAR);
				setState(1751);
				select_stmt();
				setState(1752);
				match(CLOSE_PAR);
				setState(1757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1754);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1753);
						match(K_AS);
						}
						break;
					}
					setState(1756);
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
			setState(1761);
			table_or_subquery();
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_INNER - 92)) | (1L << (K_JOIN - 92)) | (1L << (K_LEFT - 92)) | (1L << (K_NATURAL - 92)))) != 0)) {
				{
				{
				setState(1762);
				join_operator();
				setState(1763);
				table_or_subquery();
				setState(1764);
				join_constraint();
				}
				}
				setState(1770);
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
			setState(1784);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1771);
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
				setState(1773);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1772);
					match(K_NATURAL);
					}
				}

				setState(1781);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1775);
					match(K_LEFT);
					setState(1777);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1776);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1779);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1780);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1783);
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
			setState(1800);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1786);
				match(K_ON);
				setState(1787);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1788);
				match(K_USING);
				setState(1789);
				match(OPEN_PAR);
				setState(1790);
				column_name();
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1791);
					match(COMMA);
					setState(1792);
					column_name();
					}
					}
					setState(1797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1798);
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
			setState(1876);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(K_SELECT);
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1803);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1806);
				result_column();
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1807);
					match(COMMA);
					setState(1808);
					result_column();
					}
					}
					setState(1813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1826);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1814);
					match(K_FROM);
					setState(1824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(1815);
						table_or_subquery();
						setState(1820);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1816);
							match(COMMA);
							setState(1817);
							table_or_subquery();
							}
							}
							setState(1822);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1823);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1830);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1828);
					match(K_WHERE);
					setState(1829);
					expr(0);
					}
				}

				setState(1846);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1832);
					match(K_GROUP);
					setState(1833);
					match(K_BY);
					setState(1834);
					expr(0);
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1835);
						match(COMMA);
						setState(1836);
						expr(0);
						}
						}
						setState(1841);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1844);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1842);
						match(K_HAVING);
						setState(1843);
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
				setState(1848);
				match(K_VALUES);
				setState(1849);
				match(OPEN_PAR);
				setState(1850);
				expr(0);
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1851);
					match(COMMA);
					setState(1852);
					expr(0);
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1858);
				match(CLOSE_PAR);
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1859);
					match(COMMA);
					setState(1860);
					match(OPEN_PAR);
					setState(1861);
					expr(0);
					setState(1866);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1862);
						match(COMMA);
						setState(1863);
						expr(0);
						}
						}
						setState(1868);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1869);
					match(CLOSE_PAR);
					}
					}
					setState(1875);
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
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1878);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1879);
				match(K_UNION);
				setState(1880);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1881);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1882);
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
			setState(1885);
			table_name();
			setState(1897);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1886);
				match(OPEN_PAR);
				setState(1887);
				column_name();
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1888);
					match(COMMA);
					setState(1889);
					column_name();
					}
					}
					setState(1894);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1895);
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
			setState(1900);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1899);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1902);
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
			setState(1904);
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
			setState(1906);
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
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
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
			setState(1912);
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
		enterRule(_localctx, 206, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
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
			setState(1916);
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
			setState(1918);
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
			setState(1920);
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
			setState(1922);
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
			setState(1924);
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
			setState(1926);
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
			setState(1928);
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
			setState(1930);
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
			setState(1932);
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
			setState(1934);
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
			setState(1936);
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
			setState(1938);
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
			setState(1940);
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
			setState(1942);
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
			setState(1944);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a4\u079d\4\2\t"+
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
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0195\n\17\f\17\16\17\u0198\13\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u01a0\n\17\3\20\3\20\5\20\u01a4\n\20\3\21\3\21\3\21\5\21\u01a9\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u01b1\n\22\f\22\16\22\u01b4\13\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01be\n\23\f\23\16\23\u01c1"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01db\n\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u0208\n\36\f\36\16\36\u020b\13\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0216\n\37\f\37\16\37\u0219\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u023e\n*\3+\3+\3,\3,\7,\u0244"+
		"\n,\f,\16,\u0247\13,\3,\3,\3-\3-\3-\3.\7.\u024f\n.\f.\16.\u0252\13.\3"+
		".\3.\6.\u0256\n.\r.\16.\u0257\3.\7.\u025b\n.\f.\16.\u025e\13.\3.\7.\u0261"+
		"\n.\f.\16.\u0264\13.\3/\3/\3/\5/\u0269\n/\5/\u026b\n/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u028b\n/\3\60\3\60\3\60\3\60\3\60\5\60\u0292\n\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u029a\n\60\3\60\5\60\u029d\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u02a6\n\61\3\62\3\62\5\62\u02aa\n\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\5\63\u02b2\n\63\3\63\3\63\5\63\u02b6\n\63\5\63"+
		"\u02b8\n\63\3\64\3\64\3\64\5\64\u02bd\n\64\5\64\u02bf\n\64\3\65\3\65\5"+
		"\65\u02c3\n\65\3\65\3\65\3\65\7\65\u02c8\n\65\f\65\16\65\u02cb\13\65\5"+
		"\65\u02cd\n\65\3\65\3\65\3\65\5\65\u02d2\n\65\3\65\3\65\5\65\u02d6\n\65"+
		"\3\65\6\65\u02d9\n\65\r\65\16\65\u02da\3\65\3\65\3\65\3\65\3\65\7\65\u02e2"+
		"\n\65\f\65\16\65\u02e5\13\65\5\65\u02e7\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u02ed\n\65\5\65\u02ef\n\65\3\66\3\66\5\66\u02f3\n\66\3\66\3\66\3\66\3"+
		"\66\5\66\u02f9\n\66\3\66\3\66\3\66\5\66\u02fe\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\7\66\u0307\n\66\f\66\16\66\u030a\13\66\3\66\3\66\3\66"+
		"\5\66\u030f\n\66\3\67\3\67\5\67\u0313\n\67\3\67\3\67\3\67\3\67\5\67\u0319"+
		"\n\67\3\67\3\67\3\67\5\67\u031e\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u0325"+
		"\n\67\f\67\16\67\u0328\13\67\3\67\3\67\7\67\u032c\n\67\f\67\16\67\u032f"+
		"\13\67\3\67\3\67\3\67\5\67\u0334\n\67\3\67\3\67\5\67\u0338\n\67\38\38"+
		"\58\u033c\n8\38\38\38\38\58\u0342\n8\38\38\38\58\u0347\n8\38\38\38\38"+
		"\38\58\u034e\n8\38\38\38\38\38\38\38\78\u0357\n8\f8\168\u035a\138\58\u035c"+
		"\n8\58\u035e\n8\38\38\38\38\58\u0364\n8\38\38\38\38\58\u036a\n8\38\38"+
		"\58\u036e\n8\38\38\38\38\38\58\u0375\n8\38\38\68\u0379\n8\r8\168\u037a"+
		"\38\38\39\39\59\u0381\n9\39\39\39\39\59\u0387\n9\39\39\39\59\u038c\n9"+
		"\39\39\39\39\3:\3:\3:\3:\3:\3:\5:\u0398\n:\3:\3:\3:\5:\u039d\n:\3:\3:"+
		"\3:\3:\3:\3:\3:\7:\u03a6\n:\f:\16:\u03a9\13:\3:\3:\5:\u03ad\n:\3;\5;\u03b0"+
		"\n;\3;\3;\3;\3;\3;\5;\u03b7\n;\3<\5<\u03ba\n<\3<\3<\3<\3<\3<\5<\u03c1"+
		"\n<\3<\3<\3<\3<\3<\7<\u03c8\n<\f<\16<\u03cb\13<\5<\u03cd\n<\3<\3<\3<\3"+
		"<\5<\u03d3\n<\5<\u03d5\n<\3=\3=\5=\u03d9\n=\3=\3=\3>\3>\3>\3>\5>\u03e1"+
		"\n>\3>\3>\3>\5>\u03e6\n>\3>\3>\3?\3?\3?\3?\5?\u03ee\n?\3?\3?\3?\5?\u03f3"+
		"\n?\3?\3?\3@\3@\3@\3@\5@\u03fb\n@\3@\3@\3@\5@\u0400\n@\3@\3@\3A\3A\3A"+
		"\3A\5A\u0408\nA\3A\3A\3A\5A\u040d\nA\3A\3A\3B\3B\5B\u0413\nB\3B\3B\3B"+
		"\7B\u0418\nB\fB\16B\u041b\13B\5B\u041d\nB\3B\3B\3B\3B\7B\u0423\nB\fB\16"+
		"B\u0426\13B\3B\3B\3B\3B\3B\7B\u042d\nB\fB\16B\u0430\13B\5B\u0432\nB\3"+
		"B\3B\3B\3B\5B\u0438\nB\5B\u043a\nB\3C\5C\u043d\nC\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0450\nC\3C\3C\3C\3C\5C\u0456\nC\3"+
		"C\3C\3C\3C\3C\7C\u045d\nC\fC\16C\u0460\13C\3C\3C\5C\u0464\nC\3C\3C\3C"+
		"\3C\3C\7C\u046b\nC\fC\16C\u046e\13C\3C\3C\3C\3C\3C\3C\7C\u0476\nC\fC\16"+
		"C\u0479\13C\3C\3C\7C\u047d\nC\fC\16C\u0480\13C\3C\3C\3C\5C\u0485\nC\3"+
		"D\3D\3D\3D\5D\u048b\nD\3D\3D\3D\3D\3D\3D\3D\5D\u0494\nD\3E\3E\3E\3E\3"+
		"E\5E\u049b\nE\3E\3E\5E\u049f\nE\5E\u04a1\nE\3F\3F\5F\u04a5\nF\3F\3F\3"+
		"G\3G\3G\5G\u04ac\nG\5G\u04ae\nG\3G\3G\5G\u04b2\nG\3G\5G\u04b5\nG\3H\3"+
		"H\3H\3I\3I\5I\u04bc\nI\3I\3I\3I\7I\u04c1\nI\fI\16I\u04c4\13I\5I\u04c6"+
		"\nI\3I\3I\3I\3I\3I\3I\7I\u04ce\nI\fI\16I\u04d1\13I\5I\u04d3\nI\3I\3I\3"+
		"I\3I\5I\u04d9\nI\5I\u04db\nI\3J\3J\5J\u04df\nJ\3J\3J\3J\7J\u04e4\nJ\f"+
		"J\16J\u04e7\13J\5J\u04e9\nJ\3J\3J\3J\3J\7J\u04ef\nJ\fJ\16J\u04f2\13J\3"+
		"J\3J\3J\3J\3J\7J\u04f9\nJ\fJ\16J\u04fc\13J\5J\u04fe\nJ\3J\3J\3J\3J\5J"+
		"\u0504\nJ\5J\u0506\nJ\3K\3K\5K\u050a\nK\3K\3K\3K\7K\u050f\nK\fK\16K\u0512"+
		"\13K\3K\3K\3K\3K\7K\u0518\nK\fK\16K\u051b\13K\3K\5K\u051e\nK\5K\u0520"+
		"\nK\3K\3K\5K\u0524\nK\3K\3K\3K\3K\3K\7K\u052b\nK\fK\16K\u052e\13K\3K\3"+
		"K\5K\u0532\nK\5K\u0534\nK\3K\3K\3K\3K\3K\7K\u053b\nK\fK\16K\u053e\13K"+
		"\3K\3K\3K\3K\3K\3K\7K\u0546\nK\fK\16K\u0549\13K\3K\3K\7K\u054d\nK\fK\16"+
		"K\u0550\13K\5K\u0552\nK\3L\5L\u0555\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\5L\u0562\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u056e\nL\fL\16L\u0571\13"+
		"L\3L\3L\5L\u0575\nL\3M\5M\u0578\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5"+
		"M\u0585\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u0591\nM\fM\16M\u0594\13M"+
		"\3M\3M\5M\u0598\nM\3M\3M\3M\3M\3M\7M\u059f\nM\fM\16M\u05a2\13M\5M\u05a4"+
		"\nM\3M\3M\3M\3M\5M\u05aa\nM\5M\u05ac\nM\3N\3N\3O\3O\5O\u05b2\nO\3O\7O"+
		"\u05b5\nO\fO\16O\u05b8\13O\3P\6P\u05bb\nP\rP\16P\u05bc\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u05c9\nP\3Q\3Q\5Q\u05cd\nQ\3Q\3Q\3Q\5Q\u05d2\nQ\3Q"+
		"\3Q\5Q\u05d6\nQ\3Q\5Q\u05d9\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\5Q\u05eb\nQ\3Q\3Q\3Q\5Q\u05f0\nQ\3R\3R\3R\5R\u05f5\nR\3S\3S"+
		"\3S\3S\3S\3S\7S\u05fd\nS\fS\16S\u0600\13S\3S\3S\5S\u0604\nS\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\5S\u0610\nS\3S\3S\5S\u0614\nS\7S\u0616\nS\fS\16S\u0619"+
		"\13S\3S\5S\u061c\nS\3S\3S\3S\3S\3S\5S\u0623\nS\5S\u0625\nS\3T\3T\3T\3"+
		"T\3T\3T\5T\u062d\nT\3T\3T\3U\3U\3U\5U\u0634\nU\3U\5U\u0637\nU\3V\3V\5"+
		"V\u063b\nV\3V\3V\3V\5V\u0640\nV\3V\3V\3V\3V\7V\u0646\nV\fV\16V\u0649\13"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u0659\nV\fV\16V\u065c\13"+
		"V\3V\3V\3V\5V\u0661\nV\3W\3W\5W\u0665\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\7W\u0673\nW\fW\16W\u0676\13W\3X\3X\3X\5X\u067b\nX\3X\3X\3X\3X"+
		"\3X\3X\5X\u0683\nX\3Y\3Y\3Y\5Y\u0688\nY\3Y\5Y\u068b\nY\3Z\3Z\3Z\5Z\u0690"+
		"\nZ\3[\3[\3[\3[\3[\7[\u0697\n[\f[\16[\u069a\13[\3[\3[\5[\u069e\n[\3[\3"+
		"[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u06ac\n\\\3\\\5\\\u06af\n\\"+
		"\5\\\u06b1\n\\\3]\3]\3]\5]\u06b6\n]\3]\3]\5]\u06ba\n]\3]\5]\u06bd\n]\3"+
		"]\3]\3]\3]\3]\5]\u06c4\n]\3]\3]\3]\3]\7]\u06ca\n]\f]\16]\u06cd\13]\3]"+
		"\5]\u06d0\n]\3]\3]\5]\u06d4\n]\3]\5]\u06d7\n]\3]\3]\3]\3]\5]\u06dd\n]"+
		"\3]\5]\u06e0\n]\5]\u06e2\n]\3^\3^\3^\3^\3^\7^\u06e9\n^\f^\16^\u06ec\13"+
		"^\3_\3_\5_\u06f0\n_\3_\3_\5_\u06f4\n_\3_\3_\5_\u06f8\n_\3_\5_\u06fb\n"+
		"_\3`\3`\3`\3`\3`\3`\3`\7`\u0704\n`\f`\16`\u0707\13`\3`\3`\5`\u070b\n`"+
		"\3a\3a\5a\u070f\na\3a\3a\3a\7a\u0714\na\fa\16a\u0717\13a\3a\3a\3a\3a\7"+
		"a\u071d\na\fa\16a\u0720\13a\3a\5a\u0723\na\5a\u0725\na\3a\3a\5a\u0729"+
		"\na\3a\3a\3a\3a\3a\7a\u0730\na\fa\16a\u0733\13a\3a\3a\5a\u0737\na\5a\u0739"+
		"\na\3a\3a\3a\3a\3a\7a\u0740\na\fa\16a\u0743\13a\3a\3a\3a\3a\3a\3a\7a\u074b"+
		"\na\fa\16a\u074e\13a\3a\3a\7a\u0752\na\fa\16a\u0755\13a\5a\u0757\na\3"+
		"b\3b\3b\3b\3b\5b\u075e\nb\3c\3c\3c\3c\3c\7c\u0765\nc\fc\16c\u0768\13c"+
		"\3c\3c\5c\u076c\nc\3d\5d\u076f\nd\3d\3d\3e\3e\3f\3f\3g\3g\5g\u0779\ng"+
		"\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s"+
		"\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3x\2\3\20y\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\2\24\4\2\u009c\u009c"+
		"\u009f\u009f\4\2\16\16\23\24\3\2\17\20\3\2\25\30\3\2\31\34\6\2;=oo\u009d"+
		"\u009d\u009f\u00a0\4\2\u009d\u009d\u009f\u009f\4\2))CC\5\2AALLYY\4\2\66"+
		"\66II\4\2\f\fqq\3\2\u008a\u008b\4\2$$EE\7\2  OOXX\u0081\u0081\u0084\u0084"+
		"\4\2BB\u0092\u0092\5\2  OO\u0084\u0084\4\2\17\21mm\3\2 \u009b\u088b\2"+
		"\u00f0\3\2\2\2\4\u0109\3\2\2\2\6\u010b\3\2\2\2\b\u010e\3\2\2\2\n\u0118"+
		"\3\2\2\2\f\u011c\3\2\2\2\16\u0128\3\2\2\2\20\u0157\3\2\2\2\22\u017a\3"+
		"\2\2\2\24\u0183\3\2\2\2\26\u0185\3\2\2\2\30\u0187\3\2\2\2\32\u0189\3\2"+
		"\2\2\34\u019f\3\2\2\2\36\u01a3\3\2\2\2 \u01a8\3\2\2\2\"\u01aa\3\2\2\2"+
		"$\u01b7\3\2\2\2&\u01c4\3\2\2\2(\u01da\3\2\2\2*\u01dc\3\2\2\2,\u01e0\3"+
		"\2\2\2.\u01e4\3\2\2\2\60\u01e8\3\2\2\2\62\u01ec\3\2\2\2\64\u01f0\3\2\2"+
		"\2\66\u01f4\3\2\2\28\u01fa\3\2\2\2:\u0201\3\2\2\2<\u020e\3\2\2\2>\u021c"+
		"\3\2\2\2@\u0220\3\2\2\2B\u0224\3\2\2\2D\u0228\3\2\2\2F\u022d\3\2\2\2H"+
		"\u0231\3\2\2\2J\u0233\3\2\2\2L\u0235\3\2\2\2N\u0237\3\2\2\2P\u0239\3\2"+
		"\2\2R\u023b\3\2\2\2T\u023f\3\2\2\2V\u0245\3\2\2\2X\u024a\3\2\2\2Z\u0250"+
		"\3\2\2\2\\\u026a\3\2\2\2^\u028c\3\2\2\2`\u029e\3\2\2\2b\u02a7\3\2\2\2"+
		"d\u02af\3\2\2\2f\u02b9\3\2\2\2h\u02cc\3\2\2\2j\u02f0\3\2\2\2l\u0310\3"+
		"\2\2\2n\u0339\3\2\2\2p\u037e\3\2\2\2r\u0391\3\2\2\2t\u03af\3\2\2\2v\u03b9"+
		"\3\2\2\2x\u03d6\3\2\2\2z\u03dc\3\2\2\2|\u03e9\3\2\2\2~\u03f6\3\2\2\2\u0080"+
		"\u0403\3\2\2\2\u0082\u041c\3\2\2\2\u0084\u043c\3\2\2\2\u0086\u0486\3\2"+
		"\2\2\u0088\u0495\3\2\2\2\u008a\u04a2\3\2\2\2\u008c\u04a8\3\2\2\2\u008e"+
		"\u04b6\3\2\2\2\u0090\u04c5\3\2\2\2\u0092\u04e8\3\2\2\2\u0094\u0551\3\2"+
		"\2\2\u0096\u0554\3\2\2\2\u0098\u0577\3\2\2\2\u009a\u05ad\3\2\2\2\u009c"+
		"\u05af\3\2\2\2\u009e\u05ba\3\2\2\2\u00a0\u05cc\3\2\2\2\u00a2\u05f4\3\2"+
		"\2\2\u00a4\u05f6\3\2\2\2\u00a6\u0626\3\2\2\2\u00a8\u0630\3\2\2\2\u00aa"+
		"\u063a\3\2\2\2\u00ac\u0662\3\2\2\2\u00ae\u067a\3\2\2\2\u00b0\u0684\3\2"+
		"\2\2\u00b2\u068f\3\2\2\2\u00b4\u0691\3\2\2\2\u00b6\u06b0\3\2\2\2\u00b8"+
		"\u06e1\3\2\2\2\u00ba\u06e3\3\2\2\2\u00bc\u06fa\3\2\2\2\u00be\u070a\3\2"+
		"\2\2\u00c0\u0756\3\2\2\2\u00c2\u075d\3\2\2\2\u00c4\u075f\3\2\2\2\u00c6"+
		"\u076e\3\2\2\2\u00c8\u0772\3\2\2\2\u00ca\u0774\3\2\2\2\u00cc\u0778\3\2"+
		"\2\2\u00ce\u077a\3\2\2\2\u00d0\u077c\3\2\2\2\u00d2\u077e\3\2\2\2\u00d4"+
		"\u0780\3\2\2\2\u00d6\u0782\3\2\2\2\u00d8\u0784\3\2\2\2\u00da\u0786\3\2"+
		"\2\2\u00dc\u0788\3\2\2\2\u00de\u078a\3\2\2\2\u00e0\u078c\3\2\2\2\u00e2"+
		"\u078e\3\2\2\2\u00e4\u0790\3\2\2\2\u00e6\u0792\3\2\2\2\u00e8\u0794\3\2"+
		"\2\2\u00ea\u0796\3\2\2\2\u00ec\u0798\3\2\2\2\u00ee\u079a\3\2\2\2\u00f0"+
		"\u00f1\7\u0087\2\2\u00f1\u00f6\5\16\b\2\u00f2\u00f3\7\f\2\2\u00f3\u00f5"+
		"\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\7R\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fd\5\6\4\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\5\n\6\2\u00ff\u00fe\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5\b\5\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5\f"+
		"\7\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7\2\2\3\u0108\3\3\2\2\2\u0109\u010a\t\2\2\2\u010a\5\3\2\2\2\u010b"+
		"\u010c\7\u0099\2\2\u010c\u010d\5\36\20\2\u010d\7\3\2\2\2\u010e\u010f\7"+
		"t\2\2\u010f\u0110\7/\2\2\u0110\u0115\5R*\2\u0111\u0112\7\f\2\2\u0112\u0114"+
		"\5R*\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\t\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7U\2\2"+
		"\u0119\u011a\7/\2\2\u011a\u011b\7\u009c\2\2\u011b\13\3\2\2\2\u011c\u011d"+
		"\7i\2\2\u011d\u011e\7\u009d\2\2\u011e\r\3\2\2\2\u011f\u0124\5\20\t\2\u0120"+
		"\u0122\7(\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\5\30\r\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0129\3\2\2\2\u0126\u0129\5\34\17\2\u0127\u0129\5\32\16\2\u0128\u011f"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\17\3\2\2\2\u012a"+
		"\u012b\b\t\1\2\u012b\u0158\7\16\2\2\u012c\u0158\5\26\f\2\u012d\u0158\5"+
		"\22\n\2\u012e\u012f\5\u00d2j\2\u012f\u013c\7\n\2\2\u0130\u0132\7E\2\2"+
		"\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0138"+
		"\5\20\t\2\u0134\u0135\7\f\2\2\u0135\u0137\5\20\t\2\u0136\u0134\3\2\2\2"+
		"\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\16\2\2\u013c\u0131\3\2\2\2"+
		"\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\7\13\2\2\u013f\u0158\3\2\2\2\u0140\u0141\7\n\2\2\u0141\u0142\5\20\t\2"+
		"\u0142\u0143\7\13\2\2\u0143\u0158\3\2\2\2\u0144\u0146\7\61\2\2\u0145\u0147"+
		"\5\20\t\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014d\3\2\2\2"+
		"\u0148\u0149\7\u0098\2\2\u0149\u014a\5\20\t\2\u014a\u014b\7\u008c\2\2"+
		"\u014b\u014c\5\20\t\2\u014c\u014e\3\2\2\2\u014d\u0148\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u0152\7H\2\2\u0152\u0154\5\20\t\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7I\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u012a\3\2\2\2\u0157\u012c\3\2\2\2\u0157\u012d\3\2\2\2\u0157\u012e\3\2"+
		"\2\2\u0157\u0140\3\2\2\2\u0157\u0144\3\2\2\2\u0158\u0177\3\2\2\2\u0159"+
		"\u015a\f\n\2\2\u015a\u015b\t\3\2\2\u015b\u0176\5\20\t\13\u015c\u015d\f"+
		"\t\2\2\u015d\u015e\t\4\2\2\u015e\u0176\5\20\t\n\u015f\u0160\f\b\2\2\u0160"+
		"\u0161\t\5\2\2\u0161\u0176\5\20\t\t\u0162\u0163\f\7\2\2\u0163\u0164\t"+
		"\6\2\2\u0164\u0176\5\20\t\b\u0165\u0172\f\6\2\2\u0166\u0173\7\r\2\2\u0167"+
		"\u0173\7\35\2\2\u0168\u0173\7\36\2\2\u0169\u0173\7\37\2\2\u016a\u0173"+
		"\7c\2\2\u016b\u016c\7c\2\2\u016c\u0173\7m\2\2\u016d\u0173\7Z\2\2\u016e"+
		"\u0173\7h\2\2\u016f\u0173\7T\2\2\u0170\u0173\7j\2\2\u0171\u0173\7}\2\2"+
		"\u0172\u0166\3\2\2\2\u0172\u0167\3\2\2\2\u0172\u0168\3\2\2\2\u0172\u0169"+
		"\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u016d\3\2\2\2\u0172"+
		"\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\5\20\t\7\u0175\u0159\3\2\2\2\u0175"+
		"\u015c\3\2\2\2\u0175\u015f\3\2\2\2\u0175\u0162\3\2\2\2\u0175\u0165\3\2"+
		"\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\21\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5\24\13\2\u017b\23\3\2\2\2"+
		"\u017c\u0184\7\u009c\2\2\u017d\u0184\5\u00ceh\2\u017e\u0184\7\u009f\2"+
		"\2\u017f\u0180\7\n\2\2\u0180\u0181\5\24\13\2\u0181\u0182\7\13\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2"+
		"\2\2\u0183\u017f\3\2\2\2\u0184\25\3\2\2\2\u0185\u0186\t\7\2\2\u0186\27"+
		"\3\2\2\2\u0187\u0188\t\2\2\2\u0188\31\3\2\2\2\u0189\u018a\7\6\2\2\u018a"+
		"\u018b\7\n\2\2\u018b\u018c\7\u009d\2\2\u018c\u018d\7\13\2\2\u018d\33\3"+
		"\2\2\2\u018e\u018f\7\7\2\2\u018f\u0190\7\n\2\2\u0190\u0191\7E\2\2\u0191"+
		"\u0196\5\22\n\2\u0192\u0193\7\f\2\2\u0193\u0195\5\22\n\2\u0194\u0192\3"+
		"\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\13\2\2\u019a\u01a0\3"+
		"\2\2\2\u019b\u019c\7\7\2\2\u019c\u019d\7\n\2\2\u019d\u019e\7\16\2\2\u019e"+
		"\u01a0\7\13\2\2\u019f\u018e\3\2\2\2\u019f\u019b\3\2\2\2\u01a0\35\3\2\2"+
		"\2\u01a1\u01a4\5 \21\2\u01a2\u01a4\5(\25\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\37\3\2\2\2\u01a5\u01a9\5\"\22\2\u01a6\u01a9\5$\23\2\u01a7"+
		"\u01a9\5&\24\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2"+
		"\2\2\u01a9!\3\2\2\2\u01aa\u01ab\7\n\2\2\u01ab\u01ac\5\36\20\2\u01ac\u01ad"+
		"\7\'\2\2\u01ad\u01b2\5\36\20\2\u01ae\u01af\7\'\2\2\u01af\u01b1\5\36\20"+
		"\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\13\2\2"+
		"\u01b6#\3\2\2\2\u01b7\u01b8\7\n\2\2\u01b8\u01b9\5\36\20\2\u01b9\u01ba"+
		"\7s\2\2\u01ba\u01bf\5\36\20\2\u01bb\u01bc\7s\2\2\u01bc\u01be\5\36\20\2"+
		"\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\13\2\2"+
		"\u01c3%\3\2\2\2\u01c4\u01c5\7m\2\2\u01c5\u01c6\5\36\20\2\u01c6\'\3\2\2"+
		"\2\u01c7\u01db\5*\26\2\u01c8\u01db\5,\27\2\u01c9\u01db\5.\30\2\u01ca\u01db"+
		"\5\60\31\2\u01cb\u01db\5\62\32\2\u01cc\u01db\5\64\33\2\u01cd\u01db\5\66"+
		"\34\2\u01ce\u01db\58\35\2\u01cf\u01db\5:\36\2\u01d0\u01db\5<\37\2\u01d1"+
		"\u01db\5> \2\u01d2\u01db\5@!\2\u01d3\u01db\5B\"\2\u01d4\u01db\5D#\2\u01d5"+
		"\u01db\5F$\2\u01d6\u01d7\7\n\2\2\u01d7\u01d8\5(\25\2\u01d8\u01d9\7\13"+
		"\2\2\u01d9\u01db\3\2\2\2\u01da\u01c7\3\2\2\2\u01da\u01c8\3\2\2\2\u01da"+
		"\u01c9\3\2\2\2\u01da\u01ca\3\2\2\2\u01da\u01cb\3\2\2\2\u01da\u01cc\3\2"+
		"\2\2\u01da\u01cd\3\2\2\2\u01da\u01ce\3\2\2\2\u01da\u01cf\3\2\2\2\u01da"+
		"\u01d0\3\2\2\2\u01da\u01d1\3\2\2\2\u01da\u01d2\3\2\2\2\u01da\u01d3\3\2"+
		"\2\2\u01da\u01d4\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2\2\2\u01db"+
		")\3\2\2\2\u01dc\u01dd\5H%\2\u01dd\u01de\7\r\2\2\u01de\u01df\5P)\2\u01df"+
		"+\3\2\2\2\u01e0\u01e1\5H%\2\u01e1\u01e2\7\37\2\2\u01e2\u01e3\5P)\2\u01e3"+
		"-\3\2\2\2\u01e4\u01e5\5H%\2\u01e5\u01e6\7\32\2\2\u01e6\u01e7\5P)\2\u01e7"+
		"/\3\2\2\2\u01e8\u01e9\5H%\2\u01e9\u01ea\7\31\2\2\u01ea\u01eb\5P)\2\u01eb"+
		"\61\3\2\2\2\u01ec\u01ed\5H%\2\u01ed\u01ee\7\34\2\2\u01ee\u01ef\5P)\2\u01ef"+
		"\63\3\2\2\2\u01f0\u01f1\5H%\2\u01f1\u01f2\7\33\2\2\u01f2\u01f3\5P)\2\u01f3"+
		"\65\3\2\2\2\u01f4\u01f5\5H%\2\u01f5\u01f6\7.\2\2\u01f6\u01f7\5P)\2\u01f7"+
		"\u01f8\7\'\2\2\u01f8\u01f9\5P)\2\u01f9\67\3\2\2\2\u01fa\u01fb\5H%\2\u01fb"+
		"\u01fc\7m\2\2\u01fc\u01fd\7.\2\2\u01fd\u01fe\5P)\2\u01fe\u01ff\7\'\2\2"+
		"\u01ff\u0200\5P)\2\u02009\3\2\2\2\u0201\u0202\5H%\2\u0202\u0203\7Z\2\2"+
		"\u0203\u0204\7\n\2\2\u0204\u0209\5P)\2\u0205\u0206\7\f\2\2\u0206\u0208"+
		"\5P)\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\13"+
		"\2\2\u020d;\3\2\2\2\u020e\u020f\5H%\2\u020f\u0210\7m\2\2\u0210\u0211\7"+
		"Z\2\2\u0211\u0212\7\n\2\2\u0212\u0217\5P)\2\u0213\u0214\7\f\2\2\u0214"+
		"\u0216\5P)\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b"+
		"\7\13\2\2\u021b=\3\2\2\2\u021c\u021d\5H%\2\u021d\u021e\7h\2\2\u021e\u021f"+
		"\5J&\2\u021f?\3\2\2\2\u0220\u0221\5H%\2\u0221\u0222\7h\2\2\u0222\u0223"+
		"\5L\'\2\u0223A\3\2\2\2\u0224\u0225\5H%\2\u0225\u0226\7h\2\2\u0226\u0227"+
		"\5N(\2\u0227C\3\2\2\2\u0228\u0229\5H%\2\u0229\u022a\7c\2\2\u022a\u022b"+
		"\7m\2\2\u022b\u022c\7o\2\2\u022cE\3\2\2\2\u022d\u022e\5H%\2\u022e\u022f"+
		"\7c\2\2\u022f\u0230\7o\2\2\u0230G\3\2\2\2\u0231\u0232\t\2\2\2\u0232I\3"+
		"\2\2\2\u0233\u0234\7\3\2\2\u0234K\3\2\2\2\u0235\u0236\7\4\2\2\u0236M\3"+
		"\2\2\2\u0237\u0238\7\5\2\2\u0238O\3\2\2\2\u0239\u023a\t\b\2\2\u023aQ\3"+
		"\2\2\2\u023b\u023d\5H%\2\u023c\u023e\5T+\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023eS\3\2\2\2\u023f\u0240\t\t\2\2\u0240U\3\2\2\2\u0241\u0244"+
		"\5Z.\2\u0242\u0244\5X-\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2"+
		"\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\2\2\3\u0249W\3\2\2\2\u024a\u024b"+
		"\7\u00a4\2\2\u024b\u024c\b-\1\2\u024cY\3\2\2\2\u024d\u024f\7\b\2\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u025c\5\\/\2\u0254"+
		"\u0256\7\b\2\2\u0255\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\5\\/\2\u025a"+
		"\u0255\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u0262\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261\7\b\2\2\u0260"+
		"\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263[\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0268\7N\2\2\u0266\u0267"+
		"\7y\2\2\u0267\u0269\7v\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u028a\3\2"+
		"\2\2\u026c\u028b\5^\60\2\u026d\u028b\5`\61\2\u026e\u028b\5b\62\2\u026f"+
		"\u028b\5d\63\2\u0270\u028b\5f\64\2\u0271\u028b\5h\65\2\u0272\u028b\5j"+
		"\66\2\u0273\u028b\5l\67\2\u0274\u028b\5n8\2\u0275\u028b\5p9\2\u0276\u028b"+
		"\5r:\2\u0277\u028b\5t;\2\u0278\u028b\5v<\2\u0279\u028b\5x=\2\u027a\u028b"+
		"\5z>\2\u027b\u028b\5|?\2\u027c\u028b\5~@\2\u027d\u028b\5\u0080A\2\u027e"+
		"\u028b\5\u0082B\2\u027f\u028b\5\u0084C\2\u0280\u028b\5\u0086D\2\u0281"+
		"\u028b\5\u0088E\2\u0282\u028b\5\u008aF\2\u0283\u028b\5\u008cG\2\u0284"+
		"\u028b\5\u008eH\2\u0285\u028b\5\u0090I\2\u0286\u028b\5\u0092J\2\u0287"+
		"\u028b\5\u0096L\2\u0288\u028b\5\u0098M\2\u0289\u028b\5\u009aN\2\u028a"+
		"\u026c\3\2\2\2\u028a\u026d\3\2\2\2\u028a\u026e\3\2\2\2\u028a\u026f\3\2"+
		"\2\2\u028a\u0270\3\2\2\2\u028a\u0271\3\2\2\2\u028a\u0272\3\2\2\2\u028a"+
		"\u0273\3\2\2\2\u028a\u0274\3\2\2\2\u028a\u0275\3\2\2\2\u028a\u0276\3\2"+
		"\2\2\u028a\u0277\3\2\2\2\u028a\u0278\3\2\2\2\u028a\u0279\3\2\2\2\u028a"+
		"\u027a\3\2\2\2\u028a\u027b\3\2\2\2\u028a\u027c\3\2\2\2\u028a\u027d\3\2"+
		"\2\2\u028a\u027e\3\2\2\2\u028a\u027f\3\2\2\2\u028a\u0280\3\2\2\2\u028a"+
		"\u0281\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u0283\3\2\2\2\u028a\u0284\3\2"+
		"\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028b]\3\2\2\2\u028c\u028d\7%\2\2\u028d"+
		"\u0291\7\u0089\2\2\u028e\u028f\5\u00d4k\2\u028f\u0290\7\t\2\2\u0290\u0292"+
		"\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u029c\5\u00d6l\2\u0294\u0295\7\u0080\2\2\u0295\u0296\7\u008d\2\2\u0296"+
		"\u029d\5\u00dan\2\u0297\u0299\7\"\2\2\u0298\u029a\7\65\2\2\u0299\u0298"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\5\u009cO"+
		"\2\u029c\u0294\3\2\2\2\u029c\u0297\3\2\2\2\u029d_\3\2\2\2\u029e\u02a5"+
		"\7&\2\2\u029f\u02a6\5\u00d4k\2\u02a0\u02a6\5\u00d8m\2\u02a1\u02a2\5\u00d4"+
		"k\2\u02a2\u02a3\7\t\2\2\u02a3\u02a4\5\u00d8m\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u029f\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6a\3\2\2\2\u02a7\u02a9\7*\2\2\u02a8\u02aa\7>\2\2\u02a9\u02a8"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\5\20\t\2"+
		"\u02ac\u02ad\7(\2\2\u02ad\u02ae\5\u00d4k\2\u02aec\3\2\2\2\u02af\u02b1"+
		"\7-\2\2\u02b0\u02b2\t\n\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b7\3\2\2\2\u02b3\u02b5\7\u008e\2\2\u02b4\u02b6\5\u00eex\2\u02b5\u02b4"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8e\3\2\2\2\u02b9\u02be\t\13\2\2\u02ba\u02bc\7\u008e"+
		"\2\2\u02bb\u02bd\5\u00eex\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u02ba\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfg\3\2\2\2"+
		"\u02c0\u02c2\7\u009a\2\2\u02c1\u02c3\7{\2\2\u02c2\u02c1\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c9\5\u00b4[\2\u02c5\u02c6"+
		"\7\f\2\2\u02c6\u02c8\5\u00b4[\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2"+
		"\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cc\u02c0\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d8\5\u00c0a\2\u02cf\u02d1\7\u0090\2\2\u02d0\u02d2\7$\2\2\u02d1\u02d0"+
		"\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d6\3\2\2\2\u02d3\u02d6\7a\2\2\u02d4"+
		"\u02d6\7K\2\2\u02d5\u02cf\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\5\u00c0a\2\u02d8\u02d5\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02e6\3\2"+
		"\2\2\u02dc\u02dd\7t\2\2\u02dd\u02de\7/\2\2\u02de\u02e3\5\u00b0Y\2\u02df"+
		"\u02e0\7\f\2\2\u02e0\u02e2\5\u00b0Y\2\u02e1\u02df\3\2\2\2\u02e2\u02e5"+
		"\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e6\u02dc\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ee\3\2"+
		"\2\2\u02e8\u02e9\7i\2\2\u02e9\u02ec\5\20\t\2\u02ea\u02eb\t\f\2\2\u02eb"+
		"\u02ed\5\20\t\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3"+
		"\2\2\2\u02ee\u02e8\3\2\2\2\u02ee\u02ef\3\2\2\2\u02efi\3\2\2\2\u02f0\u02f2"+
		"\79\2\2\u02f1\u02f3\7\u0091\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2"+
		"\2\u02f3\u02f4\3\2\2\2\u02f4\u02f8\7[\2\2\u02f5\u02f6\7W\2\2\u02f6\u02f7"+
		"\7m\2\2\u02f7\u02f9\7M\2\2\u02f8\u02f5\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fd\3\2\2\2\u02fa\u02fb\5\u00d4k\2\u02fb\u02fc\7\t\2\2\u02fc\u02fe"+
		"\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\5\u00e0q\2\u0300\u0301\7r\2\2\u0301\u0302\5\u00d6l\2\u0302\u0303"+
		"\7\n\2\2\u0303\u0308\5\u00a8U\2\u0304\u0305\7\f\2\2\u0305\u0307\5\u00a8"+
		"U\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030e\7\13"+
		"\2\2\u030c\u030d\7\u0099\2\2\u030d\u030f\5\20\t\2\u030e\u030c\3\2\2\2"+
		"\u030e\u030f\3\2\2\2\u030fk\3\2\2\2\u0310\u0312\79\2\2\u0311\u0313\t\r"+
		"\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0318\7\u0089\2\2\u0315\u0316\7W\2\2\u0316\u0317\7m\2\2\u0317\u0319\7"+
		"M\2\2\u0318\u0315\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031d\3\2\2\2\u031a"+
		"\u031b\5\u00d4k\2\u031b\u031c\7\t\2\2\u031c\u031e\3\2\2\2\u031d\u031a"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0337\5\u00d6l"+
		"\2\u0320\u0321\7\n\2\2\u0321\u0326\5\u009cO\2\u0322\u0323\7\f\2\2\u0323"+
		"\u0325\5\u009cO\2\u0324\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032d\3\2\2\2\u0328\u0326\3\2\2\2\u0329"+
		"\u032a\7\f\2\2\u032a\u032c\5\u00aaV\2\u032b\u0329\3\2\2\2\u032c\u032f"+
		"\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0333\7\13\2\2\u0331\u0332\7\u009b\2\2\u0332\u0334"+
		"\7\u009c\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0338\3\2\2"+
		"\2\u0335\u0336\7(\2\2\u0336\u0338\5\u0092J\2\u0337\u0320\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0338m\3\2\2\2\u0339\u033b\79\2\2\u033a\u033c\t\r\2\2\u033b"+
		"\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0341\7\u008f"+
		"\2\2\u033e\u033f\7W\2\2\u033f\u0340\7m\2\2\u0340\u0342\7M\2\2\u0341\u033e"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0346\3\2\2\2\u0343\u0344\5\u00d4k"+
		"\2\u0344\u0345\7\t\2\2\u0345\u0347\3\2\2\2\u0346\u0343\3\2\2\2\u0346\u0347"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034d\5\u00e2r\2\u0349\u034e\7,\2\2"+
		"\u034a\u034e\7#\2\2\u034b\u034c\7`\2\2\u034c\u034e\7p\2\2\u034d\u0349"+
		"\3\2\2\2\u034d\u034a\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u035d\3\2\2\2\u034f\u035e\7B\2\2\u0350\u035e\7_\2\2\u0351\u035b\7\u0092"+
		"\2\2\u0352\u0353\7p\2\2\u0353\u0358\5\22\n\2\u0354\u0355\7\f\2\2\u0355"+
		"\u0357\5\22\n\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3"+
		"\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u0352\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u034f\3\2"+
		"\2\2\u035d\u0350\3\2\2\2\u035d\u0351\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0363\7r\2\2\u0360\u0361\5\u00d4k\2\u0361\u0362\7\t\2\2\u0362\u0364\3"+
		"\2\2\2\u0363\u0360\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0369\5\u00d6l\2\u0366\u0367\7P\2\2\u0367\u0368\7G\2\2\u0368\u036a\7"+
		"\u0085\2\2\u0369\u0366\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036d\3\2\2\2"+
		"\u036b\u036c\7\u0098\2\2\u036c\u036e\5\20\t\2\u036d\u036b\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0378\7-\2\2\u0370\u0375\5\u0096"+
		"L\2\u0371\u0375\5\u0084C\2\u0372\u0375\5t;\2\u0373\u0375\5\u0092J\2\u0374"+
		"\u0370\3\2\2\2\u0374\u0371\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7\b\2\2\u0377\u0379\3\2\2\2\u0378"+
		"\u0374\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u037d\7I\2\2\u037do\3\2\2\2\u037e\u0380"+
		"\79\2\2\u037f\u0381\t\r\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u0386\7\u0096\2\2\u0383\u0384\7W\2\2\u0384\u0385"+
		"\7m\2\2\u0385\u0387\7M\2\2\u0386\u0383\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u038b\3\2\2\2\u0388\u0389\5\u00d4k\2\u0389\u038a\7\t\2\2\u038a\u038c"+
		"\3\2\2\2\u038b\u0388\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u038e\5\u00e4s\2\u038e\u038f\7(\2\2\u038f\u0390\5\u0092J\2\u0390q\3\2"+
		"\2\2\u0391\u0392\79\2\2\u0392\u0393\7\u0097\2\2\u0393\u0397\7\u0089\2"+
		"\2\u0394\u0395\7W\2\2\u0395\u0396\7m\2\2\u0396\u0398\7M\2\2\u0397\u0394"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039c\3\2\2\2\u0399\u039a\5\u00d4k"+
		"\2\u039a\u039b\7\t\2\2\u039b\u039d\3\2\2\2\u039c\u0399\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\5\u00d6l\2\u039f\u03a0\7\u0093"+
		"\2\2\u03a0\u03ac\5\u00e6t\2\u03a1\u03a2\7\n\2\2\u03a2\u03a7\5\u00ccg\2"+
		"\u03a3\u03a4\7\f\2\2\u03a4\u03a6\5\u00ccg\2\u03a5\u03a3\3\2\2\2\u03a6"+
		"\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7\13\2\2\u03ab\u03ad\3\2\2\2\u03ac"+
		"\u03a1\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ads\3\2\2\2\u03ae\u03b0\5\u00ac"+
		"W\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03b2\7B\2\2\u03b2\u03b3\7R\2\2\u03b3\u03b6\5\u00aeX\2\u03b4\u03b5\7"+
		"\u0099\2\2\u03b5\u03b7\5\20\t\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7u\3\2\2\2\u03b8\u03ba\5\u00acW\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7B\2\2\u03bc\u03bd\7R\2\2\u03bd"+
		"\u03c0\5\u00aeX\2\u03be\u03bf\7\u0099\2\2\u03bf\u03c1\5\20\t\2\u03c0\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03d4\3\2\2\2\u03c2\u03c3\7t\2\2\u03c3"+
		"\u03c4\7/\2\2\u03c4\u03c9\5\u00b0Y\2\u03c5\u03c6\7\f\2\2\u03c6\u03c8\5"+
		"\u00b0Y\2\u03c7\u03c5\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2"+
		"\u03c9\u03ca\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03c2"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\7i\2\2\u03cf"+
		"\u03d2\5\20\t\2\u03d0\u03d1\t\f\2\2\u03d1\u03d3\5\20\t\2\u03d2\u03d0\3"+
		"\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03cc\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5w\3\2\2\2\u03d6\u03d8\7D\2\2\u03d7\u03d9\7>\2\2\u03d8"+
		"\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\5\u00d4"+
		"k\2\u03dby\3\2\2\2\u03dc\u03dd\7F\2\2\u03dd\u03e0\7[\2\2\u03de\u03df\7"+
		"W\2\2\u03df\u03e1\7M\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e5\3\2\2\2\u03e2\u03e3\5\u00d4k\2\u03e3\u03e4\7\t\2\2\u03e4\u03e6"+
		"\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e8\5\u00e0q\2\u03e8{\3\2\2\2\u03e9\u03ea\7F\2\2\u03ea\u03ed\7\u0089"+
		"\2\2\u03eb\u03ec\7W\2\2\u03ec\u03ee\7M\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee"+
		"\3\2\2\2\u03ee\u03f2\3\2\2\2\u03ef\u03f0\5\u00d4k\2\u03f0\u03f1\7\t\2"+
		"\2\u03f1\u03f3\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4"+
		"\3\2\2\2\u03f4\u03f5\5\u00d6l\2\u03f5}\3\2\2\2\u03f6\u03f7\7F\2\2\u03f7"+
		"\u03fa\7\u008f\2\2\u03f8\u03f9\7W\2\2\u03f9\u03fb\7M\2\2\u03fa\u03f8\3"+
		"\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03ff\3\2\2\2\u03fc\u03fd\5\u00d4k\2"+
		"\u03fd\u03fe\7\t\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fc\3\2\2\2\u03ff\u0400"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\5\u00e2r\2\u0402\177\3\2\2\2"+
		"\u0403\u0404\7F\2\2\u0404\u0407\7\u0096\2\2\u0405\u0406\7W\2\2\u0406\u0408"+
		"\7M\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040c\3\2\2\2\u0409"+
		"\u040a\5\u00d4k\2\u040a\u040b\7\t\2\2\u040b\u040d\3\2\2\2\u040c\u0409"+
		"\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\5\u00e4s"+
		"\2\u040f\u0081\3\2\2\2\u0410\u0412\7\u009a\2\2\u0411\u0413\7{\2\2\u0412"+
		"\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0419\5\u00b4"+
		"[\2\u0415\u0416\7\f\2\2\u0416\u0418\5\u00b4[\2\u0417\u0415\3\2\2\2\u0418"+
		"\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041d\3\2"+
		"\2\2\u041b\u0419\3\2\2\2\u041c\u0410\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u0424\5\u00c0a\2\u041f\u0420\5\u00c2b\2\u0420\u0421"+
		"\5\u00c0a\2\u0421\u0423\3\2\2\2\u0422\u041f\3\2\2\2\u0423\u0426\3\2\2"+
		"\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0431\3\2\2\2\u0426\u0424"+
		"\3\2\2\2\u0427\u0428\7t\2\2\u0428\u0429\7/\2\2\u0429\u042e\5\u00b0Y\2"+
		"\u042a\u042b\7\f\2\2\u042b\u042d\5\u00b0Y\2\u042c\u042a\3\2\2\2\u042d"+
		"\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0432\3\2"+
		"\2\2\u0430\u042e\3\2\2\2\u0431\u0427\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0439\3\2\2\2\u0433\u0434\7i\2\2\u0434\u0437\5\20\t\2\u0435\u0436\t\f"+
		"\2\2\u0436\u0438\5\20\t\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u043a\3\2\2\2\u0439\u0433\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0083\3\2"+
		"\2\2\u043b\u043d\5\u00acW\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u044f\3\2\2\2\u043e\u0450\7_\2\2\u043f\u0450\7\u0081\2\2\u0440\u0441"+
		"\7_\2\2\u0441\u0442\7s\2\2\u0442\u0450\7\u0081\2\2\u0443\u0444\7_\2\2"+
		"\u0444\u0445\7s\2\2\u0445\u0450\7\u0084\2\2\u0446\u0447\7_\2\2\u0447\u0448"+
		"\7s\2\2\u0448\u0450\7 \2\2\u0449\u044a\7_\2\2\u044a\u044b\7s\2\2\u044b"+
		"\u0450\7O\2\2\u044c\u044d\7_\2\2\u044d\u044e\7s\2\2\u044e\u0450\7X\2\2"+
		"\u044f\u043e\3\2\2\2\u044f\u043f\3\2\2\2\u044f\u0440\3\2\2\2\u044f\u0443"+
		"\3\2\2\2\u044f\u0446\3\2\2\2\u044f\u0449\3\2\2\2\u044f\u044c\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u0455\7b\2\2\u0452\u0453\5\u00d4k\2\u0453\u0454\7"+
		"\t\2\2\u0454\u0456\3\2\2\2\u0455\u0452\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0463\5\u00d6l\2\u0458\u0459\7\n\2\2\u0459\u045e"+
		"\5\22\n\2\u045a\u045b\7\f\2\2\u045b\u045d\5\22\n\2\u045c\u045a\3\2\2\2"+
		"\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461"+
		"\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7\13\2\2\u0462\u0464\3\2\2\2"+
		"\u0463\u0458\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0484\3\2\2\2\u0465\u0466"+
		"\7\u0095\2\2\u0466\u0467\7\n\2\2\u0467\u046c\5\20\t\2\u0468\u0469\7\f"+
		"\2\2\u0469\u046b\5\20\t\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u046c\3\2"+
		"\2\2\u046f\u047e\7\13\2\2\u0470\u0471\7\f\2\2\u0471\u0472\7\n\2\2\u0472"+
		"\u0477\5\20\t\2\u0473\u0474\7\f\2\2\u0474\u0476\5\20\t\2\u0475\u0473\3"+
		"\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047a\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b\7\13\2\2\u047b\u047d\3"+
		"\2\2\2\u047c\u0470\3\2\2\2\u047d\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e"+
		"\u047f\3\2\2\2\u047f\u0485\3\2\2\2\u0480\u047e\3\2\2\2\u0481\u0485\5\u0092"+
		"J\2\u0482\u0483\7?\2\2\u0483\u0485\7\u0095\2\2\u0484\u0465\3\2\2\2\u0484"+
		"\u0481\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0085\3\2\2\2\u0486\u048a\7w"+
		"\2\2\u0487\u0488\5\u00d4k\2\u0488\u0489\7\t\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0487\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u0493\5\u00e8"+
		"u\2\u048d\u048e\7\r\2\2\u048e\u0494\5\u00b2Z\2\u048f\u0490\7\n\2\2\u0490"+
		"\u0491\5\u00b2Z\2\u0491\u0492\7\13\2\2\u0492\u0494\3\2\2\2\u0493\u048d"+
		"\3\2\2\2\u0493\u048f\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0087\3\2\2\2\u0495"+
		"\u04a0\7~\2\2\u0496\u04a1\5\u00dco\2\u0497\u0498\5\u00d4k\2\u0498\u0499"+
		"\7\t\2\2\u0499\u049b\3\2\2\2\u049a\u0497\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049e\3\2\2\2\u049c\u049f\5\u00d6l\2\u049d\u049f\5\u00e0q\2\u049e\u049c"+
		"\3\2\2\2\u049e\u049d\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u0496\3\2\2\2\u04a0"+
		"\u049a\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u0089\3\2\2\2\u04a2\u04a4\7\177"+
		"\2\2\u04a3\u04a5\7\u0086\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\5\u00eav\2\u04a7\u008b\3\2\2\2\u04a8\u04ad"+
		"\7\u0084\2\2\u04a9\u04ab\7\u008e\2\2\u04aa\u04ac\5\u00eex\2\u04ab\u04aa"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04a9\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04b4\3\2\2\2\u04af\u04b1\7\u008d\2\2\u04b0\u04b2"+
		"\7\u0086\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2"+
		"\2\u04b3\u04b5\5\u00eav\2\u04b4\u04af\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u008d\3\2\2\2\u04b6\u04b7\7\u0086\2\2\u04b7\u04b8\5\u00eav\2\u04b8\u008f"+
		"\3\2\2\2\u04b9\u04bb\7\u009a\2\2\u04ba\u04bc\7{\2\2\u04bb\u04ba\3\2\2"+
		"\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c2\5\u00b4[\2\u04be"+
		"\u04bf\7\f\2\2\u04bf\u04c1\5\u00b4[\2\u04c0\u04be\3\2\2\2\u04c1\u04c4"+
		"\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4"+
		"\u04c2\3\2\2\2\u04c5\u04b9\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04d2\5\u00c0a\2\u04c8\u04c9\7t\2\2\u04c9\u04ca\7/\2\2\u04ca"+
		"\u04cf\5\u00b0Y\2\u04cb\u04cc\7\f\2\2\u04cc\u04ce\5\u00b0Y\2\u04cd\u04cb"+
		"\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04c8\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04da\3\2\2\2\u04d4\u04d5\7i\2\2\u04d5\u04d8\5\20\t\2\u04d6"+
		"\u04d7\t\f\2\2\u04d7\u04d9\5\20\t\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3"+
		"\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04d4\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u0091\3\2\2\2\u04dc\u04de\7\u009a\2\2\u04dd\u04df\7{\2\2\u04de\u04dd"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e5\5\u00b4["+
		"\2\u04e1\u04e2\7\f\2\2\u04e2\u04e4\5\u00b4[\2\u04e3\u04e1\3\2\2\2\u04e4"+
		"\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e9\3\2"+
		"\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04dc\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04f0\5\u0094K\2\u04eb\u04ec\5\u00c2b\2\u04ec\u04ed"+
		"\5\u0094K\2\u04ed\u04ef\3\2\2\2\u04ee\u04eb\3\2\2\2\u04ef\u04f2\3\2\2"+
		"\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04fd\3\2\2\2\u04f2\u04f0"+
		"\3\2\2\2\u04f3\u04f4\7t\2\2\u04f4\u04f5\7/\2\2\u04f5\u04fa\5\u00b0Y\2"+
		"\u04f6\u04f7\7\f\2\2\u04f7\u04f9\5\u00b0Y\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fe\3\2"+
		"\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04f3\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0505\3\2\2\2\u04ff\u0500\7i\2\2\u0500\u0503\5\20\t\2\u0501\u0502\t\f"+
		"\2\2\u0502\u0504\5\20\t\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0506\3\2\2\2\u0505\u04ff\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0093\3\2"+
		"\2\2\u0507\u0509\7\u0087\2\2\u0508\u050a\t\16\2\2\u0509\u0508\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0510\5\u00b6\\\2\u050c"+
		"\u050d\7\f\2\2\u050d\u050f\5\u00b6\\\2\u050e\u050c\3\2\2\2\u050f\u0512"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u051f\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u051d\7R\2\2\u0514\u0519\5\u00b8]\2\u0515\u0516\7"+
		"\f\2\2\u0516\u0518\5\u00b8]\2\u0517\u0515\3\2\2\2\u0518\u051b\3\2\2\2"+
		"\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051e\3\2\2\2\u051b\u0519"+
		"\3\2\2\2\u051c\u051e\5\u00ba^\2\u051d\u0514\3\2\2\2\u051d\u051c\3\2\2"+
		"\2\u051e\u0520\3\2\2\2\u051f\u0513\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0523"+
		"\3\2\2\2\u0521\u0522\7\u0099\2\2\u0522\u0524\5\20\t\2\u0523\u0521\3\2"+
		"\2\2\u0523\u0524\3\2\2\2\u0524\u0533\3\2\2\2\u0525\u0526\7U\2\2\u0526"+
		"\u0527\7/\2\2\u0527\u052c\5\20\t\2\u0528\u0529\7\f\2\2\u0529\u052b\5\20"+
		"\t\2\u052a\u0528\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052a\3\2\2\2\u052c"+
		"\u052d\3\2\2\2\u052d\u0531\3\2\2\2\u052e\u052c\3\2\2\2\u052f\u0530\7V"+
		"\2\2\u0530\u0532\5\20\t\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0534\3\2\2\2\u0533\u0525\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0552\3\2"+
		"\2\2\u0535\u0536\7\u0095\2\2\u0536\u0537\7\n\2\2\u0537\u053c\5\20\t\2"+
		"\u0538\u0539\7\f\2\2\u0539\u053b\5\20\t\2\u053a\u0538\3\2\2\2\u053b\u053e"+
		"\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053f\u054e\7\13\2\2\u0540\u0541\7\f\2\2\u0541\u0542\7"+
		"\n\2\2\u0542\u0547\5\20\t\2\u0543\u0544\7\f\2\2\u0544\u0546\5\20\t\2\u0545"+
		"\u0543\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2"+
		"\2\2\u0548\u054a\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054b\7\13\2\2\u054b"+
		"\u054d\3\2\2\2\u054c\u0540\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2"+
		"\2\2\u054e\u054f\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551"+
		"\u0507\3\2\2\2\u0551\u0535\3\2\2\2\u0552\u0095\3\2\2\2\u0553\u0555\5\u00ac"+
		"W\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0561\7\u0092\2\2\u0557\u0558\7s\2\2\u0558\u0562\7\u0084\2\2\u0559\u055a"+
		"\7s\2\2\u055a\u0562\7 \2\2\u055b\u055c\7s\2\2\u055c\u0562\7\u0081\2\2"+
		"\u055d\u055e\7s\2\2\u055e\u0562\7O\2\2\u055f\u0560\7s\2\2\u0560\u0562"+
		"\7X\2\2\u0561\u0557\3\2\2\2\u0561\u0559\3\2\2\2\u0561\u055b\3\2\2\2\u0561"+
		"\u055d\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0564\5\u00aeX\2\u0564\u0565\7\u0088\2\2\u0565\u0566\5\22\n"+
		"\2\u0566\u0567\7\r\2\2\u0567\u056f\5\20\t\2\u0568\u0569\7\f\2\2\u0569"+
		"\u056a\5\22\n\2\u056a\u056b\7\r\2\2\u056b\u056c\5\20\t\2\u056c\u056e\3"+
		"\2\2\2\u056d\u0568\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0574\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0573\7\u0099"+
		"\2\2\u0573\u0575\5\20\t\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0097\3\2\2\2\u0576\u0578\5\u00acW\2\u0577\u0576\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u0584\7\u0092\2\2\u057a\u057b\7s\2"+
		"\2\u057b\u0585\7\u0084\2\2\u057c\u057d\7s\2\2\u057d\u0585\7 \2\2\u057e"+
		"\u057f\7s\2\2\u057f\u0585\7\u0081\2\2\u0580\u0581\7s\2\2\u0581\u0585\7"+
		"O\2\2\u0582\u0583\7s\2\2\u0583\u0585\7X\2\2\u0584\u057a\3\2\2\2\u0584"+
		"\u057c\3\2\2\2\u0584\u057e\3\2\2\2\u0584\u0580\3\2\2\2\u0584\u0582\3\2"+
		"\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\5\u00aeX\2\u0587"+
		"\u0588\7\u0088\2\2\u0588\u0589\5\22\n\2\u0589\u058a\7\r\2\2\u058a\u0592"+
		"\5\20\t\2\u058b\u058c\7\f\2\2\u058c\u058d\5\22\n\2\u058d\u058e\7\r\2\2"+
		"\u058e\u058f\5\20\t\2\u058f\u0591\3\2\2\2\u0590\u058b\3\2\2\2\u0591\u0594"+
		"\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0597\3\2\2\2\u0594"+
		"\u0592\3\2\2\2\u0595\u0596\7\u0099\2\2\u0596\u0598\5\20\t\2\u0597\u0595"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u05ab\3\2\2\2\u0599\u059a\7t\2\2\u059a"+
		"\u059b\7/\2\2\u059b\u05a0\5\u00b0Y\2\u059c\u059d\7\f\2\2\u059d\u059f\5"+
		"\u00b0Y\2\u059e\u059c\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2"+
		"\u05a0\u05a1\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u0599"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\7i\2\2\u05a6"+
		"\u05a9\5\20\t\2\u05a7\u05a8\t\f\2\2\u05a8\u05aa\5\20\t\2\u05a9\u05a7\3"+
		"\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a3\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u0099\3\2\2\2\u05ad\u05ae\7\u0094\2\2\u05ae\u009b"+
		"\3\2\2\2\u05af\u05b1\5\22\n\2\u05b0\u05b2\5\u009eP\2\u05b1\u05b0\3\2\2"+
		"\2\u05b1\u05b2\3\2\2\2\u05b2\u05b6\3\2\2\2\u05b3\u05b5\5\u00a0Q\2\u05b4"+
		"\u05b3\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2"+
		"\2\2\u05b7\u009d\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05bb\5\u00d0i\2\u05ba"+
		"\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2"+
		"\2\2\u05bd\u05c8\3\2\2\2\u05be\u05bf\7\n\2\2\u05bf\u05c0\5\u00c6d\2\u05c0"+
		"\u05c1\7\13\2\2\u05c1\u05c9\3\2\2\2\u05c2\u05c3\7\n\2\2\u05c3\u05c4\5"+
		"\u00c6d\2\u05c4\u05c5\7\f\2\2\u05c5\u05c6\5\u00c6d\2\u05c6\u05c7\7\13"+
		"\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05be\3\2\2\2\u05c8\u05c2\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u009f\3\2\2\2\u05ca\u05cb\78\2\2\u05cb\u05cd\5\u00d0"+
		"i\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ef\3\2\2\2\u05ce"+
		"\u05cf\7x\2\2\u05cf\u05d1\7f\2\2\u05d0\u05d2\t\t\2\2\u05d1\u05d0\3\2\2"+
		"\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d5\5\u00a2R\2\u05d4"+
		"\u05d6\7+\2\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05f0\3\2"+
		"\2\2\u05d7\u05d9\7m\2\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u05db\7o\2\2\u05db\u05f0\5\u00a2R\2\u05dc\u05dd\7"+
		"\u0091\2\2\u05dd\u05f0\5\u00a2R\2\u05de\u05df\7\63\2\2\u05df\u05e0\7\n"+
		"\2\2\u05e0\u05e1\5\20\t\2\u05e1\u05e2\7\13\2\2\u05e2\u05f0\3\2\2\2\u05e3"+
		"\u05ea\7?\2\2\u05e4\u05eb\5\u00c6d\2\u05e5\u05eb\5\26\f\2\u05e6\u05e7"+
		"\7\n\2\2\u05e7\u05e8\5\20\t\2\u05e8\u05e9\7\13\2\2\u05e9\u05eb\3\2\2\2"+
		"\u05ea\u05e4\3\2\2\2\u05ea\u05e5\3\2\2\2\u05ea\u05e6\3\2\2\2\u05eb\u05f0"+
		"\3\2\2\2\u05ec\u05ed\7\64\2\2\u05ed\u05f0\5\u00dco\2\u05ee\u05f0\5\u00a4"+
		"S\2\u05ef\u05ce\3\2\2\2\u05ef\u05d8\3\2\2\2\u05ef\u05dc\3\2\2\2\u05ef"+
		"\u05de\3\2\2\2\u05ef\u05e3\3\2\2\2\u05ef\u05ec\3\2\2\2\u05ef\u05ee\3\2"+
		"\2\2\u05f0\u00a1\3\2\2\2\u05f1\u05f2\7r\2\2\u05f2\u05f3\7\67\2\2\u05f3"+
		"\u05f5\t\17\2\2\u05f4\u05f1\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u00a3\3"+
		"\2\2\2\u05f6\u05f7\7|\2\2\u05f7\u0603\5\u00dep\2\u05f8\u05f9\7\n\2\2\u05f9"+
		"\u05fe\5\22\n\2\u05fa\u05fb\7\f\2\2\u05fb\u05fd\5\22\n\2\u05fc\u05fa\3"+
		"\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0601\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0602\7\13\2\2\u0602\u0604\3"+
		"\2\2\2\u0603\u05f8\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0617\3\2\2\2\u0605"+
		"\u0606\7r\2\2\u0606\u060f\t\20\2\2\u0607\u0608\7\u0088\2\2\u0608\u0610"+
		"\7o\2\2\u0609\u060a\7\u0088\2\2\u060a\u0610\7?\2\2\u060b\u0610\7\60\2"+
		"\2\u060c\u0610\7\u0082\2\2\u060d\u060e\7l\2\2\u060e\u0610\7!\2\2\u060f"+
		"\u0607\3\2\2\2\u060f\u0609\3\2\2\2\u060f\u060b\3\2\2\2\u060f\u060c\3\2"+
		"\2\2\u060f\u060d\3\2\2\2\u0610\u0614\3\2\2\2\u0611\u0612\7j\2\2\u0612"+
		"\u0614\5\u00d0i\2\u0613\u0605\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0616"+
		"\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u0624\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u061c\7m"+
		"\2\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d"+
		"\u0622\7@\2\2\u061e\u061f\7]\2\2\u061f\u0623\7A\2\2\u0620\u0621\7]\2\2"+
		"\u0621\u0623\7Y\2\2\u0622\u061e\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u061b\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u00a5\3\2\2\2\u0626\u0627\7z\2\2\u0627\u062c\7\n\2\2\u0628\u062d\7X\2"+
		"\2\u0629\u062a\t\21\2\2\u062a\u062b\7\f\2\2\u062b\u062d\5\u00caf\2\u062c"+
		"\u0628\3\2\2\2\u062c\u0629\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\7\13"+
		"\2\2\u062f\u00a7\3\2\2\2\u0630\u0633\5\22\n\2\u0631\u0632\7\64\2\2\u0632"+
		"\u0634\5\u00dco\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636"+
		"\3\2\2\2\u0635\u0637\t\t\2\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637"+
		"\u00a9\3\2\2\2\u0638\u0639\78\2\2\u0639\u063b\5\u00d0i\2\u063a\u0638\3"+
		"\2\2\2\u063a\u063b\3\2\2\2\u063b\u0660\3\2\2\2\u063c\u063d\7x\2\2\u063d"+
		"\u0640\7f\2\2\u063e\u0640\7\u0091\2\2\u063f\u063c\3\2\2\2\u063f\u063e"+
		"\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\7\n\2\2\u0642\u0647\5\u00a8U"+
		"\2\u0643\u0644\7\f\2\2\u0644\u0646\5\u00a8U\2\u0645\u0643\3\2\2\2\u0646"+
		"\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064a\3\2"+
		"\2\2\u0649\u0647\3\2\2\2\u064a\u064b\7\13\2\2\u064b\u064c\5\u00a2R\2\u064c"+
		"\u0661\3\2\2\2\u064d\u064e\7\63\2\2\u064e\u064f\7\n\2\2\u064f\u0650\5"+
		"\20\t\2\u0650\u0651\7\13\2\2\u0651\u0661\3\2\2\2\u0652\u0653\7Q\2\2\u0653"+
		"\u0654\7f\2\2\u0654\u0655\7\n\2\2\u0655\u065a\5\22\n\2\u0656\u0657\7\f"+
		"\2\2\u0657\u0659\5\22\n\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u065a\3\2"+
		"\2\2\u065d\u065e\7\13\2\2\u065e\u065f\5\u00a4S\2\u065f\u0661\3\2\2\2\u0660"+
		"\u063f\3\2\2\2\u0660\u064d\3\2\2\2\u0660\u0652\3\2\2\2\u0661\u00ab\3\2"+
		"\2\2\u0662\u0664\7\u009a\2\2\u0663\u0665\7{\2\2\u0664\u0663\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\5\u00c4c\2\u0667\u0668"+
		"\7(\2\2\u0668\u0669\7\n\2\2\u0669\u066a\5\u0092J\2\u066a\u0674\7\13\2"+
		"\2\u066b\u066c\7\f\2\2\u066c\u066d\5\u00c4c\2\u066d\u066e\7(\2\2\u066e"+
		"\u066f\7\n\2\2\u066f\u0670\5\u0092J\2\u0670\u0671\7\13\2\2\u0671\u0673"+
		"\3\2\2\2\u0672\u066b\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u00ad\3\2\2\2\u0676\u0674\3\2\2\2\u0677\u0678\5\u00d4"+
		"k\2\u0678\u0679\7\t\2\2\u0679\u067b\3\2\2\2\u067a\u0677\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0682\5\u00d6l\2\u067d\u067e"+
		"\7\\\2\2\u067e\u067f\7/\2\2\u067f\u0683\5\u00e0q\2\u0680\u0681\7m\2\2"+
		"\u0681\u0683\7\\\2\2\u0682\u067d\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683"+
		"\3\2\2\2\u0683\u00af\3\2\2\2\u0684\u0687\5\20\t\2\u0685\u0686\7\64\2\2"+
		"\u0686\u0688\5\u00dco\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688"+
		"\u068a\3\2\2\2\u0689\u068b\t\t\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2"+
		"\2\2\u068b\u00b1\3\2\2\2\u068c\u0690\5\u00c6d\2\u068d\u0690\5\u00d0i\2"+
		"\u068e\u0690\7\u009f\2\2\u068f\u068c\3\2\2\2\u068f\u068d\3\2\2\2\u068f"+
		"\u068e\3\2\2\2\u0690\u00b3\3\2\2\2\u0691\u069d\5\u00d6l\2\u0692\u0693"+
		"\7\n\2\2\u0693\u0698\5\22\n\2\u0694\u0695\7\f\2\2\u0695\u0697\5\22\n\2"+
		"\u0696\u0694\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699"+
		"\3\2\2\2\u0699\u069b\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c\7\13\2\2"+
		"\u069c\u069e\3\2\2\2\u069d\u0692\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f"+
		"\3\2\2\2\u069f\u06a0\7(\2\2\u06a0\u06a1\7\n\2\2\u06a1\u06a2\5\u0092J\2"+
		"\u06a2\u06a3\7\13\2\2\u06a3\u00b5\3\2\2\2\u06a4\u06b1\7\16\2\2\u06a5\u06a6"+
		"\5\u00d6l\2\u06a6\u06a7\7\t\2\2\u06a7\u06a8\7\16\2\2\u06a8\u06b1\3\2\2"+
		"\2\u06a9\u06ae\5\20\t\2\u06aa\u06ac\7(\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac"+
		"\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06af\5\30\r\2\u06ae\u06ab\3\2\2\2"+
		"\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06a4\3\2\2\2\u06b0\u06a5"+
		"\3\2\2\2\u06b0\u06a9\3\2\2\2\u06b1\u00b7\3\2\2\2\u06b2\u06b3\5\u00d4k"+
		"\2\u06b3\u06b4\7\t\2\2\u06b4\u06b6\3\2\2\2\u06b5\u06b2\3\2\2\2\u06b5\u06b6"+
		"\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06bc\5\u00d6l\2\u06b8\u06ba\7(\2\2"+
		"\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd"+
		"\5\u00ecw\2\u06bc\u06b9\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06c3\3\2\2"+
		"\2\u06be\u06bf\7\\\2\2\u06bf\u06c0\7/\2\2\u06c0\u06c4\5\u00e0q\2\u06c1"+
		"\u06c2\7m\2\2\u06c2\u06c4\7\\\2\2\u06c3\u06be\3\2\2\2\u06c3\u06c1\3\2"+
		"\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06e2\3\2\2\2\u06c5\u06cf\7\n\2\2\u06c6"+
		"\u06cb\5\u00b8]\2\u06c7\u06c8\7\f\2\2\u06c8\u06ca\5\u00b8]\2\u06c9\u06c7"+
		"\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc"+
		"\u06d0\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06d0\5\u00ba^\2\u06cf\u06c6"+
		"\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d6\7\13\2\2"+
		"\u06d2\u06d4\7(\2\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5"+
		"\3\2\2\2\u06d5\u06d7\5\u00ecw\2\u06d6\u06d3\3\2\2\2\u06d6\u06d7\3\2\2"+
		"\2\u06d7\u06e2\3\2\2\2\u06d8\u06d9\7\n\2\2\u06d9\u06da\5\u0092J\2\u06da"+
		"\u06df\7\13\2\2\u06db\u06dd\7(\2\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2"+
		"\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\5\u00ecw\2\u06df\u06dc\3\2\2\2\u06df"+
		"\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06b5\3\2\2\2\u06e1\u06c5\3\2"+
		"\2\2\u06e1\u06d8\3\2\2\2\u06e2\u00b9\3\2\2\2\u06e3\u06ea\5\u00b8]\2\u06e4"+
		"\u06e5\5\u00bc_\2\u06e5\u06e6\5\u00b8]\2\u06e6\u06e7\5\u00be`\2\u06e7"+
		"\u06e9\3\2\2\2\u06e8\u06e4\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u00bb\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed"+
		"\u06fb\7\f\2\2\u06ee\u06f0\7k\2\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2"+
		"\2\2\u06f0\u06f7\3\2\2\2\u06f1\u06f3\7g\2\2\u06f2\u06f4\7u\2\2\u06f3\u06f2"+
		"\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f8\3\2\2\2\u06f5\u06f8\7^\2\2\u06f6"+
		"\u06f8\7:\2\2\u06f7\u06f1\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f7\u06f6\3\2"+
		"\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\7e\2\2\u06fa"+
		"\u06ed\3\2\2\2\u06fa\u06ef\3\2\2\2\u06fb\u00bd\3\2\2\2\u06fc\u06fd\7r"+
		"\2\2\u06fd\u070b\5\20\t\2\u06fe\u06ff\7\u0093\2\2\u06ff\u0700\7\n\2\2"+
		"\u0700\u0705\5\22\n\2\u0701\u0702\7\f\2\2\u0702\u0704\5\22\n\2\u0703\u0701"+
		"\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0708\3\2\2\2\u0707\u0705\3\2\2\2\u0708\u0709\7\13\2\2\u0709\u070b\3"+
		"\2\2\2\u070a\u06fc\3\2\2\2\u070a\u06fe\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u00bf\3\2\2\2\u070c\u070e\7\u0087\2\2\u070d\u070f\t\16\2\2\u070e\u070d"+
		"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0715\5\u00b6\\"+
		"\2\u0711\u0712\7\f\2\2\u0712\u0714\5\u00b6\\\2\u0713\u0711\3\2\2\2\u0714"+
		"\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0724\3\2"+
		"\2\2\u0717\u0715\3\2\2\2\u0718\u0722\7R\2\2\u0719\u071e\5\u00b8]\2\u071a"+
		"\u071b\7\f\2\2\u071b\u071d\5\u00b8]\2\u071c\u071a\3\2\2\2\u071d\u0720"+
		"\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0723\3\2\2\2\u0720"+
		"\u071e\3\2\2\2\u0721\u0723\5\u00ba^\2\u0722\u0719\3\2\2\2\u0722\u0721"+
		"\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u0718\3\2\2\2\u0724\u0725\3\2\2\2\u0725"+
		"\u0728\3\2\2\2\u0726\u0727\7\u0099\2\2\u0727\u0729\5\20\t\2\u0728\u0726"+
		"\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u0738\3\2\2\2\u072a\u072b\7U\2\2\u072b"+
		"\u072c\7/\2\2\u072c\u0731\5\20\t\2\u072d\u072e\7\f\2\2\u072e\u0730\5\20"+
		"\t\2\u072f\u072d\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2\2\2\u0731"+
		"\u0732\3\2\2\2\u0732\u0736\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u0735\7V"+
		"\2\2\u0735\u0737\5\20\t\2\u0736\u0734\3\2\2\2\u0736\u0737\3\2\2\2\u0737"+
		"\u0739\3\2\2\2\u0738\u072a\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0757\3\2"+
		"\2\2\u073a\u073b\7\u0095\2\2\u073b\u073c\7\n\2\2\u073c\u0741\5\20\t\2"+
		"\u073d\u073e\7\f\2\2\u073e\u0740\5\20\t\2\u073f\u073d\3\2\2\2\u0740\u0743"+
		"\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744\3\2\2\2\u0743"+
		"\u0741\3\2\2\2\u0744\u0753\7\13\2\2\u0745\u0746\7\f\2\2\u0746\u0747\7"+
		"\n\2\2\u0747\u074c\5\20\t\2\u0748\u0749\7\f\2\2\u0749\u074b\5\20\t\2\u074a"+
		"\u0748\3\2\2\2\u074b\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2"+
		"\2\2\u074d\u074f\3\2\2\2\u074e\u074c\3\2\2\2\u074f\u0750\7\13\2\2\u0750"+
		"\u0752\3\2\2\2\u0751\u0745\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2"+
		"\2\2\u0753\u0754\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0756"+
		"\u070c\3\2\2\2\u0756\u073a\3\2\2\2\u0757\u00c1\3\2\2\2\u0758\u075e\7\u0090"+
		"\2\2\u0759\u075a\7\u0090\2\2\u075a\u075e\7$\2\2\u075b\u075e\7a\2\2\u075c"+
		"\u075e\7K\2\2\u075d\u0758\3\2\2\2\u075d\u0759\3\2\2\2\u075d\u075b\3\2"+
		"\2\2\u075d\u075c\3\2\2\2\u075e\u00c3\3\2\2\2\u075f\u076b\5\u00d6l\2\u0760"+
		"\u0761\7\n\2\2\u0761\u0766\5\22\n\2\u0762\u0763\7\f\2\2\u0763\u0765\5"+
		"\22\n\2\u0764\u0762\3\2\2\2\u0765\u0768\3\2\2\2\u0766\u0764\3\2\2\2\u0766"+
		"\u0767\3\2\2\2\u0767\u0769\3\2\2\2\u0768\u0766\3\2\2\2\u0769\u076a\7\13"+
		"\2\2\u076a\u076c\3\2\2\2\u076b\u0760\3\2\2\2\u076b\u076c\3\2\2\2\u076c"+
		"\u00c5\3\2\2\2\u076d\u076f\t\4\2\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2"+
		"\2\2\u076f\u0770\3\2\2\2\u0770\u0771\7\u009d\2\2\u0771\u00c7\3\2\2\2\u0772"+
		"\u0773\t\22\2\2\u0773\u00c9\3\2\2\2\u0774\u0775\7\u009f\2\2\u0775\u00cb"+
		"\3\2\2\2\u0776\u0779\5\20\t\2\u0777\u0779\5\u009cO\2\u0778\u0776\3\2\2"+
		"\2\u0778\u0777\3\2\2\2\u0779\u00cd\3\2\2\2\u077a\u077b\t\23\2\2\u077b"+
		"\u00cf\3\2\2\2\u077c\u077d\5\24\13\2\u077d\u00d1\3\2\2\2\u077e\u077f\5"+
		"\24\13\2\u077f\u00d3\3\2\2\2\u0780\u0781\5\24\13\2\u0781\u00d5\3\2\2\2"+
		"\u0782\u0783\5\24\13\2\u0783\u00d7\3\2\2\2\u0784\u0785\5\24\13\2\u0785"+
		"\u00d9\3\2\2\2\u0786\u0787\5\24\13\2\u0787\u00db\3\2\2\2\u0788\u0789\5"+
		"\24\13\2\u0789\u00dd\3\2\2\2\u078a\u078b\5\24\13\2\u078b\u00df\3\2\2\2"+
		"\u078c\u078d\5\24\13\2\u078d\u00e1\3\2\2\2\u078e\u078f\5\24\13\2\u078f"+
		"\u00e3\3\2\2\2\u0790\u0791\5\24\13\2\u0791\u00e5\3\2\2\2\u0792\u0793\5"+
		"\24\13\2\u0793\u00e7\3\2\2\2\u0794\u0795\5\24\13\2\u0795\u00e9\3\2\2\2"+
		"\u0796\u0797\5\24\13\2\u0797\u00eb\3\2\2\2\u0798\u0799\5\24\13\2\u0799"+
		"\u00ed\3\2\2\2\u079a\u079b\5\24\13\2\u079b\u00ef\3\2\2\2\u00fb\u00f6\u00fc"+
		"\u00ff\u0102\u0105\u0115\u0121\u0124\u0128\u0131\u0138\u013c\u0146\u014f"+
		"\u0153\u0157\u0172\u0175\u0177\u0183\u0196\u019f\u01a3\u01a8\u01b2\u01bf"+
		"\u01da\u0209\u0217\u023d\u0243\u0245\u0250\u0257\u025c\u0262\u0268\u026a"+
		"\u028a\u0291\u0299\u029c\u02a5\u02a9\u02b1\u02b5\u02b7\u02bc\u02be\u02c2"+
		"\u02c9\u02cc\u02d1\u02d5\u02da\u02e3\u02e6\u02ec\u02ee\u02f2\u02f8\u02fd"+
		"\u0308\u030e\u0312\u0318\u031d\u0326\u032d\u0333\u0337\u033b\u0341\u0346"+
		"\u034d\u0358\u035b\u035d\u0363\u0369\u036d\u0374\u037a\u0380\u0386\u038b"+
		"\u0397\u039c\u03a7\u03ac\u03af\u03b6\u03b9\u03c0\u03c9\u03cc\u03d2\u03d4"+
		"\u03d8\u03e0\u03e5\u03ed\u03f2\u03fa\u03ff\u0407\u040c\u0412\u0419\u041c"+
		"\u0424\u042e\u0431\u0437\u0439\u043c\u044f\u0455\u045e\u0463\u046c\u0477"+
		"\u047e\u0484\u048a\u0493\u049a\u049e\u04a0\u04a4\u04ab\u04ad\u04b1\u04b4"+
		"\u04bb\u04c2\u04c5\u04cf\u04d2\u04d8\u04da\u04de\u04e5\u04e8\u04f0\u04fa"+
		"\u04fd\u0503\u0505\u0509\u0510\u0519\u051d\u051f\u0523\u052c\u0531\u0533"+
		"\u053c\u0547\u054e\u0551\u0554\u0561\u056f\u0574\u0577\u0584\u0592\u0597"+
		"\u05a0\u05a3\u05a9\u05ab\u05b1\u05b6\u05bc\u05c8\u05cc\u05d1\u05d5\u05d8"+
		"\u05ea\u05ef\u05f4\u05fe\u0603\u060f\u0613\u0617\u061b\u0622\u0624\u062c"+
		"\u0633\u0636\u063a\u063f\u0647\u065a\u0660\u0664\u0674\u067a\u0682\u0687"+
		"\u068a\u068f\u0698\u069d\u06ab\u06ae\u06b0\u06b5\u06b9\u06bc\u06c3\u06cb"+
		"\u06cf\u06d3\u06d6\u06dc\u06df\u06e1\u06ea\u06ef\u06f3\u06f7\u06fa\u0705"+
		"\u070a\u070e\u0715\u071e\u0722\u0724\u0728\u0731\u0736\u0738\u0741\u074c"+
		"\u0753\u0756\u075d\u0766\u076b\u076e\u0778";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}