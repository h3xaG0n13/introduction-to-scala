package _99_practicePackage

object FunctionBreakdown extends App {

  /*
    Challenge: Breakdown a Scala Function Type Short-hand into most granular format possible
   */

  // Variables to be used
  val num1: Int = 2
  val num2: Int = 3

  // Level 4
  // Function Type Short-hand
  val intAddr1: ((Int, Int) => Int) = (num1, num2) => num1 + num2
  println(intAddr1(num1, num2))

  // Level 3
  // Function Type
  val intAddr2 = new Function2[Int, Int, Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }
  println(intAddr2(num1, num2))

  // Level 2
  // Function implementation using Generic Trait and Anonymous Class
  trait MyFunction1[A]{
    def apply(num1: A, num2: A): A
  }
  val intAddr3 = new MyFunction1[Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }
  println(intAddr3(num1, num2))

  // Level 1
  // Function implementation using Generic Trait
  // Generic Trait is inherited by Child Function
  // Instance of Child function is used
  trait MyFunction2[B]{
    def apply(num1: B, num2: B): B
  }
  class AdderFunction extends MyFunction2[Int]{
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }
  val intAddr4 = new AdderFunction
  println(intAddr4.apply(num1, num2))

}
