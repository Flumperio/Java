//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio36 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        double suma = 0;
        double contador = 0;
        double media = 0;
        System.out.println("Introduce numeros para hacer la media. Para salir pon un número negativo.");
        System.out.print("Número: ");
        numeroA = teclado.nextInt();
        while (numeroA >= 0){
            suma = suma + numeroA;
            contador ++;
            System.out.print("\nNúmero: ");
            numeroA = teclado.nextInt();
        }
        media = suma / contador;
        System.out.println("La media de los números es: " + media);
    }
}
