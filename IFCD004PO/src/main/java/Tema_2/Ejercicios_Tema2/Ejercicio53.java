//PROBLEMAS PROPUESTOS
//
//4. Mostrar los primeros N términos de la serie 1, 3, 5, 7…

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        System.out.println("Introduce un número para mostrar los primeros N términos de la serie 1, 3, 5, 7… ");
        numeroA = teclado.nextInt();
        for (int cnt = 1; cnt <= numeroA; cnt += 2){
            System.out.println(cnt);
        }
    }
}
