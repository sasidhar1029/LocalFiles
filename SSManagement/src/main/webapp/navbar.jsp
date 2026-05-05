<%@ page contentType="text/html;charset=UTF-8" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand fw-bold" href="home.jsp">Student Portal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <c:if test="${not empty sessionScope.username}">
          <li class="nav-item"><a class="nav-link" href="home.jsp">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="profile">Profile</a></li>
          <li class="nav-item"><a class="nav-link" href="courses">Courses</a></li>
          <li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
        </c:if>
        <c:if test="${empty sessionScope.username}">
          <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
          <li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
        </c:if>
      </ul>
    </div>
  </div>
</nav>
