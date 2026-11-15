package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {
	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
		
		Integer mayor;
		Integer menor1;
		Integer menor2;
		//calculo primero quien es el mayor de los 3, los otros dos lados son menor 1 y 2
		if (a>b) {
			if (a>c) {
				mayor=a;
				menor1=b;
				menor2=c;
			} else {
				mayor=c;
				menor1=a;
				menor2=b;
			}
		} else {
			if (b>c) {
				mayor=b;
				menor1=a;
				menor2=c;
			} else {
				mayor=c;
				menor1=a;
				menor2=b;
			}
		}
		//supongo que el resultado es inválido y si no lo es los comienzo a clasificar
		String res = "INVALIDO";
		if ( (menor1+menor2) > mayor ) { //entonces es válido
			if(mayor*mayor == menor1*menor1 + menor2*menor2) {
				res = "RECTANGULO";
			}
			else if(mayor==menor1 && mayor==menor2) {
				res = "EQUILATERO";
			}
			else if(mayor==menor1 || mayor==menor2 || menor1==menor2) {
				res = "ISOSCELES";
			}
			else {
				res="ESCALENO";
			}
		}
		return res;
	}
	
	public static void trianguloAlterno(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					if ((i + j) % 2 == 0) {
						System.out.print("1");
					} else {
						System.out.print("0");
					} 
				}
			}
			System.out.println();
		}
	}
	
	public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {
		Integer res=-1;
		for (int i = inicio; i <= fin; i++) {
			if (Utiles.cuentaDivisoresPropios(i)>=minimoDivisores) {
				res=i;
				break;
			}
		}
		return res;
	}
	
	public static Integer tribonacci(Integer n) {
		Integer res;
		if (n==0) {
			res=0;
		}
		else if(n==1) {
			res=1;
		}
		else if(n==2) {
			res=1;
		}
		else {
			res= tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
		}
		return res;
	}
	
	public static Boolean esCasiCreciente(List<Integer> datos) {
		Boolean res = true;
		Integer rupturas=0;
		if (datos.size()>=2) {
			for (int i = 1; i < datos.size(); i++) {
				Integer e = datos.get(i);
				Integer anterior = datos.get(i - 1);
				if (e <= anterior) {
					rupturas++;
//					No es obligatorio pero sería lo más correcto añadir esto que está comentado
//					ya que si hay más de una ruptura para qué vamos a continuar.
//					if (rupturas>1) {
//						break;
//					}
				}
			} 
			if (rupturas>1) {
				res = false;
			}
		}
		return res;
	}
	
	public static Integer primeraVentanaObjetivo(List<Integer> ventas, Integer longitud, Integer objetivo) {
		Integer res = -1;
		for (int i = 0; i <= ventas.size() - longitud; i++) {
			Integer suma = 0;
			for (int j = i; j < i+longitud; j++) {
				suma += ventas.get(j);
			}
			if (suma>=objetivo) {
				res=i;
				break;
			}
		}
		
		return res;
	}
	
	public static Boolean alternatesEvenOdd(List<Integer> numbers) {
		Boolean solution = true;
		if (numbers.size()>=2) {
			for (int i = 1; i < numbers.size(); i++) {
				Integer e = numbers.get(i);
				Integer previous = numbers.get(i-1);
				if ((e%2==0 && previous%2==0) || (e%2!=0 && previous%2!=0)) {
					solution=false;
					break;
				}
			} 
		}
		return solution;
	}
}















