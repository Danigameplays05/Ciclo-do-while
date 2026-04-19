# Ciclo do-while en Java - Dos Ejemplos

## Ejemplo 1: Adivina el Número (Ejemplo1.java)
Línea 1: import java.util.Scanner; — importa la clase Scanner para poder leer datos desde el teclado.
Línea 2: public class MenuCalculadora — declara la clase principal del programa.
Línea 4: public static void main(String[] args) — método principal; es el punto de entrada del programa.
Línea 5: Scanner scanner = new Scanner(System.in); — crea un objeto Scanner conectado a la entrada estándar (teclado).
Línea 6-7: int opcion; double num1, num2, resultado = 0; — declara las variables: opcion guarda la elección del menú; num1 y num2 son los operandos; resultado almacena el cálculo (iniciado en 0).
Línea 8-9: Las dos líneas de System.out.println imprimen el encabezado de bienvenida.
Línea 10: do { — inicia el bloque do-while. Esto garantiza que el menú se muestre al menos una vez, independientemente de la condición.
Líneas 11-16: Cinco System.out.println que imprimen las opciones del menú (1 a 4 y 0 para salir).
Línea 17: opcion = scanner.nextInt(); — lee el número entero que escribe el usuario.
Línea 18: switch (opcion) — evalúa la opción elegida y salta al caso correspondiente.
Cases 1-3 (suma, resta, multiplicación): Cada uno pide dos números con scanner.nextDouble(), realiza la operación correspondiente (+, -, *) y muestra el resultado.
Case 4 (división): Igual que los anteriores, pero antes de dividir verifica if (num2 != 0) para evitar la división por cero. Si num2 es cero, imprime un mensaje de error en lugar del resultado.
Case 0: Solo imprime "¡Adiós!". No hace ningún cálculo; simplemente prepara la salida del bucle.
default: Maneja cualquier número que no sea 0-4, informando al usuario que la opción no es válida.
} while (opcion != 0); — la condición de continuación del bucle: repite todo mientras la opción no sea 0. Cuando el usuario elige 0, el bucle termina.
scanner.close(); — libera los recursos del Scanner.
Última línea: Imprime "Programa terminado." confirmando que el flujo llegó al final.

## Ejemplo 2: Menú Calculadora (MenuCalculadora.java) - 
Explicación línea por línea:
private static final int NUMERO_SECRETO = 55; — declara una constante de clase (no cambia nunca). static significa que pertenece a la clase, no a un objeto; final impide que se modifique; el valor es 55.
int intento; — variable que guardará cada número que escriba el usuario.
boolean acertado = false; — bandera que controla el bucle. Empieza en false y solo cambia a true cuando el usuario adivina.
do { — inicia el bucle. El cuerpo se ejecuta antes de revisar la condición, por eso el usuario siempre hace al menos un intento.
intento = scanner.nextInt(); — lee el número escrito por el usuario y lo guarda en intento.
if (intento < NUMERO_SECRETO) — compara el intento contra la constante 55. Si es menor, imprime "¡Muy bajo!".
else if (intento > NUMERO_SECRETO) — si no era menor, verifica si es mayor. Si lo es, imprime "¡Muy alto!".
else { ... acertado = true; } — si no era ni menor ni mayor, el intento es exactamente 55. Se felicita al usuario y se cambia la bandera a true.
if (!acertado) — justo antes de evaluar la condición del bucle, si todavía no acertó, imprime "Inténtalo de nuevo...". El ! es el operador negación (NOT).
} while (!acertado); — condición de repetición: el bucle continúa mientras acertado sea false. En el momento en que se vuelve true, el bucle termina y no se vuelve a mostrar el menú.
scanner.close(); — libera los recursos del Scanner.
