package _11_functionalProgramming3Package

object Maps extends App {

  /*
    Maps:
      - Maps allow a Key-value pairs
   */

  val map: Map[Int, String] = Map((1, "John"), (2, "Judy")).withDefaultValue(null)

  // Map operations
  println(s"Check specific key exists: ${map.contains(2)}")
  val newElement1 = (3, "Jodie")
  val newElement2 = (4 -> "James")
  println(s"Append to map: ${map + newElement1 + newElement2}")

  // Default Value to return
  println(s"Search Key not present: ${map(3)}")
}
