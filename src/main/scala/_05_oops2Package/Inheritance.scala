package _05_oops2Package

object Inheritance extends App {

  /*
    Inheritance:
      - Property of a Class or an Object which allows them to have similar implementation of another Class or Object.
      - The Class or Object which is inherited is known as Parent.
      - The Class or Object inheriting is known as Child.

    Note:
      - All properties (Attributes and Methods) of Parent are inherited by Child.

    Practical Use:
      - Allows re-usability of code by allowing access to properties of a Parent to Child
   */

  // Parent Class definition with Constructor
  class Parent (name: String) {
    def greet: String = s"Hi, I am ${name}."
  }

  // Child Class definition inheriting Parent
  // Parent Class attribute in Constructor is provided by Child Class attribute
  class Child (name: String) extends Parent(name)

  // Creating instances of Parent and Child
  val parent1 = new Parent("John")
  val child1 = new Child("Julia")

  // Child is able to access Parent method
  println(child1.greet)

}
