
package BEAN;

public class Detalle_Venta {
    private int idVentaf;
    private String codProducto;
    private double precio;
    private int cantidad;

    public Detalle_Venta() {
    }

    public Detalle_Venta(int idVentaf, String codProducto, double precio, int cantidad) {
        this.idVentaf = idVentaf;
        this.codProducto = codProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdVentaf() {
        return idVentaf;
    }

    public void setIdVentaf(int idVentaf) {
        this.idVentaf = idVentaf;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
