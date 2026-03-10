package Tema_3.Ejercicios_POO;

public class Gerente extends Empleado{
    private double bonus = 0.5;

    public Gerente(String nombre, String apellidos, int edad, double salario) {
        super(nombre, apellidos, edad, salario);
    }
}
