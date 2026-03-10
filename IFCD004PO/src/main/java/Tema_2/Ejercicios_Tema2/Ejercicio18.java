//PROBLEMAS PROPUESTOS
//
//   Pide una nota (0–10) y muestra si el alumno aprueba o suspende.
package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio18 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        double nota;
        System.out.println("Intoduce tu nota: ");
        nota =  teclado.nextDouble();
        if (nota >= 5){
            System.out.println("Con una nota de " + nota + " has aprobado.");
        } else {
            System.out.println("Con una nota de " + nota + " has suspendido.");
        }
        teclado.close();
    }
}
