package _11_functionalProgramming3Package

object Lists extends App {

  /*
    List:
      - A linear Sequence which is immutable
   */

  val list: List[Int] = List(1, 2, 3, 4)

  // List Operations
  println(s"Prepend to List: ${5 :: list}")
  println(s"Prepend to List: ${5 +: list}")
  println(s"Append to List: ${list :+ 6}")

  // Generate List
  println(List.fill(5)(1))

  // Convert List to String with Delimiter
  println(List.fill(5)(1).mkString("_"))

  // Grouping of List data
  val customerList = List("John", "Jodie", "Joey", "James")
  println(customerList.groupBy(name => name.length))

}
