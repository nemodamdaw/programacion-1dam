package ejercicio08;

import java.util.Scanner;

/**
 * 8. Mostrar los números desde el menor hasta el mayor, inclusive.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número A: ");
        Integer a = sc.nextInt();
        System.out.print("Número B: ");
        Integer b = sc.nextInt();
        Integer menor = a;
        Integer mayor = b;
        if (b < a) {
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
