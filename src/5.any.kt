import java.awt.Color

// El tipo Any es lo que Object a Java
// Any es el supertipo de todos los tipos en Kotlin
fun main() {

    //1. crea distintas variables de tipo Any
    val x: Any = 2
    val nombre: Any = "Antonio"
    val estatura: Any = 1.7

    //2. crea distintas variables de tipo Any?
    val y: Any?= 2
    val apellidos: Any? = null

    val numeros = listOf<Any>(15, "20", 30.5, "cien", false)

    //En definitiva Object es la super clase de todas las clases en Java, mientras que
    //Any es la super clases de todas las clases NO OPCIONALES en kotlin
    //Any? si queremos también usar el valor null

}