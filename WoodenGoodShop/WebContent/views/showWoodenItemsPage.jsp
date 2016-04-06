<%@include file="taglib_includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">

function go(url)
{
	window.location = url;
}

function confirm_delete(txt) {
	//alert(txt);
	return confirm('Delete '+ txt +' from Item list?');
}



/* function newWoodenItemPage()
{
	window.location = "saveWoodenItemInList.do";
} */
</script>

</head>
<body style="font-family: Arial; font-size: smaller;">	
		<h1><center>Wooden Items Page</center></h1>	
	<div style="text-align:center">
		
		<table style="border-collapse: collapse;" border="1" bordercolor="#006699" width="1000">
			<tr bgcolor="lightblue">
				<th>Item Code</th>
				<th>Item Name</th>
				<th>Item Details</th>
				<th>Quantity</th>
				<th>Offer Price</th>
				<th>Buy This</th>
				<th>Refer Item</th>
				<th>Edit Item</th>
				<th>Add Item</th>
				<th>Delete Item</th>				
			</tr>
			<c:if test="${empty Wood_Item_Results}">
				<tr>
					<td colspan="5">No Results found</td>
				</tr>
			</c:if>
			<c:if test="${! empty Wood_Item_Results}">
				<c:forEach var="wooditemlistvar" items="${Wood_Item_Results}">
					<tr>
						<td><c:out value="${wooditemlistvar.woodItem_id}"></c:out></td>
						<td><b><c:out value="${wooditemlistvar.woodItem_name}"></c:out></b></td>
						<td><c:out value="${wooditemlistvar.woodItem_details}"></c:out></td>
						<td><c:out value="${wooditemlistvar.woodItem_quantity}"></c:out></td>
						<td><c:out value="Price">Price</c:out></td>
						<td><input type="button" value="Buy Now" onclick="javascript:go('saveWoodenItemInList.do');" /></td>
											
						<!-- <td><input type="button" value="Refer It" onclick="javascript:go('referWoodenItems.do');" /></td> -->
						
						<td><a href="referWoodenItems.do?woodItem_name=${wooditemlistvar.woodItem_name}">Refer It</a></td>
						
						<td><a href="updateWoodenItemsList.do?woodItem_id=${wooditemlistvar.woodItem_id}">Edit</a></td>
						<td><input type="button" value="Add Item" onclick="javascript:go('saveWoodenItemInList.do');" /></td>						
						<td><a href="removeWoodenItemFromList.do?woodItem_id=${wooditemlistvar.woodItem_id}" 
						onclick="return confirm_delete('${wooditemlistvar.woodItem_name}')">Delete</a></td>
					</tr>					
				</c:forEach>
			</c:if>
		</table>
	</div>
	<br><br><a href="index.jsp">Home Page</a><br>
</body>
</html>