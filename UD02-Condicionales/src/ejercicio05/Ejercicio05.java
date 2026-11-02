package ejercicio05;

import java.util.Scanner;

/**
 * 5. Precio de tren: descuento 30% si más de 7 días y más de 800 km.
 * Pruebas: 1000 km, 8 días -> 1750 (obtenido 1750);
 * 800 km, 8 días -> 2000 (obtenido 2000); -1 km -> error (obtenido error).
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia en km: ");
        Double distancia = sc.nextDouble();
        System.out.print("Días de estancia: ");
        Integer dias = sc.nextInt();
        if (distancia <= 0 || dias < 0) {
            System.out.println("Valores no válidos");
        } else {
            Double precio = distancia * 2.5;
            if (dias > 7 && distancia > 800) {
                precio = precio * 0.7;
            }
            System.out.println("Precio del billete: " + precio + " euros");
        }
        sc.close();
    }
}
