// Generated from /Users/dmitry/github/scala-toolbox/src/main/antlr4/cqengineext/grammar/DCQGrammar.g4 by ANTLR 4.5.3
package io.toolbox.cqengineex;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DCQGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DCQGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(DCQGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#indexedCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedCollection(DCQGrammarParser.IndexedCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DCQGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DCQGrammarParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DCQGrammarParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(DCQGrammarParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#result_column_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column_simple(DCQGrammarParser.Result_column_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#histogramClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogramClause(DCQGrammarParser.HistogramClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#countClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountClause(DCQGrammarParser.CountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DCQGrammarParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#logicalQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalQuery(DCQGrammarParser.LogicalQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#andQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndQuery(DCQGrammarParser.AndQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#orQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrQuery(DCQGrammarParser.OrQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#notQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotQuery(DCQGrammarParser.NotQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#simpleQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleQuery(DCQGrammarParser.SimpleQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#equalQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualQuery(DCQGrammarParser.EqualQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#notEqualQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualQuery(DCQGrammarParser.NotEqualQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#lessThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualToQuery(DCQGrammarParser.LessThanOrEqualToQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#lessThanQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanQuery(DCQGrammarParser.LessThanQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#greaterThanOrEqualToQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualToQuery(DCQGrammarParser.GreaterThanOrEqualToQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#greaterThanQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanQuery(DCQGrammarParser.GreaterThanQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#betweenQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenQuery(DCQGrammarParser.BetweenQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#notBetweenQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBetweenQuery(DCQGrammarParser.NotBetweenQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#inQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInQuery(DCQGrammarParser.InQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#notInQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInQuery(DCQGrammarParser.NotInQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#startsWithQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartsWithQuery(DCQGrammarParser.StartsWithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#endsWithQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndsWithQuery(DCQGrammarParser.EndsWithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#containsQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsQuery(DCQGrammarParser.ContainsQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#hasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasQuery(DCQGrammarParser.HasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#notHasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotHasQuery(DCQGrammarParser.NotHasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(DCQGrammarParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#queryParameterTrailingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterTrailingPercent(DCQGrammarParser.QueryParameterTrailingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterLeadingPercent(DCQGrammarParser.QueryParameterLeadingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#queryParameterLeadingAndTrailingPercent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameterLeadingAndTrailingPercent(DCQGrammarParser.QueryParameterLeadingAndTrailingPercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#queryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryParameter(DCQGrammarParser.QueryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#attributeOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOrder(DCQGrammarParser.AttributeOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(DCQGrammarParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DCQGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(DCQGrammarParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(DCQGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(DCQGrammarParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(DCQGrammarParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(DCQGrammarParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(DCQGrammarParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(DCQGrammarParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(DCQGrammarParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(DCQGrammarParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(DCQGrammarParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(DCQGrammarParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(DCQGrammarParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(DCQGrammarParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(DCQGrammarParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(DCQGrammarParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(DCQGrammarParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(DCQGrammarParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(DCQGrammarParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(DCQGrammarParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(DCQGrammarParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(DCQGrammarParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(DCQGrammarParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(DCQGrammarParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(DCQGrammarParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(DCQGrammarParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(DCQGrammarParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(DCQGrammarParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(DCQGrammarParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(DCQGrammarParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(DCQGrammarParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(DCQGrammarParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(DCQGrammarParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(DCQGrammarParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(DCQGrammarParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(DCQGrammarParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(DCQGrammarParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(DCQGrammarParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(DCQGrammarParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DCQGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(DCQGrammarParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(DCQGrammarParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(DCQGrammarParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(DCQGrammarParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(DCQGrammarParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(DCQGrammarParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(DCQGrammarParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(DCQGrammarParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(DCQGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(DCQGrammarParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(DCQGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(DCQGrammarParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(DCQGrammarParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(DCQGrammarParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(DCQGrammarParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(DCQGrammarParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(DCQGrammarParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(DCQGrammarParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(DCQGrammarParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(DCQGrammarParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(DCQGrammarParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(DCQGrammarParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(DCQGrammarParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(DCQGrammarParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DCQGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(DCQGrammarParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(DCQGrammarParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(DCQGrammarParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(DCQGrammarParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(DCQGrammarParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(DCQGrammarParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(DCQGrammarParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(DCQGrammarParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(DCQGrammarParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(DCQGrammarParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(DCQGrammarParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(DCQGrammarParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(DCQGrammarParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(DCQGrammarParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(DCQGrammarParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(DCQGrammarParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DCQGrammarParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(DCQGrammarParser.Any_nameContext ctx);
}