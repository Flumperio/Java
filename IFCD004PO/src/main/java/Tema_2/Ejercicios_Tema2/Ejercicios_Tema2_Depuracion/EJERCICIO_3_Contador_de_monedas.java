//EJERCICIO 3 – Contador de monedas
//        Situación cotidiana:
//        Una persona mete monedas a una hucha y quiere saber cuánto dinero juntó.
//        Enunciado:
//        Usando un bucle, pide al usuario que ingrese el valor de cada moneda en pesos.
//        El proceso termina cuando el usuario ingresa 0.
//        Incisos:
//        a) Suma todas las monedas ingresadas.
//        b) Cuenta cuántas monedas se ingresaron (sin contar el 0).
//        c) Determina si juntó más de 100 euros.

package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_Depuracion;

import java.util.Scanner;

public class EJERCICIO_3_Contador_de_monedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        double sumaMonedas = 0;
        int numMonedas = 0;
        double valorMoneda = 0;
        do {
            System.out.println("Valor de la moneda? (0 para salir): ");
            valorMoneda = teclado.nextDouble();
            sumaMonedas += valorMoneda;
            numMonedas++;
        } while (valorMoneda != 0);
        System.out.println("Has introducido " + (numMonedas - 1) + " monedas. Con un valor de: " + sumaMonedas + " euros.");
        if (sumaMonedas > 100)
            System.out.println("Enhorabuena!!. Has ahorrado más de 100 €");
    }
}
