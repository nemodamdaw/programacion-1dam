package ejercicio02;

import java.util.Scanner;

/**
 * 2. Casi-cero: intervalo (-1, 1) excluyendo el cero.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        Double numero = sc.nextDouble();
        if (numero > -1 && numero < 1 && numero != 0) {
            System.out.println("Es casi-cero");
        } else {
            System.out.println("No es casi-cero");
        }
        sc.close();
    }
}
