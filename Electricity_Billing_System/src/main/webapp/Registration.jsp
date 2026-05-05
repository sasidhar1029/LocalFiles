<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

<style>
body{
    font-family:Arial;
    background:#f5f7fa;
}
.container{
    width:380px;
    margin:80px auto;
    background:#fff;
    padding:25px;
    border-radius:8px;
    box-shadow:0 5px 15px rgba(0,0,0,0.1);
}
input{
    width:100%;
    padding:10px;
    margin:8px 0;
    border:1px solid #ccc;
    border-radius:4px;
}
button{
    width:100%;
    padding:12px;
    background:#2196f3;
    color:#fff;
    border:none;
    border-radius:4px;
    margin-top:10px;
}
</style>

</head>
<body>

<div class="container">

<h2>User Registration</h2>

<form action="registration" method="post">

<label>Username</label> <input type="text" name="username" required>

<label>Mobile Number</label> <input type="tel" name="mobile" pattern="[0-9]{10}" placeholder="10 digit mobile" required>

<label>Password</label> <input type="password" name="password" required>

<label>Re-Enter Password</label> <input type="password" name="repassword" required>

<button type="submit">Register</button>

</form>

</div>

</body>
</html>
