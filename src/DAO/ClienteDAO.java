
package DAO;
//aasadasdsa//
import BEAN.Cliente;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
//dd//
public class ClienteDAO {
     public Vector<Cliente> ListaItem(boolean sw, String str){
        Vector<Cliente> item = new Vector<Cliente>();
        dbBean con = new dbBean();
        String sql = "Select * from cliente";
        if(sw == true){
            sql = sql + " WHERE (dniCli LIKE '"+ str +"%') OR (nombres LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setDniCli(resultado.getString(1));
                cliente.setApellidosCli(resultado.getString(2));
                cliente.setNombreCli(resultado.getString(3));
                cliente.setDireccionCli(resultado.getString(4));
                cliente.setTelefonoCli(resultado.getInt(5));
                cliente.setCorreoCli(resultado.getString(6));
                cliente.setFecha_nac_clie(resultado.getDate(7));
                item.addElement(cliente);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Cliente c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cliente VALUES ('"+ c.getDniCli()+"','"+ c.getApellidosCli()+"','"+ c.getNombreCli()+"', '"+ c.getDireccionCli()+"', '"+ c.getTelefonoCli()+"', '"+ c.getCorreoCli()+"', '"+ c.getFecha_nac_clie()+"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cliente set apellidoCli = '"+ c.getApellidosCli()+"', nombreCli = '"+ c.getNombreCli() +"',direccionCli = '"+ c.getDireccionCli() +"', telefonoCli = '"+ c.getTelefonoCli() +"', correoCli = '"+ c.getCorreoCli() +", fecha_nac_clie = '"+ c.getFecha_nac_clie() +"' where id_cliente = '"+ c.getDniCli() +"'";
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
