package exercises.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator. Escribe 'Out' para terminar.");
        Scanner scanner = new Scanner(System.in);
        NoOps noOps = new NoOps();

        int i = 0; //operaciones realizadas

        while (i < 2) {
            System.out.print("Ingresa una operación: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("Out")) {
                System.out.println("Bye Bye!");
                return;
            }

            try {
                double result = noOps.parseAndCalculate(input);
                noOps.setLastResult(result);
                noOps.print(result);
                i++;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Bye Bye!");
    }
}



/* Metodo
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String operation;

        do {
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

        } while (!operation.equals("5"));

        scanner.close();
    }
}
*/