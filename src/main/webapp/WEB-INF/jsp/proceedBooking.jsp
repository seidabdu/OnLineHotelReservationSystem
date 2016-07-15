<%-- 
    Document   : welcome
    Created on : Jul 10, 2016, 10:56:54 AM
    Author     : Yonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
          
    </style>
    </head>
    <body>
  <div class = "page-header">
   <h1>Online Hotel Reservation System</h1>
 </div>
    
      




<div class="container">
  <h2>Your Booking Information is over here Checked It out Again before you confirm Booking</h2>
<p>Booking Number:${formdata.bookingNumber} </p> 
<p>Room Number:<span style="color:green" >${formdata.roomNumber}</span> </p> 
<p>Room Floor:${formdata.room.floor} </p> 
<p>Customer ID:${formdata.customerId} </p>
<p>Check In Date: ${formdata.checkout} </p>
<p>Check Out Date:${formdata.checkout} </p>
<p>The Total Price:${formdata.grandTotal} USD </p> 
</div>


 <section class="container" >
      <div>
        
      
        <div>
          
         <a href="<spring:url value="/Booking/confirm" />" class="btn btn-success pull-left"> <span></span> Confirm Booking
          </a>
        </div>
     
    <br>
    <br>
        <a href="<spring:url value="/Booking/add" />" class="btn btn-default">
          <span class="glyphicon-hand-left glyphicon"></span> Back To Booking
        </a>
      </div>
    </section>


   
</body>
</html>

