//5. Lectura simple de fichero
//        • Crea un fichero datos.txt con varias líneas de texto.
//        • Usa BufferedReader para leerlo línea por línea.
//        • Muestra el contenido en consola.


package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias

//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
;

public class Ejercicio_5 {
    public static void main(String[] args) throws IOException {
        //Definimos las variables.
        //Esto abre el fichero, hay que cerrarlo antes de abrirlo para escritura
        BufferedReader lecturaFichero = new BufferedReader(new FileReader("/home/jcsantos/Desarrollo/Practicas/datos.txt"));

        String sline;
        List<String> fileRead = new ArrayList<>();
        //Introducción de datos
        do {
            sline = lecturaFichero.readLine();
            if (sline != null)
                fileRead.add(sline);
        } while (sline != null);

        lecturaFichero.close();

        System.out.println("--------------------Read-------------------------\n");
        for (int cnt = 0; cnt < fileRead.size(); cnt ++){
            System.out.println("Linea: " + cnt + " - " + fileRead.get(cnt));
            fileRead.set(cnt, fileRead.get(cnt).toUpperCase());
        }
        //Abrimos el fichero para escritura.
        BufferedWriter escrituraFichero = new BufferedWriter(new FileWriter("/home/jcsantos/Desarrollo/Practicas/datos.txt"));
        System.out.println("--------------------Write-------------------------\n");
        for (String elemento : fileRead) {
            System.out.println(elemento);
            escrituraFichero.write(elemento);
            escrituraFichero.newLine(); //Ojo si no ponemos esto no salta de linea del fichero.
        }
        escrituraFichero.close();
    }
}
