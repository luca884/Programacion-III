package data.TiposUser;


import java.util.Date;

public class Cliente extends Usuario  {

    public Cliente(String nombre, String apellido, String email, int dni, int id_usuario, Date fecha_creacion) {
        super(nombre, apellido, email, dni, id_usuario, fecha_creacion);
    }
}
