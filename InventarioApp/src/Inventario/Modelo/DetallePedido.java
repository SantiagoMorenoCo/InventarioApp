package inventario.Modelo;

public class DetallePedido {

    private Producto producto;
    private int cantidad;
    private Pedido pedido;
    private String observaciones;
    private double calcularSubtotal;
    private float descuento;

    public DetallePedido(Producto producto, int cantidad, Pedido pedido,
            String observaciones, double calcularSubtotal, float descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.observaciones = observaciones;
        this.calcularSubtotal = calcularSubtotal;
        this.descuento = descuento;

    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getCalcularSubtotal() {
        return calcularSubtotal;
    }

    public void setCalcularSubtotal(double calcularSubtotal) {
        this.calcularSubtotal = calcularSubtotal;
    }
    
}
