package _12_functionalProgramming4Package

object Map extends App {

  /*
    Map:
      - Map is used to perform an operation on each element of a List
      - Updated results are in same order as the initial list.
   */

  // Define a List
  val list = List(1, 2, 3, 4)

  // Implementation of Map to Square each element
  val newList1 = list.map(_ * 2)
  newList1.foreach(println)

  // Alternate Implementation of Map
  val newList2 = list.map(element => element * 2)
  newList2.foreach(println)

}
