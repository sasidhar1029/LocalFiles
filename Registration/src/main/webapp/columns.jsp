<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // 🔐 Session check (Student security)
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(to right, #c3e0f7, #d9ffe5);
    min-height: 100vh;
}

.dashboard-card {
    border-radius: 15px;
    transition: transform 0.3s ease;
}

.dashboard-card:hover {
    transform: scale(1.05);
}
</style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark px-4">
    <span class="navbar-brand fw-bold">Student Dashboard</span>

    <div class="ms-auto d-flex align-items-center">
        <span class="text-white me-3">
            Welcome, <b><%= username %></b>
        </span>

        <!-- ✅ Correct Logout -->
        <form action="logout" method="post" class="d-inline">
            <button class="btn btn-danger btn-sm">Logout</button>
        </form>
    </div>
</nav>

<!-- DASHBOARD CONTENT -->
<div class="container mt-5">

    <!-- First Row -->
    <div class="row text-center justify-content-center">

        <!-- Profile -->
        <div class="col-md-4 p-3">
            <div class="card dashboard-card shadow p-4">
                <h5>
                    <a href="profile.jsp" class="text-decoration-none text-dark">
                        👤 Profile
                    </a>
                </h5>
                <p>View and update your details</p>
            </div>
        </div>

        <!-- Courses -->
        <div class="col-md-4 p-3">
            <div class="card dashboard-card shadow p-4">
                <h5>
                    <a href="course.jsp" class="text-decoration-none text-dark">
                        📘 Courses
                    </a>
                </h5>
                <p>View your enrolled courses</p>
            </div>
        </div>

        <!-- Course Details -->
        <div class="col-md-4 p-3">
            <div class="card dashboard-card shadow p-4">
                <h5>
                    <a href="mycourses.jsp" class="text-decoration-none text-dark">
                        📊 Course Details
                    </a>
                </h5>
                <p>Add and manage your course details</p>
            </div>
        </div>

    </div>

    <!-- Second Row -->
    <div class="row text-center justify-content-center">

        <!-- Contact -->
        <div class="col-md-4 p-3">
            <div class="card dashboard-card shadow p-4">
                <h5>
                    <a href="Contact.jsp" class="text-decoration-none text-dark">
                        📞 Contact
                    </a>
                </h5>
                <p>Get support from team</p>
            </div>
        </div>

    </div>

</div>

<!-- FOOTER -->
<footer class="text-center mt-5 text-muted">
    <hr>
    © <%= java.time.Year.now() %> Student Management System
</footer>

</body>
</html>
