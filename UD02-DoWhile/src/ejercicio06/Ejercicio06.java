package ejercicio06;

import java.util.Scanner;

/**
 * 6. Piedra/papel/tijera, validación de entradas y repetir con S.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;
        do {
            String jugador1;
            do {
                System.out.print("Jugador 1 (PIEDRA/PAPEL/TIJERA): ");
                jugador1 = sc.next().toUpperCase();
            } while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA"));
            String jugador2;
            do {
                System.out.print("Jugador 2 (PIEDRA/PAPEL/TIJERA): ");
                jugador2 = sc.next().toUpperCase();
            } while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA"));
            if (jugador1.equals(jugador2)) {
                System.out.println("Empate");
            } else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
                    || (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
                    || (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }
            System.out.print("¿Seguir jugando? (S para sí): ");
            repetir = sc.next().toUpperCase();
        } while (repetir.equals("S"));
        sc.close();
    }
}
