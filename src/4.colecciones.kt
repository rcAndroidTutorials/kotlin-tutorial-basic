//Las estructuras de datos son una parte muy importante de cualquier lengujae de programación
fun main(args: Array<String>) {
    //1. Crear variables del tipo MutableList y List
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyNumbers: List<Int> = numbers // immutable list
    println("lista mutable--"+numbers) // prints "[1, 2, 3]"
    numbers.add(4)
    println("lista mutable despues de añadir 4 --"+numbers) // prints "[1, 2, 3, 4]"
    println(readOnlyNumbers)
//    readOnlyNumbers.clear()    // esto provoca un error en tiempo de compilacion

    //2. acceder a las posiciones del MutableList y List
    println(numbers[0])
    println(readOnlyNumbers[1])
    //3. obtener el primer y ultimo elemento
    println(numbers.first())
    println(numbers.last())
}
