package ejercicio12;

import java.util.Scanner;

/**
 * 12. Tablero de ajedrez. Con bucles for anidados.
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if ((i + j) % 2 == 0) {
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
