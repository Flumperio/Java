//2. Estadísticas de productos en un supermercado
//        Enunciado: Un supermercado necesita calcular estadísticas de sus productos. Crea una clase
//        Producto con atributos nombre, precio y categoria.
//        • Genera una lista de productos de distintas categorías.
//        • Usa streams para calcular:
//        o El precio promedio de todos los productos.
//        o El producto más caro.
//        o El producto más barato.
//        • Muestra los resultados en consola.

package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio_7 {
    public static void ioFichero (List<Productos> ioProductos, String nombreFichero, char a) throws Exception {
        String[]        camposFichero;
        String          lineaActual;
        String          nombre;
        String          categoria;
        double          precio;
        String          rutaFichero = "/home/jcsantos/Documents/java/ifcd0042025/Ficheros/";
        switch (a){
            case 'I':
                BufferedReader lecturaFichero = new BufferedReader(new FileReader(rutaFichero + nombreFichero));
                while ((lineaActual = lecturaFichero.readLine()) != null) {
                    camposFichero = lineaActual.split(",");
                    nombre = camposFichero[0].trim();
                    categoria = camposFichero[1].trim();
                    precio = Double.parseDouble(camposFichero[2].trim());
                    ioProductos.add(new Productos(nombre, categoria, precio));
                }
                lecturaFichero.close();
                break;
            case 'O':
                BufferedWriter escrituraFichero = new BufferedWriter(new FileWriter(rutaFichero+nombreFichero));
                for (Productos camposProductos : ioProductos){
                    escrituraFichero.write(camposProductos.getNombre() + "," + camposProductos.getCategoria() + "," + camposProductos.getPrecio());
                    escrituraFichero.newLine();
                }
                escrituraFichero.close();
                break;
        }
    }
    public static void main(String[] args) throws Exception {
        //Definimos las variables.
        List<Productos> masKom = new ArrayList<>();
        List<Productos> masKomOrdenados = new ArrayList<>();
        Double          precioPromedio;
        double          precioCaro;
        double          precioBarato;

        //Introducción de datos
        ioFichero(masKom, "productos.txt", 'I');

        //Logica del programa
        //Calculamos el promedio usando Streams. Ponemos orElse a 0.0 ya que en caso de no tener ningún valor fallaría la ejecución.
        //Si no ponemos orElse, la variable de precioPromedio tedría que ser OptionalDouble ya que si puede NO contener ningún valor.
        //Mejor opción orElse.
        precioPromedio = masKom.stream().mapToDouble(Productos::getPrecio).average().orElse(0.0);
        precioCaro = masKom.stream().mapToDouble(Productos::getPrecio).max().orElse(0.0);
        precioBarato = masKom.stream().mapToDouble(Productos::getPrecio).min().orElse(0.0);

        //Ordenamos por categoría, y grabamos el fichero. En este caso me creo otra lista para no modificar la antigua.
        masKomOrdenados = masKom.stream().sorted((it1, it2) -> it1.getCategoria().compareTo(it2.getCategoria())).toList();
        ioFichero(masKomOrdenados, "makom_Ordenado.txt", 'O');
        //Impresión de datos
//        for (Productos item : masKom){
//            System.out.println(item.getNombre() + " <<-->> " +
//                    item.getCategoria() + " <<-->> " + item.getPrecio() + "€");
        // }
        System.out.println("El promedio de precios es: " + String.format("%.2f", precioPromedio) +
                "\nEl precio más caro es: " + String.format("%.2f", precioCaro) +
                "\nEl precio más barato es: " + precioBarato);

    }
}
