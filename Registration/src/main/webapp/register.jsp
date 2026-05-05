<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // 🔐 Prevent logged-in users from registering again
    if (session.getAttribute("username") != null) {
        response.sendRedirect("dashboard.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<link rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    background: linear-gradient(to right, #b4e9ff, #dfffd9);
    min-height: 100vh;
    font-family: 'Poppins', sans-serif;
    display: flex;
    flex-direction: column;
}

.form-container {
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
    color: #2e7d32;
}

.btn-success {
    background-color: #2e7d32;
    border: none;
}

.btn-success:hover {
    background-color: #1b5e20;
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

<div class="form-container">
    <div class="card shadow p-4">

        <h3 class="text-center mb-3">Student Registration</h3>

        <!-- ✅ SERVER SIDE MESSAGES -->
        <%
            String error = request.getParameter("error");
            if ("exists".equals(error)) {
        %>
            <div class="alert alert-danger text-center">
                Username already exists ❌
            </div>
        <%
            } else if ("failed".equals(error)) {
        %>
            <div class="alert alert-danger text-center">
                Registration failed. Try again ❌
            </div>
        <%
            }
        %>

        <form id="registerForm" action="RegisterController" method="post">

            <div class="mb-3">
                <label>Full Name</label>
                <input type="text" id="fullname" name="fullname"
                       class="form-control" required>
                <p id="nameError" class="error-msg">
                    Full Name must be at least 3 characters.
                </p>
            </div>

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
                    Password must be at least 6 characters and contain
                    1 uppercase letter & 1 number.
                </p>
            </div>

            <button type="submit" class="btn btn-success w-100">
                Register
            </button>

            <div class="text-center mt-3">
                <a href="login.jsp">Already have an account? Login</a>
            </div>

        </form>
    </div>
</div>

<script>
document.getElementById("registerForm").addEventListener("submit", function(event) {
    let valid = true;

    let fullname = document.getElementById("fullname").value.trim();
    document.getElementById("nameError").style.display =
        fullname.length < 3 ? "block" : "none";
    if (fullname.length < 3) valid = false;

    let username = document.getElementById("username").value.trim();
    document.getElementById("usernameError").style.display =
        (username.length < 5 || username.includes(" ")) ? "block" : "none";
    if (username.length < 5 || username.includes(" ")) valid = false;

    let password = document.getElementById("password").value;
    let passRegex = /^(?=.*[A-Z])(?=.*\d).{6,}$/;
    document.getElementById("passwordError").style.display =
        !passRegex.test(password) ? "block" : "none";
    if (!passRegex.test(password)) valid = false;

    if (!valid) event.preventDefault();
});
</script>

</body>
</html>
