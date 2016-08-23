package io.toolbox.cqengineext.projection

import scala.collection.mutable

object QueryProjector{

  def project(result: Seq[mutable.Map[String, Any]], queryProjection: QueryProjection): Seq[mutable.Map[String, Any]] ={
    result.map(row => projectRow(row)(queryProjection))
  }

  def projectRow(row: mutable.Map[String, Any])(queryProjection: QueryProjection): mutable.Map[String, Any] ={

    queryProjection.resultColumns.foldLeft(mutable.Map.empty[String, Any])((r, column) => {
      r ++ column.project(row)
    })
  }

}
