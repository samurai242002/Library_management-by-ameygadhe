
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Amey
 */
public class Connectionprovider {
    public static Connection getCon()
    {
       try
       {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","amey@242002");
           Statement st=con.createStatement();
           //st.execute("create table students('varchar(100)' name)");
           return con;
           
       }
       catch(Exception e)
       {
           System.out.println("Not connected");
           System.out.println(e);
           return null;
       }
    }
    
}
