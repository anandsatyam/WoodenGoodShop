<%@include file="taglib_includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
					<td><a href="/WoodenGoodShop/index.jsp">Home Page</a></td>
				</tr>
			</table>
		</form:form>
	
</body>
</html>