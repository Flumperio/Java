//Ejercicio 1 – Operaciones matemáticas sobre un array (Math)
//Pide 5 números al usuario, guárdalos en un array, y muestra:
//        • El número mayor
//• El número menor
//• La raíz cuadrada del mayor
//• El valor redondeado del promedio

package Tema_3.Ejercicios_Librerias;

//Importamos las librerias necesarias
import java.util.Scanner;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Definimos las variables.
        Scanner teclado = new Scanner(System.in);
        int[]   arrayNumeros = new int[5];
        int     numeroMayor = 0;
        int     numeroMenor = 0;
        double  numeroPromedio = 0;
        double  cuadradoMayor = 0;
        //Logica del programa
        for (int cnt = 0; cnt < 5; cnt ++){
            System.out.println("Por favor, introduce un número para la posición (" + (cnt + 1) + "): ");
            arrayNumeros[cnt] = teclado.nextInt();
            if (numeroMayor < arrayNumeros[cnt])
                numeroMayor = arrayNumeros[cnt];
            if ((numeroMenor > arrayNumeros[cnt]) || (cnt == 0))
                numeroMenor = arrayNumeros[cnt];
            numeroPromedio += arrayNumeros[cnt];
        }
        numeroPromedio = Math.round(numeroPromedio/5);
        cuadradoMayor = Math.sqrt(numeroMayor);
        //Impresión de resultados
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("La raíz cuadrada del número mayor " + numeroMayor + " es: " + cuadradoMayor);
        System.out.println("El promedio de todos los números redondeado es: " + numeroPromedio);
    }
}
