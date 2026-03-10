//PROBLEMAS PROPUESTOS
//
//        Escribir un programa en el cual se ingresen cuatro números, 
//        calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
//


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        //En este caso creamos un array de 4 valores
        int valores[] = new int[4];
        int suma;
        int producto;
        System.out.println("Vamos a calcular la suma de los dos primeros números, y la multiplicación de los dos siguientes");
        for (int cnt = 0; cnt < 4; cnt ++){
            System.out.println("Introduce el número " + (cnt+1) + ":");
            valores[cnt] = teclado.nextInt();
        }
        suma = valores[0] + valores[1];
        producto = valores[2] + valores[3];
        System.out.println("La suma del primer par de números es: " + suma);
        System.out.println("La multiplicación del segundo par de números es: " + producto);
        teclado.close();
    }
}
