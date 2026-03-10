//PROBLEMAS PROPUESTOS
//
//Pedir al usuario una cantidad en grados Celsius y mostrar su equivalente en grados Fahrenheit.
//(Fórmula: F = C * 9/5 + 32)

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        double  gradosCelsius = 0;
        double  gradosFahren = 0;
        System.out.println("Introduce los grados Celsius a convertir: ");
        gradosCelsius = teclado.nextDouble();
        gradosFahren = (gradosCelsius * 9.0/5.0) + 32;
        System.out.println("Los grados Fahrenheit son: " + gradosFahren);
        teclado.close(); //Cerramos el teclado para no tener fugas de memoria.
    }
}
