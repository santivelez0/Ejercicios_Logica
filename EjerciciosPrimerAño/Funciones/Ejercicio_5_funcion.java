package Funciones;

public class Ejercicio_5_funcion {
//Pedí un entero no negativo. Implementá contarDigitos(int n) 
//que devuelva cuántos dígitos tiene (por ejemplo, 0 → 1 dígito).
// Mostrá la cantidad.

    public static int contarDigitos(int n) {
int contador = 0;
        
     while (n > 0){
         n = n / 10;
         contador++;
     }
     return contador;
    }
}
