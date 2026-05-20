package Matrices;

import java.util.Scanner;

public class promedio_y_posicion {

    public static void main(String[] args) {
//Cargar una matriz de tamaño m x n con enteros.
//1. Calcular el promedio de todos los elementos.
//2. Mostrar los valores mayores al promedio junto con su posición (fila, columna).

        int sumaTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz: ");
        System.out.print("Fila: ");
        int f = sc.nextInt();
        System.out.print("Columna: ");
        int c = sc.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        //cargo matriz y sumo elementos
        System.out.println("\nSuma de elementos");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        //calculo promedio
        double prom = 0;//creo variable
        prom = (double) sumaTotal / (f * c);//f*c = cant de elementos, suma total se pasa a double
        System.out.println("El promedio es: " + prom);
        
        //valores mayores al prom y posicion
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > prom){
                    System.out.println("Valores mayores al promedio ");
                    System.out.println("Elemento [ " + i + " ] " + " [ " + j + " ] = " + matriz[i][j]);
                }
            }
        }
    }

}
