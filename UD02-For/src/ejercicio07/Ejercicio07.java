package ejercicio07;

import java.util.Scanner;

/**
 * 7. Detectar primos con for. El 1 no es primo.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero positivo: ");
        Integer numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("El número debe ser positivo");
        } else {
            Boolean primo = numero > 1;
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }
        sc.close();
    }
}
