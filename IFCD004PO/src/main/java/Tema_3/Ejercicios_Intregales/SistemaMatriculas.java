//Ejercicio 2: Sistema de matrícula de curso (cupos y edad)
//Situación
//Una academia ofrece un curso con plazas limitadas y una edad mínima. El sistema de matrícula
//debe impedir que se inscriban más alumnos que el cupo máximo y también validar que sean
//mayores de 16 años.
//Orden para el alumnado
//1. Crea dos excepciones personalizadas:
//        • CursoLlenoException (curso sin cupos).
//        • EdadNoValidaException (alumno demasiado joven).
//        2. Crea la clase Alumno con atributos privados String nombre e int edad, y su constructor.
//        3. Crea la clase Curso con:
//        • Atributos privados: String nombre, int cupoMaximo, int inscritosActuales.
//        • Constructor que reciba nombre y cupoMaximo.
//        • Métod o inscribirAlumno(Alumno alumno) que:
//        • Lance EdadNoValidaException si la edad del alumno es menor de 16.
//        • Lance CursoLlenoException si inscritosActuales es igual a cupoMaximo.
//        • Si tod o es correcto, incremente inscritosActuales y muestre un mensaje de
//éxito.
//
//4. Crea una clase SistemaMatriculas con un main que:
//        • Cree un curso con cupo máximo 2.
//        • Intente inscribir:
//        • Un alumno de 15 años (debe fallar por edad).
//        • Dos alumnos de edad válida (debe funcionar).
//        • Un tercer alumno (debe fallar por curso lleno).
//        • Maneje las excepciones y muestre mensajes adecuados.

package Tema_3.Ejercicios_Intregales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaMatriculas {
    public static void main (String[] args){
        //Definición de variables
        Map<String, Curso> listaCursos = new HashMap<>();
        Map<String, Alumno>  listaAlumnos = new HashMap<>();
        //Introducción de datos
        listaCursos.put("Python", new Curso("Python", 5));
        listaCursos.put("c++", new Curso("c++", 1));
        listaAlumnos.put("Carlos", new Alumno("Carlos", 18));
        listaAlumnos.put("Marco", new Alumno("Marco", 15));
        // Logica del programa
        try {
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Carlos"));
            
            listaCursos.get("Python").inscribirAlumno(listaAlumnos.get("Marco"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
