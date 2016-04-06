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
	<h1>Your valuable Feedback</h1>	
		<form:form action="sendFeedback.do" method="post">
			<table border="0" width="80%">
				<!-- <tr>
					<td>To:</td>
					<td>
					<input type="text" name="recipient" size="65" /></td>
				</tr> --> 
				<tr>
					<td>Subject:</td>
					<td><input type="text" name="subject" size="65" /></td>
				</tr> 
				<tr>
					<td>Message:</td>
					<td><textarea cols="50" rows="10" name="message"></textarea></td>
				</tr>				
				<tr>
					<td align="center">
						<input type="submit" value="Send E-mail" />
					</td>
					<td></td>
				</tr>
			</table>
		</form:form>
	 <div style="clear:both; height: 40px"></div>	
</div>
<!-- close container -->
<div id="footer">
<br><br><br><br><br><br><br><br>
</div>
<!-- END footer -->
</body>
</html>