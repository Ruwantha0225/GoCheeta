/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NOBODY
 */
public class LocationDbUtil {
   static final String DB_URL = "jdbc:mysql://localhost:3306/gocheeta?autoReconnect=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "pass";
   
      public Location getLocation(String city){
       Location location = new Location();
            try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();
              
            ResultSet result = st.executeQuery("SELECT * FROM 'location' WHERE city = '"+ city +"'");
            while (result.next()) {
                location = new Location(result.getString("city"),
                                        result.getString("street"));      
            }
              
        }catch(SQLException e){
            System.out.println(e);
        }
       return location;
       
   }
    
}
