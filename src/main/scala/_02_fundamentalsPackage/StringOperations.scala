package _02_fundamentalsPackage

object StringOperations extends App {

  /*
    Scala has inherited the Java String Class along with methods.
    These methods allow users to perform operation on a String.
    In addition to these, Scala has it's own inbuilt methods to handle String.
   */

  val aString = "Hello, World!"

  println(aString.charAt(1))  // Return Char at position 1 i.e. 2nd Character
  println(aString.substring(3, 5))  // Return String with Char between Position 3 and 5
  println(aString.split(",").toList) // Split string against "," and return as List
  println(aString.startsWith("Hello"))  // Case-sensitive check in staring of String
  println(aString.replace(" ", "")) // Return String with replaced char(s)
  println(aString.toUpperCase())  // Return an Upper Case String
  println(aString.toLowerCase())  // Return an Lower Case String
  println(aString.length) // Return Length of a String
  println(aString.reverse)  // Return a String which has reverse order of Characters
  println(aString.take(3))  // Return 1st 3 Characters as a String


  println(aString.getClass) // Return the Class type of the value aString
  println("!" + aString)  // Return a String with "!" added to the String as Prefix
  println(aString + "!")  // Return a String with "!" added to the String as Suffix
  println(aString + '!')  // Return a String with Char('!') added to the String as Suffix

}
