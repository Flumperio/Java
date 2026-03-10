//PROBLEMAS PROPUESTOS
//
//   11. Pide un número del 1 al 7 y muestra el día de la semana correspondiente.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio22 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA;
        System.out.println("Introduce un número del 1 al 12: ");
        numeroA =  teclado.nextInt();
        switch (numeroA){
            case 1: System.out.println("Hoy estamos en Enero.");break;
            case 2: System.out.println("Hoy estamos en Febrero.");break;
            case 3: System.out.println("Hoy estamos en Marzo.");break;
            case 4: System.out.println("Hoy estamos en Abril.");break;
            case 5: System.out.println("Hoy estamos en Mayo.");break;
            case 6: System.out.println("Hoy estamos en Junio.");break;
            case 7: System.out.println("Hoy estamos en Julio.");break;
            case 8: System.out.println("Hoy estamos en Agosto.");break;
            case 9: System.out.println("Hoy estamos en Septiembre.");break;
            case 10: System.out.println("Hoy estamos en Octubre.");break;
            case 11: System.out.println("Hoy estamos en Noviembre.");break;
            case 12: System.out.println("Hoy estamos en Diciembre.");break;
            default: System.out.println("No has introducido un número entre 1 y 12.");
        }
        teclado.close();
    }
}
