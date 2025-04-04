package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DirecDAO {

    private Connection conn;

    public DirecDAO(){
        conn = ConexionMySQL.conectar();
    }

    private void crearTablaSiNoExisteAlumnosDirecciones() {
        String sql = "CREATE TABLE direcciones (\n" +
                "\tid INTEGER PRIMARY KEY auto_increment,\n" +
                "\tcalle varchar(50) NOT NULL,\n" +
                "\taltura INTEGER NOT NULL,\n" +
                "\talumno_id INTEGER NOT NULL,\n" +
                "\tFOREIGN KEY (alumno_id) REFERENCES alumnos(id) ON DELETE CASCADE\n" +
                ");";
        try (Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        }catch (SQLException e){
            System.out.println("Error creando tabla Direcciones : " + e.getMessage());
        }
    }

    // Inserta una nueva Direccion
    public void insertarDireccion(Direccion direccion){
        String sql = "INSER INTO direcciones (calle,altura,alumno_id) VALUES (?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,direccion.getCalle());
            pstmt.setInt(2,direccion.getAltura());
            pstmt.setInt(3,direccion.getAlumno_id());
        } catch (SQLException e){
            System.out.println("Error insertando Alumno: " + e.getMessage());
        }
    }

    //Devuelve la lista de Direcciones existentes
    public List<Direccion> obtenerDirecciones(){
        List<Direccion> list = new ArrayList<>();
        String sql = "SELECT * FROM direcciones";

        try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Direccion d = new Direccion(
                            rs.getInt("id"),
                            rs.getString("calle"),
                            rs.getInt("altura"),
                            rs.getInt("alumno_id"));
                    list.add(d);
                }
            } catch (SQLException e) {
            System.out.println("Error leyendo Direccion: " + e.getMessage());
        }
        return list;
    }

    public void actualizar(Direccion direccion){
        String sql = "Update direcciones set calle = ?, altura = ?, alumno_id = ? where id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, direccion.getCalle());
            pstmt.setInt(2, direccion.getAltura());
            pstmt.setInt(3, direccion.getAlumno_id());
            pstmt.setInt(4, direccion.getDireccion_id());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error actualizando Direccion: " + e.getMessage());
        }
    }

    public void eliminar(int i){
        String sql = "delete from direcciones where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,i);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error eliminando direccion: " + e.getMessage());
        }

    }


    public List<Direccion> direccion_X_alumnoID(int id){
        List<Direccion> list = new ArrayList<>();
        String sql = "select * from direcciones where alumno_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                list.add(new Direccion(
                        rs.getInt("id"),
                        rs.getString("calle"),
                        rs.getInt("altura"),
                        rs.getInt("alumno_id"))
                );
            }

            return list;
        } catch (SQLException e) {
            System.out.println("Error devolviendo direccion de alumno : " + e.getMessage());
        }
        return list;
    }



}


