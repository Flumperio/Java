//PROBLEMAS PROPUESTOS
//
// Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
//


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        //En este caso creamos un array de 4 valores
        int valores[] = new int[4];
        int promedio = 0;
        System.out.println("Vamos a calcular el promedio de cuatro números");
        for (int cnt = 0; cnt < 4; cnt ++){
            System.out.println("Introduce el número " + (cnt+1) + ":");
            valores[cnt] = teclado.nextInt();
            promedio = promedio + valores[cnt];
        }
        promedio = promedio / 4;
        System.out.println("El promedio de los valores introducidos es: " + promedio);
        teclado.close();
    }
}
