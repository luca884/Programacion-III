public class PagoVirtual extends Pago{

    private String mail;
    public PagoVirtual(String cliente, double monto, String id_ticket, String mail) {
        super(cliente, monto, id_ticket);
        this.mail = mail;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
