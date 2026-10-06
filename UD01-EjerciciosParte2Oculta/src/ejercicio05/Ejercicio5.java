package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {
//	Diseña una aplicación que solicite al usuario que introduzca una cantidad de
//	segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay
//	en el número de segundos introducidos por el usuario.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cantidad de segundos");
		Integer totalSegundos = sc.nextInt();
		Integer horas = totalSegundos/3600;
		Integer minutos = (totalSegundos%3600)/60;
		Integer segundos = (totalSegundos%3600)%60;
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
		sc.close();
	}

}
