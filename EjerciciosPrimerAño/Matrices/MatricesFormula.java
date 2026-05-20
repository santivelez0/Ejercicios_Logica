package Matrices;

import java.util.Scanner;

public class MatricesFormula {

    public static void main(String[] args) {
   
    int matriz[][]= new int[4][4];
    Scanner sc = new Scanner(System.in);
        for (int f = 0; f < 4; f++) {//f = fila
            for (int c = 0; c < 4; c++) {//c = columna
                matriz[f][c] = sc.nextInt();
            }
        }
        for (int f = 0; f < 4; f++) {//f = fila
            System.out.println("");
            for (int c = 0; c < 4; c++) {//c = columna
                System.out.print( matriz[f][c] + " " );
               }
        }
    }
    
}
