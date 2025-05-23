package Inventario.DAO;

import Inventario.SQLite.Conexion;
import inventario.Modelo.DetalleFactura;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.List;

public class DetalleFacturaDAO {

    public boolean guardarDetalles(List<DetalleFactura> detalles, int idFactura) {
        String sql = "INSERT INTO detalleFactura (idFactura, nombreProducto, cantidad, precioUnitario, subtotal) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (DetalleFactura detalle : detalles) {
                stmt.setInt(1, idFactura);
                stmt.setString(2, detalle.getNombreProducto());
                stmt.setInt(3, detalle.getCantidad());
                stmt.setDouble(4, detalle.getPrecioUnitario());
                stmt.setDouble(5, detalle.getSubtotal());
                stmt.addBatch(); // Agrupar todas las inserciones
            }

            stmt.executeBatch(); // Ejecuta todas juntas
            return true;

        } catch (Exception e) {
            System.out.println("Error al guardar los detalles de la factura: " + e.getMessage());
            return false;
        }
    }
    
    
    public boolean insertarDetalle(DetalleFactura detalle) {
        String sql = "INSERT INTO detalleFactura (idFactura, nombreProducto, cantidad, precioUnitario, subtotal) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setInt(1, detalle.getFacturaId());
            stmt.setString(2, detalle.getNombreProducto());
            stmt.setInt(3, detalle.getCantidad());
            stmt.setDouble(4, detalle.getPrecioUnitario());
            stmt.setDouble(5, detalle.getSubtotal());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar detalle de factura: " + e.getMessage());
            return false;
        }
    }
}
