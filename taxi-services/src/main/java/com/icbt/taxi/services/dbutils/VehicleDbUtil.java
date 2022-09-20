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
public class VehicleDbUtil {
   static final String DB_URL = "jdbc:mysql://localhost:3306/gocheeta?autoReconnect=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "123";
   
      public Vehicle getVehicle(String vehicle_id){
      Vehicle vehicle = new Vehicle();
            try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();
              
            ResultSet result = st.executeQuery("SELECT * FROM 'vehicle' WHERE cus_id = '"+ vehicle_id +"'");
            //ResultSet result = st.executeQuery("SELECT * FROM gocheeta.customer");
            while (result.next()) {
                vehicle = new Vehicle(result.getString("vehicle_id"),
                                      result.getString("vehicle_type"));
                  
            }
              
        }catch(SQLException e){
            System.out.println(e);
        }
       return vehicle;
       
   }
   
    
}
