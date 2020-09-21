/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Usuario;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Sofia
 */
public class UsuarioDAO {
    
    public Vector<Usuario> listUsu(String usu, String pw){
        Vector<Usuario> item = new Vector<Usuario>();
        dbBean con = new dbBean();
        String sql="";
        sql = "Select * from Usuario where codigo='"+usu+"' and pw='"+pw+"'";
        try{
            ResultSet r = con.execSQL(sql);
            while(r.next()){
                Usuario u = new Usuario();
                u.setId(r.getInt(1));
                u.setEmpleado(r.getInt(2));
                u.setCodigo(r.getString(3));
                u.setPw(r.getString(4));
                item.add(u);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return item;
    }

}
