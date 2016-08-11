package io.scala.toolbox.cqengine.parser

import io.scala.toolbox.cqengineex.DCQGrammarBaseVisitor
import io.scala.toolbox.utils.MD5Helper
import org.antlr.v4.runtime.tree.{ParseTree, RuleNode, TerminalNode}

import scala.util.{Failure, Success, Try}

case class QueryHashResult(convoluteStr: String, hashMD5:String)

object DCQQueryHashGenerator{

  def generate(parseTree: ParseTree): Try[QueryHashResult] ={

    val generator = new DCQQueryHashGenerator()
    generator.genHash(parseTree)
  }
}

class DCQQueryHashGenerator extends DCQGrammarBaseVisitor[String]{

  def genHash(parseTree: ParseTree): Try[QueryHashResult] = {

    try{
      val convoluteStr = super.visit(parseTree)
      val hashMD5 = MD5Helper.hash(convoluteStr)
      Success(QueryHashResult(convoluteStr, hashMD5))
    }catch {
      case ex: Throwable => {
        Failure(ex)
      }
    }

  }

  override def visitChildren(node: RuleNode): String ={

    val c = node.getChildCount
    if (c != 0) {

      val childList = for (i <- 0 to (c - 1)) yield {
        node.getChild(i)
      }

      val _text = _foldChildren(childList.toList)
      _text

    }else{

      val _text = node.getText()
      _text
    }
  }

  override def visitTerminal(node: TerminalNode): String = {

    val _text = node.getText
    _text.toLowerCase
  }

  def _foldChildren(childrenList: List[ParseTree]): String ={

    val l = childrenList
      .map(x => super.visit(x))
      .sortWith(_ < _)

    val _text = l.foldLeft(new StringBuilder())(_ append _)
      .toString()

    _text
  }

}