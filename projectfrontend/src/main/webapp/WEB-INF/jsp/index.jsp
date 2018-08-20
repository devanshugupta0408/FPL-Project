<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "range">
	<table style="width: 30%">
		<tr>
			<th>ProductID</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Sold</th>
			<th>Viewed</th>
		</tr>
		<a:forEach items="${Product}" var="prod">
			<tr>
				<td>${prod.p_id}</td>
				<td>${prod.p_name}</td>
				<td>${prod.price}</td>
				<td>${prod.sold}</td>
				<td>${prod.p_view}</td>
			</tr>
		</a:forEach>
	</table>

<p>Range</p>
<input type="text" id="min" name="min">
-
<input type="text" id="max" name="max">
<input type="submit" value="submit" > 


	<select onchange="la(this.value)">
		<option>Select an option</option>
		<option value="http://localhost:9099/bestseller">Best Seller</option>
		<option value="http://localhost:9099/mostviewed">Most Viewed</option>
		<option value="http://localhost:9099/high">High to Low</option>
		<option value="http://localhost:9099/low">Low to High</option>
		
	</select>

	<script>
		function la(src) {
			window.location = src

		}
	</script>



</form>
</body>
</html>