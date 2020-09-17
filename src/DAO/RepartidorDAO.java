
package DAO;

import BEAN.Repartidor;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
//Ss//
public class RepartidorDAO {
    public Vector<Repartidor> ListaItem(boolean sw, String str){
        Vector<Repartidor> item = new Vector<Repartidor>();
        dbBean con = new dbBean();
        String sql = "Select * from Repartidor";
        if(sw == true){
            sql = sql + " WHERE (dniRepartidor LIKE '"+ str +"%') OR (nombRepartidor LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Repartidor repartidor = new Repartidor();
                repartidor.setDniRepartidor(resultado.getString(1));
                repartidor.setNombRepartidor(resultado.getString(2));
                repartidor.setTelefono(resultado.getInt(3));
                repartidor.setDireccion(resultado.getString(4));
                repartidor.setDistrito(resultado.getString(5));
                repartidor.setSueldo(resultado.getDouble(6));
                item.addElement(repartidor);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Repartidor c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Repartidor VALUES ('"+ c.getDniRepartidor()+"', '"+ c.getNombRepartidor()+"', '"+ c.getTelefono()+"', '"+ c.getDireccion()+"', '"+ c.getDistrito()+"', '"+ c.getSueldo()+"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Repartidor set nombRepartidor = '"+ c.getNombRepartidor() +"', telefono = '"+ c.getTelefono() +"', direccion = '"+ c.getDireccion() +"', distrito = '"+ c.getDistrito() +"', sueldo = '"+ c.getSueldo() +"' where dniRepartidor = '"+ c.getDniRepartidor() +"'";
       }
       if(proc.equals("delete")){
            sql="delete Repartidor where dniRepartidor = '"+ c.getDniRepartidor() +"'";
       }
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
