/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.icbt.taxi.services.soap;

import com.icbt.taxi.services.dbutils.Location;
import com.icbt.taxi.services.dbutils.LocationDbUtil;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NOBODY
 */
@WebService(serviceName = "LocationService")
public class LocationService {

    @WebMethod(operationName = "getLocation")
    public Location getLocation(@WebParam(name = "city") String city) {
        LocationDbUtil locationutil = new LocationDbUtil();
        return locationutil.getLocation(city);
    }
}
