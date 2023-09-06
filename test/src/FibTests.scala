package xyz.mayosy.fibonacci

import collection.mutable.Stack
import org.scalatest.{flatspec, matchers}
import flatspec.* 
import matchers.*

class Fibonacci extends AnyFlatSpec with should.Matchers {

  "Normal" should "pop values in last-in-first-out order" in {
  }

  "Lazy" should "throw NoSuchElementException if an empty stack is popped" in {
    // val emptyStack = new Stack[Int]
    // a [NoSuchElementException] should be thrownBy {
    //   emptyStack.pop()
    // } 
  }
}