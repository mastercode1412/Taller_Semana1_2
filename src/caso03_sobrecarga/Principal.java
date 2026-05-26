// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 3: Clase Conductora para Demostración de Sobrecarga

package caso03_sobrecarga;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciamos el objeto de la clase Operacion
        Operacion op = new Operacion();
        
        System.out.println("=== DEMOSTRACIÓN DE SOBRECARGA DE MÉTODOS ===");
        
        // 1. Invocación de la Primera Firma: sumar(int, int)
        int resultadoEntero2 = op.sumar(15, 25);
        System.out.println("1. Suma de dos enteros (15 + 25)      = " + resultadoEntero2);
        
        // 2. Invocación de la Segunda Firma: sumar(double, double)
        double resultadoDecimal = op.sumar(12.5, 7.3);
        System.out.println("2. Suma de dos decimales (12.5 + 7.3) = " + resultadoDecimal);
        
        // 3. Invocación de la Tercera Firma: sumar(int, int, int)
        int resultadoEntero3 = op.sumar(10, 20, 30);
        System.out.println("3. Suma de tres enteros (10 + 20 + 30) = " + resultadoEntero3);
        
        System.out.println("------------------------------------------------");
        System.out.println("Fin del programa - Caso 3 completado con éxito.");
    }
}