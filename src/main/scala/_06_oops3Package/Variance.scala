package _06_oops3Package

object Variance extends App {

  /*
    Variance:
      - Generics allow usage of different Type parameters for the same Class, Trait or Method.
      - This can become an issue if the Generic Parameter is defined as Parent Class.
        Any Child Class inheriting the Parent can used as well as the Child inherits Parent properties.
      - If we are attempting to store elements in a Collection as part of a Generic Class,
        this can introduce variance in the types stored in the collection.
   */

  // Parent Class defined with 2 Child Classes inheriting from it
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // Generic Class defined with Method
  // Parameter shows Type Parameter Class
  class ListOfAnimals[T] {
    def addAnimal(animal: T): Unit = println(s"Added Animal ${animal.getClass}")
  }

  // Instances of Child Class created
  val spinx = new Cat
  val rotweiller = new Dog


  // Instance of Generic Class Created with Parent Class as Type Parameter
  val listOfCats = new ListOfAnimals[Animal]
  // Although the instance of Generic Class is for a List of Cats
  // Both instances of Cat and Dog Class can be added
  listOfCats.addAnimal(spinx)
  listOfCats.addAnimal(rotweiller)
}
