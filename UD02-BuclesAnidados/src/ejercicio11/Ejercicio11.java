package ejercicio11;

import java.util.Scanner;

/**
 * 11. Rectángulo de columnas alternas. Con bucles for anidados.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        Integer filas = sc.nextInt();
        System.out.print("Columnas: ");
        Integer columnas = sc.nextInt();
        if (filas <= 0 || columnas <= 0) {
            System.out.println("Dimensiones no válidas");
        } else {
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
                    if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
