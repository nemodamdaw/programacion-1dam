package ejercicio06;

import java.util.Scanner;

/**
 * 6. Detectar si la suma de dos de los tres números es el otro.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        Integer a = sc.nextInt();
        System.out.print("Segundo número: ");
        Integer b = sc.nextInt();
        System.out.print("Tercer número: ");
        Integer c = sc.nextInt();
        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("La suma de dos números es el tercero");
        } else {
            System.out.println("No se cumple la condición");
        }
        sc.close();
    }
}
