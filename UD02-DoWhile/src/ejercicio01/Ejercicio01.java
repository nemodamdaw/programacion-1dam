package ejercicio01;



/**
 * 1. Mostrar los veinte primeros naturales mediante do-while.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Integer numero = 1;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 20);
    }
}
