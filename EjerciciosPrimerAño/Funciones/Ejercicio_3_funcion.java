package Funciones;

public class Ejercicio_3_funcion {
//Pedí tres enteros.
//Implementá maximoDeTres(int a, int b, int c) que devuelva el mayor.
//Mostrá “El máximo es: X”
public static int maximoDeTres(int a,int b, int c){
    
    if (a > b && a > c) {
    return a;
    } else if (b > a && b > c) {
    return b;
    } else {
    return c;
    }
}    
}
