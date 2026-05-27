// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 4: Clase Conductora de Instanciación Dinámica

package caso04_static;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("=== DEMOSTRACIÓN DEL USO DE STATIC ===");
        
        // Estado Inicial antes de crear objetos
        System.out.println("Objetos creados inicialmente: " + Contador.getTotalObjetos());
        System.out.println("------------------------------------------------");

        // 1. Creamos la primera instancia de forma directa
        System.out.println("-> Instanciando objeto 1...");
        new Contador(); // Al usar 'new', el constructor se ejecuta y suma 1 automáticamente
        System.out.println("Total registrado en memoria: " + Contador.getTotalObjetos());
        
        // 2. Creamos la segunda instancia
        System.out.println("-> Instanciando objeto 2...");
        new Contador();
        System.out.println("Total registrado en memoria: " + Contador.getTotalObjetos());
        
        // 3. Creamos la tercera instancia
        System.out.println("-> Instanciando objeto 3...");
        new Contador();
        System.out.println("Total registrado en memoria: " + Contador.getTotalObjetos());

        // ==========================================================
        // Validación del concepto de Variable Compartida
        // ==========================================================
        System.out.println("------------------------------------------------");
        System.out.println("REPORTE DE VERIFICACIÓN DE INSTANCIAS:");
        System.out.println("------------------------------------------------");
        System.out.println("Cantidad de objetos totales en el sistema: " + Contador.contador);
        System.out.println("------------------------------------------------");
        System.out.println("Fin del programa - Caso 4 completado con éxito.");
    }
}