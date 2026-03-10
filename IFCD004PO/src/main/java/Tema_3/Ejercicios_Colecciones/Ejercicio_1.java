//EJERCICIOS NIVEL BÁSICO
//        1. Lista de nombres con ArrayList
//        • Crea un ArrayList<String> con al menos 5 nombres.
//        • Recorre la lista e imprime cada nombre en consola.
//        • Elimina un nombre y vuelve a mostrar la lista.

package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Definimos las variables.
        Scanner         teclado = new Scanner(System.in);
        String          nombreEntrada = "";
        boolean         nombreNoEncontrado = true;
        List<String>    nombres = new ArrayList<>();

        //Introducción de datos
        for (int cnt = 0; cnt < 5; cnt++) {
            System.out.println("Introduce un nombre: ");
            nombreEntrada = teclado.next();
            nombres.add(nombreEntrada);
        }
        //Logica del programa
        for (String Nombres : nombres){
            System.out.println(Nombres);
        }
        System.out.println("Introduce un nombre para borrar: ");
        nombreEntrada = teclado.next();
        nombreNoEncontrado = nombres.remove(nombreEntrada);
        if (!nombreNoEncontrado)
            System.out.println("No se ha encontrado el nombre");
        //Impresión de datos
        for (String Nombres : nombres){
            System.out.println(Nombres);
        }
    }
}
