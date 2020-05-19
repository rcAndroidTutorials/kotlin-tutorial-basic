// En kotlin los diccionarios son mapas
fun main() {
    // 1. crear un mapa(similar a HashMap en Java) con los datos de una persona
    val mapPersona = mapOf("nombre" to "Juan", "edad" to 30, "dirección" to "Madrid")
    val dias = mapOf("mes" to "Mayo", 18 to "Lunes", 19 to "Martes" )

    //2. crear un mapa dentro de otro mapa
    val mapPais = mapOf(
            "nombre" to "España",
            "capital" to mapOf(
                    "nombre" to "Madrid",
                    "habitantes" to 6662000
            )
    )

    //3.
}