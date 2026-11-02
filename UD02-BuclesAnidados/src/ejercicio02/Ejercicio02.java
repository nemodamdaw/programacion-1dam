package ejercicio02;

import java.util.Scanner;

/**
 * 2. Rectángulo hueco. Con bucles for anidados.
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
