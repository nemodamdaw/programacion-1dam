package ejercicio02;

import java.util.Scanner;

/**
 * 2. Contar múltiplos de 3 entre 1 y N.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número límite: ");
        Integer n = sc.nextInt();
        if (n < 1) {
            System.out.println("El límite debe ser positivo");
        } else {
            Integer contador = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    contador++;
                }
            }
            System.out.println("Cantidad de múltiplos de 3: " + contador);
        }
        sc.close();
    }
}
