
package DAO;
//aasadasdsa//
import BEAN.Cliente;
import BEAN.Delivery;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
//dd//
public class ClienteDAO {
     public Vector<Cliente> listaCliente(boolean sw, String str){
        Vector<Cliente> listClie = new Vector<Cliente>();
        dbBean con = new dbBean();
        String sql = "Select * from cliente";
        if(sw == true){
            sql = sql + " WHERE (dniCli LIKE '"+ str +"%') OR (apellidoCli LIKE '" + str + "%')OR (nombreCli LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setDniCli(resultado.getString(1));
                cliente.setApellidoCli(resultado.getString(2));
                cliente.setNombreCli(resultado.getString(3));
                cliente.setDireccionCli(resultado.getString(4));
                cliente.setTelefonoCli(resultado.getInt(5));
                cliente.setCorreoCli(resultado.getString(6));
                cliente.setFecha_nac_clie(resultado.getString(7));
                listClie.addElement(cliente);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return listClie;
    }
    public void procesaCliente(Cliente c, String proc){
        dbBean con = new dbBean();
        String sql = "";
        if(proc.equals("insert")){
             sql="insert into Cliente values('"+ c.getDniCli()+"', '"+ c.getApellidoCli()+"', '"+ c.getNombreCli()+"', '"+ c.getDireccionCli()+"', '"+ c.getTelefonoCli()+"', '"+ c.getCorreoCli()+"', '"+ c.getFecha_nac_clie()+"')";
        }else if(proc.equals("update")){
            sql="update Cliente set apellidoCli = '"+ c.getApellidoCli()+"', ";
            sql = sql + " nombreCli = '"+ c.getNombreCli() +"', direccionCli = '"+ c.getDireccionCli() +"', telefonoCli = '"+ c.getTelefonoCli() +"', correoCli = '"+ c.getCorreoCli() +"', fecha_nac_clie = '"+ c.getFecha_nac_clie() +"' where dniCli = '"+ c.getDniCli() +"'";
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
     public int procesaCliente1(Cliente c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="insert into Cliente values('"+ c.getDniCli()+"', '"+ c.getApellidoCli()+"', '"+ c.getNombreCli()+"', '"+ c.getDireccionCli()+"', '"+ c.getTelefonoCli()+"', '"+ c.getCorreoCli()+"', '"+ c.getFecha_nac_clie()+"')";
            
       } else if(proc.equals("update")){
            sql="update Cliente set apellidoCli = '"+ c.getApellidoCli()+"', ";
            sql = sql + " nombreCli = '"+ c.getNombreCli() +"', direccionCli = '"+ c.getDireccionCli() +"', telefonoCli = '"+ c.getTelefonoCli() +"', correoCli = '"+ c.getCorreoCli() +"', fecha_nac_clie = '"+ c.getFecha_nac_clie() +"' where dniCli = '"+ c.getDniCli() +"'";
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
        con.close();
        }
        catch(java.sql.SQLException e){
            e.printStackTrace();
        }
          return resultado;
      }
}
