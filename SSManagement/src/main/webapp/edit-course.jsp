<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Edit Course</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/style.css">
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="main-card col-md-6 mx-auto">
        <h4 class="text-center mb-3">Edit Course</h4>

        <form action="courses" method="post">
            <input type="hidden" name="action" value="update" />
            <input type="hidden" name="id" value="${course.id}" />

            <div class="mb-3">
                <label>Course Name</label>
                <input type="text" name="courseName" class="form-control" value="${course.courseName}" required>
            </div>
            <div class="mb-3">
                <label>Duration</label>
                <input type="text" name="duration" class="form-control" value="${course.duration}" required>
            </div>
            <div class="mb-3">
                <label>Start Date</label>
                <input type="date" name="startDate" class="form-control" value="${course.startDate}" required>
            </div>
            <div class="mb-3">
                <label>Progress (%)</label>
                <input type="number" name="progress" class="form-control" min="0" max="100" value="${course.progress}" required>
            </div>
            <div class="mb-3">
                <label>Status</label>
                <select name="status" class="form-select">
                    <option value="Active" ${course.status == 'Active' ? 'selected' : ''}>Active</option>
                    <option value="Completed" ${course.status == 'Completed' ? 'selected' : ''}>Completed</option>
                    <option value="Paused" ${course.status == 'Paused' ? 'selected' : ''}>Paused</option>
                </select>
            </div>
            <button class="btn btn-primary w-100">Update Course</button>
        </form>
    </div>
</div>

</body>
</html>
