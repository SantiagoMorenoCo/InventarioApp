package Inventario.DAO;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public boolean guardarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre, descripcion, precioVenta, precioCompra, iva, stock) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setFloat(3, producto.getPrecioVenta());
            ps.setFloat(4, producto.getPrecioCompra());
            ps.setFloat(5, producto.getIva());
            ps.setInt(6, producto.getStock());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e.getMessage());
            return false;
        }
    }

   public List<Producto> obtenerTodos() {
    List<Producto> lista = new ArrayList<>();
    String sql = "SELECT * FROM producto";

    try (Connection conn = Conexion.conectar();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Producto p = new Producto(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getFloat("precioVenta"),
                rs.getFloat("precioCompra"),
                rs.getFloat("iva"),
                rs.getInt("stock")
            );
            lista.add(p);
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener productos: " + e.getMessage());
    }

    return lista;
}
public List<Producto> buscarPorNombre(String nombre) {
    List<Producto> lista = new ArrayList<>();
    String sql = "SELECT * FROM producto WHERE nombre LIKE ?";

    try (Connection conn = Conexion.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, "%" + nombre + "%");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Producto p = new Producto(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getFloat("precioVenta"),
                rs.getFloat("precioCompra"),
                rs.getFloat("iva"),
                rs.getInt("stock")
            );
            lista.add(p);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lista;
}


}