/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario.SQLite.Request;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductoRequest {
    public static List<Producto> obtenerTodos() {
        List<Producto> lista = new ArrayList<>();

        String sql = "SELECT cedula, nombre FROM Usuario";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                lista.add(producto);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener productos: " + e.getMessage());
        }

        return lista;
    }
}
