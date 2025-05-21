package Inventario.DAO;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
