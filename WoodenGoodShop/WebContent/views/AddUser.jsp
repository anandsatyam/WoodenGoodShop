<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Users using ajax</title>
<script src="/WoodenGoodShop/js/jquery.js"></script>
<script type="text/javascript">
function doAjaxPost() {	   
	  $.ajax({  
	    type: "POST",  
	    url: "/WoodenGoodShop/AddUser.do",  	   
	    success: function(response){
	      // we have the response  
	      $('#info').html(response);	     
	    } 
	  });  
	}  
</script>
</head>
<body>
<h1>Add Users using Ajax ........</h1>
	<table>
		<tr><td colspan="2"><input type="button" value="Add Users" onclick="doAjaxPost()"><br/></td></tr>
		<tr><td colspan="2"><div id="info" style="color: green;"></div></td></tr>
	</table>
</body>
</html>