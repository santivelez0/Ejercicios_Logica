package Funciones;

public class Ejercicio_9_funcion {
//Pedí un entero n. Implementá signo(int n) 
//que devuelva -1 si n<0, 0 si n==0, y 1 si n>0. 
//Mostrá el valor devuelto.

    public static int signo(int n){
        
        if (n < 0){
            return -1;
        } else if (n == 0){
            return 0;
        } else {
            return 1;
        }
    }
    
}
