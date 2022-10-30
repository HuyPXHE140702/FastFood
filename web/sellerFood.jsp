
<%-- 
Document   : menu
Created on : Jun 2, 2022, 1:37:22 AM
Author     : dmanh
--%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <!-- Basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" href="images/favicon.png" type="">

        <title> FastFood </title>

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

        <!--owl slider stylesheet -->
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />
        <!-- nice select  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css" integrity="sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==" crossorigin="anonymous" />
        <!-- font awesome style -->
        <link href="css/font-awesome.min.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet" />
        <link href="css/styles-1.css" rel="stylesheet" />
        <!-- responsive style -->
        <link href="css/responsive.css" rel="stylesheet" />

    </head>

   <body class="sub_page">

        <div class="hero_area ">
            <div class="bg-box">
                <img src="images/hero-bg.jpg" alt="">
            </div>
            <!-- header section strats -->
            <%@include file="component/header.jsp" %>
            <!-- end header section -->
        </div>

        <!-- food section -->

        <section class="food_section layout_padding">
            <div class="container">
                <div class="heading_container heading_center">
                    <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
                        <div class="me-3">
                            <!--                        Search by ShipperID: <input type="select" class="btn-check"  > 
                                                    <input type="submit" value="Find">-->
                            <label class="btn btn-outline-dark"><a class="nav-link" href="SellerFood">List Product</a></label>
                            <label class="btn btn-outline-dark"><a class="nav-link" href="SellerOrder">List Order</a></label>
                        </div>                   

                    </div>
                    <br>
                    <br>
                    <h2>
                        List product
                    </h2>
                </div>
                <style>
                    html,
                    body,
                    .intro {
                        height: 100%;
                        width: 100%
                    }

                </style>

                <form class="form-inline" action="SellerFood" method="POST">
                    <section class="intro">

                        <div class="mask d-flex align-items-center h-100" style="background-color: rgba(194, 185, 179, 0.2);">
                            <div class="container">
                                <div class="card" >
                                    <div class="card-body p-4">
                                        <div class="row justify-content-center">
                                            <div class="col-lg-12 col-xl-10 d-lg-flex flex-row mb-lg-4 mb-xl-0">

                                                <div id="basic" class="form-outline form-white flex-fill me-lg-2 mb-3 mb-lg-0">
                                                    <input type="text" id="form1" class="form-control" name="searchName" style=" width: 100%;">           
                                                </div>                                    

                                            </div>
                                            <div class="col-lg-12 col-xl-2">
                                                <input class="btn btn-primary btn-rounded btn-block" type="submit" value="Search" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </section>
                </form>

                <div class="filters-content">
                    <div class="row grid">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Food Id</th>
                                    <th scope="col">FoodName</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">UnitPrice</th>
                                    <th scope="col">Description</th>
                                    
                                    <th scope="col">DateCreated</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${listfood}" var="f">

                                    <tr>
                                        <td>${f.foodid}</td>
                                        <td>${f.foodname}</td>
                                        <td><img  style="background: #f1f2f3 ; width: 110px " src="${f.image}" alt=""></td>
                                        <td>${f.quantity}</td>
                                        <td>${f.unitprice}</td>
                                        <td>${f.description}</td>                                                                               
                                        
                                        <td>${f.createdate}</td>

                                        <!-- <li class="nav-item"><a class="nav-link" href="View.jsp">View</a></li>-->
                                        </td>
                                    </tr>

                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="btn-box">
                <c:forEach begin="1" end="${endP}" var="b">
                    <a class="page-item btn btn-outline-dark ${b==page?"active":""}" class="page-link" href="SellerFood?index=${b}" style="text-decoration: none">${b}</a>
                </c:forEach>
            </div>

        </section>

        <!-- end food section -->

        <!-- footer section -->
        <%@include file="component/footer.jsp" %>
        <!-- footer section -->

        <!-- jQery -->
        <script src="js/jquery-3.4.1.min.js"></script>
        <!-- popper js -->
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
        </script>
        <!-- bootstrap js -->
        <script src="js/bootstrap.js"></script>
        <!-- owl slider -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
        </script>
        <!-- isotope js -->
        <script src="https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js"></script>
        <!-- nice select -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"></script>
        <!-- custom js -->
        <script src="js/custom.js"></script>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts-1.js"></script>

    </body>

</html>