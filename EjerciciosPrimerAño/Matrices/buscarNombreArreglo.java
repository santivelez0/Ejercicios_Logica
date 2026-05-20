package Matrices;

import java.util.Scanner;

public class buscarNombreArreglo {

    public static void main(String[] args) {
//2. Partiendo del ejercicio anterior hacer un vector de nombres, 
//donde se pida el tamaño del vector y el elemento a buscar.
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Cuantos nombres va a ingresar?");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0);

        String[] nombres = new String[n];

        System.out.println("Ingrese los nombres:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre [" + i + "]: ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Ingrese el nombre que desea buscar: ");
        String buscado = sc.nextLine();

        boolean encontrado = false;
        System.out.println("Resultado de busqueda:");
        for (int i = 0; i < n; i++) {
            if (nombres[i].equals(buscado)) {
                System.out.println(" El nombre " + buscado + " se encuentra en la posicion " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El nombre " + buscado + " no se encuentra en el vector.");
        }

    }

}
