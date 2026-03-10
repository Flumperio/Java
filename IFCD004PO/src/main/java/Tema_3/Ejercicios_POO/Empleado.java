package Tema_3.Ejercicios_POO;

public class Empleado extends Persona{
    //Atributos privados
    private double  salario;
    private double  bonus = 0.2;

    //Constuctor Público con super para crear los parametros de persona.
    public Empleado(String nombre, String apellidos, int edad, double salario) {
        super(nombre, apellidos, edad);
        this.salario = salario;
    }
}

