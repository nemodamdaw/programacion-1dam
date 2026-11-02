package ejercicio07;

import java.util.Scanner;

/**
 * 7. Calculadora con menú y opción E para salir.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("A. SUMAR");
            System.out.println("B. RESTAR");
            System.out.println("C. MULTIPLICAR");
            System.out.println("D. DIVIDIR");
            System.out.println("E. SALIR");
            System.out.print("Opción: ");
            opcion = sc.next();
            if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C") || opcion.equals("D")) {
                System.out.print("Primer número: ");
                Double a = sc.nextDouble();
                System.out.print("Segundo número: ");
                Double b = sc.nextDouble();
                switch (opcion) {
                    case "A": System.out.println("Resultado: " + (a + b)); break;
                    case "B": System.out.println("Resultado: " + (a - b)); break;
                    case "C": System.out.println("Resultado: " + (a * b)); break;
                    case "D":
                        if (b == 0) {
                            System.out.println("No se puede dividir entre cero");
                        } else {
                            System.out.println("Resultado: " + (a / b));
                        }
                        break;
                }
            } else if (!opcion.equals("E")) {
                System.out.println("Opción incorrecta");
            }
        } while (!opcion.equals("E"));
        System.out.println("Fin de la calculadora");
        sc.close();
    }
}
