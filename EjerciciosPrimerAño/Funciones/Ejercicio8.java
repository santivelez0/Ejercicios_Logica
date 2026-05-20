package Funciones;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
//Pedí horas, minutos y segundos (enteros, no negativos). 
//Implementá aSegundos(int h, int m, int s) que devuelva el total en segundos. 
//Mostrá el total.

        int h = 0;
        int m = 0;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("HORAS: ");
        h = sc.nextInt();
        System.out.println("MINUTOS: ");
        m = sc.nextInt();
        System.out.println("SEGUNDOS: ");
        s = sc.nextInt();

        int segundos = Ejercicio_8_funcion.aSegundos(h, m, s);
        if (h < 0 || m < 0 || s < 0) {
            System.out.println("ingrese numeros positivos");
        } else {
            System.out.println("la cantidad de segundo son: " + segundos);
        }
    }

}
