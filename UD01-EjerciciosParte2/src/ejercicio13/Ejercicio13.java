package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
//	Pide al usuario una cantidad de dinero con decimales. Mediante un cast a int
//	obtén la cantidad de euros enteros. A partir de la parte decimal, calcula también los
//	céntimos y redondéalos correctamente.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cantidad de dinero");
		Double cantidad = sc.nextDouble();
		Integer euros = (int)(double)cantidad;
		Integer centimos = (int)Math.round((cantidad-euros)*100);
		euros += centimos/100;
		centimos %= 100;
		System.out.println("Euros: "+euros);
		System.out.println("Centimos: "+centimos);
		sc.close();
	}

}
