package utiles;

public class Utiles {

    // Un número primo es mayor que 1 y solo es divisible entre 1 y él mismo.
    public static boolean esPrimo(Integer numero) {
        if (numero < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= numero / divisor; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    // Un número perfecto es positivo e igual a la suma de sus divisores propios.
    // Ejemplo: 6 = 1 + 2 + 3.
    public static boolean esPerfecto(Integer numero) {
        if (numero <= 1) {
            return false;
        }

        Integer sumaDivisores = 0;
        for (int divisor = 1; divisor <= numero / 2; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }

        return sumaDivisores.equals(numero);
    }
}
