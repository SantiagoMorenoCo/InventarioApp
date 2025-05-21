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
                ps.setString(1, u[0]); // nombre
                ps.setString(2, u[1]); // apellido
                ps.setString(3, u[2]); // usuario
                ps.setString(4, u[3]); // contraseÑa
                ps.setString(5, u[4]); // rol
                ps.setString(6, u[5]); // tipo_identificacion
                ps.setString(7, u[6]); // cedula
                ps.setString(8, u[7]); // telefono
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


    // Verificaicon de datos ingresados en los campos de Login
    
    public Usuario verificarLogin(String usuario, String contraseña) {
    Usuario u = null;
    String sql = "SELECT * FROM usuario WHERE usuario = ? AND contraseña = ?";

    try (java.sql.Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql))  {
        
        ps.setString(1, usuario);
        ps.setString(2, contraseña);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            u = new Usuario();
            u.setId(rs.getInt("id"));
            u.setNombre(rs.getString("nombre"));
            u.setUsuario(rs.getString("usuario"));
            u.setContraseña(rs.getString("contraseña"));
        }

    } catch (SQLException e) {
        System.out.println("Error al verificar usuario: " + e.getMessage());
    }

    return u;
}

}
