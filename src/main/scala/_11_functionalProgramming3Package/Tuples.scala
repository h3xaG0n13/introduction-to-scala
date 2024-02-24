package _11_functionalProgramming3Package

object Tuples extends App {

  /*
    Tuples:
      - Tuples are Finite Ordered List
   */

  val tuple = new Tuple2[Int, String](1, "Hello, World!")
  println(tuple)

  // Tuple operations
  println(tuple._1)           // Element in position 1
  println(tuple.swap)         // Reverse the Tuple elements
  println(tuple.copy(_1 = 2)) // Update in place

}
