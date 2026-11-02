package ejercicio03;

import java.util.Scanner;

/**
 * 3. Media de diez números.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double suma = 0.0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            Double numero = sc.nextDouble();
            suma += numero;
        }
        System.out.println("Media: " + (suma / 10));
        sc.close();
    }
}
