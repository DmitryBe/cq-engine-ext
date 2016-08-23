package io.toolbox.cqengineext.projection

object AnyValExt {
  implicit def extMethods(s: AnyVal) = new AnyValExt(s)

  def _plus(x: AnyVal, y: AnyVal, first: Boolean = true): AnyVal = (x, y) match {
    case (_x: Int, _y: Int) => _x + _y
    case (_x: Int, _y: Float) => _x + _y
    case (_x: Int, _y: Double) => _x + _y
    case (_x: Float, _y: Float) => _x + _y
    case (_x: Float, _y: Double) => _x + _y
    case (_x: Double, _y: Double) => _x + _y
    case _ =>
      first match {
        case true => _plus(y, x, first = false)
        case false => throw new Exception("unsupported type")
      }
  }

  def _minus(x: AnyVal, y: AnyVal, first: Boolean = true): AnyVal = (x, y) match {
    case (_x: Int, _y: Int) => _x - _y
    case (_x: Int, _y: Float) => _x - _y
    case (_x: Int, _y: Double) => _x - _y
    case (_x: Float, _y: Float) => _x - _y
    case (_x: Float, _y: Double) => _x - _y
    case (_x: Double, _y: Double) => _x - _y
    case _ =>
      first match {
        case true => _minus(y, x, first = false)
        case false => throw new Exception("unsupported type")
      }
  }

  def _mul(x: AnyVal, y: AnyVal, first: Boolean = true): AnyVal = (x, y) match {
    case (_x: Int, _y: Int) => _x * _y
    case (_x: Int, _y: Float) => _x * _y
    case (_x: Int, _y: Double) => _x * _y
    case (_x: Float, _y: Float) => _x * _y
    case (_x: Float, _y: Double) => _x * _y
    case (_x: Double, _y: Double) => _x * _y
    case _ =>
      first match {
        case true => _mul(y, x, first = false)
        case false => throw new Exception("unsupported type")
      }
  }

  def _div(x: AnyVal, y: AnyVal): AnyVal = {
    x.asInstanceOf[Number].doubleValue() / y.asInstanceOf[Number].doubleValue()
  }

  def _lessThan(x: AnyVal, y: AnyVal): AnyVal = {
    x.asInstanceOf[Number].doubleValue() < y.asInstanceOf[Number].doubleValue()
  }

  def _lessThanOrEqual(x: AnyVal, y: AnyVal): AnyVal = {
    x.asInstanceOf[Number].doubleValue() <= y.asInstanceOf[Number].doubleValue()
  }

  def _greatThan(x: AnyVal, y: AnyVal): AnyVal = {
    x.asInstanceOf[Number].doubleValue() > y.asInstanceOf[Number].doubleValue()
  }

  def _greatThanOrEqual(x: AnyVal, y: AnyVal): AnyVal = {
    x.asInstanceOf[Number].doubleValue() >= y.asInstanceOf[Number].doubleValue()
  }
}

class AnyValExt(val v: AnyVal){

  import AnyValExt._

  def +(that: AnyVal) = _plus(v, that)
  def -(that: AnyVal) = _minus(v, that)
  def *(that: AnyVal) = _mul(v, that)
  def /(that: AnyVal) = _div(v, that)
  def <(that: AnyVal) = _lessThan(v, that)
  def <=(that: AnyVal) = _lessThanOrEqual(v, that)
  def >(that: AnyVal) = _greatThan(v, that)
  def >=(that: AnyVal) = _greatThanOrEqual(v, that)
}

