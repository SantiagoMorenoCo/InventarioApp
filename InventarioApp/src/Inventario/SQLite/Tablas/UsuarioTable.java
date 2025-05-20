package Inventario.SQLite.Tablas;

import Inventario.SQLite.Conexion;
import java.sql.Connection;
import java.sql.Statement;

public class UsuarioTable {
   public static void crearTablaUsuarios() {
    String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
               + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
               + "usuario TEXT NOT NULL UNIQUE, "
               + "clave TEXT NOT NULL"
               + ");";

    try (Connection conn = Conexion.conectar();
         Statement stmt = conn.createStatement()) {

        stmt.execute(sql);
        System.out.println("Tabla usuarios creada o ya existente.");

    } catch (Exception e) {
        System.out.println("Error al crear tabla usuarios: " + e.getMessage());
    }
}
}
