
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

                <br>
                <h6 style="color: #be123c">${msg}</h6>
               <h6 style="color: #be123c">${error}</h6>
                <div>
                    <a href="#addEmployeeModal" class="btn btn-success " data-toggle="modal" ><i class="bi bi-plus-circle-fill"></i> Add</a>
                </div>
                <br>
                <h1>List Account</h1>

                <table class="table" >
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Username</th>
                            <th scope="col">Password</th>
                            <th scope="col">Name</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Address</th>
                            <th scope="col">Role</th>
                            <th scope="col">Status</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>

                            <c:forEach items="${listAccounts}" var="a">

                                <th hidden scope="row">${a.id}</th>
                                <th scope="row"><c:set var="count" value="${count+1}"></c:set>${count}</th>
                                <td>${a.username}</td>
                                <td>${a.password}</td>
                                <td>${a.displayName}</td>
                                <td>${a.phone}</td>
                                <td>${a.address}</td>
                                <c:if test="${a.isAdmin==1}">
                                    <td>Admin</td>   
                                </c:if>
                                <c:if test="${a.isCustomer == 1}">
                                    <td>Customer</td>
                                </c:if>
                                <c:if test="${a.isSeller==1}">
                                    <td>Seller</td>
                                </c:if>
                                <c:if test="${a.isShipper==1}">
                                    <td>Shipper</td>
                                </c:if>
                                <td>
                                    <c:if test="${a.isShipper==1}">
                                        <c:if test="${a.status ==1}">
                                            <a href="delete-shipper?accountid=${a.id}" class="btn btn-outline-danger">Block</a> 
                                        </c:if>
                                        <c:if test="${a.status ==0}">
                                            <a href="insert-shipper?accountid=${a.id}" class="btn btn-outline-danger">Active</a> 
                                        </c:if>

                                    </c:if>
                                    <c:if test="${ a.isSeller==1}">
                                        <c:if test="${a.status ==1}">
                                            <a href="delete-seller?accountid=${a.id}" class="btn btn-outline-danger">Block</a> 
                                        </c:if>
                                        <c:if test="${a.status ==0}">
                                            <a href="insert-seller?accountid=${a.id}" class="btn btn-outline-danger">Active</a>
                                        </c:if>

                                    </c:if>
                                </td>

                                <td>

                                    <c:if test="${a.isShipper==1 || a.isSeller==1 || a.isCustomer==1}">
                                        <a href="loadAccount?accountid=${a.id}" class="btn btn-outline-dark"  ><i class="bi bi-pencil"></i> Edit</a>
                                        <a href="delete-account?accountid=${a.id}" class="btn btn-outline-dark"><i class="bi bi-trash"></i></i> Delete</a>
                                    </c:if>
                                </td>




                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </section>
        <!-- Add new Account -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="add-account" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add new Account</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">	
                            <div class="form-group">
                                <label>User Name</label>
                                <input  pattern="[a-z0-9]+$"  name="username" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input  pattern="[a-z0-9]+$"  name="password" type="password" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input pattern="[^!@#$%^&*()_+\-=\[\]{};':\\|,.<>\/?]+$" name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Phone</label>
                                <input pattern="^0[0-9]{9}" title="Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0" name="phone" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <input  name="address" type="text" class="form-control" required>
                            </div>       
                            <div class="form-group">
                                <label>Role</label>
                                <select name="role" class="form-select" aria-label="Default select example">
                                    <option value="1">Customer</option>
                                    <option value="2">Seller</option>
                                    <option value="3">Shipper</option>

                                </select>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" style="background:#f5f5f5" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- End add new account -->


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
