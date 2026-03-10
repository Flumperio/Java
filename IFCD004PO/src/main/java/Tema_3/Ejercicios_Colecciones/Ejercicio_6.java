//1. Gestión de empleados en una empresa
//        Enunciado: En una empresa de tecnología se quiere analizar la plantilla de trabajadores. Crea
//        una clase Empleado con atributos nombre, departamento y salario.
//        • ºGenera una lista de empleados de distintos departamentos.
//        • Usa streams para filtrar los empleados del departamento "Desarrollo" con salario
//        mayor a 2000€.
//        • Convierte sus nombres a mayúsculas y ordénalos alfabéticamente.
//        • Muestra el resultado en consola.


package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Locale;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_6 {
    public static void main(String[] args) throws Exception {
        //Definimos las variables.
        List<Empleado>  empleadosIT = new ArrayList<>();
        String[]        camposLinea;
        String          nombre;
        String          departamento;
        String          rutaFichero = "/home/jcsantos/Documents/java/ifcd0042025/Ficheros/";
        int             salario;
        //Introducción de datos
        //Apertura de fichero
        BufferedReader  lecturaFichero = new BufferedReader(new FileReader(rutaFichero+"empleados.txt"));
        //Almacen temporal de la lectura de cada linea del fichero
        String          lineaActual = "";
        //Bucle de lectura
        while ((lineaActual = lecturaFichero.readLine()) != null){
            //Creamos una variable tipo Array para dividir en 3 partes con split. Los campos separados por comas del fichero de texto
            camposLinea = lineaActual.split(",");
            nombre = camposLinea[0].trim();
            departamento = camposLinea[1].trim();
            salario = Integer.parseInt(camposLinea[2].trim()); //Hacemos un parseInt para convertir el string en int.
            empleadosIT.add(new Empleado(nombre, departamento, salario));
        }
        lecturaFichero.close(); //Importante cerrar el fichero antes de seguir.
        //Logica del programa
        //Filtramos por departamento de desarrollo y con sueldo mayor a 20000. La lista permanece intacta.
        empleadosIT.stream().filter(empleado -> empleado.getDepartamento().equalsIgnoreCase("desarrollo") && empleado.getSalario() > 20000).
                forEach(empleado -> System.out.println(empleado.getNombre() + " <--> " + empleado.getDepartamento() + " <--> " + empleado.getSalario()));

        //Convertimos todos los nombres a mayúsculas. No se puede hacer con map porque espera un valor, pero los setter son void.
        //Para conversiones directamente en la lista usarmos for/each. Modificamos la lista.
        //Con for-each, podemos abrir llave y meter mas instrucciones para hacer multiples modificaciones a la vez.
        empleadosIT.stream().forEach(empleado -> {
            empleado.setNombre(empleado.getNombre().toUpperCase());
            empleado.setDepartamento(empleado.getDepartamento().toUpperCase());
        });

        //Ordemanos la lista alfabeticamente. Con Streams los elementos son INMUTABLES. Por lo que hay que sobreescribir la lista original para que quede ordenada.
        empleadosIT = empleadosIT.stream().sorted(((it1, it2) -> it1.getNombre().compareTo(it2.getNombre()))).toList();

        //Grabamos en un nuevo fichero.
        BufferedWriter  escrituraFichero = new BufferedWriter(new FileWriter(rutaFichero + "empleados_nuevo.txt"));
        for (Empleado lineaEmpleado : empleadosIT){
            escrituraFichero.write(lineaEmpleado.getNombre()+","+lineaEmpleado.getDepartamento()+","+lineaEmpleado.getSalario());
            escrituraFichero.newLine();
        }
        escrituraFichero.close();
        //Impresión de datos
        for (Empleado cnt : empleadosIT)
            System.out.println(cnt.getNombre() + " --- " + cnt.getDepartamento() + " --- " + cnt.getSalario() + "€.");
    }
}


