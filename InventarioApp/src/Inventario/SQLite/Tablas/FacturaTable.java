package Inventario.SQLite.Tablas;

import Inventario.SQLite.Conexion;
import java.sql.Connection;
import java.sql.Statement;

public class FacturaTable {

    public static void crearTablaFactura() {
    String sql = "CREATE TABLE IF NOT EXISTS factura (" +
                 "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 "cedulaCliente TEXT NOT NULL, " +
                 "nombreCliente TEXT NOT NULL, " +
                 "metodoPago TEXT NOT NULL, " +
                 "fecha TEXT NOT NULL, " +
                 "total REAL NOT NULL" +
                 ");";

    try (Connection conn = Conexion.conectar();
         Statement stmt = conn.createStatement()) {
        stmt.execute(sql);
        System.out.println("Tabla factura creada o ya existe.");
    } catch (Exception e) {
        System.out.println("Error al crear la tabla factura: " + e.getMessage());
    }
    
    }
}