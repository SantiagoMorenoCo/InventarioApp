package Inventario.DAO;


import Inventario.SQLite.Conexion;
import inventario.Modelo.Factura;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO {

    public int insertarFactura(Factura factura) {
        int idGenerado = -1;
        String sql = "INSERT INTO factura (cedulaCliente, nombreCliente, metodoPago, fecha, total) VALUES (?, ?, ?, ?, ?)";
        
        Connection conn = Conexion.conectar();
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, factura.getCedulaCliente());
            stmt.setString(2, factura.getNombreCliente());
            stmt.setString(3, factura.getMetodoPago());
            stmt.setString(4, factura.getFecha());
            stmt.setDouble(5, factura.getTotal());

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    idGenerado = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar factura: " + e.getMessage());
        }

        return idGenerado;
    }

    public List<Factura> obtenerTodas() {
        List<Factura> lista = new ArrayList<>();
        String sql = "SELECT * FROM factura";
        
        Connection conn = Conexion.conectar();
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Factura f = new Factura();
                f.setId(rs.getInt("id"));
                f.setCedulaCliente(rs.getString("cedulaCliente"));
                f.setNombreCliente(rs.getString("nombreCliente"));
                f.setMetodoPago(rs.getString("metodoPago"));
                f.setFecha(rs.getString("fecha"));
                f.setTotal(rs.getDouble("total"));
                lista.add(f);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener facturas: " + e.getMessage());
        }

        return lista;
    }

    
}
