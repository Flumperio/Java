//PROBLEMAS PROPUESTOS
//
// Se debe desarrollar un programa que pida un número y calcule el 10%, el 30%, el 50% o el porcentaje que el usuario desee. Mostrar los resultados.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias
        double   valor100 = 0;
        double   valor10 = 0;
        double   valor30 = 0;
        double   valor50 = 0;
        //Introducimos los datos.
        System.out.println("Intoduzca un número: ");
        valor100 = teclado.nextFloat();
        valor10 = valor100 * 0.10;
        valor30 = valor100 * 0.30;
        valor50 = valor100 * 0.50;
        //Imprimimos el resultado
        System.out.println("El número introducido es: " + valor100);
        System.out.println("El 10% de " + valor100 + " es: " + valor10);
        System.out.println("El 30% de " + valor100 + " es: " + valor30);
        System.out.println("El 50% de " + valor100 + " es: " + valor50);
        teclado.close();
    }
}
