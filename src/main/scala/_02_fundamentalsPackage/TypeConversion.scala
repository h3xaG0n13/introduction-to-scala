package _02_fundamentalsPackage

object TypeConversion extends App {

  /*
    Type Conversion: Converting the data stored a variable to a different type
                     Scala doesn't allow implicit conversion.
                     Explicit conversion is performed by using to<type> method.
   */


  var aByte: Byte = 12
  var aShort: Short = aByte.toShort
  var aInt: Int = aShort.toInt
  var aLong: Long = aInt.toLong
  var aFloat: Float = aLong.toFloat
  var aDouble: Double = aFloat.toDouble

  // Conversion to Boolean will throw an error
  // Uncomment the below line to view the error
  // var aBoolean = aString.toBoolean
}
