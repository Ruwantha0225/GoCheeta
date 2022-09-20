/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

/**
 *
 * @author NOBODY
 */
public class Driver {
    private String driver_id;
    private String driver_name;
    private String driver_phone;
    
    public Driver(){
    this.driver_id = "d1";
    this.driver_name = "josh";
    this.driver_phone = "";
    }
    
    public Driver(String driver_id,String driver_name, String driver_phone){
    this.driver_id = driver_id;
    this.driver_name = driver_name;
    this.driver_phone = driver_phone;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_phone() {
        return driver_phone;
    }

    public void setDriver_phone(String driver_phone) {
        this.driver_phone = driver_phone;
    }
    

    
}
