package com.colegio.model;

public class PersonalProfesor {
    //Atributos -- Privados
    private String  nombre;
    private String  departamento;
    private String  especialidad;
    private String  tipo;
    private double  sueldoMensual;
    private double  horasSemanales;
    //Constructor privados
    public PersonalProfesor(String nombre, String departamento, String especialidad, String tipo,
                            double sueldoMensual, double horasSemanales) {
        this.horasSemanales = horasSemanales;
        this.sueldoMensual = sueldoMensual;
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    //Setters y Getters públicos - métodos.
    public String getNombre() {
        return nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getTipo() {
        return tipo;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    public double getHorasSemanales() {
        return horasSemanales;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    public void setHorasSemanales(double horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

