/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

/**
 *
 * @author NOBODY
 */
public class Customer {
    private String cus_id;
    private String cus_name;
    private String cus_email;
    
    public Customer(){
    this.cus_id = "";
    this.cus_name = "";
    this.cus_email = "";
    }
    
    public Customer(String cus_id,String cus_name, String cus_email){
    this.cus_id = cus_id;
    this.cus_name = cus_name;
    this.cus_email = cus_email;
    }

    public String getCusId() {
        return cus_id;
    }

    public void setCusId(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCusName() {
        return cus_name;
    }

    public void setCusName(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCusEmail() {
        return cus_email;
    }

    public void setCusEmail(String cus_email) {
        this.cus_email = cus_email;
    }
    
    
}
