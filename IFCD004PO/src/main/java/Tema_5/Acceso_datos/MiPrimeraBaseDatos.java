package Tema_5.Acceso_datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MiPrimeraBaseDatos {
    public static void main (String[] args){
        //Inicializamos las variables
        List<String>    juegos = new ArrayList<>();
        List<String>    precio_Juegos = new ArrayList<>();
        String urlSQL = "jdbc:sqlite:/Users/jcsantos/Documents/java/DDBB/juegos.db";
        //Logica del programa
        leerFicheros(juegos, precio_Juegos);
        grabarDDBB(juegos, precio_Juegos, urlSQL);
        consultaNombre("Star Citizen", urlSQL);

    }
    public static void leerFicheros (List juegos, List precio_juegos){
        String  rutaFichero = "/Users/jcsantos/Documents/java/Ficheros/";
        String  lecJuegos = "";
        String  lecPrecio = "";
        try (BufferedReader lecturaJuegos = new BufferedReader(new FileReader(rutaFichero + "juegos.txt"));
             BufferedReader lecturaPrecio = new BufferedReader(new FileReader(rutaFichero + "precios_juegos.txt")))
        {
            while ((lecJuegos = lecturaJuegos.readLine()) != null && (lecPrecio = lecturaPrecio.readLine()) != null){
                juegos.add(lecJuegos);
                precio_juegos.add(lecPrecio);
            }
        }catch (Exception e){
            System.out.println("Error de lectura de fichero.");
        }
    }

    public static void grabarDDBB (List<String> juegos, List<String> precio_Juegos, String urlSQL){
        String sqlDDBB = "CREATE TABLE IF NOT EXISTS juegos (" +
                "id INTEGER PRIMARY KEY, " +
                "nombre TEXT NOT NULL, " +
                "precio REAL NOT NULL)"; //Comnado SQL para crear la tabla con los datos pasados.
        PreparedStatement   stmt = null;
        int cnt = 0;
        try (Connection conn = DriverManager.getConnection(urlSQL)) //USamos el try con la inicialización de la variable
        //Ya que una vez terminada la conexión la cierra y no consume recursos.
        {
            conn.setAutoCommit(false);
            stmt = conn.prepareStatement(sqlDDBB); //Habilitamos el statement para ejecutar comandos SQL. Y creamos la tabla los campos.
            stmt.executeUpdate(); //Actualizamos la DDBB
            //Insertamos los juegos.
            while (cnt < juegos.size() && (cnt < precio_Juegos.size())){
                insertarJuego(conn, juegos.get(cnt), Double.parseDouble(precio_Juegos.get(cnt)) );
                cnt++;
            }
            conn.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e + "No se ha podido cargar la DDBB");
        }
    }

    public static void insertarJuego(Connection conn, String nombre, double precio){
        String sql = "INSERT INTO juegos (nombre, precio) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) { //hacemos un try con recurso para que cierre el statment
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.executeUpdate();
        } catch (Exception e){
                System.out.println("Error al insertar un juego.");
        }
    }

    public static void consultaNombre(String nombre_busqueda, String urlSQL){
        String sql = "SELECT * FROM juegos WHERE nombre = ?";
        try (Connection conn = DriverManager.getConnection(urlSQL);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre_busqueda);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("No se encontró: " + nombre_busqueda);
                    return;
                }
                // Imprimir resultados
                do {
                    String juego = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    System.out.printf("El juego %s cuesta %.2f€\n", juego, precio);
                } while (rs.next());

            }
        } catch (Exception e) {
            System.out.println("Error en la busqueda: " + e);
        }

    }

}
