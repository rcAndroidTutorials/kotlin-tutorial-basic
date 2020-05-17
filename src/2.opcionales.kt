//Tipos de datos opcionales: Null Safety
//Null Safety es la propiedad por el cual Kotlin nos ayuda
//a gestionar el uso de valores null

fun main() {
    //1. Declara una variable no null
    var nuncaNull: String = "Esta variable nunca es nula"
    //2. Error de compilación al intentar asignar null a una variable no nula
//    nuncaNull = null
    //3. Declara una variable String que pueda ser nula
    var nombre: String? = "Matias"
    //4. asigna un valor nulo a nombre
    nombre = null // a diferencia del punto 2, aquí no hay error de compilación
    //5. que pasa si no indicamos el tipo?
    var apellidos: String? = "Sanchez"
    //6. intenta asignar null a la variable apellidos
    apellidos = null //esto provoca un error de compilación
    //7. Intenta declarar otros tipos de datos null safety
    var edad: Int? = null
    edad = 15
    var altura: Double? = 30.0
    altura = null
    var cierto: Boolean? = null
    cierto = true

    //8. para qué sirve null safety en kotlin?, tal y como su nombre indica
    //esto sirve para asegurarnos de que los tipos de datos que manipulamos
    //puedan ser null o no, esto propiedad de kotlin es una práctica muy
    //recomendada y que ayuda a mejorar la calidad del código que escribimos.

}


