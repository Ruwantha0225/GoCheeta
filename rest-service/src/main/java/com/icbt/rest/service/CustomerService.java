/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


/**
 *
 * @author NOBODY
 */
@Path("customer")
public class CustomerService {
    @GET
    @Path("/{cus_id}")
    public Response getCustomer(@PathParam("cus_id")String cus_id){
    CustomerDbUtil cusutil = new CustomerDbUtil();
    Customer customer = cusutil.getCustomer("c1");
       
    return Response.status(200).entity(customer.getCusName()).build();
             }
    
}
