package ejercicio03;

import java.util.Scanner;

/**
 * 3. Calculadora de cuatro operaciones mediante switch.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        Double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        Double b = sc.nextDouble();
        System.out.println("A. SUMAR");
        System.out.println("B. RESTAR");
        System.out.println("C. MULTIPLICAR");
        System.out.println("D. DIVIDIR");
        System.out.print("Opción: ");
        String opcion = sc.next().toUpperCase();
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
            default: System.out.println("Opción incorrecta");
        }
        sc.close();
    }
}
