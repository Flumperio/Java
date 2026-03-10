//PROBLEMAS PROPUESTOS
//
// 8. Calcular la suma de factoriales desde 1! hasta N!.

package Tema_2.Ejercicios_Tema2;


import java.util.Scanner;


public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para mostrar la suma de factoriales");
        int numeroA = teclado.nextInt();

        int suma = 1;
        int resultado = 0;

        for (int cnt = 1; cnt <= numeroA; cnt++) {
            for (int factorial = 1; factorial <= cnt; factorial++){
                suma = suma * factorial;
            }
            resultado += suma;
            suma = 1;
        }
        System.out.println(resultado);
    }
}
