package Data.TiposUser;

import Data.Usuario;

import java.util.Date;

public class Gestor extends Usuario {
    public Gestor(String nombre, String apellido, String email, int dni, int id_usuario, Date fecha_creacion) {
        super(nombre, apellido, email, dni, id_usuario, fecha_creacion);
    }
}
