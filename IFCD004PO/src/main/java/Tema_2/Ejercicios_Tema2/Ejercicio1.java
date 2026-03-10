//PROBLEMAS PROPUESTOS
//
//        Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo. 
//        (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro).

package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int ladocuadrado;
        int perimetro;
        System.out.println("Vamos a calcular el perímetro de un cuadrado. \nIngrese el lado del cuadrado: ");
        ladocuadrado =  teclado.nextInt();
        perimetro = ladocuadrado * 4;
        System.out.println("El perimetro del cuadradro es: " + perimetro);
        teclado.close();
    }
}
