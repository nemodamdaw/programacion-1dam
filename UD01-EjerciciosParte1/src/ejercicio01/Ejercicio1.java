package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {
//	Diseña un programa que pida un número al usuario y a continuación lo
//	muestre.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero");
		Integer num = sc.nextInt();
		System.out.println("El numero introducido es: "+num);
		sc.close();
	}

}
