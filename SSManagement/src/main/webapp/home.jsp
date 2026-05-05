<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<c:if test="${empty sessionScope.username}">
    <c:redirect url="login.jsp"/>
</c:if>

<div class="container">
    <div class="main-card text-center">
        <h3 class="fw-bold">Welcome, ${sessionScope.fullname} 👋</h3>
        <p class="text-muted">Use the options below to manage your details and courses.</p>

        <div class="row mt-4 justify-content-center">
            <div class="col-md-3 mb-3">
                <a href="profile">
                    <div class="card card-hover p-3">
                        <h5>👤 Profile</h5>
                        <p>View & update your details</p>
                    </div>
                </a>
            </div>
            <div class="col-md-3 mb-3">
                <a href="courses">
                    <div class="card card-hover p-3">
                        <h5>📘 Courses</h5>
                        <p>Manage your course list</p>
                    </div>
                </a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
