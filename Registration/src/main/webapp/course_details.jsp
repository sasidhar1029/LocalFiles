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
<title>Enter Course Details</title>

<link rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    background: linear-gradient(to right, #e0f2fe, #dcfce7);
    min-height: 100vh;
}
.card {
    border-radius: 15px;
}
</style>
</head>

<body>

<jsp:include page="navbar.jsp" />

<div class="container mt-5">
    <h2 class="text-center mb-4 fw-bold">📘 Enter Course Details</h2>

    <div class="card shadow p-4 col-md-6 mx-auto bg-white">

        <form action="CourseController" method="post" id="courseForm">

            <input type="text" name="courseName"
                   placeholder="Course Name"
                   class="form-control mb-3" required>

            <input type="text" name="duration"
                   placeholder="Course Duration (e.g. 3 Months)"
                   class="form-control mb-3" required>

            <input type="date" name="startDate"
                   class="form-control mb-3" required>

            <div class="input-group mb-3">
                <input type="number" name="progress"
                       placeholder="Progress"
                       class="form-control" min="0" max="100" required>
                <span class="input-group-text">%</span>
            </div>

            <select name="status" class="form-select mb-3" required>
                <option value="">-- Select Status --</option>
                <option value="Active">Active</option>
                <option value="Inactive">Inactive</option>
            </select>

            <button class="btn btn-primary w-100 fw-bold">
                💾 Save Course
            </button>

        </form>
    </div>
</div>

<script>
document.getElementById("courseForm").addEventListener("submit", function(e) {
    let progress = document.querySelector("input[name='progress']").value;
    if (progress < 0 || progress > 100) {
        alert("Progress must be between 0 and 100");
        e.preventDefault();
    }
});
</script>

</body>
</html>
