<%@ include file="navbar.jsp" %>
<%@ page import="java.util.*, com.project.dao.StudentDAO, com.project.dto.Student" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body { background: linear-gradient(120deg, #d9e4ff, #c9ffe6); font-family: Poppins; }
.card-box {
  background: rgba(255, 255, 255, .92);
  border-radius: 18px;
  padding: 35px;
  box-shadow: 0 6px 20px rgba(0,0,0,0.18);
}
</style>

<div class="container mt-5">
  <div class="card-box">
    <h3 class="text-center fw-bold mb-4" style="color:#004aad;">Student List</h3>

    <table class="table table-hover table-bordered text-center">
      <thead class="table-dark">
        <tr><th>ID</th><th>Name</th><th>Marks</th><th>Department</th><th>Action</th></tr>
      </thead>
      <tbody>
        <%
          StudentDAO dao = new StudentDAO();
          List<Student> list = dao.getAllStudents();
          for(Student s : list){
        %>
        <tr>
          <td><%= s.getId() %></td>
          <td><%= s.getName() %></td>
          <td><%= s.getMarks() %></td>
          <td><%= s.getDept() %></td>
          <td>
            <a href="update.jsp?id=<%= s.getId() %>" class="btn btn-warning btn-sm">Edit</a>
            <a href="delete?id=<%= s.getId() %>" class="btn btn-danger btn-sm">Delete</a>
          </td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>
</div>

<%@ include file="footer.jsp" %>
