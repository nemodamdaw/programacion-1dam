package ejercicio06;

import java.util.Scanner;

public class Ejercicio6 {
//	Escribir un programa que le pida dos números al usuario. A continuación, debe
//	mostrar la suma, la resta, la multiplicación y la división de ambos números.
//	Debe mostrarse el resultado de cada operación en una línea distinta.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme primer numero");
		Double num1 = sc.nextDouble();
		System.out.println("Deme segundo numero");
		Double num2 = sc.nextDouble();
		System.out.println("La suma es: "+(num1+num2));
		System.out.println("La resta es: "+(num1-num2));
		System.out.println("La multiplicacion es: "+(num1*num2));
		System.out.println("La division es: "+(num1/num2));
		sc.close();
	}

}
