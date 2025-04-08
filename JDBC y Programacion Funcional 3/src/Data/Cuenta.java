package Data;

import java.sql.Date;

public class Cuenta {

    private int id_cuenta;
    private int id_usuario;
    private String tipo;
    private double saldo;
    private Date fecha_creacion;

    // Para insertar Cuenta
    public Cuenta(int id_usuario, String tipo, double saldo, Date fecha_creacion){
        this.fecha_creacion = fecha_creacion;
        this.id_usuario = id_usuario;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Para retornar Cuenta
    public Cuenta(int id_usuario, String tipo, double saldo, Date fecha_creacion, int id_cuenta){
        this.fecha_creacion = fecha_creacion;
        this.id_usuario = id_usuario;
        this.tipo = tipo;
        this.saldo = saldo;
        this.id_cuenta = id_cuenta;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
