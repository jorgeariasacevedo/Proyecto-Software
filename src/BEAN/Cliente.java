package BEAN;

import java.sql.Date;
//dsa//
public class Cliente {
    private String dniCli;
    private String apellidoCli;
    private String nombreCli;
    private String direccionCli;
    private int telefonoCli;
    private String correoCli;
    private String fecha_nac_clie;
//gfdgdf//
    public Cliente() {
    }

    public Cliente(String dniCli, String apellidoCli, String nombreCli, String direccionCli, int telefonoCli, String correoCli, String fecha_nac_clie) {
        this.dniCli = dniCli;
        this.apellidoCli = apellidoCli;
        this.nombreCli = nombreCli;
        this.direccionCli = direccionCli;
        this.telefonoCli = telefonoCli;
        this.correoCli = correoCli;
        this.fecha_nac_clie = fecha_nac_clie;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidosCli) {
        this.apellidoCli = apellidosCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getDireccionCli() {
        return direccionCli;
    }

    public void setDireccionCli(String direccionCli) {
        this.direccionCli = direccionCli;
    }

    public int getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(int telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getCorreoCli() {
        return correoCli;
    }

    public void setCorreoCli(String correoCli) {
        this.correoCli = correoCli;
    }

    public String getFecha_nac_clie() {
        return fecha_nac_clie;
    }

    public void setFecha_nac_clie(String fecha_nac_clie) {
        this.fecha_nac_clie = fecha_nac_clie;
    }

}
