<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="com.vcube.dao.StudentDAO, com.vcube.dto.Student" %>

<%
    // 🔐 Session check
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    StudentDAO dao = new StudentDAO();
    Student s = dao.getStudentByUsername(username);

    // ❌ Safety check
    if (s == null) {
        out.println("<h3 class='text-danger text-center mt-5'>Profile not found</h3>");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

<link rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    background: linear-gradient(to right, #b4e9ff, #dfffd9);
    min-height: 100vh;
    font-family: 'Poppins', sans-serif;
}
.container { margin-top: 90px; }
.card {
    border-radius: 18px;
    background-color: rgba(255, 255, 255, .95);
}
.profile-label {
    font-weight: 600;
    color: #0d6efd;
}
</style>
</head>

<body>

<jsp:include page="navbar.jsp" />

<div class="container">
    <h2 class="text-center mb-4 fw-bold">My Profile</h2>

    <div class="row justify-content-center">
        <div class="col-md-7">
            <div class="card shadow p-4">

                <h4 class="text-center mb-4 text-primary">
                    Edit Your Profile 👤
                </h4>

                <form action="UpdateProfileServlet" method="post">

                    <!-- Full Name -->
                    <div class="mb-3">
                        <label class="profile-label">Full Name</label>
                        <input type="text" name="fullname"
                               class="form-control"
                               value="<%= s.getFullname() %>" required>
                    </div>

                    <!-- Username (DISPLAY ONLY) -->
                    <div class="mb-3">
                        <label class="profile-label">Username</label>
                        <input type="text"
                               class="form-control"
                               value="<%= s.getUsername() %>" readonly>
                    </div>

                    <!-- Email -->
                    <div class="mb-3">
                        <label class="profile-label">Email</label>
                        <input type="email" name="email"
                               class="form-control"
                               value="<%= s.getEmail() %>" required>
                    </div>

                    <!-- Mobile -->
                    <div class="mb-3">
                        <label class="profile-label">Mobile</label>
                        <input type="text" name="mobile"
                               class="form-control"
                               value="<%= s.getMobile() %>" required>
                    </div>

                    <!-- Course -->
                    <div class="mb-3">
                        <label class="profile-label">Course</label>
                        <input type="text" name="course"
                               class="form-control"
                               value="<%= s.getCourse() %>" required>
                    </div>

                    <!-- Joined Date -->
                    <div class="mb-3">
                        <label class="profile-label">Joined On</label>
                        <input type="date" name="joined"
                               class="form-control"
                               value="<%= s.getJoined() %>" required>
                    </div>

                    <!-- Status -->
                    <div class="mb-4">
                        <label class="profile-label">Status</label>
                        <select name="status" class="form-select" required>
                            <option value="Active"
                                <%= "Active".equals(s.getStatus()) ? "selected" : "" %>>
                                Active
                            </option>
                            <option value="Inactive"
                                <%= "Inactive".equals(s.getStatus()) ? "selected" : "" %>>
                                Inactive
                            </option>
                        </select>
                    </div>

                    <div class="text-center">
                        <button type="submit"
                                class="btn btn-success px-5 py-2 fw-bold">
                            💾 Save Changes
                        </button>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>
