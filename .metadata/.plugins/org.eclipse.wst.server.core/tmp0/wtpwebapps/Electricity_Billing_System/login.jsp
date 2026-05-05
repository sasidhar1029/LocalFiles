<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
body{
    margin:0;
    font-family:Arial;
    background:linear-gradient(135deg,#667eea,#764ba2);
}

.card{
    width:360px;
    margin:120px auto;
    background:#fff;
    padding:25px;
    border-radius:10px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    margin-bottom:20px;
}

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
    margin-top:10px;
    border:none;
    border-radius:6px;
    background:#667eea;
    color:#fff;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background:#5a67d8;
}

.register{
    text-align:center;
    margin-top:12px;
}

.register a{
    text-decoration:none;
    color:#667eea;
}

.error{
    color:red;
    text-align:center;
    margin-top:10px;
}
</style>

</head>
<body>

<div class="card">

<h2>Login</h2>

<form action="login" method="post">

<input name="username" placeholder="Username" required>
<input name="password" type="password" placeholder="Password" required>

<button type="submit">Login</button>

</form>

<div class="register">
<a href="Registration.jsp">New User? Register Here</a>
</div>

<%
if(request.getParameter("error")!=null){
%>

<p class="error">Invalid Login</p>
<%
}
%>

</div>

</body>
</html>
