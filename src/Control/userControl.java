/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.User;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Tharindu Mahesh
 */
public class userControl {
    public static void save(User user){
        String query ="insert into user(name,email,mobileNumber,Address,password,securityquestion,answer,status)values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
        DbOperations.setDataOrDelete(query,"Registered Successfully! Wait for Admin Approval!");
    }
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new user();
                user.setStatus(rs.getString("status"));
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    private static class user extends User {

        public user() {
        }
    }
    
}
