<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 🔐 Session check
String username = (String) session.getAttribute("username");
if (username == null) {
	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Icons -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css"
	rel="stylesheet">

<style>
body {
	min-height: 100vh;
	background: linear-gradient(135deg, #667eea, #764ba2);
	font-family: 'Segoe UI', sans-serif;
}

.welcome-box {
	background: rgba(255, 255, 255, 0.15);
	backdrop-filter: blur(12px);
	border-radius: 16px;
	padding: 30px;
	color: white;
	box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
}

.dashboard-card {
	background: rgba(255, 255, 255, 0.95);
	border-radius: 16px;
	padding: 30px;
	height: 100%;
	text-align: center;
	transition: all 0.35s ease;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15);
	cursor: pointer;
}

.dashboard-card i {
	font-size: 45px;
	margin-bottom: 15px;
}

.dashboard-card:hover {
	transform: translateY(-12px) scale(1.03);
	box-shadow: 0 18px 40px rgba(0, 0, 0, 0.25);
}

.dashboard-card h5 {
	font-weight: 700;
}

.dashboard-card p {
	color: #555;
}

a {
	text-decoration: none;
	color: inherit;
}
</style>
</head>

<body>

	<jsp:include page="navbar.jsp" />

	<div class="container mt-5">

		<!-- Welcome Section -->
		<div class="welcome-box text-center mb-5">
			<h2 class="fw-bold mb-2">
				Welcome,
				<%=username%>
			</h2>
			<p class="opacity-75">Your personalized learning & management
				dashboard</p>
		</div>

		<!-- Dashboard Cards -->
		<div class="row g-4 justify-content-center">

			<!-- Profile -->
			<div class="col-md-4 col-lg-3">
				<a href="profile.jsp">
					<div class="dashboard-card">
						<i class="bi bi-person-circle text-primary"></i>
						<h5>My Profile</h5>
						<p>View & update your personal details</p>
					</div>
				</a>
			</div>

			<!-- Courses -->
			<div class="col-md-4 col-lg-3">
				<a href="course.jsp">
					<div class="dashboard-card">
						<i class="bi bi-book-half text-success"></i>
						<h5>My Courses</h5>
						<p>Check enrolled courses & progress</p>
					</div>
				</a>
			</div>

			<!-- Support -->
			<div class="col-md-4 col-lg-3">
				<a href="Contact.jsp">
					<div class="dashboard-card">
						<i class="bi bi-headset text-danger"></i>
						<h5>Support</h5>
						<p>Need help? Contact our support team</p>
					</div>
				</a>
			</div>

		</div>
	</div>

</body>
</html>
