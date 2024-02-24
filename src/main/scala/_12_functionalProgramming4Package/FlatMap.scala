package _12_functionalProgramming4Package

object FlatMap extends App {

  /*
    FlatMap:
      - FlatMap is used to perform in place updates of all elements in a List
      - But the operation (usually a UDF) flattens the result in the form of elements of the list
   */

  val list = List(1, 2, 3, 4)

  //
  val toPair: (Int => List[Int]) = (num: Int) => List(num, num + 1)

  val flatMapList = list.flatMap(toPair) // Reduced to single List
  val mapList = list.map(toPair)         // List of Lists

  println(mapList)
  println(flatMapList)
}
