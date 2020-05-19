//Las estructuras de datos son una parte muy importante de cualquier lengujae de programación
//Y otra vez es importante los conceptos mutable e inmutable.
fun main() {
    //1. Crear variables del tipo MutableList y List
    println("======== Ejercicio 1 ===========")
    val numeros: List<Int> = listOf(1,2,3,4) // immutable list
    val numerosMutable: MutableList<Int> = mutableListOf(1, 2, 3)
    println("lista mutable -> $numerosMutable")
    numerosMutable.add(4)
    println("lista mutable despues de añadir 4 -> $numerosMutable")
    println(numeros)
//    numeros.clear()    // esto provoca un error en tiempo de compilacion


    //2. acceder a las posiciones del MutableList y List
    println("======== Ejercicio 2 ===========")
    println(numerosMutable[0])
    println(numeros[1])


    //3. obtener el primer y ultimo elemento
    println("======== Ejercicio 3 ===========")
    println(numerosMutable.first())
    println(numerosMutable.last())


    //4. Crear la lista llamada numerosPares con los numeros pares de la variable numeros
    println("======== Ejercicio 4 ===========")
    val nuevaListaPares: MutableList<Int> = mutableListOf()
    for(n in numeros) {
        if (n%2 == 0) {
            nuevaListaPares.add(n)
        }
    }
    println("Nueva lista de pares: $nuevaListaPares")
    //Solución kotlin
    val numerosPares: List<Int> = numeros.filter { it % 2 == 0 }
    println("Nueva lista de pares: $numerosPares")


    //5. Mostrar el último numero par de la lista edades
    println("======== Ejercicio 5 ===========")
    val edades = listOf(18,33,25,12,11,15)
    val ultimaEdadPar = edades.last { it%2 == 0 }
    println("edades = $edades")
    println("Última edad par: $ultimaEdadPar")
}
