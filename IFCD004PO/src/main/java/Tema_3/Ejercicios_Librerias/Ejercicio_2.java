//Ejercicio 2 – Cálculo de edades con LocalDate
//        Pide al usuario 3 fechas de nacimiento, guárdalas en un array, y calcula la edad actual de
//        cada una. Luego determina:
//        • Edad mayor
//        • Edad menor

package Tema_3.Ejercicios_Librerias;

//Importamos las librerias necesarias
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Definimos las variables.
        Scanner     teclado = new Scanner(System.in);
        int         dia = 0;
        int         mes = 0;
        int         anio = 0;
        int         edadMayor = 0;
        int         edadMenor = 0;
        int         edadActual;
        LocalDate[] fechasFormato = new LocalDate[3];

        //Introducción de datos
        for (int cnt = 0; cnt < 3; cnt++){
                System.out.println("Para la fecha número: " + (cnt + 1) + " introduce el día: ");
                dia = teclado.nextInt();
                System.out.println("Para la fecha número: " + (cnt + 1) + " introduce el mes: ");
                mes = teclado.nextInt();
                System.out.println("Para la fecha número: " + (cnt + 1) + " introduce el año: ");
                anio = teclado.nextInt();
                fechasFormato[cnt] = LocalDate.of(anio, mes, dia);
        }
        //Logica del programa
        for (int cnt = 0; cnt < 3; cnt++){
            edadActual = Period.between(fechasFormato[cnt], LocalDate.now()).getYears();
            System.out.println("Para la fecha número 1, la edad actual es de: " + edadActual + " años.");
            if (edadMayor < edadActual)
                edadMayor = edadActual;
            if ((edadMenor > edadActual) || (cnt == 0))
                edadMenor = edadActual;
        }
        //Impresión de datos
        System.out.println("La edad mayor es de : " + edadMayor + " años. Y la edad menor es de: "+
                edadMenor + " años.");
    }
}
