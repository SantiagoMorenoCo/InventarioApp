package Inventario.SQLite.Request;

import Inventario.Enums.Roles;
import Inventario.Enums.TipoDeIdentificacion;
import Inventario.SQLite.Conexion;
import inventario.Modelo.Usuario;
import java.sql.*;

public class LoginRequest {

    public static Usuario verificarLogin(String usuario, String contraseña) {
        Usuario u = null;
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND contraseña = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("contraseña"));
                u.setRol(Roles.valueOf(rs.getString("rol")));
                u.setTipoIdentificacion(TipoDeIdentificacion.valueOf(rs.getString("tipo_identificacion")));
                u.setCedula(rs.getString("cedula"));
                u.setTelefono(rs.getString("telefono"));
            }

        } catch (SQLException e) {
            System.out.println("Error al verificar usuario: " + e.getMessage());
        }

        return u;
    }
}
