<%-- 
    Document   : welcome
    Created on : Jul 10, 2016, 10:56:54 AM
    Author     : Yonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Welcome</title>
    
    <style>
        
        .page-header{
        color: #FFFFFF;
        background-color: #CC3333;
        text-align: center;
        }
        .container {
                background-color: #9EC797;
                max-width: 800px;
                margin-top: 20px;
                
            }
            .order-btn {
                background-color:#62D0FF;
                border-color: #f0ad4e;
            }
            .btn-md{
                background-color:#62D0FF;
            }
    </style>
    </head>
    <body>
        <div class = "page-header">
   <h1>Online Hotel Reservation System</h1>
   
 </div>
    
 
   <div class="container">
           <img src='<c:url value="/resources/images/${category.catagoryId}.jpg"></c:url>' alt="image"  style = "width:100%"/>
            <h1>
                ${category.catagoryId}
            </h1>
             <p>
                ${category.catagoryName}
            </p>
            <p>
                ${category.roomPrice}
            </p>
            <p> ${category.discription}</p>
            <p>
            <a class="btn btn-default btn-md" href='<c:url value="/RoomCatagories"/>'>
                <span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> Show All Categories
            </a>
            </p>
        
           <p  align="right">
            <a class="btn btn-default btn-md" href='<c:url value="/Booking/add"/>'>
                <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span> Go On Booking
            </a>
            </p>
        </div>     
  
         
   
</body>
</html>

