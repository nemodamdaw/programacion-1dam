package ejercicio09;

import java.util.Scanner;

/**
 * 9. Rombo: pirámide creciente y decreciente sin repetir centro.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        Integer n = sc.nextInt();
        if (n <= 0) {
            System.out.println("N debe ser positivo");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j <= n - i || j > n + i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j <= n - i || j > n + i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
