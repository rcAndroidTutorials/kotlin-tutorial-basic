/**
 * //Definción Java
 public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
 */

class Persona(val nombre: String, var edad: Int, private val dni: String)

fun main() {
    val p1 = Persona("Oscar", 21, "585788890F")
    val p2 = Persona("Jose", 32, "225733890C")
    val p3 = Persona("Alvaro", 16, "111188890H")

    val nombreP1 = p1.nombre
    val edadP1 = p1.edad
//    val dniP1 = p1.dni
    println("El nombre de p1 es: $nombreP1")
    println("La edad de p1 es: $edadP1")

    val colegio = Colegio("Mi colegio", 300)
}

//Otras constructoras
class Alumno constructor(val nombre: String, val edad: Int) {
    //...
}
class Coche {
    val numeroPuertas: Int
    val marca: String
    init {
        numeroPuertas = 4
    }
    init {
        marca = "BMW"
    }
}
class Coche2 {
    val numeroPuertas: Int = 4
    val marca: String = "BMW"
}
class Colegio {
    val nombre: String
    var numAlumnos: Int
    constructor(nombre: String, numAlumnos: Int) {
        this.nombre = nombre
        this.numAlumnos = numAlumnos
    }
}

class Usuario {
    var usuario: String
    var password: String
    constructor(password: String){
        this.usuario = ""
        this.password = password
    }
    constructor(usuario: String, password: String): this(password){
        this.usuario = usuario
    }
}







