package ejercicio09;

import java.util.Scanner;

public class Ejercicio9 {
//	Realizar una aplicación que solicite al usuario su edad y le indique si es mayor
//	de edad (mediante un literal booleano: true o false).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme su edad");
		Integer edad = sc.nextInt();
		Boolean mayorEdad = edad >= 18;
		System.out.println("Es mayor de edad: "+mayorEdad);
		sc.close();
	}

}
