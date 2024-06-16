/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import javax.swing.JOptionPane;

/**
 *
 * @author Tharindu Mahesh
 */
public class tables {
    public static void main(String[] args){
      try{
          String userTable ="creat table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
          String adminDetails = "insert into user(name,email,mobileNumber,password,securityQuestion,answer,status)values('Admin','admin@gmail.com','1234567890','Gampha','admin','what is your pet name?','cat','true')";
          String categoryTable = "creat table category(id int AUTO_INCREMENT primary key,name varchar(200))";
          DbOperations.setDataOrDelete(userTable, "user Table Created Successfully");
          DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
          DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
    
}
