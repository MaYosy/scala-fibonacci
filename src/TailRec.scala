package xyz.mayosy.fibonacci.tailrec

import scala.annotation.tailrec
import xyz.mayosy.fibonacci.time

// @tailrec
def fib(n: Int, acc1: BigInt = 1, acc2: BigInt = 1): BigInt = n match
  case 1 | 2 => acc2
  case n => fib(n - 1, acc2, acc1 + acc2)

@main def main(n: Int) = time(fib(n))
