package ejercicio17;

import java.util.Scanner;

/**
 * 17. Triángulo de números. Con bucles for anidados.
 */
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
