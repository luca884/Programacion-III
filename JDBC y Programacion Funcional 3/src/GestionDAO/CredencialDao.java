package GestionDAO;

import Data.Credencial;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CredencialDao {

    private Connection connection;

    public CredencialDao(){
        connection = Conexion.conectar();
    }


    public void crearTabla(){
        String sql = "CREATE TABLE \"credenciales\" (\n" +
                "\"id_credencial\" INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\"id_usuario\" INTEGER NOT NULL,\n" +
                "\"username\" TEXT UNIQUE NOT NULL,\n" +
                "\"password\" TEXT NOT NULL,\n" +
                "\"permiso\" TEXT NOT NULL CHECK (permiso IN ('CLIENTE',\n" +
                "'ADMINISTRADOR', 'GESTOR')),\n" +
                "FOREIGN KEY(\"id_usuario\") REFERENCES \"usuarios\"(\"id_usuario\") ON\n" +
                "DELETE CASCADE\n" +
                ");";
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarCredencial(Credencial credencial){
        String sql = "Insert into credenciales(id_usuario,username,password,permiso) values (?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,credencial.getId_usuario());
            statement.setString(2, credencial.getUsername());
            statement.setString(3, credencial.getPassword());
            statement.setString(4, credencial.getPermiso());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerTodos(){
        List<Credencial> list = new ArrayList<>();
        String sql = "select * from credenciales";
        try(Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)){
            Credencial c = new Credencial(
                    resultSet.getInt("id_usuario"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("permiso"),
                    resultSet.getInt("id_credencial")
            );
            list.add(c);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
