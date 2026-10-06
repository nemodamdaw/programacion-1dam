package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
//	Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
//	introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado de
//	la conversión. (1€ = 166 ptas).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme cantidad en pesetas");
		Integer pesetas = sc.nextInt();
		Double euros = pesetas/166.0;
		System.out.println("La cantidad en euros es: "+euros);
		sc.close();
	}

}
