package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
//	Escribe un programa en el que declares una constante IVA de valor igual a 21.
//	A continuación, pídele un precio al usuario (recuerda que los precios
//	contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Integer IVA = 21;
		System.out.println("Deme precio");
		Double precio = sc.nextDouble();
		Double precioFinal = precio+precio*IVA/100;
		System.out.println("El precio final con IVA es: "+precioFinal);
		sc.close();
	}

}
