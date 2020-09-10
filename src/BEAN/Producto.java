
package BEAN;

public class Producto {
   private String idProducto;
   private String modelo;
   private String tipo;
   private String detalle;
   private String color;
   private String talla;
   private double preciounitario;
   private int stock;

    public Producto() {
    }

    public Producto(String idProducto, String modelo, String tipo, String detalle, String color, String talla, double preciounitario, int stock) {
        this.idProducto = idProducto;
        this.modelo = modelo;
        this.tipo = tipo;
        this.detalle = detalle;
        this.color = color;
        this.talla = talla;
        this.preciounitario = preciounitario;
        this.stock = stock;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   

    
   
}
