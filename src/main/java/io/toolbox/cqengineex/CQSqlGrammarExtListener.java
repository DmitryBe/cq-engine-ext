// Generated from /Users/dmitry/github/scala-toolbox/src/main/antlr4/cqengineext/grammar/CQSqlGrammarExt.g4 by ANTLR 4.5.3
package io.toolbox.cqengineex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CQSqlGrammarExtParser}.
 */
public interface CQSqlGrammarExtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CQSqlGrammarExtParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CQSqlGrammarExtParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#indexedCollection}.
	 * @param ctx the parse tree
	 */
	void enterIndexedCollection(CQSqlGrammarExtParser.IndexedCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#indexedCollection}.
	 * @param ctx the parse tree
	 */
	void exitIndexedCollection(CQSqlGrammarExtParser.IndexedCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(CQSqlGrammarExtParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(CQSqlGrammarExtParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(CQSqlGrammarExtParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(CQSqlGrammarExtParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(CQSqlGrammarExtParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(CQSqlGrammarExtParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(CQSqlGrammarExtParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(CQSqlGrammarExtParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#result_column_simple}.
	 * @param ctx the parse tree
	 */
	void enterResult_column_simple(CQSqlGrammarExtParser.Result_column_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#result_column_simple}.
	 * @param ctx the parse tree
	 */
	void exitResult_column_simple(CQSqlGrammarExtParser.Result_column_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#histogramClause}.
	 * @param ctx the parse tree
	 */
	void enterHistogramClause(CQSqlGrammarExtParser.HistogramClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#histogramClause}.
	 * @param ctx the parse tree
	 */
	void exitHistogramClause(CQSqlGrammarExtParser.HistogramClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#countClause}.
	 * @param ctx the parse tree
	 */
	void enterCountClause(CQSqlGrammarExtParser.CountClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#countClause}.
	 * @param ctx the parse tree
	 */
	void exitCountClause(CQSqlGrammarExtParser.CountClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CQSqlGrammarExtParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CQSqlGrammarExtParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#logicalQuery}.
	 * @param ctx the parse tree
	 */
	void enterLogicalQuery(CQSqlGrammarExtParser.LogicalQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#logicalQuery}.
	 * @param ctx the parse tree
	 */
	void exitLogicalQuery(CQSqlGrammarExtParser.LogicalQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void enterAndQuery(CQSqlGrammarExtParser.AndQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void exitAndQuery(CQSqlGrammarExtParser.AndQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void enterOrQuery(CQSqlGrammarExtParser.OrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void exitOrQuery(CQSqlGrammarExtParser.OrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#notQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotQuery(CQSqlGrammarExtParser.NotQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#notQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotQuery(CQSqlGrammarExtParser.NotQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#simpleQuery}.
	 * @param ctx the parse tree
	 */
	void enterSimpleQuery(CQSqlGrammarExtParser.SimpleQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#simpleQuery}.
	 * @param ctx the parse tree
	 */
	void exitSimpleQuery(CQSqlGrammarExtParser.SimpleQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#equalQuery}.
	 * @param ctx the parse tree
	 */
	void enterEqualQuery(CQSqlGrammarExtParser.EqualQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#equalQuery}.
	 * @param ctx the parse tree
	 */
	void exitEqualQuery(CQSqlGrammarExtParser.EqualQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#notEqualQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualQuery(CQSqlGrammarExtParser.NotEqualQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#notEqualQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualQuery(CQSqlGrammarExtParser.NotEqualQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualToQuery(CQSqlGrammarExtParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualToQuery(CQSqlGrammarExtParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#lessThanQuery}.
	 * @param ctx the parse tree
	 */
	void enterLessThanQuery(CQSqlGrammarExtParser.LessThanQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#lessThanQuery}.
	 * @param ctx the parse tree
	 */
	void exitLessThanQuery(CQSqlGrammarExtParser.LessThanQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualToQuery(CQSqlGrammarExtParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualToQuery(CQSqlGrammarExtParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanQuery(CQSqlGrammarExtParser.GreaterThanQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanQuery(CQSqlGrammarExtParser.GreaterThanQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#betweenQuery}.
	 * @param ctx the parse tree
	 */
	void enterBetweenQuery(CQSqlGrammarExtParser.BetweenQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#betweenQuery}.
	 * @param ctx the parse tree
	 */
	void exitBetweenQuery(CQSqlGrammarExtParser.BetweenQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotBetweenQuery(CQSqlGrammarExtParser.NotBetweenQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotBetweenQuery(CQSqlGrammarExtParser.NotBetweenQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#inQuery}.
	 * @param ctx the parse tree
	 */
	void enterInQuery(CQSqlGrammarExtParser.InQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#inQuery}.
	 * @param ctx the parse tree
	 */
	void exitInQuery(CQSqlGrammarExtParser.InQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#notInQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotInQuery(CQSqlGrammarExtParser.NotInQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#notInQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotInQuery(CQSqlGrammarExtParser.NotInQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#startsWithQuery}.
	 * @param ctx the parse tree
	 */
	void enterStartsWithQuery(CQSqlGrammarExtParser.StartsWithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#startsWithQuery}.
	 * @param ctx the parse tree
	 */
	void exitStartsWithQuery(CQSqlGrammarExtParser.StartsWithQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#endsWithQuery}.
	 * @param ctx the parse tree
	 */
	void enterEndsWithQuery(CQSqlGrammarExtParser.EndsWithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#endsWithQuery}.
	 * @param ctx the parse tree
	 */
	void exitEndsWithQuery(CQSqlGrammarExtParser.EndsWithQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#containsQuery}.
	 * @param ctx the parse tree
	 */
	void enterContainsQuery(CQSqlGrammarExtParser.ContainsQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#containsQuery}.
	 * @param ctx the parse tree
	 */
	void exitContainsQuery(CQSqlGrammarExtParser.ContainsQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#hasQuery}.
	 * @param ctx the parse tree
	 */
	void enterHasQuery(CQSqlGrammarExtParser.HasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#hasQuery}.
	 * @param ctx the parse tree
	 */
	void exitHasQuery(CQSqlGrammarExtParser.HasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#notHasQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotHasQuery(CQSqlGrammarExtParser.NotHasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#notHasQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotHasQuery(CQSqlGrammarExtParser.NotHasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(CQSqlGrammarExtParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(CQSqlGrammarExtParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterTrailingPercent(CQSqlGrammarExtParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterTrailingPercent(CQSqlGrammarExtParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterLeadingPercent(CQSqlGrammarExtParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterLeadingPercent(CQSqlGrammarExtParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterLeadingAndTrailingPercent(CQSqlGrammarExtParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterLeadingAndTrailingPercent(CQSqlGrammarExtParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameter(CQSqlGrammarExtParser.QueryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameter(CQSqlGrammarExtParser.QueryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#attributeOrder}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOrder(CQSqlGrammarExtParser.AttributeOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#attributeOrder}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOrder(CQSqlGrammarExtParser.AttributeOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(CQSqlGrammarExtParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(CQSqlGrammarExtParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CQSqlGrammarExtParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CQSqlGrammarExtParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(CQSqlGrammarExtParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(CQSqlGrammarExtParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(CQSqlGrammarExtParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(CQSqlGrammarExtParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(CQSqlGrammarExtParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(CQSqlGrammarExtParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(CQSqlGrammarExtParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(CQSqlGrammarExtParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(CQSqlGrammarExtParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(CQSqlGrammarExtParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(CQSqlGrammarExtParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(CQSqlGrammarExtParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(CQSqlGrammarExtParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(CQSqlGrammarExtParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(CQSqlGrammarExtParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(CQSqlGrammarExtParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(CQSqlGrammarExtParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(CQSqlGrammarExtParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(CQSqlGrammarExtParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(CQSqlGrammarExtParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(CQSqlGrammarExtParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(CQSqlGrammarExtParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(CQSqlGrammarExtParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(CQSqlGrammarExtParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(CQSqlGrammarExtParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(CQSqlGrammarExtParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(CQSqlGrammarExtParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(CQSqlGrammarExtParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(CQSqlGrammarExtParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(CQSqlGrammarExtParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(CQSqlGrammarExtParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(CQSqlGrammarExtParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(CQSqlGrammarExtParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(CQSqlGrammarExtParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(CQSqlGrammarExtParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(CQSqlGrammarExtParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(CQSqlGrammarExtParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(CQSqlGrammarExtParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(CQSqlGrammarExtParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(CQSqlGrammarExtParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(CQSqlGrammarExtParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(CQSqlGrammarExtParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(CQSqlGrammarExtParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(CQSqlGrammarExtParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(CQSqlGrammarExtParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(CQSqlGrammarExtParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(CQSqlGrammarExtParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(CQSqlGrammarExtParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(CQSqlGrammarExtParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(CQSqlGrammarExtParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(CQSqlGrammarExtParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(CQSqlGrammarExtParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(CQSqlGrammarExtParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(CQSqlGrammarExtParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(CQSqlGrammarExtParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(CQSqlGrammarExtParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(CQSqlGrammarExtParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(CQSqlGrammarExtParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(CQSqlGrammarExtParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(CQSqlGrammarExtParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(CQSqlGrammarExtParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(CQSqlGrammarExtParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(CQSqlGrammarExtParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(CQSqlGrammarExtParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(CQSqlGrammarExtParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(CQSqlGrammarExtParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(CQSqlGrammarExtParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(CQSqlGrammarExtParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(CQSqlGrammarExtParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(CQSqlGrammarExtParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(CQSqlGrammarExtParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(CQSqlGrammarExtParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(CQSqlGrammarExtParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(CQSqlGrammarExtParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(CQSqlGrammarExtParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(CQSqlGrammarExtParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CQSqlGrammarExtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CQSqlGrammarExtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(CQSqlGrammarExtParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(CQSqlGrammarExtParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(CQSqlGrammarExtParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(CQSqlGrammarExtParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(CQSqlGrammarExtParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(CQSqlGrammarExtParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(CQSqlGrammarExtParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(CQSqlGrammarExtParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(CQSqlGrammarExtParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(CQSqlGrammarExtParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(CQSqlGrammarExtParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(CQSqlGrammarExtParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(CQSqlGrammarExtParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(CQSqlGrammarExtParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(CQSqlGrammarExtParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(CQSqlGrammarExtParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(CQSqlGrammarExtParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(CQSqlGrammarExtParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(CQSqlGrammarExtParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(CQSqlGrammarExtParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(CQSqlGrammarExtParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(CQSqlGrammarExtParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(CQSqlGrammarExtParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(CQSqlGrammarExtParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(CQSqlGrammarExtParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(CQSqlGrammarExtParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(CQSqlGrammarExtParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(CQSqlGrammarExtParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(CQSqlGrammarExtParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(CQSqlGrammarExtParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(CQSqlGrammarExtParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(CQSqlGrammarExtParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(CQSqlGrammarExtParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(CQSqlGrammarExtParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(CQSqlGrammarExtParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(CQSqlGrammarExtParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(CQSqlGrammarExtParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(CQSqlGrammarExtParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(CQSqlGrammarExtParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(CQSqlGrammarExtParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(CQSqlGrammarExtParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(CQSqlGrammarExtParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(CQSqlGrammarExtParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(CQSqlGrammarExtParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(CQSqlGrammarExtParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(CQSqlGrammarExtParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(CQSqlGrammarExtParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(CQSqlGrammarExtParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CQSqlGrammarExtParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CQSqlGrammarExtParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(CQSqlGrammarExtParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(CQSqlGrammarExtParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(CQSqlGrammarExtParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(CQSqlGrammarExtParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(CQSqlGrammarExtParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(CQSqlGrammarExtParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(CQSqlGrammarExtParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(CQSqlGrammarExtParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(CQSqlGrammarExtParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(CQSqlGrammarExtParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(CQSqlGrammarExtParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(CQSqlGrammarExtParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(CQSqlGrammarExtParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(CQSqlGrammarExtParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(CQSqlGrammarExtParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(CQSqlGrammarExtParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(CQSqlGrammarExtParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(CQSqlGrammarExtParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(CQSqlGrammarExtParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(CQSqlGrammarExtParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(CQSqlGrammarExtParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(CQSqlGrammarExtParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(CQSqlGrammarExtParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(CQSqlGrammarExtParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(CQSqlGrammarExtParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(CQSqlGrammarExtParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(CQSqlGrammarExtParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(CQSqlGrammarExtParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(CQSqlGrammarExtParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(CQSqlGrammarExtParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(CQSqlGrammarExtParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(CQSqlGrammarExtParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQSqlGrammarExtParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(CQSqlGrammarExtParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQSqlGrammarExtParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(CQSqlGrammarExtParser.Any_nameContext ctx);
}