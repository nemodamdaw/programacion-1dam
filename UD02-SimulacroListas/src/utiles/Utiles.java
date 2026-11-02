package utiles;

public class Utiles {

    // Un número primo debe ser mayor que 1 y solo divisible por 1 y por sí mismo.
    public static boolean esPrimo(Integer numero) {
        Boolean res = numero != null && numero > 1;
        if (res) {
            for (int divisor = 2; divisor <= numero / divisor; divisor++) {
                if (numero % divisor == 0) {
                    res = false;
                }
            }
        }
        return res;
    }

    // Un perfecto es positivo e igual a la suma de sus divisores propios.
    public static boolean esPerfecto(Integer numero) {
        Integer sumaDivisores = 0;
        Boolean res = false;
        if (numero != null && numero > 1) {
            for (int divisor = 1; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }
            }
            if (sumaDivisores.equals(numero)) {
                res = true;
            }
        }
        return res;
    }

    // Devuelve -1 para valores fuera de 0 a 20 (factorial con long).
    public static Long factorial(Integer numero) {
        Long resultado = -1L;
        if (numero != null && numero >= 0 && numero <= 20) {
            resultado = 1L;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }
}
