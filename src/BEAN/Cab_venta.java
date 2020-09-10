
package BEAN;

public class Cab_venta {
    private int idVenta;
    private String dniClif;
    private String fechaVenta;
    private String estado;
    private int idDeliveryf;
    private String dniVendedor;
    private String dniRepartidorf;
    private int idPagof; 

    public Cab_venta() {
    }

    public Cab_venta(int idVenta, String dniClif, String fechaVenta, String estado, int idDeliveryf, String dniVendedor, String dniRepartidorf, int idPagof) {
        this.idVenta = idVenta;
        this.dniClif = dniClif;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
        this.idDeliveryf = idDeliveryf;
        this.dniVendedor = dniVendedor;
        this.dniRepartidorf = dniRepartidorf;
        this.idPagof = idPagof;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getDniClif() {
        return dniClif;
    }

    public void setDniClif(String dniClif) {
        this.dniClif = dniClif;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdDeliveryf() {
        return idDeliveryf;
    }

    public void setIdDeliveryf(int idDeliveryf) {
        this.idDeliveryf = idDeliveryf;
    }

    public String getDniVendedor() {
        return dniVendedor;
    }

    public void setDniVendedor(String dniVendedor) {
        this.dniVendedor = dniVendedor;
    }

    public String getDniRepartidorf() {
        return dniRepartidorf;
    }

    public void setDniRepartidorf(String dniRepartidorf) {
        this.dniRepartidorf = dniRepartidorf;
    }

    public int getIdPagof() {
        return idPagof;
    }

    public void setIdPagof(int idPagof) {
        this.idPagof = idPagof;
    }
    
}
