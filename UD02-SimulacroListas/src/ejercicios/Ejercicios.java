package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {

	// 1. Sumar una lista mediante for-each.
	public static Integer suma1(List<Integer> numeros) {
		Integer suma = 0;

		for (Integer numero : numeros) {
			suma += numero;
		}

		return suma;
	}

	// 2. Sumar una lista mediante for clásico (con índice).
	public static Integer suma2(List<Integer> numeros) {
		Integer suma = 0;

		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return suma;
	}

	// 3. Sumar una lista mediante while.
	public static Integer suma3(List<Integer> numeros) {
		Integer suma = 0;
		int i = 0;

		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return suma;
	}

	// 4. Contar los números pares, incluido el 0.
	public static Integer contarPares(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	// 5. Contar los números primos mediante la clase Utiles.
	public static Integer contarPrimos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPrimo(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 6. Contar los números perfectos mediante la clase Utiles.
	public static Integer contarPerfectos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPerfecto(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 7. Calcular la media mediante for-each.
	public static Double media1(List<Integer> numeros) {

		Integer suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}

		Double media = 0.0;
		if (!numeros.isEmpty()) {
			media = (double) suma / numeros.size();
		}
		return media;
	}

	// 8. Calcular la media mediante for clásico.
	public static Double media2(List<Integer> numeros) {

		Integer suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		Double media = 0.0;
		if (!numeros.isEmpty()) {
			media = (double) suma / numeros.size();
		}
		return media;
	}

	// 9. Calcular la media mediante while.
	public static Double media3(List<Integer> numeros) {

		Integer suma = 0;
		int i = 0;
		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		Double media = 0.0;
		if (!numeros.isEmpty()) {
			media = (double) suma / numeros.size();
		}
		return media;
	}

	// EXAMEN UD2 - Ejercicio 1. El parámetro criatura indica el tipo.
	// Se considera que el valor "vampiro" es un vampiro registrado,
	// pues no existe un parámetro independiente para saber si está registrado.
	public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {
		boolean permitido = false;
		if (criatura.equalsIgnoreCase("vampiro")) {
			permitido = true;
		} else if (edad >= 18 || acompanado) {
			permitido = true;
		}
		return permitido;
	}

	// EXAMEN UD2 - Ejercicio 2. Se comprueban nulos antes de comparar.
	public static Integer cuentaCaramelos(List<String> caramelos, String tipo) {
		Integer contador = 0;
		for (String caramelo : caramelos) {
			if (caramelo != null && caramelo.equals(tipo)) {
				contador++;
			}
		}
		return contador;
	}

	// EXAMEN UD2 - Ejercicio 3. Utilizar while y break, como se pide.
	public static Integer pasosLaberinto(List<Integer> pasos) {
		Integer total = 0;
		int i = 0;
		while (i < pasos.size()) {
			Integer paso = pasos.get(i);
			if (paso < 0) {
				break;
			}
			total += paso;
			i++;
		}
		return total;
	}

	// EXAMEN UD2 - Ejercicio 4. Si nadie supera 4, se devuelve 0.0.
	public static Double promedioMagia(List<Integer> niveles) {
		Integer suma = 0;
		Integer contador = 0;
		for (Integer nivel : niveles) {
			if (nivel >= 5) {
				suma += nivel;
				contador++;
			}
		}
		Double media = 0.0;
		if (contador > 0) {
			media = (double) suma / contador;
		}
		return media;
	}

	// EXAMEN UD2 - Ejercicio 5. Recursividad y caso base sin retornos.
	public static void cuentaAtrasSustos(Integer n) {
		if (n == 0) {
			System.out.println("¡Susto final!");
		} else {
			System.out.println("¡Boo " + n + "!");
			cuentaAtrasSustos(n - 1);
		}
	}

	// EXAMEN UD2 - Ejercicio 6. Suma entre los ceros con for clásico.
	public static Integer sumaEntreCeros(List<Integer> numeros) {
		Integer suma = 0;
		Integer primero = numeros.indexOf(0);
		Integer ultimo = numeros.lastIndexOf(0);
		for (int i = primero + 1; i < ultimo; i++) {
			suma += numeros.get(i);
		}

		return suma;
	}
}
