import java.util.UUID;

public abstract class Pago {

    private String cliente;
    private double monto;

    private String id_ticket;


    public Pago(String cliente, double monto, String id_ticket){
        this.cliente = cliente;
        this.monto = monto;
        this.id_ticket = UUID.randomUUID().toString();
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(String id_ticket) {
        this.id_ticket = id_ticket;
    }
}
