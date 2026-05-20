package Funciones;



public class Ejercicio_6_funcion {
//Pedí un entero ≥ 2. Implementá esPrimo(int n) que devuelva true si n es primo y false si no 
//(podés chequear divisores desde 2 hasta n-1 o hasta √n). 
//Mostrá “Primo” o “No primo”.    

    public static boolean esPrimo(int n){
        
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
