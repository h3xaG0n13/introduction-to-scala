package _07_oops4Package

object Enumerator extends App {

  /*
    Enumerator:
      - Enumerator is a data type used to define constants in an immutable format
      - Method Definitions can be created against the Constants
   */

  // Defining Enumerator
  object Permissions extends Enumeration {
    val READ, WRITE, EXEC, NONE = Value
  }

  // Instantiating Enumerator
  val readPermission = Permissions.READ

}
