package Ejercicios;

import java.util.Scanner;

public class Final2 {

    public static void registroDatos(String nombre[], int edad[], int indicador[], Scanner sc) {
        for (int i = 0; i < nombre.length; i++) {

            System.out.println("Nombre del estudiante " + i + ": ");
            nombre[i] = sc.nextLine();
            sc.nextLine();

            do {
                System.out.println("Edad del estudiante " + i + ": ");
                edad[i] = sc.nextInt();
            } while (edad[i] < 0);

            System.out.println("Indicador del estudiante " + i + ": ");
            System.out.println("0. No tiene notebook propia -- 1. Tiene notebook propia");
            indicador[i] = sc.nextInt();
            while (indicador[i] != 0 && indicador[i] != 1) {
                System.out.println("Tiene que poner 1 o 0");
                System.out.println("0. No tiene notebook propia -- 1. Tiene notebook propia");
                indicador[i] = sc.nextInt();
            }
            System.out.println("*****************************************************");
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de participantes en el club");
        n = sc.nextInt();

        if (n < 1) {
            System.out.println("Tiene que haber al menos 1 participante");
            return;
        }

        String nombre[] = new String[n];
        int edad[] = new int[n];
        int indicador[] = new int[n];

        registroDatos(nombre, edad, indicador, sc);

        informeCompleto(nombre, edad, indicador, n);

    }

    public static void informeCompleto(String nombre[], int edad[], int indicador[], int n) {
        //informar cantidad total de participantes
        System.out.println("La cantidad total de participantes es: " + n);

        System.out.println("---------------------------------------------");

        //porcentaje de participantes sin notebook
        double porcentaje = 0;
        double contador = 0;
        for (int i = 0; i < n; i++) {
            if (indicador[i] == 0) {
                contador++;
            }
        }

        porcentaje = (contador * 100) / n;

        System.out.println("El porcentaje de participantes sin notebook es: " + porcentaje);

        System.out.println("-------------------------------------------------------------");

        //nombre del participante de mayor edad(si hay iguales, mostrar cualquiera)
        int mayor = 0;
        for (int i = 0; i < n; i++) {
            if (edad[i] > mayor) {
                mayor = edad[i];
            }
        }
        System.out.println("El participante de mayor edad es: " + mayor);

        System.out.println("-------------------------------------------------------------");

        //si existe al menos 1 participante menor de 18 años que no tenga notebook
        int menor = 0;
        for (int i = 0; i < n; i++) {
            if (edad[i] < 18 && indicador[i] == 0) {
                menor++;
            }
        }
        System.out.println("La cantidad de alumnos menores a 18 que no tienen notebook son: " + menor);
    }
}
