// Generated from /Users/dmitry/github/scala-toolbox/src/main/antlr4/cqengineext/grammar/DCQGrammar.g4 by ANTLR 4.5.3
package io.toolbox.cqengineex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DCQGrammarParser}.
 */
public interface DCQGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DCQGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DCQGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#indexedCollection}.
	 * @param ctx the parse tree
	 */
	void enterIndexedCollection(DCQGrammarParser.IndexedCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#indexedCollection}.
	 * @param ctx the parse tree
	 */
	void exitIndexedCollection(DCQGrammarParser.IndexedCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DCQGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DCQGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(DCQGrammarParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(DCQGrammarParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(DCQGrammarParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(DCQGrammarParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(DCQGrammarParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(DCQGrammarParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#result_column_simple}.
	 * @param ctx the parse tree
	 */
	void enterResult_column_simple(DCQGrammarParser.Result_column_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#result_column_simple}.
	 * @param ctx the parse tree
	 */
	void exitResult_column_simple(DCQGrammarParser.Result_column_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#histogramClause}.
	 * @param ctx the parse tree
	 */
	void enterHistogramClause(DCQGrammarParser.HistogramClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#histogramClause}.
	 * @param ctx the parse tree
	 */
	void exitHistogramClause(DCQGrammarParser.HistogramClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#countClause}.
	 * @param ctx the parse tree
	 */
	void enterCountClause(DCQGrammarParser.CountClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#countClause}.
	 * @param ctx the parse tree
	 */
	void exitCountClause(DCQGrammarParser.CountClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DCQGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DCQGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#logicalQuery}.
	 * @param ctx the parse tree
	 */
	void enterLogicalQuery(DCQGrammarParser.LogicalQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#logicalQuery}.
	 * @param ctx the parse tree
	 */
	void exitLogicalQuery(DCQGrammarParser.LogicalQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void enterAndQuery(DCQGrammarParser.AndQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void exitAndQuery(DCQGrammarParser.AndQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void enterOrQuery(DCQGrammarParser.OrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void exitOrQuery(DCQGrammarParser.OrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#notQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotQuery(DCQGrammarParser.NotQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#notQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotQuery(DCQGrammarParser.NotQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#simpleQuery}.
	 * @param ctx the parse tree
	 */
	void enterSimpleQuery(DCQGrammarParser.SimpleQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#simpleQuery}.
	 * @param ctx the parse tree
	 */
	void exitSimpleQuery(DCQGrammarParser.SimpleQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#equalQuery}.
	 * @param ctx the parse tree
	 */
	void enterEqualQuery(DCQGrammarParser.EqualQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#equalQuery}.
	 * @param ctx the parse tree
	 */
	void exitEqualQuery(DCQGrammarParser.EqualQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#notEqualQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualQuery(DCQGrammarParser.NotEqualQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#notEqualQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualQuery(DCQGrammarParser.NotEqualQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualToQuery(DCQGrammarParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualToQuery(DCQGrammarParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#lessThanQuery}.
	 * @param ctx the parse tree
	 */
	void enterLessThanQuery(DCQGrammarParser.LessThanQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#lessThanQuery}.
	 * @param ctx the parse tree
	 */
	void exitLessThanQuery(DCQGrammarParser.LessThanQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualToQuery(DCQGrammarParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualToQuery(DCQGrammarParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanQuery(DCQGrammarParser.GreaterThanQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanQuery(DCQGrammarParser.GreaterThanQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#betweenQuery}.
	 * @param ctx the parse tree
	 */
	void enterBetweenQuery(DCQGrammarParser.BetweenQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#betweenQuery}.
	 * @param ctx the parse tree
	 */
	void exitBetweenQuery(DCQGrammarParser.BetweenQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotBetweenQuery(DCQGrammarParser.NotBetweenQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotBetweenQuery(DCQGrammarParser.NotBetweenQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#inQuery}.
	 * @param ctx the parse tree
	 */
	void enterInQuery(DCQGrammarParser.InQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#inQuery}.
	 * @param ctx the parse tree
	 */
	void exitInQuery(DCQGrammarParser.InQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#notInQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotInQuery(DCQGrammarParser.NotInQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#notInQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotInQuery(DCQGrammarParser.NotInQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#startsWithQuery}.
	 * @param ctx the parse tree
	 */
	void enterStartsWithQuery(DCQGrammarParser.StartsWithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#startsWithQuery}.
	 * @param ctx the parse tree
	 */
	void exitStartsWithQuery(DCQGrammarParser.StartsWithQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#endsWithQuery}.
	 * @param ctx the parse tree
	 */
	void enterEndsWithQuery(DCQGrammarParser.EndsWithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#endsWithQuery}.
	 * @param ctx the parse tree
	 */
	void exitEndsWithQuery(DCQGrammarParser.EndsWithQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#containsQuery}.
	 * @param ctx the parse tree
	 */
	void enterContainsQuery(DCQGrammarParser.ContainsQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#containsQuery}.
	 * @param ctx the parse tree
	 */
	void exitContainsQuery(DCQGrammarParser.ContainsQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#hasQuery}.
	 * @param ctx the parse tree
	 */
	void enterHasQuery(DCQGrammarParser.HasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#hasQuery}.
	 * @param ctx the parse tree
	 */
	void exitHasQuery(DCQGrammarParser.HasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#notHasQuery}.
	 * @param ctx the parse tree
	 */
	void enterNotHasQuery(DCQGrammarParser.NotHasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#notHasQuery}.
	 * @param ctx the parse tree
	 */
	void exitNotHasQuery(DCQGrammarParser.NotHasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(DCQGrammarParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(DCQGrammarParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterTrailingPercent(DCQGrammarParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterTrailingPercent(DCQGrammarParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterLeadingPercent(DCQGrammarParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterLeadingPercent(DCQGrammarParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameterLeadingAndTrailingPercent(DCQGrammarParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameterLeadingAndTrailingPercent(DCQGrammarParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void enterQueryParameter(DCQGrammarParser.QueryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#queryParameter}.
	 * @param ctx the parse tree
	 */
	void exitQueryParameter(DCQGrammarParser.QueryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#attributeOrder}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOrder(DCQGrammarParser.AttributeOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#attributeOrder}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOrder(DCQGrammarParser.AttributeOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(DCQGrammarParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(DCQGrammarParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DCQGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DCQGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(DCQGrammarParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(DCQGrammarParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(DCQGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(DCQGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(DCQGrammarParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(DCQGrammarParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(DCQGrammarParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(DCQGrammarParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(DCQGrammarParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(DCQGrammarParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(DCQGrammarParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(DCQGrammarParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(DCQGrammarParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(DCQGrammarParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(DCQGrammarParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(DCQGrammarParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(DCQGrammarParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(DCQGrammarParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(DCQGrammarParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(DCQGrammarParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(DCQGrammarParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(DCQGrammarParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(DCQGrammarParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(DCQGrammarParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(DCQGrammarParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(DCQGrammarParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(DCQGrammarParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(DCQGrammarParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(DCQGrammarParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(DCQGrammarParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(DCQGrammarParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(DCQGrammarParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(DCQGrammarParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(DCQGrammarParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(DCQGrammarParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(DCQGrammarParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(DCQGrammarParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(DCQGrammarParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(DCQGrammarParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(DCQGrammarParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(DCQGrammarParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(DCQGrammarParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(DCQGrammarParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(DCQGrammarParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(DCQGrammarParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(DCQGrammarParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(DCQGrammarParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(DCQGrammarParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(DCQGrammarParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(DCQGrammarParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(DCQGrammarParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(DCQGrammarParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(DCQGrammarParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(DCQGrammarParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(DCQGrammarParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(DCQGrammarParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(DCQGrammarParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(DCQGrammarParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(DCQGrammarParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(DCQGrammarParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(DCQGrammarParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(DCQGrammarParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(DCQGrammarParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(DCQGrammarParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(DCQGrammarParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(DCQGrammarParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(DCQGrammarParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(DCQGrammarParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(DCQGrammarParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(DCQGrammarParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(DCQGrammarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(DCQGrammarParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(DCQGrammarParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(DCQGrammarParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(DCQGrammarParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(DCQGrammarParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DCQGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DCQGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(DCQGrammarParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(DCQGrammarParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(DCQGrammarParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(DCQGrammarParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(DCQGrammarParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(DCQGrammarParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(DCQGrammarParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(DCQGrammarParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(DCQGrammarParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(DCQGrammarParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(DCQGrammarParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(DCQGrammarParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(DCQGrammarParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(DCQGrammarParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(DCQGrammarParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(DCQGrammarParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(DCQGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(DCQGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(DCQGrammarParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(DCQGrammarParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(DCQGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(DCQGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(DCQGrammarParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(DCQGrammarParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(DCQGrammarParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(DCQGrammarParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(DCQGrammarParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(DCQGrammarParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(DCQGrammarParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(DCQGrammarParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(DCQGrammarParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(DCQGrammarParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(DCQGrammarParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(DCQGrammarParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(DCQGrammarParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(DCQGrammarParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(DCQGrammarParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(DCQGrammarParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(DCQGrammarParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(DCQGrammarParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(DCQGrammarParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(DCQGrammarParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(DCQGrammarParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(DCQGrammarParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(DCQGrammarParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(DCQGrammarParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(DCQGrammarParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(DCQGrammarParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DCQGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DCQGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(DCQGrammarParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(DCQGrammarParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(DCQGrammarParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(DCQGrammarParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(DCQGrammarParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(DCQGrammarParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(DCQGrammarParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(DCQGrammarParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(DCQGrammarParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(DCQGrammarParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(DCQGrammarParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(DCQGrammarParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(DCQGrammarParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(DCQGrammarParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(DCQGrammarParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(DCQGrammarParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(DCQGrammarParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(DCQGrammarParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(DCQGrammarParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(DCQGrammarParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(DCQGrammarParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(DCQGrammarParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(DCQGrammarParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(DCQGrammarParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(DCQGrammarParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(DCQGrammarParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(DCQGrammarParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(DCQGrammarParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(DCQGrammarParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(DCQGrammarParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(DCQGrammarParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(DCQGrammarParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCQGrammarParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(DCQGrammarParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCQGrammarParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(DCQGrammarParser.Any_nameContext ctx);
}