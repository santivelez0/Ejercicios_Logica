package Ejercicios;

import java.util.Scanner;

public class gestionturnosclinica {

    public static void infoPacientes(int dniPacientes[], String nombres[], int prioridad[], Scanner sc) {

        for (int i = 0; i < dniPacientes.length; i++) {

            System.out.println("DNI del paciente " + i + ": ");
            do {
                System.out.println("El DNI debe tener 8 numeros");
                dniPacientes[i] = sc.nextInt();
                sc.nextLine();
            } while (dniPacientes[i] < 10000000 || dniPacientes[i] > 99999999);

            System.out.println("Nombre del paciente " + i + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Prioridad del paciente");
            do {
                System.out.println("1. Mayor prioridad -- 5. Menor Prioridad");
                prioridad[i] = sc.nextInt();
                sc.nextLine();
            } while (prioridad[i] < 1 || prioridad[i] > 5);
        }
    }

    public static void main(String[] args) {
//Una clínica privada administra los turnos diarios mediante tres arreglos paralelos:
//- dniPacientes[]: DNI de cada paciente.
//- nombres[]: nombre y apellido del paciente.
//- prioridad[]: número entero de 1 a 5 (1 = mayor prioridad, 5 = menor prioridad).
//
//Se solicita:
//a) Ordenar los turnos por prioridad ascendente utilizando Bubble Sort. 
//En caso de igual prioridad, ordenar por nombre alfabético.
//b) Mostrar el estado de los arreglos luego de cada pasada del Bubble Sort.
//c) Implementar una búsqueda que, dado un DNI ingresado por teclado, 
//indique si el paciente tiene turno y muestre su prioridad.
//d) (Opcional) Si los arreglos quedan ordenados por DNI, implementar una búsqueda por DNI.
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de pacientes ");
        n = sc.nextInt();
        System.out.println("-----------------------");

        if (n <= 0) {
            System.out.println("la cantidad de pacientes debe ser mayor a 0");
            return;
        }

//- dniPacientes[]: DNI de cada paciente.
//- nombres[]: nombre y apellido del paciente.
//- prioridad[]: número entero de 1 a 5 (1 = mayor prioridad, 5 = menor prioridad).
        int dniPacientes[] = new int[n];
        String nombres[] = new String[n];
        int prioridad[] = new int[n];

        infoPacientes(dniPacientes, nombres, prioridad, sc);

//a) Ordenar los turnos por prioridad ascendente utilizando Bubble Sort. 
        metodoBurbuja(prioridad, nombres, dniPacientes);
        System.out.println("Turnos por prioridad ascendente");
        for (int i = 0; i < n; i++) {
            System.out.println(prioridad[i] + " - " + nombres[i] + " - " + dniPacientes[i]);
        }

        System.out.println("--------------------------------------------------------");
//c) Implementar una búsqueda que, dado un DNI ingresado por teclado, 
//indique si el paciente tiene turno y muestre su prioridad.
//d) (Opcional) Si los arreglos quedan ordenados por DNI, implementar una búsqueda por DNI.
    int buscoDni = 0;
    boolean dniEncontrado = false;
    
        System.out.println("Decime un DNI y lo busco");
        buscoDni = sc.nextInt();
        
        for (int i = 0; i < dniPacientes.length; i++) {
            if(dniPacientes[i] ==  buscoDni){
                System.out.println("DNI encontrado");
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Prioridad: " + prioridad[i]);
                dniEncontrado = true;
                
            }
        }
        
        if(!dniEncontrado){
            System.out.println("-no se encontro ningun DNI con ese numero");
        }
    }

    public static void metodoBurbuja(int prioridad[], String nombres[], int dniPacientes[]) {
        int auxprioridad = 0;
        String auxNombre;
        int auxdniPacientes = 0;
        boolean huboIntercambio = false;
        for (int i = 0; i < prioridad.length - 1; i++) {
            for (int j = 0; j < prioridad.length - 1 - i; j++) {
                if (prioridad[j] > prioridad[j + 1]) {
                    auxprioridad = prioridad[j];
                    prioridad[j] = prioridad[j + 1];
                    prioridad[j + 1] = auxprioridad;

                    auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;

                    auxdniPacientes = dniPacientes[j];
                    dniPacientes[j] = dniPacientes[j + 1];
                    dniPacientes[j + 1] = auxdniPacientes;

                    huboIntercambio = true;

                } else if (prioridad[j] == prioridad[j + 1]) {
                    if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                        auxNombre = nombres[j];
                        nombres[j] = nombres[j + 1];
                        nombres[j + 1] = auxNombre;

                        huboIntercambio = true;
                    }
                }
            }
            System.out.println("Pasada" + (i + 1) + ":");
            for (int k = 0; k < prioridad.length; k++) {
                System.out.println(prioridad[k] + " " + nombres[k] + " " + dniPacientes[k]);
            }
        }
    }
}
