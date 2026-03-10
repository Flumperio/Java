package Tema_3.Ejercicios_Excepciones;

import java.lang.reflect.Array;

public class Ejercicio_2 {
    public static void main (String[] args){
        //Definición de variables.
        int         contador = 0;
        String[]    nombres = {"Carlos", "Ana", "Marco", "Alfonso"};
        //Logica de datos
        try {
            while (contador <= nombres.length){
                System.out.println(nombres[contador]);
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Te has pasado del alcance del array.");
        }
    }
}
