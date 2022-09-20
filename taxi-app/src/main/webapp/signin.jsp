<%-- 
    Document   : signin
    Created on : Sep 20, 2022, 3:12:52 AM
    Author     : NOBODY

--%>
<%@page import="com.icbt.taxi.services.soap.CustomerService"%>
<%@page import="com.icbt.taxi.services.soap.CustomerService_Service"%>
<%@page import="com.icbt.taxi.services.soap.Customer"%>
<%@page import="com.icbt.taxi.services.soap.GetCustomer"%>
<%@page import="com.icbt.taxi.services.soap.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="webcomponents\header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p></p>
        
        <div class="form-floating mb-3">
       <input type="email" class="form-control" id="floatingInput" placeholder="John Wick">
       <label for="floatingInput">USER NAME</label>
     </div>
     <div class="form-floating">
       <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
       <label for="floatingPassword">PASSWORD</label>
       <P></p>
        <a href="/taxi-app/taxistart.jsp" button class="btn btn-primary btn-lg" type="button">SUBMIT</a></button>
       
       
     <p></p>
       <a href="/taxi-app/index.jsp" button class="btn btn-secondary" type="button">back to home</a></button>
       <p></p>
       <button type="button" class="btn btn-info">Sign Up</button
     </div>
        
                    <%
            CustomerService_Service service = new CustomerService_Service();
            CustomerService proxy = service.getCustomerServicePort();
            Customer customer = proxy.getCustomer("c1");
            //System.out.println(result.getString("cus_name"));
        
            %>
            
             <p><%out.println(customer.getCusEmail());%></p>
            <p><%out.println(customer.getCusName());%></p>
        
        
       


    </body>
</html>
