package ejercicio14;

import java.util.Scanner;

/**
 * 14. Rectángulo dos zonas horizontales. Con bucles for anidados.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if (i <= filas / 2) {
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
