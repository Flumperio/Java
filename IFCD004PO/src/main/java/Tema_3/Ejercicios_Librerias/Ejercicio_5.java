//Ejercicio 5 – Calcular días restantes hasta fechas almacenadas
//        El usuario introduce 4 fechas futuras.
//        El programa guarda las fechas en un array y calcula cuántos días faltan para cada una.

package Tema_3.Ejercicios_Librerias;

//Importamos las librerias necesarias
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Definimos las variables.
        Scanner             teclado = new Scanner(System.in);
        LocalDate[]         fechaFutura = new LocalDate[4];
        DateTimeFormatter   formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String              entrada ="";
        //Introducción de datos
        for (int cnt = 0; cnt < 4; cnt++){
            System.out.println("Introduce la fecha futura número (dd/MM/yyyy) " + cnt + ": ");
            entrada = teclado.next();
            fechaFutura[cnt] = LocalDate.parse(entrada);
        }
        //Logica del programa

        //Impresión de datos
    }
}
