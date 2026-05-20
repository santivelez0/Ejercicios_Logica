package Funciones;


public class Ejercicio_10_funcion {
//Pedí precio (double ≥ 0) y porcentaje (double entre 0 y 100). 
//Implementá aplicarDescuento(double precio, double porcentaje) 
//que devuelva el precio final luego del descuento. 
//Mostrá con 2 decimales.

    public static double aplicarDescuento (double precio, double porcentaje){
        double preciofina = 0;
        double preciofinal = 0;
        if (precio >= 0 || porcentaje >=0 || porcentaje<101){
            preciofina = (precio * porcentaje)/100;
            preciofinal = precio - preciofina ;
        }
        return preciofinal;
    }

}
