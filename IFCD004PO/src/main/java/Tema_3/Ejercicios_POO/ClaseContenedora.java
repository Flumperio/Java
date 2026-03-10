package Tema_3.Ejercicios_POO;

public class ClaseContenedora {
    //Atributos, podemos tener una clase contenedora de varias clases para agurparlo.
    private Persona     persona;
    private Bicicleta   bicicleta;
    //Contenedor público
    public ClaseContenedora (Persona persona, Bicicleta bicicleta){
        this.persona = persona;
        this.bicicleta = bicicleta;
    }
    //Setters y Getters
    public Persona getPersona() {
        return persona;
    }
    public Bicicleta getBicicleta() {
        return bicicleta;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
}
