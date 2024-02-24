package _12_functionalProgramming4Package

object Filter extends App {

  /*
    Filter:
      - Filter is used to prepare a sub-list from a List based upon a specified condition
   */

  val list = List(1, 2, 3, 4)

  // Filter on List
  val newList = list.filter(_ % 2 == 0)
  newList.foreach(println)
}
