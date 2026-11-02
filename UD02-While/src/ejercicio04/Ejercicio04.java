package ejercicio04;

import java.util.Scanner;

/**
 * 4. Diez enteros: suma positivos, media negativos y ceros.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer sumaPositivos = 0;
        Integer sumaNegativos = 0;
        Integer cantidadNegativos = 0;
        Integer ceros = 0;
        Integer i = 0;
        while (i < 10) {
            System.out.print("Número " + (i + 1) + ": ");
            Integer numero = sc.nextInt();
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                ceros++;
            }
            i++;
        }
        System.out.println("Suma de positivos: " + sumaPositivos);
        if (cantidadNegativos > 0) {
            System.out.println("Media de negativos: " + ((double) sumaNegativos / cantidadNegativos));
        } else {
            System.out.println("No hay números negativos");
        }
        System.out.println("Número de ceros: " + ceros);
        sc.close();
    }
}
