package Inventario.DAO;

import Inventario.SQLite.Conexion;
import inventario.Modelo.Usuario;
import java.sql.*;


public class UsuarioDAO {
    
    //Creacion de Usuarios en la DB
    
    public void CrearUsuariosLocales() {
        String sql = "INSERT OR IGNORE INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        String[][] usuarios = {
            {"Carlos", "Pérez", "cperez", "1234", "ADMINISTRADOR", "CC", "1002003001"},
            {"María", "Gómez", "mgomez", "abcd", "EMPLEADO", "TI", "1020304050"},
            {"Laura", "Torres", "ltorres", "pass123", "EMPLEADO", "CC", "1102203304"},
            {"Juan", "Rivera", "jrivera", "clave2024", "ADMINISTRADOR", "CE", "1122334455"},
            {"Diana", "Ríos", "drios", "adminpass", "EMPLEADO", "PASAPORTE", "P987654321"}
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
                ps.executeUpdate();
            }

            System.out.println("Usuarios locales insertados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al insertar usuarios demo: " + e.getMessage());
        }
    }

    // Guardar nuevo usuario en la DB
    public boolean guardarUsuario(Usuario u) {
        String sql = "INSERT INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getUsuario());
            ps.setString(4, u.getContraseña());
            ps.setString(5, u.getTipoIdentificacion().name()); // Enum → texto
            ps.setString(6, u.getRol().name());
            ps.setString(7, u.getCedula());

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
