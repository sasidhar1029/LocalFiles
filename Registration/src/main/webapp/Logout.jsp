<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logged Out</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    height: 100vh;
    background: linear-gradient(135deg, #667eea, #764ba2);
    display: flex;
    justify-content: center;
    align-items: center;
    font-family: 'Segoe UI', sans-serif;
}

.logout-card {
    background: rgba(255, 255, 255, 0.95);
    padding: 40px;
    border-radius: 20px;
    text-align: center;
    box-shadow: 0 20px 40px rgba(0,0,0,0.25);
    animation: fadeIn 1s ease-in-out;
}

@keyframes fadeIn {
    from { opacity: 0; transform: translateY(20px); }
    to { opacity: 1; transform: translateY(0); }
}

.logout-card h2 {
    color: #dc3545;
    font-weight: bold;
}

.logout-card p {
    color: #555;
}
</style>

<meta http-equiv="refresh" content="3;url=login.jsp">

</head>
<body>

<div class="logout-card">
    <h2>👋 You have been logged out</h2>
    <p class="mt-3">Thank you for using our portal.</p>
    <p class="text-muted">Redirecting to login page...</p>
    <form action="logout" method="post">
    <button class="btn btn-danger">Logout</button>
</form>

</div>

</body>
</html>
