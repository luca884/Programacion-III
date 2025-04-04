package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Clase encargada de interactuar con la BDD
public class UserDAO {

    private Connection conn;


    public UserDAO(){
        conn = ConexionMySQL.conectar();

    }

    //  Diferencia entre PreparedStatement y Statement
    //      Statement se utiliza nada mas cuando s una consulta simple y hay variables de por medio
    //      EJ. que devuelva todos los datos de una misma tabla sin condiciones

    //      PreparedStatement es para consultas mas complejas y con variables en las consultas, ya que, la consulta esta precargada
    //          mejorando el rendimiento y se utiliza para  todo lo demas
    //      EJ. una consulta con WHERE id = ?



    // Se asegura de que la tabla Alumno exista antes de operar
    private void crearTablaSiNoExisteAlumno() {
        String sql = "CREATE TABLE alumnos (\n" +
                "    id INTEGER PRIMARY KEY auto_increment,\n" +
                "    nombre varchar(50) NOT NULL,\n" +
                "    apellido varchar(50) NOT NULL,\n" +
                "    edad INTEGER NOT NULL,\n" +
                "    email varchar(100) UNIQUE NOT NULL\n" +
                ");";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creando tabla Alumno : " + e.getMessage());
        }
    }



    // Inserta un nuevo Alumno
    public void insertarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumnos(nombre,apellido,edad,email) VALUES(?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,alumno.getNombre());
            pstmt.setString(2,alumno.getApellido());
            pstmt.setInt(3, alumno.getEdad());
            pstmt.setString(4,alumno.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error insertando Alumno: " + e.getMessage());
        }
    }




    // Devuelve la lista de Alumnos existentes
    public List<Alumno> obtenerTodos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Alumno u = new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("email"));
                lista.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error leyendo Alumnos: " + e.getMessage());
        }

        return lista;
    }



    // Actualiza un Alumno existente
    public void actualizar(Alumno alumno) {
        String sql = "UPDATE alumnos SET nombre = ?, apellido = ?, edad = ?, email = ? ,  WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, alumno.getNombre());
            pstmt.setString(2, alumno.getApellido());
            pstmt.setInt(3, alumno.getEdad());
            pstmt.setString(4, alumno.getEmail());
            pstmt.setInt(5, alumno.getAlumno_id());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error actualizando usuario: " + e.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        String sql = "SELECT * FROM alumnos WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("email")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error buscando alumno: " + e.getMessage());
        }
        return null;
    }

    // Elimina un usuario por su ID
    public void eliminar(int id) {
        String sql = "DELETE FROM alumnos WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error eliminando usuario: " + e.getMessage());
        }
    }






}
