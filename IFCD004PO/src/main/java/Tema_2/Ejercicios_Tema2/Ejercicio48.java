//PROBLEMAS PROPUESTOS
//
//9. Mostrar números del N al 1 en orden descendente.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int resultado = 0;
        System.out.println("Introduce un número para contar hasta 1: ");
        numeroA = teclado.nextInt();
        for (int cnt = numeroA; cnt >= 1; cnt --){
            System.out.println(cnt);
        }

    }
}
