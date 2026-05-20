package Matrices;

import java.util.Scanner;

public class sumaDiagonales {

    public static void main(String[] args) {
//Pedir una matriz cuadrada (por ejemplo 4x4).
//1. Mostrar la diagonal principal y su suma.
//2. Mostrar la diagonal secundaria y su suma.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño de la matriz cuadrada");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [ " + i + " ] " + " [ " + j + " ] ");
                matriz[i][j] = sc.nextInt();
            }
        }
        //diagonal principal
        int sumap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println("Elemento [ " + i + " ] " + " [ " + j + " ] = " + matriz[i][i]);
                    sumap += matriz[i][i];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + sumap);

        //diagonal secundaria
        int columna = n - 1;//arranca en la ultima columna de la matriz
        int sumas = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento [ " + i + " ] " + " [ " + columna + " ] = " + matriz[i][columna]);// matrz arranca en [0][n-1]
            sumas += matriz[i][columna];
            columna--;//a columna(n - 1) le restamos otro asi vuelve una columna, mientras la fila sube
        }
        System.out.println("La suma de la diagonal secundaria es: " + sumas);
    }

}
