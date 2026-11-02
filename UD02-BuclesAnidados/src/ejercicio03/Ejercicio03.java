package ejercicio03;

import java.util.Scanner;

/**
 * 3. Triángulo abajo a la izquierda. Con bucles for anidados.
 */
public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= i) {
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
