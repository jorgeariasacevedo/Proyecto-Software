
package DAO;
//venedor//
import BEAN.Vendedor;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class VendedorDAO {
    public Vector<Vendedor> ListaItem(boolean sw, String str){
        Vector<Vendedor> item = new Vector<Vendedor>();
        dbBean con = new dbBean();
        String sql = "Select * from Vendedor";
        if(sw == true){
            sql = sql + " WHERE (dniVendedor LIKE '"+ str +"%') OR (nombVendedor LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Vendedor vende = new Vendedor();
                vende.setDniVendedor(resultado.getString(1));
                vende.setNombVendedor(resultado.getString(2));
                vende.setTelefono(resultado.getInt(3));
                vende.setDireccion(resultado.getString(4));
                vende.setDistrito(resultado.getString(5));
                vende.setSueldo(resultado.getDouble(6)); 
                item.addElement(vende);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Vendedor c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Vendedor VALUES ('"+ c.getDniVendedor()+"', '"+ c.getNombVendedor()+"', '"+ c.getTelefono()+"', '"+ c.getDireccion()+"', '"+ c.getDistrito()+"', '"+ c.getSueldo()+"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Vendedor set nombVendedor = '"+ c.getNombVendedor() +"', telefono = '"+ c.getTelefono() +"', direccion = '"+ c.getDireccion() +"', distrito = '"+ c.getDistrito() +"', sueldo = '"+ c.getSueldo() +"' where dniVendedor = '"+ c.getDniVendedor() +"'";
       }
       if(proc.equals("delete")){
            sql="delete from Vendedor where dniVendedor = '"+ c.getDniVendedor() +"'";
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
