
package DAO;

import BEAN.Cab_venta;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Cab_ventaDAO {
    
    public Vector<Cab_venta> ListaItem(boolean sw, String str){
        Vector<Cab_venta> item = new Vector<Cab_venta>();
        dbBean con = new dbBean();
        String sql = "Select * from Cab_venta";
        if(sw == true){
            sql = sql + " WHERE (dniClif = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cab_venta cabVenta = new Cab_venta();
                cabVenta.setIdVenta(resultado.getInt(1));
                cabVenta.setDniClif(resultado.getString(2));
                cabVenta.setFechaVenta(resultado.getString(3));
                cabVenta.setEstado(resultado.getString(4));
                cabVenta.setIdDeliveryf(resultado.getInt(5));
                cabVenta.setDniVendedor(resultado.getString(6));
                cabVenta.setDniRepartidorf(resultado.getString(7));
                cabVenta.setIdPagof(resultado.getInt(8));
                item.addElement(cabVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public int procesaItem(Cab_venta cv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cab_venta VALUES ('"+ cv.getIdVenta()+"', '"+ cv.getDniClif()+"', '"+ cv.getFechaVenta()+"', '"+ cv.getEstado() +"', '"+ cv.getIdDeliveryf()+"', '"+ cv.getDniVendedor()+"', '"+ cv.getDniRepartidorf()+"', '"+ cv.getIdPagof()+"')";
            System.out.println("uuuuuuu" + sql);
       }
       //if(proc.equals("update")){
       //     sql="UPDATE cab_venta set fecha  = '"+ cv.getFecha() +"', id_cliente = '"+ cv.getId_cliente() +"', estado = '"+ cv.getEstado() +"' where id_venta = '"+ cv.getId_venta() +"'";
       //}
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
        con.close();
        }
        catch(SQLException e){
        }
          return resultado;
      }    
}
