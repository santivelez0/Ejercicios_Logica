package Funciones;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
//Pedí un entero n. Implementá signo(int n) 
//que devuelva -1 si n<0, 0 si n==0, y 1 si n>0. 
//Mostrá el valor devuelto.
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        n = sc.nextInt();
        
        int sig = Ejercicio_9_funcion.signo(n);
        System.out.println("el valor devuelto es: " + sig);
        
    }

}
