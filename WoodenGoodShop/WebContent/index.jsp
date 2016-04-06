<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Wooden Shop</title>
<meta charset="utf-8">
<!-- CSS Files -->
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
<link rel="stylesheet" type="text/css" media="screen" href="menu/css/simple_menu.css">
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen">
<!-- JS Files -->

<!-- FancyBox -->
<link rel="stylesheet" type="text/css" href="js/fancybox/jquery.fancybox.css" media="all">
<script src="js/fancybox/jquery.fancybox-1.2.1.js"></script>
</head>
<body>
<div class="header">
  <!-- Logo/Title -->
  <div id="site_title"><a href="#"> <img src="img/logo.png" alt=""></a> </div>
  <!-- Main Menu -->
  <ol id="menu">
    <li><a href="index.jsp">Home</a></li>
    <!-- end sub menu -->
    <li><a href="#">Items</a>
      <!-- sub menu -->
      <!-- <ol>
        <li><a href="#">Magazine</a></li>
        <li><a href="#">Blog</a></li>
        <li><a href="#">Full Width Page</a></li>
        <li><a href="#">Columns</a></li>
      </ol> -->
    </li>
    <li><a href="#">Elements</a></li>
    <li><a href="#">Galleries</a></li>    
    <li><a href="showContactUsPage.do">Contact</a></li>
  </ol>
</div>
<!-- END header -->
<div id="container">
  <h1>Full Width Page</h1>
  <p>This is an empty full width page.</p>
  	<br>
	<a href="viewWoodenItemsPage.do">Show Wooden Details Page</a>
	<br>
	<a href="showFeedbackPage.do">Send Feedback</a>
  <br>
  <a href="AddUser.do">Like Count</a>
  <div style="clear:both; height: 40px"></div>
</div>
<!-- close container -->
<div id="footer">
  <!-- First Column -->
  <div class="one-fourth">
    <h3>Useful Links</h3>
    <ul class="footer_links">
      <li><a href="http://www.gallerym.net/">Gallerym</a></li>
      <li><a href="http://www.woodenstonegallery.com/">Wooden Stone Gallery</a></li>
      <li><a href="http://www.galleryofwoodart.org/">Gallery of Wood Art</a></li>
      <li><a href="http://www.danselgallery.co.uk/">Dansel Gallery</a></li>
    </ul>
  </div>
  <!-- Second Column -->
  <div class="one-fourth">
    <h3>Terms</h3>
    <ul class="footer_links">
      <li><a href="#">Decorative Items</a></li>
      <li><a href="#">Ritual Items</a></li>
      <li><a href="#">Gift Items</a></li>
      <li><a href="#">Special Items</a></li>
    </ul>
  </div>
  <!-- Third Column -->
  <div class="one-fourth">
    <h3>Information</h3>
    All the items sold in this website is designed by hand and that also by the lineage of real originator of this wooden art , and its straight for you from them.  
    <div id="social_icons"> Photos © <a href="#">ANAND Satyam</a> </div>
  </div>
  <!-- Fourth Column -->
  <div class="one-fourth last">
    <h3>Socialize</h3>
	<a href="showSubscribePage.do">Subscribe</a>
    </div>
  <div style="clear:both"></div>
</div>
<!-- END footer -->
</body>
</html>