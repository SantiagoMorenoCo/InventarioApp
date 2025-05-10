package inventario.Modelo;
import java.time.LocalDateTime;

public class Compra {
 private int id; 
 private LocalDateTime fecha;
 private Proveedor proveedor;
 private double calcularTotal;
 
 public Compra(LocalDateTime fecha, Proveedor proveedor, double calcularTotal){
 this.fecha = fecha;
 this.proveedor = proveedor;
 this.calcularTotal = calcularTotal;
 
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getCalcularTotal() {
        return calcularTotal;
    }

    public void setCalcularTotal(double calcularTotal) {
        this.calcularTotal = calcularTotal;
    }
 
}
