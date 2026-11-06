package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {
//		Ejemplos: precioEntrada(10, "SABADO", true) → 7; precioEntrada(35, "LUNES", false) → 8; precioEntrada(66, 
//				"VIERNES", true) → 5; precioEntrada(-1, "LUNES", false) → -1. 
		Integer x = Ejercicios.precioEntrada(10, "SABADO", true);
		System.out.println(x);
		System.out.println(Ejercicios.precioEntrada(35, "LUNES", false)); 
		System.out.println(Ejercicios.precioEntrada(66, "VIERNES", true)); 
		System.out.println(Ejercicios.precioEntrada(-1, "LUNES", false)); 
		Ejercicios.dibujarZ(5);
		
//		Ejemplos: sumaPrimerosEspeciales(1, 10, 3) → 10 (2 + 3 + 5); sumaPrimerosEspeciales(1, 10, 5) → 23 (2 + 3 + 
//				5 + 6 + 7); sumaPrimerosEspeciales(8, 15, 2) → 24 (11 + 13).
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		
//		Ejemplos: factorialConSaltos(7, 2) → 105; factorialConSaltos(8, 3) → 80; factorialConSaltos(5, 1) → 120; 
//		factorialConSaltos(0, 2) → 1.
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		
		// contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2) → 3
	 System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 3));	
	 
	 
//	 Examples: countNonOverlappingPairs(List.of(2, 3, 2, 8, 7)) → 2; countNonOverlappingPairs(List.of(1, 2, 3)) → 1; 
//	 countNonOverlappingPairs(List.of(1, 1, 1)) → 0. 
	 System.out.println(Ejercicios.countNonOverlappingPairs(List.of(2, 3, 2, 8, 7)));
	 System.out.println(Ejercicios.countNonOverlappingPairs(List.of(1, 2, 3)));
	 System.out.println(Ejercicios.countNonOverlappingPairs(List.of(1, 1, 1)));
	}

}











