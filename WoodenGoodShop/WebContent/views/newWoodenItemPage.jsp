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
<body style="font-family: Arial; font-size: smaller;">

	<h1>
		<center>NEW Wooden Item Add Page</center>
	</h1>

	<%-- <table align="center" bgcolor="lightblue" border="1"
		bordercolor="#006699" height="500" style="border-collapse: collapse; width: 750px;">
		<tbody>
			<tr>
				<td align="center"><h3>Edit Contact Form</h3></td>
			</tr>
			<tr align="center" valign="top">
				<td align="center"><form:form action="saveWoodenItemInList.do" commandname="newWoodenItemPage" method="post"></form:form>
					<table border="0" bordercolor="#006699" cellpadding="2"
						cellspacing="2" style="border-collapse: collapse; width: 500px;">
						<tbody>
							<tr>
								<td align="right" width="100">Wooden Item Id</td>
								<td width="150"><form:input path="woodItem_id"></form:input></td>								
							</tr>
							<tr>
								<td align="right" width="100">Wooden Item Name</td>
								<td><form:input path="woodItem_name"></form:input></td>
							</tr>
							<tr>
								<td align="right" width="100">Wooden Item Details</td>
								<td><form:input path="woodItem_details"></form:input></td>								
							</tr>
							<tr>
								<td align="right" width="100">Wooden Item Quantity</td>
								<td><form:input path="woodItem_quantity"></form:input></td>								
							</tr>
							<tr>
								<td align="center" colspan="3"><input name="" type="submit"
									value="Save"> <input name="" type="reset" value="Reset">
									
						<input onclick="javascript:go('viewAllContacts.do');" type="button" value="Back"></td>
							</tr>
						</tbody>
					</table></td>
			</tr>
		</tbody>
	</table>
 --%>


    <td align="center">
 		<form:form action="saveWoodenItemInList.do" method="post" commandName="newWoodenItemPage">
				<table width="500" style="border-collapse: collapse;" border="0" bordercolor="#006699" cellspacing="2" cellpadding="2">					
					<tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
					<tr>
						<td width="100" align="right">Wooden ID</td>
						<td width="150"><form:input path="woodItem_id"/></td>						
					</tr>
					<tr>
						<td width="100" align="right">Wooden Item NAME</td>
						<td><form:input path="woodItem_name"/></td>						
					</tr>
					<tr>
						<td width="100" align="right">Wooden Item Details</td>
						<td><form:input path="woodItem_details"/></td>						
					</tr>
					<tr>
						<td width="100" align="right">Wooden Item Quantity</td>
						<td><form:input path="woodItem_quantity"/></td>						
					</tr>
					
					<tr valign="bottom">
						<td colspan="2" align="center">
						<input type="submit" name="" value="Save">						
						&nbsp;&nbsp;
						<input type="button"  value="Back" onclick="javascript:go('viewWoodenItemsPage.do');">
						</td>
					</tr>					
				</table>	
				<a href="index.jsp">Home Page</a>			
		</form:form>
    </td> 
    
    
	<br>
</body>
</html>