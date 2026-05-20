package Matrices;

import java.util.Scanner;

public class buscarNumeroArreglo {
    public static void main(String[] args) {
//pedir al usuario la cantidad de enteros que va a utilizar. pedirle al usuario que rellene el vector, pedirle un numero a buscar y mostrar el 
//lugar donde se encuentre el elemento (tener en cuenta los casos 
//en los que no se encuentre el elemento y los casos en que se encuentre en más de una posición)

    Scanner sc = new Scanner(System.in);
    int n;
        do {
            System.out.print("Cuantos enteros va a ingresar? (cantidad positiva) ");
            n = sc.nextInt();
            
        } while (n<0);
        

     
        int[] numeros = new int[n];

    
        System.out.println("\nIngrese los " + n + " numeros enteros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

      
        System.out.print("\nIngrese el numero que desea buscar: ");
        int buscado = sc.nextInt();

      
        boolean encontrado = false;
        System.out.println("\nResultado de busqueda:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == buscado) {
                System.out.println(" El numero " + buscado + " se encuentra en la posicion " + i);
                encontrado = true;
            }
        }

  
        if (!encontrado) {
            System.out.println("El numero " + buscado + " no se encuentra en el vector.");
        }
    

    }
    
}
