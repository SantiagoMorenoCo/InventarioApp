package inventario.Modelo;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    public void actualizarStock(Producto producto, int cantidad) {
        if (productos.contains(producto)) {
            producto.setStock(producto.getStock() + cantidad);
        }
    }
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; 
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }
}