package ejercicio05;

import java.util.Scanner;

/**
 * 5. Triángulo abajo a la derecha. Con bucles for anidados.
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
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
