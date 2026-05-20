package Ejercicios;

import java.util.Scanner;

public class tresMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("\n1. Burbuja");
        System.out.println("2. Inserción");
        System.out.println("3. Selección");
        System.out.print("Elegí el método de ordenamiento: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                burbuja(nombres);
                System.out.println("\nOrdenado por método Burbuja:");
                break;
            case 2:
                insercion(nombres);
                System.out.println("\nOrdenado por método Inserción:");
                break;
            case 3:
                seleccion(nombres);
                System.out.println("\nOrdenado por método Selección:");
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    // MÉTODO BURBUJA
    public static void burbuja(String[] nombres) {
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                    String aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }
    }

    // MÉTODO INSERCIÓN
    public static void insercion(String[] nombres) {
        for (int i = 1; i < nombres.length; i++) {
            String actual = nombres[i];
            int j = i - 1;
            while (j >= 0 && nombres[j].compareToIgnoreCase(actual) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = actual;
        }
    }

    // MÉTODO SELECCIÓN
    public static void seleccion(String[] nombres) {
        for (int i = 0; i < nombres.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[min]) < 0) {
                    min = j;
                }
            }
            String aux = nombres[i];
            nombres[i] = nombres[min];
            nombres[min] = aux;
        }
    }
}
