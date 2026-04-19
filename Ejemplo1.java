
import java.util.Scanner;

public class Ejemplo1 {
    
    private static final int NUMERO_SECRETO = 55;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intento;
        boolean acertado = false;

        System.out.println("=== EJEMPLO DO-WHILE: Adivina el número secreto (1-100) ===");
        System.out.println("El bucle se ejecuta AL MENOS UNA VEZ.\n");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            if (intento < NUMERO_SECRETO) {
                System.out.println("¡Muy bajo! Intenta un número mayor.");
            } else if (intento > NUMERO_SECRETO) {
                System.out.println("¡Muy alto! Intenta un número menor.");
            } else {
                System.out.println("\n¡FELICIDADES! Acertaste: " + NUMERO_SECRETO);
                acertado = true;
            }
            
            // Si no acertó, pide continuar
            if (!acertado) {
                System.out.println("Inténtalo de nuevo...\n");
            }

        } while (!acertado);

        scanner.close();
        System.out.println("Fin del programa.");
    }
}
