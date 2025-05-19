package Inventario.SQLite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    // Ruta global del archivo .db
    private static final String NOMBRE_DB = "Inventario.db";
    private static final String CARPETA_OCULTA = ".InventarioApp";

    public static Connection conectar() {
        Connection conn = null;
        try {
            // Obtener la ruta del usuario y carpeta oculta
            String userHome = System.getProperty("user.home");
            String rutaCarpeta = userHome + File.separator + CARPETA_OCULTA;

            // Crear la carpeta si no existe
            File carpeta = new File(rutaCarpeta);
            if (!carpeta.exists()) {
                carpeta.mkdir();
                System.out.println("Carpeta oculta creada en: " + rutaCarpeta);
            }

            // Ruta final del archivo .db
            String rutaDB = rutaCarpeta + File.separator + NOMBRE_DB;

            // Conexión a SQLite
            conn = DriverManager.getConnection("jdbc:sqlite:" + rutaDB);
            System.out.println("Conexion establecida con la base de datos SQLite.");


        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        return conn;
    }

}
