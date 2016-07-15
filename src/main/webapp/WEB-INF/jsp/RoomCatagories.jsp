<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
        <title>Room Categories</title>
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
            <div class="row">
                <c:forEach items="${test}" var="roomCatagory"> 
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <img src='<c:url value="/resources/images/${roomCatagory.catagoryId}.jpg"></c:url>' alt="image"  style = "width:100%"/>
                            <div class="caption">
                                
                                <h2>${roomCatagory.catagoryName}</h2>
                                 <h3>${roomCatagory.catagoryId}</h3>
                                <p>${roomCatagory.roomPrice} USD</p>
                                
                                <p>
                                    <a href='<c:url value="RoomCatagories/product?id=${roomCatagory.catagoryId}"/>' class="btn btn-primary">
                                        <span class="glyphicon-info-sign glyphicon">
                                            Details
                                        </span>
                                    </a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
           
        </section>
    </body>
</html>