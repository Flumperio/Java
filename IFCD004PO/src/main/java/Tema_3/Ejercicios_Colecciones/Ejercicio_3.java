//3. Diccionario con Map
//        • Crea un HashMap<Integer, String> que asocie códigos de producto con su nombre.
//        • Recupera un valor a partir de su clave.
//        • Recorre el mapa mostrando clave y valor.

package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias

//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

import java.util.HashMap;
import java.util.Map;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Definimos las variables.
        Map<Integer, String> productos = new HashMap<>();
        //Introducción de datos
        productos.put(1, "Raton");
        productos.put(2, "Monitor");
        productos.put(3, "Teclado");
        productos.put(4, "Caja");
        productos.put(5, "Ventilación");
        productos.put(5, "Memoria"); //Elemento Duplicado, no se almacena
        productos.put(7, "Memoria");
        productos.put(8, "Monitor");
        //Logica del programa

        //Impresión de datos
        System.out.println(productos);
    }
}
