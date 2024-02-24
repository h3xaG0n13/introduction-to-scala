package _05_oops2Package

object PreventingOverloading extends App {

  /*
    Final:
      - Accidentally Overriding a Parent Method can lead to unwanted behavior
      - This can be avoided by using the Final keyword

    Note:
      - Final can be used on Class as well
      - A Final Class can not be inherited
   */

  // Parent Class with a Final Method
  class Parent {
    final def greetings: String = "Hello, how are you?"
  }

  // Inherited Child Class cannot overload the Parent Final Method
  // Uncomment below line to see the error
  class Child extends Parent {
    //override def greetings: String = "Hi there!"
  }

  // Final Class with method
  // A Final Class cannot be inherited by any Child Class
  // Uncomment below line to see error
  final class GrandChild
  //class Parent extends GrandChild

}
