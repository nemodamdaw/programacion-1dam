package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {
//	Escribir una aplicación que pida el año actual y el año
//	de nacimiento del usuario. Debe calcular su edad.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme año actual");
		Integer anyoActual = sc.nextInt();
		System.out.println("Deme año de nacimiento");
		Integer anyoNacimiento = sc.nextInt();
		System.out.println("la edad es: "+(anyoActual-anyoNacimiento));
		sc.close();

	}

}
