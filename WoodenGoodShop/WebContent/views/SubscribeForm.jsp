<%@include file="taglib_includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="js/jquery-1.7.1.js"></script>

<script type="text/javascript">
function submitForm(clicked_id){
	alert(clicked_id);   
    $("#openid_form").attr("action",clicked_id);    
    //submit the form
    $("#openid_form").submit();
}
</script>

</head>
<body>
	
		<h1>Subscribe for Newsletter</h1>

 
 <form id="openid_form" method="POST" action="#">
    Email Id :<input type="text" name="user_emailId" /><br/>   
    <input type="button" value=Subscribe id="saveforSubscription.do" onClick="submitForm(this.id)" />
    <input type="button" value=Unsubscribe id="removefromSubscription.do" onClick="submitForm(this.id)" />
</form>
 <a href="index.jsp">Home Page</a>

 
 
</body>
</html>