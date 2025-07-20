package exercises.calculator;

import java.util.Scanner;

public class Calculator {
    public void calculate(String operation) {
        if (operation.equals("5")) {
            System.out.println("Obama out!!");
            return;
        }

        if(!(operation.equals("1")) || (operation.equals("2")) || (operation.equals("3")) || (operation.equals("4"))){
            System.out.println("Opción no válida");
            return;
        }

        int a = number();
        int b = number();

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

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: división entre cero");
            return 0;
        }
        return a / b;
    }

    public int number() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        return scanner.nextInt();
    }

    public void print(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}