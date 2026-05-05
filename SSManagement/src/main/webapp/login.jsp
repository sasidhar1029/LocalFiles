<%@ page contentType="text/html;charset=UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="main-card col-md-4 mx-auto">
        <h3 class="text-center mb-3">Student Login</h3>

        <c:choose>
    <c:when test="${param.msg == 'registered'}">
        <div class="alert alert-success">Registration successful. Please login.</div>
    </c:when>
    <c:when test="${param.msg == 'updated'}">
        <div class="alert alert-success">Password updated. Login again.</div>
    </c:when>
    <c:when test="${param.msg == 'logout'}">
        <div class="alert alert-info">Logged out successfully.</div>
    </c:when>
    <c:when test="${param.error == '1'}">
        <div class="alert alert-danger">Invalid username or password.</div>
    </c:when>
</c:choose>


        <form id="loginForm" action="login" method="post">
            <div class="mb-3">
                <label>Username</label>
                <input type="text" name="username" id="lusername" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Password</label>
                <input type="password" name="password" id="lpassword" class="form-control" required>
            </div>
            <button class="btn btn-primary w-100">Login</button>
        </form>
        <div class="text-center mt-3">
            <a href="forgot-password.jsp">Forgot Password?</a>
        </div>
    </div>
</div>

<script>
document.getElementById("loginForm").addEventListener("submit", function(e){
    let u = document.getElementById("lusername").value.trim();
    let p = document.getElementById("lpassword").value;
    if(u.length < 3 || p.length < 3){
        alert("Enter valid credentials");
        e.preventDefault();
    }
});
</script>
</body>
</html>
