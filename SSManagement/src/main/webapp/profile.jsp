<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>My Profile</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<c:if test="${empty sessionScope.username}">
    <c:redirect url="login.jsp"/>
</c:if>

<div class="container">
    <div class="main-card col-md-6 mx-auto">
        <h3 class="text-center mb-3">My Profile</h3>

        <c:if test="${param.msg == 'updated'}">
            <div class="alert alert-success">Profile updated successfully.</div>
        </c:if>

        <form action="profile" method="post">
            <div class="mb-3">
                <label>Full Name</label>
                <input type="text" name="fullname" class="form-control" value="${student.fullname}" required>
            </div>
            <div class="mb-3">
                <label>Username (read-only)</label>
                <input type="text" class="form-control" value="${student.username}" readonly>
            </div>
            <div class="mb-3">
                <label>Email</label>
                <input type="email" name="email" class="form-control" value="${student.email}">
            </div>
            <div class="mb-3">
                <label>Mobile</label>
                <input type="text" name="mobile" class="form-control" value="${student.mobile}">
            </div>
            <button class="btn btn-success w-100">Save Changes</button>
        </form>
    </div>
</div>

</body>
</html>
