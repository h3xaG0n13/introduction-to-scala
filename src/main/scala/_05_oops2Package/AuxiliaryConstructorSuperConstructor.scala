package _05_oops2Package

object AuxiliaryConstructorSuperConstructor extends App {

  /*
    Super Constructor:
      - Any Class Attribute defined in Parent Class Constructor has to be defined in Child Class
      - The Parent Class (Super Class) Constructor in Child Class (Sub Class) definition is Super Constructor

    Note:
      - All Class Attributes of Parent Class Constructor may not be needed by Child Class
      - In Such cases, one of 2 options can be used:
        - Auxiliary Constructor
        - Default Class Attribute
   */

  // Parent Class with single constructor
  class Parent(name: String, age: Int)

  // Child Class inherits Parent Class Super Constructor and all attributes
  // All attributes have to be defined during Child Class definition
  class Child(name: String, age: Int) extends Parent(name, age)


  // Parent Class with single constructor and Default Attribute
  class NewParent(name: String, age: Int, Gender: String = "N/A")

  // Child Class inherits Parent Class without all attributes using Primary Constructor
  // Since one attribute is defaulted in Parent Constructor, it is optional
  class NewChild (name: String, age: Int) extends NewParent(name, age)


  // Parent Class with multiple constructors
  class NewerParent(name: String, age: Int, Gender: String) {
    // Auxiliary Constructor
    def this(name: String, age: Int) = this(name, age, "N/A")
  }

  // Child Class inherits Parent Class without all attributes using Auxiliary
  // Auxiliary Constructor is calling Super Constructor with defaulted value
  class NewerChild (name: String, age: Int) extends NewerParent(name, age)

}
