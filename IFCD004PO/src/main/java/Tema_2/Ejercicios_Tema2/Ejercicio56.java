//PROBLEMAS PROPUESTOS
//
//6. Contar cuántos números primos hay entre 2 y N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;


public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para mostrar los Fibonacci que contiene:");
        int numeroA = teclado.nextInt();

        int numero1 = 0;  // Primer número Fibonacci
        int numero2 = 1;  // Segundo número Fibonacci

        int fibonacci = 0; // Resultado Fibonacci

        for (int cnt = 0; cnt <= numeroA; cnt = numero2) {
            System.out.println(fibonacci);
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
        }
    }
}
