package ejercicio05;

import java.util.Scanner;

/**
 * 5. Factorial de un entero no negativo; se usa long hasta 20!.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número para calcular factorial: ");
        Integer numero = sc.nextInt();
        if (numero < 0 || numero > 20) {
            System.out.println("Introduce un número entre 0 y 20 (long)");
        } else {
            Long factorial = 1L;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println(numero + "! = " + factorial);
        }
        sc.close();
    }
}
