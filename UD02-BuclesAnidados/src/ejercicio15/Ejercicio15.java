package ejercicio15;

import java.util.Scanner;

/**
 * 15. Diagonal principal. Con bucles for anidados.
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
