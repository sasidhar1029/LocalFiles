<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="PlaceOrderServlet"
		onsubmit="return validate()">
		Address:
		<textarea id="addr" name="address"></textarea>
		<button>Place Order</button>
	</form>

	<script>
		function validate() {
			if (document.getElementById("addr").value == "") {
				alert("Address required");
				return false;
			}
			return true;
		}
	</script>

</body>
</html>