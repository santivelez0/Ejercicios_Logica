package Ejercicios;

import java.util.Scanner;

public class parcialproblema4 {

    public static void mostrarInventario(String nombres[], double gastos[], Scanner sc) {
        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Nombre de la persona " + i + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Gastos de la persona " + i + ": ");
            do {
                System.out.println("El gasto no puede ser menor a 0");
                gastos[i] = sc.nextDouble();
                sc.nextLine();
            } while (gastos[i] <= -1);

            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        //registra datos de un asado
        //nombres[]
        //gastos[]monto aportado
        //lea cantidad de comensales
        //para cada persona nombre y gasto realizado
        //calcular
        //a- gasto total del asado
        //b- gasto promedio por persona
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("cantidad de personas");
        n = sc.nextInt();
        sc.nextLine();

        if (n < 1) {
            System.out.println("Minimo 1 persona");
            return;
        }

        String nombres[] = new String[n];
        double gastos[] = new double[n];

        double gastoTotal = 0;
        double gastoPromedio = 0;

        mostrarInventario(nombres, gastos, sc);

        for (int i = 0; i < n; i++) {
            gastoTotal += gastos[i];
        }

        gastoPromedio = gastoTotal / n;

        System.out.println("Gasto total: " + gastoTotal);
        System.out.println("Gasto promedio por persona: " + gastoPromedio);

        System.out.println("---------------------------------------------");

        //para cada comensal
        //debe recibir dinero(aporto mas que el promedio)
        //debe pagar dinero(aporto menos que el promedio)
        //esta equilibrado(aporto el promedio)
        aportePromedio(gastos, gastoPromedio);

        System.out.println("---------------------------------------------");

        //ordenar los comensales por monto aportado de mayor a menor, usando un algoritmo
        //de ordenamiento visto en clase
        //sincronizar nombres y gastos
        System.out.println("Personas por monto aportado de mayor a menor");
        metodoBurbuja(nombres, gastos);
        for (int i = 0; i < n; i++) {
            System.out.println(gastos[i] + " - " + nombres[i]);
        }

        //mostrar el listado ordenado indicando para cada persona
        //nombre
        //monto aportado
        //situacion : "cobra""paga""equilibrado"
        String[] vector = new String[n];
        accionPersona(n, nombres, gastos, gastoPromedio, vector);

        //pesir un nombre y mostrar su situacion, monto y si debe pagar o cobrar
        //si no existe informar que no se encontro
        
        String buscador;
        boolean nombreEncontrado = false;
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese el nombre que desea buscar");
        buscador = sc.nextLine();
        
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equals(buscador)){
                System.out.println("Nombre encontrado");
                System.out.println("Monto aportado: " + gastos[i]);
                System.out.println("Situacion actual: " + vector[i]);
                nombreEncontrado = true;
            }
        }
        if (!nombreEncontrado) {
        System.out.println("No se encontro el nombre");
        }
            
    }

    public static void aportePromedio(double gastos[], double gastoPromedio) {
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > gastoPromedio) {
                System.out.println("Comensal " + i + " aporto mas que el promedio");
            } else if (gastos[i] < gastoPromedio) {
                System.out.println("Comensal " + i + " aporto menos que el promedio");
            } else {
                System.out.println("Aporto el promedio");
            }
        }

    }

    public static void metodoBurbuja(String nombres[], double gastos[]) {
        double aux = 0;
        String auxNombre;
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                if (gastos[j] < gastos[j + 1]) {
                    aux = gastos[j];
                    gastos[j] = gastos[j + 1];
                    gastos[j + 1] = aux;
                }
                auxNombre = nombres[j];
                nombres[j] = nombres[j + 1];
                nombres[j + 1] = auxNombre;
            }
        }
    }

    public static void accionPersona(int n, String nombres[], double gastos[], double gastoPromedio, String vector[] ) {
        for (int i = 0; i < n; i++) {
            if (gastos[i] < gastoPromedio) {
                vector[i] = "Paga";
            } else if (gastos[i] > gastoPromedio) {
                vector[i] = "Cobra";
            } else {
                vector[i] = "Equilibrado";
            }
        }
    }
}
