package Tema_3.Ejercicios_Intregales;

public class Alumno {
    //Atributos privados.
    private String nombre;
    private int edad;

    //Constuctor público
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}