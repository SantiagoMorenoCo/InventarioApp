package inventario.Modelo;

import Inventario.Enums.Roles;
import Inventario.Enums.TipoDeIdentificacion;

public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private Roles rol;
    private String cedula;
    private TipoDeIdentificacion tipoIdentificacion;
    private String usuario;
    private String contraseña;


    public Usuario() {

    }

    public Usuario(int id, String apellido, String nombre, Roles rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoDeIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDeIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
