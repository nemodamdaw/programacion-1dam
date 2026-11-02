package ejercicio02;

import java.util.Scanner;

/**
 * 2. Valor absoluto mediante operador ternario.
 * Pruebas: -8 -> 8 (obtenido 8); 5 -> 5 (obtenido 5); 0 -> 0 (obtenido 0).
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        Integer numero = sc.nextInt();
        Integer absoluto = numero < 0 ? -numero : numero;
        System.out.println("Valor absoluto: " + absoluto);
        sc.close();
    }
}
