<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.util.*"%>
	<%@ page import="com.vcube.dao.FoodDAO"%>
	<%@ page import="com.vcube.model.Food"%>

	<%
	List<Food> list = FoodDAO.getAllFoods();
	for (Food f : list) {
	%>
	<form method="post" action="AddToCartServlet">
		<input type="hidden" name="id" value="<%=f.getId()%>"> <input
			type="hidden" name="name" value="<%=f.getName()%>"> <input
			type="hidden" name="price" value="<%=f.getPrice()%>">
		<%=f.getName()%>
		- ₹<%=f.getPrice()%>
		Qty: <input type="number" name="qty" value="1" min="1">
		<button>Add</button>
	</form>
	<%
	}
	%>

</body>
</html>