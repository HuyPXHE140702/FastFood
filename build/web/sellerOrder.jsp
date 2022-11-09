

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
    <style>
        a:link {
            color: black;
            background-color: transparent;
            text-decoration: none;
        }
        s
    </style>
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
                            <!--                            <div style="font-size: 30px;font-weight: 500; margin-left: 1000px" class="d-flex justify-content-end">Money:</div>-->
                        </div>                   

                    </div>


                    <h2>
                        List Order 
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

                <form class="form-inline" action="SellerOrder" method="POST">
                    <section class="intro">
                        <a hidden >
                            <input value="${sessionScope.acc.id}"  name="idSeller">
                        </a>
                        <div style="font-size: 30px;font-weight: 500" class="d-flex justify-content-end">Receive Money: $${receivemoney}</div>
<!--                        <div class="mask d-flex align-items-center h-100" style="background-color: rgba(194, 185, 179, 0.2);">
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
                        </div>-->

                    </section>
                </form>



                <div class="filters-content">

                </div>  
                <div class="row grid">
                    <form action="ActiveOrder" method="POST">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col" >Order Id</th>
                                    <th scope="col">Customer Name</th>
                                    <th scope="col">Phone</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">total Price</th>
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${listfood}" var="f">

                                    <tr>
                                        <td >${f.orderid}</td>
                                        <td>${f.name}</td>
                                        <td>${f.phone}</td>
                                        <td>${f.address}</td>                                       
                                        <td>${f.totalprice}</td>                                    
                                        <td>             <a class="btn btn-outline-light" href="ActiveOrder?OrderID=${f.orderid}" >Active</a>
                                        </td>
                                        <!-- <li class="nav-item"><a class="nav-link" href="View.jsp">View</a></li>-->

                                    </tr>

                                </c:forEach>
                            </tbody>
                        </table>
                    </form>

                </div>
            </div>

            <div class="btn-box">
                <c:forEach begin="1" end="${endP}" var="b">
                    <a class="page-item btn btn-outline-dark ${b==page?"active":""}" class="page-link" href="SellerOrder?index=${b}" style="text-decoration: none">${b}</a>
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