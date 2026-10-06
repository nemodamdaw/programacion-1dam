package ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {
//	Una empresa guarda productos en cajas con una capacidad determinada. Pide al
//	usuario el número de productos y la capacidad de cada caja. Calcula cuántas cajas
//	son necesarias para guardar todos los productos utilizando Math.ceil(). El
//	resultado final debe mostrarse como un número entero.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el numero de productos");
		Integer productos = sc.nextInt();
		System.out.println("Deme la capacidad de cada caja");
		Integer capacidad = sc.nextInt();
		Integer cajas = (int)Math.ceil((double)productos/capacidad);
		System.out.println("Se necesitan "+cajas+" cajas");
		sc.close();
	}

}
