package _04_oops1Package

object SyntacticSugar extends App {

  /*
    Syntactic Sugar: It is a type of scripting that makes the code human-readable.
                     Scala allows OOPS code to be easy to read using Infix notation.

    Note:
      - There are additional notations available life Prefix and Postfix.
      - Please refer to https://www.scala-lang.org/files/archive/spec/2.12/06-expressions.html
   */

  // Class with method definition
  class Person (name: String, age: Int) {
    def canDrinkIn(country: String): Boolean = {
      if (country == "England" && this.age >= 18) true
      else if (country == "USA" && this.age >= 21) true
      else false
    }
  }

  // Method called for Instance of Class without braces
  // This notation is called Infix notation and is easy to read
  val John = new Person("John", 20)
  println(John canDrinkIn "England")
  println(John canDrinkIn "USA")

}
