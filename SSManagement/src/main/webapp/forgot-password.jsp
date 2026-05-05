<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Forgot Password</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="main-card col-md-4 mx-auto">
        <h4 class="text-center mb-3">Reset Password</h4>

        <c:if test="${param.error == 'nomatch'}">
            <div class="alert alert-danger">Passwords do not match.</div>
        </c:if>
        <c:if test="${param.error == 'usernotfound'}">
            <div class="alert alert-danger">User not found.</div>
        </c:if>

        <form action="forgot-password" method="post">
            <div class="mb-3">
                <label>Username</label>
                <input type="text" name="username" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>New Password</label>
                <input type="password" name="newpassword" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Confirm Password</label>
                <input type="password" name="confirmpassword" class="form-control" required>
            </div>
            <button class="btn btn-primary w-100">Update Password</button>
        </form>
    </div>
</div>

</body>
</html>
