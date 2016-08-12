package io.toolbox.collections

object CollectionHelper {
  def isOrdered[T](l: Seq[T])
                  (_compare: (T, T) => Boolean): Boolean = {

    l match {
      case Nil => true
      case x :: Nil => true
      case x :: xs => _compare(x, xs.head) && isOrdered(xs)(_compare)
    }

  }
}
