package BEAN;

public class Delivery {
    
    private int id_delivery;
    private String tipo_del;
    private String destino;
    private int preciocaja;
    private String agencia;
    private String provincia;
    private String departamento;
    private String distrito;

    public Delivery() {
    }

    public Delivery(int id_delivery, String tipo_del, String destino, int preciocaja, String agencia, String provincia, String departamento, String distrito) {
        this.id_delivery = id_delivery;
        this.tipo_del = tipo_del;
        this.destino = destino;
        this.preciocaja = preciocaja;
        this.agencia = agencia;
        this.provincia = provincia;
        this.departamento = departamento;
        this.distrito = distrito;
    }

    public int getId_delivery() {
        return id_delivery;
    }

    public void setId_delivery(int id_delivery) {
        this.id_delivery = id_delivery;
    }

    public String getTipo_del() {
        return tipo_del;
    }

    public void setTipo_del(String tipo_del) {
        this.tipo_del = tipo_del;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPreciocaja() {
        return preciocaja;
    }

    public void setPreciocaja(int preciocaja) {
        this.preciocaja = preciocaja;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

}