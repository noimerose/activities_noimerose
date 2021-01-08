/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Acer
 */
public class Sql {
     public static void main(String[] args) {
        
        
        
       
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "", "");
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("SELECT * FROM `employees`");
            
            
            
        while(rs.next()){
          
                 Object o [] = {rs.getString("EMPLOYEE_ID"),rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"),rs.getString("EMAIL"),rs.getString("PHONE_NUMBER"),
                 rs.getString("HIRE_DATE"),rs.getString("JOB_ID"),rs.getString("SALARY"),rs.getString("COMMISSION_ID"),rs.getString("MANAGER_ID"),
                 rs.getString("DEPARTMENT_ID")}; 
         }
      
        
        
        
        
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

