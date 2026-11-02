package ejercicio13;

import java.util.Scanner;

/**
 * 13. Rectángulo dos zonas verticales. Con bucles for anidados.
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if (j <= columnas / 2) {
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
