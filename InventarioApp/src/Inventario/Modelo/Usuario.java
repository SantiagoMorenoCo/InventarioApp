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
    private String telefono;
    private String usuario;
    private String contraseña;


    public Usuario() {

    }

    public Usuario(int id, String nombre, String apellido, Roles rol, String cedula, TipoDeIdentificacion tipoIdentificacion, String telefono, String usuario, String contraseña ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.cedula = cedula;
        this.tipoIdentificacion = tipoIdentificacion;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
