package inventario.Modelo;
import java.util.Date;

public class Factura {
 private Date fechaEmision;
 private Venta venta;
 private int generarFactura;

public Factura(Date fechaEmision, Venta venta, int generarFctura){
this.fechaEmision = fechaEmision;
this.venta = venta;
this.generarFactura = generarFactura;

 } 

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getGenerarFactura() {
        return generarFactura;
    }

    public void setGenerarFactura(int generarFactura) {
        this.generarFactura = generarFactura;
    }
}
