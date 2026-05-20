package Matrices;

import java.util.Scanner;

public class matrizSimetrica {

    public static void main(String[] args) {
//Ingresar una matriz cuadrada de tamaño n x n.
//Determinar si la matriz es simétrica, es decir, 
//si se cumple que matriz[i][j] == matriz[j][i] para todo i, j.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        
        //cargar datos
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [ " + i + " ] " + " [ " + j + " ] ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        //ver si es simetrica o no
        
    }

}
