package io.scala.toolbox.cqengine.ext

import com.googlecode.cqengine.query.Query
import com.googlecode.cqengine.query.option.QueryOptions

class DCQQueryBase(hash: String)
case class DCQSQLQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions, limit: Int) extends DCQQueryBase(hash)
case class DCQSQLCountQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions) extends DCQQueryBase(hash)
case class DCQFoldByKeyQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions, foldByKey: String, limit: Int, sortByDirection: Option[String]) extends DCQQueryBase(hash)
case class DCQHistogramQuery(hash: String, query: Query[java.util.Map[_, _]], queryOptions: QueryOptions) extends DCQQueryBase(hash)
