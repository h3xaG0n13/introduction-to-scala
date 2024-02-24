package _05_oops2Package

object PolymorphismContinued extends App {

  /*
    Super:
      - Overloading a Parent Class Method causes the Parent Class Method to lose it's properties
      - Using the Super Keyword, Parent Class Method properties can be retained by Child Class

    Note:
      - Super can also be used on a new Child Class Method
   */

  // Parent Class with Method
  class Parent {
    def greetings: Unit = println("hi")
  }

  // Child Class with Overloaded method retaining properties
  // Child Class with new method with Parent Class method properties
  class Child extends Parent {
    override def greetings: Unit = {
      super.greetings
      println("Hello there!")
    }

    def new_greeting: Unit = {
      super.greetings
      println("Hello there")
    }
  }

  // Instantiating Parent and Child Class
  val parent = new Parent
  val child = new Child

  // Calling Parent and Child methods
  parent.greetings
  child.greetings
  child.new_greeting
}
