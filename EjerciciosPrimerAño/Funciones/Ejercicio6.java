package Funciones;



import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
//Pedí un entero ≥ 2. Implementá esPrimo(int n) que devuelva true si n es primo y false si no 
//(podés chequear divisores desde 2 hasta n-1 o hasta √n). 
//Mostrá “Primo” o “No primo”.    
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("decime un numero mayor a 1 y te digo si es primo o no");
        n = sc.nextInt();

        boolean primo = Ejercicio_6_funcion.esPrimo(n);
        if (n <= 2) {
            System.out.println("numero invalido");
        }
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("No primo");
        }

    }

}
