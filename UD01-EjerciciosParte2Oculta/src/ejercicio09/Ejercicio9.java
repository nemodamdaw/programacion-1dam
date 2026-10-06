package ejercicio09;

import java.util.Scanner;

public class Ejercicio9 {
//	(Acepta el reto) En muchos jueces on-line (¡Acepta el reto! entre ellos) cada
//	problema tiene un identificador único para poderlo referenciar de manera
//	unívoca dentro del sistema. Los identificadores son números naturales
//	correlativos, y el primer problema recibe el número 100.
//
//	Empezar en 100, en lugar de en 1 (o en 0), no es un capricho. Los problemas se
//	"archivan" en volúmenes, cada uno compuesto por 100 problemas. Al asignar
//	el número 100 al primer problema, es fácil saber en qué volumen está
//	cualquier problema a partir de su identificador. En concreto, el primer
//	volumen de problemas contiene a aquellos que tienen como identificador los
//	números entre 100 y 199, el volumen 2 contiene los problemas con
//	identificadores 200-299, etcétera.
//
//	Dado un problema, ¿en qué volumen está?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el identificador del problema");
		Integer identificador = sc.nextInt();
		Integer volumen = identificador/100;
		System.out.println("El problema esta en el volumen: "+volumen);
		sc.close();
	}

}
