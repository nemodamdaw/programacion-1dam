package ejercicio04;



/**
 * 4. Sumar los diez primeros impares.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Integer suma = 0;
        for (int i = 1; i <= 19; i += 2) {
            suma += i;
        }
        System.out.println("Suma de los diez primeros impares: " + suma);
    }
}
