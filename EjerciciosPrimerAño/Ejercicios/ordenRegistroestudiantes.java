package Ejercicios;

import java.util.Scanner;

public class ordenRegistroestudiantes {

    public static void registroAcademico(int n, int legajos[], String nombres[], double promedios[], Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Legajo alumno numero " + i + " : ");
            legajos[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre alumno numero " + i + " : ");
            nombres[i] = sc.nextLine();

            System.out.print("promedio alumno numero " + i + " : ");
            promedios[i] = sc.nextDouble();

            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
//En un sistema de registro académico se dispone de tres arreglos: legajos[], nombres[] y promedios[]. 
//Se pide ordenar los registros utilizando distintos criterios.
//1. Bubble Sort por nombre (A–Z).
//2. Selection Sort por promedio descendente.
//3. Insertion Sort por legajo ascendente.
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de alumnos ");
        n = sc.nextInt();

        if (n <= 0) {
            return;
        }

        int legajos[] = new int[n];
        String nombres[] = new String[n];
        double promedios[] = new double[n];

        //registramos datos de los alumnos
        registroAcademico(n, legajos, nombres, promedios, sc);

        System.out.println("--Bubble sort por nombre--");
        metodoBurbuja(nombres, sc);

        System.out.println("-------------------------");

        //Selection Sort por promedio descendente.
        System.out.println("Seleccion sort por promedio descendente");
        metodoSeleccion(promedios);

        System.out.println("-------------------------");

        //Insertion Sort por legajo ascendente.
        System.out.println("Insercion sort por legajo ascendente");
        metodoInsercion(legajos);


    }

    public static void metodoBurbuja(String nombres[], Scanner sc) {

        for (int i = 0; i < nombres.length - 1; i++) {
            String aux;
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                    aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }
        System.out.println("Alumnos por abecedario");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }

    public static void metodoSeleccion(double promedios[]) {

        double aux = 0;

        for (int i = 0; i < promedios.length; i++) {
            int max = i;
            for (int j = 0; j < promedios.length; j++) {
                if (promedios[j] > promedios[max]) {
                    max = j;
                }
            }
            aux = promedios[i];
            promedios[i] = promedios[max];
            promedios[max] = aux;
        }
        System.out.println("Promedios descendentes");
        for (int i = 0; i < promedios.length; i++) {
            System.out.println(promedios[i]);
        }
    }
    
    public static void metodoInsercion(int legajos[]){
        for (int i = 0; i < legajos.length; i++) {
            int pos = legajos[i];
            for (int j = 0; j < legajos.length; j++) {
                if (legajos[j] > pos){
                    pos = legajos[j];
                    legajos[j] = legajos[j + 1];
                    legajos[j + 1] = pos;
                }
            }
        }
        System.out.println("Legajos ascendentes");
        for (int i = 0; i < legajos.length; i++) {
            System.out.println(legajos[i]);
        }
    }
}
