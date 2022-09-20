/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.icbt.taxi.services.soap;

import com.icbt.taxi.services.dbutils.DriverDbUtil;
import com.icbt.taxi.services.dbutils.Driver;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NOBODY
 */
@WebService(serviceName = "DriverService")
public class DriverService {

    /**
     * This is a sample web service operation
     */
    /**@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";**/
        
    @WebMethod(operationName = "getDriver")
    public Driver getDriver(@WebParam(name = "driver_id") String driver_id) {
    DriverDbUtil driverutil = new DriverDbUtil();
    return driverutil.getDriver(driver_id);
    }
}
