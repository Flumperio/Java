//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio25 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int nota;
        System.out.println("Introduce un nota: ");
        nota =  teclado.nextInt();
        if (nota < 5) {
            System.out.println("Con esa nota has suspendido.");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Con esa nota has aprobado.");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Con esa nota tienes un notable.");
        } else if (nota >= 9 && nota <= 10) {
        System.out.println("Con esa nota tienes un sobresaliente.");
        } else
            System.out.println("Esa nota no está en el rango.");
        teclado.close();
    }
}
