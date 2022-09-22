<%-- 
    Document   : header
    Created on : Jun 1, 2022, 10:36:10 PM
    Author     : dmanh
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Register</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="css/styles-1.css" rel="stylesheet" />
    </head>
    <body >
        <header class="header_section " style="margin-top: -1.5rem;margin-bottom: -1.5rem">
            <div class="container ">
                <nav class="navbar navbar-expand-lg custom_nav-container ">
                    <a class="navbar-brand" href="home" style="text-decoration: none ">
                        <span style="font-size: 45px" >
                            FastFood
                        </span>
                    </a>

                    <div class="collapse navbar-collapse" id="navbarScroll">
                        <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px; padding-left: 5%">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page"  href="home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="menu">Menu</a>
                            </li>
                            <c:if test="${sessionScope.acc.isAdmin == 1}">
                                <li class="nav-item">
                                    <a class="nav-link" href="admin">Manage Account</a>
                                </li>
                            </c:if>

                            <c:if test="${sessionScope.acc.isShipper == 1}">
                                <li class="nav-item">
                                    <a class="nav-link" href="homeshipper">List Order Ship</a>
                                </li>
                            </c:if>


                            <c:if test="${sessionScope.acc.isSeller == 1}">
                                <li class="nav-item">
                                    <a class="nav-link" href="SellerFood">Seller</a>
                                </li>
                            </c:if>

                        </ul>
                        <div class="d-flex" >
                            <a class="btn btn-light " style="background-color: white"  href="carts">
                                <i class="bi-cart-fill me-1"></i>
                                Cart
                                 
                           
                                    <span id="cart_number" class="badge bg-dark text-white ms-1 rounded-pill">${sessionScope.carts.size()}</span>    
                                

                            </a>
                        </div>
                        <c:if test="${sessionScope.acc == null}">
                            <form class="d-flex" style="margin-left: 2%">
                                <button class="btn btn-outline-dark btn-secondary" >
                                    <a href="login.jsp" style="text-decoration: none; color: white">Login</a>
                                </button>
                            </form>
                        </c:if>
                        <c:if test="${sessionScope.acc != null}">
                            <li class="nav-item dropdown" style="margin-top: -3%" >
                                <a class="nav-link dropdown-toggle"  id="navbarScrollingDropdown" role="button" data-bs-toggle="dropdown"  style="color: white; pointer-events:">
                                    <span style="color:  white">${sessionScope.acc.displayName}</span>  <i class="bi bi-person-circle" style="font-size: 150%;margin-left: 5% ; color: white"></i>
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
                                    <li><a class="dropdown-item" href="profile?id=${sessionScope.acc.id}">Profile</a></li>
<!--                                     <li><a class="dropdown-item" href="viewBill?idCustomer=${sessionScope.acc.id}">View Bill</a></li>-->
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="logout">Logout</a></li>
                                    
                                </ul>
                            </li>
                        </c:if>
                    </div>
                </nav>
            </div>
        </header>
    </body>
</html>