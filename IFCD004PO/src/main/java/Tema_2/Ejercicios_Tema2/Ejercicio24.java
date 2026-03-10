//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio24 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA;
        boolean esDivisible = false;
        System.out.println("Introduce un número: ");
        numeroA =  teclado.nextInt();
        if (numeroA % 2 == 0) {
            System.out.println("El número es divisible por 2.");
            esDivisible = true;
        }
        if (numeroA % 3 == 0) {
            System.out.println("El número es divisible por 3.");
            esDivisible = true;
        }
        if (numeroA % 5 == 0) {
            System.out.println("El número es divisible por 5.");
            esDivisible = true;
        }
        if (esDivisible == false)
            System.out.println("El número no es divisible por 2, 3 y 5.");
        teclado.close();
    }
}
