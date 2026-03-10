//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio32 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int suma = 0;
        System.out.println("Introduce numeros para hacer la suma. Para salir pon un número negativo.");
        System.out.print("Número: ");
        numeroA = teclado.nextInt();
        while (numeroA >= 0){
            suma = suma + numeroA;
            System.out.print("Número: ");
            numeroA = teclado.nextInt();
        }
        System.out.println("La suma de los números es: " + suma);
    }
}
