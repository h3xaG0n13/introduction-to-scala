package _02_fundamentalsPackage

object PrimitiveDataTypes extends App {

  /*
    Primitive Types: These are the simplest data types in Scala used to build more complex types.

    Numeric Types: Used to store Integer numbers
      - Short: 16-bit length storage
      - Int: 32-bit length storage
      - Long: 64-bit length storage

    Textual Types: Used to store Decimal numbers
      - Float: 32-bit length storage
      - Double: 64-bit length storage

    String Types: Used to store String Characters
      - Char: 16-bit length storage of single character
      - String: 64-bit length storage of single character

    Boolean Types: Used to store Boolean values
      - True
      - False
   */

  // Numeric Types
  var aByte: Byte = -128
  var bByte: Byte = 127

  val aShort: Short = -32768
  val bShort: Short = 32767

  val aInt: Int = -2147483648
  val bInt: Int = 2147483647

  // Usage of L at the end of assigned number to denote Long
  val aLong: Long = -9223372036854775808L
  val bLong: Long = 9223372036854775807L

  // Textual Types
  val aFloat: Float = 1.40129846432481707e-45f
  val bFloat: Float = 3.40282346638528860e+38f

  val aDouble: Double = 4.94065645841246544e-324d
  val bDouble: Double = 1.79769313486231570e+308d

  // String Types
  val aChar: Char = 't'

  val aString: String = "Hello, World!"


  // Boolean Types
  val aBoolean: Boolean = true
  val bBoolean: Boolean = false
}
