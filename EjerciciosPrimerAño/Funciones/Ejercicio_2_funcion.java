package Funciones;

public class Ejercicio_2_funcion {
//2) Valor absoluto
//Pedí un entero n. Implementá valorAbsoluto(int n) 
//que devuelva el valor absoluto de n (sin usar Math.abs). Mostrá el resultado.
public static int valorAbsoluto(int n){
    if ( n < 0) {
        n = n * (-1);
    } 
    return n;
}
}
