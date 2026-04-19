import java.util.Scanner;
public class MenuCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado = 0;
        System.out.println("=== CALCULADORA CON DO-WHILE ===");
        System.out.println("El menú se muestra AL MENOS UNA VEZ.\n");
        do {
            // Mostrar menú (siempre ≥1)
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");

            // Leer opción
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Num2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case 2:
                    System.out.print("Num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Num2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case 3:
                    System.out.print("Num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Num2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case 4:
                    System.out.print("Num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Num2: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado + "\n");
                    } else {
                        System.out.println("Error: División por cero.\n");
                    }
                    break;
                case 0:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.\n");
            }
        } while (opcion != 0);
        scanner.close();
        System.out.println("Programa terminado.");
    }
}