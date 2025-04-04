package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

    public static final String url = "jdbc:mysql://127.0.0.1:3306/bdd2jdbc";
    public static final String db_name= "UTN";
    public static final String user = "root";
    public static final String pass = "root";

    static {

    }

    private static void crearBaseSiNoExiste() {
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + db_name);
        } catch (SQLException e) {
            System.out.println("Error creando base de datos: " + e.getMessage());
        }
    }

    // Retorna una conexión a la base de datos ya creada
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(url + db_name + "?useSSL=false&serverTimezone=UTC", user, pass);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }

    }


}
