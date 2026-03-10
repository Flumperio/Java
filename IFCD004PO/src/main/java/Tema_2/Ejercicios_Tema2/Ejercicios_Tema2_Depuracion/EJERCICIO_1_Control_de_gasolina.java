//EJERCICIO 1 – Control de gasolina
//        Situación cotidiana:
//        Un conductor quiere saber cuánta gasolina tiene y si puede llegar a su destino.
//        Enunciado:
//        El usuario ingresa:
//        • litros actuales en el tanque
//        • consumo por kilómetro
//        • distancia a recorrer
//        Incisos:
//        a) Calcula cuántos kilómetros puede recorrer con la gasolina disponible.
//        b) Determina si puede llegar al destino o no.
//        c) Si no puede llegar, calcula cuántos kilómetros le faltarían.

package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_Depuracion;

import java.util.Scanner;

public class EJERCICIO_1_Control_de_gasolina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables,
        float   litrosTanke = 0;
        float   consumoKM = 0;
        float   distanciaRecorrer = 0;
        float   distanciaDeposito = 0;
        System.out.println("Cuantos litros tienes en el deposito de gasolina?: ");
        litrosTanke = teclado.nextFloat();
        System.out.println("Cuanto consume el vehículo?: ");
        consumoKM = teclado.nextFloat();
        System.out.println("Que distancia quieres recorrer?: ");
        distanciaRecorrer = teclado.nextFloat();
        //Calculos
        distanciaDeposito = litrosTanke / consumoKM;
        System.out.println("Con el consumo actual y los litros que tienes puedes recorrer " + distanciaDeposito + " km");
        if (distanciaDeposito < distanciaRecorrer)
            System.out.println("\nCon este combustible no llegas a tu destino. \n" +
                    "Te faltarían: " + (distanciaRecorrer - distanciaDeposito) + " km");
        else {
            System.out.println("Puedes llegar a tu destino.");
        }
    }
}
