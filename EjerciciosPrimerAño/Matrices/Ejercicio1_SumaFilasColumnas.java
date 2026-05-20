package Matrices;

import java.util.Scanner;
public class Ejercicio1_SumaFilasColumnas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nSuma de filas:");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) sumaFila += matriz[i][j];
            System.out.println("Fila " + i + ": " + sumaFila);
        }
        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) sumaCol += matriz[i][j];
            System.out.println("Columna " + j + ": " + sumaCol);
        }
    }
}