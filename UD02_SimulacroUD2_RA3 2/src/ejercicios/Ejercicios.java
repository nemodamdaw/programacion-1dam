package ejercicios;



import java.util.List;

import utiles.Utiles;

public class Ejercicios {
//	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
//		Integer precioBase=0;
//		switch (dia) {
//		case "LUNES":
//		case "MARTES":
//		case "MIERCOLES":
//		case "JUEVES":
//			precioBase = 8;
//			break;
//		case "VIERNES":
//			precioBase = 10;
//			break;
//		case "SABADO":
//		case "DOMINGO":
//			precioBase = 12;
//			break;
//		default:
//			return -1;
//		}
//		if(edad<0) {
//			return -1;
//		}
//		Integer descuento = socio?2:0;
//		if (edad < 12 || edad > 65) {
//			descuento+=3;
//		}
//		return precioBase-descuento;
//	}
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		Integer precioBase = calculaPrecioBase(dia);
		Integer descuento = calculaDescuento(edad, socio);
		return precioBase - descuento;
	}

	private static Integer calculaDescuento(Integer edad, Boolean socio) {
		if (edad < 0) {
			return -1;
		}
		Integer descuento = socio ? 2 : 0;
		if (edad < 12 || edad > 65) {
			descuento += 3;
		}
		return descuento;
	}

	private static Integer calculaPrecioBase(String dia) {
		Integer precioBase = 0;
		switch (dia) {
		case "LUNES":
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
			precioBase = 8;
			break;
		case "VIERNES":
			precioBase = 10;
			break;
		case "SABADO":
		case "DOMINGO":
			precioBase = 12;
			break;
		default:
			return -1;
		}
		return precioBase;
	}

	public static void dibujarZ(Integer lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (i == 0 || i == lado - 1 || i + j == lado - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad) {
		Integer res = 0;
		Integer contador=0;
		for (int i = inicio; i <= fin; i++) {
			if (Utiles.esPrimo(i) || Utiles.esPerfecto(i)) {
				res+=i;
				contador++;
				if(contador>=cantidad) {
					break;
				}
			}
			
		}
		
		return res;
	}
	
	public static Integer factorialConSaltos(Integer numero, Integer salto) {
		Integer res=1;
    	if (numero<=1) {
			res=1;
		} else {
			res=numero* factorialConSaltos(numero-salto, salto);
		}
    	return res;
	}
	
	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
		// contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2) → 3
		Integer contador=0;
		for (int i = 1; i < alturas.size()-1 ; i++) {
			Integer e = alturas.get(i);
			Integer antes = alturas.get(i-1);
			Integer despues = alturas.get(i+1);
			if (e>antes && e>despues && (e-antes)>=diferenciaMinima) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static Integer countNonOverlappingPairs(List<Integer> numbers) {
		Integer res=0;
		for (int i = 0; i < numbers.size() -1 ; i++) {
			Integer element = numbers.get(i);
			Integer nextElement =  numbers.get(i+1);
			if ( (element + nextElement)%5==0 ) {
				res++;
				i++;
			}
		}
		
		return res;
	}
	
//	Ejemplos: primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 9) → 1; 
//	primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 13) → 2; 
//	primeraPosicionSumaCifras(List.of(0, 31), 0) → 0; 
//	primeraPosicionSumaCifras(List.of(42, 153), 18) → -1. 
	public static Integer primeraPosicionSumaCifras(List<Integer> numeros, Integer sumaObjetivo) {
		Integer pos = -1;
		int i = 0;
		while (i < numeros.size() ) {
			if (Utiles.sumaCifras(numeros.get(i))==sumaObjetivo) {
				pos = i;
				break;
			}
			i++;
		}
		return pos;
	}
	
	
	
	
	
}
