package ejercicio09;

import java.util.Scanner;

public class Ejercicio9 {
//	Un depósito contiene una cantidad de litros de agua y se quiere llenar botellas de
//	una capacidad determinada. Solicita ambos valores y calcula cuántas botellas
//	completas pueden llenarse utilizando Math.floor().
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme los litros de agua del deposito");
		Double litros = sc.nextDouble();
		System.out.println("Deme la capacidad de cada botella en litros");
		Double capacidad = sc.nextDouble();
		Integer botellas = (int)Math.floor(litros/capacidad);
		System.out.println("Se pueden llenar "+botellas+" botellas completas");
		sc.close();
	}

}
