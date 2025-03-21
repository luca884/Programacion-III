import java.time.LocalDate;

public class Tarjeta extends PagoFisico{

    private int numTarjeta;
    private LocalDate fechaVencimiento;


    public Tarjeta(String cliente, double monto, String id_ticket, String id_local, int numTarjeta, LocalDate fechaVencimiento) {
        super(cliente, monto, id_ticket, id_local);
        this.fechaVencimiento = fechaVencimiento;
        this.numTarjeta = numTarjeta;
    }


    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
