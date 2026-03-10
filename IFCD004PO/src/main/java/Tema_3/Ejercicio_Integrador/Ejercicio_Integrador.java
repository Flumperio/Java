//EJERCICIO BÁSICO – SISTEMA DE CONSULTA ESCOLAR
//        El colegio "Nuestra Señora del Carmen" necesita un programa sencillo que
//        permita consultar dos tipos de información: el sueldo del personal que trabaja en
//        el centro y las notas de los estudiantes. El director necesita poder verificar
//        rápidamente esta información cuando se le solicita, sin necesidad de buscar en
//        múltiples documentos.
//        Actualmente, cuando un empleado del colegio pregunta por su sueldo o cuando
//        un padre de familia consulta las notas de su hijo, el personal administrativo debe
//        buscar manualmente en archivos y carpetas, lo que consume tiempo valioso. Se
//        requiere un programa simple que muestre esta información de manera rápida y
//        clara.
//        El colegio cuenta con:
//        • 5 profesores
//        • 3 empleados administrativos
//        • 20 estudiantes
//        Cada empleado tiene un sueldo mensual fijo, y cada estudiante tiene notas en 4
//        asignaturas: Matemáticas, Lengua, Inglés y Ciencias.
//        Objetivo general:
//        • Consultar y mostrar el sueldo de cualquier empleado del colegio (profesor
//        o administrativo).
//        • Consultar y mostrar las calificaciones de cualquier estudiante.
//        Requisitos funcionales:
//        • RF-01: Almacenar la información del personal (nombre, tipo, sueldo, horas
//        semanales o cargo).
//        • RF-02: Almacenar la información de estudiantes (nombre, curso, 4 notas).
//        • RF-03: Mostrar un menú principal:
//        1. Ver sueldo de personal
//        2. Ver notas de estudiantes
//        3. Salir
//        • RF-04: Al consultar sueldos, listar el personal, permitir elegir uno y mostrar
//        su sueldo e información básica.
//        • RF-05: Al consultar notas, listar los estudiantes, permitir elegir uno y
//        mostrar sus notas y promedio.
//        • RF-06: Calcular el promedio de las 4 asignaturas de cada estudiante.
//        • RF-07: Incluir datos precargados de al menos 5 profesores, 3
//        administrativos y 10 estudiantes.

package Tema_3.Ejercicio_Integrador;

//Importamos las librerias necesarias

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.

public class Ejercicio_Integrador {
    public static void main(String[] args) throws Exception {
        //Definimos las variables.
        Scanner teclado = new Scanner(System.in);
        List<Alumno>            alumnosESO = new ArrayList<>();
        List<PersonalAdmin>     adminsCentro = new ArrayList<>();
        List<PersonalProfesor>  profCentro = new ArrayList<>();
        //Introducción de datos
        alumnosESO = ioFichero ("estudiantes.txt", Alumno.class);
        adminsCentro = ioFichero("personalAdministrativo.txt", PersonalAdmin.class);
        profCentro = ioFichero("profesores.txt", PersonalProfesor.class);
        //Logica del programa
        List<Alumno> finalAlumnosESO = alumnosESO;
        List<PersonalAdmin> finalAdminsCentro = adminsCentro;
        List<PersonalProfesor> finalProfCentro = profCentro;
        SwingUtilities.invokeLater(() -> {
//            new CrearVentana("Carlos", 600, 600, finalAlumnosESO, finalAdminsCentro, finalProfCentro);

        });
        //Impresión de datos
        for (Alumno cntAlumno : alumnosESO)
            System.out.println(cntAlumno.getNombre() + " --> " + cntAlumno.getCurso());
        for (PersonalAdmin cntAdmins : adminsCentro)
            System.out.println((cntAdmins.getNombre() + " --> " + cntAdmins.getCargo()));
        for (PersonalProfesor cntProfesores : profCentro)
            System.out.println(cntProfesores.getNombre() + " --> " + cntProfesores.getEspecialidad());
    }
    //Vamos a usar tipos genericos de datos para poder devolver con el mismo metodo un objeto distinto
    public static <TipoObjeto> List<TipoObjeto> ioFichero(String nombreFichero, Class<TipoObjeto> tipo) throws IOException{
        List<TipoObjeto>    listaNueva = new ArrayList<>();
        String              nuevaLinea;
        String[]            camposLinea;
        String              rutafichero = "/Users/jcsantos/Documents/java/Ficheros/";
        BufferedReader      lecturaFichero = new BufferedReader(new FileReader(rutafichero + nombreFichero));
        while ((nuevaLinea = lecturaFichero.readLine()) != null){
            if (nuevaLinea.charAt(0) == '#' || nuevaLinea.isBlank())
                continue;
            camposLinea = nuevaLinea.split(",");
            if (tipo == Alumno.class){
                String nombre = camposLinea[0];
                String curso = camposLinea[1];
                double[] notas = new double[4];
                for (int cnt = 0; cnt < 4; cnt++){
                    notas[cnt] = Double.parseDouble(camposLinea[cnt + 2]);
                }
                //Creamos un objeto Alumno para devolver
                Alumno nuevoAlumno = new Alumno(nombre, curso, notas);
                listaNueva.add(tipo.cast(nuevoAlumno));

            }
            if (tipo == PersonalAdmin.class){
                String  nombre = camposLinea[0];
                String  cargo = camposLinea[1];
                String  area = camposLinea[2];
                Double  sueldo = Double.parseDouble(camposLinea[3]);
                Double  aniosAntiguedad = Double.parseDouble(camposLinea[4]);
                PersonalAdmin nuevoPA = new PersonalAdmin(nombre, cargo, area, "", sueldo, aniosAntiguedad);
                listaNueva.add(tipo.cast(nuevoPA));
            }
            if (tipo == PersonalProfesor.class){
                String  nombre = camposLinea[0];
                String  departamento = camposLinea[1];
                String  especialidad = camposLinea[2];
                Double  sueldoMensual = Double.parseDouble(camposLinea[3]);
                Double  horasSemanales = Double.parseDouble(camposLinea[4]);
                PersonalProfesor nuevoProfesor = new PersonalProfesor(nombre, departamento, especialidad, "", sueldoMensual, horasSemanales);
                listaNueva.add(tipo.cast(nuevoProfesor));

            }
        }
        //Cerramos fichero
        lecturaFichero.close();
        //Devolvemos la lista
        return listaNueva;
    }
}

