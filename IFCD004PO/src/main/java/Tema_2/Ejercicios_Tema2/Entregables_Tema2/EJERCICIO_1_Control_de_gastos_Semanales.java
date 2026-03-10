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

public class EJERCICIO_1_Control_de_gastos_Semanales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        double  gastosSemana1 = 0;
        double  gastosSemana2 = 0;
        double  gastosSemana3 = 0;
        double  gastosSemana4 = 0;
        double  entradaGastos = 0;
        double  sumaGastosSemana = 0;
        double  gastosMaximos = 0;
        int     semanaMaxima = 0;
        for (int semana = 1; semana <= 4; semana ++){
            for (int dia = 1; dia <= 7; dia++){
                System.out.println("Por favor introduce los gastos del dia " + dia + " de la semana " + semana + " :");
                entradaGastos = teclado.nextDouble();
                sumaGastosSemana += entradaGastos;
            }
            if (sumaGastosSemana > gastosMaximos){
                gastosMaximos = sumaGastosSemana;
                semanaMaxima = semana;
            }
            switch (semana) {
                case 1:
                    gastosSemana1 = sumaGastosSemana;
                    break;
                case 2:
                    gastosSemana2 = sumaGastosSemana;
                    break;
                case 3:
                    gastosSemana3 = sumaGastosSemana;
                    break;
                case 4:
                    gastosSemana4 = sumaGastosSemana;
                    break;
            }
            sumaGastosSemana = 0;
        }
        System.out.println(((gastosSemana1 > 700) ? "Has superado los 700€ en la semana 1. Total: " + gastosSemana1 : "Los gastos de la semana 1 han sido: " + gastosSemana1) +
                "\n" + ((gastosSemana2 > 700) ? "Has superado los 700€ en la semana 2. Total: " + gastosSemana2 : "Los gastos de la semana 2 han sido: " + gastosSemana2) +
                "\n" + ((gastosSemana3 > 700) ? "Has superado los 700€ en la semana 3. Total: " + gastosSemana3 : "Los gastos de la semana 3 han sido: " + gastosSemana3) +
                "\n" + ((gastosSemana4 > 700) ? "Has superado los 700€ en lasemana 4. Total: " + gastosSemana4 : "Los gastos de la semana 1 han sido: " + gastosSemana4) +
                "\n" + "\nLa semana que más has gastado ha sido la número: " + semanaMaxima);

    }
}
