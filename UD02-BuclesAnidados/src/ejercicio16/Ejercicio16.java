package ejercicio16;

import java.util.Scanner;

/**
 * 16. Dos diagonales. Con bucles for anidados.
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
