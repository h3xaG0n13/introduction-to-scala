package _06_oops3Package

object Generics extends App {

  /*
    Generics:
      - An instance of a Class defined in Scala can be used only for that specific Class type
      - Generics allow a Class to be used with different Class Types based on the Type Parameter passed
      - Like a Class, a Trait can also be Generic.
      - Similarly, a method can also be Generic.
   */

  // Abstract Class with Generic Type and a Generic Method
  abstract class Divide[A] {
    def divide(numerator: A, denominator: A): A
  }


  // Child class inheriting from Parent Abstract Class with Generic Type defined as INT
  // Method definition has also been updated to provide behaviour
  class IntDivide extends Divide[Int] {
    override def divide(numerator: Int, denominator: Int): Int = numerator / denominator
  }
  // Instance of Child Class with INT Type Parameter
  val intDivide = new IntDivide
  println(intDivide.divide(2, 3))


  // Child class inheriting from Parent Abstract Class with Generic Type defined as DOUBLE
  // Method definition has also been updated to provide behaviour
  class DoubleDivide extends Divide[Double] {
    override def divide(numerator: Double, denominator: Double): Double = numerator / denominator
  }
  // Instance of Child Class with DOUBLE Type Parameter
  val doubleDivide = new DoubleDivide
  println(doubleDivide.divide(2.1, 3.2))

  // The same Class has been used for 2 different Data types: INT and DOUBLE
}
