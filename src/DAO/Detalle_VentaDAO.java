
package DAO;

import BEAN.Detalle_Venta;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Detalle_VentaDAO {
    public Vector<Detalle_Venta> ListaItem(boolean sw, String str){
        Vector<Detalle_Venta> item = new Vector<Detalle_Venta>();
        dbBean con = new dbBean();
        String sql = "Select * from Detalle_Venta";
        if(sw == true){
            sql = sql + " WHERE (idVentaf = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Detalle_Venta detVenta = new Detalle_Venta();
                detVenta.setIdVentaf(resultado.getInt(1));
                detVenta.setCodProducto(resultado.getString(2));
                detVenta.setPrecio(resultado.getDouble(3));
                detVenta.setCantidad(resultado.getInt(4));
                item.addElement(detVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public void borraDeta(String idVe){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       sql="delete from Detalle_Venta  WHERE (idVentaf = "+ idVe +")";
       System.out.println("Del dv "+sql);
       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){
        }
        
    }
    public int procesaItem(Detalle_Venta dv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       System.out.println("ENTRE SUAVE");
       if(proc.equals("insert")){
            sql="INSERT INTO Detalle_Venta VALUES ('"+ dv.getIdVentaf()+"', '"+ dv.getCodProducto()+"', '"+ dv.getPrecio()+"', '"+ dv.getCantidad() +"')";
            System.out.println("EVallll: "+sql);
       }
       //if(proc.equals("update")){
       //     sql="UPDATE det_venta set id_producto  = '"+ dv.getId_producto() +"', precio = '"+ dv.getPrecio() +"', cantidad = '"+ dv.getCantidad() +"' where id_venta = '"+ dv.getId_venta() +"'";
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
