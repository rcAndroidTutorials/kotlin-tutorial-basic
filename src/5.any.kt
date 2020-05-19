// El tipo Any es lo que Object a Java
// Any es el supertipo de todos los tipos en Kotlin
fun main() {

    //1. crea distintas variables de tipo Any
    val x: Any = 2
    val nombre: Any = "Antonio"


    //2. crea distintas variables de tipo Any?
    val y: Any?= 2
    val apellidos: Any? = null

    //En definitiva Object es la super clase de todas las clases en Java, mientras que
    //Any es la super clases de todas las clases no opcionales en kotlin
    //Any? si queremos también usar el valor null

}