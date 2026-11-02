package ejercicio08;

import java.util.Scanner;

/** 8. Tiradas de dados, validando los nombres con do-while. 
 * Aunque aquí no habíamos visto aun métodos lo hago así
 * para ahorrar código
 * */
public class Ejercicio08 {
    public static Integer valorDado(String nombre) {
        Integer valor = 0;
        switch (nombre.toUpperCase()) {
            case "UNO": valor = 1; break;
            case "DOS": valor = 2; break;
            case "TRES": valor = 3; break;
            case "CUATRO": valor = 4; break;
            case "CINCO": valor = 5; break;
            case "SEIS": valor = 6; break;
            default: valor = 0;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer dado1;
        do {
            System.out.print("Primera tirada (UNO a SEIS): ");
            dado1 = valorDado(sc.next());
            if (dado1 == 0) {
                System.out.println("Valor no válido");
            }
        } while (dado1 == 0);
        Integer dado2;
        do {
            System.out.print("Segunda tirada (UNO a SEIS): ");
            dado2 = valorDado(sc.next());
            if (dado2 == 0) {
                System.out.println("Valor no válido");
            }
        } while (dado2 == 0);
        System.out.println("Suma: " + (dado1 + dado2));
        sc.close();
    }
}
