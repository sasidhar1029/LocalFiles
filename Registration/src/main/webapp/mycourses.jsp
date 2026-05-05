<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*,com.vcube.dao.CourseDAO,com.vcube.dto.Course" %>

<%
    // 🔐 SESSION CHECK (MANDATORY)
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    CourseDAO dao = new CourseDAO();
    List<Course> list = dao.getCourses(username);
%>

<!DOCTYPE html>
<html>
<head>
<title>My Courses</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(135deg, #667eea, #764ba2);
    min-height: 100vh;
    font-family: 'Segoe UI', sans-serif;
}

.container {
    margin-top: 90px;
}

.card {
    border-radius: 18px;
    background: rgba(255, 255, 255, 0.95);
}

.table th {
    background: #0d6efd;
    color: white;
    text-align: center;
}

.table td {
    vertical-align: middle;
    text-align: center;
}

.progress {
    height: 18px;
    border-radius: 10px;
}

.badge-active {
    background-color: #198754;
}

.badge-inactive {
    background-color: #dc3545;
}
</style>
</head>

<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-10">

            <div class="card shadow-lg p-4">
                <h3 class="text-center fw-bold text-primary mb-4">
                    📘 My Courses
                </h3>

                <table class="table table-bordered table-hover align-middle">
                    <thead>
                        <tr>
                            <th>Course Name</th>
                            <th>Duration</th>
                            <th>Progress</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                        if (list != null && !list.isEmpty()) {
                            for (Course c : list) {
                                int progress = c.getProgress();
                    %>
                        <tr>
                            <td class="fw-semibold"><%= c.getCourseName() %></td>
                            <td><%= c.getDuration() %></td>

                            <!-- Progress Bar -->
                            <td>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-striped progress-bar-animated 
                                        <%= progress >= 75 ? "bg-success"
                                           : progress >= 40 ? "bg-warning"
                                           : "bg-danger" %>"
                                         style="width:<%= progress %>%">
                                        <%= progress %>%
                                    </div>
                                </div>
                            </td>

                            <!-- Status Badge -->
                            <td>
                                <span class="badge 
                                    <%= "Active".equalsIgnoreCase(c.getStatus())
                                        ? "badge-active"
                                        : "badge-inactive" %>">
                                    <%= c.getStatus() %>
                                </span>
                            </td>
                        </tr>
                    <%
                            }
                        } else {
                    %>
                        <tr>
                            <td colspan="4" class="text-center text-muted">
                                No courses enrolled yet 🚀
                            </td>
                        </tr>
                    <%
                        }
                    %>
                    </tbody>
                </table>

            </div>

        </div>
    </div>
</div>

</body>
</html>
