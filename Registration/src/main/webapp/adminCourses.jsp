<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, com.vcube.dto.Course"%>

<%
    List<Course> courses = (List<Course>) request.getAttribute("courses");
%>

<!DOCTYPE html>
<html>
<head>
<title>Admin - All Courses</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(to right, #e3f2fd, #ffffff);
}
.table th {
    background-color: #0d6efd;
    color: white;
    text-align: center;
}
.table td {
    text-align: center;
    vertical-align: middle;
}
</style>
</head>

<body>

<nav class="navbar navbar-dark bg-primary px-4">
    <span class="navbar-brand fw-bold">Admin Dashboard</span>
    <a href="logout" class="btn btn-light btn-sm">Logout</a>
</nav>

<div class="container mt-5">

    <h3 class="text-center text-primary mb-4">📚 All Student Courses</h3>

    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>Username</th>
                <th>Course Name</th>
                <th>Duration</th>
                <th>Progress</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>

        <%
            if (courses == null || courses.isEmpty()) {
        %>
            <tr>
                <td colspan="5" class="text-danger fw-bold">
                    No courses found
                </td>
            </tr>
        <%
            } else {
                for (Course c : courses) {
        %>
            <tr>
                <td><%= c.getUsername() %></td>
                <td><%= c.getCourseName() %></td>
                <td><%= c.getDuration() %></td>
                <td>
                    <div class="progress">
                        <div class="progress-bar 
                            <%= c.getProgress() >= 75 ? "bg-success" :
                                c.getProgress() >= 40 ? "bg-warning" : "bg-danger" %>"
                             style="width:<%= c.getProgress() %>%">
                            <%= c.getProgress() %>%
                        </div>
                    </div>
                </td>
                <td>
                    <span class="badge 
                        <%= "Active".equalsIgnoreCase(c.getStatus())
                            ? "bg-success" : "bg-danger" %>">
                        <%= c.getStatus() %>
                    </span>
                </td>
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

</body>
</html>
