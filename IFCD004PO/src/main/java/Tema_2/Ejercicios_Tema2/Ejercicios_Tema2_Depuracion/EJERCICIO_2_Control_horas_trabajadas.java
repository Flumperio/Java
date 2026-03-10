//EJERCICIO 2 – Control de horas trabajadas
//        Situación cotidiana:
//        Una persona quiere saber si trabajó horas extras.
//        Enunciado:
//        El usuario ingresa:
//        • horas trabajadas en el día
//        • horas mínimas esperadas (8)
//        Incisos:
//        a) Determina si cumplió la jornada laboral.
//        b) Si trabajó más de 8 horas, calcula cuántas horas extras hizo.
//        c) Si trabajó menos, indica cuántas le faltaron.

package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_Depuracion;

import java.util.Scanner;

public class EJERCICIO_2_Control_horas_trabajadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        double  horasTrabajadas = 0;
        int     horasMinimas = 8;
        System.out.println("Cuantas horas has trabajado?: ");
        horasTrabajadas = teclado.nextDouble();
        if (horasTrabajadas > horasMinimas){
            System.out.println("Has trabajado " + (horasTrabajadas - horasMinimas) + " horas de mas.");
        } else if (horasTrabajadas < horasMinimas) {
            System.out.println("Has trabajado " + (horasMinimas - horasTrabajadas) + " horas de menos.");
        } else
            System.out.println("Has trabajado las " + (horasTrabajadas) + " horas esperadas.");
    }
}
