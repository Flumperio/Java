//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio26 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int menu = 0;
        System.out.println("Selecciona una opción: \n" +
                "0.- Sumar\n" +
                "1.- Restar\n" +
                "2.- Multiplicar\n" +
                "3.- Dividir\n" +
                "4.- Salir\n");
        do {
            System.out.print("Comando: ");
            menu = teclado.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Has elegido Sumar"); break;
                case 1:
                    System.out.println("Has ejelgido Restar"); break;
                case 2:
                    System.out.println("Has elegido Multiplicar"); break;
                case 3:
                    System.out.println("Has elegido Dividir"); break;
                case 4:
                    System.out.println("Has elegido Salir"); break;
                default:
                    System.out.println("No es una opción válida.");
            }

        } while (menu != 4);
        teclado.close();
    }
}
