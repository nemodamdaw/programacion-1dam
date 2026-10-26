package test;

import java.util.ArrayList;
import java.util.List;
import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

    public static void main(String[] args) {
        //List<Integer> numeros = List.of(2, 4, 3, 6, 5, 28);
    	List<Integer> numeros = new ArrayList<Integer>();
    	numeros.add(2);numeros.add(4);numeros.add(3);
    	numeros.add(6);numeros.add(5);numeros.add(28);
        System.out.println("Lista: " + numeros);

        System.out.println("\n--- SUMAS ---");
        System.out.println("Suma 1 (for-each): " + Ejercicios.suma1(numeros));
        System.out.println("Suma 2 (for):      " + Ejercicios.suma2(numeros));
        System.out.println("Suma 3 (while):    " + Ejercicios.suma3(numeros));

        System.out.println("\n--- CONTADORES ---");
        System.out.println("Cantidad de pares:     " + Ejercicios.contarPares(numeros));
        System.out.println("Cantidad de primos:    " + Ejercicios.contarPrimos(numeros));
        System.out.println("Cantidad de perfectos: " + Ejercicios.contarPerfectos(numeros));

        System.out.println("\n--- MEDIAS ---");
        System.out.println("Media 1 (for-each): " + Ejercicios.media1(numeros));
        System.out.println("Media 2 (for):      " + Ejercicios.media2(numeros));
        System.out.println("Media 3 (while):    " + Ejercicios.media3(numeros));

        System.out.println("\n--- PRUEBAS DE UTILES ---");
        System.out.println("¿7 es primo?       " + Utiles.esPrimo(7));
        System.out.println("¿9 es primo?       " + Utiles.esPrimo(9));
        System.out.println("¿6 es perfecto?    " + Utiles.esPerfecto(6));
        System.out.println("¿28 es perfecto?   " + Utiles.esPerfecto(28));
        System.out.println("¿12 es perfecto?   " + Utiles.esPerfecto(12));
        
        //TODO Seguir haciendo las pruebas de los ejercicios
    }
}
