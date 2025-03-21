public class Efectivo extends PagoFisico{


    private double vuelto;

    public Efectivo(String cliente, double monto, double vuelto, String id_ticket) {
        super(cliente, monto, id_ticket);
        this.vuelto = vuelto;
    }


    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }

}
