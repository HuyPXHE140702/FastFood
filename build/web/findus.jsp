<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

        <title> Contact Us </title>

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
        <link type="text/css" rel="stylesheet" href="css/styleBlog_1.css">
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
        <div class="wrap">
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <div class="content-contact">
                            <h1>Contact Us</h1>
                            </br>
                            <div class="info">

                                <div class="border-contact"></div>
                                <div id="error-message" class="alert-error closeDialog">
                                    <button type="button" class="close" onclick="closeDialog()">×</button>
                                    <span id="content-message">We could not understand the email address.</span>
                                </div>
                                <c:if test="${success != null}">
                                    <div id="success-message" class="alert-success closeDialog">
                                        Thanks for your message.
                                    </div>
                                </c:if>

                            </div>
                            <form id="sendMessage">
                                <div class="send">
                                    <p>Write your message here. Fill out the form:</p>
                                    <div class="row1">
                                        <input type="text" name="name" placeholder="Write your name here" required="">
                                        <input type="email" name="email" placeholder="Write your email here" required="">
                                    </div>
                                    <div class="row2">
                                        <textarea name="message" placeholder="Write your message here" required="" style="min-height: 500px"></textarea>
                                    </div>
                                    <input type="submit" id="submit" name="submit" value="Send - Click here">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>      
            <%@include file="component/footer.jsp" %>
        </div>

        <script src="js/sendMessage.js"></script>
        <script src="js/menu.js"></script>

    </body>
</html>
