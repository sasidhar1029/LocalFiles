<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // 🔐 If already logged in, redirect to dashboard
    if (session.getAttribute("username") != null) {
        response.sendRedirect("dashboard.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>

<link rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    min-height: 100vh;
    margin: 0;
    font-family: 'Poppins', sans-serif;
    display: flex;
    flex-direction: column;
    background: linear-gradient(-45deg, #6dd5ed, #2193b0, #d4fc79, #96e6a1);
    background-size: 400% 400%;
    animation: gradientBG 12s ease infinite;
}

@keyframes gradientBG {
    0% { background-position: 0% 50%; }
    50% { background-position: 100% 50%; }
    100% { background-position: 0% 50%; }
}

.login-container {
    flex: 1;
    display: flex;
    justify-content: center;
    align-items: center;
}

.card {
    background-color: rgba(255, 255, 255, 0.92);
    border-radius: 18px;
    width: 430px;
}

h3 {
    font-weight: 600;
    color: #007bff;
}

.btn-primary {
    padding: 10px;
    font-size: 18px;
}

.error-msg {
    color: red;
    font-size: 14px;
    margin-top: -5px;
    display: none;
}
</style>
</head>

<body>

<jsp:include page="navbar.jsp" />

<div class="login-container">
    <div class="card shadow p-4">

        <h3 class="text-center mb-3">Student Login</h3>

        <!-- ✅ SERVER MESSAGES -->
        <%
            String error = request.getParameter("error");
            String msg = request.getParameter("msg");

            if ("invalid".equals(error)) {
        %>
            <div class="alert alert-danger text-center">
                Invalid username or password
            </div>
        <%
            }
            if ("updated".equals(msg)) {
        %>
            <div class="alert alert-success text-center">
                Password updated successfully. Please login.
            </div>
        <%
            }
        %>

        <form action="login" method="post" id="loginForm">

            <div class="mb-3">
                <label>Username</label>
                <input type="text" id="username" name="username"
                       class="form-control" required>
                <p id="usernameError" class="error-msg">
                    Username must be at least 5 characters and no spaces.
                </p>
            </div>

            <div class="mb-3">
                <label>Password</label>
                <input type="password" id="password" name="password"
                       class="form-control" required>
                <p id="passwordError" class="error-msg">
                    Password must be at least 6 characters.
                </p>
            </div>

            <button type="submit" class="btn btn-primary w-100">
                Login
            </button>

            <div class="text-center mt-3">
                <a href="Forgot.jsp">Forgot Password?</a>
            </div>
            <div class="text-center mt-2">
                <a href="register.jsp">New user? Register</a>
            </div>

        </form>
    </div>
</div>

<script>
document.getElementById("loginForm").addEventListener("submit", function(event) {
    let valid = true;

    let username = document.getElementById("username").value.trim();
    if (username.length < 5 || username.includes(" ")) {
        document.getElementById("usernameError").style.display = "block";
        valid = false;
    } else {
        document.getElementById("usernameError").style.display = "none";
    }

    let password = document.getElementById("password").value;
    if (password.length < 6) {
        document.getElementById("passwordError").style.display = "block";
        valid = false;
    } else {
        document.getElementById("passwordError").style.display = "none";
    }

    if (!valid) event.preventDefault();
});
</script>

</body>
</html>
