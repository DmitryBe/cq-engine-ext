// Generated from /Users/dmitry/workspace/cq-engine-ext/src/main/antlr4/cqengineext/grammar/CQSqlGrammarExt.g4 by ANTLR 4.5.3
package io.toolbox.cqengineex;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CQSqlGrammarExtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CQSqlGrammarExtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CQSqlGrammarExtParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#indexedCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedCollection(CQSqlGrammarExtParser.IndexedCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(CQSqlGrammarExtParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(CQSqlGrammarExtParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(CQSqlGrammarExtParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(CQSqlGrammarExtParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#result_column_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column_simple(CQSqlGrammarExtParser.Result_column_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CQSqlGrammarExtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(CQSqlGrammarExtParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(CQSqlGrammarExtParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(CQSqlGrammarExtParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(CQSqlGrammarExtParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#histogramClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogramClause(CQSqlGrammarExtParser.HistogramClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#countClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountClause(CQSqlGrammarExtParser.CountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(CQSqlGrammarExtParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#logicalQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalQuery(CQSqlGrammarExtParser.LogicalQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#andQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndQuery(CQSqlGrammarExtParser.AndQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#orQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrQuery(CQSqlGrammarExtParser.OrQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#notQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotQuery(CQSqlGrammarExtParser.NotQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#simpleQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleQuery(CQSqlGrammarExtParser.SimpleQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#equalQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualQuery(CQSqlGrammarExtParser.EqualQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#notEqualQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualQuery(CQSqlGrammarExtParser.NotEqualQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualToQuery(CQSqlGrammarExtParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#lessThanQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanQuery(CQSqlGrammarExtParser.LessThanQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualToQuery(CQSqlGrammarExtParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanQuery(CQSqlGrammarExtParser.GreaterThanQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#betweenQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenQuery(CQSqlGrammarExtParser.BetweenQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBetweenQuery(CQSqlGrammarExtParser.NotBetweenQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#inQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInQuery(CQSqlGrammarExtParser.InQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#notInQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInQuery(CQSqlGrammarExtParser.NotInQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#startsWithQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartsWithQuery(CQSqlGrammarExtParser.StartsWithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#endsWithQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndsWithQuery(CQSqlGrammarExtParser.EndsWithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#containsQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsQuery(CQSqlGrammarExtParser.ContainsQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#hasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasQuery(CQSqlGrammarExtParser.HasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#notHasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotHasQuery(CQSqlGrammarExtParser.NotHasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(CQSqlGrammarExtParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterTrailingPercent(CQSqlGrammarExtParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterLeadingPercent(CQSqlGrammarExtParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterLeadingAndTrailingPercent(CQSqlGrammarExtParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#queryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameter(CQSqlGrammarExtParser.QueryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#attributeOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOrder(CQSqlGrammarExtParser.AttributeOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(CQSqlGrammarExtParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CQSqlGrammarExtParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(CQSqlGrammarExtParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(CQSqlGrammarExtParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(CQSqlGrammarExtParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(CQSqlGrammarExtParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(CQSqlGrammarExtParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(CQSqlGrammarExtParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(CQSqlGrammarExtParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(CQSqlGrammarExtParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(CQSqlGrammarExtParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(CQSqlGrammarExtParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(CQSqlGrammarExtParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(CQSqlGrammarExtParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(CQSqlGrammarExtParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(CQSqlGrammarExtParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(CQSqlGrammarExtParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(CQSqlGrammarExtParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(CQSqlGrammarExtParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(CQSqlGrammarExtParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(CQSqlGrammarExtParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(CQSqlGrammarExtParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(CQSqlGrammarExtParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(CQSqlGrammarExtParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(CQSqlGrammarExtParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(CQSqlGrammarExtParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(CQSqlGrammarExtParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(CQSqlGrammarExtParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(CQSqlGrammarExtParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(CQSqlGrammarExtParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(CQSqlGrammarExtParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(CQSqlGrammarExtParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(CQSqlGrammarExtParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(CQSqlGrammarExtParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(CQSqlGrammarExtParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(CQSqlGrammarExtParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(CQSqlGrammarExtParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(CQSqlGrammarExtParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(CQSqlGrammarExtParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(CQSqlGrammarExtParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(CQSqlGrammarExtParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(CQSqlGrammarExtParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(CQSqlGrammarExtParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(CQSqlGrammarExtParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(CQSqlGrammarExtParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(CQSqlGrammarExtParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(CQSqlGrammarExtParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(CQSqlGrammarExtParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(CQSqlGrammarExtParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(CQSqlGrammarExtParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(CQSqlGrammarExtParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(CQSqlGrammarExtParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(CQSqlGrammarExtParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(CQSqlGrammarExtParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(CQSqlGrammarExtParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(CQSqlGrammarExtParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(CQSqlGrammarExtParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(CQSqlGrammarExtParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(CQSqlGrammarExtParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(CQSqlGrammarExtParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(CQSqlGrammarExtParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(CQSqlGrammarExtParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CQSqlGrammarExtParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(CQSqlGrammarExtParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(CQSqlGrammarExtParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(CQSqlGrammarExtParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(CQSqlGrammarExtParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(CQSqlGrammarExtParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(CQSqlGrammarExtParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(CQSqlGrammarExtParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(CQSqlGrammarExtParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(CQSqlGrammarExtParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(CQSqlGrammarExtParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(CQSqlGrammarExtParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(CQSqlGrammarExtParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(CQSqlGrammarExtParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(CQSqlGrammarExtParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQSqlGrammarExtParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(CQSqlGrammarExtParser.Transaction_nameContext ctx);
}