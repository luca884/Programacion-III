package GestionDAO;

import Data.Cuenta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CuentaDao {

    private Connection connection;

    public CuentaDao(){
        connection = Conexion.conectar();
    }


    public void crearTabla(){
        String sql = "crEATE TABLE \"cuentas\" (\n" +
                "\"id_cuenta\" INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\"id_usuario\" INTEGER NOT NULL,\n" +
                "\"tipo\" TEXT NOT NULL CHECK (tipo IN ('CAJA_AHORRO',\n" +
                "'CUENTA_CORRIENTE')),\n" +
                "\"saldo\" REAL DEFAULT 0,\n" +
                "\"fecha_creacion\" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,\n" +
                "FOREIGN KEY(\"id_usuario\") REFERENCES \"usuarios\"(\"id_usuario\") ON\n" +
                "DELETE CASCADE\n" +
                ");";
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarCuenta(Cuenta cuenta){
        String sql = "Insert into cuentas (id_usuario,tipo,saldo) values (?,?,?);";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, cuenta.getId_usuario());
            statement.setString(2, cuenta.getTipo());
            statement.setDouble(3, cuenta.getSaldo());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void obtenerTodos(){
        List<Cuenta> list = new ArrayList<>();
        String sql = "select * from cuentas";
        try(Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)){
            Cuenta cuenta = new Cuenta(
                    resultSet.getInt("id_usuario"),
                    resultSet.getString("tipo"),
                    resultSet.getDouble("saldo"),
                    resultSet.getDate("fecha_creacion"),
                    resultSet.getInt("id_cuenta")
            );
            list.add(cuenta);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saldo(int id_cuenta){

    }

}
