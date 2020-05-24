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
}

