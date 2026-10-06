package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {
//	Crear una aplicación que calcule la media aritmética de 
//	dos notas enteras. Hay que tener en cuenta que la nota 
//	media puede tener decimales.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme primera nota");
		Integer nota1 = sc.nextInt();
		System.out.println("Deme nota 2");
		Integer nota2 = sc.nextInt();
		Double media = (nota1+nota2)/2.0;
		System.out.println("la media es: "+ media);
		sc.close();


	}

}
