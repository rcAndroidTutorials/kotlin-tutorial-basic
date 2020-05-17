fun main() {
    //1. declaracion de variable sólo indicando el tipo
    val x: Int
    val esAzul: Boolean
    val apellidos: String

    //2. declaracion de variables indicando el tipo de dato y el valor
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1
    println("El valor de a es "+a)
    println("El valor de a es $a") // la forma recomendada por kotlin

    //3. declaración de variables sólo indicando el valor
    val nombre = "Sergio" // en este caso Kotlin deduce el tipo de dato string a partir del valor
    val edad = 30 // en este caso Kotlin deduce el tipo de dato Int a partir del valor

    //4. intenta modificar alguna de las variables anteriores
//    edad = edad +1 // esto provoca un error en tiempo de compilación
//    a = 13  // esto provoca un error en tiempo de compilación

//    5. intentar asignar null a alguna  variable
//    val marca: String = null // esto provoca un error en tiempo de compilación

    //6. val sirve para declarar variables de solo lectura, es decir, no mutables.
    //Si queremos definir variables mutables debemos usar la palabra reservada var
    var sueldo = 3000
    sueldo += 500
    var contador = 0
    contador++
    contador.plus(1) // contador++, pero esta la opcion recomendad por kotlin

//    //7. cuando debemos usar val o var? en realidad podemos usar siempre var y no habría
//    //problemas en el proyecto, pero la realidad es que la programación es una trabajo que
//    //se realiza en equipo y val sirve para darle semántica al código que escribimos.
//    //En la práctica, si tenemos un proyecto de cientos de miles de líneas de código,
//    //el poder saber de un vistazo si una variable mutará o no a lo largo del código
//    //es muy útil para el resto del equipo que trabaja en el mismo proyecto.

}
