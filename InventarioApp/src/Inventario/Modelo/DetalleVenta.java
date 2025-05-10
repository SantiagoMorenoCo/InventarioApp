package inventario.Modelo;

public class DetalleVenta {
    
private Producto producto;
private int cantidad;
private Venta venta;
private float descuento;
private String descripcion;
private double calcularSubtotal;

public DetalleVenta(Producto producto, int cantidad, Venta venta, float descuento, String descripcion,
        double calcularSubtotal){
 this.producto = producto;
 this.cantidad = cantidad;
 this.venta = venta;
 this.descuento = descuento;
 this.descripcion = descripcion;
 this.calcularSubtotal = calcularSubtotal;
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

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCalcularSubtotal() {
        return calcularSubtotal;
    }

    public void setCalcularSubtotal(double calcularSubtotal) {
        this.calcularSubtotal = calcularSubtotal;
    }
}

