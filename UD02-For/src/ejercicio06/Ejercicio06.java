package ejercicio06;

import java.util.Scanner;

/**
 * 6. Comprobar si alguna de cinco notas está suspensa.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean haySuspenso = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nota del alumno " + i + " (0 a 10): ");
            Double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota fuera de rango; se considera inválida");
            } else if (nota < 5) {
                haySuspenso = true;
            }
        }
        if (haySuspenso) {
            System.out.println("Hay algún suspenso");
        } else {
            System.out.println("No hay suspensos entre las notas válidas");
        }
        sc.close();
    }
}
