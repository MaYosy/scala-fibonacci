package xyz.mayosy.fibonacci.memoize

import xyz.mayosy.fibonacci.time

def memoize[A, B](f: A => B): A => B = 
  import scala.collection.mutable
  val cache = mutable.Map[A, B]()
  x => cache.getOrElseUpdate(x, f(x))

val fib: Int => BigInt = memoize {
  case 1 | 2 => 1
  case n => fib(n - 1) + fib(n - 2)
}

@main def main(n: Int) = time(fib(n))
