package io.toolbox.cqengineext

import java.util

import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.attribute.Attribute
import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.index.navigable.NavigableIndex
import com.googlecode.cqengine.query.Query
import com.googlecode.cqengine.query.QueryFactory._
import com.googlecode.cqengine.query.option.QueryOptions
import com.googlecode.cqengine.resultset.ResultSet

import scala.collection.JavaConversions._
import scala.collection.mutable

class ConcurrentIndexedCollectionExt(schemaDescription: Map[String, String]) {

  val collection = new ConcurrentIndexedCollection[util.Map[_, _]]
  val attributes = CqEngineAttributesGenerator.createSimpleAttrs(schemaDescription)

  def addIndexes(indexes: Map[String, String]): ConcurrentIndexedCollectionExt ={

    indexes foreach { idxInfo =>

      val attrName = idxInfo._1
      val idxType = idxInfo._2

      val indexO = attributes.get(attrName) map { attr =>

        val attrType = attr.getAttributeType
        attrType.getTypeName match {
          case "java.lang.String" =>
            val a = attr.asInstanceOf[Attribute[util.Map[_,_], String]]
            createIdxForAttr(idxType, a)
          case "java.lang.Integer" =>
            val a = attr.asInstanceOf[Attribute[util.Map[_,_], java.lang.Integer]]
            createIdxForAttr(idxType, a)
          case "java.lang.Float" =>
            val a = attr.asInstanceOf[Attribute[util.Map[_,_], java.lang.Float]]
            createIdxForAttr(idxType, a)
          case "java.lang.Boolean" =>
            val a = attr.asInstanceOf[Attribute[util.Map[_,_], java.lang.Boolean]]
            createIdxForAttr(idxType, a)
          case x => throw new Exception(s"usupported type: ${x}")
        }
      }
      indexO match {
        case Some(index) =>
          collection.addIndex(index)
        case None =>
      }
    }

    this
  }

  def add(e: MapEntity): Boolean ={
    collection.add(e)
  }

  def add(e: java.util.Map[_, _]): Unit ={
    collection.add(new MapEntity(e))
  }

  def addAll(c: Seq[util.Map[_, _]]): Unit ={
    c foreach{ e => collection.add(e) }
  }

  def retrieve(query: Query[util.Map[_, _]], queryOptions: QueryOptions): ResultSet[util.Map[_, _]] ={
    collection.retrieve(query, queryOptions)
  }

  private def createIdxForAttr[A <: Comparable[A]](idxType: String, a: Attribute[util.Map[_, _], A]): NavigableIndex[A, util.Map[_, _]] = {

    idxType match {
      case "NavigableIndex" => NavigableIndex.onAttribute(a)
      case _ => throw new Exception("unsupported index type")
    }
  }

}

object ConcurrentIndexedCollectionExt{

  def sumBy(key: String, iter: ResultSet[Map[_, _]]): (Float, Int) = {

    val result = iter.foldLeft((0f, 0))((pair, row) => {

      row.containsKey(key) match {
        case true =>
          row.get(key) match {
            case v: Int => (pair._1 + v, pair._2 + 1)
            case v: Float => (pair._1 + v, pair._2 + 1)
            case v => throw new Exception(s"unsupported type: ${v.getClass}")
          }
        case false =>
          (pair._1, pair._2 + 1)
      }
    })

    result
  }

  def foldBy(key: String, iter: ResultSet[util.Map[_, _]], emptyVal: Any = null): mutable.Map[_, Int] ={

    val foldedResults = iter.foldLeft(mutable.Map.empty[Any, Int])((map, row) => {

      val mRow = row
      mRow.containsKey(key) match {
        case true =>
          val v = mRow.get(key)
          map(v) = map.getOrElse(v, 0) + 1
        case false =>
          map(emptyVal) = map.getOrElse(emptyVal, 0) + 1
      }
      map
    })

    foldedResults
  }

  def foldBy2(key1: String, key2: String, iter: Iterable[util.Map[_, _]], emptyVal: Any = null): mutable.Map[_, Int] ={

    val foldedResults = iter.foldLeft(mutable.Map.empty[(Any, Any), Int])((map, row) => {

      val mRow = row
      val hasKey1 = mRow.containsKey(key1)
      val hasKey2 = mRow.containsKey(key2)
      (hasKey1, hasKey2) match {
        case (false, false) =>
          map((emptyVal, emptyVal)) = map.getOrElse((emptyVal, emptyVal), 0) + 1
        case (true, false) =>
          val v1 = mRow.get(key1)
          map((v1, emptyVal)) = map.getOrElse((v1, emptyVal), 0) + 1
        case (false, true) =>
          val v2 = mRow.get(key2)
          map((emptyVal, v2)) = map.getOrElse((emptyVal, v2), 0) + 1
        case (true, true) =>
          val v1 = mRow.get(key1)
          val v2 = mRow.get(key2)
          map((v1, v2)) = map.getOrElse((v1, v2), 0) + 1
      }

      map
    })

    foldedResults
  }

  def histogram(key: String, iter: ResultSet[util.Map[_, _]], emptyVal: Any = null): mutable.Map[_, Int] ={

    val foldedResults = iter.foldLeft(mutable.Map.empty[Any, Int])((map, row) => {

      val mRow = row
      mRow.containsKey(key) match {
        case true =>
          val v = ((mRow.get(key).asInstanceOf[Float] - 0.000001f) / 0.05f).toInt
          map(v) = map.getOrElse(v, 0) + 1
        case false =>
          map(emptyVal) = map.getOrElse(emptyVal, 0) + 1
      }
      map
    })

    foldedResults
  }

  def count(iter: ResultSet[util.Map[_, _]]): Int = {
    iter.size()
  }
}