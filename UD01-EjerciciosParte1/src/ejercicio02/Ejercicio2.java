package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {
//	2. Pedir al usuario su edad y mostrar la edad que tendrá el 
//	próximo año.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme su edad");
		Integer edad = sc.nextInt();
		System.out.println("El proximo anyo tienes es: "+(edad+1));
		sc.close();

	}

}
