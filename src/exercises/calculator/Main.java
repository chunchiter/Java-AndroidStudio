package exercises.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String operation;

        while (true) {
            System.out.println("\nCALCULATOR");
            System.out.println("Ingresa una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            operation = scanner.next();

            calculator.calculate(operation);

            if (operation.equals("5")) break;
        }

        scanner.close();
    }
}
