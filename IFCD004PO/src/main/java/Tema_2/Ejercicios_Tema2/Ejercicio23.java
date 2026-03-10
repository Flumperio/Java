//PROBLEMAS PROPUESTOS
//
// 13. Pide un número del 1 al 12 y muestra cuántos días tiene ese mes.


package Tema_2.Ejercicios_Tema2;

import java.util.Scanner;


public class Ejercicio23 {
    public static void main(String[] args) {
        // Definimos la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables necesarias.
        int numeroA;
        System.out.println("Introduce un número del 1 al 12: ");
        numeroA =  teclado.nextInt();
        switch (numeroA){
            case 1: System.out.println("Hoy estamos en Enero. Y tiene 31 días.");break;
            case 2: System.out.println("Hoy estamos en Febrero. Y tiene 28 días.");break;
            case 3: System.out.println("Hoy estamos en Marzo. Y tiene 31 días.");break;
            case 4: System.out.println("Hoy estamos en Abril. Y tiene 30 días.");break;
            case 5: System.out.println("Hoy estamos en Mayo. Y tiene 31 días.");break;
            case 6: System.out.println("Hoy estamos en Junio. Y tiene 30 días.");break;
            case 7: System.out.println("Hoy estamos en Julio. Y tiene 31 días.");break;
            case 8: System.out.println("Hoy estamos en Agosto. Y tiene 31 días.");break;
            case 9: System.out.println("Hoy estamos en Septiembre. Y tiene 30 días.");break;
            case 10: System.out.println("Hoy estamos en Octubre. Y tiene 31 días.");break;
            case 11: System.out.println("Hoy estamos en Noviembre. Y tiene 30 días.");break;
            case 12: System.out.println("Hoy estamos en Diciembre. Y tiene 31 días.");break;
            default: System.out.println("No has introducido un número entre 1 y 12.");
        }
        teclado.close();
    }
}
