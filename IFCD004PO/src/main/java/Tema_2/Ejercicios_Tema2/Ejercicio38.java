//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio38 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int cnt = 0;
        int factorial = 1;
        System.out.println("Introduce un numero para crear su factorial.");
        System.out.print("Número: ");
        numeroA = teclado.nextInt();
        cnt = numeroA;
        while (cnt > 0){
            factorial = factorial * cnt;
            cnt --;
        }
        System.out.println("El factorial del número: " + numeroA + " es: " + factorial);
    }
}
