package Tema_3.Ejercicios_Colecciones;

public class Productos {
    //Clases private
    private String  nombre;
    private String  categoria;
    private double  precio;
    //Constuctor public
    public Productos (String enNombre, String enCategoria, double enPrecio){
            this.nombre = enNombre;
            this.categoria = enCategoria;
            this.precio = enPrecio;
    }
    //Metodos Públicos
    // Getters
    public String getNombre() {return nombre;}
    public String getCategoria() {return categoria;}
    public double getPrecio() {return precio;}
    // Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public void setPrecio(double precio) {this.precio = precio;}
}
