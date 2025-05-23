package inventario.Modelo;

import java.time.LocalDate;


public class Factura {
    private int id;
    private String cedulaCliente;
    private String nombreCliente;
    private String metodoPago;
    private String fecha;
    private double total;

    public Factura() {
    }

    public Factura(int id, String cedulaCliente, String nombreCliente, String metodoPago, String fecha, double total) {
        this.id = id;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
