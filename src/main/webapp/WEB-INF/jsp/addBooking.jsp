<%-- 
    Document   : addProduct
    Created on : Apr 28, 2016, 9:14:54 PM
    Author     : Seid Abdu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <title>Booking</title>
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
        <section class="container">
            <form:form modelAttribute="newBooking"  class="form-horizontal"  >
                <fieldset>
                    <legend>Reserve Room</legend>
		 <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                    <div class="form-group">                     
  
                        <label class="control-label col-lg-2 col-lg-2" for="catagoryId">Room Catagory  </label>

                        <div class="col-lg-10">
                            <form:input id="catagoryId" path="catagoryId" type="text" class="form:input-large"/>
                        </div>
                    </div>
                                     
                                         
                    
                             
                             
                     

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="roomNumber">Room Number</label>
                        <div class="col-lg-10">
                         
                             <form:select path="roomNumber">
                        <form:options items="${newBooking.fnames}" />
                       </form:select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="customerId">Customer Id</label>
                        <div class="col-lg-10">
                           
                            <form:input id="customerId" path="customerId" type="text" class="form:input-large"/>
                        </div>
                    </div>  
                        <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="checkin">Check In Date</label>
                        <div class="col-lg-10">
                           
                            <form:input id="checkin" path="checkin" type="date" class="form:input-large"/>
                        </div>
                    </div> 
                         <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="checkout">Check Out Date</label>
                        <div class="col-lg-10">
                           
                            <form:input id="checkout" path="checkout" type="date" class="form:input-large"/>
                        </div>
                    </div> 
                                       
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary" value ="PROCEED BOOKING"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>      
        
        <p>
               <a href='<c:url value="/RoomCatagories"/>' class="btn btn-primary">
                  <span class="glyphicon-info-sign glyphicon">Go To Booking Details </span>
               </a>
    </p>
        
    </body>
</html>
