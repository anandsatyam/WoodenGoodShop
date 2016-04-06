<%@include file="taglib_includes.jsp" %>

<html>
<head>
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

	
	<%-- <title><spring:message code="App.Title"></spring:message> </title> --%>
</head>
<body style="font-family: Arial; font-size:smaller;">

<table  bgcolor="lightblue" width="750" height="200" align="center" style="border-collapse: collapse;" border="1" bordercolor="#006699" >
	<tr>
		<td align="center"><h3>Edit Wooden details</h3></td>
	</tr>
  <tr valign="top" align="center">
    <td align="center">
 		<form:form action="updateWoodenItemsList.do" method="post" commandName="editWoodenItemsPage">
				<table width="500" style="border-collapse: collapse;" border="0" bordercolor="#006699" cellspacing="2" cellpadding="2">					
					<tr>
						<td width="100" align="right">Wooden ID</td>
						<td width="150"><form:input path="woodItem_id" readonly="true"/></td>						
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
  </tr>
</table>


</body>
</html>
