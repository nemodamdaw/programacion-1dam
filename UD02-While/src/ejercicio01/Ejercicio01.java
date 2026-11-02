package ejercicio01;

import java.util.Scanner;

/**
 * 1. Acumular positivos hasta que aparezca un negativo.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer suma = 0;
        System.out.print("Introduce un entero positivo (negativo para salir): ");
        Integer numero = sc.nextInt();
        while (numero >= 0) {
            suma += numero;
            System.out.print("Otro entero (negativo para salir): ");
            numero = sc.nextInt();
        }
        System.out.println("La suma es " + suma);
        sc.close();
    }
}
