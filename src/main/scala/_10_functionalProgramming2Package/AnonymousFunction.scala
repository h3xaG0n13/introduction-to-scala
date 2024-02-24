package _10_functionalProgramming2Package

object AnonymousFunction extends App {

  /*
    Anonymous Function:
      - A form of syntactic sugar that allows users to reduce boiler plate code for Higher Order Functions
   */

  // Higher Order Function using Anonymous Function to Add 2 numbers
  val addr1: (Int => (Int => Int)) = (num1: Int) => ((num2: Int) => num1 + num2)

  // Practical Implementation of above Higher Order Function
  val addr2: (Int => (Int => Int)) = {
    num1 => num2 => num1 + num2
  }

  // Syntactic Sugar for Anonymous Function to implement above Higher Order Function
  val addr3: (Int => (Int => Int)) = {
    num1 => _ + num1
  }


  // Checking output of above 3 functions
  println(addr1(1)(2))
  println(addr2(1)(2))
  println(addr3(1)(2))
}
