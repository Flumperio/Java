//PROBLEMAS PROPUESTOS
//
//   Pide la edad y muestra si la persona es mayor de edad.

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int edad;
        System.out.println("Intoduce tu edad: ");
        edad =  teclado.nextInt();
        if (edad >= 18){
            System.out.println("Con " + edad + " años, eres mayor de edad");
        } else {
            System.out.println("Con " + edad + " años, eres menor de edad");
        }
        teclado.close();
    }
}
