//PROBLEMAS PROPUESTOS
//
//6. Mostrar los primeros 10 cubos (1³, 2³, …).

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        System.out.println("Introduce un número para ver su tabla de multiplicar: ");
        numeroA = teclado.nextInt();
        for (int numero = 1; numero <= 10; numero += 1){
            System.out.println(numeroA + " x " + numero + " = " + (numeroA*numero));
        }
    }
}
