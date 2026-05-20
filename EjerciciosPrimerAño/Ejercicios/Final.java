package Ejercicios;

import java.util.Scanner;

public class Final {

    public static void datosRegistrados(int n, String nombres[], double gastos[], Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del comensal " + i + ": ");
            nombres[i] = sc.nextLine();
            sc.nextLine();

            do {
                System.out.println("GASTO MAYOR A 0");
                System.out.println("Gastos del comensal " + i + ": ");
                gastos[i] = sc.nextDouble();
            } while (gastos[i] < 0);

            System.out.println("----------------------------------------");
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

        System.out.println("Cantidad de personas");
        n = sc.nextInt();

        if (n < 1) {
            System.out.println("Minimo 1 persona");
            return;
        }

        String nombres[] = new String[n];
        double gastos[] = new double[n];

        datosRegistrados(n, nombres, gastos, sc);

        //a- gasto total del asado
        double gastoTotal = 0;
        
        
        for (int i = 0; i < n; i++) {
            gastoTotal += gastos[i];
        }
        
        System.out.println("El gasto total del asado es de " + gastoTotal);

        //b- gasto promedio por persona
        
        double promedio = 0;

        promedio = gastoTotal / n;
        
        System.out.println("El gasto promedio por persona es de " + promedio);
        
        
    }

}
