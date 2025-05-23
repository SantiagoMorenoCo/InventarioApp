/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario.DAO;

import inventario.Modelo.Proveedor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Inventario.SQLite.Conexion;

public class ProveedorDAO {

    // Insertar un nuevo proveedor
    public boolean insertarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO proveedores (identificacion, tipoIdentificacion, razonSocial, telefono, correo, direccion) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getRazonSocial());
            stmt.setString(3, proveedor.getTelefono());
            stmt.setString(4, proveedor.getIdentificacion());
            stmt.setString(5, proveedor.getDireccion());
            stmt.setString(6, proveedor.getTipoIdentificacion());
            stmt.setString(7, proveedor.getCorreo());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar proveedor: " + e.getMessage());
            return false;
        }
    }

    // Buscar proveedor por identificación
    public Proveedor buscarPorIdentificacion(String identificacion) {
        String sql = "SELECT * FROM proveedores WHERE identificacion = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, identificacion);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Proveedor proveedor = new Proveedor(
                    rs.getString("nombre"),
                    rs.getString("razonSocial"),
                    rs.getString("telefono"),
                    rs.getString("identificacion"),
                    rs.getString("direccion"),
                    rs.getString("tipoIdentificacion"),
                    rs.getString("correo")
                );
                
                return proveedor;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar proveedor: " + e.getMessage());
        }

        return null;
    }

    // Eliminar proveedor por identificación
    public boolean eliminarProveedor(String identificacion) {
        String sql = "DELETE FROM proveedores WHERE identificacion = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, identificacion);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar proveedor: " + e.getMessage());
            return false;
        }
    }

    // Obtener todos los proveedores
    public List<Proveedor> obtenerTodos() {
        List<Proveedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM proveedores";

        try (Connection conexion = Conexion.conectar();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Proveedor proveedor = new Proveedor(
                    rs.getString("nombre"),
                    rs.getString("identificacion"),
                    rs.getString("tipoIdentificacion"),
                    rs.getString("razonSocial"),
                    rs.getString("telefono"),
                    rs.getString("correo"),
                    rs.getString("direccion")
                );
                
                lista.add(proveedor);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener proveedores: " + e.getMessage());
        }

        return lista;
    }
}