//SEMANA 4
val cedula  = "1108765432"
//cedula = “1108765433” error por valor inmutable


val cedula  = "1108765432"
val cedula  = "1108765433" //se puede cambiar valor volviendo a declarar


var cedula  = "1108765433" //var para hacer cambios en el valor (mutable)

//Asignar un valor
(x:Double) => -Math.pow(x, 2) + 8*x - 12
val f1 = (x:Double) => -Math.pow(x, 2) + 8*x - 12
f1(12)
//val f1val = f1(12)
((x:Double) => -Math.pow(x, 2) + 8*x - 12)(12) //funcion sin nombre

//Funcion como parametro
def integracion (a:Int, b:Int, f : Double => Double) = {
	val intermedio = ((a+b)/2.0)
	val fa = f(a)
	val fi = f(intermedio)
	val fb = f(b)
	(b-a)*(fa+4*fi+fb)/6
}

//Funcion que devuelve funcion
def select (option : Char) : (Int : Int) => Double = {
	option match {
		case '1' => (a: Int, b: Int) => a+b
		case '2' => (a: Int, b: Int) => a-b
		case '3' => (a: Int, b: Int) => a*b
		case '4' => (a: Int, b: Int) => a/b.toDouble
		case _ => (a: Int, b: Int) => 0/(a+b)
	}
}
select('+')(2, 1) //funcion sin nombre 
val operation = select ('+')
operation(2, 1)

//EJERCICIO Obtener valores secuenciales
val isEven = (k: Int) => if (k%2 == 0) 1 else 0
def isEven (k: Int) : Int => (k%2) match {
	case 0 => 1
	case _ => 0
}
def countEven (s : List[Int]) : Int = s.map (isEven).sum
def countEven (s: List[Int]) : Int = {
def isEven (k: Int) : Int => (k%2) match {
	case 0 => 1
	case _ => 0
}
//DECLARAR ARREGLO L->List[ Int ]}
//explicacion de suma y mapeo
val nums = List(1,2,3)
nums.map(x => x+1)

def add1 (a: Int) : Int = a+1
nums.map(add1)
nums.map(x=>add1(x))
nums.map(add1(_))

val sumaDos = (a: Int, b:Int) => a+b
nums.map(x => sumaDos(x, x))

 //MAPEO
List (1, 2, 3).map (x=> x*x+100*x)
res1: List [Int] = List (101, 204, 309)


def func1 (x : Int) : Int = x*x+100*x
List (1, 2, 3).map (func1)
res3: List [Int] = List(101, 204, 309)

List (1, 2, 3) map (func1) //mapeo sin punto