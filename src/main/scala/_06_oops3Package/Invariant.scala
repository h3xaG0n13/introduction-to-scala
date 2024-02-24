package _06_oops3Package

object Invariant extends App {

  /*
    Invariant:
      - Invariance causes an Instance of Generic Class with Type Parameter as Parent to NOT be same as
        the instance of Generic Class with Type Parameter as Child
      - Comparing with the previous Variance Example:
        - List[Animal] != List[Cat]
   */

  // Parent Class defined with a Child Class inheriting from it
  class Animal
  class Cat extends Animal

  // Generic Class
  class List[A]

  // Instance of Child Class assigned to a variable of Parent Class Type
  val animal1: Animal = new Cat
  // Instance of Generic Class with Type Parameter as Child Class
  // can not be assigned to a variable of Generic Class with Type Parameter as Parent Class
  // Uncomment below line to see error message
  //val listOfAnimals: List[Animal] = new List[Cat]

}
