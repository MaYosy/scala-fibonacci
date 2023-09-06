package xyz.mayosy.fibonacci.lazyfib

import xyz.mayosy.fibonacci.time

def fib(n: Int): BigInt = 
  def fibFrom(a: BigInt, b: BigInt): LazyList[BigInt] =
    a #:: fibFrom(b, a + b)
  fibFrom(1, 1)(n - 1)

@main def main(n: Int) = time(fib(n))
