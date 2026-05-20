package Funciones;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
//Pedí precio (double ≥ 0) y porcentaje (double entre 0 y 100). 
//Implementá aplicarDescuento(double precio, double porcentaje) 
//que devuelva el precio final luego del descuento. 
//Mostrá con 2 decimales.
        double precio = 0;
        double porcentaje = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio");
        precio = sc.nextDouble();
        System.out.println("ingrese el porcentaje");
        porcentaje = sc.nextDouble();

        double preciof = Ejercicio_10_funcion.aplicarDescuento(precio, porcentaje);
        if (precio <= 0 || porcentaje <= 0 || porcentaje > 101) {
            System.out.println("ERROR");
        } else {
            System.out.println("el precio final es: " + String.format("%.2f", preciof));
        }
    }
}
