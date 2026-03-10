//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio37 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int cnt = 1;
        System.out.println("Introduce un numero para crear su tabla de multiplicar.");
        System.out.print("Número: ");
        numeroA = teclado.nextInt();
        while (cnt <= 10){
            System.out.print(numeroA + " x " + cnt + " = "+ numeroA*cnt + "\n");
            cnt ++;
        }
    }
}
