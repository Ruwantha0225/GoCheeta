<%-- 
    Document   : taxistart
    Created on : Sep 20, 2022, 1:54:45 PM
    Author     : NOBODY
--%>

<%@page import="com.icbt.taxi.services.soap.Driver"%>
<%@page import="com.icbt.taxi.services.soap.DriverService"%>
<%@page import="com.icbt.taxi.services.soap.DriverService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="webcomponents\header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="d-flex h-100 text-center text-white bg-dark">
        <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
                <header class="mb-auto">
                  <div>
                    <h3 class="float-md-start mb-0">GoCheeta</h3>
                    <nav class="nav nav-masthead justify-content-center float-md-end">
                      <a class="nav-link" href="/taxi-app/index.jsp">Home</a>
                      <a class="nav-link" href="/taxi-app/about.jsp">About </a>
                      <a class="nav-link" href="#">Contact</a>
                    </nav>
                  </div>
                </header>
            
                <div class="container py-4">
    <div class="p-5 mb-4 bg-dark rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">You have Logged in successfully !</h1>
        <p>Lets go for a Ride ! Click here to start</p>
        <a href="/taxi-app/booktaxi.jsp" button class="btn btn-primary btn-lg" type="button">START  </a></button>
      </div>
    </div>
        </div>
            
                               <%
            DriverService_Service service = new DriverService_Service();
            DriverService proxy = service.getDriverServicePort();
            Driver driver = proxy.getDriver("");
            //System.out.println(result.getString("cus_name"));
        
            %>
            
             <p><%out.println(driver.getDriverId());%></p>
            <p><%out.println(driver.getDriverPhone());%></p>

    </body>
</html>
