//PROBLEMAS PROPUESTOS
//
//8. Contar cuántos números entre 1 y N son divisibles por 3.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        int resultado = 0;
        System.out.println("Introduce un número para comprobar cuantos son divisibles por 3: ");
        numeroA = teclado.nextInt();
        for (int cnt = 1; cnt <= numeroA; cnt += 1){
            if (cnt % 3 == 0)
                resultado ++;
        }
        System.out.println("La cantidad de números divisibles por 3 ente 1 y " + numeroA + " es: "+ resultado);
    }
}
