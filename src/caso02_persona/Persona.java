// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 2: Entidad Persona - Atributos y Comportamiento.

package caso02_persona;

public class Persona {
    
    // ==========================================
    // Atributos de la Clase (Estado del objeto)
    // ==========================================
    String nombre;
    int edad;

    // ==================================================
    // Constructor: Inicializa el objeto con sus datos
    // ==================================================
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el nombre recibido al atributo de la clase
        this.edad = edad;     // Asigna la edad recibida al atributo de la clase
    }

    // ==========================================================
    // Método de comportamiento: Muestra la información formateada
    // ==========================================================
    public void mostrarDatos() {
        System.out.println("-----------------------------------");
        System.out.println("INFORMACIÓN DE LA PERSONA");
        System.out.println("-----------------------------------");
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Edad   : " + this.edad + " años");
    }
}