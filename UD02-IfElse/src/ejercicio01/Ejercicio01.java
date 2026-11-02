package ejercicio01;

import java.util.Scanner;

/**
 * 1. Comprobar si un número es par o impar.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        Integer numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        sc.close();
    }
}
