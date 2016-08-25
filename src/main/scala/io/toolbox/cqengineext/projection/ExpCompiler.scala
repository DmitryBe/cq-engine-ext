package io.toolbox.cqengineext.projection

import com.twitter.util.Eval
import io.toolbox.utils.MD5Helper
import scala.collection.mutable

object ExpCompiler {
  implicit val defaultCompiler = new ExpCompiler().warmUp()
}

class ExpCompiler {

  val eval = new Eval()

  val cache = mutable.Map.empty[String, (mutable.Map[String, Any])=> Any]

  def warmUp(): ExpCompiler ={
    eval.apply("1 + 1")
    this
  }

  def compileExpr(expr: String): (mutable.Map[String, Any])=>Any ={

    val exprHash = MD5Helper.hash(expr.toLowerCase)
    cache.get(exprHash) match {
      case Some(f) => f
      case None =>
        val f = eval.apply[(mutable.Map[String, Any])=> Any](expr)
        cache += exprHash -> f
        f
    }
  }

  def compile[T](expr: String) = compileExpr(expr).asInstanceOf[(mutable.Map[String, Any])=>T]
}