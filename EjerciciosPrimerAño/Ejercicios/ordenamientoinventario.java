package Ejercicios;

import java.util.Scanner;

public class ordenamientoinventario {

    public static void mostrarInventario(int n, int codigos[], String nombres[], double precios[], Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Codigo del producto " + i + ": ");
            codigos[i] = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            System.out.print("Nombre del producto " + i + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Precio del producto " + i + ": ");
            precios[i] = sc.nextDouble();

            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        // Ejercicio 1 – Ordenamiento de Inventario
        // 1. Bubble Sort por precio ascendente.
        // 2. Selection Sort por código ascendente.
        // 3. Insertion Sort por nombre alfabético.

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de productos: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        int codigos[] = new int[n];
        String nombres[] = new String[n];
        double precios[] = new double[n];

        mostrarInventario(n, codigos, nombres, precios, sc);

        // ============================================================
        // 1️⃣ Bubble Sort por precio ascendente
        // ============================================================
        System.out.println("\n--- Bubble Sort por precio ascendente ---");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (precios[j] > precios[j + 1]) {
                    // Intercambio en los tres arreglos
                    double auxPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = auxPrecio;

                    int auxCodigo = codigos[j];
                    codigos[j] = codigos[j + 1];
                    codigos[j + 1] = auxCodigo;

                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                }
            }
        }

        System.out.println("Inventario ordenado por precio ascendente:");
        for (int i = 0; i < n; i++) {
            System.out.println(codigos[i] + " - " + nombres[i] + " - $" + precios[i]);
        }

        // ============================================================
        // 2️⃣ Selection Sort por código ascendente
        // ============================================================
        System.out.println("\n--- Selection Sort por codigo ascendente ---");

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (codigos[j] < codigos[min]) {
                    min = j;
                }
            }

            // Intercambio en los tres arreglos
            int auxCodigo = codigos[i];
            codigos[i] = codigos[min];
            codigos[min] = auxCodigo;

            String auxNombre = nombres[i];
            nombres[i] = nombres[min];
            nombres[min] = auxNombre;

            double auxPrecio = precios[i];
            precios[i] = precios[min];
            precios[min] = auxPrecio;
        }

        System.out.println("Inventario ordenado por codigo ascendente:");
        for (int i = 0; i < n; i++) {
            System.out.println(codigos[i] + " - " + nombres[i] + " - $" + precios[i]);
        }

        // ============================================================
        // 3️⃣ Insertion Sort por nombre alfabético
        // ============================================================
        System.out.println("\n--- Insertion Sort por nombre alfabetico ---");

        for (int i = 1; i < n; i++) {
            String auxNombre = nombres[i];
            int auxCodigo = codigos[i];
            double auxPrecio = precios[i];

        
            int j = i - 1;

            while (j >= 0 && nombres[j].compareTo(auxNombre) > 0) {
                nombres[j + 1] = nombres[j];
                codigos[j + 1] = codigos[j];
                precios[j + 1] = precios[j];
                j--;
            }

            nombres[j + 1] = auxNombre;
            codigos[j + 1] = auxCodigo;
            precios[j + 1] = auxPrecio;
        }

        System.out.println("Inventario ordenado alfabeticamente por nombre:");
        for (int i = 0; i < n; i++) {
            System.out.println(codigos[i] + " - " + nombres[i] + " - $" + precios[i]);
        }

    }
}

