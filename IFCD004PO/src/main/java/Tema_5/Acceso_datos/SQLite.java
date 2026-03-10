package Tema_5.Acceso_datos;


import java.sql.*;

public class SQLite {


    public static void main (String[] args){
        System.out.println("Hola Majo");
    }

    public static void transferir (int idOrigen, int idDestino, double monto) throws SQLException {
        Connection conn = null;

        try{
            conn = DriverManager.getConnection("jdbc:/Users/jcsantos/Documents/java/DDBB/banco.db");
            conn.setAutoCommit(false); // Ejecuto transacciones de una en una.
            String origenExtraer = "Update cuenta Set saldo = - ? WHERE id = ?";
            String destinoIngresar = "Update cuenta Set saldo = + ? WHERE id = ?";

            PreparedStatement stOrigen = conn.prepareStatement(origenExtraer);
            stOrigen.setDouble(1, monto);
            stOrigen.setInt(2, idOrigen);
            int countRow = stOrigen.executeUpdate();

            PreparedStatement stDestino = conn.prepareStatement(origenExtraer);
            stDestino.setDouble(1, monto);
            stDestino.setInt(2, idOrigen);

            countRow = stDestino.executeUpdate();


        } catch (SQLException e) {
            conn.rollback();
        }
    }

}
