package _04_oops1Package

import _04_oops1Package.Objects.StaticImplement.{staticAttribute, staticMethod}

object Objects extends App {

  /*
    Object: Unlike other OOP Languages, an Object in Scala is different.
            It is a Singleton instance of a Class. No other instances exist.

    Note:
      - Scala doesn't allow Static Method or Attributes unless it is Abstract Class.
      - Object however allows both Static Method or Attributes.

    Companion: A Class together with an Object of same name can use Static Attributes or Methods.
               The ability of having same Object and Class name in the same scope is called Companion.
   */

  // Object with Static Attribute and Method
  object StaticImplement {
   val staticAttribute: Int = 10
   def staticMethod: String = "Hello"
  }

  // Class with same name as Companion Object
  class StaticImplement {
    def showInt: Int = staticAttribute
    def showString: String = staticMethod
  }

  // Accessing Static Attribute and Method
  println(StaticImplement.staticAttribute)
  println(StaticImplement.staticMethod)

  // Instance of Class
  // Static Attribute and Method referred
  val newStatic = new StaticImplement
  println(newStatic.showInt)
  println(newStatic.showString)

}
