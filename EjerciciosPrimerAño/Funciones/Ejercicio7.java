package Funciones;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
//Pedí tres double. Implementá promedio3(double a, double b, double c) 
//que devuelva el promedio (double). 
//Mostrá con 2 decimales.
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el primer numero");
        a = sc.nextDouble();
        
        System.out.println("dime el segundo numero");
        b = sc.nextDouble();
        
        System.out.println("dime el tercer numero");
        c = sc.nextDouble();
        
        double promedio = Ejercicio_7_funcion.promedio3(a, b, c);
        
        System.out.println("El promedio de los 3 numeros es: " + String.format("%.2f", promedio));

        
        
    }

}
