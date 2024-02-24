package _05_oops2Package

object Traits extends App {

  /*
    Trait:
      - Scala doesn't allow multiple Parent inheritance. A Child class can have 1 Parent Class.
      - Trait allows a workaround for Child Classes to inherit multiple Parent Classes
      - A Trait behaves similar to an Abstract Class without a Constructor
   */

  // Parent Class and Parent Traits
  class Animal
  trait SmallBird
  trait Bird {
    def fly(): Unit
  }

  // Child Class Sparrow inherits both Parent Class and multiple Parent Traits
  class Sparrow extends Animal with Bird with SmallBird {
    override def fly(): Unit = println("flying")
  }

  // Instantiating the Child Class
  val sparrow = new Sparrow
  sparrow.fly()
}
