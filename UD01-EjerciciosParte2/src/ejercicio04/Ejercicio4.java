package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {
//	Pide al usuario un número real y muestra: el entero inmediatamente inferior
//	mediante Math.floor(), el entero inmediatamente superior mediante Math.ceil() y el
//	entero más cercano mediante Math.round().
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero real");
		Double numero = sc.nextDouble();
		Double inferior = Math.floor(numero);
		Double superior = Math.ceil(numero);
		Long cercano = Math.round(numero);
		System.out.println("El entero inmediatamente inferior es: "+inferior);
		System.out.println("El entero inmediatamente superior es: "+superior);
		System.out.println("El entero mas cercano es: "+cercano);
		sc.close();
	}

}
