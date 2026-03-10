//PROBLEMAS PROPUESTOS
//
//14. Pide un número y muestra si es divisible por 2, 3, 5 o ninguno.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio28 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int puntosCarne;
        System.out.println("Cuantos puntos tienes del carné: ");
        puntosCarne =  teclado.nextInt();
        if (puntosCarne < 6) {
            System.out.println("Eres un conductor Peligroso.");
        } else if (puntosCarne >= 6 && puntosCarne <= 8) {
            System.out.println("Eres un conductor Regular.");
        } else if (puntosCarne >= 9 && puntosCarne <= 11) {
            System.out.println("Eres un buen conductor.");
        } else if (puntosCarne == 12) {
        System.out.println("Eres un conductor Excelente.");
        } else
            System.out.println("Esos puntos no están en el rango entre 0 y 12.");
        teclado.close();
    }
}
