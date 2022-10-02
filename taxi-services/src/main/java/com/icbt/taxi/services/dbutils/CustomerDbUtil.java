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
public class CustomerDbUtil {
   static final String DB_URL = "jdbc:mysql://localhost:3306/gocheeta?autoReconnect=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "pass";

    
      /**public static void main(String[] args) {
          try{
              Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
              Statement st = conn.createStatement();
              
              ResultSet result = st.executeQuery("SELECT * FROM gocheeta.customer");
              
              while (result.next()) {
                  System.out.println(result.getString("cus_id"));
                  System.out.println(result.getString("cus_name"));
                  System.out.println(result.getString("cus_email"));
                  
              }
              
          }catch(SQLException e){
              System.out.println(e);
          }
   }
     * @param cus_id
     * @return  **/
   public Customer getCustomer(String cus_id){
       Customer customer = new Customer();
            try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();
              
            ResultSet result = st.executeQuery("SELECT * FROM 'customer' WHERE cus_id = '"+ cus_id +"'");
            //ResultSet result = st.executeQuery("SELECT * FROM gocheeta.customer");
            while (result.next()) {
                customer = new Customer(result.getString("cus_id"),
                                        result.getString("cus_name"),
                                        result.getString("cus_email"));
                //System.out.println(result.getString("cus_id"));
                //System.out.println(result.getString("cus_name"));
                //System.out.println(result.getString("cus_email"));
                  
            }
              
        }catch(SQLException e){
            System.out.println(e);
        }
       return customer;
       
   }
}
