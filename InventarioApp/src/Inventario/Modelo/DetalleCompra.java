package inventario.Modelo;

public class DetalleCompra {
 private Producto producto;
 private int cantidad;
 private Compra compra;
 private float descuento;
 private String descripcion;
 private double calcularSubtotal;

public DetalleCompra(Producto producto, int cantidad, Compra compra, float descuento,
   String descripcion, double calcularSubtotal){
 this.producto = producto;
 this.cantidad = cantidad;
 this.compra = compra; 
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
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
