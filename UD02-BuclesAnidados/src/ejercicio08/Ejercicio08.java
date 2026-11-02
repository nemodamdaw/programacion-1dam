package ejercicio08;

import java.util.Scanner;

/**
 * 8. Pirámide invertida. Con bucles for anidados.
 */
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura o tamaño N: ");
		Integer n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j < i || j > 2 * n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
