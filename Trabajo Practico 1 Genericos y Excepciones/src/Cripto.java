public class Cripto extends PagoVirtual{

    private String wallet_id;

    public Cripto(String cliente, double monto, String id_ticket, String wallet_id) {
        super(cliente, monto, id_ticket);
        this.wallet_id = wallet_id;
    }

    public String getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(String wallet_id) {
        this.wallet_id = wallet_id;
    }
}
