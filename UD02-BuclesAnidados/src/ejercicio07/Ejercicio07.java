package ejercicio07;

import java.util.Scanner;

/**
 * 7. Pirámide centrada. Con bucles for anidados.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura o tamaño N: ");
        Integer n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Dimensiones no válidas");
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
        }
        sc.close();
    }
}
