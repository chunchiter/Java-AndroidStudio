package exercises.calculator;

import java.util.Scanner;

public class Calculator {
    public void calculate(String operation) {
        if (operation.equals("5")) {
            System.out.println("Obama out!!");
            return;
        }

        if(!operation.equals("1") && !operation.equals("2") && !operation.equals("3") && !operation.equals("4")){
            System.out.println("Opción no válida");
            return;
        }

        double a = number();
        double b = number();

        switch (operation) {
            case "1":
                print(add(a, b));
                break;
            case "2":
                print(sub(a, b));
                break;
            case "3":
                print(mult(a, b));
                break;
            case "4":
                print(div(a, b));
                break;
        }
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: división entre cero");
            return 0;
        }
        return a / b;
    }

    public double number() {
        Scanner scanner = new Scanner(System.in);
        double num;

        for(;;) {
            System.out.print("Ingresa un número: ");
            String input = scanner.nextLine();

            try{
                num = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Entrada no válida. Por favor ingresa un número válido.");
            }
        }

        return num;
    }

    public void print(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}