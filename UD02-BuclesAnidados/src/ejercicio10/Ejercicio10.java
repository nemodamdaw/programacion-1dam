package ejercicio10;

import java.util.Scanner;

/**
 * 10. Rectángulo de filas alternas. Con bucles for anidados.
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if (i % 2 == 1) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
