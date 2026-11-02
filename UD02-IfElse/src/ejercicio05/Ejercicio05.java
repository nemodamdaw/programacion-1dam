package ejercicio05;

import java.util.Scanner;

/**
 * 5. Piedra, papel o tijera. Una partida.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1 (PIEDRA/PAPEL/TIJERA): ");
        String jugador1 = sc.nextLine();
        System.out.print("Jugador 2 (PIEDRA/PAPEL/TIJERA): ");
        String jugador2 = sc.nextLine();
        boolean valido1 = jugador1.equals("PIEDRA") || jugador1.equals("PAPEL") || jugador1.equals("TIJERA");
        boolean valido2 = jugador2.equals("PIEDRA") || jugador2.equals("PAPEL") || jugador2.equals("TIJERA");
        if (!valido1 || !valido2) {
            System.out.println("Alguna jugada no es válida");
        } else if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
                || (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
                || (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }
        sc.close();
    }
}
