package _06_oops3Package

object Contravariant extends App {

  /*
    Contravariant:
      - Contravariance allows an Instance of Generic Class with Type Parameter as Child to be same as
        the instance of Generic Class with Type Parameter as Parent
      - Comparing with the previous Variance Example:
        - List[Cat] = List[Animal]
      - It is different from Covariance as the variable of Generic Class with Type Child Class
        is being assigned an instance of Generic Class with Type Parameter as Parent Class
   */

  // Parent Class defined with a Child Class inheriting from it
  class Animal
  class Cat extends Animal

  // Using Covariant List to allow List[Cat] = List[Animal]
  class ContravariantList[-A]
  val newListOfAnimals: ContravariantList[Cat] = new ContravariantList[Animal]

}
