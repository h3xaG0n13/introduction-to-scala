package _05_oops2Package

object AbstractClass extends App {

  /*
    Abstract Class:
      - A type of Class definition (generally empty or unimplemented members) that cannot be instantiated
      - It can be inherited by Child Classes and Class member functionality is defined according to the Child class requirements.
   */

  // Abstract Class Definition with Class members having no assignment
  // Class members can have assignment but is optional
  abstract class Animal (val name: String) {
    def eat(): String = "nom, nom, nom!"
    protected val species: String
    protected def movement(): Unit
  }

  // Instantiating Abstract Class is not allowed as the Class members have no functionalities
  // Uncomment below line to see the error message
  //val dog = new Animal

  // Child Class inheriting Abstract Parent Class
  // All Class members of Abstract Parent Class without definition need to be defined in Child Class
  class Dolphin(name: String) extends Animal(name) {
    override val species: String = "Orca"
    override def movement(): Unit = println("Animal is moving")
  }

  // Instantiating the Child Class
  val dolphin = new Dolphin("Animal")
  println(dolphin.name)       // Inherited through Parent Super Constructor
  println(dolphin.species)    // Overloaded Parent Abstract Attribute
  println(dolphin.eat())      // Inherited Parent Method
  dolphin.movement()          // Overloaded Parent Abstract Method
}
