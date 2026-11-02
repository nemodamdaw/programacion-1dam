# UD02-SimulacroListas — Solución del proyecto existente

Se han mantenido los paquetes `ejercicios`, `test` y `utiles`, los nueve métodos iniciales
 y sus firmas; se han completado los seis ejercicios del examen que figura en `docs/`.

**Ejecutar:** `src/test/TestEjercicios.java` > Run As > Java Application.

**Correcciones:**
- `Utiles.esPrimo(1)`, `esPrimo(0)` y los negativos devuelven `false`.
- `esPerfecto(0)` también devuelve `false`.
- Se añadió `factorial` en `Utiles`, completando el TODO existente.
- La media de una lista vacía devuelve `0.0` para evitar `NaN`.
- En el ejercicio de acceso, el enunciado no aporta parámetro de registro;
  a efectos de esta solución, `"vampiro"` se considera registrado.
- El ejemplo del PDF con `List.of(..., null)` no se puede ejecutar en Java: `List.of` no
  admite `null`. En la clase de pruebas se usa una `ArrayList` que sí permite nulos.
- El ejemplo del PDF de suma entre ceros utiliza por error el nombre `magia`;
  el código correcto pasa la variable `numeros`.
- Cuando no hay niveles >= 5, `promedioMagia` devuelve `0.0`.

**Estilo:** un único `return` al final de los métodos que devuelven un valor; `while + break`
solo donde lo pide expresamente el ejercicio 3 del examen.
