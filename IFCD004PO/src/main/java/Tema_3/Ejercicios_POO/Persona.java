package Tema_3.Ejercicios_POO;

public class Persona {
    //Atributos - Privados
    private String  nombre;
    private String  apellidos;
    private int     edad;

    //Constuctor Público
    public Persona (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Setters y Getters públicos
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    //Métodos Públicos
    //Impresión / Saludo
    public void saludar (){
        System.out.println("Hola, me llamo " + this.nombre + " " + this.apellidos);
    }
}
