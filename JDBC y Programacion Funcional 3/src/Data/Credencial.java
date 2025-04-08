package Data;

public class Credencial {

    private int id_credencial;
    private int id_usuario;
    private String username;
    private String password;
    private String permiso = "CLIENTE";

    // Para insertar Credencial
    public Credencial(int id_usuario, String username, String password, String permiso){
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
        this.permiso = permiso;
    }
    // Para retornar Credencial
    public Credencial(int id_usuario, String username, String password, String permiso, int id_credencial){
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
        this.permiso = permiso;
        this.id_credencial = id_credencial;
    }

    public int getId_credencial() {
        return id_credencial;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

}
