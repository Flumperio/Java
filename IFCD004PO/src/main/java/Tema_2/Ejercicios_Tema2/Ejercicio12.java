//PROBLEMAS PROPUESTOS
//
//   2. Pide un número entero y muestra si es par o impar.

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numero;
        System.out.println("Intoduce un número: ");
        numero =  teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

        teclado.close();
    }
}
