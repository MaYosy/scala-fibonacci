package xyz.mayosy.fibonacci.normal

import xyz.mayosy.fibonacci.time

def fib: Int => BigInt = 
  case 1 | 2 => 1
  case n => fib(n - 1) + fib(n - 2)

@main def main(n: Int) = time(fib(n))
