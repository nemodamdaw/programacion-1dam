package ejercicio03;

import java.util.Scanner;

/**
 * 3. Resolver una ecuación de segundo grado con soluciones reales.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coeficiente a: ");
        Double a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        Double b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        Double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado");
        } else {
            Double discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                System.out.println("No tiene soluciones reales");
            } else if (discriminante == 0) {
                Double solucion = -b / (2 * a);
                System.out.println("Solución doble: " + solucion);
            } else {
                Double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                Double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Soluciones: " + x1 + " y " + x2);
            }
        }
        sc.close();
    }
}
