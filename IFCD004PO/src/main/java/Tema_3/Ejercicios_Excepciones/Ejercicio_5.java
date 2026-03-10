package Tema_3.Ejercicios_Excepciones;

import java.util.Scanner;

public class Ejercicio_5 {

//Creamos un método para validar la edad.
public static void validadEdad(int edad) throws EdadInvalida {
    if (edad < 18)
        throw new EdadInvalida("No cumples con la edad mínima.");
}
    public static void main (String[] args) {
        //Definición de variables
        Scanner teclado = new Scanner(System.in);
        int     edad;
        //Logica
        try {
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();
            validadEdad(edad);
            System.out.println("Estas con la edad adecuada.");
        } catch (EdadInvalida e){
            System.out.println("Error de registro: " + e.getMessage());
        }
    }
}
