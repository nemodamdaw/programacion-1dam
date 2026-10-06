package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
//	Diseñar un algoritmo que indique si podemos salir a la calle. Solo podremos
//	salir si no está lloviendo y hemos finalizado las tareas, salvo que tengamos
//	que ir a la biblioteca, en cuyo caso podremos salir igualmente.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Llueve? (true/false)");
		Boolean llueve = sc.nextBoolean();
		System.out.println("¿Ha finalizado las tareas? (true/false)");
		Boolean tareasFinalizadas = sc.nextBoolean();
		System.out.println("¿Necesita ir a la biblioteca? (true/false)");
		Boolean biblioteca = sc.nextBoolean();
		Boolean puedeSalir = (!llueve && tareasFinalizadas) || biblioteca;
		System.out.println("Puede salir a la calle: "+puedeSalir);
		sc.close();
	}

}
