<%@include file="taglib_includes.jsp"%>
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

<script type="text/javascript">

function go(url)
{
	window.location = url;
}

/* function newWoodenItemPage()
{
	window.location = "saveWoodenItemInList.do";
} */

</script>
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
  <h1>Contact</h1>
  <div class="one-half">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7611.567485801386!2d78.35649672141341!3d17.470061786105113!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bcb9235f60ea2d5%3A0x8b4420a2d52728ff!2sRaghavendra+Colony%2C+Kondapur%2C+Hyderabad%2C+Telangana+500084!5e0!3m2!1sen!2sin!4v1446365864760" width="400" height="350" frameborder="0" style="border:0" allowfullscreen></iframe>
   
  </div>
  <div class="one-half last">
    <form action="#" id="contact_form" method="post">
      <fieldset>
        <label>Name <span class="required">*</span></label>
        <input type="text" name="name" id="Myname" value="" class="text requiredField">
      </fieldset>
      <fieldset>
        <label>Email <span class="required">*</span></label>
        <input type="text" name="email" id="myemail" value="" class="text requiredField email">
      </fieldset>
      <fieldset>
        <label>Subject <span class="required">*</span></label>
        <input type="text" name="subject" id="mySubject" value="" class="text requiredField subject">
      </fieldset>
      <fieldset>
        <label>Your Message <span class="required">*</span></label>
        <textarea name="message" id="Mymessage" rows="20" cols="30" class="text requiredField"></textarea>
      </fieldset>
      <fieldset>
        <input name="Mysubmitted" id="Mysubmitted" value="Send Message" class="button white" type="submit">
      </fieldset>
    </form>
    <!--END form ID contact_form -->
  </div>
  <div style="clear:both; height: 40px"></div>
</div>
<!-- close container -->
<div id="footer">
  <!-- First Column -->
  <div class="one-fourth">
    <h3>Useful Links</h3>
    <ul class="footer_links">
      <li><a href="#">Lorem Ipsum</a></li>
      <li><a href="#">Ellem Ciet</a></li>
      <li><a href="#">Currivitas</a></li>
      <li><a href="#">Salim Aritu</a></li>
    </ul>
  </div>
  <!-- Second Column -->
  <div class="one-fourth">
    <h3>Terms</h3>
    <ul class="footer_links">
      <li><a href="#">Lorem Ipsum</a></li>
      <li><a href="#">Ellem Ciet</a></li>
      <li><a href="#">Currivitas</a></li>
      <li><a href="#">Salim Aritu</a></li>
    </ul>
  </div>
  <!-- Third Column -->
  <div class="one-fourth">
    <h3>Information</h3>
    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent sit amet enim id dui tincidunt vestibulum rhoncus a felis.
    <div id="social_icons"> Theme by <a href="#">CssTemplateHeaven</a><br>
      Photos © <a href="#">Dieter Schneider</a> </div>
  </div>
  <!-- Fourth Column -->
  <div class="one-fourth last">
    <h3>Socialize</h3>
    <img src="img/icon_fb.png" alt=""> <img src="img/icon_twitter.png" alt=""> <img src="img/icon_in.png" alt=""> </div>
  <div style="clear:both"></div>
</div>
<!-- END footer -->
</body>




</html>