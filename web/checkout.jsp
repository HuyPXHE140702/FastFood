<%-- 
* Copyright(C) 2005, FPT University
* Java MVC:
*  Fast Food Shop
*
* Record of change:
* DATE            Version             AUTHOR                   DESCRIPTION
* 2022-10-20      1.0                 NamVNHE140527            First Implement
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

        <title> Check Out </title>

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

                <div class="row">
                    <h3>Payment</h3>
                    <div class="col-md-8" style="border: 1px solid #ccc;border-radius: 5px ; padding: 1rem">
                        <h5>List Food</h5>

                        <table class="table" >
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total Price</th>
                                </tr>
                            </thead>
                            <tbody>

                                <c:forEach items="${carts}" var="C">
                                <form action="update-quantity" method="get">
                                    <tr>
                                    <input type="hidden" name="foodid" value="${C.value.product.foodid}">
                                    <th scope="row"><c:set var="count" value="${count+1}"></c:set>${count}</th>
                                    <td><img style="width: 70px" src="${C.value.product.image}"></td>
                                    <td>${C.value.product.foodname}</td>
                                    <td>${C.value.product.unitprice} </td>
                                    <td>${C.value.quantity}</td>
                                    <td>${C.value.product.unitprice*C.value.quantity}</td>
                                    </tr>
                                </form>
                            </c:forEach>

                            </tbody>
                        </table>
                        <h2>Total Amount: $${totalAmount}</h2>
                    </div>
                    <div class="col-md-4" style="border: 1px solid #ccc;border-radius: 5px ; padding: 1rem">
                        <h3>Billing Information</h3>
                        <form action="payment" method="POST">

                            <div class="mb-3">
                                <a hidden>
                                    <input value="${sessionScope.acc.id}" name="id" type="text" class="form-control" required>
                                </a>
                                <label for="name" class="form-label">Name</label>
                                <input pattern="[^!@#$%^&*()_+\-=\[\]{};':\\|,.<>\/?]+$" type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp" required>
                            </div>
                            <div class="mb-3">
                                <label for="phone" class="form-label">Phone</label>
                                <input pattern="^0[0-9]{9}" type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp" required> 
                            </div>
                            <div class="mb-3">
                                <label for="address" class="form-label">Address</label>
                                <input  type="text" class="form-control" id="address" name="address" aria-describedby="emailHelp" required>
                            </div>   
                            <div class="form-group row">
                                <div class="col-md-6">
                                    <button   class="btn btn-default btn-lg btn-block" style="background-color: #CDD0D2"><a style="color:white;text-decoration: none" href="carts">Cancel</a></button>
                                </div>
                                <div class="col-md-6">
                                    <button  type="submit" class="btn btn-success btn-lg btn-block" >Submit</button>
                                </div>
                            </div> 

                        </form>
                    </div>
                </div>



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

