<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>

<style>
body{
    font-family:Arial;
    background:#f5f7fa;
}
.card{
    width:400px;
    margin:80px auto;
    background:#fff;
    padding:25px;
    border-radius:10px;
    box-shadow:0 5px 15px rgba(0,0,0,0.1);
}
h2{text-align:center;}

input{
    width:100%;
    padding:12px;
    margin:8px 0;
    border:1px solid #ddd;
    border-radius:6px;
}

button{
    width:100%;
    padding:12px;
    border:none;
    border-radius:6px;
    background:#4CAF50;
    color:#fff;
    font-size:16px;
}

.success{
    background:#e8f5e9;
    color:#2e7d32;
    padding:10px;
    border-radius:6px;
    text-align:center;
    margin-bottom:10px;
}
</style>

</head>
<body>

<div class="card">

<h2>Add Customer</h2>

<%
if(request.getParameter("success")!=null){
%>

<div class="success">Customer added successfully ✅</div>
<%
}
%>

<form action="addCustomer" method="post">

<input name="name" placeholder="Name" required>
<input name="meter" placeholder="Meter No" required>
<input name="address" placeholder="Address" required>
<input name="phone" placeholder="Phone" required>

<button type="submit">Add Customer</button>

</form>

</div>

</body>
</html>
