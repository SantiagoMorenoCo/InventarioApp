package Inventario.Enums;

public enum TipoDeIdentificacion {
 CC,     
 TI,     
 CE,     
 NIT;
    @Override
    public String toString() {
        
        return name().charAt(0) + name().substring(1).toLowerCase();
    }        
}
