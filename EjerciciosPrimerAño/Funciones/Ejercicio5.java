package Funciones;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
//Pedí un entero no negativo. Implementá contarDigitos(int n) 
//que devuelva cuántos dígitos tiene (por ejemplo, 0 → 1 dígito).
// Mostrá la cantidad.

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero positivo ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("numero negativo");
        } else {
            int contador = Ejercicio_5_funcion.contarDigitos(n);
            System.out.println("la cantidad de digitos que tiene el numero son: " + contador);
        }

    }

}
