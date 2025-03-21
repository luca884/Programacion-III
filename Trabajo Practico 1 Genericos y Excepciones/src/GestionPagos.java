import Interface.VeMonto;
import Interface.VeSaldo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Exception.TarjetaVencidaException;
import Exception.MontoNoValidoException;

public class GestionPagos {

    List<Pago> log;

    public GestionPagos(){
        log = new ArrayList<>();
    }


    public void agregarPago(Pago pago){
        log.add(pago);
    }

    public void verificarMonto(Pago pago) throws MontoNoValidoException{
        double monto = pago.getMonto();
            if (monto <= 0){
                throw new MontoNoValidoException("Monto Ingresado no valido");
            }
    }

    public void verificarFechaTarjeta(Tarjeta tarjeta) throws TarjetaVencidaException{
        if ((LocalDate.now()).isBefore(tarjeta.getFechaVencimiento()) ){
            throw new TarjetaVencidaException("La tarjeta esta vencida");
        }
    }

    public void pagomultiple(Pago pago, double montototal){
        double pago1 = log.getLast().getMonto();
        String id_ticket = log.getLast().getId_ticket();

        pago.setId_ticket(id_ticket);
        pago1 = montototal - pago1;
        pago.setMonto(pago1);

    }


}
