//Ejercicio 1: División entre cero
//        Escribe un programa que pida dos números y muestre su división. Maneja la excepción cuando el
//        divisor sea cero.

package Tema_3.Ejercicios_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int     numero1 = 0;
        int     numero2 = 0;
        int  resultado = 0;
        //Intoducción de datos.
        try {
            System.out.println("Intoduce el primer valor: ");
            numero1 = teclado.nextInt();
            System.out.println("Intoduce el segundo valor: ");
            numero2 = teclado.nextInt();
            //Logica del programa
            resultado = numero1 / numero2;
        System.out.println("El resultado de la división de " + numero1 + '/' +numero2 + " es de: " + (float) resultado );
        }catch (InputMismatchException excp){
            System.out.println("No has pasado un número en alguno de los parámetros.");
        }catch (ArithmeticException excp){
            System.out.println("División por cero ");
        }
    }
}
