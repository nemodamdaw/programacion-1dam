package ejercicio03;

import java.util.Scanner;

/**
 * 3. Calcular letra del DNI mediante módulo 23.
 * Pruebas: 12345678 -> Z (obtenido Z); 0 -> error (obtenido error).
 * Este ejercicio lo pongo así pero así no lo hemos visto aun.
 * Os lo daría por bueno con muchos if-else, pero para evitarlo se puede 
 * hacer esto.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de DNI (8 dígitos): ");
        Integer dni = sc.nextInt();
        if (dni < 10000000 || dni > 99999999) {
            System.out.println("Número de DNI no válido");
        } else {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letra = letras.charAt(dni % 23);
            System.out.println("Letra: " + letra);
        }
        sc.close();
    }
}
