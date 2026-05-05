<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 🔐 Session & Admin check
String username = (String) session.getAttribute("username");

if (username == null || !"admin".equalsIgnoreCase(username)) {
	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: linear-gradient(to right, #dbeafe, #f8fafc);
	min-height: 100vh;
}

.dashboard-card {
	border-radius: 15px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
	transition: transform 0.3s ease;
}

.dashboard-card:hover {
	transform: scale(1.05);
}
</style>
</head>

<body>

	<!-- NAVBAR -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary px-4">
		<span class="navbar-brand fw-bold">Admin Dashboard</span>

		<div class="ms-auto d-flex align-items-center">
			<span class="text-white me-3"> Welcome, <b><%=username%></b>
			</span>

			<!-- ✅ Secure Logout -->
			<form action="logout" method="post" class="d-inline">
				<button class="btn btn-light btn-sm">Logout</button>
			</form>
		</div>
	</nav>

	<!-- DASHBOARD CONTENT -->
	<div class="container mt-5">

		<div class="row g-4">

			<!-- VIEW STUDENTS -->
			<div class="col-md-4">
				<div class="card dashboard-card text-center p-4">
					<h4>👨‍🎓 Students</h4>
					<p class="text-muted">View all registered students</p>
					<a href="viewStudents.jsp" class="btn btn-primary"> View
						Students </a>
				</div>
			</div>

			<!-- ADD STUDENT -->
			<div class="col-md-4">
				<div class="card dashboard-card text-center p-4">
					<h4>➕ Add Student</h4>
					<p class="text-muted">Register a new student</p>
					<a href="register.jsp" class="btn btn-success"> Add Student </a>
				</div>
			</div>

			<!-- UPDATE PASSWORD -->
			<div class="col-md-4">
				<div class="card dashboard-card text-center p-4">
					<h4>🔑 Update Password</h4>
					<p class="text-muted">Change admin password</p>
					<a href="forgot.jsp" class="btn btn-warning"> Update Password </a>
					<a href="viewStudents" class="btn btn-primary"> View Students </a>

				</div>
				<div class="col-md-4">
					<div class="card dashboard-card text-center p-4">
						<h4>📚 All Courses</h4>
						<p class="text-muted">View all students' courses</p>
						<a href="adminCourses" class="btn btn-info"> View Courses </a>
					</div>
				</div>

			</div>

		</div>

	</div>

	<!-- FOOTER -->
	<footer class="text-center mt-5 text-muted">
		<hr>
		©
		<%=java.time.Year.now()%>
		Student Management System
	</footer>

</body>
</html>
