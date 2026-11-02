package ejercicio05;

import java.util.Scanner;

/**
 * 5. Adivinar número aleatorio acotando mínimo y máximo.
 * MAYOR indica que el número pensado supera al propuesto.
 * MENOR indica que el número pensado es inferior al propuesto.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer minimo = 1;
        Integer maximo = 100;
        Boolean acertado = false;
        System.out.println("Piensa un número del 1 al 100.");
        do {
            Integer propuesta = minimo + (int) (Math.random() * (maximo - minimo + 1));
            System.out.print("¿Es " + propuesta + "? (MAYOR, MENOR, IGUAL): ");
            String respuesta = sc.next().trim().toUpperCase();
            if (respuesta.equals("IGUAL")) {
                acertado = true;
                System.out.println("¡HAS ACERTADO!");
            } else if (respuesta.equals("MAYOR")) {
                minimo = propuesta + 1;
            } else if (respuesta.equals("MENOR")) {
                maximo = propuesta - 1;
            } else {
                System.out.println("Respuesta no válida. Escribe MAYOR, MENOR o IGUAL.");
            }
            if (!acertado && minimo > maximo) {
                System.out.println("Las pistas son contradictorias. Fin del juego.");
            }
        } while (!acertado && minimo <= maximo);
        sc.close();
    }
}
