//PROBLEMAS PROPUESTOS
//
//4. Sumar los primeros N números enteros (N ingresado por el usuario).

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int suma = 0;
        System.out.println("Introduce un número entero: ");
        numeroA = teclado.nextInt();
        for (int cnt = 0; cnt <= numeroA; cnt++){
            suma += cnt;
        }
        System.out.println("La suma de todos los números hasta N es: " + suma);
    }
}
