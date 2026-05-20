package Ejercicios;

import java.util.Scanner;

public class Escuela {

    public static void registroDatos(int legajo[], double nota1[], double nota2[], double promedio[], Scanner sc) {
        for (int i = 0; i < legajo.length; i++) {

            System.out.println("Legajo del estudiante " + i + ": ");
            legajo[i] = sc.nextInt();

            System.out.println("Notas del estudiante " + i + ": ");
            System.out.println("Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Nota 2: ");
            nota2[i] = sc.nextDouble();

            if (nota1[i] < 1 || nota1[i] > 10) {
                System.out.println("La nota debe ser entre 1 y 10");
                System.out.println("Decime la nota 1: ");
                nota1[i] = sc.nextDouble();
            } else if (nota2[i] < 1 || nota2[i] > 10) {
                System.out.println("La nota debe ser entre 1 y 10");
                System.out.println("Decime la nota 2: ");
                nota2[i] = sc.nextDouble();
            }

            promedio[i] = (nota1[i] + nota2[i]) / 2;

            System.out.println("El promedio de notas del estudiante " + i + ": " + promedio[i]);

        }
    }

    public static void main(String[] args) {
//Una institución educativa registra las notas finales de sus alumnos mediante arreglos paralelos:
//legajos[]: número de legajo del alumno.
//nota1[]: primera nota (1 a 10).
//nota2[]: segunda nota (1 a 10).
//promedios[]: promedio de ambas notas.
//Se solicita:
//a) Calcular el promedio de cada alumno y almacenarlo en el arreglo promedios[].
//b) Ordenar los alumnos por promedio de mayor a menor utilizando el método Bubble Sort.
//En caso de que dos alumnos tengan el mismo promedio, ordenar por legajo de menor a mayor.
//c) Mostrar el estado de todos los arreglos luego de cada pasada del Bubble Sort.
//d) Implementar una búsqueda que, dado un número de legajo ingresado por teclado, indique si el alumno existe y muestre:
//Nota 1
//Nota 2
//Promedio
//e) (Opcional) Si los arreglos quedan ordenados por legajo, implementar una búsqueda binaria por legajo.

        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Decime la cantidad de alumnos");
        n = sc.nextInt();

        if (n < 1) {
            System.out.println("Debe haber minimo 1 alumno");
            return;
        }

        int legajo[] = new int[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];
        double promedio[] = new double[n];

        registroDatos(legajo, nota1, nota2, promedio, sc);

        //b) Ordenar los alumnos por promedio de mayor a menor utilizando el método Bubble Sort.
        promedioMayor(legajo, nota1, nota2, promedio);

        System.out.println("Promedios ordenados de mayor a menor");
        for (int i = 0; i < n; i++) {
            System.out.println("Promedio del estudiante " + i + ": " + promedio[i]);
            System.out.println("Legajo del estudiante " + i + ": " + legajo[i]);

            System.out.println("----------------------------------------------------");
        }

            //d) Implementar una búsqueda que, dado un número de legajo ingresado por teclado, indique si el alumno existe y muestre:
            //Nota 1
            //Nota 2
            //Promedio
            int buscoLegajo;
            boolean encontrado = false;

            System.out.println("Ingrese un numero de legajo y te muestro su informacion");
            buscoLegajo = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (buscoLegajo == legajo[i]) {
                    System.out.println("Legajo encontrado");
                    System.out.println("Nota 1: " + nota1[i]);
                    System.out.println("Nota 2: " + nota2[i]);
                    System.out.println("Promedio: " + promedio[i]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Legajo no encontrado");
            }

    }

    public static void promedioMayor(int legajo[], double nota1[], double nota2[], double promedio[]) {
        int legajoAux = 0;
        double promAux = 0;
        double nota1Aux = 0;
        double nota2Aux = 0;
        int pasada = 0;
        for (int i = 0; i < legajo.length - 1; i++) {
            for (int j = 0; j < legajo.length - 1 - i; j++) {
                if (promedio[j] < promedio[j + 1]
                        || (promedio[j] == promedio[j + 1] && legajo[j] > legajo[j + 1])) {

                    // promedio
                    promAux = promedio[j];
                    promedio[j] = promedio[j + 1];
                    promedio[j + 1] = promAux;

                    // legajo
                    legajoAux = legajo[j];
                    legajo[j] = legajo[j + 1];
                    legajo[j + 1] = legajoAux;

                    // nota1
                    nota1Aux = nota1[j];
                    nota1[j] = nota1[j + 1];
                    nota1[j + 1] = nota1Aux;

                    // nota2
                    nota2Aux = nota2[j];
                    nota2[j] = nota2[j + 1];
                    nota2[j + 1] = nota2Aux;

                }
            }
        }
        for (int i = 0; i < legajo.length; i++) {

            System.out.println("Legajo alumno " + i + ": " + legajo[i]);
            System.out.println("Nota 1 alumno " + i + ": " + nota1[i]);
            System.out.println("Nota 2 alumno " + i + ": " + nota2[i]);
            System.out.println("promedio alumno " + i + ": " + promedio[i]);
            System.out.println("---------------------------------------------");
        }
    }

}
