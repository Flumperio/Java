//PROBLEMAS PROPUESTOS
//
//Ingresar tres números y mostrar cuál es el mayor de los tres.

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio17 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        int numeroA = 0;
        int cnt = 1;
        int numeroMayor = 0;
        System.out.println("Vamos a calcular el mayor de tres números. ");
        do {
            System.out.println("Introduce el número " + (cnt) + ":");
            numeroA = teclado.nextInt();
            if (numeroMayor < numeroA){
                numeroMayor = numeroA;
            }
            cnt ++;
        } while (cnt < 4);
        System.out.println("El mayor de los tres números es: " + numeroMayor);
        teclado.close();
    }
}
