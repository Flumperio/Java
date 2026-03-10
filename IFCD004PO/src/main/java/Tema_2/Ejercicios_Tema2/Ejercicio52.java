//PROBLEMAS PROPUESTOS
//
//3. Sumar todos los números impares entre 1 y N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int resultado = 0;
        System.out.println("Introduce un número para sumar los impares contenidos en el: ");
        numeroA = teclado.nextInt();
        for (int cnt = 1; cnt <= numeroA; cnt += 2){
            resultado = resultado + cnt;
        }
        System.out.println("La suma de los números impares del número " + numeroA + " es: " + resultado);
    }
}
