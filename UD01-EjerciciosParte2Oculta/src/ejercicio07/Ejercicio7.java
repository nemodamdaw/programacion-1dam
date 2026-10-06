package ejercicio07;

import java.util.Scanner;

public class Ejercicio7 {
//	Una empresa que gestiona un parque acuático te solicita una aplicación que
//	les ayude a calcular el importe que hay que cobrar en la taquilla por la compra
//	de una serie de entradas (cuyo número será introducido por el usuario).
//	Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que
//	cuestan 20€. En el caso de que el importe total sea igual o superior a 100€, se
//	aplicará automáticamente un bono descuento del 5%.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el numero de entradas infantiles");
		Integer infantiles = sc.nextInt();
		System.out.println("Deme el numero de entradas de adultos");
		Integer adultos = sc.nextInt();
		Double importe = infantiles*15.50+adultos*20.0;
		Double total = importe >= 100 ? importe*0.95 : importe;
		System.out.println("El importe a pagar es: "+total+" euros");
		sc.close();
	}

}
