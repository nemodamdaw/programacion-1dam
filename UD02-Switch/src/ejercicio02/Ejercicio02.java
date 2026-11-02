package ejercicio02;

import java.util.Scanner;

/**
 * 2. Nombre del día de la semana mediante switch.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Día de la semana (1-7): ");
        Integer dia = sc.nextInt();
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día fuera de rango");
        }
        sc.close();
    }
}
