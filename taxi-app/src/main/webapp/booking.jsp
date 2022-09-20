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
        <a class="nav-link" href="/taxi-app/index.jsp">Features</a>
        <a class="nav-link" href="/taxi-app/about.jsp">Contact</a>
      </nav>
    </div>
  </header>
    

    
    <dl class="row">
  <dt class="col-sm-3">Your vehicle is :</dt>
  <dd class="col-sm-9">GMC</dd>

  <dt class="col-sm-3">Your Driver is :</dt>
  <dd class="col-sm-9">John wick</dd>
    

  <dt class="col-sm-3">Your city is :</dt>
  <dd class="col-sm-9">COLOMBO</dd>

  <dt class="col-sm-3">Your destination is :</dt>
  <dd class="col-sm-9">MARADANA</dd>

  <dt class="col-sm-3">FEE IS :</dt>
  <dd class="col-sm-9">500</dd>
  </dd>
</dl>
</div>
</html>
