package inventario.Modelo;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDateTime fecha;
    private Cliente cliente;
    private Empleado empleado;
    private List<DetallePedido> detalles;
    private String estado;

    public Pedido() {
    }

    public Pedido(LocalDateTime fecha, Cliente cliente, Empleado empleado) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Pedido(int id, LocalDateTime fecha, Cliente cliente, Empleado empleado, List<DetallePedido> detalles, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalles = detalles;
        this.estado = estado;
    }

    public float calcularTotal() {
        float total = 0;
        if (detalles != null) {
            for (DetallePedido detalle : detalles) {
                total += detalle.calcularSubtotal(); 
            }
        }
        return total;
    }

    public float calcularTotalIva() {
        float totalIva = 0;
        if (detalles != null) {
            for (DetallePedido detalle : detalles) {
                totalIva += detalle.calcularValorIva(); 
            }
        }
        return totalIva;
    }

    public float calcularTotalDescuento() {
        float totalDescuento = 0;
        if (detalles != null) {
            for (DetallePedido detalle : detalles) {
                totalDescuento += detalle.calcularDescuento();
            }
        }
        return totalDescuento;
    }

    // Getters y Setters
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}