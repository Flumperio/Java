//PROBLEMAS PROPUESTOS
//
//5. Imprimir la serie alternante de signos: 1, -2, 3, -4, ... hasta N términos.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA = 0;
        System.out.println("Introduce un número para mostrar la serie 1, -2, 3, -4....");
        numeroA = teclado.nextInt();
        for (int cnt = 1; cnt <= numeroA; cnt++){
            if(cnt % 2 == 0)
                System.out.println(cnt * -1);
            else
                System.out.println(cnt);
        }
    }
}
