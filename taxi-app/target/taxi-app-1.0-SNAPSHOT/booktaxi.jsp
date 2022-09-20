<%-- 
    Document   : booktaxi
    Created on : Sep 20, 2022, 4:38:30 AM
    Author     : NOBODY
--%>

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
        
              <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Choose a vehicle Type </h1>
        <p>In the dropdowm menu, You can choose a vehicle type of your choice !</p>
           <div class="dropdown">
              <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
                Dropdown button
              </button>
              <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenuButton2">
                <li><a class="dropdown-item active" href="#">CAR</a></li>
                <li><a class="dropdown-item" href="#">SUV</a></li>
                <li><a class="dropdown-item" href="#">VAN</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">choose the vehicle type from above</a></li>
              </ul>
            </div>
       </div>
            

            
            
    
    <div class="container py-4">
    <div class="p-5 mb-4 bg-dark rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Did you choose the vehicle ? </h1>
        <p>After clicking the "NEXT button" will directed to the next page to </p>
        <h4>Choose the location </h4>
        <a href="/taxi-app/booklocation.jsp" button class="btn btn-primary btn-lg" type="button">NEXT</a></button>
      </div>
    </div>
    </div>
   
     
          <footer class="mt-auto text-white-50">
                <p>Web application for <a href="#" class="text-white">GoCheeta</a>, by <a href="#" class="text-white">Ruwantha Ranasinghe</a>.</p>
          </footer>

 
    </body>
</html>