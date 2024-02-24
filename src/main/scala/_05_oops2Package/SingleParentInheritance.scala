package _05_oops2Package

object SingleParentInheritance extends App {

  /*
    Single Parent Inheritance:
      - Scala allows Single Parent Inheritance
      - A Child Class can inherit one single Parent Class at a time
   */

  // Create Parent Classes
  class Father
  class GrandFather

  // Create Child Class
  // Attempting to inherit more than one Parent Class
  // Remove the comment to view the error message
  //class Child extends Father, GrandFather

}
