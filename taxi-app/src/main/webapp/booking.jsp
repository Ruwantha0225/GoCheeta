<%-- 
    Document   : booking
    Created on : Sep 20, 2022, 9:13:46 AM
    Author     : NOBODY
--%>

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
        <a href ="/taxi-app/index.jsp" /><h3 class="float-md-start mb-0">GoCheeta</h3>
      <nav class="nav nav-masthead justify-content-center float-md-end">
        <a class="nav-link active" aria-current="page" href="/taxi-app/index.jsp">Home</a>
        <a class="nav-link" href="/taxi-app/index.jsp">About</a>
        <a class="nav-link" href="/taxi-app/about.jsp">Contact</a>
      </nav>
    </div>
  </header>
    

    
    <p><h4>Your vehicle is :  GMC</h4>
    <p><h4>Your driver is :  John</h4>
    <p><h4>Your city is :  COLOMBO</h4>
    <p><h4>Your destination is :  PETTAH</h4>
    <p><h3>Calculated Fee(LKR) :  750 </h3></p>
    
        <div class="container py-4">
    <div class="p-5 mb-4 bg-dark rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Cancel ? </h1>
        <p>If you want to cancel the ride, You can call the driver and cancel it!  </p>
        <h3>Driver phone No :</h3>
        <h3>911911911</h3>
        
      </div>
    </div>
    </div>
</div>
</html>
