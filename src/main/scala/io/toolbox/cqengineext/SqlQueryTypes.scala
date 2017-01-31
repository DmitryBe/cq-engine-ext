package io.toolbox.cqengineext

import com.googlecode.cqengine.query.Query
import com.googlecode.cqengine.query.option.QueryOptions
import io.toolbox.cqengineext.projection.{QueryProjection, TResultColumn}

class QueryBase(
  hash: String,
  query: Query[java.util.Map[_, _]],
  queryOptions: QueryOptions
)

case class SQLQuery(
   hash: String,
   query: Query[java.util.Map[_, _]],
   queryOptions: QueryOptions,
   limit: Int,
   columnsProjection: QueryProjection
) extends QueryBase(hash, query, queryOptions)

case class SQLCountQuery(
  hash: String,
  query: Query[java.util.Map[_, _]],
  queryOptions: QueryOptions
) extends QueryBase(hash, query, queryOptions)

case class SQLCountDistinctQuery(
  hash: String,
  query: Query[java.util.Map[_, _]],
  queryOptions: QueryOptions,
  distinctColumns: Seq[String]
) extends QueryBase(hash, query, queryOptions)

case class FoldByKeyQuery(
  hash: String,
  query: Query[java.util.Map[_, _]],
  queryOptions: QueryOptions,
  foldByKey: String,
  limit: Int,
  sortByDirection: Option[String]
) extends QueryBase(hash, query, queryOptions)

case class HistogramQuery(
  hash: String,
  query: Query[java.util.Map[_, _]],
  queryOptions: QueryOptions
) extends QueryBase(hash, query, queryOptions)
