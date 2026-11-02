package ejercicio04;

import java.util.Scanner;

/**
 * 4. Juego de sumar dos números aleatorios (1 a 99).
 * Pruebas: si aparecen 20 y 30, introducir 50 -> correcto (obtenido correcto);
 * introducir 40 -> incorrecto (obtenido incorrecto).
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = (int) (Math.random() * 99) + 1;
        Integer b = (int) (Math.random() * 99) + 1;
        System.out.print("¿Cuánto es " + a + " + " + b + "? ");
        Integer respuesta = sc.nextInt();
        if (respuesta == a + b) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto. El resultado es " + (a + b));
        }
        sc.close();
    }
}
