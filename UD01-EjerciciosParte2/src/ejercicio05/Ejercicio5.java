package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {
//	Escribe un programa que solicite un número real y muestre su valor absoluto y su
//	raíz cuadrada utilizando métodos de la clase Math. Prueba el programa con
//	diferentes valores positivos.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero real positivo");
		Double numero = sc.nextDouble();
		Double valorAbsoluto = Math.abs(numero);
		Double raizCuadrada = Math.sqrt(numero);
		System.out.println("El valor absoluto es: "+valorAbsoluto);
		System.out.println("La raiz cuadrada es: "+raizCuadrada);
		sc.close();
	}

}
