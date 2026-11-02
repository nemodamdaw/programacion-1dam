package test;

import java.util.ArrayList;
import java.util.List;
import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(6);
        numeros.add(5);
        numeros.add(28);
        System.out.println("Lista: " + numeros);

        System.out.println("\n--- SUMAS ---");
        System.out.println("Suma 1: " + Ejercicios.suma1(numeros));
        System.out.println("Suma 2: " + Ejercicios.suma2(numeros));
        System.out.println("Suma 3: " + Ejercicios.suma3(numeros));

        System.out.println("\n--- CONTADORES ---");
        System.out.println("Pares: " + Ejercicios.contarPares(numeros));
        System.out.println("Primos: " + Ejercicios.contarPrimos(numeros));
        System.out.println("Perfectos: " + Ejercicios.contarPerfectos(numeros));

        System.out.println("\n--- MEDIAS ---");
        System.out.println("Media 1: " + Ejercicios.media1(numeros));
        System.out.println("Media 2: " + Ejercicios.media2(numeros));
        System.out.println("Media 3: " + Ejercicios.media3(numeros));
        System.out.println("Media vacía: " + Ejercicios.media1(new ArrayList<Integer>()));

        System.out.println("\n--- PRUEBAS DE UTILES ---");
        System.out.println("¿1 es primo? " + Utiles.esPrimo(1));
        System.out.println("¿0 es primo? " + Utiles.esPrimo(0));
        System.out.println("¿-5 es primo? " + Utiles.esPrimo(-5));
        System.out.println("¿2 es primo? " + Utiles.esPrimo(2));
        System.out.println("¿7 es primo? " + Utiles.esPrimo(7));
        System.out.println("¿9 es primo? " + Utiles.esPrimo(9));
        System.out.println("¿0 es perfecto? " + Utiles.esPerfecto(0));
        System.out.println("¿6 es perfecto? " + Utiles.esPerfecto(6));
        System.out.println("¿28 es perfecto? " + Utiles.esPerfecto(28));
        System.out.println("¿12 es perfecto? " + Utiles.esPerfecto(12));
        System.out.println("5! = " + Utiles.factorial(5));
        System.out.println("0! = " + Utiles.factorial(0));

        System.out.println("\n--- EJERCICIOS DEL EXAMEN ---");
        System.out.println("1. Puede entrar (16, acompañado, zombie): "
                + Ejercicios.puedeEntrar(16, true, "zombie"));
        System.out.println("1. Puede entrar (15, solo, vampiro): "
                + Ejercicios.puedeEntrar(15, false, "vampiro"));
        System.out.println("1. Puede entrar (15, solo, bruja): "
                + Ejercicios.puedeEntrar(15, false, "bruja"));

        // List.of no admite null: por eso usamos ArrayList.
        List<String> caramelos = new ArrayList<String>();
        caramelos.add("dulce");
        caramelos.add("ácido");
        caramelos.add("dulce");
        caramelos.add("misterioso");
        caramelos.add(null);
        System.out.println("2. Caramelos dulces: " + Ejercicios.cuentaCaramelos(caramelos, "dulce"));
        System.out.println("3. Pasos: " + Ejercicios.pasosLaberinto(List.of(2, 3, 4, -1, 5)));
        System.out.println("4. Promedio magia: " + Ejercicios.promedioMagia(List.of(3, 9, 7, 4, 10)));
        System.out.println("4. Promedio sin altos: " + Ejercicios.promedioMagia(List.of(1, 2, 3)));
        System.out.println("5. Cuenta atrás:");
        Ejercicios.cuentaAtrasSustos(4);
        System.out.println("6. Suma entre ceros: "
                + Ejercicios.sumaEntreCeros(List.of(3, 9, 0, 4, 10, 0, -3, 5)));
    }
}
