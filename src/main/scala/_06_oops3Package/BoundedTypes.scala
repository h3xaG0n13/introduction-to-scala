package _06_oops3Package

object BoundedTypes extends App {

  /*
    Bounded Types:
      - Bounded Type Parameter allows only a SubClass or SuperClass to be passed as Generic Class Type Parameter
      - Depending on the direction of notation it can be SubClass (Upper Bound) or SuperClass (Lower Bound)
   */

  // Defining Classes with 3-tier Inheritance
  class Animal
  class Wolf extends Animal
  class Dog extends Wolf
  // Non-hierarchical class
  class Plant


  // Upper Bounded Type Parameter
  class Howl[A <: Wolf]

  // Instance of Generic Class can have Sub-Class as Type Parameter
  val howl1 = new Howl[Dog]
  // Uncomment to see the error message
  //val howl2 = new Howl[Animal]

  // Instance of any other Class outside the hierarchy is also not allowed as Type Parameter
  // Uncomment to see the error message
  //val sway1 = new Howl[Plant]


  // Lower Bound Type Parameter
  class Pack[A >: Wolf]

  // Instance of Generic Class can have Super-Class as Type Parameter
  val pack1 = new Pack[Animal]
  // Uncomment to see the error message
  //val pack2 = new Howl[Wolf]

  // Instance of any other Class outside the hierarchy is also not allowed as Type Parameter
  // Uncomment to see the error message
  //val sway2 = new Pack[Plant]

}
