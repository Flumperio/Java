//EJERCICIO 4 – Control de temperatura de una habitación
//        Situación cotidiana:
//        Una persona revisa si la temperatura de una habitación está dentro de un rango
//        cómodo.
//        Enunciado:
//        El usuario ingresa:
//        • temperatura actual (double)
//        El rango de confort es entre 20 y 25 grados, inclusive.
//        Incisos:
//        a) Indica si la temperatura está dentro del rango.
//        b) Si está por debajo, indica cuánto falta para llegar a 20.
//        c) Si está por encima, indica cuánto se excedió de 25.

package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_Depuracion;

import java.util.Scanner;

public class EJERCICIO_4_Control_temperatura_habitacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        double  temperaturaHabitacion = 0;
        double  temperaturaExceso = 0;
        double  temperaturaFalta = 0;
        System.out.println("Ingrese la temperatura de la habitación. ");
        temperaturaHabitacion = teclado.nextDouble();
        //Calculos
        temperaturaExceso = temperaturaHabitacion - 25;
        temperaturaFalta = 20 - temperaturaHabitacion;
        if (temperaturaExceso > 0)
            System.out.println("La habitación tiene más de " + String.format("%.1f", temperaturaExceso) + " grados del rango de confort.");
        else if (temperaturaFalta > 0)
            System.out.println("La habitación tiene menos de " + String.format("%.1f", temperaturaFalta) + " grados del rango de confort.");
        else
            System.out.println("Con " + temperaturaHabitacion + " grados la habitación está dentro del rango de confort.");
    }
}

