<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vcube.model.Expert"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Experts - Village Career Guidance</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="container my-5">
		<h2 class="mb-4">Experts</h2>


		<div class="row">
			<%
			List<Expert> experts = (List<Expert>) request.getAttribute("experts");
			if (experts != null) {
				for (Expert e : experts) {
			%>
			<div class="col-md-4 mb-3">
				<div class="card h-100">
					<div class="card-body">
						<h5 class="card-title"><%=e.getName()%></h5>
						<h6 class="card-subtitle mb-2 text-muted"><%=e.getSector()%></h6>
						<p class="card-text"><%=e.getShortBio()%></p>
					</div>
					<div class="card-footer bg-white">
						<%
						if (e.getLinkedin() != null && !e.getLinkedin().isEmpty()) {
						%>
						<a href="<%=e.getLinkedin()%>" target="_blank" class="card-link">LinkedIn</a>
						<%
						}
						%>
						<%
						if (e.getEmail() != null && !e.getEmail().isEmpty()) {
						%>
						<a href="mailto:<%=e.getEmail()%>" class="card-link">Email</a>
						<%
						}
						%>
					</div>
				</div>
			</div>
			<%
			}
			} else {
			%>
			<div class="col-12">No experts found.</div>
			<%
			}
			%>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>