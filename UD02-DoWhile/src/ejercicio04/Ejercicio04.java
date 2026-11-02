package ejercicio04;

import java.util.Scanner;

/**
 * 4. Tabla de multiplicar con do-while.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número para la tabla de multiplicar: ");
        Integer numero = sc.nextInt();
        Integer i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
        sc.close();
    }
}
