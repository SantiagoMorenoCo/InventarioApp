package Inventario.SQLite.Tablas;

import Inventario.SQLite.Conexion;
import java.sql.Connection;
import java.sql.Statement;

public class ProductoTable {

    public static void crearTablaProductos() {
        String sql = "CREATE TABLE IF NOT EXISTS producto (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "nombre TEXT NOT NULL, " +
                     "descripcion TEXT, " +
                     "precioVenta REAL NOT NULL, " +
                     "precioCompra REAL NOT NULL, " +
                     "iva REAL NOT NULL, " +
                     "stock INTEGER NOT NULL" +
                     ");";

        try (Connection conn = Conexion.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla producto creada o ya existe.");
        } catch (Exception e) {
            System.out.println("Error al crear la tabla producto: " + e.getMessage());
        }
    }
}
