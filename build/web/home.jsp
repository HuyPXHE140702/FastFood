<%-- 
    Document   : home
    Created on : Jun 1, 2022, 10:23:44 PM
    Author     : dmanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

        <title> FastFood </title>
        <!-- all for blog  -->

        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/styleblog.css">
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

    <body >

        <div class="hero_area ">
            <div class="bg-box ">
                <img src="images/bg_2.jpg" alt="">
            </div>
            <!-- header section strats -->

            <div >
                <%@include file="component/header.jsp" %>
            </div>


            <!-- end header section -->
            <!-- slider section -->

            <section class="slider_section ">
                <div id="customCarousel1" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-7 col-lg-6 ">
                                        <div class="detail-box" style="margin-bottom: 35px">
                                            <h1 style="color: white;font-size: 80px">
                                                Fast Food Restaurant
                                            </h1>
                                            <p style="width: 100% " >
                                                Present in more than 118 countries with a chain of 35,000 
                                                restaurants on all continents, every day, Global FastFood 
                                                serves more than 70 million consumers, not only ensuring to bring them delicious, safe and hygienic meals. 
                                                , but also make them satisfied with FastFood's service.
                                            </p>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item ">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-7 col-lg-6 ">
                                        <div class="detail-box" style="margin-bottom: 35px">
                                            <h1 style="color: white;font-size: 80px">
                                                Fast Food Restaurant
                                            </h1>
                                            <p style="width: 100% ">
                                                Grasping the needs of Vietnamese consumers today, we aim to serve fast but hygienic, nutritious meals with professional service.
                                            </p>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-7 col-lg-6 ">
                                        <div class="detail-box" style="margin-bottom: 35px">
                                            <h1 style="color: white;font-size: 80px">
                                                Fast Food Restaurant
                                            </h1>
                                            <p style="width: 100% ">
                                                FastFood Vietnam is committed to applying the standards of FastFood globally, which are: Quality, Service, Cleanliness & Values.
                                            </p>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="container">
                        <ol class="carousel-indicators">
                            <li data-target="#customCarousel1" data-slide-to="0" class="active"></li>
                            <li data-target="#customCarousel1" data-slide-to="1"></li>
                            <li data-target="#customCarousel1" data-slide-to="2"></li>
                        </ol>
                    </div>
                </div>

            </section>
            <!-- end slider section -->
        </div>
        <!-- end slider section -->
    </div>

    <br>

    <!-- food section -->


    <section class="food_section layout_padding-bottom">
        <div class="container">
            <div class="heading_container heading_center  text-center heading-section ftco-animate">
                <span class="subheading">Specialties</span>
                <strong style="font-size: 240%">Our Menu</strong>
            </div>

            <!--            <ul class="filters_menu">
                            <li class="active" data-filter="*">All</li>
                            <li data-filter=".burger">Burger</li>
                            <li data-filter=".pizza">Pizza</li>
                            <li data-filter=".pasta">Pasta</li>
                            <li data-filter=".fries">Fries</li>
                        </ul>-->


            <div class="filters-content">
                <div class="row grid ftco-animate">
                    <c:forEach items="${listspecialfood}" var="f">
                        <div class="col-sm-6 col-lg-4 all pizza">
                            <div class="box">

                                <div>
                                    <div class="img-box">
                                        <a href="DetailFood?foodid=${f.foodid}">
                                            <img style="background: #f1f2f3" src="${f.image}" alt="">
                                        </a>  
                                    </div >
                                    <div class="detail-box">
                                        <h5 style="color: white">
                                            ${f.foodname}
                                        </h5>
                                        <p style="min-height: 80px">
                                            ${f.description}
                                        </p>
                                        <div class="options">
                                            <h6 style="font-size: 20px">
                                                $${f.unitprice}
                                            </h6>
                                            <!-- add to cart o day -->
                                            <a href="add-to-cart?foodid=${f.foodid}" style="background-color: #ffdf9a">
                                                <i style="color: black " class="bi bi-cart2" ></i>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="btn-box">
                        <a href="menu" style="text-decoration: none">
                            View Menu
                        </a>
                    </div>
                </div>
            </div> 
        </div>
    </section>
    <section class="food_section layout_padding-bottom ftco-animate">
        <div class="container ">
            <div class="heading_container heading_center  text-center heading-section ftco-animate">
                <span class="subheading">New</span>
                <!--                <h2>
                                    Newest Food
                                </h2>-->

                <strong style="font-size: 240%">Newest Food</strong>
            </div>
            <div class="filters-content">
                <div class="row grid">
                    <c:forEach items="${listnewestfood}" var="f">
                        <div class="col-sm-6 col-lg-4 all pizza">
                            <div class="box">

                                <div>
                                    <div class="img-box">
                                        <a href="DetailFood?foodid=${f.foodid}">
                                            <img style="background: #f1f2f3" src="${f.image}" alt="">
                                        </a>  
                                    </div >
                                    <div class="detail-box">
                                        <h5 style="color: white">
                                            ${f.foodname}
                                        </h5>
                                        <p style="min-height: 80px">
                                            ${f.description}
                                        </p>
                                        <div class="options">
                                            <h6 style="font-size: 20px">
                                                $${f.unitprice}
                                            </h6>
                                            <!-- add to cart o day -->
                                             <a href="add-to-cart?foodid=${f.foodid}" style="background-color: #ffdf9a">
                                                <i style="color: black " class="bi bi-cart2" ></i>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="btn-box">
                        <a href="menu" style="text-decoration: none">
                            View Menu
                        </a>
                    </div>
                </div>
            </div> 
        </div>
    </section> 
    <!-- end food section -->



    <!--    <section class="client_section layout_padding-bottom">
            <div class="container">
                <div class="heading_container heading_center psudo_white_primary mb_45">
                    <h2>
                        What Says Our Customers
                    </h2>
                </div>
                <div class="carousel-wrap row ">
                    <div class="owl-carousel client_owl-carousel">
                        <div class="item">
                            <div class="box">
                                <div class="detail-box">
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam
                                    </p>
                                    <h6>
                                        Moana Michell
                                    </h6>
                                    <p>
                                        magna aliqua
                                    </p>
                                </div>
    
                            </div>
                        </div>
                        <div class="item">
                            <div class="box">
                                <div class="detail-box">
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam
                                    </p>
                                    <h6>
                                        Mike Hamell
                                    </h6>
                                    <p>
                                        magna aliqua
                                    </p>
                                </div>
    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </section>-->

    <!-- end client section -->  
    <!-- blog section -->      
    <section class="ftco-section bg-light">
        <div class="container">
            <div class="row justify-content-center mb-5 pb-2">
                <div class="col-md-7 text-center heading-section ftco-animate">
                    <span class="subheading">Blog</span>

                    <strong style="font-size: 240%">Recent Blog</strong>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 ftco-animate">
                    <div class="blog-entry">
                        <a class="block-20" style="background-image: url('images/Fast-Food-and-Junk-Food-4-1.jpg');">
                        </a>
                        <div class="text px-4 pt-3 pb-4">
                            <div class="meta">
                                <div><a href="#">June 3, 2022</a></div>
                                <div><a href="#">Admin</a></div>
                            </div>
                            <h3 class="heading"><a target="_blank" href="https://foodtolive.com/healthy-blog/fast-food-junk-food-difference/">Fast Food and Junk Food: Is There Any Difference</a></h3>
