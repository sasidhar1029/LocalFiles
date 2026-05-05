<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="main-card col-md-5 mx-auto">
        <h3 class="text-center mb-3">Student Registration</h3>

        <c:if test="${param.error == '1'}">
            <div class="alert alert-danger">Registration failed. Try again.</div>
        </c:if>

        <form id="registerForm" action="register" method="post">
            <div class="mb-3">
                <label>Full Name</label>
                <input type="text" name="fullname" id="fullname" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Username</label>
                <input type="text" name="username" id="username" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Password</label>
                <input type="password" name="password" id="password" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Email</label>
                <input type="email" name="email" id="email" class="form-control">
            </div>
            <div class="mb-3">
                <label>Mobile</label>
                <input type="text" name="mobile" id="mobile" class="form-control">
            </div>
            <button class="btn btn-success w-100">Register</button>
        </form>
    </div>
</div>

<script>
document.getElementById("registerForm").addEventListener("submit", function(e){
    let u = document.getElementById("username").value.trim();
    let p = document.getElementById("password").value;
    if(u.length < 5){
        alert("Username must be at least 5 characters");
        e.preventDefault();
    }
    if(p.length < 6){
        alert("Password must be at least 6 characters");
        e.preventDefault();
    }
});
</script>
</body>
</html>
