package GestionDAO;

import Data.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private Connection conn;
    public UserDao(){
        conn = Conexion.conectar();
    }


    private void crearTablaSiNOExiste(){
        String sql = "CREATE TABLE \"usuarios\" (\n" +
                "\"id_usuario\" INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\"nombre\" TEXT NOT NULL,\n" +
                "\"apellido\" TEXT NOT NULL,\n" +
                "\"dni\" TEXT UNIQUE NOT NULL,\n" +
                "\"email\" TEXT UNIQUE NOT NULL,\n" +
                "\"fecha_creacion\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n" +
                ");";
        try (Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void insertarUsuario(Usuario usuario){
        String sql = "Insert into usuarios(nombre,apellido,dni,email) values (?,?,?,?)";
        try (PreparedStatement smtmt = conn.prepareStatement(sql)){
            smtmt.setString(1,usuario.getNombre());
            smtmt.setString(2,usuario.getApellido());
            smtmt.setInt(3,usuario.getDni());
            smtmt.setString(4,usuario.getEmail());
            smtmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void obtenerTodos(){
        List<Usuario> list = new ArrayList<>();
        String sql = "select * from usuarios";
        try(Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)){
            while (resultSet.next()){
                Usuario usuario = new Usuario(
                        resultSet.getString("nombre"),
                        resultSet.getString("apellido"),
                        resultSet.getString("email"),
                        resultSet.getInt("dni"),
                        resultSet.getInt("id_usuario"),
                        resultSet.getDate("fecha_creacion")
                        );
                list.add(usuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }









}
