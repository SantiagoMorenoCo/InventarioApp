package Inventario.DAO;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Usuario;
import java.sql.*;

public class UsuarioDAO {

    //Creacion de Usuarios en la DB
    public void CrearUsuariosLocales() {
        String sql = "INSERT OR IGNORE INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula, telefono) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        String[][] usuarios = {
            {"Camilo", "Torres", "ctorres", "1234", "ADMINISTRADOR", "CC", "1007976109", "3204374330"},
            {"admin", "admin", "admin", "1234", "ADMINISTRADOR", "CC", "10101010101", "3002465483"},
            {"Santiago", "Moreno", "smoreno", "1234", "VENDEDOR", "CC", "1102203304", "3135990515"},
            {"Antony", "Esteban", "aesteban", "1234", "VENDEDOR", "CC", "1122334455", "3017854328"},
            {"Prueba", "Prueba", "prueba", "1234", "OTRO", "PASAPORTE", "6987654321", "3219874509"}
        };

        try (Connection conn = Conexion.conectar()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            for (String[] u : usuarios) {
                ps.setString(1, u[0]);
                ps.setString(2, u[1]);
                ps.setString(3, u[2]);
                ps.setString(4, u[3]);
                ps.setString(5, u[4]);
                ps.setString(6, u[5]);
                ps.setString(7, u[6]);
                ps.setString(8, u[7]);
                ps.executeUpdate();
            }

            System.out.println("Usuarios locales insertados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al insertar usuarios locales: " + e.getMessage());
        }
    }

    // Guardar nuevo usuario en la DB
    public boolean guardarUsuario(Usuario u) {
        String sql = "INSERT INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getUsuario());
            ps.setString(4, u.getContraseña());
            ps.setString(5, u.getRol().name());
            ps.setString(6, u.getTipoIdentificacion().name());
            ps.setString(7, u.getCedula());
            ps.setString(8, u.getTelefono());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }

}
