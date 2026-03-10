package com.colegio.model;

import java.io.IOException;
import java.util.List;

public class DatosService {
    private static final String RUTA_BASE = "/data/";  // IntelliJ resources

    public static List<Alumno> cargarAlumnos() throws IOException {
        return (List<Alumno>) Ejercicio_Integrador.ioFichero(RUTA_BASE + "estudiantes.txt", Alumno.class);
    }

    public static List<PersonalAdmin> cargarAdmins() throws IOException {
        return (List<PersonalAdmin>) Ejercicio_Integrador.ioFichero(RUTA_BASE + "personalAdministrativo.txt", PersonalAdmin.class);
    }

    public static List<PersonalProfesor> cargarProfesores() throws IOException {
        return (List<PersonalProfesor>) Ejercicio_Integrador.ioFichero(RUTA_BASE + "profesores.txt", PersonalProfesor.class);
    }
}
