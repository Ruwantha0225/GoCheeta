<%-- 
    Document   : index
    Created on : Sep 17, 2022, 11:11:06 AM
    Author     : NOBODY
--%>

<%@page import="com.icbt.taxi.services.soap.CustomerService"%>
<%@page import="com.icbt.taxi.services.soap.CustomerService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
    </head>
    <body>
        <h1>
            <%
            CustomerService_Service service = new CustomerService_Service();
            CustomerService proxy = service.getCustomerServicePort();
            
            out.println(proxy.hello("john"));
            %>
            
        </h1>
    </body>
</html>
