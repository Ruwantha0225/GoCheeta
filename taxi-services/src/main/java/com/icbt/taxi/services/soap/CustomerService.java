/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.icbt.taxi.services.soap;

import com.icbt.taxi.services.dbutils.Customer;
import com.icbt.taxi.services.dbutils.CustomerDbUtil;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NOBODY
 */
@WebService(serviceName = "CustomerService")
public class CustomerService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "getCustomer")
    public Customer getCustomer(@WebParam(name = "cus_id") String cus_id) {
        CustomerDbUtil customerutil = new CustomerDbUtil();
        return customerutil.getCustomer(cus_id);
        
    }
}
