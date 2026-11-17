package test;

import tipos.Punto;

public class TestPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(2.0, 3.0);
		System.out.println(p1);
		Punto p2 = new Punto();
		System.out.println(p2);
		Punto p3 = new Punto(3.0, 5.0);
		System.out.println(p3);
		//Calcular la distancia entre p1 y p3
		System.out.println(p1.distanciaA(p3));
		System.out.println(p3.distanciaA(p1));
		System.out.println(p1.distanciaA(p1));
	}

}
