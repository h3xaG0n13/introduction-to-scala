package _05_oops2Package

object SealedInheritance extends App {

  /*
    Sealed Inheritance:
      - Inheritance needs to be rigid in certain cases i.e. within a specific scope and not outside.
      - Sealed Inheritance allows a Class to be inherited within the same file but not outside.
   */

  // A Sealed Parent Class
  // Child Class can inherit the Parent as it is in Same file.
  // Please refer to: SealedInheritanceContinued to see behaviour in separate file
  sealed class Parent
  class Child extends Parent

}
