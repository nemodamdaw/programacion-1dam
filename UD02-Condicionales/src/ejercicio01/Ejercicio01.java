package ejercicio01;

import java.util.Scanner;

/**
 * 1. Comprobar si un número de 0 a 9999 es capicúa.
 * Pruebas: entrada 1221, esperado sí, obtenido sí.
 * Entrada 1234, esperado no, obtenido no. Entrada -1, esperado error, obtenido error.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entre 0 y 9999: ");
        Integer numero = sc.nextInt();
        if (numero < 0 || numero > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            Integer original = numero;
            Integer inverso = 0;
            while (numero > 0) {
                inverso = inverso * 10 + numero % 10;
                numero = numero / 10;
            }
            if (original.equals(inverso)) {
                System.out.println("Es capicúa");
            } else {
                System.out.println("No es capicúa");
            }
        }
        sc.close();
    }
}
