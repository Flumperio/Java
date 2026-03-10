//PROBLEMAS PROPUESTOS
//
//6. Contar cuántos números primos hay entre 2 y N.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int     numeroA = 0;
        boolean esPrimo = true;
        System.out.println("Introduce un número mayor de 2 para mostrar los primos que contiene:");
        numeroA = teclado.nextInt();
        for (int cnt = 2; cnt <= numeroA - 1; cnt++){
            for (int primo = 2; primo <= cnt - 1; primo++) {
                if (cnt % primo == 0)
                    esPrimo = false;
            }
            if (esPrimo)
                System.out.println(cnt);
            esPrimo = true;
        }
    }
}
