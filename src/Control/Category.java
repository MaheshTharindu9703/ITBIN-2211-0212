/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.ArrayList;

/**
 *
 * @author Tharindu Mahesh
 */
public class Category { 
    public static void save(Category category){
        String query = "insert into category(name) values('"+category.getName()+"')";
        DbOparations.setDataOrDelete(query,"Category added successfully");
    }
    
    public static ArrayList<Category> getAllRecords();{
        ArrayList<Category = new ArrayList<>();
        try{
            Resultset rs =DbOperations.getData("select *from category");
            while(rs.next()){
                Category category = new Category();
                
            
            }
        }
    }
    
}
