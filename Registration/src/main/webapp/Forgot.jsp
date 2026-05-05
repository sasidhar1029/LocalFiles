<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Forgot Password</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
	min-height: 100vh;
	margin: 0;
	font-family: 'Poppins', sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(-45deg, #89f7fe, #66a6ff, #d4fc79, #96e6a1);
	background-size: 400% 400%;
	animation: gradientBG 12s ease infinite;
}

/* ✅ FIXED CSS */
@
keyframes gradientBG { 0% {
	background-position: 0% 50%;
}

50
%
{
background-position
:
100%
50%;
}
100
%
{
background-position
:
0%
50%;
}
}
.card {
	width: 380px;
	border-radius: 15px;
	background-color: rgba(255, 255, 255, .93);
}

.error-msg {
	color: red;
	font-size: 14px;
	margin-top: -6px;
	margin-bottom: 6px;
	display: none;
}
</style>
</head>

<body>

	<div class="card shadow p-4">
		<h3 class="text-center mb-3">Reset Password</h3>

		<!-- ✅ SERVER SIDE MESSAGE HANDLING -->
		<%
		String error = request.getParameter("error");
		if ("nomatch".equals(error)) {
		%>
		<div class="alert alert-danger">Passwords do not match</div>
		<%
		} else if ("notfound".equals(error)) {
		%>
		<div class="alert alert-danger">User not found</div>
		<%
		}
		%>

		<form id="forgotForm" action="ForgotServlet" method="post">

			<input type="text" class="form-control mb-1" id="username"
				name="username" placeholder="Enter Username" required>
			<p id="usernameError" class="error-msg">Username must be at least
				5 characters and no spaces.</p>

			<input type="password" class="form-control mb-1" id="newpassword"
				name="newpassword" placeholder="Enter New Password" required>
			<p id="newPassError" class="error-msg">Password must be at least
				6 characters and contain 1 uppercase & 1 number.</p>

			<input type="password" class="form-control mb-2" id="confirmpassword"
				name="confirmpassword" placeholder="Confirm Password" required>
			<p id="confirmPassError" class="error-msg">Passwords do not
				match.</p>

			<button type="submit" class="btn btn-primary w-100">Update
				Password</button>
		</form>

		<div class="text-center mt-3">
			<a href="login.jsp">Back to Login</a>
		</div>
	</div>

	<script>
		document
				.getElementById("forgotForm")
				.addEventListener(
						"submit",
						function(event) {
							let valid = true;

							let username = document.getElementById("username").value
									.trim();
							if (username.length < 5 || username.includes(" ")) {
								document.getElementById("usernameError").style.display = "block";
								valid = false;
							} else {
								document.getElementById("usernameError").style.display = "none";
							}

							let newPass = document
									.getElementById("newpassword").value;
							let passRegex = /^(?=.*[A-Z])(?=.*\d).{6,}$/;
							if (!passRegex.test(newPass)) {
								document.getElementById("newPassError").style.display = "block";
								valid = false;
							} else {
								document.getElementById("newPassError").style.display = "none";
							}

							let confirmPass = document
									.getElementById("confirmpassword").value;
							if (newPass !== confirmPass) {
								document.getElementById("confirmPassError").style.display = "block";
								valid = false;
							} else {
								document.getElementById("confirmPassError").style.display = "none";
							}

							if (!valid)
								event.preventDefault();
						});
	</script>

</body>
</html>
