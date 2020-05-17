//ESTRUCTURAS DE CONTROL
fun main(args: Array<String>) {
    //1. escribe codigo if/else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("El máximo de a ó b es " +max)
    // As expression
    val max2 = if (a > b) a else b

    //2. Escribe codigo if/else usando WHEN
    val x:Int = 2
    when (x) {
        1 -> {
            println("caso 1")
            println("x = = 1")
        }
        2 -> {
            println("caso 2")
            println("x = = 2")
        }
        else -> {
            println("x no es ni 1 ni 2")
        }
    }
}
