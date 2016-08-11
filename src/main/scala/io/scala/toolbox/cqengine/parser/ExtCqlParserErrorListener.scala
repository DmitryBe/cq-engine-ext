package io.scala.toolbox.cqengine.parser

import java.util
import org.antlr.v4.runtime.{ANTLRErrorListener, Parser, RecognitionException, Recognizer}
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import scala.collection.mutable
import scala.util.Try

class ExtCqlParserErrorListener extends ANTLRErrorListener{

  val errors = mutable.ListBuffer.empty[Error]

  def getErrors = errors

  override def reportContextSensitivity(recognizer: Parser, dfa: DFA, startIndex: Int, stopIndex: Int, prediction: Int, configs: ATNConfigSet): Unit = ???

  override def reportAmbiguity(recognizer: Parser, dfa: DFA, startIndex: Int, stopIndex: Int, exact: Boolean, ambigAlts: util.BitSet, configs: ATNConfigSet): Unit = ???

  override def reportAttemptingFullContext(recognizer: Parser, dfa: DFA, startIndex: Int, stopIndex: Int, conflictingAlts: util.BitSet, configs: ATNConfigSet): Unit = ???

  override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: scala.Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {
    val error = new Error(line + "," + charPositionInLine + ":" + msg)
    errors.append(error)
  }
}

case class DCQQuerySyntaxError(errors: List[Error]) extends Exception {

  def getFirstAsString = errors.isEmpty match {
    case true => ""
    case false => errors.head.getMessage
  }

  override def getMessage: String = {
    Try(errors.head.getMessage).getOrElse("unknown error")
  }
}
