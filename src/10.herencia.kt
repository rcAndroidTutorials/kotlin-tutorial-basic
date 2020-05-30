//Herencia: propiedad por la cual una clase hereda propiedades de la super clase o clase Padre

/*
                    Figura(Supeclase o clase padre)

                /       |       \
               /        |        \
              /         |         \
        Cuadrado    Triangulo   Circulo     ETC...

 */
open class Figura(var x: Int, var y: Int) {
    fun imprimirCoordenadas() {
        println("Las coordenadas son: ($x,$y)")
    }
    fun horizontalmente(mover: Int) {
        this.x = this.x + mover
    }
    fun verticalmente(mover: Int) {
        this.y = this.y + mover
    }
}
class Cuadrado(val lado: Int, x: Int, y: Int): Figura(x,y)
class Triangulo(val base: Int, val altura: Int): Figura(0, 0)
class Circulo(val radio: Int, x: Int, y: Int): Figura(x,y) {
    fun rodarHorizontalmente(vueltas: Int) {
        this.x = this.x + vueltas * this.radio
    }
}

fun main() {
    println("Resultados de Cuadrado")
    val c = Cuadrado(10, 20,20)
    c.imprimirCoordenadas()
    c.horizontalmente(10)
    c.imprimirCoordenadas()

    println("Resultados de Triangulo")
    val t = Triangulo(10, 20)
    t.imprimirCoordenadas()
    t.verticalmente(15)
    t.imprimirCoordenadas()

    println("Resultados de Circulo")
    val cir = Circulo(1, 0, 10)
    cir.imprimirCoordenadas()
    cir.rodarHorizontalmente(5)
    cir.imprimirCoordenadas()
}