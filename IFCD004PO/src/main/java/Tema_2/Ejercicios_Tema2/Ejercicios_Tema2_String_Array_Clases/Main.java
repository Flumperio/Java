package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definimos variables
        double          resultado = 0;
        String          cadenaEntrada = "";
        int[]           arrayNumeros = {99,1,2,36,34,3,93,8,33,6,5};
        //Definimos los objetos de las clases
        Scanner         teclado = new Scanner(System.in);
        ContadorVocales entrada = new ContadorVocales();
        PromedioArreglo ejercicio2 = new PromedioArreglo();
        MayorElemento   ejercicio3 = new MayorElemento();
        InvertirTexto   ejercicio4 = new InvertirTexto("Hola");
        ContadorPares   ejercicio5 = new ContadorPares(arrayNumeros);
        //Ejercicio --- 1
        System.out.println("Introduce una frase para contar sus vocales: ");
        cadenaEntrada = teclado.nextLine();
        resultado = entrada.CntVocales(cadenaEntrada);
        System.out.println("El número de vocales del texto introducido es: " + (int)resultado);
        //Ejercicio --- 2
        resultado = ejercicio2.promedio(arrayNumeros);
        System.out.printf("El promedio del Array es: " + "%.2f%n",resultado);
        //Ejercicio --- 3
        resultado = ejercicio3.getNumeroMayor(arrayNumeros);
        System.out.printf("El número mayor es: " + "%.0f%n",resultado);
        //Ejercicio --- 4
        cadenaEntrada = ejercicio4.getResultado();
        System.out.println("El texto invertido es: " + cadenaEntrada);
        //Ejercicio --- 5
        resultado = ejercicio5.getContador();
        System.out.printf("\nEl número de pares del array es: " + "%.0f%n",resultado);

    }
}
