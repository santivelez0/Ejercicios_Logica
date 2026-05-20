package Ejercicios;

import java.util.Scanner;

public class metodoinsercion {

    public static void main(String[] args) {
        int n = 0;
        int pos = 0;
        int aux = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        n = sc.nextInt();

        int arreglo[] = new int[n];

        System.out.println("Digite el arreglo");
        for (int i = 0; i < n; i++) {
            System.out.print("Posicion " + i + ": ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            pos = i;
            aux = arreglo[i];

            while (pos > 0 && arreglo[pos - 1] > aux) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println(" Orden ascendente");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i] + " ");
        }
        
        System.out.println("Orden descendente");
        for (int i = n - 1; i >=0 ; i--) {
            System.out.println(arreglo[i] + " ");
            
        }
    }

}
