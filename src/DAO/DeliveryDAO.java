package DAO;

import BEAN.Delivery;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class DeliveryDAO {
    
    public DeliveryDAO(){
    }
     
    public Vector<Delivery> listaDelivery(boolean sw, String cad){
        Vector<Delivery> listDeli = new Vector<Delivery>();
        dbBean con = new dbBean();
        String sql;
        sql = "select * from Delivery ";
        if(sw == true){
            sql = sql + " where departamento like '"+ cad +"%' or distrito like '"+ cad +"%' or provincia like '"+ cad +"%'";
        }
        try{
            ResultSet resuDeli = con.execSQL(sql);
            while(resuDeli.next()){
                Delivery Deli = new Delivery();
                Deli.setId_delivery(resuDeli.getInt(1));
                Deli.setTipo_del(resuDeli.getString(2));
                Deli.setDestino(resuDeli.getString(3));
                Deli.setPreciocaja(resuDeli.getInt(4));
                Deli.setAgencia(resuDeli.getString(5));
                Deli.setProvincia(resuDeli.getString(6));
                Deli.setDepartamento(resuDeli.getString(7));
                Deli.setDistrito(resuDeli.getString(8));
                listDeli.addElement(Deli);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return listDeli;
    }
    
    public void procDeli(Delivery Deli, String proc){
        dbBean con = new dbBean();
        String sql = "";
        if(proc.equals("insert")){
            sql = "insert into Delivery values("+ Deli.getId_delivery() +", ";
            sql = sql + " '"+ Deli.getTipo_del() +"', '"+ Deli.getDestino() +"', "+ Deli.getPreciocaja() +", '"+ Deli.getAgencia() +"', '"+ Deli.getProvincia() +"', '"+ Deli.getDepartamento() +"', '"+ Deli.getDistrito() +"')";
        }else if(proc.equals("update")){
            sql = "update Delivery set tipo_del = '"+ Deli.getTipo_del() +"', ";
            sql = sql + " destino = '"+ Deli.getDestino() +"', preciocaja = "+ Deli.getPreciocaja()+", agencia = '"+ Deli.getAgencia()+"', provincia = '"+ Deli.getProvincia()+"', departamento = '"+ Deli.getDepartamento()+"', distrito = '"+ Deli.getDistrito() +"' ";
            sql = sql + " where id_delivery = "+ Deli.getId_delivery() +"";
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
