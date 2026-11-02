package ejercicio03;

import java.util.Scanner;

/**
 * 3. Media de positivos hasta un negativo. Evita división por cero.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer suma = 0;
        Integer contador = 0;
        System.out.print("Introduce un entero positivo (negativo para salir): ");
        Integer numero = sc.nextInt();
        while (numero >= 0) {
            if (numero > 0) {
                suma += numero;
                contador++;
            }
            System.out.print("Otro entero (negativo para salir): ");
            numero = sc.nextInt();
        }
        if (contador > 0) {
            System.out.println("Media: " + ((double) suma / contador));
        } else {
            System.out.println("No se han introducido números positivos");
        }
        sc.close();
    }
}
