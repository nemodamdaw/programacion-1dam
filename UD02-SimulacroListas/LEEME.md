# Simulacro de Programación - listas (Java)

Proyecto de práctica basado en el enfoque del examen de la Unidad 2: todas las operaciones están en métodos y `main` solo las prueba. Se trabaja con `List<Integer>` e `Integer`.

## Estructura

- `src/ejercicios/Ejercicios.java`: `suma1` (`for-each`), `suma2` (`for`), `suma3` (`while`); `contarPares`, `contarPrimos`, `contarPerfectos`; `media1`, `media2`, `media3` (mismos tres bucles).
- `src/utiles/Utiles.java`: `esPrimo` y `esPerfecto`, ambos con retorno `boolean`.
- `src/test/TestEjercicios.java`: `main` con llamadas de prueba.

## Importación en Eclipse

1. Descomprime el archivo ZIP.
2. Ve a **File > Import > General > Existing Projects into Workspace**.
3. Selecciona la carpeta `SimulacroListas` como **Select root directory** y termina la importación.
4. Abre `TestEjercicios.java` y ejecuta **Run As > Java Application**.

## Resultados de la lista de prueba

Lista: `[1, 2, 3, 4, 5, 6, 28]`.

- Suma: **49** con cada bucle.
- Pares: **4** (2, 4, 6, 28).
- Primos: **3** (2, 3, 5).
- Perfectos: **2** (6, 28).
- Media: **7.0** con cada bucle.

Nota: para evitar una división entre cero, las medias devuelven `0.0` cuando la lista está vacía. Las listas de prueba no contienen elementos `null`.

## Compilación manual (opcional)

Desde la raíz del proyecto:

```sh
javac -d bin src/ejercicios/Ejercicios.java src/utiles/Utiles.java src/test/TestEjercicios.java
java -cp bin test.TestEjercicios
```
