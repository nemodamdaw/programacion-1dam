package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {
//	Diseñar una aplicación que calcule la longitud y el área 
//	de una circunferencia. Para ello, el usuario debe introducir 
//	el radio, que puede contener decimales. Usa Math.PI para 
//	tomar el valor de PI. (longitud = 2πr, área=πr2)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme radio");
		Double radio = sc.nextDouble();
		Double longitud = 2*Math.PI*radio;
		System.out.println("la longitud es: "+longitud);
		Double area = Math.PI*radio*radio;
		System.out.println("el area es: "+area);
		sc.close();
	}

}
