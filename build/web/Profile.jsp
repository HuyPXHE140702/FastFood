<%--
* Copyright(C) 2005, FPT University
* Java MVC:
*  Fast Food Shop
*
* Record of change:
* DATE            Version             AUTHOR                   DESCRIPTION
* 2022-10-02      1.0                 NamVNHE140527            First Implement
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

    </head>
    <body>

        <section style="background-color: #eee;">
            <div class="container py-5">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">
                            <ol class="breadcrumb mb-0">
                                <li class="breadcrumb-item"><a href="home" style="text-decoration: none">Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">User Profile</li>
                            </ol>
                        </nav>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="card mb-4">
                            <div class="card-body text-center">
                                <img src="https://1.bp.blogspot.com/-r8taaC_nv5U/XngOYFjbRVI/AAAAAAAAZnc/QjGkkHS78GMm6CocQ1OqrWGgQTkG1oQNACLcBGAsYHQ/s1600/Avatar-Facebook%2B%25281%2529.jpg" alt="avatar"
                                     class="rounded-circle img-fluid" style="width: 150px;">
                                <h5 class="my-3">${profile.displayName}</h5>
                                <div class="d-flex justify-content-center mb-2">
                                    <a href="#editprofile" data-toggle="modal"  class="btn btn-outline-primary ms-1">Edit Profile</a>
                                    <a href="#change-pass" data-toggle="modal"  class="btn btn-outline-primary ms-1">Change Password</a>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="col-lg-8">
                        <div class="card mb-4">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Username</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0">${profile.username}</p>
                                    </div>
                                </div>

                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p  class="mb-0">Password</p>
                                    </div>
                                    <div  class="col-sm-9">
                                        <input type="password" value="${profile.password}" style="border: 0 ; background-color: white" disabled="">
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Full Name</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0">${profile.displayName}</p>
                                    </div>
                                </div>

                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Phone</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0">${profile.phone}</p>
                                    </div>
                                </div>
                                <hr>

                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Role</p>
                                    </div>
                                    <c:if test="${profile.isAdmin == 1}">
                                        <div class="col-sm-9">
                                            <p class="text-muted mb-0">Administrator</p>
                                        </div>
                                    </c:if>
                                    <c:if test="${profile.isCustomer == 1}">
                                        <div class="col-sm-9">
                                            <p class="text-muted mb-0">Customer</p>
                                        </div>
                                    </c:if>
                                    <c:if test="${profile.isShipper == 1}">
                                        <div class="col-sm-9">
                                            <p class="text-muted mb-0">Shipper</p>
                                        </div>
                                    </c:if>
                                    <c:if test="${profile.isSeller == 1}">
                                        <div class="col-sm-9">
                                            <p class="text-muted mb-0">Seller</p>
                                        </div>
                                    </c:if>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <p class="mb-0">Address</p>
                                    </div>
                                    <div class="col-sm-9">
                                        <p class="text-muted mb-0">${profile.address}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Edit profile -->
        <div id="editprofile" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="edit-profile" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Profile</h4>
                            <button style="background-color: white ; border: 0 ; font-weight: 700" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>                    

                        <div class="modal-body">	
                            <a hidden >
                                <input value="${profile.id}" name="id" type="text" class="form-control" required>
                            </a>

                            <div class="form-group">
                                <label>Name</label>
                                <input maxlength="32" pattern="^[a-zA-Z]+(([',. -][a-zA-Z])?[a-zA-Z]*)*$" value="${profile.displayName}" name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Phone</label>
                                <input pattern="^0[0-9]{9}" value="${profile.phone}" title="Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0" name="phone" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <input maxlength="32" pattern="^[a-zA-Z0-9]+((,?[',. -][a-zA-Z0-9])?[a-zA-Z0-9]*\.?)*$" value="${profile.address}" name="address" type="text" class="form-control" required>
                            </div>       
                            <div class="form-group" hidden>
                                <label>Password</label>

                                <div class="row " >
                                    <div class="col-sm-11"><input value="${profile.password}" class="form-control"   id="upass" type="password" name="userpass" required></div>

                                    <div style="margin-left: -13px;margin-top: 8px" class="col-sm-1 "> <i  id="toggleBtn" onclick="togglePassword('upass', 'toggleBtn')"  class="fas fa-eye"></i></div> 

                                </div>
                            </div>
                        </div>

                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" style="background:#f5f5f5" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" onclick="alert('Edit Profile Successfully')" value="Edit">
                        </div>

                    </form>
                </div>
            </div>
        </div>
        <!-- End edit profile -->

        <!-- change password -->
        <div id="change-pass" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="change-pass" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Change password</h4>
                            <h6 style="color: #be123c">${error}</h6>
                            <button style="background-color: white ; border: 0 ; font-weight: 700" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>                      
                        <script>
                            function togglePassword(bypass, bytoggleBtn) {
                                var password = document.getElementById(bypass);
                                var toggleBtn = document.getElementById(bytoggleBtn);
                                toggleBtn.onclick = (() => {
                                    if (password.type === "text") {
                                        password.type = "password";
                                        toggleBtn.classList.remove("bi bi-eye-slash-fill");
                                    } else {
                                        password.type = "text";
                                        toggleBtn.classList.add("bi bi-eye-slash-fill");
                                    }
                                });
                            }

                            function checkChange() {
                                var oldpass = document.getElementById('oldpass');
                                var upass = document.getElementById('upass');
                                var newpass = document.getElementById('newpass');
                                var confirmedpass = document.getElementById('confirmedpass');
                                var changeBtn = document.getElementById('change');
                                if (oldpass.value === upass.value) {
                                    if (oldpass.value !== newpass.value) {
                                        if (confirmedpass.value === newpass.value) {
                                            alert('Change Password Successfully');
                                            changeBtn.type = "submit";
                                        } else {
                                            alert('New password is not matched');
                                        }
                                    } else {
                                        alert('New password must be different from Old password');
                                    }
                                } else {
                                    alert('Old password is not matched');
                                }
                            }
                        </script>

                        <div class="modal-body">	
                            <a hidden >
                                <input value="${profile.id}" name="id" type="text" class="form-control" required>
                            </a>
                            <div class="form-group" hidden="">
                                <label>Password</label>

                                <div class="row " >
                                    <div class="col-sm-11"><input value="${profile.password}" class="form-control"   id="upass" type="password" name="userpass" required></div>

                                    <div style="margin-left: -13px;margin-top: 8px" class="col-sm-1 "> <i  id="toggleBtn" onclick="togglePassword('upass', 'toggleBtn')"  class="fas fa-eye"></i></div> 

                                </div>
                            </div>
                            <div class="form-group">
                                <label>Old Password</label>
                                <div class="row ">
                                    <h6 style="color: #be123c">${error1}</h6>
                                    <div class="col-sm-11"><input maxlength="32" minlength="3" pattern="[a-z0-9]+$" value="" class="form-control" id="oldpass" type="password" name="oldpass" required></div>
                                    <div style="margin-left: -13px;margin-top: 8px" class="col-sm-1 "> <i  id="toggleBtn1" onclick="togglePassword('oldpass', 'toggleBtn1')"  class="fas fa-eye"></i></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>New Password</label>
                                <div class="row ">
                                    <h6 style="color: #be123c">${error2}</h6>
                                    <div class="col-sm-11"><input maxlength="32" minlength="3" pattern="[a-z0-9]+$" value="" class="form-control" id="newpass" type="password" name="newpass" required></div>
                                    <div style="margin-left: -13px;margin-top: 8px" class="col-sm-1 "> <i  id="toggleBtn2" onclick="togglePassword('newpass', 'toggleBtn2')"  class="fas fa-eye"></i></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Confirm Password</label>
                                <div class="row ">
                                    <div class="col-sm-11"><input maxlength="32" minlength="3" pattern="[a-z0-9]+$" value="" class="form-control" id="confirmedpass" type="password" name="confirmedpass" required></div>
                                    <div style="margin-left: -13px;margin-top: 8px" class="col-sm-1 "> <i id="toggleBtn3" onclick="togglePassword('confirmedpass', 'toggleBtn3')"  class="fas fa-eye"></i></div>
                                </div>
                            </div>
                        </div>

                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" style="background:#f5f5f5" data-dismiss="modal" value="Cancel">

                            <input id="change" type="button" onclick="checkChange()" class="btn btn-success" value="Change">
                        </div>

                    </form>
                </div>
            </div>
        </div>
        <!-- change password -->


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
