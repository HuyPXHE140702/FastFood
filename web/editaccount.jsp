<%-- 
    Document   : profile
    Created on : Jun 5, 2022, 5:27:22 PM
    Author     : vinh
--%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Profile</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>
    <body>
        <section style="background-color: #eee;">
            <div class="container py-5">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">
                            <ol class="breadcrumb mb-0">
                                <li class="breadcrumb-item"><a href="admin" style="text-decoration: none">Admin</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Edit Account</li>
                            </ol>
                        </nav>
                    </div>
                </div>
                <form action="edit-account" method="POST">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="card mb-4">
                                <div class="card-body text-center">
                                    <img src="https://1.bp.blogspot.com/-r8taaC_nv5U/XngOYFjbRVI/AAAAAAAAZnc/QjGkkHS78GMm6CocQ1OqrWGgQTkG1oQNACLcBGAsYHQ/s1600/Avatar-Facebook%2B%25281%2529.jpg" alt="avatar"
                                         class="rounded-circle img-fluid" style="width: 150px;">
                                    <h5 class="my-3">${account.displayName}</h5>

                                </div>
                            </div>

                        </div>
                        <a hidden>
                            <input value="${account.id}" name="id" type="text" class="form-control" required>
                        </a>

                        <div class="col-lg-8">
                            <div class="card mb-4">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Username</p>
                                        </div>
                                        <div class="col-sm-9">
                                            <input pattern="[a-z0-9]+$" value="${account.username}" name="username" type="text" class="form-control" required>
                                        </div>
                                    </div>

                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Password</p>
                                        </div>
                                        <div class="col-sm-9">
                                            <input pattern="[a-z0-9]+$" value="${account.password}" name="password" type="password" class="form-control" required>
                                        </div>
                                    </div>

                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Full Name</p>
                                        </div>
                                        <div class="col-sm-9">
                                            <input pattern="[^!@#$%^&*()_+\-=\[\]{};':\\|,.<>\/?]+$"  value="${account.displayName}" name="name" type="text" class="form-control" required>
                                        </div>
                                    </div>

                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Phone</p>
                                        </div>
                                        <div class="col-sm-9">
                                            <input pattern="^0[0-9]{9}" title="Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0" value="${account.phone}" name="phone" type="text" class="form-control" required>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Role</p>
                                        </div>

                                        <div class="col-sm-9">
                                            <select name="role" class="form-select" aria-label="Default select example">
                                                <c:if test="${account.isAdmin ==1}">
                                                    <option value="0">Admin</option>
                                                    <option value="1">Customer</option>
                                                    <option value="2">Seller</option>
                                                    <option value="3">Shipper</option>
                                                </c:if>
                                                <c:if test="${account.isCustomer ==1}">
                                                    <option value="1">Customer</option>
                                                    <option value="2">Seller</option>
                                                    <option value="3">Shipper</option>
                                                </c:if>
                                                <c:if test="${account.isShipper ==1}">
                                                    <option value="3">Shipper</option>
                                                    <option value="1">Customer</option>
                                                    <option value="2">Seller</option>
                                                </c:if>
                                                <c:if test="${account.isSeller ==1}">
                                                    <option value="2">Seller</option>
                                                    <option value="3">Shipper</option>
                                                    <option value="1">Customer</option>
                                                </c:if>

                                            </select>
                                        </div>


                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <p class="mb-0">Address</p>
                                        </div>
                                        <div class="col-sm-9">
                                            <input pattern="[A-Za-z0-9_ ]+$" value="${account.address}" name="address" type="text" class="form-control" required>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 style="color: #be123c" class="mb-0">${error}</h6>
                                        </div>
                                        <div class="col-sm-9">
                                            <div class="d-flex justify-content-end">
                                                <a href="admin" type="button" class="btn btn-default" style="background:#f5f5f5"  >Cancel</a>
                                                <input style="margin-left: 10px" type="submit" class="btn btn-success" value="Edit">
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <h6 style="color: #be123c">${msg}</h6>
                                    <h6 style="color: #be123c">${error}</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </section>
    </body>
</html>