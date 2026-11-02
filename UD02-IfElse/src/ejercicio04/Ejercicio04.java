package ejercicio04;

import java.util.Scanner;

/**
 * 4. Número de cifras de un entero entre 0 y 99999.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entre 0 y 99999: ");
        Integer numero = sc.nextInt();
        if (numero < 0 || numero > 99999) {
            System.out.println("Número fuera de rango");
        } else if (numero < 10) {
            System.out.println("Tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("Tiene 2 cifras");
        } else if (numero < 1000) {
            System.out.println("Tiene 3 cifras");
        } else if (numero < 10000) {
            System.out.println("Tiene 4 cifras");
        } else {
            System.out.println("Tiene 5 cifras");
        }
        sc.close();
    }
}
