package utiles;

public class Utiles {

    // Un número primo es mayor que 1 y solo es divisible entre 1 y él mismo.
    public static boolean esPrimo(Integer numero) {
    	Boolean res = true;

        for (int divisor = 2; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                res = false;
            }
        }

        return res;
    }

    // Un número perfecto es positivo e igual a la suma de sus divisores propios.
    // Ejemplo: 6 = 1 + 2 + 3.
    public static boolean esPerfecto(Integer numero) {
    	Boolean res = false;
        Integer sumaDivisores = 0;
        for (int divisor = 1; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }
        if(sumaDivisores.equals(numero)) {
        	res = true;
        }
        return res;
    }
    
    //TODO factorial de un número
}
