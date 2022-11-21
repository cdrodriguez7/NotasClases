//Solucion de prueba parcial 1 B1
val valores = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5, 1956.1 )
def promedio (valores : List[Double]) : Double = valores.sum / valores.size //size para listas cortas -> lenght "otros metodos"
def desvEst (valores : List[Double]) : Double = {
	val avg = promedio(valores)
	
	def varianza (valores : List[Double]) : Double =
		valores.map(x=>Math.pow(x - avg, 2) * (1.0 / (valores.size - 1))
	Math.sqrt((varianza(valores))
}

	//condiciones
 def clasifica (valores : List[Double]) : Unit = }
 val s = desvEst(valores)
 val avg = promedio(valores)

 (1 to 3).foreach (i =>
	println(valores.filter (x =>
		x >= (avg -i * s) && x <= (avg + i * s)).size))
 }

//Tuplas -> hasta 22 datos (como una sola unidad)
--Almacena elemenos de diferente tipo como un contenedor
val par = (1, "Abad Ana") //tupla de dos elementos
println(par._1) // -> devuelve 1
println(par._2) // -> devuelve Abad Ana

val student = (1, "Abad Ana")
val student: Tuple2[Int, String]
val (edad, nombre) = student

val datos = ("jorgaf", ¨M¨, 45, 95.2, true)
val datos: Tuple5[String, Char, Int, Double, Boolean]
 //metodos de tuplas
.swap // darle la vuelta a una tupla 
.canEqual((1, "Abad Ana")) //compara la tupla como parametro con la tupla inicial


//colecciones de datos
scala-lang.org/api/3.x/
/* Conjuntos (listado de valores unicos) - Seucnecias (listado de valores)-Listas-Colas-Pilas-Arreglo - Mapas (listado de pares)*/

//Listas
--Inmutables
val values = List(41,31,36,40,43
val frutas : List[String] = ("peras","manzanas")

val myList = (List(10,20,30,40,50,60)
myList.isEmpty
myList.drop(2) // elimina los n primeros elementos
myList.dropWhile(_<25)
myList.slice(2, 4) // devuelve una lista con los valores de las posiciones
myList.tail
myList.take(3)
myList.takeWhile(_<30)
myList.sorted
myList.sorted(Ordering.Int.reverse)

myList.foldLeft(0) ( (x, y) => x+y)
myList.foldLeft(0) (_+_)

myList.foldRight(0) ( (x, y) => x+y)
myList.foldRight(0) (_+_)

def average (valores : Seq[Double]) : Double = {
	val t = valores.foldLeft((0.0, 0)) ((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
	t._1 / t._2
}

def average2 (valores : Seq[Double]) : Double = {
 val t = valores.foldLeft((0.0, 0) { (acc, currVal) =>
	val sum = acc._1 + currVal
	val cont = acc._2 + 1
	println("sum: %f - contador: %d%n", sum, cont)
	(sum, cont)
 }
 t._1 / t._2
}

//.zip -> fucionar dos tuplas formando 
//.unzip -> Seperar dos tupas
