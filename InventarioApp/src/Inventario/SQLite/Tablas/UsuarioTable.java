package Inventario.SQLite.Tablas;

import Inventario.SQLite.Conexion;
import java.sql.Connection;
import java.sql.Statement;

public class UsuarioTable {
   public static void crearTablaUsuarios() {
    String sql = "CREATE TABLE IF NOT EXISTS usuario ("
               + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
               + "nombre TEXT NOT NULL, "
               + "apellido TEXT NOT NULL, "
               + "usuario UNIQUE,"
               + "contraseña TEXT NOT NULL,"
               + "rol TEXT,"
               + "tipo_identificacion TEXT,"
               + "cedula TEXT"
               + ");";

    try (Connection conn = Conexion.conectar();
         Statement stmt = conn.createStatement()) {

        stmt.execute(sql);
        System.out.println("Tabla usuario creada o ya existente.");

    } catch (Exception e) {
        System.out.println("Error al crear tabla usuarios: " + e.getMessage());
    }
}
}
