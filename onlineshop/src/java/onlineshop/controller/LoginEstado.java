
package onlineshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import onlineshop.util.DBUtils;

public class LoginEstado {
    public static boolean validate(String usuario, String contrasenha){
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = null;
        boolean status = false;
        try{
            if(conn == null || conn.isClosed()){
                conn = DBUtils.getConnection();
            }
            
            ps = conn.prepareStatement("select * from usuario "
                    + "where login_nombre=? and contrasenha=?");
            ps.setString(1, usuario);
            ps.setString(2, contrasenha);
            rs = ps.executeQuery();
            status = rs.next();
            
        }catch(SQLException e){
            
        }
        return status;
        
    }
}

