<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*,com.vcube.dao.CourseDAO,com.vcube.dto.Course" %>

<%
    // 🔐 Session check
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
<meta charset="UTF-8">
<title>My Courses</title>

<link rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>
body {
    background: linear-gradient(to right, #c3e0f7, #d9ffe5);
    min-height: 100vh;
    margin: 0;
    font-family: 'Poppins', sans-serif;
}

.container {
    margin-top: 90px;
}

.card {
    border-radius: 12px;
    background-color: rgba(255, 255, 255, .92);
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

<jsp:include page="navbar.jsp" />

<div class="container">

    <h2 class="text-center mb-4">
        Welcome <span class="text-primary"><%= username %></span>
    </h2>

    <div class="row justify-content-center">
        <div class="col-md-10">

            <div class="card shadow p-4">

                <h4 class="text-center mb-3">📘 Your Courses</h4>

                <table class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th>Course Name</th>
                            <th>Duration</th>
                            <th>Start Date</th>
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
                            <td><%= c.getCourseName() %></td>
                            <td><%= c.getDuration() %></td>
                            <td><%= c.getStartDate() %></td>

                            <!-- Progress bar -->
                            <td>
                                <div class="progress">
                                    <div class="progress-bar 
                                        <%= progress >= 75 ? "bg-success"
                                           : progress >= 40 ? "bg-warning"
                                           : "bg-danger" %>"
                                         style="width:<%= progress %>%">
                                        <%= progress %>%
                                    </div>
                                </div>
                            </td>

                            <!-- Status -->
                            <td>
                                <span class="badge 
                                    <%= "Active".equalsIgnoreCase(c.getStatus())
                                        ? "bg-success"
                                        : "bg-danger" %>">
                                    <%= c.getStatus() %>
                                </span>
                            </td>
                        </tr>
                    <%
                            }
                        } else {
                    %>
                        <tr>
                            <td colspan="5" class="text-center text-muted">
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
