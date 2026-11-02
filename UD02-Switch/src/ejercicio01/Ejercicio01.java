package ejercicio01;

import java.util.Scanner;

/**
 * 1. Calificación textual mediante switch.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota entera entre 0 y 10: ");
        Integer nota = sc.nextInt();
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7: case 8:
                System.out.println("Notable");
                break;
            case 9: case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota fuera de rango");
        }
        sc.close();
    }
}
