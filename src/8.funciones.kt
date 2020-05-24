fun main() {
    // fun nombreFuncion(parametro1: Int, parametro2: Persona) : Int {
    // ....
    //}
    imprimirPrefijo("saludos a todos")
    imprimirSaludo()
    imprimirSaludo("Hola Matias")
    val resultado = suma(10,20)
    println(resultado)
    println(alCuadrado(5))
    println(alCuadrado(5.5))
}
fun imprimirPrefijo(mensaje: String) {
    println("Algoritmo: $mensaje")
}
fun imprimirSaludo(mensaje: String = "Hola Algoritmo") {
    println(mensaje)
}
fun suma(a: Int, b: Int): Int {
    val s = a + b
    return s
}
fun alCuadrado(x: Int) = x * x
fun alCuadrado(y: Double) = y * y