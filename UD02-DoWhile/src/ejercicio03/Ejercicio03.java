package ejercicio03;

import java.util.Scanner;

/**
 * 3. Sumar del 1 hasta N usando do-while.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N (positivo): ");
        Integer n = sc.nextInt();
        if (n < 1) {
            System.out.println("N debe ser positivo");
        } else {
            Integer suma = 0;
            Integer i = 1;
            do {
                suma += i;
                i++;
            } while (i <= n);
            System.out.println("Suma: " + suma);
        }
        sc.close();
    }
}
