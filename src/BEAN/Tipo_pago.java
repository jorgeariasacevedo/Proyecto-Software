package BEAN;

public class Tipo_pago {
    
    private int id_pago;
    private String nombre;
    private String propietario;
    private int numero_cuenta;
//sadasd//
    public Tipo_pago() {
    }

    public Tipo_pago(int id_pago, String nombre, String propietario, int numero_cuenta) {
        this.id_pago = id_pago;
        this.nombre = nombre;
        this.propietario = propietario;
        this.numero_cuenta = numero_cuenta;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
   
    
    
}
