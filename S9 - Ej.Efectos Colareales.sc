//EJEMPLOS (TRY) -> INGRESAR DATOS

import scala.io.StdIn

val name = StdIn.readLine("Nombre: ")
Nombre: Jorge
name: String
= "Jorge"
-- TOINT
val edad = StdIn.readLine("Edad: ").toint
Edad: 20
edad: Int
= 20 //puede dar un error al escribirse mal la sentencia a convertir

val edad = StdIn.readLine("Edad: ").toint
Edad: Veinte
java.langNumberFormatException: For input string
: "Veinte"

val edad = StdIn.readLine("Edad: ").toint
Edad: 20.0
java.langNumberFormatException: For input string
: "20.0"

//solucion correcta
val edad = Try {
  StdIn.readLine("Edad: ").toint
}
Edad: Veinte
edad java
.langNumberFormatException: For input string
: "20.0" **

//ejemplo

import scala.io.StdIn

object Exa8 {
  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine("Nombre: ")
    val age = StdIn.readLine("Edad: ").toInt
    val weight = StdIn.readLine("Peso: ").toDouble
    printf("Hola %s, tienes %d años y pesas %fkg\n",
      name,
      age match {
        case Success(v) => v
        case Failure(e) => "ERROR"
      }
    weight match {
      case Success(v) => v
      case Failure(e) => "ERROR"
    }

  }
}

//EJEMPLO SOLUCION DE EFECTOS COLATERALES
case class User(Name: String)

def getUser(id: Int): User =
  id(Set(1, 2, 3).contains(id)) User (s"User-$id")
else null
println(getUser(1).name)
println(getUser(10).name)

-- solucionando el efecto colateral
def getUser(idd: Int): Option[User] =
  if (Set(1, 2, 3).contains(id)) someUser(s"User-$id") else null

val result = getuser(31)
result match {
  case Some(v) => println(v, name)
  case None => println("Usuario no encontrado")
}

val values = Lisst("1", "3", "5", "9", "2", "20")
values.map(toInt)

import scala.util.Try

values.map(v = Try {
  v.toInt
})

//validar una URL

import scala.util.TRy

def parseURL
__
