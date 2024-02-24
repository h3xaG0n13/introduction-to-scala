package _10_functionalProgramming2Package

object FunctionTypes extends App {

  /*
    Function Types:
      - Instead of defining a Generic Trait and Anonymous Class, Scala allows users to reduce even more Boiler plate code
      - Inbuilt Function Types are present in Scala for up to 22 parameters which work as Anonymous Class.
      - All Scala Functions are instances of Inbuilt Generic Traits FunctionN which accepts N-1 parameters to produce result R.
   */

  // Function with 2 Parameters
  val intAdd = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
  // Usage of the same function
  println(intAdd(1, 2))

  // Syntactic Sugar allows this implementation of Function Types in a simpler way
  val doubleAdd: ((Double, Double) => Double) = (num1: Double, num2: Double) => num1 + num2
  println(doubleAdd(1.2, 2.3))
}
