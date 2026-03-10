package Tema_3.Ejercicios_Intregales;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    //Definimos atributos de la clase
    Map<String, Producto> inventarioProductos = new HashMap<>();
    //Consturctor

    //Setter / Getter

    //Métodos públicos
    public void agregarProducto (Producto nuevoProducto) throws ProductoDuplicadoException {
        if(inventarioProductos.containsKey(nuevoProducto.getNombre()))
                throw new ProductoDuplicadoException("Ya tenemos ese producto en stock. No se añade. ");
        else
            inventarioProductos.put(nuevoProducto.getNombre(), nuevoProducto);
    }
    public void vender(String nombreProducto, int cantidad) throws Exception {
        if(inventarioProductos.containsKey(nombreProducto))
            throw new ProductoNoEncontradoException("Ese producto no lo tenemos en Stock. No se realiza ninguna acción. ");
        else if (inventarioProductos.get(nombreProducto).getStock() < cantidad) {
            throw new StockInsuficienteException("No hay suficiente stock. Quite productos de la cesta.");
        } else {
            System.out.println("Se han vendido " + cantidad + " del producto " + nombreProducto + " correctamente");
            this.inventarioProductos.get(nombreProducto).setStock(this.inventarioProductos.get(nombreProducto).getStock() - cantidad);
        }
    }
}
