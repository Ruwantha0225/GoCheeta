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
public class DriverDbUtil {
    
   static final String DB_URL = "jdbc:mysql://localhost:3306/gocheeta";
   static final String USER = "root";
   static final String PASS = "pass";
   
      public Driver getDriver(String driver_id){
       Driver driver = null;
            try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();
              
            ResultSet result = st.executeQuery("SELECT * FROM gocheeta.driver WHERE driver_id = '"+ driver_id +"'");
            //ResultSet result = st.executeQuery("SELECT * FROM gocheeta.driver");
            while (result.next()) {
                driver = new Driver(result.getString("driver_id"),
                                        result.getString("driver_name"),
                                        result.getString("driver_phone"));
                //System.out.println(result.getString("cus_id"));
                //System.out.println(result.getString("cus_name"));
                //System.out.println(result.getString("cus_email"));
                  
            }
              
        }catch(SQLException e){
            System.out.println(e);
        }
       return driver;
       
   }
}
