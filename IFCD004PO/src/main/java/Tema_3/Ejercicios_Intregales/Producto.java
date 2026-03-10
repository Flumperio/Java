package Tema_3.Ejercicios_Intregales;

public class Producto {
    //Atributos privados
    private String  nombre;
    private int     stock;
    private double  precio;
    //Constuctor publico
    public Producto(String nombre, int stock, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPrecio() {
        return this.precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
