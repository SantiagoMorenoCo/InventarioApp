package Inventario.DAO;

import Inventario.Enums.Roles;
import Inventario.Enums.TipoDeIdentificacion;
import Inventario.SQLite.Conexion;
import inventario.Modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void CrearUsuariosLocales() {
        String sql = "INSERT OR IGNORE INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula, telefono) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        String[][] usuarios = {
            {"Camilo", "Torres", "ctorres", "1234", "ADMINISTRADOR", "CC", "1007976109", "3204374330"},
            {"admin", "admin", "admin", "1234", "ADMINISTRADOR", "CC", "10101010101", "3002465483"},
            {"Santiago", "Moreno", "smoreno", "1234", "VENDEDOR", "CC", "1102203304", "3135990515"},
            {"Antony", "Esteban", "aesteban", "1234", "VENDEDOR", "CC", "1122334455", "3017854328"},
            {"Prueba", "Prueba", "prueba", "1234", "OTRO", "TI", "6987654321", "3219874509"}
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

            boolean resultado = ps.executeUpdate() > 0;
            
            if (resultado) {
                reorganizarIDs();
            }
            
            return resultado;

        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
            return false;
        }
    }
    
    public boolean usuarioExiste(String usuario) {
        String sql = "SELECT COUNT(*) FROM usuario WHERE usuario = ?";
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean eliminarUsuario(int id) {
        try (Connection conn = Conexion.conectar()) {
            String sql = "DELETE FROM usuario WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            boolean resultado = pstmt.executeUpdate() > 0;
            
            if (resultado) {
                reorganizarIDsStatic(conn);
            }
            
            return resultado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }
    
    public boolean modificarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nombre=?, apellido=?, telefono=?, rol=?, cedula=?, tipo_identificacion=?, usuario=? WHERE id=?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getApellido());
            pstmt.setString(3, usuario.getTelefono());
            pstmt.setString(4, usuario.getRol().name());
            pstmt.setString(5, usuario.getCedula());
            pstmt.setString(6, usuario.getTipoIdentificacion().name());
            pstmt.setString(7, usuario.getUsuario());
            pstmt.setInt(8, usuario.getId());

            pstmt.executeUpdate();
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar usuario: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Usuario> obtenerTodosLosUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario ORDER BY id";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("contraseña"));
                u.setRol(Roles.valueOf(rs.getString("rol")));
                u.setTipoIdentificacion(TipoDeIdentificacion.valueOf(rs.getString("tipo_identificacion")));
                u.setCedula(rs.getString("cedula"));
                u.setTelefono(rs.getString("telefono"));
                lista.add(u); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    private void reorganizarIDs() {
        try (Connection conn = Conexion.conectar()) {
            reorganizarIDsStatic(conn);
        } catch (SQLException e) {
            System.out.println("Error al reorganizar IDs: " + e.getMessage());
        }
    }
    
    private static void reorganizarIDsStatic(Connection conn) {
        try {
            conn.setAutoCommit(false);
            
            ArrayList<Usuario> listaUsuarios = new ArrayList<>();
            String sqlSelect = "SELECT * FROM usuario ORDER BY id";
            
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlSelect)) {
                
                while (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setNombre(rs.getString("nombre"));
                    u.setApellido(rs.getString("apellido"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setContraseña(rs.getString("contraseña"));
                    u.setRol(Roles.valueOf(rs.getString("rol")));
                    u.setTipoIdentificacion(TipoDeIdentificacion.valueOf(rs.getString("tipo_identificacion")));
                    u.setCedula(rs.getString("cedula"));
                    u.setTelefono(rs.getString("telefono"));
                    listaUsuarios.add(u);
                }
            }
            String sqlDelete = "DELETE FROM usuario";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sqlDelete);
            }
            String sqlResetSeq = "DELETE FROM sqlite_sequence WHERE name='usuario'";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sqlResetSeq);
            }
            
            String sqlInsert = "INSERT INTO usuario (nombre, apellido, usuario, contraseña, rol, tipo_identificacion, cedula, telefono) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement ps = conn.prepareStatement(sqlInsert)) {
                for (Usuario u : listaUsuarios) {
                    ps.setString(1, u.getNombre());
                    ps.setString(2, u.getApellido());
                    ps.setString(3, u.getUsuario());
                    ps.setString(4, u.getContraseña());
                    ps.setString(5, u.getRol().name());
                    ps.setString(6, u.getTipoIdentificacion().name());
                    ps.setString(7, u.getCedula());
                    ps.setString(8, u.getTelefono());
                    ps.executeUpdate();
                }
            }
            
            conn.commit();
            System.out.println("IDs reorganizados correctamente.");
            
        } catch (SQLException e) {
            try {
                conn.rollback(); 
            } catch (SQLException ex) {
                System.out.println("Error al hacer rollback: " + ex.getMessage());
            }
            System.out.println("Error al reorganizar IDs: " + e.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true); 
            } catch (SQLException e) {
                System.out.println("Error al restaurar autocommit: " + e.getMessage());
            }
        }
    }
}