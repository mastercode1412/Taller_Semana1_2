// Autor: Francisco Portocarrero Rios
// Curso: Técnicas de Programación
// Caso Práctico 3: Sobrecarga de Métodos (Polimorfismo Estático).(segundo cambio)

package caso03_sobrecarga;

public class Operacion {

    // ==========================================================
    // Firma 1: Sumar dos números enteros (int)
    // ==========================================================
    public int sumar(int a, int b) {
        return a + b;
    }

    // ==========================================================
    // Firma 2: Sumar dos números decimales (double)
    // ==========================================================
    public double sumar(double a, double b) {
        return a + b;
    }

    // ==========================================================
    // Firma 3: Sumar tres números enteros (int, int, int)
    // ==========================================================
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}