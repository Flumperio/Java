//4. Notas de alumnos en un instituto
//        Enunciado: Un instituto quiere obtener un listado de alumnos aprobados. Crea una clase
//        Estudiante con atributos nombre y nota.
//        • Genera un Map<String, Estudiante> donde la clave sea el nombre y el valor el objeto
//        Estudiante.
//        • Usa streams sobre entrySet() para filtrar los alumnos aprobados (nota ≥ 5).
//        • Muestra solo los nombres de los aprobados.
//        • Extiende el ejercicio para ordenar los aprobados por nota descendente.

package Tema_3.Ejercicios_Colecciones;

//Importamos las librerias necesarias
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio_9 {
    public static void ioFichero (Map<String, Alumnos> alumnos, String nombreFichero, char a) throws Exception {
        String[]        camposFichero;
        String          lineaActual;
        String          nombre;
        String          apellido;
        double          nota;
        String          rutaFichero = "/Users/jcsantos/Documents/java/Ficheros/";
        switch (a){
            case 'I':
                BufferedReader lecturaFichero = new BufferedReader(new FileReader(rutaFichero + nombreFichero));
                while ((lineaActual = lecturaFichero.readLine()) != null) {
                    camposFichero = lineaActual.split(",");
                    nombre = camposFichero[0].trim();
                    apellido = camposFichero[1].trim();
                    nota = Double.parseDouble(camposFichero[2].trim());
                    alumnos.put(nombre, new Alumnos(nombre, apellido, nota)); //Pasamos la clave y un nuevo objeto alumno.
                }
                lecturaFichero.close();
                break;
            case 'O':
                BufferedWriter escrituraFichero = new BufferedWriter(new FileWriter(rutaFichero+nombreFichero));
                for (Alumnos cntAlumno : alumnos.values()){
                    escrituraFichero.write(cntAlumno.getNombre() + "," + cntAlumno.getApellido() + "," + cntAlumno.getNota());
                    escrituraFichero.newLine();
                }
                escrituraFichero.close();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        //Definimos las variables.
        Map<String, Alumnos> alumnosPrimaria = new HashMap<>();


        //Introducción de datos
        ioFichero(alumnosPrimaria, "alumnos.txt", 'I');
        //Logica del programa
        //Filtramos con entrySet() para ver los aprobados.Al ser un Map hay que crear el stream con entryset que hablita el par del Map.
        alumnosPrimaria.entrySet().stream().filter(alumnoAprobado -> alumnoAprobado.getValue().getNota() >= 5.0).
                sorted((it1, it2) -> Double.compare(it2.getValue().getNota(), it1.getValue().getNota())). //Para iterar de forma descendente ponemos primero el seguro iterador.
                forEach(alumnoAprobado -> System.out.println(alumnoAprobado.getValue().getNombre() + ", nota: " + alumnoAprobado.getValue().getNota()));

        //Borramos los suspensos, y grabamos los aprobados en un fichero nuevo.

        alumnosPrimaria.entrySet().removeIf(stringAlumnosEntry -> stringAlumnosEntry.getValue().getNota() < 5.0);
        ioFichero(alumnosPrimaria, "alumnos_Aprobados.txt", 'O');
        //Impresión de datos

    }
}
