
//Filtrar y truncar secuencias
//Ejemplos
val nums = List(6, 8, 7, 11, 28, 11)
nums.max

nums.min

nums.size
//exists filter takeWhile - Predicados - función que devuelve valor lógico(boolean)
a to b => a<= x <=b
a until b => a<= x < b

//forall y exists
def isPrime(nro: Int) : Boolean = (2 until nro).forall(nro % _ != 0)
//forall devuelve true si todos los valores de la lista son true

//def isPrime(nro: Int) : Boolean = !(2 until nro).exists(nro % _ == 0)
//exists devuelve true si uno de los valores de la lista es true

//filter -> devuelve una lista que únicamente contiene los valores que cumplen con el predicado
List( 1, 2, 3, 4, 5 ).filter( k => k % 3 != 0)

//takeWhile -> filtra la lista hasta que encuentra el valor del predicado
List( 1, 2, 3, 4, 5 ).takeWhile( k => k % 3 != 0)


//Ejemplo1
val names = List( "Leo", "Cristiano", "Enner", "Felipe")
names.map(_.length())

//Ejemplo2
val numbers = List(3, 4, 7, 11, 12)
val isPrime = (nro : Int) => ( 2 to nro -1 ).forall( nro % _ != 0 )
numbers.map(isPrime(_) match{
    case true => 1
    case false => 0
}).sum

//Filtrar y truncar secuencias
//Ejemplos
val nums = List(6, 8, 7, 11, 28, 15)
nums.max

nums.min

nums.size
//exists filter takeWhile - Predicados - función que devuelve valor lógico(boolean)

//forall y exists
def isPrimeforAll(nro: Int) : Boolean = (2 until nro).forall(nro % _ != 0)

def isPrimeExis(nro: Int) : Boolean = !(2 until nro).exists(nro % _ == 0)

//filter
List( 1, 2, 3, 4, 5 ).filter( k => k % 3 != 0)

//takeWhile
List( 1, 2, 3, 4, 5 ).takeWhile( _ % 3 != 0)

//Numeros perfectos
val divP = (n: Int) => (1 until n).filter(div => n % div == 0)
val sumDiv = (n: Int) => (1 until n).filter(div => n % div == 0).sum

nums.filter(nro => nro == sumDiv(nro)).size
nums.filter(nro => nro < sumDiv(nro)).size
nums.filter(nro => nro > sumDiv(nro)).size

//Factorial escalonado n!! para enteros positivos 8!! = 384
def factorialEscalonado(n : Int ) : Int  = {
    n % 2 match {
        case 0 => (2 to n by 2).product
        case _ => (1 to n by 2).product
    }
}
factorialEscalonado(8)
factorialEscalonado(9)

val numbers = (1 to 20).toList

//Contar Pares
numbers.filter( nro => nro % 2 == 0).size
numbers.count( nro => nro % 2 == 0)

//Contar Impares
numbers.filter( nro => nro % 2 != 0).size
numbers.count( nro => nro % 2 != 0)

//Contar Primos
def contarPrimos(nros : List[Int]) : Int = {
    val isPrime = (n : Int) => (2 until n).forall(n % _ != 0)
    //nros.filter(isPrime).size
    nros.count(isPrime)
}
contarPrimos(numbers)

//Presentar 3 factores
def tresFactores(nros : List[Int]) : List[Int] ={
    val factores = (n: Int) => (2 until n).filter(n % _ == 0)

    nros.filter(nro => factores(nro).size == 3)
}

tresFactores((1 to 1000).toList)
