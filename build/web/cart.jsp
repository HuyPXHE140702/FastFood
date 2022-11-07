<%-- 
* Copyright(C) 2005, FPT University
* Java MVC:
*  Fast Food Shop
*
* Record of change:
* DATE            Version             AUTHOR                   DESCRIPTION
* 2022-10-12      1.0                 NamVNHE140527            First Implement
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Basic -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" href="images/favicon.png" type="">

        <title> Cart </title>

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
        <!-- responsive style -->
        <link href="css/responsive.css" rel="stylesheet" />
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="css/styles-1.css" rel="stylesheet" />
    </head>
    <body class="sub_page">  
        <div class="hero_area">
            <div class="bg-box">
                <img src="images/hero-bg.jpg" alt="">
            </div>
            <!-- header section strats -->
            <%@include file="component/header.jsp" %>
            <!-- end header section -->
        </div>    
        <section class="py-5">
            <div class="container" style="min-height: 1000px">
                <c:choose>
                    <c:when test="${sessionScope.carts == null || sessionScope.carts.size()== 0}">
                        <h1 style="text-align: center">List Cart is Empty</h1>
                    </c:when>
                    <c:otherwise>
                        <br>

                        <br>
                        <h1>Shopping Cart</h1>

                        <table class="table" >
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total Price</th>
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${carts}" var="C">
                                <form action="update-quantity" method="get">
                                    <tr>                               
                                    <input type="hidden" name="foodid" value="${C.value.product.foodid}">
                                    <th scope="row"><c:set var="count" value="${count+1}"></c:set>${count}</th>
                                    <td><img style="width: 50px;height: 50px" src="${C.value.product.image}"></td>
                                    <td>${C.value.product.foodname}</td>
                                    <td>${C.value.product.unitprice} </td>
                                    <td ><input  onchange="this.form.submit()" onkeypress="return isNumberKey(event)" min="1"  name="quantity" style="width: 50px" min="1" type="number" value="${C.value.quantity}"></td>
                                    <script>
                                        $(document).ready(function () {
                                            $('.quantity-input').bind("cut copy paste drag drop", function (e) {
                                                e.preventDefault();
                                            });
                                        });
                                        function isNumberKey(e) {
                                            var charCode = (e.which) ? e.which : e.keyCode;
                                            if (charCode > 31 && (charCode < 48 || charCode > 57))
                                                return false;
                                            return true;
                                        }
                                    </script>
                                    <td>${C.value.product.unitprice*C.value.quantity}</td>
                                    <td>
                                        <a href="delete-cart?foodid=${C.value.product.foodid}" onclick="return confirm('Are you sure you want to delete this item?');" class="btn btn-outline-danger "
                                           style="background-color: white; color: red"  >
                                            <i class="bi bi-trash"></i> Delete
                                        </a>
                                    </td>

                                    </tr>
                                </form>
                            </c:forEach>

                            </tbody>
                        </table>
                        <h2>Total Amount: $${totalAmount}</h2>
                        <a href="checkOut" class="btn btn-success" style="color: white">Check out</a>
                    </c:otherwise>
                </c:choose>

            </div>
        </section>
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
