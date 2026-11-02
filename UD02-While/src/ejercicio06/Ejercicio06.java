package ejercicio06;

import java.util.Scanner;

/**
 * 6. Altura máxima en centímetros, terminando con -1.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double alturaMaxima = -1.0;
        System.out.print("Altura del árbol en cm (-1 para salir): ");
        Double altura = sc.nextDouble();
        while (altura != -1) {
            if (altura >= 0) {
                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                }
            } else {
                System.out.println("Altura no válida");
            }
            System.out.print("Siguiente altura en cm (-1 para salir): ");
            altura = sc.nextDouble();
        }
        if (alturaMaxima >= 0) {
            System.out.println("Árbol más alto: " + alturaMaxima + " cm");
        } else {
            System.out.println("No se han introducido árboles");
        }
        sc.close();
    }
}
