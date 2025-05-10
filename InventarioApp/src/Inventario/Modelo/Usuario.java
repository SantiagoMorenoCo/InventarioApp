package inventario.Modelo;

public class Usuario {
 private int id;
 private String nombre;
 private String password;
 private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public Usuario(int id, String password, String nombre, String email){
 this.id = id;
 this.nombre = nombre;
 this.password = password;
 this.email = email;
 }
}
