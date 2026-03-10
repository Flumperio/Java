//PROBLEMAS PROPUESTOS
//
// 9. Mostrar todos los divisores de un número N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;


public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para mostrar sus divisores: ");
        int numeroA = teclado.nextInt();

        for (int cnt = 1; cnt <= numeroA; cnt++) {
            if (numeroA % cnt == 0)
                System.out.println(cnt);
        }
    }
}
