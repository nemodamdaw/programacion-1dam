package ejercicio02;

import java.util.Scanner;

/**
 * 2. Contar positivos hasta introducir un negativo. El cero no es positivo.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer contador = 0;
        System.out.print("Introduce un entero positivo (negativo para salir): ");
        Integer numero = sc.nextInt();
        while (numero >= 0) {
            if (numero > 0) {
                contador++;
            }
            System.out.print("Otro entero (negativo para salir): ");
            numero = sc.nextInt();
        }
        System.out.println("Cantidad de positivos: " + contador);
        sc.close();
    }
}
