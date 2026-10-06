package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
//	Solicita tres números enteros a, b y c. Calcula y muestra el resultado de las
//	expresiones a + b * c y (a + b) * c. Comprueba que los resultados pueden ser
//	distintos y explica mediante un comentario en el código el motivo.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el valor de a");
		Integer a = sc.nextInt();
		System.out.println("Deme el valor de b");
		Integer b = sc.nextInt();
		System.out.println("Deme el valor de c");
		Integer c = sc.nextInt();
		Integer resultado1 = a+b*c;
		Integer resultado2 = (a+b)*c;
		// La multiplicacion tiene mayor prioridad que la suma, pero los parentesis cambian el orden de las operaciones.
		System.out.println("Resultado de a + b * c: "+resultado1);
		System.out.println("Resultado de (a + b) * c: "+resultado2);
		sc.close();
	}

}
