package Funciones;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
//2) Valor absoluto
//Pedí un entero n. Implementá valorAbsoluto(int n) 
//que devuelva el valor absoluto de n (sin usar Math.abs). Mostrá el resultado.
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero y te dare su valor absoluto");
        n = sc.nextInt();
       
        int valor = Ejercicio_2_funcion.valorAbsoluto(n);
        System.out.println("el valor absoluto de tu numero es: " + valor);

    }

}
