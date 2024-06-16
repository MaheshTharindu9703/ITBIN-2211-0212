/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import com.mysql.cj.protocol.Resultset;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Tharindu Mahesh
 */
public class DbOperations {
    public static void setDataOrDelete(String Query,String msg){
        try{
           Connection con = ConnectionProvider.getCon(); 
           Statement st = con.createStatement();
           st.executeUpdate(Query);
            Component parentComponent = null;
           if(!msg.equals(""))
               JOptionPane.showMessageDialog(parentComponent, msg);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public static ResultSet getData(String query){
        try{
          Connection con = ConnectionProvider.getCon();
          Statement st = con.createStatement();
          Resultset rs = (Resultset) st.executeQuery(query);
          return (ResultSet) rs;
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
             
        }
        return null;
    }
    
}

