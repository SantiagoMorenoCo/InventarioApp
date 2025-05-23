package inventario.Modelo;

public class Proveedor {

 private String identificacion;
 private String tipoIdentificacion;
 private String razonSocial;
 private String telefono;
 private String correo;
 private String direccion;
 private String nombre;
 
 
 public Proveedor(String identificacion, String tipoIdentificacion, String razonSocial,
   String telefono, String correo, String direccion, String nombre){
 
 this.identificacion = identificacion;
 this.tipoIdentificacion = tipoIdentificacion;
 this.razonSocial = razonSocial;
 this.telefono = telefono;
 this.correo = correo;
 this.direccion = direccion;
 this.nombre = nombre;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String direccion) {
        this.nombre = direccion;
    }
}
