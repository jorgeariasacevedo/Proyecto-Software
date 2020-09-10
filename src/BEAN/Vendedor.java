
package BEAN;

public class Vendedor {
   private String dniVendedor;
   private String nombVendedor;
   private int telefono;
   private String direccion;
   private String distrito;
   private double sueldo;

    public Vendedor() {
    }

    public Vendedor(String dniVendedor, String nombVendedor, int telefono, String direccion, String distrito, double sueldo) {
        this.dniVendedor = dniVendedor;
        this.nombVendedor = nombVendedor;
        this.telefono = telefono;
        this.direccion = direccion;
        this.distrito = distrito;
        this.sueldo = sueldo;
    }

    public String getDniVendedor() {
        return dniVendedor;
    }

    public void setDniVendedor(String dniVendedor) {
        this.dniVendedor = dniVendedor;
    }

    public String getNombVendedor() {
        return nombVendedor;
    }

    public void setNombVendedor(String nombVendedor) {
        this.nombVendedor = nombVendedor;
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
