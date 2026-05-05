<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Generate Bill</title>

<style>
body{font-family:Arial;margin:40px}
input{display:block;margin:10px;padding:8px;width:250px}
button{padding:8px 16px;background:#4CAF50;color:#fff;border:none}
</style>

</head>
<body>

<h2>Generate Electricity Bill</h2>

<form action="generateBill" method="post">

<input name="meter" placeholder="Meter No" required>
<input name="units" type="number" placeholder="Units" required>

<button type="submit">Generate Bill</button>

</form>

</body>
</html>