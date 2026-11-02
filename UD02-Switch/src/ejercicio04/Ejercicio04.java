package ejercicio04;

import java.util.Scanner;

/**
 * 4. Suma de dos tiradas de dado expresadas con palabras.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera tirada (UNO a SEIS): ");
        String primera = sc.next();
        System.out.print("Segunda tirada (UNO a SEIS): ");
        String segunda = sc.next();
        Integer dado1 = 0;
        Integer dado2 = 0;
        switch (primera) {
            case "UNO": dado1 = 1; break;
            case "DOS": dado1 = 2; break;
            case "TRES": dado1 = 3; break;
            case "CUATRO": dado1 = 4; break;
            case "CINCO": dado1 = 5; break;
            case "SEIS": dado1 = 6; break;
            default: System.out.println("Primera tirada incorrecta");
        }
        switch (segunda) {
            case "UNO": dado2 = 1; break;
            case "DOS": dado2 = 2; break;
            case "TRES": dado2 = 3; break;
            case "CUATRO": dado2 = 4; break;
            case "CINCO": dado2 = 5; break;
            case "SEIS": dado2 = 6; break;
            default: System.out.println("Segunda tirada incorrecta");
        }
        if (dado1 != 0 && dado2 != 0) {
            System.out.println("Suma: " + (dado1 + dado2));
        }
        sc.close();
    }
}
