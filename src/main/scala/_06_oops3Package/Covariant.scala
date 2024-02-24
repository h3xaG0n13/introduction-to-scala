package _06_oops3Package

object Covariant extends App {

  /*
    Covariant:
      - Covariance allows an Instance of Generic Class with Type Parameter as Parent to be same as
        the instance of Generic Class with Type Parameter as Child
      - Comparing with the previous Variance Example:
        - List[Animal] = List[Cat]
   */

  // Parent Class defined with a Child Class inheriting from it
  class Animal
  class Cat extends Animal

  // Using Covariant List to allow List[Animal] = List[Cat]
  class CovariantList[+A]
  val newListOfAnimals: CovariantList[Animal] = new CovariantList[Cat]
}
