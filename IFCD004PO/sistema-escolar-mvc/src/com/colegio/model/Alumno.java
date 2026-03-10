package com.colegio.model;

public class Alumno {
    //Atributos - Privados
    private String      nombre;
    private String      curso;
    private double[]    notas;
    //Constuctor público
    //0 - Matematicas
    //1 - Lengua
    //2 - Inglés
    //3 - Ciencias
    public Alumno(String nombre, String curso, double[] notas) {
        this.nombre = nombre;
        this.curso = curso;
        this.notas = notas;
    }
    //Setter y Getter públicos.
    public String getNombre() {
        return nombre;
    }
    public String getCurso() {
        return curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //Calculo promedio
    public double promedio() {
        double suma = 0;
        for(double n : notas)
            suma += n;
        return suma / notas.length;
    }
}
