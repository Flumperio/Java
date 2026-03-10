//Ejercicio 3: Tienda online e inventario de productos
//Situación
//Una tienda online gestiona su inventario de productos. Cada vez que se quiere vender un
//producto, el sistema debe comprobar que el producto existe y que hay stock suficiente. En caso
//contrario, debe lanzar una excepción adecuada.
//Orden para el alumnado
//1. Crea dos excepciones personalizadas:
//        • ProductoNoEncontradoException (no existe el producto solicitado).
//        • StockInsuficienteException (no hay suficiente cantidad para la venta).
//        2. Crea la clase Producto con atributos privados:
//        • String nombre
//• double precio
//• int stock
//y sus getters.
//3. Crea la clase Inventario con:
//        • Una colección (por ejemplo Map<String, Producto>) para almacenar productos
//por nombre.
//        • Método agregarProducto(Producto p) que lo añada al mapa.
//        • Método vender(String nombreProducto, int cantidad) que:
//        • Lance ProductoNoEncontradoException si el producto no existe.
//• Lance StockInsuficienteException si el stock actual es menor que la
//cantidad pedida.
//        • Si todo es correcto, descuente el stock y muestre el total de la venta
//        (cantidad * precio).
//
//        4. Crea la clase TiendaOnline con un main que:
//        • Cree un inventario y añada al menos 2 productos.
//• Intente realizar:
//
//Excepciones | Carlos Vingut Guerrero
//
//4
//        • Una venta correcta.
//• Una venta con más cantidad de la que hay en stock.
//• Una venta de un producto inexistente.
//        • Capture las excepciones y muestre mensajes claros en cada caso.
package Tema_3.Ejercicios_Intregales;

public class TiendaOnline {
}
