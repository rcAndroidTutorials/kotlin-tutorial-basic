// En kotlin los diccionarios son mapas
fun main() {
    // 1. crear un mapa(similar a HashMap en Java) con los datos de una persona
    val mapPersona = mapOf(
            "nombre" to "Juan",
            "edad" to 30,
            "dirección" to "Madrid")
    val dias = mapOf(
            "mes" to "Mayo",
            18 to "Lunes",
            19 to "Martes")

    //2. crear un mapa dentro de otro mapa
    val mapPais = mapOf(
            "nombre" to "España",
            "capital" to mapOf(
                    "nombre" to "Madrid",
                    "habitantes" to 6662000
            )
    )

    //3.Como acceder a los elementos que hay dentro de un mapa
    println(mapPersona["nombre"])
    println(dias["mes"])
    println(dias[18])
    val mapaCapital = mapPais["capital"] as Map<String, Any>
    println(mapaCapital["habitantes"])

//    4.Añadir un elemento al mapa
//    mapPersona["edad"] = 19
    val mapaMutable = mutableMapOf(
            "nombre" to "Juan",
            "edad" to 30,
            "dirección" to "Madrid")
    mapaMutable["genero"] = "masculino"
    mapaMutable["edad"] = 19

    //5. Crear un submapa usando filter
    val mapaEdad = mapaMutable.filter { it.key == "edad" }
    print(mapaEdad["edad"])
}