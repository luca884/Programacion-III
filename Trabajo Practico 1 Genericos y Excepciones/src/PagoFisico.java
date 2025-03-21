public class PagoFisico extends Pago {


    private String id_local;

    public PagoFisico(String cliente, double monto, String id_ticket, String id_local) {
        super(cliente, monto, id_ticket);
        this.id_local = id_local;
    }


    public String getId_local() {
        return id_local;
    }

    public void setId_local(String id_local) {
        this.id_local = id_local;
    }
}
