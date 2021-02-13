interface Productor<out T> {
    fun producir(): T
}
interface Consumidor<in T> {
    fun consumir(item: T)
}
interface ProductorConsumidor<T> {
    fun produce(): T
    fun consume(item: T)
}

open class Comida
open class ComidaRapida : Comida()
class Hamburguesa : ComidaRapida()
class Pizza : ComidaRapida()

class TiendaDeComida : Productor<Comida> {
    override fun producir(): Comida {
        println("Producir comida")
        return Comida()
    }
}
class TiendaComidaRapida : Productor<ComidaRapida> {
    override fun producir(): ComidaRapida {
        println("Producir comida rápida")
        return ComidaRapida()
    }
}
class TiendaHamburguesa : Productor<Hamburguesa> {
    override fun producir(): Hamburguesa {
        println("Producir Hamburguesa")
        return Hamburguesa()
    }
}

class TodaLaGente : Consumidor<Comida> {
    override fun consumir(item: Comida) {
        println("Comer comida")
    }
}

class GenteModerna : Consumidor<ComidaRapida> {
    override fun consumir(item: ComidaRapida) {
        println("Comer comida rápida")
    }
}

class Americanos : Consumidor<Hamburguesa> {
    override fun consumir(item: Hamburguesa) {
        println("Comer hamburguesa")
    }
}

fun main() {
    val productor1 : Productor<Comida> = TiendaDeComida()
    val productor2 : Productor<Comida> = TiendaComidaRapida()
    val productor3 : Productor<Comida> = TiendaHamburguesa()

    val consumidor1 : Consumidor<Hamburguesa> = TodaLaGente()
    val consumidor2 : Consumidor<Hamburguesa> = GenteModerna()
    val consumidor3 : Consumidor<Hamburguesa> = Americanos()


}
fun imprimirNombre(persona: Persona?){
    persona?.also { println(it.nombre) }
}
fun imprimirEdad(persona: Persona){
    println(persona.edad)
}
