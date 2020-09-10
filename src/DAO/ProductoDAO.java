
package DAO;


import BEAN.Producto;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProductoDAO {
    public Vector<Producto> ListaItem(boolean sw, String str){
        Vector<Producto> item = new Vector<Producto>();
        dbBean con = new dbBean();
        String sql = "Select * from Producto";
        if(sw == true){
            sql = sql + " WHERE (idProducto LIKE '"+ str +"%') OR (modelo LIKE '" + str + "%') OR (tipo LIKE '" + str + "%') OR (detalle LIKE '" + str + "%') OR (color LIKE '" + str + "%') OR (talla LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getString(1));
                producto.setModelo(resultado.getString(2));
                producto.setTipo(resultado.getString(3));
                producto.setDetalle(resultado.getString(4));
                producto.setColor(resultado.getString(5));
                producto.setTalla(resultado.getString(6));
                producto.setPreciounitario(resultado.getDouble(7));
                producto.setStock(resultado.getInt(8));
                item.addElement(producto);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Producto c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Producto VALUES ('"+ c.getIdProducto()+"', '"+ c.getModelo()+"', '"+ c.getTipo()+"', '"+ c.getDetalle()+"', '"+ c.getColor()+"', '"+ c.getTalla()+"', '"+ c.getPreciounitario()+"', '"+ c.getStock()+"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Producto set modelo = '"+ c.getModelo() +"', tipo = '"+ c.getTipo() +"', detalle = '"+ c.getDetalle() +"', color = '"+ c.getColor() +"', talla = '"+ c.getTalla() +"', preciounitario = '"+ c.getPreciounitario() +"', stock = '"+ c.getStock() +"' where idProducto = '"+ c.getIdProducto() +"'";
       }
       if(proc.equals("delete")){
            sql="delete Producto where idProducto = '"+ c.getIdProducto() +"'";
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
