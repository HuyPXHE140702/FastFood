<%-- 
    Document   : login
    Created on : Sep 29, 2022, 10:05:23 PM
    Author     : vinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Register</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>
    <body>
        <!-- Section: Design Block -->
        <section class="text-center">
            <!-- Background image -->
            <div class="p-5 bg-image" style="
                 background-image: url('images/head.png');
                 height: 250px;
                 "></div>
            <!-- Background image -->

            <div class="card shadow-5-strong" style="
                 margin-top: -170px;
                 margin-left: 30%;
                 margin-bottom: 10px;
                 background: hsla(0, 0%, 100%, 0.8);
                 backdrop-filter: blur(30px);
                 width: 40%;
                 ">
                <div class="card-body py-5 px-md-5">

                    <div class="row d-flex justify-content-center">
                        <div class="col-lg-8">
                            <h2 class="fw-bold mb-5">Sign up now</h2>

                            <form action="register" method="post">
                                <!-- 2 column grid layout with text inputs for the first and last names -->

                                <div class="row">
                                    <div class="col-md-6 mb-4">
                                        <div class="form-outline">
                                            <input pattern="[^!@#$%^&*()_+\-=\[\]{};':\\|,.<>\/?]+$" type="text" name="firstname" class="form-control" placeholder="First name"  required/>
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-4">
                                        <div class="form-outline">
                                            <input pattern="[^!@#$%^&*()_+\-=\[\]{};':\\|,.<>\/?]+$" type="text" name="lastname" class="form-control" placeholder="Last name" required />
                                        </div>
                                    </div>
                                </div>

                                <!-- Username input -->
                                <div class="form-outline mb-4">
                                    <input pattern="[a-z0-9]+$" type="text" name="username" class="form-control" placeholder="User name" required />
                                </div>

                                <!-- Phone input -->
                                <div class="form-outline mb-4">
                                    <input pattern="^0[0-9]{9}" title="Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0"  type="text" name="phone" class="form-control" placeholder="Phone number" required/>
                                </div>
                                <!-- Address input -->
                                <div class="form-outline mb-4">
                                    <input  type="text" name="address" class="form-control" placeholder="Address" required/>
                                </div>
                                <!-- Password input -->
                                <div class="form-outline mb-4">
                                    <input  pattern="[a-z0-9]+$" type="password" name="password" class="form-control" placeholder="Password" required/>
                                </div>

                                <!-- Submit button -->

                                <button type="submit"   style="color: white" class="btn btn-primary btn-block mb-4">
                                    Sign up
                                </button>

                                <!-- msg is wrong username and pass -->

                                <p class="text-danger">${msg}</p>
                                <a href="login.jsp">I did have a account</a>
                            </form>
                            <!--             Register buttons 
                            -->                                            <div class="text-center">
                                <br>
                                <button type="button" class="btn btn-link btn-floating mx-1">
                                    <i class="bi bi-facebook"></i>
                                </button>

                                <button type="button" class="btn btn-link btn-floating mx-1">
                                    <i class="bi bi-google"></i>
                                </button>

                                <button type="button" class="btn btn-link btn-floating mx-1">
                                    <i class="bi bi-twitter"></i>
                                </button>

                                <button type="button" class="btn btn-link btn-floating mx-1">
                                    <i class="bi bi-github"></i>
                                </button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Section: Design Block -->
    </body>
</html>