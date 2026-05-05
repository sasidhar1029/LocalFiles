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
	<%@ page import="com.vcube.model.CartItem"%>
	<%
	List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
	double total = 0;
	for (CartItem c : cart) {
		total += c.price * c.qty;
	%>
	<%=c.name%>
	x
	<%=c.qty%><br>
	<%
	}
	%>
	Total: ₹<%=total%>
	<a href="checkout.jsp">Checkout</a>

</body>
</html>