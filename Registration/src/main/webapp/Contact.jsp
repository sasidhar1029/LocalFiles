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
<meta charset="UTF-8">
<title>Contact Support</title>

<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    background: linear-gradient(to right, #c3e0f7, #d9ffe5);
    min-height: 100vh;
    margin: 0;
    font-family: 'Poppins', sans-serif;
}

.card {
    background-color: rgba(255, 255, 255, .92);
    border-radius: 15px;
}
</style>
</head>

<body>

<jsp:include page="navbar.jsp" />

<div class="container mt-5">
    <h2 class="text-center mb-4">Contact Support</h2>

    <h5 class="text-center text-primary mb-4">
        Logged in as: <b><%= username %></b>
    </h5>

    <div class="row justify-content-center">
        <div class="col-md-7">
            <div class="card shadow p-4">

                <h4 class="text-center mb-3">Send a Message</h4>

                <!-- ✅ Demo form (no backend yet) -->
                <form onsubmit="return false;">

                    <div class="mb-3">
                        <label>Your Name</label>
                        <input type="text" class="form-control"
                               placeholder="Enter your name" required>
                    </div>

                    <div class="mb-3">
                        <label>Your Email</label>
                        <input type="email" class="form-control"
                               placeholder="Enter your email" required>
                    </div>

                    <div class="mb-3">
                        <label>Subject</label>
                        <input type="text" class="form-control"
                               placeholder="Enter subject" required>
                    </div>

                    <div class="mb-3">
                        <label>Message</label>
                        <textarea class="form-control" rows="5"
                                  placeholder="Enter your message here..." required></textarea>
                    </div>

                    <button class="btn btn-primary w-100"
                            onclick="alert('Message sent successfully (demo)')">
                        Send Message
                    </button>
                </form>

                <hr class="mt-4">

                <h5 class="text-center mb-2">📌 Contact Info</h5>
                <p class="mb-1">
                    <strong>📍 Address:</strong> Vcube Software Solutions,
                    Hyderabad, India
                </p>
                <p class="mb-1">
                    <strong>📞 Phone:</strong> +91 9347272990
                </p>
                <p class="mb-1">
                    <strong>📧 Email:</strong> support@studentportal.com
                </p>
                <p class="mb-0">
                    <strong>⏳ Hours:</strong> Mon – Sat | 9 AM – 6 PM
                </p>

            </div>
        </div>
    </div>
</div>

</body>
</html>
