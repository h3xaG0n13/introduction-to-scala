package _05_oops2Package

import _05_oops2Package.SealedInheritance.{Parent, Child}

object SealedInheritanceContinued extends App {

  /*
    Sealed Inheritance:
      - Attempting to inherit a Sealed and an Unsealed Class

    Note:
      - After package definition, Parent and Child Classes from Sealed Inheritance have been imported
   */

  // Sealed Inheritance doesn't allow Child Class to inherit Parent
  // Uncomment below line to see error message
  //class Child extends Parent

  // Unsealed Inheritance allows Child Class to inherit from Parent
  class newCold extends Child
}
