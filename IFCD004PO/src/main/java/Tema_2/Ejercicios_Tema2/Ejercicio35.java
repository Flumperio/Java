//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio35 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int menu = 0;
        System.out.println("Selecciona una opción: \n" +
                "1.- Opción 1\n" +
                "2.- Opción 2\n" +
                "3.- Opción 3\n" +
                "4.- Salir\n");
        do {
            System.out.print("Comando: ");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Has elegido la Opción 1"); break;
                case 2:
                    System.out.println("Has elegido la Opción 2"); break;
                case 3:
                    System.out.println("Has elegido la Opción 3"); break;
                case 4:
                    System.out.println("Has elegido Salir"); break;
                default:
                    System.out.println("No es una opción válida.");
            }

        } while (menu != 4);
        teclado.close();
    }
}
