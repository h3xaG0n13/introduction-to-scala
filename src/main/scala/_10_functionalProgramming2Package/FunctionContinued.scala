package _10_functionalProgramming2Package

object FunctionContinued extends App {

  /*
    First Class Citizen:
      - Scala treats a Function as a First Class Citizen. This means it is treated same as a Value.
      - In order for JVM to support his implementation in an OOP like Scala, a Generic Trait is prepared.
      - Hence, all Functions can be treated as an instance of a Generic Trait.
   */

  // Implementing a Generic Trait with Method without definition
  trait Function[A] {
    def apply(num: A): A
  }

  // Child Class inheriting Parent Generic Trait with Type Parameter INT
  // Boiler Plate code is needed before Instantiation
  class SquareFunction extends Function[Int] {
    override def apply(num: Int): Int = num * num
  }

  // Instance of Child Class with Type Parameter INT
  val intSquared = new SquareFunction
  // Using the Method of the Child Class Instance
  println(intSquared.apply(2))

  // In order to avoid the boiler plate code, we can use Anonymous Class
  // Instance of Child Class inheriting the Parent Generic Trait with Type Parameter DOUBLE
  val doubleSuqared = new Function[Double] {
    override def apply(num: Double): Double = num * num
  }
  // Using the Method of the Child Class Instance
  println(doubleSuqared.apply(3.1))


  // Further boiler plate code can be removed.
  // Scala allows the implementation of a Class Method: Apply without explicitly mentioning it
  // This syntactic Sugar allows us to implement Functions
  println(intSquared(2))
  println(doubleSuqared(3.1))

}