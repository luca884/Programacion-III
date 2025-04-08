package Data.TiposUser;

import java.util.Date;

public class Usuario {

    private String nombre;
    private String apellido;
    private String email;
    private int dni;
    private int id_usuario;
    private Date fecha_creacion;

    // Para insertar usuarios
    public Usuario(String nombre, String apellido, String email, int dni){
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
    }
    // Para retornar usuarios
    public Usuario(String nombre, String apellido, String email, int dni, int id_usuario, Date fecha_creacion){
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.id_usuario = id_usuario;
        this.fecha_creacion = fecha_creacion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getId_usuario() {
        return id_usuario;
    }
}
