package io.toolbox.cqengineext

import java.util

import com.googlecode.cqengine.attribute.Attribute
import com.googlecode.cqengine.query.QueryFactory._

object CqEngineAttributesGenerator{

  def createAttrs(attrs: Map[String, String]): Map[String, Attribute[util.Map[_, _], _<: Comparable[_] ]] ={

    val attributes = attrs map {
      case (name, sType) =>
        mapAttribute(name, getAttrsType(sType))
    }
    Map(attributes map {x => x.getAttributeName -> x} toSeq : _*)
  }

  def getAttrsType(sType: String) = sType match {
    case "java.lang.String" => classOf[java.lang.String]
    case "java.lang.Integer" => classOf[java.lang.Integer]
    case "java.lang.Float" => classOf[java.lang.Float]
    case "java.lang.Boolean" => classOf[java.lang.Boolean]
    case _ => throw new Exception(s"unsupported type: $sType")
  }
}