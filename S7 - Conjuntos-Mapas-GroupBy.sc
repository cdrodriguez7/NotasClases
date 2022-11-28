val goleadores = List(  ("Francisco Fydriszewski", 10), 
                        ("Joaquin Vergés", 9),
                        ("Santiago Giordana", 9),
                        ("Ismael Díaz", 8),
                        ("Tomás Molina", 7),
                        ("Danny Luna", 7),
                        ("Cristian Martínez", 7),
                        ("Grabiel Cortez", 7),
                        ("Leonardo Villagra", 6)
			("Michael Hoyos, 6")
                    )
val goles = goleadores.map(_._2).map(_.toDouble)
val average =
	(values: List[Double]) => values.sum/values.length
val avgGol = average(goles)
goleadores.maxBy(_._2)._1
goleadores.minBy(_._2)._1
val mayoresAvg = goleadores.filter(_._2 > avgGol).map(_._1)

//Conjuntos
val conj2 : Set[Int] = set() //conjunto vacio
val conjunto : Set[Int] = ser(1,1,2,2,2,3) 	//Un que esten repetidos, solo se toma un solo valor
						//devuelve (1,2,3)
val conNuevo = conjunto + 6 //agregar un nuevo dato al conjunto
val conNuevoc = conjunto.concat(List(2,3,4,5)) //concatenar los no repetidos
conNuevo.intersecto(conjunto) //devuelve los no repetidos (4,5)

//Mapas o diccionarios
//siempre va a tener una CLAVE y un VALOR que pueden ser cualquier tipo de dato
Map[k, v] //klaves y valores
Map(("apples", 3), ("oranges", 2), ("pears", 0)) //todos los pares deben tener la misma combinacion
Map(("apples"-> 3), ("oranges"-> 2), ("pears"-> 0))
//convertir a mapas
List(("apples", 3), ("oranges", 2), ("pears", 0)).toMap
Tuple(("apples", 3), ("oranges", 2), ("pears", 0)).toMap

//mapa a pares de tuplas
Map(("apples", 3), ("oranges", 2), ("pears", 0)).toSeq

//mapa a lista
Map(("apples", 3), ("oranges", 2), ("pears", 0)).toList

val fuitBasket = Map("apples" -> 3, "oranges" -> 2, "pear" -> 0)
fruitBasket.map(data => data match{		//"data" es el par de datos: clave y valor
	case(fruit, count) => count*2
})
fruitBasket.map{ case(fruit, count) => count*2} 
fruitBasket.map{ case(fruit, count) => (fruit, count*10) } 
fruitBasket.map{ case(fruit, count) => (fruit, count, count*10) }.map 
	{ case (fruit, _, count2) => (fruit, count2/2 )}.toMap

//F. group by
//reorganizar la secuencia en un mapa donde se agrupan en subsecuencias como nosotros deseemos
List("wombat", "xanthan", "yogurt", "zebra").groupBy
	(s => if (s starsWith "y") 1 else 2) //matchcase


List(1,2,3,4,5).groupBy( k => k % 3)


goleadores.groupBy{
  case(_,goles) => goles
}.map/*(row => row match*/ {
  case (goles, lista) => (goles,lista.size)
}/*)*/.toList.sortBy(_._2)

