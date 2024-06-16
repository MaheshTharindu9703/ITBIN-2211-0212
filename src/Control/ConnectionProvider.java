/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.sql.*;

/**
 *
 * @author Tharindu Mahesh
 */
public class ConnectionProvider {
   public static Connection getcon(){
       try{
           Class.forName("con.mysql.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","123456"); 
       }
       catch(Exception e){
           return null;
       }
   } 

    static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
