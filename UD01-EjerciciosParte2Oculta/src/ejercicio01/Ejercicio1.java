package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {
//	Realizar un programa que pida como entrada un número con decimales y lo
//	muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero con decimales");
		Double numero = sc.nextDouble();
		Integer redondeado = numero >= 0 ? (int)(numero + 0.5) : (int)(numero - 0.5);
		System.out.println("El numero redondeado es: "+redondeado);
		sc.close();
	}

}
