package Ejercicios;

import java.util.Scanner;

public class metodoburbuja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("dime el tamaño del arreglo");
        int n = sc.nextInt();
        
        if (n <= 0){
            System.out.println("Solo numeros positivos");
            return;
        }
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(" Elemento " + i + " : ");
            arreglo[i] = sc.nextInt();
        }
        
        //Arreglo desordenado
        int auxiliar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }
        
        //Arreglo ordenado
            System.out.println("Arreglo ordenado");
        for (int i = 0; i < n; i++) {
            System.out.print( arreglo[i] + " ");
        }
    }

}
