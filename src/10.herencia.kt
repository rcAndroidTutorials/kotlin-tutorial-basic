//Herencia: propiedad por la cual una clase hereda propiedades de la super clase o clase Padre
abstract class Figura(val x: Int, val y: Int) {
    abstract fun calcularArea(): Double
}
class Cuadrado(val lado: Int, x: Int, y: Int): Figura(x,y) {
    override fun calcularArea() = (lado*lado).toDouble()
}
class Triangulo(val base: Int, val altura: Int, x: Int, y: Int): Figura(x,y) {
    override fun calcularArea() = (base*altura/2).toDouble()
}

fun main() {
    val c = Cuadrado(4, 5, 10)
    val t = Triangulo(10, 5, 0, 0)
    val t2 = Triangulo(20, 50, 10, 10)
    println(c.x)
    println(t.base)
    println(t.y)

    val listaFiguras: List<Figura> = listOf(c,t,t2)
    mostrarAreas(listaFiguras)
}

fun mostrarAreas(figuras: List<Figura>) {
    for (figura in figuras) {
        println(figura.calcularArea())
    }
}