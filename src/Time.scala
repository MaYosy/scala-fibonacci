package xyz.mayosy.fibonacci

def time(value: BigInt) = 
  val a = System.currentTimeMillis()
  println(s"The value is: $value")
  val b = System.currentTimeMillis()
  println(s"Total time in millis: ${b - a}")

