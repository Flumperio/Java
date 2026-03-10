//PROBLEMAS PROPUESTOS
//
//Crear un programa que solicite al usuario ingresar la base y la altura de un triángulo y muestre su área.
// (Área = base * altura / 2)

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        double  base = 0;
        double  altura = 0;
        double  area = 0;
        //Introducimos los datos.
        System.out.println("Intoduzca la base del triangulo: ");
        base = teclado.nextFloat();
        System.out.println("Intoduzca la altura del triangulo: ");
        altura = teclado.nextFloat();
        area = (base * altura) / 2;
        //Imprimimos el resultado
        System.out.printf("La base del triangulo es: " + base + " y la altura del triangulo es: " + altura);
        System.out.printf("\nEl area del triangulo es: %.2f\n", area);
        teclado.close();
    }
}
