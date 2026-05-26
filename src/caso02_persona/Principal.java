// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 2: Clase Conductora de Instanciación.

package caso02_persona;

public class Principal {

    public static void main(String[] args) {
        
        // ==========================================================
        // Paso 1: Creación (Instanciación) del Primer Objeto Persona
        // ==========================================================
        // Se utiliza el constructor para pasar los datos directamente
        Persona persona1 = new Persona("Carlos Mendoza", 28);
        
        // ==========================================================
        // Paso 2: Creación (Instanciación) del Segundo Objeto Persona
        // ==========================================================
        Persona persona2 = new Persona("Ana Gómez", 22);
        
        // ==========================================================
        // Paso 3: Invocación de métodos para mostrar los resultados
        // ==========================================================
        // Cada objeto invoca al método y responde con sus propios datos internos
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        
        System.out.println("-----------------------------------");
        System.out.println("Fin del programa - Caso 2 completado.");
    }
}