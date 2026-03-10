//EJERCICIO 3 – Control de consumo de agua
//        Situación:
//        Un usuario debe tomar 3 vasos de agua por día durante 7 días.
//        Quiere analizar su consumo total y diario.
//        Enunciado:
//        1. Pedir los mililitros consumidos en cada vaso.
//        2. Calcular el total diario de agua.
//        3. Indicar si cumple la meta diaria de 1500 ml.
//        4. Calcular el total de agua consumida en los 7 días.
//        5. Determinar cuántos días superó la meta.
//        Incisos:
//        a) Total diario y verificación de meta.
//        b) Total semanal de consumo.
//        c) Días que superaron la meta.

package Tema_2.Ejercicios_Tema2.Entregables_Tema2;

import java.util.Scanner;

public class EJERCICIO_3_Control_Agua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        int aguaDiaria = 0;
        int aguaTotal = 0;
        int metaaguaDiaria = 1500;
        int entradaML = 0;

        for (int dia = 1; dia <= 7; dia++) {
            for (int vasos = 1; vasos <= 3; vasos++) {
                System.out.println("Por favor introduce los mililitros de agua del vaso " + vasos + " del día " + dia + " :");
                entradaML = teclado.nextInt();
                aguaDiaria += entradaML;
            }
            System.out.println("Has consumido un total de " + aguaDiaria + " ml de agua." +
                    ((aguaDiaria > metaaguaDiaria) ? " Has conseguido el objetivo." : "No has conseguido el objetivo."));
            aguaTotal += aguaDiaria;
            aguaDiaria = 0;
        }
        System.out.println("\n\nEl consumo semanal de agua ha sido de: " + aguaTotal + " ml.");
    }
}
