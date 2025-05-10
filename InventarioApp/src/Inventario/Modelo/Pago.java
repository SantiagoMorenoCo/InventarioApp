package inventario.Modelo;
import java.time.LocalDateTime;

public class Pago {
private double monto;
private String metodoPago;
private LocalDateTime fechaPago;

public Pago(double monto, String metodoPago, LocalDateTime fechaPago){
 this.monto = monto;
 this.metodoPago = metodoPago;
 this.fechaPago = fechaPago;
 
 }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }
}
