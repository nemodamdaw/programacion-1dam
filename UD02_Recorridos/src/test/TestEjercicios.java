package test;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

	public static void main(String[] args) {
		System.out.println("Test de contadores%%%%%%%%%%%%%%%%%");
		System.out.println(Ejercicios.cuentaParesDeLos20PrimerosNumeros());
		System.out.println(Ejercicios.cuentaParesHasta(20));
		System.out.println(Ejercicios.cuentaParesEntre(1, 20));
		System.out.println(Ejercicios.cuentaParesHasta(5000));
		
		System.out.println(Ejercicios.cuentaParesEn(List.of(5,7,3,8,7)));
		System.out.println(Ejercicios.cuentaPrimosEn(List.of(5,7,3,8,7)));
		System.out.println(Ejercicios.sumaListaDeReales(List.of(5.3,7.1,3.4)));
		System.out.println(Ejercicios.sumaMayoresIgualesA(List.of(5.3,7.1,3.4), 5.0));
	
		System.out.println(Ejercicios.seleccionaPrimos(List.of(5,7,3,8,7)));
		
		System.out.println("Probando máximo--------");
		Integer x = Ejercicios.maximo(List.of(7,8,3,2));
		System.out.println(x);
		Integer y = Ejercicios.maximo(List.of());
		if (y!=null) {
			System.out.println("El máximo es : "+y);
		}
		else {
			System.err.println("illoooo que jase con una lista vacía");
		}
		
		System.out.println("Probando ordenación con burbuja--------");
		//System.out.println(Ejercicios.ordena(List.of(7,8,3,2)));
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(7);lista.add(8);lista.add(3);lista.add(2);
		System.out.println("Lista sin ordenar: "+lista);
		System.out.println("Lista ordenada: "+Ejercicios.ordena(lista));
		
		System.out.println("Lista ordenada: "+Utiles.ordena(lista));
	}

}







