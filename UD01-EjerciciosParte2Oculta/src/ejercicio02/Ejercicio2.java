package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {
//	Escribe un programa que tome como entrada un número entero e indique qué
//	cantidad hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay
//	que sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle
//	1. Usa el operador módulo (%) para calcularlo.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un numero entero");
		Integer numero = sc.nextInt();
		//Integer cantidad = (7 - numero % 7) == 7 ? 0: 7 - numero % 7;
		Integer cantidad = (7 - numero % 7)  % 7;
		System.out.println("Hay que sumarle: "+cantidad);
		sc.close();
	}

}
