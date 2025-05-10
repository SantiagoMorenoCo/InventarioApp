package inventario.Modelo;

public class Cliente {
 private int id;
 private String identificacion;
 private String tipoIdentificacion;
 private String nombre;
 private String apellido;
 private String telefono;
 private String correo;
 
 public Cliente(int id, String identificacion, String tipoIdentificacion, String nombre,
    String apellido, String telefono, String corre){
 this.id = id;
 this.identificacion = identificacion;
 this.tipoIdentificacion = tipoIdentificacion;
 this.nombre = nombre;
 this.apellido = apellido;
 this.telefono = telefono;
 this.correo = correo;
 
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
