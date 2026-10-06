package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
//	(Acepta el reto) El cinquecento es un periodo del arte europeo
//	(principalmente italiano) enclavado en pleno Renacimiento. Aunque su
//	nombre esconde el número cinco, en realidad ¡pertenece al siglo XVI!
//	Cinquecento es, abreviadamente, "años [mil] quinientos", en italiano, y es que
//	el siglo XVI comprendió los años desde el 1501 al 1600, igual que el siglo XXI
//	empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21.
//
//	Dado un año, ¿de qué siglo es?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un anyo");
		Integer anyo = sc.nextInt();
		Integer siglo = (anyo-1)/100+1;
		System.out.println("El siglo es: "+siglo);
		sc.close();
	}

}
