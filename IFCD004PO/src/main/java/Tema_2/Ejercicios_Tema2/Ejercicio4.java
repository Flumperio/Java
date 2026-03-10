//PROBLEMAS PROPUESTOS
//
// Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        float   precioArticulo = 0;
        int     cantidadArticulo = 0;
        float   precioTotal = 0;
        //Introducimos los datos.
        System.out.println("Intoduzca el precio del articulo: ");
        precioArticulo = teclado.nextFloat();
        System.out.println("Introduzca el número de artículos: ");
        cantidadArticulo = teclado.nextInt();
        //Calculamos el total
        precioTotal = precioArticulo * cantidadArticulo;
        //Imprimimos el resultado
        System.out.println("El precio del articulo es: " + precioArticulo);
        System.out.println("El número de articulos comprados es: " + cantidadArticulo);
        System.out.println("El precio total es de: " + precioTotal);
        teclado.close();
    }
}
