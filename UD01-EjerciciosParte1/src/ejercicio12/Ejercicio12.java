package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
//	Un frutero necesita calcular los beneficios anuales que obtiene de la venta de
//	manzanas y peras. Se solicitan las ventas en kilos y se calcula el importe total,
//	sabiendo que el kilo de manzanas cuesta 2,35€ y el kilo de peras 1,95€.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme kilos de manzanas vendidos");
		Double kilosManzanas = sc.nextDouble();
		System.out.println("Deme kilos de peras vendidos");
		Double kilosPeras = sc.nextDouble();
		Double total = kilosManzanas*2.35+kilosPeras*1.95;
		System.out.println("El importe total es: "+total+" euros");
		sc.close();
	}

}
