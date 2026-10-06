package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {
//	Una tienda aplica un descuento fijo del 15% y, posteriormente, un IVA del 21%.
//	Declara ambos porcentajes como constantes. Pide el precio inicial al usuario,
//	calcula el precio final y muéstralo redondeado a dos cifras decimales utilizando
//	Math.round().
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Double DESCUENTO = 0.15;
		final Double IVA = 0.21;
		System.out.println("Deme el precio inicial");
		Double precio = sc.nextDouble();
		Double precioConDescuento = precio*(1-DESCUENTO);
		Double precioFinal = precioConDescuento*(1+IVA);
		precioFinal = Math.round(precioFinal*100.0)/100.0;
		System.out.println("El precio final es: "+precioFinal+" euros");
		sc.close();
	}

}
