package exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        terminal: while (true){
            System.out.println("CALCULATOR");
            System.out.println("Ingresa una opcion");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Salir");

            input = scanner.next().toLowerCase();

            switch (input){
                case "1":
                    System.out.println("Ingrese un numero:");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese segundo numero:");
                    int b = scanner.nextInt();
                    System.out.println("El resultado es:");
                    System.out.println(a + b);
                    break;
                case "2":
                    System.out.println("Ingrese un numero:");
                    int c = scanner.nextInt();
                    System.out.println("Ingrese segundo numero:");
                    int d = scanner.nextInt();
                    System.out.println("El resultado es:");
                    System.out.println(c - d);
                    break;
                case "3":
                    System.out.println("Ingrese un numero:");
                    int e = scanner.nextInt();
                    System.out.println("Ingrese segundo numero:");
                    int f = scanner.nextInt();
                    System.out.println("El resultado es:");
                    System.out.println(e % f);
                    break;
                case "4":
                    System.out.println("Ingrese un numero:");
                    int g = scanner.nextInt();
                    System.out.println("Ingrese segundo numero:");
                    int h = scanner.nextInt();
                    System.out.println("El resultado es:");
                    System.out.println(g * h);
                    break;
                case "5":
                    System.out.println("Bye bye!!");
                    break terminal;
            }

        }
    }
}