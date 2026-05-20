package Funciones;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
//Pedí tres enteros.
//Implementá maximoDeTres(int a, int b, int c) que devuelva el mayor.
//Mostrá “El máximo es: X”
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        a = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        b = sc.nextInt();
        System.out.println("ingrese el tercer numero");
        c = sc.nextInt();

        int num = Ejercicio_3_funcion.maximoDeTres(a, b, c);
        if (a == b || b == c || a == c) {
            System.out.println("los numeros son iguales");
        } else {
            System.out.println("el mayor es: " + num);
        }
    }

}
