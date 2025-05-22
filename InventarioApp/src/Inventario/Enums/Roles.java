
package Inventario.Enums;


public enum Roles {
    ADMINISTRADOR,
    VENDEDOR,
    OTRO;
    @Override
    public String toString() {
        
        return name().charAt(0) + name().substring(1).toLowerCase();
    } 
}
