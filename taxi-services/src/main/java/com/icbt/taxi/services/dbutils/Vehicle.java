/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

/**
 *
 * @author NOBODY
 */
public class Vehicle {
    private String vehicle_id;
    private String vehicle_type;;
    
    public Vehicle(){
    this.vehicle_id = "";
    this.vehicle_type = "";
    }
    
    public Vehicle(String vehicle_id,String vehicle_type){
    this.vehicle_id = vehicle_id;
    this.vehicle_type = vehicle_type;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
}
