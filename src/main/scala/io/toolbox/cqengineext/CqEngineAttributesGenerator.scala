package io.toolbox.cqengineext

import java.util

import scala.collection.JavaConversions._
import com.googlecode.cqengine.attribute.{Attribute, SimpleAttribute, SimpleNullableAttribute}
import com.googlecode.cqengine.query.QueryFactory._
import com.googlecode.cqengine.query.option.QueryOptions

object CqEngineAttributesGenerator{

  def createSimpleAttrs(attrs: Map[String, String]): Map[String, Attribute[util.Map[_, _], _<: Comparable[_] ]] ={

    val attributes = attrs map {
      case (name, sType) =>
        createSimpleAttribute(name, sType)
    }
    Map(attributes map {x => x.getAttributeName -> x} toSeq : _*)
  }

  def createSimpleAttribute(name: String, sType: String) = sType match {

    case "java.lang.String" =>
      new SimpleAttribute[util.Map[_, _], java.lang.String](name) {
        def getValue(rec: util.Map[_, _], queryOptions: QueryOptions): java.lang.String =
          rec.get(name).asInstanceOf[java.lang.String]
      }

    case "java.lang.Integer" =>
      new SimpleAttribute[util.Map[_, _], java.lang.Integer](name) {
        def getValue(rec: util.Map[_, _], queryOptions: QueryOptions): java.lang.Integer =
          rec.get(name).asInstanceOf[java.lang.Integer]
      }
    case "java.lang.Float" =>
      new SimpleAttribute[util.Map[_, _], java.lang.Float](name) {
        def getValue(rec: util.Map[_, _], queryOptions: QueryOptions): java.lang.Float =
          rec.get(name).asInstanceOf[java.lang.Float]
      }

    case "java.lang.Double" =>
      new SimpleAttribute[util.Map[_, _], java.lang.Double](name) {
        def getValue(rec: util.Map[_, _], queryOptions: QueryOptions): java.lang.Double =
          rec.get(name).asInstanceOf[java.lang.Double]
      }

    case "java.lang.Boolean" =>
      new SimpleAttribute[util.Map[_, _], java.lang.Boolean](name) {
        def getValue(rec: util.Map[_, _], queryOptions: QueryOptions): java.lang.Boolean =
          rec.get(name).asInstanceOf[java.lang.Boolean]
      }

    case _ =>
      throw new Exception(s"unsupported type: $sType")
  }

  //  def getAttrsType(sType: String) = sType match {
  //    case "java.lang.String" => classOf[java.lang.String]
  //    case "java.lang.Integer" => classOf[java.lang.Integer]
  //    case "java.lang.Float" => classOf[java.lang.Float]
  //    case "java.lang.Boolean" => classOf[java.lang.Boolean]
  //    case _ => throw new Exception(s"unsupported type: $sType")
  //  }

}