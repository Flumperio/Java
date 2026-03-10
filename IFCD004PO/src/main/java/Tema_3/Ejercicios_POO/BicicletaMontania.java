package Tema_3.Ejercicios_POO;

public class BicicletaMontania extends Bicicleta {
    //Atributos públicos
    private double  suspension;
    //Para usar el constructor de la clase heredada hay que usar super con los parametros de la clase padre
    //Constuctor Público
    public BicicletaMontania(String marca, String color, double velocidad, double suspension) {
        super(marca, color, velocidad);
        this.suspension = suspension;
    }
    //Metodos Publics
    public double getSuspension() {
        return suspension;
    }
    public void setSuspension(double suspension) {
        this.suspension = suspension;
    }
    //Override del metodo frenar
    @Override
    public void frenar(){
        super.velocidadActual /= 10;
    }
    public void acelerar(){
        super.velocidadActual *=1.1;
    }
}

