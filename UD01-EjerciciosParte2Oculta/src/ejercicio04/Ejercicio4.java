package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {
//	Dado el siguiente polinomio de segundo grado:
//	y=ax²+bx+c
//	Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y
//	calcula el valor correspondiente de y.
//
//	NO HAY QUE RESOLVER LA ECUACIÓN, SÓLO SUSTITUIR LOS VALORES
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el coeficiente a");
		Double a = sc.nextDouble();
		System.out.println("Deme el coeficiente b");
		Double b = sc.nextDouble();
		System.out.println("Deme el coeficiente c");
		Double c = sc.nextDouble();
		System.out.println("Deme el valor de x");
		Double x = sc.nextDouble();
		Double y = a*x*x + b*x + c;
		System.out.println("El valor de y es: "+y);
		sc.close();
	}

}
