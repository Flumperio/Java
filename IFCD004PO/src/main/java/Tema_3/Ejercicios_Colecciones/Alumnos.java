package Tema_3.Ejercicios_Colecciones;

public class Alumnos {
    //Campos privados de la clase
    private String  nombre;
    private String  apellido;
    private double  nota;
    //Constructor Publico
    public Alumnos(String nNombre, String nApellido, double nNota){
        this.nombre = nNombre;
        this.apellido = nApellido;
        this.nota = nNota;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public double getNota() {
        return nota;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}
