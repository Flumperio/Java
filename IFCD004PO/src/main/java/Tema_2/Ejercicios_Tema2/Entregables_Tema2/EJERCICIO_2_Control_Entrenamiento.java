//EJERCICIO 1 – Control de gastos semanales
//        Situación:
//        Un usuario registra los gastos diarios durante 4 semanas y quiere analizar su consumo.
//        Enunciado:
//        1. Cada semana tiene 7 días.
//        2. Pedir al usuario el gasto diario en pesos.
//        3. Calcular el total de gastos por semana.
//        4. Determinar si superó los 700 pesos en alguna semana.
//        5. Indicar qué semana tuvo el mayor gasto.
//        Incisos:
//        a) Calcular el gasto total por semana.
//        b) Determinar si se supera el límite de 700 €.
//        c) Identificar la semana con mayor gasto.

package Tema_2.Ejercicios_Tema2.Entregables_Tema2;

import java.util.Scanner;

public class EJERCICIO_2_Control_Entrenamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        int ejercicio1 = 0;
        int ejercicio2 = 0;
        int ejercicio3 = 0;
        int entradaRepeticiones = 0;
        double totalejercicio1 = 0;
        double totalejercicio2 = 0;
        double totalejercicio3 = 0;

        for (int dia = 1; dia <= 5; dia++) {
            for (int ejercicio = 1; ejercicio <= 3; ejercicio++) {
                System.out.println("Por favor introduce las repeticiones del ejercicio " + ejercicio + " del día " + dia + " :");
                entradaRepeticiones = teclado.nextInt();
                switch (ejercicio) {
                    case 1:
                        ejercicio1 += entradaRepeticiones;
                        totalejercicio1 += ejercicio1;
                        break;
                    case 2:
                        ejercicio2 += entradaRepeticiones;
                        totalejercicio2 += ejercicio2;
                        break;
                    case 3:
                        ejercicio3 += entradaRepeticiones;
                        totalejercicio3 += ejercicio3;
                        break;
                }
            }
            System.out.println("Resumen: \nRepeticiones ejercicio 1: " + ejercicio1 +
                    "\nRepeticiones ejercicio 2: " + ejercicio2 +
                    "\nRepeticiones ejercicio 3: " + ejercicio3);
            if ((ejercicio1 + ejercicio2 + ejercicio3) > 50)
                System.out.println("Has alcanzado el objetivo de hacer más de 50 repeticiones. En total: " + (ejercicio1 + ejercicio2 + ejercicio3));
            ejercicio1 = 0;
            ejercicio2 = 0;
            ejercicio3 = 0;
        }
        System.out.println("Resumen semanal:\nLa media de repeticiones para el ejercicio 1 es: " + (totalejercicio1 / 5) +
                "\nLa media de repeticiones para el ejercicio 2 es: " + (totalejercicio2 / 5) +
                "\nLa media de repeticiones para el ejercicio 3 es: " + (totalejercicio3 / 5));
    }
}
