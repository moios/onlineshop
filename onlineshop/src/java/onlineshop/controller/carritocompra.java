
package onlineshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import onlineshop.util.DBUtils;

public class carritocompra {
    public static boolean filtrar(String descripcion){
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = null;
        boolean status = false;
        try{
            if(conn == null || conn.isClosed()){
                conn = DBUtils.getConnection();
            }
            
            ps = conn.prepareStatement("select * from producto_stock join categoria"
                    + "on producto_stock.categoria_id = categoria.categoria_id "
                    + "where categoria.descripcion = ?");
            ps.setString(1, descripcion);
            rs = ps.executeQuery();
            status = rs.next();
            
        }catch(SQLException e){
            
        }
        return status;
        
    }
}

