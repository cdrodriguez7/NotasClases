comportamiento y estado
//Teorema de los efectos colaterales ()
//funcion que modifica una variable global
/*int cont =0;
void addOne(){
  cont = cont + 1;
}*/
print toma el estado del sistema
  newState = print("hola") + oldState
-- modifica el valor de una variable o de ima estructura de datos mutable
  -- utiliza mecanismo de IO(entrada y salida) leer archivos
, imprimir
, guardar escribir en una base de datos
-- lanzar una excepcion (try - catch)
-- se detiene por un error
  //soluciones para efectos colaterales
  -- codificar los efectos como si fuesen datos
, excluir las excepciones
//impura
def division(n1: Double, n2: Double) =
  if (n2 == 0) throw new RuntimeException("Division por 0") //-> fenomenos respresentados como datos = reificacion
  else n1 / n2
//pura

import sacala.util.Try

def pureDivision(n1: Double, n2: Double): Try[Double] =
  Try {
    division(n1, n2)
  }

val result = pureDivision(1, 3)

import scala.util.{
  Success, Failure
  result match {
  case Succes (v) => println (v)
  case Failure (e) => println (e.getMessege)
}

//ejemplo java
String search (String id) {
  var students = List.of("1-Valencia", "2-Caicedo", "3-Galindez");
  for (
  var student: students
  )
  {
    if (student.starsWith(id)) {
      return student;
    }
  }
  return null;
}
//option/some/none (evitar un pointer null exception)
def toInt(s: String): Option[Int] = {
  try {
    some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  }
}
toInt("1")
toInt("Uno")
val txtNumbers = List("1", "2", "foo", "3", "bar")
txtNumbers.map(toInt)
txtNumbers.map(toInt).flatten
//obtener valores
val x = toInt("1").getOrElse(0)
toInt("1").foreach { i =>
  printf("Obtener un Int:%d, i)}
    toInt ("1") match {
    case Some(i) => println(i)
    case Nose => println("That didn´t work")
  }

  //either/left/right
  def divideXByY(x: Int, y: Int): Either[String, Int] =
    if (y = 0) Left("No se puede dividir por 0")
    else Right(x / y)

  val x = divideXByY(1, 1).right.getOrElse(0)
  val x = divideXByY(1, 0).right.getOrElse(0)
  divideXByY(1, 0) match {
    case Left(s) => println("Answer: " + s)
    case Right(i) => println("Answer: " + i)
  }