<!--                            <p class="clearfix">
                                <a target="_blank"  href="https://foodtolive.com/healthy-blog/fast-food-junk-food-difference/" class="float-left read btn btn-primary">Read more</a>
                                                            <a href="#" class="float-right meta-chat"><span class="fa fa-comment"></span> 3</a>
                            </p>-->
                        </div>
                    </div>
                </div>
                <div class="col-md-4 ftco-animate">
                    <div class="blog-entry">
                        <a class="block-20" style="background-image: url('images/565b3881692c5f5c4402fa8ebc0e4675_wendys-Salads.jpg');">
                        </a>
                        <div class="text px-4 pt-3 pb-4">
                            <div class="meta">
                                <div><a href="#">June 3, 2022</a></div>
                                <div><a href="#">Admin</a></div>
                            </div>
                            <h3 class="heading"><a target="_blank" href="https://www.hungryforever.com/recreate-wendys-salads-at-home/">Recreate Wendy’s Salads at Home</a></h3>
                            <br>
<!--                            <p class="clearfix">
                                <a target="_blank"  href="https://www.hungryforever.com/recreate-wendys-salads-at-home/" class="float-left read btn btn-primary">Read more</a>
                                                            <a href="#" class="float-right meta-chat"><span class="fa fa-comment"></span> 3</a>
                            </p>-->
                        </div>
                    </div>
                </div>
                <div class="col-md-4 ftco-animate">
                    <div class="blog-entry">
                        <a  class="block-20" style="background-image: url('images/blog_04_2-1170x725.jpg');">
                        </a>
                        <div class="text px-4 pt-3 pb-4">
                            <div class="meta">
                                <div><a href="#">June 3, 2022</a></div>
                                <div><a href="#">Admin</a></div>
                            </div>
                            <h3 class="heading"><a target="_blank" href="https://hotdogonline.com/2019/09/11/your-perfect-burger-2/">Choose Your Perfect Burger</a></h3>
                            <br>
<!--                            <p class="clearfix">
                                <a target="_blank"  href="https://hotdogonline.com/2019/09/11/your-perfect-burger-2/" class="float-left read btn btn-primary">Read more</a>
                                <a href="#" class="float-right meta-chat"><span class="fa fa-comment"></span> 3</a>
                            </p>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- end blog section -->      
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
    <!-- Core theme JS for Blog-->
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery-migrate-3.0.1.min.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.stellar.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/scrollax.min.js"></script>
    <script src="js/main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</body>

</html>
