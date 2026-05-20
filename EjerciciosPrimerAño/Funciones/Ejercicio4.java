package Funciones;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
//Pedí base (entero) y exponente (entero ≥ 0). Implementá potencia(int base, int exponente) 
//que calcule base^exponente usando un bucle (sin Math.pow). 
//Mostrá el resultado.
        int base = 0;
        int exponente = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("decime la base");
        base = sc.nextInt();
        System.out.println("decime el exponente");
        exponente = sc.nextInt();
        
        
        int result = Ejercicio_4_funcion.potencia(base, exponente);
        
        System.out.println("el resultado es: " + result);
        
        
        
    }

}
