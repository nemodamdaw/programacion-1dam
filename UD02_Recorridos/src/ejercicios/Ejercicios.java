package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utiles.Utiles;

public class Ejercicios {
	// Contador###################
	// de los 20 primeros números cuántos son pares?
	public static Integer cuentaParesDeLos20PrimerosNumeros() {
		Integer res = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que me diga cuántos pares hay hasta un entero n
	// pasado como parámetro
	public static Integer cuentaParesHasta(Integer n) {
		Integer res = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}

	// Método que me diga cuántos pares hay entre dos enteros a y b
	// pasados como parámetros. Suponemos que a<b
	public static Integer cuentaParesEntre(Integer a, Integer b) {
		Integer res = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				res++;
			}
		}
		return res;
	}
	
	//Método que cuenta cuántos pares tiene una lista de enteros que se pasa
	//como parámetro

//	public static Integer cuentaParesEn(List<Integer> lis) {
//		Integer res = 0;
//		for (int i = 0; i < lis.size(); i++) {
//			Integer e = lis.get(i);
//			if (e % 2 == 0) {
//				res++;
//			}
//		}
//		return res;
//	}
	public static Integer cuentaParesEn(List<Integer> lis) {
		Integer res = 0;
		for (Integer e:lis) {
			if (e % 2 == 0) {
				res++;
			}
		}
		return res;
	}
	public static Integer cuentaPrimosEn(List<Integer> lis) {
		Integer res = 0;
		for (Integer e:lis) {
			if (Utiles.esPrimo(e)) {
				res++;
			}
		}
		return res;
	}

	
	
	// suma###################
	//suma los elementos de una lista
	public static Double sumaListaDeReales(List<Double> lis) {
		Double res = 0.0;
		for (int i=0; i<lis.size();i++) {
			Double e = lis.get(i);
			res+=e;
		}
		return res;
	}
	
//	public static Double sumaListaDeReales(List<Double> lis) {
//		Double res = 0.0;
//		for (Double e : lis) {
//			res+=e;
//		}
//		return res;
//	}
	//suma los elementos de una lista mayores o iguales que un cierto umbral
	public static Double sumaMayoresIgualesA(List<Double> lis, Double umbral) {
		Double res = 0.0;
		for (int i=0; i<lis.size();i++) {
			Double e = lis.get(i);
			if (e>=umbral) {
				res += e;
			}
		}
		return res;
	}
	
	//Búsqueda (existe)###################
	//Método que dada una lista de enteros devuelva si tiene o no algún primo
	
//	public static Boolean tienePrimo(List<Integer> lis) {
//		Boolean res=false;
//		int i=0;
//		while(i<lis.size()) {
//			Integer e = lis.get(i);
//			if (Utiles.esPrimo(e)) {
//				res=true;
//				break;
//			}
//			i++;
//		}
//		return res;
//	}
	public static Boolean tienePrimo(List<Integer> lis) {
		Boolean res=false;
		for (Integer e : lis) {
			if (Utiles.esPrimo(e)) {
				res=true;
				break;
			}
		}
		return res;
	}
	
	//mezcla de suma y busca
	//Método que dada una lista como parámetro me devuelva cierto si la suma de
	//sus primos es primo
	
	public static Boolean sumaDePrimosEsPrimo(List<Integer> lis) {
		Boolean res = false;
		Integer suma = 0;
		for(int i=0; i<lis.size();i++) {
			Integer e = lis.get(i);
			if (Utiles.esPrimo(e)) {
				suma+=e;
			}
		}
		if (Utiles.esPrimo(suma)) {
			res=true;
		}
		return res;
	}
	//Comprobación (para todo)###################
	// Método que dada una lista como parámetro compruebe
	//si todos sus elementos son primos
	
	public static Boolean todosPrimos(List<Integer> lis) {
		Boolean res=true;
		for (Integer e : lis) {
			if (!Utiles.esPrimo(e)) {
				res=false;
				break;
			}
		}
		return res;
	}
	
	//Dada una lista, comprobar si es creciente
//	public static Boolean esCreciente(List<Integer> lis) {
//		Boolean res=true;
//		for (int i = 1; i < lis.size(); i++) {
//			Integer e = lis.get(i);
//			Integer anterior = lis.get(i-1);
//			if (e<anterior) {
//				res=false;
//				break;
//			}
//		}
//		return res;
//	}
	public static Boolean esCreciente(List<Integer> lis) {
		Boolean res=true;
		int i = 1;
		while ( i < lis.size() ) {
			Integer e = lis.get(i);
			Integer anterior = lis.get(i-1);
			if (e<anterior) {
				res=false;
				break;
			}
			i++;
		}
		return res;
	}
	//Selección
	//dada una lista hacer un método que me devuelva otra lista con los primos 
	
	public static List<Integer> seleccionaPrimos(List<Integer> lis){
		List<Integer> res = new ArrayList<>();
		for (Integer e : lis) {
			if (Utiles.esPrimo(e)) {
				res.add(e);
			}
		}
		return res;
		
	}
	
	// maximo y/o minimo###################
	
	//Método que dada una lista de enteros me devuelva el máximo
//	public static Integer maximo(List<Integer> lis) {
//		Integer res=lis.get(0);
//		for(int i = 1; i<lis.size(); i++) {
//			Integer e = lis.get(i);
//			if (e>res) {
//				res=e;
//			}
//		}
//		return res;
//	}

	public static Integer maximo(List<Integer> lis) {
		Integer res=null;
		for(Integer e:lis) {
			if (res==null ||  e>res ) {
				res=e;
			}
		}
		return res;
	}
//	public static Integer maximo(List<Integer> lis) {
//		 return Collections.max(lis);
//	}
	
	//Algoritmo de ordención de burbuja
	public static List<Integer> ordena(List<Integer> lis){
		Boolean ordenado = false;
		while (!ordenado) {
			ordenado=true;
			for(int i=0;i<lis.size()-1;i++) {
				Integer e = lis.get(i);
				Integer sig = lis.get(i+1);
				if (e>sig) {
					Integer aux = lis.get(i);
					lis.set(i, sig);
					lis.set(i+1, aux);
					ordenado=false;
				}
			}
		}
		return lis;
	}
	
	public static Long fibonacci(Integer n) {
		Long res;
		if(n==0) {
			res=0L;
		}else if (n==1) {
			res=1L;
		}else {
			res=fibonacci(n-1) + fibonacci(n-2);
		}
		return res;
	}
	
}









