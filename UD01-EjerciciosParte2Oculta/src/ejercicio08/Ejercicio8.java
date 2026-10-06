package ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {
//	La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
//	competición donde cada participante escribe un algoritmo en un papel y lo
//	lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso
//	es que la longitud del lanzamiento se mide en metros (con tantos decimales
//	como se desee), pero para el ranking solo se tiene en cuenta la longitud en
//	centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m,
//	que son 1234,56 cm solo se contabilizan 1234 cm.
//	Realiza un programa que solicite la longitud (en metros) de un lanzamiento y
//	muestre la parte entera correspondiente en centímetros. Utiliza la conversión
//	de tipos.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme la longitud del lanzamiento en metros");
		Double metros = sc.nextDouble();
		Integer centimetros = (int)(metros*100);
		System.out.println("La longitud para el ranking es: "+centimetros+" centimetros");
		sc.close();
	}

}
