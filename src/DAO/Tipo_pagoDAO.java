package DAO;

import BEAN.Delivery;
import BEAN.Tipo_pago;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class Tipo_pagoDAO {
     public Tipo_pagoDAO(){
    }
     
    public Vector<Tipo_pago> listaTipo(boolean sw, String cad){
        Vector<Tipo_pago> listTipo = new Vector<Tipo_pago>();
        dbBean con = new dbBean();
        String sql;
        sql = "select * from tipo_pago ";
        if(sw == true){
            sql = sql + " where nombre_banco like '"+ cad +"%' or propietario like '"+ cad +"%'";
        }
        try{
            ResultSet resuTipo = con.execSQL(sql);
            while(resuTipo.next()){
                Tipo_pago Tipo = new Tipo_pago();
                Tipo.setId_pago(resuTipo.getInt(1));
                Tipo.setNombre(resuTipo.getString(2));
                Tipo.setPropietario(resuTipo.getString(3));
                Tipo.setNumero_cuenta(resuTipo.getInt(4));
                listTipo.addElement(Tipo);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return listTipo;
    }
    
    public void procTipo(Tipo_pago Tipo, String proc){
        dbBean con = new dbBean();
        String sql = "";
        if(proc.equals("insert")){
            sql = "insert into Tipo_pago values("+ Tipo.getId_pago() +", ";
            sql = sql + " '"+ Tipo.getNombre() +"', '"+ Tipo.getPropietario() +"', "+ Tipo.getNumero_cuenta() +" )";
        }else if(proc.equals("update")){
            sql = "update Tipo_pago set nombre_banco = '"+ Tipo.getNombre() +"', ";
            sql = sql + " propietario = '"+ Tipo.getPropietario() +"', numero_cuenta = "+ Tipo.getNumero_cuenta()+"";
            sql = sql + " where id_pago = "+ Tipo.getId_pago() +"";
        }
        try{
            con.updateSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
    
}
