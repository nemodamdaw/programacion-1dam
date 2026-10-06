package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
//	Escribir un programa que solicite las notas enteras del primer, segundo y tercer
//	trimestre. Debe mostrar la nota media del curso como se utiliza en el boletín de
//	calificaciones (parte entera) y como se usa en el expediente académico (decimales).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme nota del primer trimestre");
		Integer nota1 = sc.nextInt();
		System.out.println("Deme nota del segundo trimestre");
		Integer nota2 = sc.nextInt();
		System.out.println("Deme nota del tercer trimestre");
		Integer nota3 = sc.nextInt();
		Integer mediaBoletin = (nota1+nota2+nota3)/3;
		Double mediaExpediente = (nota1+nota2+nota3)/3.0;
		System.out.println("La nota media del boletin es: "+mediaBoletin);
		System.out.println("La nota media del expediente es: "+mediaExpediente);
		sc.close();
	}

}
