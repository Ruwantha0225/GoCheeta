/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

/**
 *
 * @author NOBODY
 */
public class Login {
        public static boolean authenticate(String cus_id, String cus_password) {
        if (cus_id != null && cus_password != null) {
           return cus_id.equals("john") && cus_password.equals("123");   
        } else {
            return false;
        }
    }
    
 
    
}
