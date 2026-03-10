//PROBLEMAS PROPUESTOS
//
//Escribir un programa que lea dos números enteros y determine cuál es mayor o si son iguales.

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        int  numeroA = 0;
        int  numeroB = 0;
        //Introducimos los datos.
        System.out.println("Intoduzca el primer número: ");
        numeroA = teclado.nextInt();
        System.out.println("Intoduzca el segundo número: ");
        numeroB = teclado.nextInt();
        //Imprimimos el resultado
        if (numeroA > numeroB){
            System.out.println("El número: " + numeroA + " es el mayor de los dos.");
        } else if (numeroA < numeroB) {
            System.out.println("El número: " + numeroB + " es el mayor de los dos.");
        } else {
            System.out.println("Los números son iguales");
        }
        teclado.close();
    }
}
