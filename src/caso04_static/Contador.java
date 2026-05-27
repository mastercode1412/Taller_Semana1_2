// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 4: Atributos de Clase y Modificador Static

package caso04_static;

public class Contador {

    // ==========================================================
    // Atributo Estático: Compartido por TODAS las instancias
    // ==========================================================
    // No se reinicia al crear un objeto; reside en un área común de memoria.
    public static int contador = 0;

    // ==========================================================
    // Constructor de la Clase
    // ==========================================================
    // Cada vez que se use "new Contador()", este bloque se ejecutará
    // e incrementará la variable global compartida.
    public Contador() {
        contador++; // Incrementa en 1 el contador general
    }

    // ==========================================================
    // Método Estático: Permite consultar el valor actual de la clase
    // ==========================================================
    public static int getTotalObjetos() {
        return contador;
    }
}