//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio31 {
    public static void main(String[] args) {
        //Definimos las variables necesarias.
        int contador = 1;
        int suma = 0;
        while (contador <= 100){
            suma = suma + contador;
            contador ++;
        }
        System.out.println("La suma de los números de 1 al 100 es: " + suma);
    }
}
