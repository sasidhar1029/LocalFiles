<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Student Management System</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background: url("images/management.jpg") no-repeat center center fixed;
	background-size: cover;
	font-family: "Poppins", sans-serif;
}

.overlay {
	background: rgba(0, 0, 0, 0.45);
	min-height: 100vh;
	padding-bottom: 40px;
}

.navbar {
	box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
}

.navbar-brand {
	color: white !important;
}

.welcome-box {
	background: rgba(255, 255, 255, 0.92);
	border-radius: 15px;
	padding: 40px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
	animation: fadeIn 1.2s ease-in-out;
}

@
keyframes fadeIn {from { opacity:0;
	transform: scale(0.95);
}

to {
	opacity: 1;
	transform: scale(1);
}

}
.btn-custom {
	font-size: 18px;
	width: 150px;
}

footer {
	margin-top: 30px;
	text-align: center;
	color: white;
	font-weight: 500;
}

/* Responsive */
@media ( max-width : 576px) {
	.btn-custom {
		width: 100%;
		margin-bottom: 12px;
	}
	.welcome-box {
		padding: 28px;
	}
}
</style>
</head>

<body>

	<div class="overlay">

		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand font-weight-bold" href="index.jsp">
				Student Management </a>

			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse ml-auto" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="register.jsp"
						class="btn btn-outline-success mr-2"> Register </a></li>
					<li class="nav-item"><a href="login.jsp"
						class="btn btn-outline-primary mr-2"> Login </a></li>
					<li class="nav-item"><a href="index.jsp"
						class="btn btn-outline-light"> Home </a></li>
				</ul>
			</div>
		</nav>

		<!-- Main Content -->
		<div class="container text-center mt-5">
			<div class="welcome-box mx-auto col-lg-6 col-md-8 col-sm-10">
				<h2 class="font-weight-bold">
					Welcome to Student<br>Management System
				</h2>

				<p class="mt-2 text-muted">Manage student registration and login
					using JSP, Servlets & JDBC</p>

				<div class="mt-4">
					<a href="register.jsp" class="btn btn-success btn-custom mr-3">
						Register </a> <a href="login.jsp" class="btn btn-primary btn-custom">
						Login </a>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<footer>
			©
			<%=java.time.Year.now()%>
			Student Management System | All Rights Reserved
		</footer>

	</div>

	<!-- Bootstrap JS (REQUIRED) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
