package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
//	Escribir un programa que pida un número al usuario e indique mediante un
//	literal booleano (true o false) si el número es par.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero");
		Integer num = sc.nextInt();
		Boolean esPar = num % 2 == 0;
		System.out.println("El numero es par: "+esPar);
		sc.close();
	}

}
