package _05_oops2Package

object AnonymousClass extends App {

  /*
    Anonymous Class:
      - Scala doesn't allow an Abstract Class to be instantiated as the definition of Class members may be incomplete.
      - However, a Child Class inheriting an Abstract Class has to provide the missing Class Member definitions.
      - The Child Class can therefore be instantiated.
      - Rather than following all these steps to instance, Scala allows an easier process using Anonymous Class.

     Note:
      - Anonymous Classes are NOT RESTRICTED to Abstract Class and can be used with regular Class as well.
   */

  // Abstract Class Definition
  abstract class Car {
    def revv: Unit
  }

  // Anonymous Class definition
  // Creating an instance of Child Class from Parent Abstract Class
  val lamborghini: Car = new Car {
    override def revv: Unit = println("vroom, vroom!")
  }
  lamborghini.revv
}
