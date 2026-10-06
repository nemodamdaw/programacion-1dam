package ejercicio07;

import java.util.Scanner;

public class Ejercicio7 {
//	Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
//	Guarda cada dato en variables distintas. A continuación, muestra los datos.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme su nombre");
		String nombre = sc.nextLine();
		System.out.println("Deme su direccion");
		String direccion = sc.nextLine();
		System.out.println("Deme su telefono");
		String telefono = sc.nextLine();
		System.out.println("Nombre: "+nombre);
		System.out.println("Direccion: "+direccion);
		System.out.println("Telefono: "+telefono);
		sc.close();
	}

}
