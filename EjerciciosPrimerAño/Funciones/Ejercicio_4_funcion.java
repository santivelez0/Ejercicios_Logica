package Funciones;

public class Ejercicio_4_funcion {
//Pedí base (entero) y exponente (entero ≥ 0). Implementá potencia(int base, int exponente) 
//que calcule base^exponente usando un bucle (sin Math.pow). 
//Mostrá el resultado.
    public static int potencia(int base, int exponente)  {
    int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        
        return resultado;
        
}
}
