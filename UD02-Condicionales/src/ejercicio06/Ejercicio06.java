package ejercicio06;

import java.util.Scanner;

/**
 * 6. Días de un mes teniendo en cuenta años bisiestos.
 * Pruebas: 2/2024 -> 29 (obtenido 29); 2/1900 -> 28 (obtenido 28);
 * 2/2000 -> 29 (obtenido 29); 13/2024 -> error (obtenido error).
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mes (1-12): ");
        Integer mes = sc.nextInt();
        System.out.print("Año: ");
        Integer anio = sc.nextInt();
        if (mes < 1 || mes > 12 || anio < 1) {
            System.out.println("Mes o año no válido");
        } else {
            boolean bisiesto = anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
            Integer dias;
            if (mes == 2) {
                if (bisiesto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }
            System.out.println("Días del mes: " + dias);
        }
        sc.close();
    }
}
