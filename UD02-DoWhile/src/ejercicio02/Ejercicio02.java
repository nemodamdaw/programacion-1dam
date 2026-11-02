package ejercicio02;



/**
 * 2. Pares entre 1 y 200 mediante do-while.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Integer numero = 2;
        do {
            System.out.println(numero);
            numero += 2;
        } while (numero <= 200);
    }
}
