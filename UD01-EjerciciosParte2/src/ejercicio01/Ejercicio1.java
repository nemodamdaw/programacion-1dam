package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {
//	Escribe un programa que solicite al usuario la base y la altura de un rectángulo
//	(pueden contener decimales). Debe calcular y mostrar su perímetro y su área.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme la base del rectangulo");
		Double base = sc.nextDouble();
		System.out.println("Deme la altura del rectangulo");
		Double altura = sc.nextDouble();
		Double perimetro = 2*(base+altura);
		Double area = base*altura;
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El area es: "+area);
		sc.close();
	}

}
