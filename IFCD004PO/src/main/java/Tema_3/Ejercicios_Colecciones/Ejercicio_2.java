//2. Uso de Set para evitar duplicados
//        • Crea un HashSet<Integer> con números repetidos.
//        • Comprueba que los duplicados no se almacenan.
//        • Recorre el conjunto con un for-each.


package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias
import java.util.HashSet;
import java.util.Set;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Definimos las variables.
        Set<Integer>    numeros = new HashSet<>();
        int             contadorDuplicados = 0;
        //Introducción de datos
        for (int cnt = 0; cnt < 10; cnt ++){
            if (!numeros.add((int)(Math.random() * 50)))
                contadorDuplicados++;
        }
        System.out.println(numeros);
        //Logica del programa
        for (int valores : numeros)
            System.out.println(valores);
        //Impresión de datos
        System.out.println("El número de duplicados ha sido de: " + contadorDuplicados);
    }
}
