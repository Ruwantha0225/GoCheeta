<%-- 
    Document   : index
    Created on : Sep 17, 2022, 11:11:06 AM
    Author     : NOBODY
--%>

<%@page import="com.icbt.taxi.services.soap.CustomerService"%>
<%@page import="com.icbt.taxi.services.soap.CustomerService_Service"%>
<%@page import="com.icbt.taxi.services.soap.Customer"%>
<%@page import="com.icbt.taxi.services.soap.GetCustomer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="webcomponents\header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body class="d-flex h-100 text-center text-white bg-dark">
        <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
                <header class="mb-auto">
                  <div>
                    <h3 class="float-md-start mb-0">GoCheeta</h3>
                    <nav class="nav nav-masthead justify-content-center float-md-end">
                      <a class="nav-link" href="/taxi-app/signin.jsp">Profile</a>
                      <a class="nav-link" href="/taxi-app/booktaxi.jsp">Guest </a>
                      <a class="nav-link" href="#">Contact</a>
                    </nav>
                  </div>
                </header>
        
                    

    <div id="myCarousel" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active" aria-label="Slide 1" aria-current="true"></button>
      <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2" class=""></button>
      <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3" class=""></button>
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#777"></rect></svg>

        <div class="container">
          <div class="carousel-caption text-start">
            <h1>Example headline.</h1>
            <p>Sign up if you are new here.</p>
            <p><a class="btn btn-lg btn-primary" href="#">SIGN UP !</a></p>
          </div>
        </div>
      </div>
      <div class="carousel-item">
        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#777"></rect></svg>

        <div class="container">
          <div class="carousel-caption">
            <h1>Another example headline.</h1>
            <p> You can get some more info bout us here !.</p>
            <p><a class="btn btn-lg btn-primary" href="/taxi-app/about.jsp">ABOUT US !</a></p>
          </div>
        </div>
      </div>
      <div class="carousel-item">
        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#777"></rect></svg>

        <div class="container">
          <div class="carousel-caption text-end">
            <p>Look what others tell about us !.</p>
            <p><a class="btn btn-lg btn-primary" href="#">REVIEWS</a></p>
          </div>
        </div>
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
        
<div class="row featurette">
       <div class="container py-4">
        <h2 class="featurette-heading">Ride with -  <span class="text-muted">GoCheeta.</span></h2>
        <p class="lead">GoCheeta is a platform for everybody. You can now book taxi and ride around the whole world
            We are available 24/7. You can simply sign into your account and book a taxi. Smple as that !</p>
        <h4>HAPPY RIDING ! <span class="text-muted">ENJOY and STAY SAFE</span></h4> 
      </div>
    
    <div class="container py-4">
    <div class="p-5 mb-4 bg-dark rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Lets go for a Ride !</h1>
        <p>Sign in to your account</p>
        <a href="/taxi-app/booktaxi.jsp" button class="btn btn-primary btn-lg" type="button">SIGN IN  </a></button>
      </div>
    </div>
    </div>
     
          <footer class="mt-auto text-white-50">
                <p>Web application for <a href="#" class="text-white">GoCheeta</a>, by <a href="#" class="text-white">Ruwantha Ranasinghe</a>.</p>
          </footer>
            <%
            CustomerService_Service service = new CustomerService_Service();
            CustomerService proxy = service.getCustomerServicePort();
            
            //out.println(proxy.hello("Drake"));
            %>
            
       
       
            <%
            Customer customer = proxy.getCustomer("c1");
            //System.out.println(result.getString("cus_name"));
        
            %>
            
            <p><%out.println(customer.getCusEmail());%></p>
            <p><%out.println(customer.getCusName());%></p>
            
 
    </body>
</html>
