package _10_functionalProgramming2Package

object Currying extends App {

  /*
    Currying:
      - Passing parameters of higher order functions in a single Instance
   */

  // Higher Order Function Definition using Function Types
  val addr = new Function1[Int, Function1[Int, Int]]{
    override def apply(num1: Int): Function1[Int, Int] = new Function1[Int, Int]{
      override def apply(num2: Int): Int = num1 + num2
    }
  }

  // Parameters of returned function are passed in original function call
  println(addr(1)(2))

}
