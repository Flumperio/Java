//Ejercicio 3 – Diferencias de tiempo entre horas
//        Pide al usuario 3 horas en formato HH:mm y guárdalas en un array. Después calcula la
//        diferencia en minutos entre cada hora y la primera.

package Tema_3.Ejercicios_Librerias;

//Importamos las librerias necesarias

import java.time.LocalTime;
import java.time.Period; // Esto es solo para fechas
import java.time.Duration; //Esto es solo para la duración entre horas.
import java.util.Scanner;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Definimos las variables.
        Scanner     teclado = new Scanner(System.in);
        int         hora = 0;
        int         minuto = 0;
        long        minutosTotales = 0;
        LocalTime[] horasMinutos = new LocalTime[3];

        //Introducción de datos
        for (int cnt = 0; cnt < 3; cnt++){
                System.out.println("Introduce la hora del elemento " + (cnt+1) + ":");
                hora = teclado.nextInt();
                System.out.println("Introduce los minutos para el elemento " + (cnt+1) + ":");
                minuto = teclado.nextInt();
                horasMinutos[cnt] = LocalTime.of(hora, minuto);
        }
        //Logica del programa
        System.out.println("La primera hora es: " + horasMinutos[0]);
        for (int cnt = 1; cnt < 3; cnt ++){
            minutosTotales = Duration.between(horasMinutos[0], horasMinutos[cnt]).toMinutes();
            System.out.println("La diferencia del elemento " + (cnt+1) + " es de: " + minutosTotales / 60 +
                    " horas y " + minutosTotales % 60 + " minutos.");
        }
    }
}
