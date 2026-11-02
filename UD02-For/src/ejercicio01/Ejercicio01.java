package ejercicio01;

import java.util.Scanner;

/**
 * 1. Contar del 1 a N usando for.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N: ");
        Integer n = sc.nextInt();
        if (n < 1) {
            System.out.println("N debe ser positivo");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
