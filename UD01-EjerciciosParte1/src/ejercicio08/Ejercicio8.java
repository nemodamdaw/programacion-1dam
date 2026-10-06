package ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {
//	Escribe un programa que pida al usuario su nombre y su edad y muestre por
//	pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué
//	mayor eres!”.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme su nombre");
		String nombre = sc.nextLine();
		System.out.println("Deme su edad");
		Integer edad = sc.nextInt();
		System.out.println("Hola "+nombre+", tienes "+edad+" años, ¡que mayor eres!");
		sc.close();
	}

}
