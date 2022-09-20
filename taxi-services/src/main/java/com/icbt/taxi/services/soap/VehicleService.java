/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.icbt.taxi.services.soap;

import com.icbt.taxi.services.dbutils.Vehicle;
import com.icbt.taxi.services.dbutils.VehicleDbUtil;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NOBODY
 */
@WebService(serviceName = "VehicleService")
public class VehicleService {

    /**
     * This is a sample web service operation
     */
    
    
    @WebMethod(operationName = "getVehicle")
    public Vehicle getVehicle(@WebParam(name = "vehicle_id") String vehicle_id) {
        VehicleDbUtil vehicleutil = new VehicleDbUtil();
        return vehicleutil.getVehicle(vehicle_id);
        
    }
}
