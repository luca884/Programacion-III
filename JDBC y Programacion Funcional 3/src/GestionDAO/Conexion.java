package GestionDAO;

import java.sql.*;


public class Conexion {

    private static final String url = "jdbc:mysql://";
    private static final String db_name = "UTN";
    private static final String user = "bdd1";
    private static final String pass = "bdd1";


    static {

    }

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(url+ db_name+ "?useSSL=false&serverTimezone=UTC", user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void crearBDDNoexiste (){
        try (Connection conn = DriverManager.getConnection(url,user,pass);
             Statement stmt =conn.createStatement()){
            String sql = "create database if not exists " + db_name;
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }







}
