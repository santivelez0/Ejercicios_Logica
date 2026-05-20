package Matrices;

import java.util.Scanner;

public class temperaturas {

    public static void main(String[] args) {
//Registrar las temperaturas máximas de una semana para 3 ciudades distintas (una matriz 3x7).
//Cada fila representa una ciudad y cada columna un día.
//Calcular y mostrar:
//- El promedio semanal de cada ciudad.
//- El día con mayor temperatura general.
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][7];

        //cargar datos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Ciudad numero " + (i + 1));
                System.out.println("Dia " + (j + 1) + " : ");
                System.out.print("Temperatura: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //promedio semanal
        for (int i = 0; i < 3; i++) {
            double prom = 0;
            int suma = 0;
            for (int j = 0; j < 7; j++) {
                suma += matriz[i][j];
                prom = suma / 7;
            }
            System.out.println("Suma de la temperatura en la ciudad " + (i + 1) + " : " + suma);
            System.out.println("El promedio de la temperatura de la ciudad " + (i + 1) + " : " + prom);
        }
        
        //dia con mayor temperatura
        for (int i = 0; i < 3; i++) {
            int mayordia = 1;
        int mayor = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (mayor < matriz[i][j]){
                    mayor = matriz[i][j];
                    mayordia = j + 1;
                }
            }
            System.out.println("En la ciudad " + (i+1) 
                    + "el dia con mayor temperatura fue el dia " + mayordia 
                    + " con " + mayor + " grados" );
        }
        
    }
}
