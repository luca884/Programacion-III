public class MercadoPago extends PagoVirtual{

    private String id_usuario;

    public MercadoPago(String cliente, double monto, String id_ticket, String mail, String id_usuario) {
        super(cliente, monto, id_ticket, mail);
        this.id_usuario = id_usuario;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
}
