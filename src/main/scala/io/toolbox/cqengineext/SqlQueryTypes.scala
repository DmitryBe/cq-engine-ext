package io.toolbox.cqengineext

import com.googlecode.cqengine.query.Query
import com.googlecode.cqengine.query.option.QueryOptions

class QueryBase(hash: String)
case class SQLQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions, limit: Int) extends QueryBase(hash)
case class SQLCountQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions) extends QueryBase(hash)
case class FoldByKeyQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions, foldByKey: String, limit: Int, sortByDirection: Option[String]) extends QueryBase(hash)
case class HistogramQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions) extends QueryBase(hash)
