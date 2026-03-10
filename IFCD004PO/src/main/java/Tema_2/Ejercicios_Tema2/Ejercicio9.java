//PROBLEMAS PROPUESTOS
//
//Ingresar tres números y mostrar cuál es el mayor de los tres.

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        //En este caso creamos un array de 3 valores
        int valores[] = new int[3];
        int numeroMayor = 0;
        System.out.println("Vamos a calcular el mayor número introducido: ");
        for (int cnt = 0; cnt < 3; cnt ++){
            System.out.println("Introduce el número " + (cnt+1) + ":");
            valores[cnt] = teclado.nextInt();
            if (numeroMayor < valores[cnt]){
                numeroMayor = valores[cnt];
            }
        }
        System.out.println("El mayor de los tres números es: " + numeroMayor);
        teclado.close();
    }
}
