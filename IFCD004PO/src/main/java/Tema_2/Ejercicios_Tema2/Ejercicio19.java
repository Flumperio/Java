//PROBLEMAS PROPUESTOS
//
//   9. Pide el año de nacimiento y calcula si la persona es mayor de 18 años.
package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio19 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int year;
        int actualYear = 2025;
        System.out.println("Intoduce el año de tu nacimiento: ");
        year =  teclado.nextInt();
        if ((actualYear - year) >= 18) {
            System.out.println("Has nacido en " + year + " eres mayor de edad.");
        } else {
            System.out.println("Has nacido en " + year + " no eres mayor de edad.");
        }
        teclado.close();
    }
}
