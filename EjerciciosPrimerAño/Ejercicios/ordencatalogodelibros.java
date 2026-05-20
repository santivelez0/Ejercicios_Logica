package Ejercicios;

import java.util.Scanner;

public class ordencatalogodelibros {

    public static void catalogoBiblioteca(String titulos[], String autores[], int isbns[], Scanner sc) {
        for (int i = 0; i < titulos.length; i++) {
            sc.nextLine(); // limpiar buffer después del int del main (solo al inicio)
            System.out.println("Título del libro " + (i + 1) + ": ");
            titulos[i] = sc.nextLine();

            System.out.println("Nombre del autor " + (i + 1) + ": ");
            autores[i] = sc.nextLine();

            System.out.println("Número de ISBN " + (i + 1) + ": ");
            isbns[i] = sc.nextInt();

            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de libros: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe ingresar al menos un libro.");
            return;
        }

        String titulos[] = new String[n];
        String autores[] = new String[n];
        int isbns[] = new int[n];

        catalogoBiblioteca(titulos, autores, isbns, sc);

        // 1. Bubble Sort por título (A–Z)
        metodoBurbuja(titulos);
        System.out.println("\nTitulos por abecedario:");
        for (int i = 0; i < n; i++) {
            System.out.println(titulos[i]);
        }

        // 2. Selection Sort por autor (A–Z)
        metodoSeleccion(autores);
        System.out.println("\nAutores por abecedario:");
        for (int i = 0; i < n; i++) {
            System.out.println(autores[i]);
        }

        // 3. Insertion Sort por ISBN ascendente
        metodoInsercion(isbns);
        System.out.println("\nISBN en orden ascendente:");
        for (int i = 0; i < n; i++) {
            System.out.println(isbns[i]);
        }

        sc.close();
    }

    public static void metodoBurbuja(String titulos[]) {
        for (int i = 0; i < titulos.length - 1; i++) {
            for (int j = 0; j < titulos.length - 1 - i; j++) {
                if (titulos[j].compareToIgnoreCase(titulos[j + 1]) > 0) {
                    String aux = titulos[j];
                    titulos[j] = titulos[j + 1];
                    titulos[j + 1] = aux;
                }
            }
        }
    }

    public static void metodoSeleccion(String autores[]) {
        for (int i = 0; i < autores.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < autores.length; j++) {
                if (autores[j].compareToIgnoreCase(autores[min]) < 0) {
                    min = j;
                }
            }
            String aux = autores[i];
            autores[i] = autores[min];
            autores[min] = aux;
        }
    }

    public static void metodoInsercion(int isbns[]) {
        for (int i = 1; i < isbns.length; i++) {
            int aux = isbns[i];
            int j = i - 1;
            while (j >= 0 && isbns[j] > aux) {
                isbns[j + 1] = isbns[j];
                j--;
            }
            isbns[j + 1] = aux;
        }
    }
}
