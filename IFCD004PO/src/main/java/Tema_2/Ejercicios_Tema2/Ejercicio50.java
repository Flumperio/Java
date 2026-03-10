//PROBLEMAS PROPUESTOS
//
//1. Calcular el factorial de un número N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int resultado = 1;
        System.out.println("Introduce un número para calcular su factorial: ");
        numeroA = teclado.nextInt();
        for (int cnt = 1; cnt <= numeroA; cnt++){
            resultado = resultado * cnt;
        }
        System.out.println("El factorial de " + numeroA + " es: " + resultado);
    }
}
