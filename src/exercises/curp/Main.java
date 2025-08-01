package exercises.curp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear el lector de entrada

        System.out.print("Ingresa tu primer apellido: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Ingresa tu segundo apellido: ");
        String apellido2 = scanner.nextLine();
        System.out.print("Ingresa tu primer nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingresa tu segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingresa tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Sexo (M o F): ");
        String sexo = scanner.nextLine();

        System.out.print("Entidad federativa de nacimiento: ");
        String entidad = scanner.nextLine();

        String curp = "";

        if (!apellido1.isEmpty()) {
            curp += apellido1.toUpperCase().charAt(0);

            // Obtener primera vocal interna del primer apellido
            for (int i = 1; i < apellido1.length(); i++) {
                char c = apellido1.toUpperCase().charAt(i);
                if ("AEIOU".indexOf(c) != -1) {
                    curp += c;
                    break;
                }
            }
        }

        if (!apellido2.isEmpty()) {
            curp += apellido2.toUpperCase().charAt(0);
        }

        if (!nombre1.isEmpty()) {
            curp += nombre1.toUpperCase().charAt(0);
        }

        String[] fecha = fechaNacimiento.split("/");
        if (fecha.length == 3) {
            String anio = fecha[2].substring(2);
            String mes = fecha[1];
            String dia = fecha[0];
            curp += anio + mes + dia;
        }

        curp += sexo.toUpperCase();

        curp += entidad.toUpperCase().substring(0, 2);

        System.out.println("Tu CURP generada (simplificada): " + curp);

        scanner.close();
    }
}
