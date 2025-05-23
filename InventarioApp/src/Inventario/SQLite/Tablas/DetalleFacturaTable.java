package Inventario.SQLite.Tablas;

import Inventario.SQLite.Conexion;
import java.sql.Connection;
import java.sql.Statement;

public class DetalleFacturaTable {
   public static void crearTablaDetalleFactura() {
    String sql = "CREATE TABLE IF NOT EXISTS detalleFactura (" +
                 "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 "idFactura INTEGER NOT NULL, " +
                 "nombreProducto TEXT NOT NULL, " +
                 "cantidad INTEGER NOT NULL, " +
                 "precioUnitario REAL NOT NULL, " +
                 "subtotal REAL NOT NULL, " +
                 "FOREIGN KEY (idFactura) REFERENCES factura(id)" +
                 ");";

    try (Connection conn = Conexion.conectar();
         Statement stmt = conn.createStatement()) {
        stmt.execute(sql);
        System.out.println("Tabla detalleFactura creada o ya existe.");
    } catch (Exception e) {
        System.out.println("Error al crear la tabla detalleFactura: " + e.getMessage());
    }
} 
}
