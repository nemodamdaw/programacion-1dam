package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
//	Solicita al usuario un año. Calcula mediante una expresión booleana si el año es
//	bisiesto. Muestra el resultado como true o false.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un anyo");
		Integer anyo = sc.nextInt();
		Boolean bisiesto = anyo%4==0 && anyo%100!=0 || anyo%400==0;
		System.out.println(bisiesto);
		sc.close();
	}

}
