
package BEAN;

public class Repartidor {
   private String dniRepartidor;
   private String nombRepartidor;
   private int telefono;
   private String direccion;
   private String distrito;
   private double sueldo;

    public Repartidor() {
    }

    public Repartidor(String dniRepartidor, String nombRepartidor, int telefono, String direccion, String distrito, double sueldo) {
        this.dniRepartidor = dniRepartidor;
        this.nombRepartidor = nombRepartidor;
        this.telefono = telefono;
        this.direccion = direccion;
        this.distrito = distrito;
        this.sueldo = sueldo;
    }

    public String getDniRepartidor() {
        return dniRepartidor;
    }

    public void setDniRepartidor(String dniRepartidor) {
        this.dniRepartidor = dniRepartidor;
    }

    public String getNombRepartidor() {
        return nombRepartidor;
    }

    public void setNombRepartidor(String nombRepartidor) {
        this.nombRepartidor = nombRepartidor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
}
