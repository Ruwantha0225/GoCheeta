<%-- 
    Document   : booklocation
    Created on : Sep 20, 2022, 8:38:39 AM
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
                    <h3 class="float-md-start mb-0">GoCheeta</h3>
                    <nav class="nav nav-masthead justify-content-center float-md-end">
                      <a class="nav-link" href="/taxi-app/signin.jsp">Profile</a>
                      <a class="nav-link" href="/taxi-app/booktaxi.jsp">About </a>
                      <a class="nav-link" href="#">Contact</a>
                    </nav>
                  </div>
                </header>
        
     <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Choose your city here ! </h1>
        <p>In the dropdowm menu, You can choose your City that you will start your journey !</p>
           <div class="dropdown">
              <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
                CITY
              </button>
              <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenuButton2">
                <li><a class="dropdown-item active" href="#">COLOMBO</a></li>
                <li><a class="dropdown-item" href="#">KANDY</a></li>
                <li><a class="dropdown-item" href="#">GALLE</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">choose your city from above</a></li>
              </ul>
            </div>
       </div>
            
            
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Choose the street address ! </h1>
        <p>In the dropdowm menu, You can choose the street address of your starting point !</p>
           <div class="dropdown">
              <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
                PICK UP
              </button>
              <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenuButton2">
                <li><a class="dropdown-item active" href="#">PETTAH</a></li>
                <li><a class="dropdown-item" href="#">TOWN HALL</a></li>
                <li><a class="dropdown-item" href="#">MARADANA</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">choose the starting location from above</a></li>
              </ul>
            </div>

       </div>
             <p>In the dropdowm menu, You can choose the street address of your destination !</p>
             <div class="dropdown">
              <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
                DESTINATION
              </button>
              <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenuButton2">
                <li><a class="dropdown-item active" href="#">PETTAH</a></li>
                <li><a class="dropdown-item" href="#">TOWN HALL</a></li>
                <li><a class="dropdown-item" href="#">MARADANA</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">choose your destination from above</a></li>
              </ul>
            </div>

            
            
    
    <div class="container py-4">
    <div class="p-5 mb-4 bg-dark rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">Done ? </h1>
        <p>You are only one click away to  </p>
        <h4>Confirm your RIDE !</h4>
        <a href="/taxi-app/booking.jsp" button class="btn btn-primary btn-lg" type="button">CONFIRM</a></button>
      </div>
    </div>
    </div>
   
     
          <footer class="mt-auto text-white-50">
                <p>Web application for <a href="#" class="text-white">GoCheeta</a>, by <a href="#" class="text-white">Ruwantha Ranasinghe</a>.</p>
          </footer>

 
    </body>
</html>
