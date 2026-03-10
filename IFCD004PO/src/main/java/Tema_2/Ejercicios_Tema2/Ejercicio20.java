//PROBLEMAS PROPUESTOS
//
//   9. Pide el año de nacimiento y calcula si la persona es mayor de 18 años.
package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio20 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA;
        System.out.println("Introduce un número: ");
        numeroA =  teclado.nextInt();
        if (numeroA >= 1 && numeroA <= 100){
            System.out.println("El número " + numeroA + " está entre 1 y 100.");
        } else {
            System.out.println("El número " + numeroA + " no está entre 1 y 100.");
        }
        teclado.close();
    }
}
