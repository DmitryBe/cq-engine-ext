package io.toolbox.cqengineext.projection

import com.twitter.util.Eval
import io.toolbox.utils.MD5Helper
import scala.collection.mutable

object ExpCompiler {
  implicit val defaultCompiler = new ExpCompiler().warmUp()
}

class ExpCompiler {

  val cache = new java.util.concurrent.ConcurrentHashMap[String, (mutable.Map[String, Any])=> Any]()

  def warmUp(): ExpCompiler ={
    compileExpr("(row: scala.collection.mutable.Map[String, Any]) => 0")
    this
  }

  def compileExpr(expr: String): (mutable.Map[String, Any]) => Any ={

    val exprHash = MD5Helper.hash(expr.toLowerCase)

    println(s"expr [$exprHash]: $expr")

    var f = cache.get(exprHash)
    if(f == null){
      val eval = new Eval()
      f = eval.apply[(mutable.Map[String, Any])=> Any](expr)
      cache.put(exprHash, f)
    }
    f
  }

  def compile[T](expr: String) = compileExpr(expr).asInstanceOf[(mutable.Map[String, Any])=>T]
}