//EJERCICIO 5 – Control de pasos diarios
//        Situación cotidiana:
//        Una persona registra sus pasos diarios para alcanzar una meta.
//        Enunciado:
//        La meta diaria es 10,000 pasos.
//        El usuario ingresa repetidamente la cantidad de pasos que va registrando durante el
//        día usando un bucle. El proceso termina cuando la suma llegue a 10,000 o más.
//        Incisos:
//        a) Suma los pasos en cada ingreso.
//        b) Cuenta cuántos registros hizo el usuario.
//        c) Indica si alcanzó exactamente la meta o la superó.
//        d) Si la superó, cuántos pasos de más caminó.

package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_Depuracion;

import java.util.Scanner;

public class EJERCICIO_5_Control_Pasos_Diario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        int pasosDiarios = 0;
        int pasosObjetivo = 10000;
        int pasosTMP = 0;
        int contadorEntradas = 0;
        //Bucle
        do {
            System.out.println("Introduce el número de pasos: ");
            pasosTMP = teclado.nextInt();
            pasosDiarios += pasosTMP;
            contadorEntradas ++;
        }while (pasosDiarios <= 10000);
        System.out.println("Has realizado " + contadorEntradas + " registro/s.");
        if (pasosDiarios == 10000)
            System.out.println("Has andado exactamente 10.000 pasos !!");
        else
            System.out.println("Has superado en " + (pasosDiarios - pasosObjetivo) + " pasos el objetivo.");
    }
}

