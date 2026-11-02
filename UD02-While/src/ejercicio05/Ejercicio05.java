package ejercicio05;

import java.util.Scanner;

/**
 * 5. Estadísticas de edades hasta centinela negativo.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer sumaEdades = 0;
        Integer alumnos = 0;
        Integer mayores = 0;
        System.out.print("Edad (negativa para salir): ");
        Integer edad = sc.nextInt();
        while (edad >= 0) {
            sumaEdades += edad;
            alumnos++;
            if (edad >= 18) {
                mayores++;
            }
            System.out.print("Siguiente edad (negativa para salir): ");
            edad = sc.nextInt();
        }
        System.out.println("Suma de edades: " + sumaEdades);
        System.out.println("Número de alumnos: " + alumnos);
        System.out.println("Mayores de edad: " + mayores);
        if (alumnos > 0) {
            System.out.println("Media: " + ((double) sumaEdades / alumnos));
        } else {
            System.out.println("No hay datos para calcular la media");
        }
        sc.close();
    }
}
