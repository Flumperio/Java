package Tema_3.Ejercicios_POO;

public class Bicicleta {
    //Atributos privados
    private String marca;
    private String color;
    protected double  velocidadActual;

    //Constructor Público
    public Bicicleta(String marca, String color, double velocidadActual) {
        this.marca = marca;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    //Setters y Getters Públicos
    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double nVelocidadActual) {
        this.velocidadActual = nVelocidadActual;
    }
    //Métodos públicos
    public void acelerar(){
        this.velocidadActual *=1.3;
    }
    public void frenar(){
        this.velocidadActual /= 1.5;
    }
    public void imprimirVelocidad(){
        System.out.println("Velocidad actual: " + this);
    }
    public void imprimirBici(){ System.out.println("Marca: " + this.marca + ". Color: " + this.color + ".");}
}
