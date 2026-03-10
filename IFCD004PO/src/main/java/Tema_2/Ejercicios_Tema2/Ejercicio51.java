//PROBLEMAS PROPUESTOS
//
//2. Sumar todos los números pares entre 1 y N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int resultado = 0;
        System.out.println("Introduce un número para sumar los pares contenidos en el: ");
        numeroA = teclado.nextInt();
        for (int cnt = 0; cnt <= numeroA; cnt += 2){
            resultado = resultado + cnt;
        }
        System.out.println("La suma de los números pares del número " + numeroA + " es: " + resultado);
    }
}
