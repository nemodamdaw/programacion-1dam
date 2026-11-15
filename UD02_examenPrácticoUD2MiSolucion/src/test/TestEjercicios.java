package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	public static void main(String[] args) {
		
		System.out.println("Ejercicio 1");
//		Ejemplos: 
//		clasificarTriangulo(3, 4, 5) → "RECTANGULO"; 
//		clasificarTriangulo(5, 5, 5) → "EQUILATERO"; 
//		clasificarTriangulo(5, 5, 8) → "ISOSCELES"; 
//		clasificarTriangulo(4, 6, 9) → "ESCALENO"; 
//		clasificarTriangulo(2, 2, 4) → "INVALIDO".

		System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8));
		System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9));
		System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4));
	
		System.out.println("Ejercicio 2");
		Ejercicios.trianguloAlterno(0);
		System.out.println();
		Ejercicios.trianguloAlterno(1);
		System.out.println();
		Ejercicios.trianguloAlterno(5);
		
		System.out.println("Ejercicio 3");
//		Ejemplos: 
//		primeroConDivisores(10, 20, 4) → 12; 
//		primeroConDivisores(2, 10, 3) → 6; 
//		primeroConDivisores(13, 13, 2) → -1; 
//		primeroConDivisores(10, 10, 3) → 10.
		
		System.out.println(Ejercicios.primeroConDivisores(10, 20, 4));
		System.out.println(Ejercicios.primeroConDivisores(2, 10, 3));
		System.out.println(Ejercicios.primeroConDivisores(13, 13, 2));
		System.out.println(Ejercicios.primeroConDivisores(10, 10, 3));
		
		System.out.println("Ejercicio 4");
//		Ejemplos: 
//		tribonacci(0) → 0; 
//		tribonacci(1) → 1; 
//		tribonacci(2) → 1; 
//		tribonacci(3) → 2; 
//		tribonacci(5) → 7; 
//		tribonacci(7) → 24.
		System.out.println(Ejercicios.tribonacci(0));
		System.out.println(Ejercicios.tribonacci(1));
		System.out.println(Ejercicios.tribonacci(2));
		System.out.println(Ejercicios.tribonacci(3));
		System.out.println(Ejercicios.tribonacci(5));
		System.out.println(Ejercicios.tribonacci(7));
		
		
		System.out.println("Ejercicio 5");
//		Ejemplos: 
//		esCasiCreciente(List.of(2, 4, 6, 8)) → true; 
//		esCasiCreciente(List.of(2, 5, 3, 7, 9)) → true; 
//		esCasiCreciente(List.of(2, 5, 3, 7, 4)) → false; 
//		esCasiCreciente(List.of(1, 3, 3, 5)) → true.
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 4, 6, 8)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 9)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 4)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(1, 3, 3, 5)));
		
		System.out.println("Ejercicio 6");
//		Ejemplos: 
//		primeraVentanaObjetivo(List.of(2, 1, 5, 3, 2), 3, 9) → 1; 
//		primeraVentanaObjetivo(List.of(2, 1, 5, 3, 2), 3, 11) → -1; 
//		primeraVentanaObjetivo(List.of(4, 4, 1, 6), 2, 8) → 0; 
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(2, 1, 5, 3, 2), 3, 9));
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(2, 1, 5, 3, 2), 3, 11));
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(4, 4, 1, 6), 2, 8));
		
		System.out.println("Ejercicio 7");
//		Examples:
//		alternatesEvenOdd(List.of(2, 3, 8, 5)) → true; 
//		alternatesEvenOdd(List.of(1, 4, 7, 10)) → true; 
//		alternatesEvenOdd(List.of(2, 3, 5, 8)) → false; 
//		alternatesEvenOdd(List.of(2, 4, 7, 8)) → false; 
//		alternatesEvenOdd(List.of(3)) → true; 
//		alternatesEvenOdd(List.of()) → true.
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 8, 5)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(1, 4, 7, 10)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 5, 8)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 4, 7, 8)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(3)));
		System.out.println(Ejercicios.alternatesEvenOdd(List.of()));
	}

}
