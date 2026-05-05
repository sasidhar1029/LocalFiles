<%@ page contentType="text/html;charset=UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<title>My Courses</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<c:if test="${empty sessionScope.username}">
    <c:redirect url="login.jsp"/>
</c:if>

<div class="container">
    <div class="main-card">
        <div class="d-flex justify-content-between align-items-center mb-3">
            <h4>My Courses</h4>
            <a href="courses?action=addForm" class="btn btn-primary btn-sm">+ Add Course</a>
        </div>

        <c:if test="${empty courses}">
            <p>No courses added yet.</p>
        </c:if>

        <c:if test="${not empty courses}">
            <table class="table table-bordered table-hover">
                <thead class="table-light">
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Duration</th>
                        <th>Start Date</th>
                        <th>Progress</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="c" items="${courses}" varStatus="st">
                        <tr>
                            <td>${st.index + 1}</td>
                            <td>${c.courseName}</td>
                            <td>${c.duration}</td>
                            <td>${c.startDate}</td>
                            <td style="width:200px;">
                                <div class="progress">
                                    <div class="progress-bar" style="width:${c.progress}%;">
                                        ${c.progress}%
                                    </div>
                                </div>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${c.status == 'Active'}">
                                        <span class="badge bg-success">Active</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="badge bg-secondary">Inactive</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <a href="courses?action=editForm&id=${c.id}" class="btn btn-warning btn-sm">Edit</a>
                                <a href="courses?action=delete&id=${c.id}" class="btn btn-danger btn-sm"
                                   onclick="return confirm('Delete this course?');">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>

</body>
</html>
