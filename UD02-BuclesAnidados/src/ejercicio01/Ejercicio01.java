package ejercicio01;

import java.util.Scanner;

/**
 * 1. Rectángulo macizo. Con bucles for anidados.
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Columnas: ");
		Integer columnas = sc.nextInt();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
