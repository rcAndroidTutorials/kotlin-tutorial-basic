import java.lang.Exception

/**
 * ANDROIDE SDK
 * Author: Algoritmo
 * Ciclo de vida de una Actividad
 * Estado 1: Crear
 * Estado 2: Iniciar
 * Estado 3: Pausar
 * Estado 4: Destruir
 *
 * Es obligatorio que las subclases sigan este ciclo de vida.
 */
open class Actividad(protected val preferencias: MutableMap<String, Any> = mutableMapOf()) {
    protected var crearOK = false
    protected var iniciarOK = false
    protected var pausarOK = false
    protected var destruirOK = false
    open fun alCrear() {
        crearOK = true
        println("creando actividad")
    }
    open fun alIniciar(){
        if (!crearOK) { throw Exception("ERROR: No has pasado por el estado CREAR") }
        iniciarOK = true
        println("Iniciando actividad")
    }
    open fun alPausar() {
        if (!iniciarOK) { throw Exception("ERROR: No has pasado por el estado INICIAR") }
        pausarOK = true
        println("Pausando actividad")
    }
    open fun alDestruir() {
        if (!pausarOK) { throw Exception("ERROR: No has pasado por el estado PAUSAR") }
        destruirOK = true
        println("Destruyendo actividad")
    }
}
class Manifiesto(val pantallas: MutableList<Actividad> = mutableListOf())
class AndroideApp {
    val manifiesto: Manifiesto = Manifiesto()
    fun iniciarApp() {
        println("Iniciando Androide App")
        println("======================")
        println()
        for (pantalla in manifiesto.pantallas) {
            println("Pantalla ${pantalla.javaClass.name}")
            pantalla.alCrear()
            pantalla.alIniciar()
            pantalla.alPausar()
            pantalla.alDestruir()
            println("======================")
            println()
            Thread.sleep(2500)
        }
    }
}
