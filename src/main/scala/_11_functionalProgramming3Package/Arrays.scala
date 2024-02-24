package _11_functionalProgramming3Package

object Arrays extends App
{

  /*
    Arrays:
      - Sequence with pre-defined length that can be mutated i.e. updated in place
   */

  // Create an empty string with no value
  val array1 = Array.ofDim[Int](4)        // -> Array(0, 0, 0, 0)
  val array2 = Array.ofDim[String](4)     // -> Array(null, null, null, null)
  val array3 = Array.ofDim[Boolean](4)     // -> Array(false, false, false, false)

  // User defined Array
  val array4: Array[Int] = Array(1, 2, 3, 4)

  // Update in place
  array4(2) = 10
  array4.foreach(println)

}
