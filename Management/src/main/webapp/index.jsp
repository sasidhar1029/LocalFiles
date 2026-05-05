<%@ include file="navbar.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
  background: linear-gradient(120deg, #d9e4ff, #c9ffe6);
  font-family: Poppins, sans-serif;
}
.card-box {
  background: rgba(255, 255, 255, 0.92);
  border-radius: 18px;
  padding: 35px;
  box-shadow: 0 6px 20px rgba(0,0,0,0.18);
}
</style>

<div class="container mt-5 col-md-8">
  <div class="card-box text-center">
    <h2 class="fw-bold mb-3" style="color:#004aad;">Welcome to Student Management System</h2>
    <p class="text-muted mb-4">Add, Update, View & Delete Students Easily</p>

    <a href="add.jsp" class="btn btn-success btn-lg px-5 me-2">➕ Add Student</a>
    <a href="view.jsp" class="btn btn-primary btn-lg px-5">📋 View Students</a>
  </div>
</div>

<%@ include file="footer.jsp" %>
