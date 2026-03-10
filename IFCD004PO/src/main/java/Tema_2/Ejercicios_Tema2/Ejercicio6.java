//PROBLEMAS PROPUESTOS
//
//Desarrollar un programa que pida al usuario el radio de un círculo y muestre el perímetro 
//y el área. (Recuerda: área = π * r², perímetro = 2 * π * r).

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        double  radio = 0;
        double  perimetro = 0;
        double  area = 0;
        double  pi = 3.1416;
        //Introducimos los datos.
        System.out.println("Intoduzca el radio del circulo: ");
        radio = teclado.nextFloat();
        perimetro = 2 * pi * radio;
        area = pi * (radio*radio);
        //Imprimimos el resultado
        System.out.printf("El radio del circulo es: %.2f\n", radio);
        System.out.printf("El area del circulo es: %.2f\n", area);
        System.out.printf("El perimetro del circulo es: %.2f\n", perimetro);
        teclado.close();
    }
}
