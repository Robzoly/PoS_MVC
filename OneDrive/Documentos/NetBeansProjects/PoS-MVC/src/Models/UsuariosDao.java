
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Usuarios login(String Usuario, String Password){
        String sql = "SELECT * FROM Usuarios WHERE Usuario = ? AND Password = ?";
        Usuarios us = new Usuarios();
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            if (rs.next()){
                us.setId(rs.getInt("Id"));
                us.setNombre(rs.getString("Nombre"));
                us.setUsuario(rs.getString("Usuario"));
                us.setCaja(rs.getString("Caja"));
                us.setRol(rs.getString("rol"));
                us.setEstado(rs.getString("estado"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
}
