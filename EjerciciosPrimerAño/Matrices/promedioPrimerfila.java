package Matrices;

import java.util.Scanner;

public class promedioPrimerfila {

    public static void main(String[] args) {
   int suma = 0;
   double prom = 0;
    int matriz[][]= new int[4][4];
    Scanner sc = new Scanner(System.in);
        for (int f = 0; f < 4; f++) {//f = fila
            for (int c = 0; c < 4; c++) {//c = columna
                matriz[f][c] = sc.nextInt();
            }
        }
        for (int c = 0; c < 4; c++) {//c = columna
                suma = suma + matriz[0][c];
               }
        prom = (double)suma/4;
                System.out.print("el promedio es: " + prom  );
    }    
}
