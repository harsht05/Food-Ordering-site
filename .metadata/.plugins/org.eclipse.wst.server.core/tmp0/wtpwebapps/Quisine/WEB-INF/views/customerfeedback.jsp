<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Feedback Form</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/register.css">

<style>
body {
	background-color: #ffc3a149;
}

.container {
	margin-top: 50px;
}

h1 {
	color: #dc3545;
	text-align: center;
}

form {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	padding: 30px;
}

label {
	font-weight: bold;
	color: #343a40;
}

input[type="text"], input[type="email"], textarea {
	width: 100%;
	padding: 10px;
	margin-bottom: 20px;
	border: 1px solid #ced4da;
	border-radius: 5px;
}

select, input[type="radio"] {
	margin-bottom: 20px;
}

.btn-danger {
	background-color: #dc3545;
	border: none;
}

.btn-danger:hover {
	background-color: #c82333;
}

.btn-secondary {
	background-color: #6c757d;
	border: none;
}

.btn-secondary:hover {
	background-color: #5a6268;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<h1>Feedback Form</h1>
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="feedback" method="post">
					<div class="mb-3">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name" value="${name}"
							readonly="readonly">
					</div>
					<div class="mb-3">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email" value="${email}"
							readonly="readonly">
					</div>
					<div class="mb-3">
						<label for="description">Description</label>
						<textarea class="form-control" id="description" name="description"
							rows="3" required></textarea>
					</div>
					<div class="mb-3">
						<label for="like">What do you like about the site?</label> <select
							class="form-select" id="like" name="like">
							<option selected disabled>Select an option</option>
							<option value="Excellent">Excellent</option>
							<option value="Good">Good</option>
							<option value="Average">Average</option>
							<option value="Poor">Poor</option>
							<option value="Very Bad">Very Bad</option>
						</select>
					</div>
					<div class="mb-3">
						<label>Would you recommend our site to others?</label><br>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="recommend"
								id="recommendYes" value="1" required> <label
								class="form-check-label" for="recommendYes">Yes</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="recommend"
								id="recommendNo" value="0"> <label
								class="form-check-label" for="recommendNo">No</label>
						</div>
					</div>
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-danger">Submit</button>
						<button type="button" class="btn btn-secondary"
							onclick="location.href='dashboard';">Skip</button>
					</div>
				</form>
			</div>
			<div>
				<a class="navbar-brand" href="#"> <img
					src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
					alt="Your Logo" style="height: 80px; width: 200px;float: right;" class="rounded">
				</a>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
