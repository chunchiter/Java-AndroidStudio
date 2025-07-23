package exercises.calculator;

import java.util.Scanner;

public class NoOps {
    private final Scanner scanner = new Scanner(System.in);
    private Double lastResult = null;

    double parseAndCalculate(String input) {
        String[] tokens = input.split(" " ); //need space # +*-/ #

        double a, b;
        String op;

        if (tokens.length == 3) {
            a = Double.parseDouble(tokens[0]);
            op = tokens[1];
            b = Double.parseDouble(tokens[2]);
        } else if (tokens.length == 2 && lastResult != null) {
            a = lastResult;
            op = tokens[0];
            b = Double.parseDouble(tokens[1]);
        } else {
            throw new IllegalArgumentException("Formato no válido.");
        }

        return switch (op) {
            case "+" -> add(a, b);
            case "-" -> sub(a, b);
            case "*" -> mult(a, b);
            case "/" -> div(a, b);
            default -> throw new IllegalArgumentException("Operador no válido: " + op);
        };
    }

    public void setLastResult(double result) {
        this.lastResult = result;
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

    public void print(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}
