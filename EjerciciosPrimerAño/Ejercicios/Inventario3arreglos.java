package Ejercicios;

import java.util.Scanner;

public class Inventario3arreglos {

    public static void main(String[] args) {
//Una empresa de venta de insumos informáticos necesita organizar su inventario. 
//Cada producto se representa mediante tres arreglos paralelos: codigos[], nombres[] y precios[].
//Se solicita implementar los siguientes ordenamientos:
//1. Bubble Sort por precio ascendente.
        Scanner sc = new Scanner(System.in);
        // 1. Pedir cantidad de productos
        System.out.print("¿Cuántos productos desea ingresar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // 2. Crear los tres arreglos paralelos
        int[] codigos = new int[n];
        String[] nombres = new String[n];
        double[] precios = new double[n];

        // 3. Cargar los datos del inventario
        System.out.println("\nIngrese los datos de los productos:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto #" + (i + 1));
            System.out.print("Código: ");
            codigos[i] = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Precio: ");
            precios[i] = sc.nextDouble();
        }

        // 4. Mostrar inventario original
        System.out.println("\n=== INVENTARIO ORIGINAL ===");
        mostrarInventario(codigos, nombres, precios);

        // 5. Ordenar por precio ascendente usando Bubble Sort
        bubbleSortPorPrecio(codigos, nombres, precios);

        // 6. Mostrar inventario ordenado
        System.out.println("\n=== INVENTARIO ORDENADO POR PRECIO (ASCENDENTE) ===");
        mostrarInventario(codigos, nombres, precios);

        sc.close();
    }

    // Método de ordenamiento Bubble Sort (por precio ascendente)
    public static void bubbleSortPorPrecio(int[] codigos, String[] nombres, double[] precios) {
        int n = precios.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (precios[j] > precios[j + 1]) {
                    // Intercambiar en los tres arreglos
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    int tempCodigo = codigos[j];
                    codigos[j] = codigos[j + 1];
                    codigos[j + 1] = tempCodigo;

                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;

                    huboIntercambio = true;
                }
            }

            // Optimización: si no hubo intercambios, ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    // Método auxiliar para mostrar el inventario en forma tabular
    public static void mostrarInventario(int[] codigos, String[] nombres, double[] precios) {
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s %-20s %10s%n", "Código", "Nombre", "Precio");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < codigos.length; i++) {
            System.out.printf("%-10d %-20s %10.2f%n", codigos[i], nombres[i], precios[i]);
        }
        System.out.println("---------------------------------------------");
    }
}
