<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, com.vcube.dto.Student" %>

<%
    List<Student> students = (List<Student>) request.getAttribute("students");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(to right, #e3f2fd, #ffffff);
}
.card {
    border-radius: 15px;
    box-shadow: 0 8px 20px rgba(0,0,0,0.15);
}
.table th {
    background-color: #0d6efd;
    color: white;
}
</style>
</head>

<body>

<nav class="navbar navbar-dark bg-primary px-4">
    <span class="navbar-brand fw-bold">Admin Dashboard</span>
    <a href="logout" class="btn btn-light btn-sm">Logout</a>
</nav>

<div class="container mt-5">
    <div class="card">
        <div class="card-body">

            <h3 class="text-center text-primary mb-4">👨‍🎓 View Students</h3>

            <table class="table table-bordered table-hover text-center">
                <thead>
                    <tr>
                        <th>Full Name</th>
                        <th>Username</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    if (students == null || students.isEmpty()) {
                %>
                    <tr>
                        <td colspan="2" class="text-danger fw-bold">
                            No students found
                        </td>
                    </tr>
                <%
                    } else {
                        for (Student s : students) {
                %>
                    <tr>
                        <td><%= s.getFullname() %></td>
                        <td><%= s.getUsername() %></td>
                    </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>

            <div class="text-center">
                <a href="adminDashboard.jsp" class="btn btn-secondary">⬅ Back</a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
