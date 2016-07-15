<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"  href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
    <script src="/OnLineHotelReservationSystem/resources/js/controllers.js"></script>
  
    <title>Booking Details</title>
     <style>
        
        .jumbotron{
        color: #FFFFFF;
        background-color: #CC3333;
       text-align: center;
        }
    </style>
  </head>
  <body>
    <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Booking-Details</h1>
          <p>All the selected Booking Details </p>
        </div>
      </div>
    </section>
    <section class="container" ng-app="cartApp">
      <div ng-controller="cartCtrl" ng-init="initCartId('${cartId}')">
         <p>${cartId} </p>
      
        
        <table class="table table-hover">
          <tr>
            <th>Booking Number</th>
            <th>ROOM PRICE</th>
            <th>CUSTOMER ID</th>
            <th>Room Catagory</th>
            <th>GRAND TOTAL PRICE</th>
            <th>Action</th>
          </tr>
          
          <tr >
            <td>{{cart.bookingNumber}}</td>
            <td>{{cart.price}}</td>
            <td>{{cart.customerId}}</td>
            <td>{{cart.catagoryId}}</td>
            <td>{{cart.grandTotal}}</td>
            <td><a href="#" class="label label-danger" ng-click="removeFromCart('${cartId}')"> <span
                  class="glyphicon glyphicon-remove" /></span> CANCEL BOOKING
              </a></td>
              
               
          </tr>
          <tr>
            <th></th>
            <th></th>
            <th>Grand Total</th>
            <th>{{cart.grandTotal}}</th>
            <th></th>
          </tr>
        </table>

        <a href="<spring:url value="/RoomCatagories" />" class="btn btn-default">
          <span class="glyphicon-hand-left glyphicon"></span> Continue Booking
        </a>
      </div>
    </section>

      
       
          
    
          
          
  </body>
</html>