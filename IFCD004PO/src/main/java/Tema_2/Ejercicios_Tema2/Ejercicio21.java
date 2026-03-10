//PROBLEMAS PROPUESTOS
//
//   11. Pide un número del 1 al 7 y muestra el día de la semana correspondiente.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio21 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA;
        System.out.println("Introduce un número del 1 al 7: ");
        numeroA =  teclado.nextInt();
        switch (numeroA){
            case 1: System.out.println("Hoy es Lunes.");break;
            case 2: System.out.println("Hoy es Martes.");break;
            case 3: System.out.println("Hoy es Miércoles.");break;
            case 4: System.out.println("Hoy es Jueves.");break;
            case 5: System.out.println("Hoy es Viernes.");break;
            case 6: System.out.println("Hoy es Sábado.");break;
            case 7: System.out.println("Hoy es Domingo.");break;
            default: System.out.println("No has introducido un número entre 1 y 7.");
        }
        teclado.close();
    }
}
