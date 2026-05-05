<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Management System</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="main-card text-center">
        <h2 class="fw-bold">Welcome to Student Management System</h2>
        <p class="text-muted mt-2">Register, login and manage your courses easily.</p>
        <div class="mt-3">
            <a href="register.jsp" class="btn btn-success me-2">Register</a>
            <a href="login.jsp" class="btn btn-primary">Login</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
